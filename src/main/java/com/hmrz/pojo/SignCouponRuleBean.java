package com.hmrz.pojo;

public class SignCouponRuleBean {
	
	private String rule_id;
	/**
	 * 签到规则起始天
	 */
	private String b_day;
	/**
	 * 签到规则截止天数
	 */
	private String e_day;
	/**
	 * 券面额
	 */
	private String denomination;
	/**
	 * 有效期天数
	 */
	private String validity_period;
	/**
	 * 使用限制（任务最低金额）
	 */
	private String min_amount;
	/**
	 * 概率（不计算%）
	 */
	private String rate;
	/**
	 * 券面额
	 */
	private String denomination_one;
	/**
	 * 有效期天数
	 */
	private String validity_period_one;
	/**
	 * 使用限制（任务最低金额）
	 */
	private String min_amount_one;
	/**
	 * 概率（不计算%）
	 */
	private String rate_one;
	/**
	 * 创建者
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
	public String getB_day() {
		return b_day;
	}
	public void setB_day(String b_day) {
		this.b_day = b_day;
	}
	public String getE_day() {
		return e_day;
	}
	public void setE_day(String e_day) {
		this.e_day = e_day;
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
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getDenomination_one() {
		return denomination_one;
	}
	public void setDenomination_one(String denomination_one) {
		this.denomination_one = denomination_one;
	}
	public String getValidity_period_one() {
		return validity_period_one;
	}
	public void setValidity_period_one(String validity_period_one) {
		this.validity_period_one = validity_period_one;
	}
	public String getMin_amount_one() {
		return min_amount_one;
	}
	public void setMin_amount_one(String min_amount_one) {
		this.min_amount_one = min_amount_one;
	}
	public String getRate_one() {
		return rate_one;
	}
	public void setRate_one(String rate_one) {
		this.rate_one = rate_one;
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
