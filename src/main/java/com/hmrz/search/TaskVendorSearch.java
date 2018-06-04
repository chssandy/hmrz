package com.hmrz.search;

/**
 * 商超采集任务查询bean
 * @author sandy
 *
 */
public class TaskVendorSearch extends Page
{
    private static final long serialVersionUID = -8646945689695969830L;
    
    private String task_id;
    /**
     * 业务类型 （TaskConstants 中TASK_BIZ_
     */
    private String type;
    
    /**
     * 业务类型  （TaskConstants 中 BUSINESS_TYPE_）
     */
    private String task_biz;
    
    private String customer_id;
    
    private String vendor_id;

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getTask_biz() {
		return task_biz;
	}

	public void setTask_biz(String task_biz) {
		this.task_biz = task_biz;
	}
    
}
