package com.hmrz.pojo;

public class DBSpaceBean {
	
	/**
	 * 客户点位关联id
	 */
	private String vendor_space_id;
	/**
	 * 点位id
	 */
	private String space_id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 单位名称
	 */
	private String vendor_name;
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
	 * 广告位编号
	 */
	private String number;
	/**
	 * 是否照明  0：否  1：是
	 */
	private String is_illumine;
	/**
	 * 广告归属
	 */
	private String relegation;
	/**
	 * 联系电话
	 */
	private String moble;
	/**
	 * 广告位样图
	 */
	private String imgs;
	/**
	 * 创建时间
	 */
	private String create_time;
	/**
	 * 操作人
	 */
	private String operator;
	/**
	 * 广告牌数量
	 */
	private String ad_count;
	
	public String getProvince_name() {
		return province_name;
	}
	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getDistrict_name() {
		return district_name;
	}
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
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
	public String getProvince_code() {
		return province_code;
	}
	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	public String getDistrict_code() {
		return district_code;
	}
	public void setDistrict_code(String district_code) {
		this.district_code = district_code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLng() {
		return lng == null ? null : lng.trim();
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getLat() {
		return lat == null ? null : lat.trim();
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getIs_illumine() {
		return is_illumine;
	}
	public void setIs_illumine(String is_illumine) {
		this.is_illumine = is_illumine;
	}
	public String getRelegation() {
		return relegation;
	}
	public void setRelegation(String relegation) {
		this.relegation = relegation;
	}
	public String getMoble() {
		return moble;
	}
	public void setMoble(String moble) {
		this.moble = moble;
	}
	public String getImgs() {
		return imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}
	
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getMedia_name() {
		return media_name;
	}
	public void setMedia_name(String media_name) {
		this.media_name = media_name;
	}
	public String getFather_type() {
		return father_type;
	}
	public void setFather_type(String father_type) {
		this.father_type = father_type;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getVendor_space_id() {
		return vendor_space_id;
	}
	public void setVendor_space_id(String vendor_space_id) {
		this.vendor_space_id = vendor_space_id;
	}
	public String getAd_count() {
		return ad_count;
	}
	public void setAd_count(String ad_count) {
		this.ad_count = ad_count;
	}

}
