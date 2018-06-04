package com.hmrz.pojo;

public class DBMediaBean {
	
	private String media_type_id;
	/**
	 * 类型名称
	 */
	private String name;
	/**
	 * 父级id
	 */
	private String father_id;
	/**
	 * 级别
	 */
	private String level;
	
	public String getMedia_type_id() {
		return media_type_id;
	}
	public void setMedia_type_id(String media_type_id) {
		this.media_type_id = media_type_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather_id() {
		return father_id;
	}
	public void setFather_id(String father_id) {
		this.father_id = father_id;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

}
