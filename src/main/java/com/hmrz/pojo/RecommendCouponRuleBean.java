package com.hmrz.pojo;

public class RecommendCouponRuleBean {
	
	private String rule_id;
	/**
	 * 类型   0：推荐人   1：被推荐人
	 */
	private String type;
	/**
	 * 面额
	 */
	private String denomination;
	/**
	 * 有效期天数限定
	 */
	private String validity_period;
	/**
	 * 使用限制（任务最低金额）
	 */
	private String min_amount;
	/**
	 * 规则创建者
	 */
	private String create_user;
	/**
	 * 创建时间
	 */
	private String create_time;
	
	public String getRule_id() {
		return rule_id;
	}
	public void setRule_id(String rule_id) {
		this.rule_id = rule_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public String getValidity_period() {
		return validity_period;
	}
	public void setValidity_period(String validity_period) {
		this.validity_period = validity_period;
	}
	public String getMin_amount() {
		return min_amount;
	}
	public void setMin_amount(String min_amount) {
		this.min_amount = min_amount;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
 
}
