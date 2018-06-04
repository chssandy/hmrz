/**
 * 文 件 名:  RoleSearch.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年11月2日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 角色搜索bean
 * </pre>
 * 
 * @author  pfma
 * @data  2015年11月2日
 */
public class RoleSearch extends Page
{
    private static final long serialVersionUID = 2263505977224022127L;
    
    private String role_name;
    
    public String getRole_name()
    {
        return role_name;
    }
    
    public void setRole_name(String role_name)
    {
        this.role_name = role_name;
    }
}
