package com.hmrz.pojo;

public class DBIllegalBean {
	
	private String record_illegal_id;
	
	private String record_id;
	/**
	 * 违法程度
	 */
	private String illegal_level;
	
	/**
	 * 违法行为代码
	 */
	private String illegal_code;
	
	private String create_time;
	
	public String getRecord_illegal_id() {
		return record_illegal_id;
	}

	public void setRecord_illegal_id(String record_illegal_id) {
		this.record_illegal_id = record_illegal_id;
	}

	public String getRecord_id() {
		return record_id;
	}

	public void setRecord_id(String record_id) {
		this.record_id = record_id;
	}

	public String getIllegal_level() {
		return illegal_level;
	}

	public void setIllegal_level(String illegal_level) {
		this.illegal_level = illegal_level;
	}

	public String getIllegal_code() {
		return illegal_code;
	}

	public void setIllegal_code(String illegal_code) {
		this.illegal_code = illegal_code;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
}
