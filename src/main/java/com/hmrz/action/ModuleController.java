package com.hmrz.action;

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

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.hmrz.common.BaseController;
import com.hmrz.common.constants.StaticVariables;
import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.ModuleBean;
import com.hmrz.search.ModuleSearch;
import com.hmrz.service.ModuleService;

/**
 * @author  yl
 * @data  2014年4月14日
 */
@Controller
@RequestMapping("/system/module/")
public class ModuleController extends BaseController
{
    @Autowired
    private ModuleService moduleService;
    
    /**
     * <pre>
     * 查询菜单列表
     * </pre> 
     * @param search
     * @param rows
     * @param page
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年5月22日 上午9:32:46
     */
    @ResponseBody
    @RequestMapping(value = "getModuleList")
    public Map<String, Object> getModuleList(ModuleSearch search) throws HmrzException
    {
        int count = moduleService.getModuleCount(search);
        List<ModuleBean> list =null;
        if (count > 0)
        {
            list = moduleService.searchModule(search);
        }
        return buildResult(doPage(count, list, search));
    }
    
    /**
     * <pre>
     * 获取菜单树数据
     * </pre> 
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年5月27日 上午10:48:00
     */
    @ResponseBody
    @RequestMapping(value = "getModuleTree")
    public Map<String, Object> getModuleTree() throws HmrzException
    {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        SimplePropertyPreFilter filter = new SimplePropertyPreFilter(ModuleBean.class, "module_id", "module_name",
                "father_id");
        ModuleSearch search = new ModuleSearch();
        search.setHavePage(StaticVariables.HAVE_PAGE_NO);
        search.setOnlyRoot(true);
        List<ModuleBean> root = moduleService.searchModule(search);
        dataMap.put("root", JSONArray.parse(JSON.toJSONString(root, filter)));
        search.setOnlyRoot(false);
        search.setIsIncludeRoot(false);
        List<ModuleBean> children = moduleService.searchModule(search);
        dataMap.put("children", JSONArray.parse(JSON.toJSONString(children, filter)));
        return buildResult(dataMap);
    }
    
    /**
     * <pre>
     * 删除菜单，假删除,一级菜单不可以删除
     * </pre> 
     * @param id id 要删除的用户id或用逗号分隔的多个id串
     * @throws HmrzException [参数说明]
     * @author pfma 2015年5月22日 上午9:23:05
     */
    @ResponseBody
    @RequestMapping(value = "delModule")
    public void delModule(HttpServletRequest request, String[] id) throws HmrzException
    {
        if (!StringUtils.isEmpty(id))
        {
            boolean success = moduleService.delModule(id);
            
            addOpeatorLog(request,
                    "server/sys/module/delModule",
                    "删除后台菜单",
                    StaticVariables.LOG_DELETE,
                    "id=" + id,
                    success,
                    StaticVariables.PLATFORM_WEB);
        }
    }
    
    /**
     * <pre>
     * 保存菜单栏目信息
     * </pre> 
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015-4-30
     */
    @RequestMapping(value = {"addModule"}, method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> addModule(ModuleBean moduleBean, HttpServletRequest request) throws HmrzException
    {
        moduleBean.setCreate_user(this.getOperator(request));
        boolean success = moduleService.insertModule(moduleBean);
        
        addOpeatorLog(request,
                "server/sys/module/addModule",
                "新增后台菜单",
                StaticVariables.LOG_INSERT,
                moduleBean.toString(),
                success,
                StaticVariables.PLATFORM_WEB);
        return buildResult(success ? 0 : 1);
    }
    
    /**
     * <pre>
     * 根据id获取菜单信息
     * </pre> 
     * @param id 菜单id
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年5月25日 上午11:13:03
     */
    @RequestMapping(value = {"getModule/{id}"})
    @ResponseBody
    public Map<String, Object> getModuleInfo(@PathVariable String id) throws HmrzException
    {
        ModuleBean bean = moduleService.getModuleByID(id);
        return buildResult(bean);
    }
    
    /**
     * <pre>
     * 修改菜单信息
     * </pre> 
     * @param moudle
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年5月25日 上午11:13:32
     */
    @RequestMapping(value = {"modifyModule"})
    @ResponseBody
    public Map<String, Object> modifyModule(HttpServletRequest request, ModuleBean moudle) throws HmrzException
    {
        boolean success = moduleService.updateModule(moudle);
        
        addOpeatorLog(request,
                "server/sys/module/modifyModule",
                "修改后台菜单",
                StaticVariables.LOG_UPDATE,
                moudle.toString(),
                success,
                StaticVariables.PLATFORM_WEB);
        return buildResult(success ? 0 : 1);
    }
    
    /**
     * <pre>
     * 设置菜单排序
     * </pre> 
     * @param list
     * @throws HmrzException [参数说明]
     * @author pfma 2015年6月1日 下午2:57:54
     */
    @RequestMapping(value = {"setModuleIndex"})
    @ResponseBody
    public void setModuleIndex(HttpServletRequest request, String str) throws HmrzException
    {
        try
        {
            List<ModuleBean> list = JSON.parseArray(str, ModuleBean.class);
            moduleService.setModuleIndex(list);
        }
        catch (Exception e)
        {
            throw new HmrzException(e);
        }
        addOpeatorLog(request,
                "server/sys/module/setModuleIndex",
                "设置后台菜单排序",
                StaticVariables.LOG_UPDATE,
                str,
                true,
                StaticVariables.PLATFORM_WEB);
    }
}
