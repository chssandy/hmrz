/**
 * 文 件 名:  StaticVariables.java
 * 描    述:  <静态信息描述>
 * 创 建 人:  sandy
 * 创建时间:  2014年4月14日
 * 修改内容:  <修改内容>
 */
package com.hmrz.common.constants;



public class StaticVariables
{
    /**
     * web平台
     */
    public static int PLATFORM_WEB = 0;
    
    /**
     * app平台
     */
    public static int PLATFORM_APP = 1;
    
    /**
     * 默认的admin账号id为1
     */
    public static String ADMIN_USERID = "1";
    
    /**
     * 默认分页大小:2
     */
    public static int DEFAULT_PAGESIZE = 10;
    
    /**
     * 默认的手机app分页大小
     */
    public static int DEFAULT_APP_PAGESIZE = 15;
    
    /**
     * 日志操作：新增
     */
    public static int LOG_INSERT = 1;
    
    /**
     * 日志操作：修改
     */
    public static int LOG_UPDATE = 2;
    
    /**
     * 日志操作：删除
     */
    public static int LOG_DELETE = 3;
    
    /**
     * 日志操作：登录
     */
    public static int LOG_LOGIN = 4;
    
    /**
     * 日志操作：登出
     */
    public static int LOG_LOGOUT = 5;
    
    /**
     * 日志操作是否成功：成功
     */
    public static int LOG_SUCCEED = 0;
    
    /**
     * 日志操作是否成功：失败
     */
    public static int LOG_FAILED = 1;
      
    /**
     * web用户会话过期时间(单位：分钟)
     */
    public static final int SESSION_TIMEOUT = 60;
    
    /**
     * 是否有分页
     */
    public static final int HAVE_PAGE_YES = 1;
    
    /**
     * 是否有分页
     */
    public static final int HAVE_PAGE_NO = 0;
    
}
