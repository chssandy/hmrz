package com.hmrz.pojo;

public class TaskPointBean {
	
	public TaskPointBean() {
		super();
	}
	
	public TaskPointBean(String province_name, String city_name, String address) {
		super();
		this.province_name = province_name;
		this.city_name = city_name;
		this.address = address;
	}
	
	private String task_pt_id;
	/**
	 * 任务id
	 */
	private String task_id;
	/**
	 * 省code
	 */
	private String province_code;
	/**
	 * 省名称
	 */
	private String province_name;
	/**
	 * 城市code
	 */
	private String city_code;
	/**
	 * 城市名称
	 */
	private String city_name;
	/**
	 * 详细地址
	 */
	private String address;
	
	public String getTask_pt_id() {
		return task_pt_id;
	}
	public void setTask_pt_id(String task_pt_id) {
		this.task_pt_id = task_pt_id;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public String getProvince_code() {
		return province_code;
	}
	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}
	public String getProvince_name() {
		return province_name;
	}
	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
