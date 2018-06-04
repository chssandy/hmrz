/**
 * 文  件  名：BalanceOfPaymentBean.java
 * 描        述：<描述>
 * 创  建  人：chs_sandy
 * 创建时间：2016年4月26日 下午3:57:19
 * 修改内容：<修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * @pre  $
 * 
 * @author chs_sandy
 * @date  2016年4月26日  下午3:57:19
 */
public class UserBalanceOfPaymentBean implements Serializable{

	private static final long serialVersionUID = 7481211382354177645L;
	/**
     * id，主键
     */
	private String user_id;
	/**
     * 手机号
     */
	private String moble;
	/**
     * 昵称
     */
	private String nick_name;
	/**
     * 监测任务收入
     */
	private String monitor_income;
	/**
     * 找媒体收入
     */
	private String media_income;
	/**
     * 商超督查收入
     */
	private String inspecte_income;
	/**
     * 商超采集收入
     */
	private String  collect_income;
	/**
     * 微信分享收入
     */
	private String  sharewx_income;
	/**
     * 调研收入
     */
	private String  survey_income;
	/**
     * 券收入
     */
	private String   coupon_income;
	/**
     * 提现总额
     */
	private String  withdraw_income;
	/**
     * 提现费用
     */
	private String  plat_fee;
	/**
     * 话费充值总额
     */
	private String  recharge_income;
	/**
     * 账户余额
     */
	private String balance;
	/**
	 * 任务总收入
	 */
	private String task_income;
	
	 /**
     * 是否账平（1：是，0：否）
     */
    private String is_balance;
    /**
     * 上报总收入
     */
    private String report_income;
    /**
     * 监播总收入
     */
    private String supervise_income;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
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
	public String getMonitor_income() {
		return monitor_income;
	}
	public void setMonitor_income(String monitor_income) {
		this.monitor_income = monitor_income;
	}
	public String getMedia_income() {
		return media_income;
	}
	public void setMedia_income(String media_income) {
		this.media_income = media_income;
	}
	public String getInspecte_income() {
		return inspecte_income;
	}
	public void setInspecte_income(String inspecte_income) {
		this.inspecte_income = inspecte_income;
	}
	public String getCollect_income() {
		return collect_income;
	}
	public void setCollect_income(String collect_income) {
		this.collect_income = collect_income;
	}
	public String getSharewx_income() {
		return sharewx_income;
	}
	public void setSharewx_income(String sharewx_income) {
		this.sharewx_income = sharewx_income;
	}
	public String getSurvey_income() {
		return survey_income;
	}
	public void setSurvey_income(String survey_income) {
		this.survey_income = survey_income;
	}
	public String getCoupon_income() {
		return coupon_income;
	}
	public void setCoupon_income(String coupon_income) {
		this.coupon_income = coupon_income;
	}
	public String getWithdraw_income() {
		return withdraw_income;
	}
	public void setWithdraw_income(String withdraw_income) {
		this.withdraw_income = withdraw_income;
	}
	public String getPlat_fee() {
		return plat_fee;
	}
	public void setPlat_fee(String plat_fee) {
		this.plat_fee = plat_fee;
	}
	public String getRecharge_income() {
		return recharge_income;
	}
	public void setRecharge_income(String recharge_income) {
		this.recharge_income = recharge_income;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getTask_income() {
		return task_income;
	}
	public void setTask_income(String task_income) {
		this.task_income = task_income;
	}
	public String getIs_balance() {
		return is_balance;
	}
	public void setIs_balance(String is_balance) {
		this.is_balance = is_balance;
	}
	public String getReport_income() {
		return report_income;
	}
	public void setReport_income(String report_income) {
		this.report_income = report_income;
	}
	public String getSupervise_income() {
		return supervise_income;
	}
	public void setSupervise_income(String supervise_income) {
		this.supervise_income = supervise_income;
	}
}
