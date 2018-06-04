package com.hmrz.pojo;

public class DBVendorBean {
	
	/**
	 * id
	 */
	private String vendor_id;
	/**
	 * 单位名称
	 */
	private String vendor_name;
	/**
	 * 创建时间
	 */
	private String create_time;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 是否删除
	 */
	private String is_del;
	
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIs_del() {
		return is_del;
	}
	public void setIs_del(String is_del) {
		this.is_del = is_del;
	}

}
