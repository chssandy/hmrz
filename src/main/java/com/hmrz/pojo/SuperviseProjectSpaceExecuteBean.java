package com.hmrz.pojo;

import java.io.Serializable;

public class SuperviseProjectSpaceExecuteBean implements Serializable{
		
	private static final long serialVersionUID = -2181727514726263344L;

	
	/**
	 * 执行编号
	 */
	private String execute_id;
	
	/**
	 * 监播方案拥有点位主键
	 */
	private String task_id;
	
	private String project_id;
	
	private String supervise_content;
	/**
	 * 监播主体形式
	 */
	private int supervisor_type;
	/**
	 * 单价
	 */
	private String price;
	/**
	 * 点位id
	 */
	private String space_id;
	/**
	 * 点位名称
	 */
	private String name;
	/**
	 * 单位名称
	 */
	private String vendor_name;
	/*
	 *项目名称
	 */
	private String project_name;
	/*
	 * 分派企业名称
	 */
	private String assign_vendor_name;
	/**
	 * 省
	 */
	private String province_code;
	/**
	 * 省名
	 */
	private String province_name;
	/**
	 * 市
	 */
	private String city_code;
	/**
	 * 市名
	 */
	private String city_name;
	/**
	 * 区
	 */
	private String district_code;
	/**
	 * 区名
	 */
	private String district_name;
	/**
	 * 媒体类型（二级）
	 */
	private String type;
	/**
	 * 媒体类型（一级）
	 */
	private String father_type;
	/**
	 * 媒体类型名称
	 */
	private String media_name;
	/**
	 * 经度
	 */
	private String lng;
	/**
	 * 纬度
	 */
	private String lat;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 展现形式
	 */
	private String show_type;
	/**
	 * 广告位位置
	 */
	private String position;

	/**
	 * 广告位监播图片
	 */
	private String imgs;
	/**
	 * 创建时间
	 */
	private String execute_time;
	
	/**
	 * 执行人
	 */
	private String executor;
	
	/**
	 * 执行人id
	 */
	private String user_id;
	
	/**
	 * 点位监播状态
	 */
	private String status;
	/**
	 * 分派记录编号
	 */
	private String record_id;
	
	/**
	 * 监播开始时间
	 */
	private String start_time;
	
	/**
	 * 监播结束时间
	 */
	private String end_time;
	
	/**
	 * 监播要求
	 */
	private String descript;
	
	
	public String getExecute_id() {
		return execute_id;
	}
	public void setExecute_id(String execute_id) {
		this.execute_id = execute_id;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	public String getSupervise_content() {
		return supervise_content;
	}
	public void setSupervise_content(String supervise_content) {
		this.supervise_content = supervise_content;
	}
	public int getSupervisor_type() {
		return supervisor_type;
	}
	public void setSupervisor_type(int supervisor_type) {
		this.supervisor_type = supervisor_type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSpace_id() {
		return space_id;
	}
	public void setSpace_id(String space_id) {
		this.space_id = space_id;
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
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getAssign_vendor_name() {
		return assign_vendor_name;
	}
	public void setAssign_vendor_name(String assign_vendor_name) {
		this.assign_vendor_name = assign_vendor_name;
	}
	public String getProvince_code() {
		return province_code;
	}
	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}
	public String getProvince_name() {
		return province_name;
	}
	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getDistrict_code() {
		return district_code;
	}
	public void setDistrict_code(String district_code) {
		this.district_code = district_code;
	}
	public String getDistrict_name() {
		return district_name;
	}
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFather_type() {
		return father_type;
	}
	public void setFather_type(String father_type) {
		this.father_type = father_type;
	}
	public String getMedia_name() {
		return media_name;
	}
	public void setMedia_name(String media_name) {
		this.media_name = media_name;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getShow_type() {
		return show_type;
	}
	public void setShow_type(String show_type) {
		this.show_type = show_type;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getImgs() {
		return imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}
	public String getExecutor() {
		return executor;
	}
	public void setExecutor(String executor) {
		this.executor = executor;
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
	public String getExecute_time() {
		return execute_time;
	}
	public void setExecute_time(String execute_time) {
		this.execute_time = execute_time;
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
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	

}
