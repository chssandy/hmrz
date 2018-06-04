/**
 * 文 件 名:  LoginServiceImpl.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年10月30日
 * 修改内容:  <修改内容>
 */
package com.hmrz.service.impl;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;

import com.hmrz.common.constants.MemcacheConstants;
import com.hmrz.common.exception.HmrzException;
import com.hmrz.common.utils.Base64;
import com.hmrz.dao.ManagerDao;
import com.hmrz.dao.MemcachedDao;
import com.hmrz.pojo.ManagerBean;
import com.hmrz.search.ManagerSearch;
import com.hmrz.service.LoginService;

/**
 * <pre>
 * 登录业务接口实现
 * </pre>
 * 
 * @author  pfma
 * @data  2015年10月30日
 */
public class LoginServiceImpl implements LoginService
{
    @Autowired
    private ManagerDao managerDao;
    
    @Autowired
    private MemcachedDao memcachedDao;
    
    @Override
    public ManagerBean doLogin(String login_name, String login_pwd) throws HmrzException
    {
        ManagerSearch search = new ManagerSearch();
        search.setName(login_name);
        ManagerBean manager = managerDao.getManager(search);
        
        if (null != manager)
        {
            
            String encrypted_pwd = new Md5Hash(Base64.encode(new Md5Hash(login_pwd).toString()),
                    manager.getPassword_salt()).toString();
            if (encrypted_pwd.equals(manager.getPassword()))
            {
                return manager;
            }
        }
        return null;
    }
    
    @Override
    public boolean cacheToken(String username, String token) throws HmrzException
    {
        return memcachedDao.set(MemcacheConstants.ADMIN_TOKEN_MOBLE + username,
                token,
                MemcacheConstants.DEFAULT_EXPIRED_TIME);
    }

	@Override
	public void loginOut(String manager_name) throws HmrzException 
	{
		memcachedDao.delete(MemcacheConstants.ADMIN_TOKEN_MOBLE+ manager_name);
        memcachedDao.delete(MemcacheConstants.ADMIN_ROLES_MANAGER+ manager_name);
	}
	
	@Override
    public String getToken(String username) throws HmrzException
    {
        return memcachedDao.getAndTouch(MemcacheConstants.ADMIN_TOKEN_MOBLE+ username,
        		MemcacheConstants.DEFAULT_EXPIRED_TIME);
    }
	
	@Override
    public String getCachedRoles(String username) throws HmrzException
    {
        return memcachedDao.getAndTouch(MemcacheConstants.ADMIN_ROLES_MANAGER+ username,MemcacheConstants.DEFAULT_EXPIRED_TIME);
    }
	
    @Override
    public void cacheRoles(String username, String roles) throws HmrzException
    {
        memcachedDao.set(MemcacheConstants.ADMIN_ROLES_MANAGER+ username,
                roles,
                MemcacheConstants.DEFAULT_EXPIRED_TIME);
    }
}
