/**
 * 文 件 名:  UploadController.java
 * 描    述:  <文件上传>
 * 创 建 人:  sandy
 * 创建时间:  2015-05-25
 * 修改内容:  <修改内容>
 */
package com.hmrz.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.hmrz.common.BaseController;
import com.hmrz.common.exception.HmrzException;

/**
 * <pre>
 * </pre>
 * @author  sandy
 * @data  2015-05-25
 */
@Controller
@RequestMapping("/system/public")
public class UploadController extends BaseController
{
    /**
     * APP版本管理 附件上传
     * @author sandy 
     * @date 2015年5月25日 上午11:28:48
     * @param myfiles
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/uploadFile/{folder}")
    @ResponseBody
    public Map<String, Object> uploadFile(@PathVariable String folder, HttpServletRequest request)
            throws HmrzException
    {
        return buildResult(upload(request, folder, false));
    }
    
    /**
     * 服务端任务发布题目中图片上传
     * @author sandy 
     * @date 2015年5月25日 上午11:28:48
     * @param myfiles
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/uploadImage/{folder}")
    @ResponseBody
    public Map<String, Object> uploadImage(@PathVariable String folder, HttpServletRequest request)
            throws HmrzException
    {
        return buildResult(upload(request, folder, false));
    }
    
    /**
     * 服务端任务发布题目中图片上传
     * @author sandy 
     * @date 2015年5月25日 上午11:28:48
     * @param myfiles
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/checkUploadImage/{folder}")
    @ResponseBody
    public Map<String, Object> checkUploadImage(@PathVariable String folder, HttpServletRequest request)
            throws HmrzException
    {
        return buildResult(upload(request, folder, true));
    }
    
    @RequestMapping(value = "/umUpload/{folder}")
    public void umUpload(@PathVariable String folder, HttpServletRequest request, HttpServletResponse response)
            throws Exception
    {
        
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        JSONObject result = upload(request, folder, false);
        Object o = result.get("file0");//只取第一张
        @SuppressWarnings("unchecked")
        Map<String, String> file = (Map<String, String>)o;
        if (file != null)
        {
            String url = file.get("url");
            result.put("url", url);
        }
        String callback = request.getParameter("callback");
        if (callback == null)
        {
            response.getWriter().print(result.toString());
        }
        else
        {
            response.getWriter().print("<script>" + callback + "(" + result + ")</script>");
        }
    }
    
    /**
     * 文件上传类
     * @param request
     * @param bucketname
     * @return
     * @throws IOException
     */
    public JSONObject upload(HttpServletRequest request, String folder, boolean isQRCode) throws HmrzException
    {
        JSONObject result = new JSONObject();
        
        int i = 0;
        try
        {
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
            Iterator<String> iter = multiRequest.getFileNames();
            while (iter.hasNext())
            {
                Map<String, String> original = new HashMap<String, String>();
                //Map<String, String> allObjectKey = aliou.getAllObjectKey();
                //一次遍历所有文件
                MultipartFile file = multiRequest.getFile(iter.next().toString());
                String url = "";
                String flag = "OK";
                if (file != null)
                {
                	
                	 if (request.getContentLength() > 0) {            
                         InputStream inputStream = null;
                         FileOutputStream outputStream = null;               
                         inputStream = file.getInputStream();
                          // 给新文件拼上时间毫秒，防止重名
                          long now = System.currentTimeMillis();
                          String filename = file.getOriginalFilename();
                          int index = filename.lastIndexOf(".");
                          String type = filename.substring(index);
                          File file1 = new File("c:/", "file-" + now + type);
                          file1.createNewFile();
                          byte temp[] = new byte[1024];
                          int size = -1;
                          while ((size = inputStream.read(temp)) != -1) { // 每次读取1KB，直至读完
                              outputStream.write(temp, 0, size);
                          }
                }
                else
                {
                    flag = "ERR";
                }
                original.put("url", url);
                original.put("flag", flag);
                result.put("file" + (i++), original);
            }
            result.put("state", "SUCCESS");
            }
        }
        catch (Exception e)
        {
            result.put("state", "fail");
        }
        return result;
    }
}