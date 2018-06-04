/**
 * 文 件 名:  VendorSearch.java
 * 描      述:  客户
 * 创 建 人:  sandy
 * 创建时间:  2016年4月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 客户搜索bean
 * </pre>
 * 
 * @author  sandy
 * @data  2016年4月22日
 */
public class VendorSearch extends Page
{
    private static final long serialVersionUID = 6016288611268119851L;
    
    /**
     * 注册账号
     */
    private String moble; 
    /**
     * 企业名称
     */
    private String vendor_name;
    /**
     * 企业id
     */
    private String vendor_id;
    /**
     * 注册时间段开始
     */
    private String create_btime;
    
    /**
     * 注册时间段结束
     */
    private String create_etime;
    
    private String task_id;
    
    private String task_name;
    
    private String execute_id;

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getMoble() {
		return moble;
	}

	public void setMoble(String moble) {
		this.moble = moble;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public String getCreate_btime() {
		return create_btime;
	}

	public void setCreate_btime(String create_btime) {
		this.create_btime = create_btime;
	}

	public String getCreate_etime() {
		return create_etime;
	}

	public void setCreate_etime(String create_etime) {
		this.create_etime = create_etime;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getExecute_id() {
		return execute_id;
	}

	public void setExecute_id(String execute_id) {
		this.execute_id = execute_id;
	}
}
