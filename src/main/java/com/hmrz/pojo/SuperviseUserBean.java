package com.hmrz.pojo;

public class SuperviseUserBean {
	
	private String user_id;
	private String moble;
	private String password;
	private String password_salt;
	private String vendor_id;
	private String remark;
	private String is_del;
	private String create_time;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getMoble() {
		return moble;
	}
	public void setMoble(String moble) {
		this.moble = moble;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword_salt() {
		return password_salt;
	}
	public void setPassword_salt(String password_salt) {
		this.password_salt = password_salt;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getIs_del() {
		return is_del;
	}
	public void setIs_del(String is_del) {
		this.is_del = is_del;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SuperviseUserBean [");
		if (user_id != null) {
			builder.append("user_id=");
			builder.append(user_id);
			builder.append(", ");
		}
		if (moble != null) {
			builder.append("moble=");
			builder.append(moble);
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
		if (vendor_id != null) {
			builder.append("vendor_id=");
			builder.append(vendor_id);
			builder.append(", ");
		}
		if (remark != null) {
			builder.append("remark=");
			builder.append(remark);
			builder.append(", ");
		}
		if (is_del != null) {
			builder.append("is_del=");
			builder.append(is_del);
			builder.append(", ");
		}
		if (create_time != null) {
			builder.append("create_time=");
			builder.append(create_time);
		}
		builder.append("]");
		return builder.toString();
	}
}
