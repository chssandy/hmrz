/**
 * 文 件 名:  LoginFilter.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年6月4日
 * 修改内容:  <修改内容>
 */
package com.hmrz.common.interceptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hmrz.common.constants.ExceptionConstants;
import com.hmrz.common.exception.HmrzException;
import com.hmrz.common.utils.CommonUtils;
import com.hmrz.service.LoginService;
import com.hmrz.service.ModuleService;

/**
 * <pre>
 * 用来校验当前请求是否为登录状态的拦截器
 * </pre>
 * 
 * @author  sandy
 * @data  2015年6月4日
 */
public class AuthorityInterceptor implements HandlerInterceptor
{
    @Autowired
    LoginService loginService;
    
    @Autowired
    private ModuleService moduleService;
    
    private Map<String, List<String>> authSources = new HashMap<String, List<String>>();
    
    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception
    {
    }
    
    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception
    {
    }
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2)
            throws HmrzException
    {
        //判断是否是登陆页面来的
        String url = request.getRequestURI().toString().trim();
        String userName = CommonUtils.getCookieValue(request, "loginUserName");
        if (!StringUtils.isEmpty(userName))
        {
            String local_token = loginService.getToken(userName);
            if (!StringUtils.isEmpty(local_token))//服务器端缓存的token与客户端cookie缓存的相同
            {
                if ("admin".equals(userName))
                {
                    return true;
                }
                return checkAuth(request, url, userName);
            }
        }
        
        throw new HmrzException(ExceptionConstants.ERROR_LOGIN_FIRST);
    }
    
    private boolean checkAuth(HttpServletRequest request, String url, String userName)
            throws HmrzException
    {
    	if(url.indexOf("/system/manager/modifyPassword") > -1){
    		return true;
    	}
        authSources = moduleService.getAllModuleRoles();
        
        //判断当前url是否在必要鉴权url集合中
        Iterator<String> iter = authSources.keySet().iterator();
        
        String module = "";
        while (iter.hasNext())
        {
            String key = iter.next();
            
            if (!StringUtils.isEmpty(key) && url.indexOf(key) > -1)
            {
                //需要鉴权
                module = key;
                break;
            }
        }
        
        if (!StringUtils.isEmpty(module))//如果当前url在必须鉴权的集合中则需要判断以后角色和需要角色是否有交集
        {
            String roles = loginService.getCachedRoles(userName);
            
            if (StringUtils.isEmpty(roles))
            {
                return false;
            }
            
            //获取当前url对应的角色列表
            List<String> has_roles = new ArrayList<String>(Arrays.asList(roles.split(",")));
            List<String> need_roles = new ArrayList<String>(authSources.get(module));
            has_roles.retainAll(need_roles);
            if (has_roles.size() > 0)
            {
                return true;
            }
            else
            {
                throw new HmrzException(ExceptionConstants.ERROR_LIMITED_AUTHORITY);
            }
        }
        else
        {
            return true;
        }
    }
}
