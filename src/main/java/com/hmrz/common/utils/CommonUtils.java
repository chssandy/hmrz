/**
 * 文 件 名:  CommonUtils.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年6月3日
 * 修改内容:  <修改内容>
 */
package com.hmrz.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.poi.POIXMLDocument;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * <pre>
 * 一些公共的工具类
 * </pre>
 * 
 * @author  pfma
 * @data  2015年6月3日
 */
public final class CommonUtils
{
    /**
     * 字符串加密（加盐）
     * @param s
     * @param salt
     * @return
     */
    public static String encrypt(String s, String salt)
    {
        return new Md5Hash(Base64.encode(new Md5Hash(s).toString()), salt).toString();
    }
    
    
    /**
     * 字符串加密（加盐）  同biz，service的加密方式相同
     * @param s
     * @param salt
     * @return
     */
    public static String encryptMD5(String s, String salt)
    {
        return MD5.encryptMD5((Base64.encode(MD5.encryptMD5(s))) + salt);
    }
    
    public static SecureRandomNumberGenerator randomGenrator = new SecureRandomNumberGenerator();
    
    /**
     * 获取密码盐值
     * @return
     */
    public static String getRandomSalt()
    {
        String salt = randomGenrator.nextBytes().toHex();
        return salt.length() > 50 ? salt.substring(0, 50) : salt;
    }
    
    /**
     * <pre>
     * 获取cookie中的value
     * </pre> 
     * @param request
     * @param name
     * @return [参数说明]
     * @author pfma 2015年6月3日 下午4:55:40
     */
    public static String getCookieValue(HttpServletRequest request, String name)
    {
        Cookie cookies[] = request.getCookies();
        if (cookies == null || name == null || name.length() == 0)
        {
            return null;
        }
        for (int i = 0; i < cookies.length; i++)
        {
            if (name.equals(cookies[i].getName()))
            {
                return cookies[i].getValue();
            }
        }
        return null;
    }
    
    /**
     * 字符串转double（保留两位小数）
     * @param s
     * @return
     */
    public static double parseStringToDouble(String s){
    	if(s==null || s.length() <=0 )
    		return 0.00;
    	BigDecimal de = new BigDecimal(s);  
    	double ret = de.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();  
    	return  ret;
    }
    
    /**
     * 判断字符串是否为空
     * @param strs
     * @return
     */
    public static boolean isNullOrBlank(String... strs){
        for (String s : strs){
            if ((s == null) || (s.length() <= 0) || (s.trim().length() <= 0))
                return true;
        }
        return false;
    }
    
    /**
     * 判定excel文件的版本，创建对应的workbook
     * @author chs_sandy
     * @date  2016年4月7日  下午6:24:17
     * @param inp
     * @return
     * @throws IOException
     * @throws InvalidFormatException
     */
    public static Workbook create(InputStream inp) throws IOException,InvalidFormatException {
        if (!inp.markSupported()) {
            inp = new PushbackInputStream(inp, 8);
        }
        if (POIFSFileSystem.hasPOIFSHeader(inp)) {
            return new HSSFWorkbook(inp);
        }
        if (POIXMLDocument.hasOOXMLHeader(inp)) {
            return new XSSFWorkbook(OPCPackage.open(inp));
        }
        throw new IllegalArgumentException("你的excel版本目前poi解析不了");
    }
    
    /**
     * 获取单元格值
     */
    public static String getCellValue(Cell cell){
    	String ret;
    	if(cell == null)
    		return null;
		switch (cell.getCellType()){  
	      case Cell.CELL_TYPE_BLANK:  
	          ret = "";  
	          break;  
	      case Cell.CELL_TYPE_BOOLEAN:  
	          ret = String.valueOf(cell.getBooleanCellValue());  
	          break;  
	      case Cell.CELL_TYPE_ERROR:  
	          ret = null;  
	          break;  
	      case Cell.CELL_TYPE_NUMERIC:  
	    	  DecimalFormat df = new DecimalFormat("#");//转换成整型
	    	  ret=df.format(cell.getNumericCellValue());
	          break;  
	      case Cell.CELL_TYPE_STRING:  
	          ret = cell.getRichStringCellValue().getString();  
	          break;  
	      default:  
	          ret = null;  
	      }
		return ret;
    }
}
