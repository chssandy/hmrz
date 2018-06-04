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
public class VendorProjectTaskSearch extends Page
{
    private static final long serialVersionUID = -1450231905710001482L;
    
    private String project_id_search;

    private String task_name_search;
    
    private String task_id_search;
    
    private String vendor_id_search;
    
    private String status_search ;
    
    private String task_type_search;
    
    private String city_code_search;
    
    private String province_code_search;
    
    private String is_passed_search;
    
    private String user_id_search;
    
    private String task_biz_search;
    /**
     * 业务类型（monitor,media,）
     */
    private String type_search;

	public String getCity_code_search() {
		return city_code_search;
	}

	public void setCity_code_search(String city_code_search) {
		this.city_code_search = city_code_search;
	}

	public String getProvince_code_search() {
		return province_code_search;
	}

	public void setProvince_code_search(String province_code_search) {
		this.province_code_search = province_code_search;
	}

	public String getTask_name_search() {
		return task_name_search;
	}

	public void setTask_name_search(String task_name_search) {
		this.task_name_search = task_name_search;
	}

	public String getTask_id_search() {
		return task_id_search;
	}

	public void setTask_id_search(String task_id_search) {
		this.task_id_search = task_id_search;
	}

	public String getStatus_search() {
		return status_search;
	}

	public void setStatus_search(String status_search) {
		this.status_search = status_search;
	}

	public String getProject_id_search() {
		return project_id_search;
	}

	public void setProject_id_search(String project_id_search) {
		this.project_id_search = project_id_search;
	}

	public String getTask_type_search() {
		return task_type_search;
	}

	public void setTask_type_search(String task_type_search) {
		this.task_type_search = task_type_search;
	}

	public String getIs_passed_search() {
		return is_passed_search;
	}

	public void setIs_passed_search(String is_passed_search) {
		this.is_passed_search = is_passed_search;
	}

	public String getUser_id_search() {
		return user_id_search;
	}

	public void setUser_id_search(String user_id_search) {
		this.user_id_search = user_id_search;
	}

	public String getTask_biz_search() {
		return task_biz_search;
	}

	public void setTask_biz_search(String task_biz_search) {
		this.task_biz_search = task_biz_search;
	}

	public String getType_search() {
		return type_search;
	}

	public void setType_search(String type_search) {
		this.type_search = type_search;
	}

	public String getVendor_id_search() {
		return vendor_id_search;
	}

	public void setVendor_id_search(String vendor_id_search) {
		this.vendor_id_search = vendor_id_search;
	}

}
