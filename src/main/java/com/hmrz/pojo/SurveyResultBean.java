/**
 * 调研任务结果bean
 * Author：sandy
 */
package com.hmrz.pojo;

import java.io.Serializable;

public class SurveyResultBean implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7499798959097387856L;
	/**
	 * 任务执行编号
	 */
	private String execute_id;
	/**
	 * 任务ID
	 */
	private String task_id;
	/**
	 * 任务名称
	 */
	private String name;
	/**
	 * 任务描述
	 */
	private String descript;
	/**
	 * 企业id
	 */
	private String vendor_id;
	/**
	 * 企业名称
	 */
	private String vendor_name;
	/**
	 * 表单所属类别id
	 */
	private String task_type_id;
	/**
	 * 表单所属类别名称
	 */
	private String task_type_name;
	/**
	 * 创建人
	 */
	private String create_user;
	/**
	 * 创建人手机
	 */
	private String create_user_name;
	/**
	 * 代理人
	 */
	private String agent;
	/**
	 * 代理人姓名
	 */
	private String agent_name;
	/**
	 * 任务审核通过，发布时间
	 */
	private String publish_time;
	/**
	 * 执行总次数
	 */
	private String execute_times;
	/**
	 * 任务奖金（单价）
	 */
	private String salary;
	/**
	 * 平台费用（单任务）
	 */
	private String plat_fee;
	/**
	 * 任务执行总回收量
	 */
	private String total_recovery;
	/**
	 * 审核通过量
	 */
	private String audit_pass;
	/**
	 * 实际消费
	 */
	private String actual_cost;
	/**
	 * 平台费用
	 */
	private String platform_cost;
	/**
	 * 提交时间
	 */
	private String upload_time;
	/**
	 * 审核时间
	 */
	private String accept_time;
	/**
	 * 任务执行人
	 */
	private String executor;
	/**
	 * 任务执行人号码
	 */
	private String moble;
	/**
	 * 任务执行人设备
	 */
	private String registration_id;
	/**
	 * 任务执行人平台
	 */
	private int platform;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 审核人
	 */
	private String acceptor;
	/**
	 * 审核人姓名
	 */
	private String acceptor_name;
	/**
	 * 代理审核人
	 */
	private String audit_agent;
	/**
	 * 代理审核人姓名
	 */
	private String audit_agent_name;
	/**
	 * 审核期
	 */
	private String audit_times;
	/**
	 * 执行城市
	 */
	private String exe_city;
	/**
	 * 任务状态
	 */
	private String status;
	/**
	 * 执行状态
	 */
	private String execute_status;
	
	/**
	 * 开始时间
	 */
	private String do_btime;
	/**
	 * 结束时间
	 */
	private String do_etime;
	
	public String getExecute_id() {
		return execute_id;
	}
	public void setExecute_id(String execute_id) {
		this.execute_id = execute_id;
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
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
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
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getCreate_user_name() {
		return create_user_name;
	}
	public void setCreate_user_name(String create_user_name) {
		this.create_user_name = create_user_name;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	public String getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}
	public String getExecute_times() {
		return execute_times;
	}
	public void setExecute_times(String execute_times) {
		this.execute_times = execute_times;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPlat_fee() {
		return plat_fee;
	}
	public void setPlat_fee(String plat_fee) {
		this.plat_fee = plat_fee;
	}
	public String getTotal_recovery() {
		return total_recovery;
	}
	public void setTotal_recovery(String total_recovery) {
		this.total_recovery = total_recovery;
	}
	public String getAudit_pass() {
		return audit_pass;
	}
	public void setAudit_pass(String audit_pass) {
		this.audit_pass = audit_pass;
	}
	public String getActual_cost() {
		return actual_cost;
	}
	public void setActual_cost(String actual_cost) {
		this.actual_cost = actual_cost;
	}
	public String getPlatform_cost() {
		return platform_cost;
	}
	public void setPlatform_cost(String platform_cost) {
		this.platform_cost = platform_cost;
	}
	public String getUpload_time() {
		return upload_time;
	}
	public void setUpload_time(String upload_time) {
		this.upload_time = upload_time;
	}
	public String getAccept_time() {
		return accept_time;
	}
	public void setAccept_time(String accept_time) {
		this.accept_time = accept_time;
	}
	public String getExecutor() {
		return executor;
	}
	public void setExecutor(String executor) {
		this.executor = executor;
	}
	public String getMoble() {
		return moble;
	}
	public void setMoble(String moble) {
		this.moble = moble;
	}
	public String getRegistration_id() {
		return registration_id;
	}
	public void setRegistration_id(String registration_id) {
		this.registration_id = registration_id;
	}
	public int getPlatform() {
		return platform;
	}
	public void setPlatform(int platform) {
		this.platform = platform;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAcceptor() {
		return acceptor;
	}
	public void setAcceptor(String acceptor) {
		this.acceptor = acceptor;
	}
	public String getAcceptor_name() {
		return acceptor_name;
	}
	public void setAcceptor_name(String acceptor_name) {
		this.acceptor_name = acceptor_name;
	}
	public String getAudit_agent() {
		return audit_agent;
	}
	public void setAudit_agent(String audit_agent) {
		this.audit_agent = audit_agent;
	}
	public String getAudit_agent_name() {
		return audit_agent_name;
	}
	public void setAudit_agent_name(String audit_agent_name) {
		this.audit_agent_name = audit_agent_name;
	}
	public String getAudit_times() {
		return audit_times;
	}
	public void setAudit_times(String audit_times) {
		this.audit_times = audit_times;
	}
	public String getExe_city() {
		return exe_city;
	}
	public void setExe_city(String exe_city) {
		this.exe_city = exe_city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getExecute_status() {
		return execute_status;
	}
	public void setExecute_status(String execute_status) {
		this.execute_status = execute_status;
	}
	public String getDo_btime() {
		return do_btime;
	}
	public void setDo_btime(String do_btime) {
		this.do_btime = do_btime;
	}
	public String getDo_etime() {
		return do_etime;
	}
	public void setDo_etime(String do_etime) {
		this.do_etime = do_etime;
	}
}
