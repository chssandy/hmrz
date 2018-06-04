/**
 * 文 件 名:  RoleDaoImpl.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年11月2日
 * 修改内容:  <修改内容>
 */
package com.hmrz.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.common.log.LoggerAdapter;
import com.hmrz.common.log.LoggerAdapterFacory;
import com.hmrz.dao.RoleDao;
import com.hmrz.pojo.ModuleBean;
import com.hmrz.pojo.RoleBean;
import com.hmrz.search.RoleSearch;

/**
 * <pre>
 * 角色相关数据库接口实现
 * </pre>
 * 
 * @author  pfma
 * @data  2015年11月2日
 */
public class RoleDaoImpl implements RoleDao
{
    @Autowired
    private SqlSessionTemplate sqlSession;
    
    private static LoggerAdapter log = LoggerAdapterFacory.getLoggerAdapter(RoleDaoImpl.class);
    
    @Override
    public int countRole(RoleSearch search) throws HmrzException
    {
        int count;
        try
        {
            count = sqlSession.selectOne("com.hmrz.mybatis.role.count", search);
        }
        catch (DataAccessException e)
        {
            String msg = "统计角色总数出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return count;
    }
    
    @Override
    public List<RoleBean> listRole(RoleSearch search) throws HmrzException
    {
        List<RoleBean> list = null;
        try
        {
            list = sqlSession.selectList("com.hmrz.mybatis.role.list", search);
        }
        catch (DataAccessException e)
        {
            String msg = "查询角色列表出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return list;
    }
    
    @Override
    public String addRole(RoleBean bean) throws HmrzException
    {
        String return_id = null;
        try
        {
            int affected = sqlSession.insert("com.hmrz.mybatis.role.add", bean);
            if (affected > 0)
            {
                return_id = bean.getRole_id();
            }
        }
        catch (DataAccessException e)
        {
            String msg = "新增角色出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return return_id;
    }
    
    @Override
    public boolean deleteRole(String id) throws HmrzException
    {
        try
        {
            int affected = sqlSession.update("com.hmrz.mybatis.role.del", id);
            if (affected > 0)
            {
                return true;
            }
        }
        catch (DataAccessException e)
        {
            String msg = "删除角色出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return false;
    }
    
    @Override
    public boolean updateRole(RoleBean bean) throws HmrzException
    {
        try
        {
            int affected = sqlSession.update("com.hmrz.mybatis.role.update", bean);
            if (affected > 0)
            {
                return true;
            }
        }
        catch (DataAccessException e)
        {
            String msg = "修改角色出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return false;
    }
    
    @Override
    public List<ModuleBean> accessibleModule(String manager_id, String parent_id) throws HmrzException
    {
        Map<String, String> parameMap = new HashMap<String, String>();
        parameMap.put("manager_id", manager_id);
        parameMap.put("parent_id", parent_id);
        List<ModuleBean> list = null;
        try
        {
            list = sqlSession.selectList("com.hmrz.mybatis.role.accessibleModule", parameMap);
        }
        catch (DataAccessException e)
        {
            String msg = "根据用户id和模块父Id查询用户可访问的模块列表出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return list;
    }
    
    @Override
    public String getModulesByRole(String role_id) throws HmrzException
    {
        String modules;
        try
        {
            modules = sqlSession.selectOne("com.hmrz.mybatis.role.getRoleModules", role_id);
        }
        catch (DataAccessException e)
        {
            String msg = " 根据角色id获取绑定的模块id字符串出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return modules;
    }
    
    @Override
    public void delRoleModules(String role_id) throws HmrzException
    {
        try
        {
            sqlSession.selectOne("com.hmrz.mybatis.role.delRoleModules", role_id);
        }
        catch (DataAccessException e)
        {
            String msg = "获取角色绑定的菜单失败！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
    }
    
    @Override
    public boolean addRoleModules(Map<String, Object> parame) throws HmrzException
    {
        int effected;
        try
        {
            effected = sqlSession.insert("com.hmrz.mybatis.role.addRoleModules", parame);
        }
        catch (DataAccessException e)
        {
            String msg = "给角色绑定菜单失败！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return effected > 0 ? true : false;
    }
}
