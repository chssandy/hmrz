/**
 * 文 件 名:  ManagerBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年11月2日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

/**
 * <pre>
 * 管理员bean
 * </pre>
 * 
 * @author  pfma
 * @data  2015年11月2日
 */
public class ManagerBean
{
    /**
     * id
     */
    private String manager_id;
    
    /**
     * 管理员名
     */
    private String manager_name;
    
    /**
     * 密码
     */
    private String password;
    
    /**
     * 密码盐
     */
    private String password_salt;
    
    /**
     * 创建时间
     */
    private String create_time;
    
    /**
     * 真实姓名
     */
    private String real_name;
    
    private String email;
    
    private String moble;
    
    /**
     * 创建人
     */
    private String create_user;
    
    /**
     * 备注
     */
    private String remark;
    
    /**
     * 关联的角色信息
     */
    private String roles;
    
    
    public String getCreate_time()
    {
        return create_time;
    }
    
    public void setCreate_time(String create_time)
    {
        this.create_time = create_time;
    }
    
    public String getManager_id()
    {
        return manager_id;
    }
    
    public void setManager_id(String manager_id)
    {
        this.manager_id = manager_id;
    }
    
    public String getManager_name()
    {
        return manager_name;
    }
    
    public void setManager_name(String manager_name)
    {
        this.manager_name = manager_name;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getPassword_salt()
    {
        return password_salt;
    }
    
    public void setPassword_salt(String password_salt)
    {
        this.password_salt = password_salt;
    }
    
    public String getReal_name()
    {
        return real_name;
    }
    
    public void setReal_name(String real_name)
    {
        this.real_name = real_name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getMoble()
    {
        return moble;
    }
    
    public void setMoble(String moble)
    {
        this.moble = moble;
    }
    
    public String getCreate_user()
    {
        return create_user;
    }
    
    public void setCreate_user(String create_user)
    {
        this.create_user = create_user;
    }
    
    public String getRemark()
    {
        return remark;
    }
    
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ManagerBean [");
		if (manager_id != null) {
			builder.append("manager_id=");
			builder.append(manager_id);
			builder.append(", ");
		}
		if (manager_name != null) {
			builder.append("manager_name=");
			builder.append(manager_name);
			builder.append(", ");
		}
		if (password != null) {
			builder.append("password=");
			builder.append(password);
			builder.append(", ");
		}
		if (password_salt != null) {
			builder.append("password_salt=");
			builder.append(password_salt);
			builder.append(", ");
		}
		if (create_time != null) {
			builder.append("create_time=");
			builder.append(create_time);
			builder.append(", ");
		}
		if (real_name != null) {
			builder.append("real_name=");
			builder.append(real_name);
			builder.append(", ");
		}
		if (email != null) {
			builder.append("email=");
			builder.append(email);
			builder.append(", ");
		}
		if (moble != null) {
			builder.append("moble=");
			builder.append(moble);
			builder.append(", ");
		}
		if (create_user != null) {
			builder.append("create_user=");
			builder.append(create_user);
			builder.append(", ");
		}
		if (remark != null) {
			builder.append("remark=");
			builder.append(remark);
			builder.append(", ");
		}
		if (roles != null) {
			builder.append("roles=");
			builder.append(roles);
		}
		builder.append("]");
		return builder.toString();
	}
	
}
