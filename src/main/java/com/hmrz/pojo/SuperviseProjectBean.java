/**
 * 文  件  名：SuperviseProjectBean.java
 * 描        述：<描述>
 * 创  建  人：chs_sandy
 * 创建时间：2017年4月21日 上午9:34:10
 * 修改内容：<修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * @pre  $
 * 
 * @author chs_sandy
 * @date  2017年4月21日  上午9:34:10
 */
public class SuperviseProjectBean implements Serializable{

	private static final long serialVersionUID = 4836626097579851269L;

	/*
	 * 项目编号
	 */
	private String project_id;
	/*
	 *项目名称
	 */
	private String name;
	/*
	 * 企业编号
	 */
	private String vendor_id;
	/*
	 * 创建企业名称
	 */
	private String vendor_name;
	
	/*
	 * 分派企业名称
	 */
	private String assign_vendor_name;
	/*
	 * 开始时间
	 */
	private String start_time;
	/*
	 * 结束时间
	 */
	private String end_time;
	private String create_time;
	private String create_user;
	private String is_del;
	/*
	 *监播方案点位数量 
	 */
	private int space_nums;
	/*
	 * 监播方案未执行数量
	 */
	private int surplus_space_nums;
	/*
	 * 监播方案已执行数量
	 */
	private int executed_space_nums;
	/*
	 * 状态(受理，执行）
	 */
	private String status;
	/*
	 * 记录编号
	 */
	private String record_id;
	/*
	 * 点位编号
	 */
	private String space_id;
	/*
	 * 方案指派闲侠的费用
	 */
	private String price;
	/*
	 * 执行要求
	 */
	private String descript;
	
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getIs_del() {
		return is_del;
	}
	public void setIs_del(String is_del) {
		this.is_del = is_del;
	}
	public int getSpace_nums() {
		return space_nums;
	}
	public void setSpace_nums(int space_nums) {
		this.space_nums = space_nums;
	}
	public int getSurplus_space_nums() {
		return surplus_space_nums;
	}
	public void setSurplus_space_nums(int surplus_space_nums) {
		this.surplus_space_nums = this.space_nums-this.executed_space_nums;
	}
	public int getExecuted_space_nums() {
		return executed_space_nums;
	}
	public void setExecuted_space_nums(int executed_space_nums) {
		this.executed_space_nums = executed_space_nums;
	}
	public String getAssign_vendor_name() {
		return assign_vendor_name;
	}
	public void setAssign_vendor_name(String assign_vendor_name) {
		this.assign_vendor_name = assign_vendor_name;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getSpace_id() {
		return space_id;
	}
	public void setSpace_id(String space_id) {
		this.space_id = space_id;
	}
	
}
