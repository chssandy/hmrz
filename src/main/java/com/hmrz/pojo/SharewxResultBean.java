/**
 * 文 件 名:  SharewxListBean.java
 * 描    述:  <描述>
 * 创 建 人:  sandy
 * 创建时间:  2016年3月29日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.math.BigDecimal;

/**
 * <pre>
 * 微信分享类任务列表bean
 * </pre>
 * 
 * @author  sandy
 * @data  2016年3月29日
 */
public class SharewxResultBean
{
    private String task_id;
    
    private String name;
    
    private String vendor_id;
    
    private String vendor_name;
    
    private String create_user;
    
    private String create_user_name;
    
    private String agent;
    
    private String agent_name;
    
    private String publish_time;
    
    private int execute_times;
    
    private BigDecimal salary;
    
    private BigDecimal plat_fee;
    
    private String status;
    
    private String remark;
    
    private int sv;    //分享次数
    
    private int pv;    //总点击量
    
    private int uv;    //有效点击量
    
	private String do_btime;
	
	private String do_etime;
	
	private String execute_time;    //分享时间
	
	private String executor;
	
	private String executor_name;
    
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

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getUv() {
		return uv;
	}

	public void setUv(int uv) {
		this.uv = uv;
	}

	public BigDecimal getPlat_fee() {
		return plat_fee;
	}

	public void setPlat_fee(BigDecimal plat_fee) {
		this.plat_fee = plat_fee;
	}

	public int getExecute_times() {
		return execute_times;
	}

	public void setExecute_times(int execute_times) {
		this.execute_times = execute_times;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getPublish_time() {
		return publish_time;
	}

	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}

	public int getSv() {
		return sv;
	}

	public void setSv(int sv) {
		this.sv = sv;
	}

	public String getExecutor() {
		return executor;
	}

	public void setExecutor(String executor) {
		this.executor = executor;
	}

	public String getExecutor_name() {
		return executor_name;
	}

	public void setExecutor_name(String executor_name) {
		this.executor_name = executor_name;
	}

	public String getExecute_time() {
		return execute_time;
	}

	public void setExecute_time(String execute_time) {
		this.execute_time = execute_time;
	}

    
}
