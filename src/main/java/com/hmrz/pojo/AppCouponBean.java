package com.hmrz.pojo;

import java.util.Date;

/**
 * 用户奖券bean
 * @author yl
 *
 */
public class AppCouponBean {
	
	private String coupon_id;
	/**
	 * 面额
	 */
	private String denomination;
	/**
	 * 使用限制（任务最小奖金值）
	 */
	private String min_amount;
	/**
	 * 截止使用有效日期
	 */
	private Date validity_period;
	/***
	 * 券持有人
	 */
	private String user_id;
	/**
	 * 券生成时间
	 */
	private Date create_time;
	/**
	 * 0:签到   1：推荐    2：被推荐
	 */
	private String type;
	/**
	 * 是否被使用   0：没有   1：被使用
	 */
	private String is_used;
	/**
	 * 提价任务id
	 */
	private String task_id;
	/**
	 * 提价任务执行编号
	 */
	private String execute_id;
	/**
	 * 提价任务类型
	 */
	private String task_biz;
	/**
	 * 使用时间
	 */
	private String used_time;
	/**
	 * 用户手机号
	 */
	private String moble;
	/**
	 * 用户昵称
	 */
	private String nick_name;
	/**
	 * 提价任务名称
	 */
	private String task_name;
	/**
	 * 推荐人
	 */
	private String referral;
	/**
	 * 被推荐人
	 */
	private String recommended;
	/**
	 * 签到天数
	 */
	private String continue_days;
	
	public String getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(String coupon_id) {
		this.coupon_id = coupon_id;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public String getMin_amount() {
		return min_amount;
	}
	public void setMin_amount(String min_amount) {
		this.min_amount = min_amount;
	}
	public Date getValidity_period() {
		return validity_period;
	}
	public void setValidity_period(Date validity_period) {
		this.validity_period = validity_period;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIs_used() {
		return is_used;
	}
	public void setIs_used(String is_used) {
		this.is_used = is_used;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public String getExecute_id() {
		return execute_id;
	}
	public void setExecute_id(String execute_id) {
		this.execute_id = execute_id;
	}
	public String getTask_biz() {
		return task_biz;
	}
	public void setTask_biz(String task_biz) {
		this.task_biz = task_biz;
	}
	public String getUsed_time() {
		return used_time;
	}
	public void setUsed_time(String used_time) {
		this.used_time = used_time;
	}
	public String getMoble() {
		return moble;
	}
	public void setMoble(String moble) {
		this.moble = moble;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getReferral() {
		return referral;
	}
	public void setReferral(String referral) {
		this.referral = referral;
	}
	public String getRecommended() {
		return recommended;
	}
	public void setRecommended(String recommended) {
		this.recommended = recommended;
	}
	public String getContinue_days() {
		return continue_days;
	}
	public void setContinue_days(String continue_days) {
		this.continue_days = continue_days;
	}


}
