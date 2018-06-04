/**
 * 文 件 名:  ModuleServiceImpl.java
 * 描    述:  <菜单模块业务实现>
 * 创 建 人:  yl
 * 创建时间:  2014年4月11日
 * 修改内容:  <修改内容>
 */
package com.hmrz.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hmrz.common.exception.HmrzException;
import com.hmrz.dao.ModuleDao;
import com.hmrz.pojo.ModuleBean;
import com.hmrz.search.ModuleSearch;
import com.hmrz.service.ModuleService;

/**
 * <模块相关业务实现>
 * 
 * @author  yl
 * @data  2014年4月11日
 */
@Service
public class ModuleServiceImpl implements ModuleService
{
    @Autowired
    private ModuleDao moduleDao;
    
    /**
     *   增加模块
     *   @throws HmrzException 
     */
    public boolean insertModule(ModuleBean mb) throws HmrzException
    {
        return moduleDao.insertModule(mb);
    }
    
    /**
     * 更新模块
     * @throws HmrzException 
     */
    public boolean updateModule(ModuleBean mb) throws HmrzException
    {
        return moduleDao.updateModule(mb);
    }
    
    @Override
    public List<ModuleBean> getAllModules(ModuleSearch msb) throws HmrzException
    {
        return moduleDao.getAllModules(msb);
    }
    
    /**
     * 根据父ID查询所有子模块
     */
    @Override
    public List<ModuleBean> getModuleByPID(int pid) throws HmrzException
    {
        List<ModuleBean> moduleList = new ArrayList<ModuleBean>();
        itModuleByPID(moduleList, pid);
        return moduleList;
    }
    
    public void itModuleByPID(List<ModuleBean> mbList, int pid) throws HmrzException
    {
        List<ModuleBean> mblist = moduleDao.getModulesByPID(pid);
        if (mblist != null && mblist.size() > 0)
        {
            for (int i = 0; i < mblist.size(); i++)
            {
                mbList.add(mblist.get(i));
                itModuleByPID(mbList, Integer.parseInt(mblist.get(i).getModule_id()));
            }
        }
    }
    
    /**
     * 查询json树
     * @param pid
     * @return
     * @throws HmrzException
     */
    public String getBeansJson(int pid, String moduleID) throws HmrzException
    {
        JSONArray jsonArr = new JSONArray();
        getJSONArr(pid, moduleID, jsonArr);
        return jsonArr.toString();
    }
    
    public void getJSONArr(int pid, String moduleID, JSONArray jsonArr) throws HmrzException
    {
        List<ModuleBean> mblist = moduleDao.getModulesByPID(pid);
        if (mblist != null && mblist.size() > 0)
        {
            for (int i = 0; i < mblist.size(); i++)
            {
                JSONObject jsonObj = new JSONObject();
                jsonObj.put("id", mblist.get(i).getModule_id());
                jsonObj.put("text", mblist.get(i).getModule_name());
                JSONArray ja = new JSONArray();
                
                getJSONArr(Integer.parseInt(mblist.get(i).getModule_id()), moduleID, ja);
                if (!moduleID.equals(mblist.get(i).getModule_id()))
                {
                    jsonObj.put("children", ja);
                    jsonArr.add(jsonObj);
                }
            }
        }
    }
    
    /**
     * 根据id查询模块
     */
    public ModuleBean getModuleByID(String moduleID) throws HmrzException
    {
        return moduleDao.getModuleByID(moduleID);
    }
    
    /**
     * 删除模块（置标志）
     */
    @Override
    public boolean delModule(String[] moduleID) throws HmrzException
    {
        return moduleDao.delModule(moduleID);
    }
    
    /**
     * 
     *搜索
     * @param pattern
     * @return
     * @throws HmrzException [参数说明]
     */
    public List<ModuleBean> searchModule(ModuleSearch msb) throws HmrzException
    {
        return moduleDao.searchModules(msb);
    }
    
    @Override
    public int getModuleCount(ModuleSearch msb) throws HmrzException
    {
        return moduleDao.getModuleCount(msb);
    }
    
    @Override
    public void setModuleIndex(List<ModuleBean> list) throws HmrzException
    {
        for (ModuleBean module : list)
        {
            if (!StringUtils.isEmpty(module.getModule_id()))
            {
                moduleDao.setModuleIndex(module);
            }
        }
    }
    
    @Override
    public Map<String, List<String>> getAllModuleRoles() throws HmrzException
    {
        Map<String, List<String>> modules = new HashMap<String, List<String>>();
        //取出所有菜单
        List<ModuleBean> list = moduleDao.getAllModule();
        for (ModuleBean module : list)
        {
            //获取菜单对应的角色
            String roles = module.getRoles();
            List<String> role_list = new ArrayList<String>();
            if (!StringUtils.isEmpty(roles))
            {
                role_list = new ArrayList<String>(Arrays.asList(roles.split(",")));
            }
            modules.put(module.getNamespace(), role_list);
        }
        
        return modules;
    }
}
