/**
 * 文 件 名:  LoginFilter.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年6月4日
 * 修改内容:  <修改内容>
 */
package com.hmrz.common.interceptor;

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
 * @author  pfma
 * @data  2015年6月4日
 */
public class LoginCheckInterceptor implements HandlerInterceptor
{
    @Autowired
    LoginService loginService;
    
    @Autowired
    private ModuleService moduleService;
    
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
        String userName = CommonUtils.getCookieValue(request, "loginUserName");
        String token = CommonUtils.getCookieValue(request, "token");
        if (!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(token))
        {
            String local_token = loginService.getToken(userName);
            if (!StringUtils.isEmpty(local_token) && local_token.equals(token))//服务器端缓存的token与客户端cookie缓存的相同
            {
                    return true;
            }
        }
        throw new HmrzException(ExceptionConstants.ERROR_LOGIN_FIRST);
    }
    
}
