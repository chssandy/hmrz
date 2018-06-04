/**
 * 文 件 名:  VersionBean.java
 * 描    述:  APP版本信息
 * 创 建 人:  sandy
 * 创建时间:  2015年5月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * <APP版本信息bean>
 * 
 * @author  sandy
 * @data  2015年11月04日
 */
public class VersionBean implements Serializable
{
    private static final long serialVersionUID = 85674617832148982L;
    
    /**
     * id，主键
     */
    private String version_id;
    
    /**
     * APP名称
     */
    private String app_name;
    
    /**
     * APP版本
     */
    private String app_version;
    
    /**
     * APP版本数值
     */
    private int version_num;
    
    /**
     * 文件名称
     */
    private String app_file;
    
    /**
     * 文件路径
     */
    private String app_url;
    
    /**
     * 文件大小
     */
    private String size;
    
    /**
     * 机型
     */
    private String phone_type;
    
    /**
     * 描述
     */
    private String description;
    
    /**
     * 创建时间
     */
    private String create_time;
    
    /**
     * 添加人
     */
    private String create_user;
    
    /**
     * 是否强制更新
     */
    private String is_force;
    
    /**
     * 是否审核阶段控制开关   0：审核中    1：审核通过
     */
    private String is_audit;

	public String getVersion_id() {
		return version_id;
	}

	public void setVersion_id(String version_id) {
		this.version_id = version_id;
	}

	public String getApp_name() {
		return app_name;
	}

	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

	public String getApp_version() {
		return app_version;
	}

	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}

	public int getVersion_num() {
		return version_num;
	}

	public void setVersion_num(int version_num) {
		this.version_num = version_num;
	}

	public String getApp_file() {
		return app_file;
	}

	public void setApp_file(String app_file) {
		this.app_file = app_file;
	}

	public String getApp_url() {
		return app_url;
	}

	public void setApp_url(String app_url) {
		this.app_url = app_url;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPhone_type() {
		return phone_type;
	}

	public void setPhone_type(String phone_type) {
		this.phone_type = phone_type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public String getIs_force() {
		return is_force;
	}

	public void setIs_force(String is_force) {
		this.is_force = is_force;
	}

	public String getIs_audit() {
		return is_audit;
	}

	public void setIs_audit(String is_audit) {
		this.is_audit = is_audit;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VersionBean [");
		if (version_id != null) {
			builder.append("version_id=");
			builder.append(version_id);
			builder.append(", ");
		}
		if (app_name != null) {
			builder.append("app_name=");
			builder.append(app_name);
			builder.append(", ");
		}
		if (app_version != null) {
			builder.append("app_version=");
			builder.append(app_version);
			builder.append(", ");
		}
		builder.append("version_num=");
		builder.append(version_num);
		builder.append(", ");
		if (app_file != null) {
			builder.append("app_file=");
			builder.append(app_file);
			builder.append(", ");
		}
		if (app_url != null) {
			builder.append("app_url=");
			builder.append(app_url);
			builder.append(", ");
		}
		if (size != null) {
			builder.append("size=");
			builder.append(size);
			builder.append(", ");
		}
		if (phone_type != null) {
			builder.append("phone_type=");
			builder.append(phone_type);
			builder.append(", ");
		}
		if (description != null) {
			builder.append("description=");
			builder.append(description);
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
		if (is_force != null) {
			builder.append("is_force=");
			builder.append(is_force);
			builder.append(", ");
		}
		if (is_audit != null) {
			builder.append("is_audit=");
			builder.append(is_audit);
		}
		builder.append("]");
		return builder.toString();
	}
    
}
