/**
 * 文件名称：  Base64.java
 * 文件版权:  China Gowin Technologies Co., Ltd. Copyright 2007-2012,All rights reserved
 * 文件描述:  <描述>
 * 修改作者:  pfma
 * 修改时间:  Nov 7, 2012
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.hmrz.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.hmrz.common.log.LoggerAdapter;
import com.hmrz.common.log.LoggerAdapterFacory;

/**
 * Base64加密算法工具 <功能详细描述>
 * 
 * @author pfma
 * @version V1.0, Nov 7, 2012
 */
public final class Base64
{
    private static final char[] legalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    
    private static final LoggerAdapter log = LoggerAdapterFacory.getLoggerAdapter(Base64.class);
    
    /**
     * 用Base64对密码进行加密
     * 
     * <功能详细描述>
     *
     * @param passwd 传过来的密码
     * @return 加密后的密码
     */
    public static String encode(String passwd)
    {
        byte[] data = passwd.getBytes();
        int start = 0;
        int len = data.length;
        StringBuffer buf = new StringBuffer(data.length * 3 / 2);
        
        int end = len - 3;
        int i = start;
        int n = 0;
        
        while (i <= end)
        {
            int d = ((((int)data[i]) & 0x0ff) << 16) | ((((int)data[i + 1]) & 0x0ff) << 8)
                    | (((int)data[i + 2]) & 0x0ff);
            
            buf.append(legalChars[(d >> 18) & 63]);
            buf.append(legalChars[(d >> 12) & 63]);
            buf.append(legalChars[(d >> 6) & 63]);
            buf.append(legalChars[d & 63]);
            
            i += 3;
            
            if (n++ >= 14)
            {
                n = 0;
                buf.append(" ");
            }
        }
        
        if (i == start + len - 2)
        {
            int d = ((((int)data[i]) & 0x0ff) << 16) | ((((int)data[i + 1]) & 255) << 8);
            
            buf.append(legalChars[(d >> 18) & 63]);
            buf.append(legalChars[(d >> 12) & 63]);
            buf.append(legalChars[(d >> 6) & 63]);
            buf.append("=");
        }
        else if (i == start + len - 1)
        {
            int d = (((int)data[i]) & 0x0ff) << 16;
            
            buf.append(legalChars[(d >> 18) & 63]);
            buf.append(legalChars[(d >> 12) & 63]);
            buf.append("==");
        }
        
        return buf.toString();
    }
    
    /**
     * 
     * Base64解密算法
     * <功能详细描述>
     *
     * @param s
     * @return
     */
    public static String decode(String s)
    {
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try
        {
            decode(s, bos);
        }
        catch (IOException e)
        {
            throw new RuntimeException();
        }
        byte[] decodedBytes = bos.toByteArray();
        try
        {
            bos.close();
            bos = null;
        }
        catch (IOException ex)
        {
            log.debug("Error while decoding BASE64: ", ex);
        }
        return decodedBytes.toString();
    }
    
    private static void decode(String s, OutputStream os) throws IOException
    {
        int i = 0;
        
        int len = s.length();
        
        while (true)
        {
            while (i < len && s.charAt(i) <= ' ')
                i++;
            
            if (i == len)
                break;
            
            int tri = (decode(s.charAt(i)) << 18) + (decode(s.charAt(i + 1)) << 12) + (decode(s.charAt(i + 2)) << 6)
                    + (decode(s.charAt(i + 3)));
            
            os.write((tri >> 16) & 255);
            if (s.charAt(i + 2) == '=')
                break;
            os.write((tri >> 8) & 255);
            if (s.charAt(i + 3) == '=')
                break;
            os.write(tri & 255);
            
            i += 4;
        }
    }
    
    private static int decode(char c)
    {
        if (c >= 'A' && c <= 'Z')
            return ((int)c) - 65;
        else if (c >= 'a' && c <= 'z')
            return ((int)c) - 97 + 26;
        else if (c >= '0' && c <= '9')
            return ((int)c) - 48 + 26 + 26;
        else
            switch (c)
            {
                case '+':
                    return 62;
                case '/':
                    return 63;
                case '=':
                    return 0;
                default:
                    throw new RuntimeException("unexpected code: " + c);
            }
    }
    
}
