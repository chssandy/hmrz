/**
 * 文 件 名:  LoginDaoImpl.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年11月2日
 * 修改内容:  <修改内容>
 */
package com.hmrz.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.common.log.LoggerAdapter;
import com.hmrz.common.log.LoggerAdapterFacory;
import com.hmrz.dao.ManagerDao;
import com.hmrz.pojo.ManagerBean;
import com.hmrz.search.ManagerSearch;

/**
 * <pre>
 * 管理员相关数据库实现
 * </pre>
 * 
 * @author  pfma
 * @data  2015年11月2日
 */
public class ManagerDaoImpl implements ManagerDao
{
    @Autowired
    private SqlSessionTemplate sqlSession;
    
    private static LoggerAdapter log = LoggerAdapterFacory.getLoggerAdapter(ManagerDaoImpl.class);
    
    @Override
    public ManagerBean getManager(ManagerSearch search) throws HmrzException
    {
        ManagerBean manager = null;
        try
        {
        	manager = sqlSession.selectOne("com.hmrz.mybatis.manager.getManager", search);
        }
        catch (Exception ex)
        {
            String errMsg = "查询管理员失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
        
        return manager;
    }

	@Override
	public List<ManagerBean> getManagerList(ManagerSearch search) throws HmrzException 
	{
		List<ManagerBean> list = null;
        try
        {
            list = sqlSession.selectList("com.hmrz.mybatis.manager.getManagerList", search);
        }
        catch (DataAccessException e)
        {
            String msg = "查询系統用户列表出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return list;
	}

	@Override
	public int getManagerListCount(ManagerSearch search) throws HmrzException
	{
		int count = 0;
        try
        {
            count = sqlSession.selectOne("com.hmrz.mybatis.manager.getManagerListCount", search);
        }
        catch (DataAccessException e)
        {
            String msg = "查詢系統用户列表总数出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return count;
	}

	@Override
	public String addManager(ManagerBean manager) throws HmrzException 
	{
		String returnId = null;
        try
        {
            int affected = sqlSession.insert("com.hmrz.mybatis.manager.addManager", manager);
            if (affected > 0)
            {
                returnId = manager.getManager_id();
            }
        }
        catch (DataAccessException e)
        {
            String msg = "保存新的系統用户信息出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return returnId;
	}

	@Override
    public boolean addManagerRole(Map<String, String> param) throws HmrzException
    {
        int effected = 0;
        try
        {
            effected = sqlSession.insert("com.hmrz.mybatis.manager.addManagerRole", param);
        }
        catch (DataAccessException e)
        {
            String msg = "给系统用户添加角色出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return effected == 1 ? true : false;
    }
 
	@Override
	public boolean modifyManager(ManagerBean manager) throws HmrzException
	{
		int affected;
        try
        {
            affected = sqlSession.update("com.hmrz.mybatis.manager.modifyManager", manager);
        }
        catch (DataAccessException e)
        {
            String msg = "修改系統用户信息出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return affected > 0 ? true : false;
	}

	@Override
	public boolean delManager(String manager_id) throws HmrzException
	{
		int effected = 0;
        try
        {
            effected = sqlSession.update("com.hmrz.mybatis.manager.delManager", manager_id);
        }
        catch (DataAccessException e)
        {
            String msg = "删除系統用户出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return effected == 1 ? true : false;
	}

	@Override
	public void delManagerRole(String manager_id) throws HmrzException 
	{
        try
        {
            sqlSession.update("com.hmrz.mybatis.manager.delManagerRole", manager_id);
        }
        catch (DataAccessException e)
        {
            String msg = "删除系统用户的角色绑定出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
    }
}
