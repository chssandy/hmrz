package com.hmrz.search;

public class TaskStatisticSearch extends Page {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3544319529340535805L;
	
	private String moble;
	
	private String city_code;
	
	private String credit_min;
	
	private String credit_max;
	
	private String task_type;

	public String getMoble() {
		return moble;
	}

	public void setMoble(String moble) {
		this.moble = moble;
	}

	public String getCity_code() {
		return city_code;
	}

	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}

	public String getCredit_min() {
		return credit_min;
	}

	public void setCredit_min(String credit_min) {
		this.credit_min = credit_min;
	}

	public String getCredit_max() {
		return credit_max;
	}

	public void setCredit_max(String credit_max) {
		this.credit_max = credit_max;
	}

	public String getTask_type() {
		return task_type;
	}

	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}

}
