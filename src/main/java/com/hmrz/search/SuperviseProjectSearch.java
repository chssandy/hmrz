/**
 * 文  件  名：SuperviseProjectSearch.java
 * 描        述：<描述>
 * 创  建  人：chs_sandy
 * 创建时间：2017年4月21日 上午9:33:20
 * 修改内容：<修改内容>
 */
package com.hmrz.search;

/**
 * @pre  $
 * 
 * @author chs_sandy
 * @date  2017年4月21日  上午9:33:20
 */
public class SuperviseProjectSearch extends Page{

	private static final long serialVersionUID = 214017580092068373L;

	private String vendor_name;
	
	private String project_name;
	
	private String project_id;
	
	private String create_btime;
	
	private String create_etime;
	
	private String status;
	
	private String record_id;
	
	private String havePrice;
	
	private String space_name;

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRecord_id() {
		return record_id;
	}

	public void setRecord_id(String record_id) {
		this.record_id = record_id;
	}

	public String getHavePrice() {
		return havePrice;
	}

	public void setHavePrice(String havePrice) {
		this.havePrice = havePrice;
	}

	public String getSpace_name() {
		return space_name;
	}

	public void setSpace_name(String space_name) {
		this.space_name = space_name;
	}
	
}
