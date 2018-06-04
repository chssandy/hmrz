/**
 * 文 件 名:  VendorProjectSearch.java
 * 描    述:  <商户项目查询bean>
 * 创 建 人:  sandy
 * 创建时间:  2015年5月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 商户项目查询bean
 * </pre>
 * 
 * @author  sandy
 * @data  2015年5月22日
 */
public class VendorProjectSearch extends Page
{
    private static final long serialVersionUID = -1450231905710001482L;
    
    private String vendor_id_search;

    private String project_name_search;
    
    private String project_id_search;
    
    private String serial_number_search;
    
    private String task_biz_search;
    
    private String task_type_search;
    
    private String task_type_id_search;
    
    private String create_btime;
    
    private String create_etime;
    
    private String user_id;
    
    private String remark_search;
    
	public String getProject_name_search() {
		return project_name_search;
	}

	public void setProject_name_search(String project_name_search) {
		this.project_name_search = project_name_search;
	}

	public String getVendor_id_search() {
		return vendor_id_search;
	}

	public void setVendor_id_search(String vendor_id_search) {
		this.vendor_id_search = vendor_id_search;
	}

	public String getTask_biz_search() {
		return task_biz_search;
	}

	public void setTask_biz_search(String task_biz_search) {
		this.task_biz_search = task_biz_search;
	}

	public String getTask_type_search() {
		return task_type_search;
	}

	public void setTask_type_search(String task_type_search) {
		this.task_type_search = task_type_search;
	}

	public String getTask_type_id_search() {
		return task_type_id_search;
	}

	public void setTask_type_id_search(String task_type_id_search) {
		this.task_type_id_search = task_type_id_search;
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

	public String getSerial_number_search() {
		return serial_number_search;
	}

	public void setSerial_number_search(String serial_number_search) {
		this.serial_number_search = serial_number_search;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getProject_id_search() {
		return project_id_search;
	}

	public void setProject_id_search(String project_id_search) {
		this.project_id_search = project_id_search;
	}

	public String getRemark_search() {
		return remark_search;
	}

	public void setRemark_search(String remark_search) {
		this.remark_search = remark_search;
	}

}
