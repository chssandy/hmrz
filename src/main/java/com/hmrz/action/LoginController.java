/**
 * 文 件 名:  LoginController.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年10月30日
 * 修改内容:  <修改内容>
 */
package com.hmrz.action;

import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hmrz.common.BaseController;
import com.hmrz.common.constants.ExceptionConstants;
import com.hmrz.common.constants.StaticVariables;
import com.hmrz.common.exception.HmrzException;
import com.hmrz.common.utils.CommonUtils;
import com.hmrz.pojo.ManagerBean;
import com.hmrz.service.LoginService;

/**
 * <pre>
 * 用户登录控制器
 * </pre>
 * 
 * @author  pfma
 * @data  2015年10月30日
 */
@Controller
public class LoginController extends BaseController
{
    @Autowired
    private LoginService loginService;
    
    @RequestMapping(value = "/public/login")
    @ResponseBody
    public Map<String, Object> login(HttpServletRequest request, HttpServletResponse response, String login_name,
            String login_pwd) throws HmrzException
    {
        JSONObject result = new JSONObject();
        boolean is_success = false;
        if (StringUtils.isEmpty(login_name) || StringUtils.isEmpty(login_pwd))
        {
            throw new HmrzException(ExceptionConstants.ERROR_INPUT_PARAM);
        }
        
        ManagerBean manger = loginService.doLogin(login_name, login_pwd);
        
        if (null != manger)
        {
            is_success = true;
            //缓存用户session
            String token = UUID.randomUUID().toString();
            loginService.cacheToken(login_name, token);
            //获取用户拥有的角色并保存在memcached中，用户权限校验
            loginService.cacheRoles(login_name, manger.getRoles());
            
            //将登录用户信息存放到cookie中
            addCookie(response, "loginUserId", manger.getManager_id(), null, "/");
            addCookie(response, "loginUserName", login_name, null, "/");
            addCookie(response, "token", token, null, "/");
        }
        
        result.put("result", is_success ? "success" : "fail");
        
        addOpeatorLog(request, "/public/login", "用户登录", StaticVariables.LOG_LOGIN, "login_name:" + login_name
                + ",login_pwd:" + login_pwd, is_success, StaticVariables.PLATFORM_WEB);
        return buildResult(result);
    }
    
    /**
     * <pre>
     * 登出
     * @throws LanTuException 
     */
    @RequestMapping(value = "/system/loginOut")
    @ResponseBody
    public Map<String, Object> doLoginOut(HttpServletRequest request, HttpServletResponse response)
            throws HmrzException
    {
        JSONObject result = new JSONObject();
        String loginUserName = CommonUtils.getCookieValue(request, "loginUserName");
        
        if (!StringUtils.isEmpty(loginUserName))
        {
            loginService.loginOut(loginUserName);
        }
        addOpeatorLog(request,
                "/system/loginOut",
                "系统用户登出",
                StaticVariables.LOG_LOGOUT,
                "username:" + loginUserName,
                true,
                StaticVariables.PLATFORM_WEB);
        
        result.put("result", "success");
        return buildResult(result);
    }
}
