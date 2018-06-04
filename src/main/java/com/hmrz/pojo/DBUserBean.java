package com.hmrz.pojo;

public class DBUserBean {
	
	private String user_id;
	/**
	 * 手机号
	 */
	private String moble;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 密码盐值
	 */
	private String password_salt;
	/**
	 * 单位名称
	 */
	private String vendor_name;
	/**
	 * 省
	 */
	private String province_code;
	/**
	 * 市
	 */
	private String city_code;
	/**
	 * 单位id
	 */
	private String vendor_id;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 创建时间
	 */
	private String create_time;
	/**
	 * 操作人
	 */
	private String operator;
	
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
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getProvince_code() {
		return province_code;
	}
	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
