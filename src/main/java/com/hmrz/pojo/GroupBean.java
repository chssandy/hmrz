package com.hmrz.pojo;


public class GroupBean {
	
	/**
	 * id
	 */
	private String group_id;
	/**
	 * 组名
	 */
	private String name;
	/**
	 * 所属商户id
	 */
	private String vendor_id;
	/**
	 * 创建人
	 */
	private String create_user;
	/**
	 * 创建时间
	 */
	private String create_time;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 关联内勤人员
	 */
	private String officeIds;
	
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOfficeIds() {
		return officeIds;
	}
	public void setOfficeIds(String officeIds) {
		this.officeIds = officeIds;
	}

}
