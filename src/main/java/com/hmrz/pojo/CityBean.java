package com.hmrz.pojo;

import java.io.Serializable;

/**
 * 城市bean
 * @author yl
 *
 */
public class CityBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4055580284715370868L;

	/**
	 * 州
	 */
	private String state_code;
	
	private String state_name;
	/**
	 * 国家
	 */
	private String national_code;
	private String national_name;
	/**
	 * 省
	 */
	private String province_code;
	private String province_name;
	/**
	 * 市
	 */
	private String city_code;
	private String city_name;
	/**
	 * 区县
	 */
	private String district_code;
	private String district_name;
	/**
	 * 乡镇
	 */
	private String township_code;
	private String township_name;
	
	/**
	 * 城市等级
	 */
	private String city_level;
	
	
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
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getNational_name() {
		return national_name;
	}
	public void setNational_name(String national_name) {
		this.national_name = national_name;
	}
	public String getProvince_name() {
		return province_name;
	}
	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}
	public String getDistrict_name() {
		return district_name;
	}
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	public String getTownship_name() {
		return township_name;
	}
	public void setTownship_name(String township_name) {
		this.township_name = township_name;
	}

}
