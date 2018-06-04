package com.hmrz.search;

/**
 * 采集类任务结果查询bean
 * @author sandy
 *
 */
public class MediaResultSearch extends Page
{
    private static final long serialVersionUID = -8646945689695969830L;
    
    private String name;
    
    private String task_id;
    
    private String task_type;
    
    private String customer_id;
    
    private String status;
    
    private String execute_status;
    
    private String execute_id;
    
    private String vendor_id;
    
    private String father_id;
    
    private String vendor_name;
    
    private String is_audit = "0";
    
    private String moble;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public String getTask_type() {
		return task_type;
	}

	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getExecute_id() {
		return execute_id;
	}

	public void setExecute_id(String execute_id) {
		this.execute_id = execute_id;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getFather_id() {
		return father_id;
	}

	public void setFather_id(String father_id) {
		this.father_id = father_id;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public String getIs_audit() {
		return is_audit;
	}

	public void setIs_audit(String is_audit) {
		this.is_audit = is_audit;
	}

	public String getExecute_status() {
		return execute_status;
	}

	public void setExecute_status(String execute_status) {
		this.execute_status = execute_status;
	}

	public String getMoble() {
		return moble;
	}

	public void setMoble(String moble) {
		this.moble = moble;
	}
    
}
