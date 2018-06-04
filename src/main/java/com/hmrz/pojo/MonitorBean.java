package com.hmrz.pojo;

import java.math.BigDecimal;
import java.util.List;

public class MonitorBean {
	
	private String task_id;
	/**
	 * 表单名称
	 */
	private String name;
	/**
	 * 表单描述
	 */
	private String descript;
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
	 * 任务可见时间
	 */
	private String show_btime;
	/**
	 * 任务不可见时间
	 */
	private String show_etime;
	/**
	 * 任务可执行开始时间
	 */
	private String do_btime;
	/**
	 * 任务可执行截止时间
	 */
	private String do_etime;
	/**
	 * 代发的运营账号
	 */
	private String agent;
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
	 * 品牌id
	 */
	private String brand_id;
	/**
	 * 品牌名称
	 */
	private String brand_name;
	/**
	 * 申请时段a   （a<b<c）
	 */
	private String a_exe_time;
	/**
	 * 申请时段b   （a<b<c）
	 */
	private String b_exe_time;
	/**
	 * 申请时段c   （a<b<c）
	 */
	private String c_exe_time;
	/**
	 * 审核期
	 */
	private String audit_times;
	/**
	 * 新建时间
	 */
	private String create_time;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 发布人类别   0：系统人员发布   1：商户发布   2：用户发布
	 */
	private String create_type;
	/**
	 * 创建人
	 */
	private String create_user;
	/**
	 * 创建人姓名
	 */
	private String manager_name;
	/**
	 * 是否通过
	 */
	private String is_passed;
	
	/**
	 * 通过理由（备注）
	 */
	private String reject_reason;
	/**
	 * 监测目标
	 */
	private List<TaskAimBean> aimList;
	
	/**
	 * 任务城市
	 */
	private String city_name;
	
	 /**
     * 是否专属任务   0： 否   1：是
     */
    private String is_exclusive;
    
    /**
     * 题目列表
     */
    private List<TaskTopicBean> topicList;
    
    /**
     * 城市列表
     */
    private CityBean city;
    
    /**
     * 调研约束bean
     */
    private TaskRestrainBean trb;
    
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

	public String getShow_btime() {
		return show_btime;
	}

	public void setShow_btime(String show_btime) {
		this.show_btime = show_btime;
	}

	public String getShow_etime() {
		return show_etime;
	}

	public void setShow_etime(String show_etime) {
		this.show_etime = show_etime;
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

	public String getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getA_exe_time() {
		return a_exe_time;
	}

	public void setA_exe_time(String a_exe_time) {
		this.a_exe_time = a_exe_time;
	}

	public String getB_exe_time() {
		return b_exe_time;
	}

	public void setB_exe_time(String b_exe_time) {
		this.b_exe_time = b_exe_time;
	}

	public String getC_exe_time() {
		return c_exe_time;
	}

	public void setC_exe_time(String c_exe_time) {
		this.c_exe_time = c_exe_time;
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

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public String getIs_passed() {
		return is_passed;
	}

	public void setIs_passed(String is_passed) {
		this.is_passed = is_passed;
	}

	public String getReject_reason() {
		return reject_reason;
	}

	public void setReject_reason(String reject_reason) {
		this.reject_reason = reject_reason;
	}

	public List<TaskAimBean> getAimList() {
		return aimList;
	}

	public void setAimList(List<TaskAimBean> aimList) {
		this.aimList = aimList;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getIs_exclusive() {
		return is_exclusive;
	}

	public void setIs_exclusive(String is_exclusive) {
		this.is_exclusive = is_exclusive;
	}

	public List<TaskTopicBean> getTopicList() {
		return topicList;
	}

	public void setTopicList(List<TaskTopicBean> topicList) {
		this.topicList = topicList;
	}

	public TaskRestrainBean getTrb() {
		return trb;
	}

	public void setTrb(TaskRestrainBean trb) {
		this.trb = trb;
	}

	public String getAudit_times() {
		return audit_times;
	}

	public void setAudit_times(String audit_times) {
		this.audit_times = audit_times;
	}
	
	public CityBean getCity() {
		return city;
	}

	public void setCity(CityBean city) {
		this.city = city;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MonitorBean [task_id=").append(task_id)
				.append(", name=").append(name).append(", descript=")
				.append(descript).append(", task_type_id=")
				.append(task_type_id).append(", task_type_name=")
				.append(task_type_name).append(", salary=").append(salary)
				.append(", plat_fee=").append(plat_fee)
				.append(", execute_times=").append(execute_times)
				.append(", show_btime=").append(show_btime)
				.append(", show_etime=").append(show_etime)
				.append(", do_btime=").append(do_btime).append(", do_etime=")
				.append(do_etime).append(", publish_user=")
				.append(publish_user).append(", publish_time=")
				.append(publish_time).append(", status=").append(status)
				.append(", vendor_id=").append(vendor_id).append(", brand_id=")
				.append(brand_id).append(", brand_name=").append(brand_name)
				.append(", a_exe_time=").append(a_exe_time)
				.append(", b_exe_time=").append(b_exe_time)
				.append(", c_exe_time=").append(c_exe_time)
				.append(", create_time=").append(create_time)
				.append(", remark=").append(remark).append(", create_type=")
				.append(create_type).append(", create_user=")
				.append(create_user).append(", manager_name=")
				.append(manager_name).append(", is_passed=").append(is_passed)
				.append(", reject_reason=").append(reject_reason)
				.append(", aimList=").append(aimList).append(", city_name=")
				.append(city_name).append(", is_exclusive=")
				.append(is_exclusive).append(", topicList=").append(topicList)
				.append(", city=").append(city).append(", trb=")
				.append(trb).append("]");
		return builder.toString();
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}
	
}
