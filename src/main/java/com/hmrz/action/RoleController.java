/**
 * 文 件 名:  RoleController.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年11月2日
 * 修改内容:  <修改内容>
 */
package com.hmrz.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hmrz.common.BaseController;
import com.hmrz.common.constants.StaticVariables;
import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.ModuleBean;
import com.hmrz.pojo.RoleBean;
import com.hmrz.search.RoleSearch;
import com.hmrz.service.RoleService;

/**
 * <pre>
 * 角色信息控制器
 * </pre>
 * 
 * @author  pfma
 * @data  2015年11月2日
 */
@Controller
@RequestMapping("/system/role")
public class RoleController extends BaseController
{
    @Autowired
    private RoleService roleService;
    
    /**
     * <pre>
     * 查询角色列表
     * </pre> 
     * @param search
     * @return [参数说明]
     * @author pfma 2015年11月2日 下午5:20:01
     * @throws HmrzException 
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Map<String, Object> list(RoleSearch search) throws HmrzException
    {
        int count = roleService.countRole(search);
        List<RoleBean> list =null;
        if (count > 0)
        {
        	list = roleService.listRole(search);
        }
        return buildResult(doPage(count, list, search));
    }
    
    /**
     * <pre>
     * 新增角色
     * </pre> 
     * @param bean
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年11月2日 下午6:21:01
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Map<String, Object> add(HttpServletRequest request, RoleBean bean) throws HmrzException
    {
        //先判断当前角色是否存在
        RoleSearch search = new RoleSearch();
        search.setRole_name(bean.getRole_name());
        int count = roleService.countRole(search);
        
        if (count > 0)
        {
            return buildResult(2);
        }
        String return_id = roleService.addRole(bean);
        
        addOpeatorLog(request,
                "system/role/add",
                "新增角色",
                StaticVariables.LOG_DELETE,
                bean.toString(),
                StringUtils.isEmpty(return_id),
                StaticVariables.PLATFORM_WEB);
        
        return buildResult(StringUtils.isEmpty(return_id) ? 0 : 1);
    }
    
    /**
     * <pre>
     * 删除角色
     * </pre> 
     * @param id
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年11月3日 上午11:03:32
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Map<String, Object> delete(HttpServletRequest request, String id) throws HmrzException
    {
        boolean success = roleService.deleteRole(id);
        
        addOpeatorLog(request,
                "system/role/delete",
                "删除角色",
                StaticVariables.LOG_DELETE,
                "id:" + id,
                success,
                StaticVariables.PLATFORM_WEB);
        return buildResult(success ? 0 : 1);
    }
    
    /**
     * <pre>
     * 修改角色
     * </pre> 
     * @param bean
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年11月3日 上午11:29:23
     */
    @RequestMapping(value = "/modify")
    @ResponseBody
    public Map<String, Object> update(HttpServletRequest request, RoleBean bean) throws HmrzException
    {
        //先判断当前的角色名是否存在（排除自身）
        RoleSearch search = new RoleSearch();
        search.setRole_name(bean.getRole_name());
        search.setHavePage(StaticVariables.HAVE_PAGE_NO);
        List<RoleBean> list = roleService.listRole(search);
        
        if (null != list && list.size() > 0)
        {
            if (list.size() > 1)//多于1条，说明肯定有重复
            {
                return buildResult(2);
            }
            else
            {
                if (!list.get(0).getRole_id().equals(bean.getRole_id()))//有一条，且id不同，说明不是本身，说明出现重复
                {
                    return buildResult(2);
                }
                else
                {
                    return buildResult(0);//id相同，说明是本身，且角色名没有变，不需要修改直接返回
                }
            }
        }
        
        boolean success = roleService.updateRole(bean);
        
        addOpeatorLog(request,
                "system/role/modify",
                "修改角色",
                StaticVariables.LOG_UPDATE,
                bean.toString(),
                success,
                StaticVariables.PLATFORM_WEB);
        return buildResult(success ? 0 : 1);
    }
    
    /**
     * <pre>
     * 获取角色绑定的模块
     * </pre> 
     * @param role_id
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年11月3日 上午11:46:55
     */
    @RequestMapping(value = "/modules/{role_id}")
    @ResponseBody
    public Map<String, Object> getModulesByRole(@PathVariable String role_id) throws HmrzException
    {
        String ids = roleService.getModulesByRole(role_id);
        return buildResult(ids);
    }
    
    /**
     * <pre>
     * 获取菜单
     * @throws LanTuException 
     */
    @RequestMapping(value = "/getURM", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getURM(HttpServletRequest request, HttpServletResponse response)
            throws HmrzException
    {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("allModuleList", getUserModule(this.getOperator(request)));
        return buildResult(dataMap);
    }
    
    /**
     * 根据用户id获取对应的权限菜单
     * @param manager_id
     * @return
     */
    public List<ModuleBean> getUserModule(String manager_id) throws HmrzException
    {
        //返回前台的模块列表
        List<ModuleBean> allModuleList = new ArrayList<ModuleBean>();
        //获取所有根模块
        List<ModuleBean> rootModuleList = roleService.accessibleModule(manager_id, "0");
        //循环根模块，并获取其所有子模块
        for (ModuleBean rootModule : rootModuleList)
        {
            List<ModuleBean> secondModuleList = roleService.accessibleModule(manager_id, rootModule.getModule_id());
            rootModule.setChildrenList(secondModuleList);//将二级模块存放到一级模块的子模块属性中
            allModuleList.add(rootModule);
        }
        return rootModuleList;
    }
    
    /**
     * <pre>
     * 设置角色绑定的菜单
     * </pre> 
     * @param r_id
     * @param m_id
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年5月27日 下午3:00:51
     */
    @RequestMapping(value = "/module/bind")
    @ResponseBody
    public Map<String, Object> setRoleModules(String role_id, String moudle_id, HttpServletRequest request)
            throws HmrzException
    {
        boolean success = roleService.setRoleModules(role_id, moudle_id, this.getOperator(request));
        //StaticVariables.expiredstatus.setAuthResourcesExpired(true);
        
        addOpeatorLog(request, "/system/role/module/bind", "给角色绑定模块", StaticVariables.LOG_UPDATE, "role_id" + role_id
                + "moudle_id,:" + moudle_id, success, StaticVariables.PLATFORM_WEB);
        return buildResult(success ? 0 : 1);
    }
}
