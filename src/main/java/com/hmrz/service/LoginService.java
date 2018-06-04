/**
 * 文 件 名:  LoginService.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年10月30日
 * 修改内容:  <修改内容>
 */
package com.hmrz.service;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.ManagerBean;

/**
 * <pre>
 * 登录业务接口
 * </pre>
 * 
 * @author  pfma
 * @data  2015年10月30日
 */
public interface LoginService
{
    /**
     * <pre>
     * 进行登陆操作
     * </pre> 
     * @param search
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年11月2日 上午11:19:13
     */
    ManagerBean doLogin(String login_name, String login_pwd) throws HmrzException;
    
    /**
     * <pre>
     * 换成用户的token
     * </pre> 
     * @param username
     * @param token
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年11月2日 下午3:40:46
     */
    boolean cacheToken(String username, String token) throws HmrzException;
    
    /**
     * 从memcached中移除用户对应的token
     * @param user
     * @param token [参数说明]
     * @author sandy 2015年11月02日 下午5:03:44
     * @throws HmrzException 
     */
    void loginOut(String manager_name) throws HmrzException;
    
    /**
     * <pre>
     * 根据用户获取缓存的token
     * </pre> 
     * @param user
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月03日 上午午9:24:07
     */
    String getToken(String username) throws HmrzException;
    
    /**
     * <pre>
     * 缓存用户角色字符串
     * </pre> 
     * @param username
     * @param roles [参数说明]
     * @author sandy 2015年11月03日 上午午9:24:07
     */
    void cacheRoles(String username, String roles) throws HmrzException;
    
    /**
     * <pre>
     * 获取缓存的用户角色信息
     * </pre> 
     * @param username
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月03日 上午午9:24:07
     */
    String getCachedRoles(String username) throws HmrzException;
}
