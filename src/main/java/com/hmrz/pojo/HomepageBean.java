package com.hmrz.pojo;

import java.util.List;

public class HomepageBean {
	
	private String  homepage_id;
	
	private String name;
	
	private String img_url;
	
	private String link_url;
	
	private String section_limit;
	
	private String expose_times;
	
	private String valid_expose_times;
	
	private String click_times;
	
	private String valid_click_times;
	
	private String create_time;
	
	private String status;
	
	private List<HomepageCityBean> cityList;
	
	public String getHomepage_id() {
		return homepage_id;
	}

	public void setHomepage_id(String homepage_id) {
		this.homepage_id = homepage_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String getLink_url() {
		return link_url;
	}

	public void setLink_url(String link_url) {
		this.link_url = link_url;
	}

	public String getSection_limit() {
		return section_limit;
	}

	public void setSection_limit(String section_limit) {
		this.section_limit = section_limit;
	}

	public String getExpose_times() {
		return expose_times;
	}

	public void setExpose_times(String expose_times) {
		this.expose_times = expose_times;
	}

	public String getValid_expose_times() {
		return valid_expose_times;
	}

	public void setValid_expose_times(String valid_expose_times) {
		this.valid_expose_times = valid_expose_times;
	}

	public String getClick_times() {
		return click_times;
	}

	public void setClick_times(String click_times) {
		this.click_times = click_times;
	}

	public String getValid_click_times() {
		return valid_click_times;
	}

	public void setValid_click_times(String valid_click_times) {
		this.valid_click_times = valid_click_times;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIs_del() {
		return is_del;
	}

	public void setIs_del(String is_del) {
		this.is_del = is_del;
	}

	public List<HomepageCityBean> getCityList() {
		return cityList;
	}

	public void setCityList(List<HomepageCityBean> cityList) {
		this.cityList = cityList;
	}

	private String is_del;

}
