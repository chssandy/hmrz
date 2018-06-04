package com.hmrz.pojo;

public class HomepageCityBean {
	
	private String homepage_city_id;
	
	private String homepage_id;
	
	private String city_code;
	
	private String city_level;
	
	private String show_btime;
	
	private String show_etime;

	public String getHomepage_city_id() {
		return homepage_city_id;
	}

	public void setHomepage_city_id(String homepage_city_id) {
		this.homepage_city_id = homepage_city_id;
	}

	public String getHomepage_id() {
		return homepage_id;
	}

	public void setHomepage_id(String homepage_id) {
		this.homepage_id = homepage_id;
	}

	public String getCity_code() {
		return city_code;
	}

	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}

	public String getCity_level() {
		return city_level;
	}

	public void setCity_level(String city_level) {
		this.city_level = city_level;
	}

	public String getShow_btime() {
		return show_btime;
	}

	public void setShow_btime(String show_btime) {
		this.show_btime = show_btime;
	}

	public String getShow_etime() {
		return show_etime;
	}

	public void setShow_etime(String show_etime) {
		this.show_etime = show_etime + " 23:59:59";
	}

}
