/**
 * 文 件 名:  RoleModuleBean.java
 * 描    述:  <角色及资源关联bean>
 * 创 建 人:  sandy
 * 创建时间: 2015年11月03日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.util.Date;

/**
 * <角色资源关联bean>
 * <在配置角色资源时会对资源及角色进行关联，本系统的资源即是请求的URL>
 * 
 * @author  sandy
 * @data  2014年4月11日
 */
public class RoleModuleBean
{
    /**
     * role_module_id,主键
     */
    private String role_module_id;
    
    /**
     * 关联角色id
     */
    private String role_id;
    
    /**
     * 关联资源Id，及模块URL的id
     */
    private String module_id;
    
    /**
     * 配置时间
     */
    private Date create_time;
    
    /**
     * 操作人id
     */
    private String create_user;
    
    /**
     * 备注
     */
    private String remark;
    
	public String getRole_module_id() {
		return role_module_id;
	}

	public void setRole_module_id(String role_module_id) {
		this.role_module_id = role_module_id;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getModule_id() {
		return module_id;
	}

	public void setModule_id(String module_id) {
		this.module_id = module_id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RoleModuleBean [");
		if (role_module_id != null) {
			builder.append("role_module_id=");
			builder.append(role_module_id);
			builder.append(", ");
		}
		if (role_id != null) {
			builder.append("role_id=");
			builder.append(role_id);
			builder.append(", ");
		}
		if (module_id != null) {
			builder.append("module_id=");
			builder.append(module_id);
			builder.append(", ");
		}
		if (create_time != null) {
			builder.append("create_time=");
			builder.append(create_time);
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
		}
		builder.append("]");
		return builder.toString();
	}
    
}
