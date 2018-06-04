package com.hmrz.pojo;
/**
 * 任务约束bean
 * @author yl
 *
 */
public class TaskRestrainBean {
	
	/**
	 * 约束id
	 */
	private String constrain_id;
	/**
	 * 任务id
	 */
	private String task_id;
	/**
	 * 单人最大执行次数（0:不限）
	 */
	private String one_executor_times;
	/**
	 * 是否添加水印  0：否  1：是
	 */
	private String water_marker;
	/**
	 * 限定组
	 */
	private String group_id;
	/**
	 * 性别约束
	 */
	private String sex;
	/**
	 * 年龄约束
	 */
	private String age_min;
	/**
	 * 年龄约束
	 */
	private String age_max;
	/**
	 * 是否有执行地点  0：无   1：有
	 */
	private String be_located;
	/**
	 * 执行地点
	 */
	private String execute_address;
	/**
	 * 经纬度
	 */
	private String execute_lat_lng;
	/**
	 * 执行范围
	 */
	private String execute_range;
	
	
	public String getBe_located() {
		return be_located;
	}
	public void setBe_located(String be_located) {
		this.be_located = be_located;
	}
	public String getExecute_address() {
		return execute_address;
	}
	public void setExecute_address(String execute_address) {
		this.execute_address = execute_address;
	}
	public String getExecute_lat_lng() {
		return execute_lat_lng;
	}
	public void setExecute_lat_lng(String execute_lat_lng) {
		this.execute_lat_lng = execute_lat_lng;
	}
	public String getExecute_range() {
		return execute_range;
	}
	public void setExecute_range(String execute_range) {
		this.execute_range = execute_range;
	}
	public String getConstrain_id() {
		return constrain_id;
	}
	public void setConstrain_id(String constrain_id) {
		this.constrain_id = constrain_id;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public String getOne_executor_times() {
		return one_executor_times;
	}
	public void setOne_executor_times(String one_executor_times) {
		this.one_executor_times = one_executor_times;
	}
	public String getWater_marker() {
		return water_marker;
	}
	public void setWater_marker(String water_marker) {
		this.water_marker = water_marker;
	}
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge_min() {
		return age_min;
	}
	public void setAge_min(String age_min) {
		this.age_min = age_min;
	}
	public String getAge_max() {
		return age_max;
	}
	public void setAge_max(String age_max) {
		this.age_max = age_max;
	}

}
