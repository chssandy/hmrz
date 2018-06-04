package com.hmrz.pojo;

public class TaskStatisticBean {
	
	/**
	 * 用户id
	 */
	private String user_id;
	/**
	 * 用户手机号
	 */
	private String moble;
	/**
	 * 用户城市名
	 */
	private String city_name;
	
	/**
	 * 用户信用分总分
	 */
	private String total;
	/**
	 * 参与任务总户
	 */
	private String task_involed;
	/**
	 * 申请任务次数
	 */
	private String apply_times;
	/**
	 * 申请任务成功次数
	 */
	private String apply_success;
	/**
	 * 放弃任务次数
	 */
	private String abandoned_times;
	/**
	 * 提交任务次数
	 */
	private String submit_times;
	/**
	 * 通过任务次数
	 */
	private String passed_times;
	/**
	 * 驳回任务次数
	 */
	private String reject_times;
	/**
	 * 点击次数
	 */
	private String click_times;
	/**
	 * 有效点击次数
	 */
	private String valid_click_times;
	
	public String getClick_times() {
		return click_times;
	}
	public void setClick_times(String click_times) {
		this.click_times = click_times;
	}
	public String getValid_click_times() {
		return valid_click_times;
	}
	public void setValid_click_times(String valid_click_times) {
		this.valid_click_times = valid_click_times;
	}
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
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getTask_involed() {
		return task_involed;
	}
	public void setTask_involed(String task_involed) {
		this.task_involed = task_involed;
	}
	public String getApply_times() {
		return apply_times;
	}
	public void setApply_times(String apply_times) {
		this.apply_times = apply_times;
	}
	public String getApply_success() {
		return apply_success;
	}
	public void setApply_success(String apply_success) {
		this.apply_success = apply_success;
	}
	public String getAbandoned_times() {
		return abandoned_times;
	}
	public void setAbandoned_times(String abandoned_times) {
		this.abandoned_times = abandoned_times;
	}
	public String getSubmit_times() {
		return submit_times;
	}
	public void setSubmit_times(String submit_times) {
		this.submit_times = submit_times;
	}
	public String getPassed_times() {
		return passed_times;
	}
	public void setPassed_times(String passed_times) {
		this.passed_times = passed_times;
	}
	public String getReject_times() {
		return reject_times;
	}
	public void setReject_times(String reject_times) {
		this.reject_times = reject_times;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
}
