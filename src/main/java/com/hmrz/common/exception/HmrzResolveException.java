/*
 * 文 件 名:  Exception.java
 * 描    述:  自定义异常
 * 创 建 人:  sandy
 * 创建时间:  2015年4月20日
 * 修改内容:  <修改内容>
 */
package com.hmrz.common.exception;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import com.alibaba.fastjson.JSONObject;
import com.hmrz.common.constants.ExceptionConstants;

/**
 * 自定义异常
 * 
 * @author  sandy		
 * @data  2015年4月20日
 */
public class HmrzResolveException extends SimpleMappingExceptionResolver
{
    private static Logger log = LoggerFactory.getLogger(HmrzResolveException.class);
    
    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
            Exception ex)
    {
        try
        {
            PrintWriter writer = response.getWriter();
            JSONObject json = new JSONObject();
            if (ex instanceof HmrzException)
            {
                // 业务异常
                HmrzException ae = (HmrzException)ex;
                json.put("resultCode", ae.getErrorCode());
            }
            else
            {
                json.put("resultCode", ExceptionConstants.ERROR_SYS);
            }
            writer.print(json);
            writer.flush();
            writer.close();
        }
        catch (IOException e)
        {
            log.error("请求出现异常！", e);
        }
        return null;
    }
}
