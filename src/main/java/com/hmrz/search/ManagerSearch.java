/**
 * 文 件 名:  ManagerSearch.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年11月2日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 管理员查询bean
 * </pre>
 * 
 * @author  pfma
 * @data  2015年11月2日
 */
public class ManagerSearch extends Page
{
    private static final long serialVersionUID = 5594132554775161723L;
    
    private String name;
    
    private String password;
    
    private String manager_id;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }

	public String getManager_id() {
		return manager_id;
	}

	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
}
