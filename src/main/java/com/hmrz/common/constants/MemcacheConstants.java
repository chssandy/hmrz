/**
 * 文 件 名:  MemcacheConstants.java
 * 描    述:  <memcache静态>
 * 创 建 人:  sandy
 * 创建时间:  2015年11月02日
 * 修改内容:  <修改内容>
 */
package com.hmrz.common.constants;

/**
 *  系统后台：
 *  	登录账号的token：admin_token_[moble]
 *  接口：
 *  	登录账号的token：api_token_[moble]
 *  	不同业务类型的验证码：api_[type]_vcode_[moble]
 *  	不同业务类型的验证码条数：api_[type]_count_[moble]
 *  商户：
 *  	登录账号的token：c_token_[moble]
 *  	不同业务类型的验证码：c_[type]_vcode_[moble]
 *  	不同业务类型的验证码：c_[type]_count_[moble]
 * @author sandy
 *
 */

public class MemcacheConstants
{
    /**
     * 系统后台登陆账号的token
     */
    public static final String ADMIN_TOKEN_MOBLE = "admin_token_";
    
    /**
     * 系统后台登陆账号的roles
     */
    public static final String ADMIN_ROLES_MANAGER = "admin_roles_";
    
    /**
     * 城市树
     */
    public static final String CITY_TREE = "city_tree";
    
    /**
     * 默认的session缓存过期时间
     */
    public static final int DEFAULT_EXPIRED_TIME = 60 * 60;
    
}
