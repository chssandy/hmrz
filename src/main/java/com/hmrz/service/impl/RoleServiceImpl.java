/**
 * 文 件 名:  RoleServiceImpl.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年11月2日
 * 修改内容:  <修改内容>
 */
package com.hmrz.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.dao.RoleDao;
import com.hmrz.pojo.ModuleBean;
import com.hmrz.pojo.RoleBean;
import com.hmrz.search.RoleSearch;
import com.hmrz.service.RoleService;

/**
 * <pre>
 * 角色相关业务接口实现
 * </pre>
 * 
 * @author  pfma
 * @data  2015年11月2日
 */
public class RoleServiceImpl implements RoleService
{
    @Autowired
    private RoleDao roleDao;
    
    @Override
    public int countRole(RoleSearch search) throws HmrzException
    {
        return roleDao.countRole(search);
    }
    
    @Override
    public List<RoleBean> listRole(RoleSearch search) throws HmrzException
    {
        return roleDao.listRole(search);
    }
    
    @Override
    public String addRole(RoleBean bean) throws HmrzException
    {
        return roleDao.addRole(bean);
    }
    
    @Override
    @Transactional(rollbackFor = HmrzException.class)
    public boolean deleteRole(String id) throws HmrzException
    {
        roleDao.delRoleModules(id);
        return roleDao.deleteRole(id);
    }
    
    @Override
    public boolean updateRole(RoleBean bean) throws HmrzException
    {
        return roleDao.updateRole(bean);
    }
    
    @Override
    public List<ModuleBean> accessibleModule(String manager_id, String parent_id) throws HmrzException
    {
        return roleDao.accessibleModule(manager_id, parent_id);
    }
    
    @Override
    public String getModulesByRole(String role_id) throws HmrzException
    {
        return roleDao.getModulesByRole(role_id);
    }
    
    @Override
    @Transactional(rollbackFor = HmrzException.class)
    public boolean setRoleModules(String role_id, String module_ids, String operator) throws HmrzException
    {
        boolean success = true;
        
        //删除所有旧的
        roleDao.delRoleModules(role_id);
        if (!StringUtils.isEmpty(module_ids))
        {
            Map<String, Object> parame = new HashMap<String, Object>();
            parame.put("role_id", role_id);
            parame.put("operator", operator);
            parame.put("modules", module_ids.split(","));
            success = roleDao.addRoleModules(parame);
        }
        
        return success;
    }
}
