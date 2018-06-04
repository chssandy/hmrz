/**
 * 文 件 名:  BaseController.java
 * 描    述:  <描述>
 * 创 建 人:  sandy
 * 创建时间:  2014-7-30
 * 修改内容:  <修改内容>
 */
package com.hmrz.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.hmrz.common.constants.StaticVariables;
import com.hmrz.common.exception.HmrzException;
import com.hmrz.common.log.LoggerAdapter;
import com.hmrz.common.log.LoggerAdapterFacory;
import com.hmrz.common.utils.BrowserUtils;
import com.hmrz.pojo.LogBean;
import com.hmrz.search.Page;
import com.hmrz.service.LogService;

/**
 * <pre>
 * </pre>
 * 
 * @author  sandy
 * @data  2014-7-30
 */
public class BaseController
{
    private static LoggerAdapter log = LoggerAdapterFacory.getLoggerAdapter(BaseController.class);
    
    @Autowired
    private LogService logService;
    
    public static final String ERROR_PAGE = "error/error";
    
    public static final String UNKNOWNEXCEPTION = "请求失败";
    
    public static final String PARAMSVALIDFAIL = "参数错误！";
    
    public static final int RESULT_CODE_OK = 0;
    
    public static final int RESULT_CODE_FAIL = 1;
    
    /**
     * <pre>
     * 从请求带回的cookie中获取当前操作人
     * </pre> 
     * @param request
     * @return [参数说明]
     * @author pfma 2015年5月12日 下午4:51:39
     */
    public String getOperator(HttpServletRequest request)
    {
        Cookie cookies[] = request.getCookies();
        if (cookies == null)
        {
            return null;
        }
        for (int i = 0; i < cookies.length; i++)
        {
            if ("loginUserId".equals(cookies[i].getName()))
            {
                return cookies[i].getValue();
            }
        }
        return null;
    }
    
    /**
     * <pre>
     * 从请求带回的cookie中获取当前操作人的手机号
     * </pre> 
     * @param request
     * @return [参数说明]
     * @author sandy 2015年7月1日 下午4:51:39
     */
    public String getOperatorMoble(HttpServletRequest request)
    {
        Cookie cookies[] = request.getCookies();
        if (cookies == null)
        {
            return null;
        }
        for (int i = 0; i < cookies.length; i++)
        {
            if ("loginUserName".equals(cookies[i].getName()))
            {
                return cookies[i].getValue();
            }
        }
        return null;
    }
    
    /**
     * <pre>
     * 增加用户行为日志
     * </pre> 
     * @param request HttpServletRequest
     * @param module 用户操作模块
     * @param title 操作内容
     * @param type 操作类型,0:新增;1:修改;2:删除
     * @param params 参数
     * @param success 操作结果
     * @param platform 平台
     * @author pfma 2015年6月11日 上午11:06:42
     */
    public void addOpeatorLog(HttpServletRequest request, String module, String title, int type, String params,
            boolean success, int platform)
    {
        LogBean logBean = new LogBean();
        logBean.setTitle(title);
        logBean.setOperator(getOperator(request));
        logBean.setModule(module);
        logBean.setOperateType(type);
        logBean.setParams(params);
        logBean.setIp(getRemoteAddress(request));
        logBean.setPlatform(platform);
        logBean.setBrowser(BrowserUtils.checkBrowse(request));
        logBean.setIs_succeed(success ? StaticVariables.LOG_SUCCEED : StaticVariables.LOG_FAILED);
        try
        {
            logService.addLog(logBean);
        }
        catch (HmrzException e)
        {
            log.error("保存用户操作日志出现错误！", e);
        }
    }
    
    protected Map<String, Object> buildResult()
    {
        return buildReturnMap(10, null);
    }
    
    protected Map<String, Object> buildResult(Object obj)
    {
        return buildReturnMap(10, obj);
    }
    
    protected Map<String, Object> buildReturnMap(int resultCode, Object retData)
    {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        jsonMap.put("resultCode", Integer.valueOf(resultCode));
        jsonMap.put("data", retData);
        return jsonMap;
    }
    
    protected void addCookie(HttpServletResponse response, String key, String value, String domain, String path)
    {
        Cookie cookie = new Cookie(key, value);
        cookie.setPath(path == null ? "/" : path);
        response.addCookie(cookie);
    }
    
    protected String getRemoteAddress(HttpServletRequest request)
    {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown"))
            ip = request.getHeader("Proxy-Client-IP");
        if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown"))
            ip = request.getHeader("WL-Proxy-Client-IP");
        if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown"))
            ip = request.getRemoteAddr();
        return ip;
    }
    
    protected Map<String, Object> doPage(int count,List<?> list,Page search){
    	Map<String, Object> dataMap = new HashMap<String, Object>();
    	 if (count > 0)
         {
             // 序号、昵称、手机号、支付宝账户、支付宝实名、提现金额、账户余额、申请日期、操作
             dataMap.put("total", count % search.getRows() == 0 ? count / search.getRows() : count / search.getRows() + 1);
             dataMap.put("records", count);
             dataMap.put("rows", list);
         }
         else
         {
             dataMap.put("total", 0);
             dataMap.put("records", 0);
             dataMap.put("rows", "");
         }
    	 dataMap.put("page", search.getPage());
		 return dataMap;
    }
}