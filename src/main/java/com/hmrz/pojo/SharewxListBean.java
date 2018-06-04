/**
 * 文 件 名:  SharewxListBean.java
 * 描    述:  <描述>
 * 创 建 人:  sandy
 * 创建时间:  2016年3月29日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <pre>
 * 微信分享类任务列表bean
 * </pre>
 * 
 * @author  sandy
 * @data  2016年3月29日
 */
public class SharewxListBean
{
    private String task_id;
    
    private String name;
    
    private String vendor_name;
    
    private String create_user;
    
    private String agent;
    
    private BigDecimal salary;
    
    private Date do_btime;
    
    private String do_etime;
    
    private String status;
    
    private String execute_times;
    
    private String plat_fee;     //平台费用
    
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

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
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

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Date getDo_btime() {
		return do_btime;
	}

	public void setDo_btime(Date do_btime) {
		this.do_btime = do_btime;
	}

	public String getDo_etime() {
		return do_etime;
	}

	public void setDo_etime(String do_etime) {
		this.do_etime = do_etime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReject_reason() {
		return reject_reason;
	}

	public void setReject_reason(String reject_reason) {
		this.reject_reason = reject_reason;
	}

	public String getExecute_times() {
		return execute_times;
	}

	public void setExecute_times(String execute_times) {
		this.execute_times = execute_times;
	}

	public String getPlat_fee() {
		return plat_fee;
	}

	public void setPlat_fee(String plat_fee) {
		this.plat_fee = plat_fee;
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

	private String reject_reason;
    
  
}
