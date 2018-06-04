/**
 * 文 件 名:  ManagerController.java
 * 描       述:  系统用户管理
 * 创 建 人:  sandy
 * 创建时间:  2015年11月02日
 * 修改内容:  <修改内容>
 */
package com.hmrz.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
import com.hmrz.common.utils.CommonUtils;
import com.hmrz.pojo.ManagerBean;
import com.hmrz.search.ManagerSearch;
import com.hmrz.service.LoginService;
import com.hmrz.service.ManagerService;

@Controller
@RequestMapping(value = "/system/manager")
public class ManagerController extends BaseController
{
    @Autowired
    private ManagerService managerService;
    
    @Autowired
    private LoginService loginService;
    
    /**
     * @param search
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     * @throws IOException 
     */
    @ResponseBody
    @RequestMapping(value = "/getManagerList")
    public Map<String, Object> getUserList(ManagerSearch search) throws HmrzException
    {
        int count = managerService.getManagerListCount(search);
        List<ManagerBean> list =null;
        if (count > 0)
        {
            list = managerService.getManagerList(search);
        }
        return buildResult(doPage(count, list, search));
    }
    
    /**
     * <pre>
     * 给前端nicevalidator提供remote提供接口，校验系統用户名是否存在，返回数据规则详情见nicevalidator的说明文档
     * </pre> 
     * @param manager_name
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    @RequestMapping(value = {"/IsUniqueManager"})
    @ResponseBody
    public Map<String, Object> checkUserIsUnique(String manager_name) throws HmrzException
    {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        //判断当前用户名是否被使用
        ManagerSearch search = new ManagerSearch();
        search.setName(manager_name);
        int count = managerService.getManagerListCount(search);
        if (count > 0)
        {
            jsonMap.put("error", "此用户名已经存在");
            return buildResult(jsonMap);
        }
        jsonMap.put("ok", "");
        return buildResult(jsonMap);
    }
    
    /**
     * 保存系統用户信息
     * @param manager 前台封装的用户信息
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    @RequestMapping(value = {"/addManager"}, method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> addManager(ManagerBean manager, HttpServletRequest request) throws HmrzException
    {
        //判断当前用户名是否被使用
        ManagerSearch search = new ManagerSearch();
        search.setName(manager.getManager_name());
        int count = managerService.getManagerListCount(search);
        if (count > 0)
        {
            return buildResult("error:用户名已存在！");
        }
        else
        {
            String password = manager.getPassword();
            String salt = CommonUtils.getRandomSalt();
            password = CommonUtils.encrypt(password, salt);
            manager.setPassword(password);
            manager.setPassword_salt(salt);
            manager.setCreate_user(this.getOperator(request));
            //保存系統用户信息并返回保存的数据id
            String returnId = managerService.addManager(manager);
            addOpeatorLog(request,
                    "system/manager/addManager",
                    "保存系統用户",
                    StaticVariables.LOG_INSERT,
                    manager.toString(),
                    !StringUtils.isEmpty(returnId),
                    StaticVariables.PLATFORM_WEB);
            
            if (StringUtils.isEmpty(returnId))
            {
                return buildResult("error:保存系統用户失败！");
            }
        }
        return buildResult();
    }
    
    /**
     * 根据manager_id获取系統用户详情
     * @param manager_id
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    @ResponseBody
    @RequestMapping(value = {"/getManager/{manager_id}"})
    public Map<String, Object> getUser(@PathVariable String manager_id) throws HmrzException
    {
        ManagerSearch search = new ManagerSearch();
        search.setManager_id(manager_id);
        ManagerBean manager = managerService.getManager(search);
        return buildResult(manager);
    }
    
    /**
     * 修改系統用户信息
     * @param managerBean
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    @ResponseBody
    @RequestMapping("/modifyManager")
    Map<String, Object> modifyManager(HttpServletRequest request, ManagerBean manager) throws HmrzException
    {
        boolean success = managerService.modifyManager(manager);
        //修改人員信息，強制去除其登陸token
        loginService.loginOut(manager.getManager_name());
        
        addOpeatorLog(request,
                "system/manager/modifyManager",
                "修改系統用户",
                StaticVariables.LOG_UPDATE,
                manager.toString(),
                success,
                StaticVariables.PLATFORM_WEB);
        return buildResult(success ? 0 : 1);
    }
    
    /**
      * 删除用户，假删除
      * @param manager_id 要删除的系統用户id或用逗号分隔的多个id串
      * @throws HmrzException [参数说明]
      * @author sandy 2015年11月02日 下午4:19:58
      */
    @ResponseBody
    @RequestMapping(value = {"/delManager"})
    public void delUser(HttpServletRequest request, String id) throws HmrzException
    {
        if (!StringUtils.isEmpty(id))
        {
            if (id.contains(","))
            {
                String[] id_arr = id.split(",");
                for (String id_str : id_arr)
                {
                    if (!StringUtils.isEmpty(id_str))
                    {
                        //清除缓存的用户信息，阻止用户继续操作
                        ManagerSearch search = new ManagerSearch();
                        search.setManager_id(id_str);
                        ManagerBean manager = managerService.getManager(search);
                        if (null != manager && managerService.delManager(id_str))
                        {
                            loginService.loginOut(manager.getManager_name());
                        }
                    }
                }
            }
            else
            {
                ManagerSearch search = new ManagerSearch();
                search.setManager_id(id);
                ManagerBean manager = managerService.getManager(search);
                if (null != manager && managerService.delManager(id))
                {
                    loginService.loginOut(manager.getManager_name());
                }
            }
        }
        
        addOpeatorLog(request,
                "system/manager/delManager",
                "删除系統用户",
                StaticVariables.LOG_DELETE,
                "manager_id=" + id,
                true,
                StaticVariables.PLATFORM_WEB);
    }
    
    /**
      * <pre>
      * 修改用户密码
      * </pre> 
      * @param password 新密码
      * @param id 用户id
      * @return
      * @throws HmrzException [参数说明]
      * @author pfma 2015年6月5日 下午2:42:05
      */
    @ResponseBody
    @RequestMapping("/modifyPassword")
    Map<String, Object> modifyPassword(HttpServletRequest request, String password, String manager_id)
            throws HmrzException
    {
        boolean success = false;
        if (!StringUtils.isEmpty(password))
        {
            String salt = CommonUtils.getRandomSalt();
            password = CommonUtils.encrypt(password, salt);
            success = managerService.modifyManagerPassword(manager_id, password, salt);
        }
        
        addOpeatorLog(request, "system/manager/modifyPassword", "修改系统用户密码", StaticVariables.LOG_UPDATE, "manager_id:"
                + manager_id + ",password:" + password, true, StaticVariables.PLATFORM_WEB);
        
        return buildResult(success ? 0 : 1);
    }
    
}
