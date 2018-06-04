package com.hmrz.pojo;

import java.math.BigDecimal;

public class ProjectTaskBean {
	
	/**
	 * 项目任务编号
	 */
	private String project_task_id;
   /**
     * 项目id
     */
    private String project_id;
	/**
	 * 任务编号
	 */
	private String task_id;
	/**
	 * 业务类别
	 */
	private String task_biz;
	/**
	 * 表单名称
	 */
	private String name;
	/**
	 * 表单所属类别（附属任务类别表 S_TASK_TYPE）
	 */
	private String task_type_id;
	/**
	 * 任务类型名称
	 */
	private String task_type_name;
	/**
	 * 任务奖金
	 */
	private BigDecimal salary;
	/**
	 * 平台费用
	 */
	private BigDecimal plat_fee;
	/**
	 * 任务总执行次数
	 */
	private String execute_times;
	/**
	 * 发布审核人
	 */
	private String publish_user;
	/**
	 * 任务审核通过，发布时间
	 */
	private String publish_time;
	/**
	 * 任务状态（0：草稿  1：待审核 2：发布  3：驳回  4：全部完成  5：半完成  6：无人执行  7：关闭）
	 */
	private String status;
	/**
	 * 任务所属商户
	 */
	private String vendor_id;
	/**
	 * 新建时间
	 */
	private String create_time;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 创建人
	 */
	private String create_user;
	/**
	 * 创建人类型
	 */
	private String create_type;
	
	public String getProject_task_id() {
		return project_task_id;
	}
	public void setProject_task_id(String project_task_id) {
		this.project_task_id = project_task_id;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTask_type_id() {
		return task_type_id;
	}
	public void setTask_type_id(String task_type_id) {
		this.task_type_id = task_type_id;
	}
	public String getTask_type_name() {
		return task_type_name;
	}
	public void setTask_type_name(String task_type_name) {
		this.task_type_name = task_type_name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public BigDecimal getPlat_fee() {
		return plat_fee;
	}
	public void setPlat_fee(BigDecimal plat_fee) {
		this.plat_fee = plat_fee;
	}
	public String getExecute_times() {
		return execute_times;
	}
	public void setExecute_times(String execute_times) {
		this.execute_times = execute_times;
	}
	public String getPublish_user() {
		return publish_user;
	}
	public void setPublish_user(String publish_user) {
		this.publish_user = publish_user;
	}
	public String getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
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
	public String getCreate_type() {
		return create_type;
	}
	public void setCreate_type(String create_type) {
		this.create_type = create_type;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getTask_biz() {
		return task_biz;
	}
	public void setTask_biz(String task_biz) {
		this.task_biz = task_biz;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
}
