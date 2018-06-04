package com.hmrz.search;

public class CitySearch extends Page {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4330076415590704481L;
	/**
	 * 州
	 */
	private String state_code;
	/**
	 * 国家
	 */
	private String national_code;
	/**
	 * 省
	 */
	private String province_code;
	/**
	 * 市
	 */
	private String city_code;
	/**
	 * 区县
	 */
	private String district_code;
	/**
	 * 乡镇
	 */
	private String township_code;
	/**
	 * 城市等级
	 */
	private String city_level;
	 /** 
	  * 城市名称
	 */
	private String city_name;
	
	public String getState_code() {
		return state_code;
	}
	public void setState_code(String state_code) {
		this.state_code = state_code;
	}
	public String getNational_code() {
		return national_code;
	}
	public void setNational_code(String national_code) {
		this.national_code = national_code;
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
	public String getTownship_code() {
		return township_code;
	}
	public void setTownship_code(String township_code) {
		this.township_code = township_code;
	}
	public String getCity_level() {
		return city_level;
	}
	public void setCity_level(String city_level) {
		this.city_level = city_level;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	
}
