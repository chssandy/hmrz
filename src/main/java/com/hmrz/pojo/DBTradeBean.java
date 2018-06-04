package com.hmrz.pojo;

public class DBTradeBean {
	
	private String trade_type_id;
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
	public String getTrade_type_id() {
		return trade_type_id;
	}
	public void setTrade_type_id(String trade_type_id) {
		this.trade_type_id = trade_type_id;
	}

}
