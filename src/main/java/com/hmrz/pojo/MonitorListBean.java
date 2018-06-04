/**
 * 文 件 名:  SurveyListBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年3月24日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <pre>
 * 监测类任务列表bean
 * </pre>
 * 
 * @author  sandy
 * @data  2016年3月29日
 */
public class MonitorListBean
{
private String task_id;
    
    private String name;
    
    private BigDecimal salary;
    
    private String create_user;
    
    private String agent;
    
    private String create_type;
    
    private String task_type_id;
    
    private Date do_btime;
    
    private Date do_etime;
    
    private Date show_btime;
    
    private Date show_etime;
    
    private String status;
    
    private String brand_name;
    
    private String vendor_name;
    
    private String task_type_name;
    
    private String city_name;
    
    private String reject_reason;
    
    private String plat_fee;     //平台费用
    
    private String audit_times;  //审核周期
    
    private String vendor_id;
    
    private String remark;

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

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getCreate_type() {
		return create_type;
	}

	public void setCreate_type(String create_type) {
		this.create_type = create_type;
	}

	public String getTask_type_id() {
		return task_type_id;
	}

	public void setTask_type_id(String task_type_id) {
		this.task_type_id = task_type_id;
	}

	public Date getDo_btime() {
		return do_btime;
	}

	public void setDo_btime(Date do_btime) {
		this.do_btime = do_btime;
	}

	public Date getDo_etime() {
		return do_etime;
	}

	public void setDo_etime(Date do_etime) {
		this.do_etime = do_etime;
	}

	public Date getShow_btime() {
		return show_btime;
	}

	public void setShow_btime(Date show_btime) {
		this.show_btime = show_btime;
	}

	public Date getShow_etime() {
		return show_etime;
	}

	public void setShow_etime(Date show_etime) {
		this.show_etime = show_etime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public String getTask_type_name() {
		return task_type_name;
	}

	public void setTask_type_name(String task_type_name) {
		this.task_type_name = task_type_name;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getReject_reason() {
		return reject_reason;
	}

	public void setReject_reason(String reject_reason) {
		this.reject_reason = reject_reason;
	}

	public String getPlat_fee() {
		return plat_fee;
	}

	public void setPlat_fee(String plat_fee) {
		this.plat_fee = plat_fee;
	}

	public String getAudit_times() {
		return audit_times;
	}

	public void setAudit_times(String audit_times) {
		this.audit_times = audit_times;
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

}
