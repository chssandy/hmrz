/**
 * 文  件  名：VendorCost.java
 * 描        述：<描述>
 * 创  建  人：chs_sandy
 * 创建时间：2016年3月29日 下午4:29:00
 * 修改内容：<修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * @pre  $
 * 
 * @author chs_sandy
 * @date  2016年3月29日  下午4:29:00
 */
public class VendorCostBean implements Serializable {

	private static final long serialVersionUID = -1808865352059571066L;
	/**
	 * 主键
	 */
	private String cost_id;
	/**
	 * 客户用户id
	 */
	private String customer_id;
	/**
	 * 客户id
	 */
	private String vendor_id;
	/**
	 * 业务类型   TaskConstants中 BUSINESS_TYPE_
	 */
	private String task_biz;
	/**
	 * 任务类型，三类id
	 */
	private String task_type_id;
	/**
	 * 任务id
	 */
	private String task_id;
	/**
	 * 任务名称
	 */
	private String task_name;
	/**
	 * 创建时间
	 */
	private String create_time;
	/**
	 * 发布前账户金额
	 */
	private String original_balance;
	/**
	 * 任务费用（预付款）
	 */
	private String task_imprest;
	/**
	 * 平台使用费（预付款）
	 */
	private String plat_imprest;
	/**
	 * 任务发布后账户实时余额
	 */
	private String balance;
	/**
	 * 任务实际消费金额
	 */
	private String reality_task_consume;
	/**
	 * 平台实际消费金额
	 */
	private String reality_plat_consume;
	/**
	 * 任务结束时或任务被驳回时企业账户实时余额
	 */
	private String after_balance;
	/**
	 * 结算渠道   0：任务发布被驳回   1：任务结束
	 */
	private String type;
	
	public String getCost_id() {
		return cost_id;
	}
	public void setCost_id(String cost_id) {
		this.cost_id = cost_id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getTask_type_id() {
		return task_type_id;
	}
	public void setTask_type_id(String task_type_id) {
		this.task_type_id = task_type_id;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getOriginal_balance() {
		return original_balance;
	}
	public void setOriginal_balance(String original_balance) {
		this.original_balance = original_balance;
	}
	public String getTask_imprest() {
		return task_imprest;
	}
	public void setTask_imprest(String task_imprest) {
		this.task_imprest = task_imprest;
	}
	public String getPlat_imprest() {
		return plat_imprest;
	}
	public void setPlat_imprest(String plat_imprest) {
		this.plat_imprest = plat_imprest;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getReality_task_consume() {
		return reality_task_consume;
	}
	public void setReality_task_consume(String reality_task_consume) {
		this.reality_task_consume = reality_task_consume;
	}
	public String getReality_plat_consume() {
		return reality_plat_consume;
	}
	public void setReality_plat_consume(String reality_plat_consume) {
		this.reality_plat_consume = reality_plat_consume;
	}
	public String getAfter_balance() {
		return after_balance;
	}
	public void setAfter_balance(String after_balance) {
		this.after_balance = after_balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTask_biz() {
		return task_biz;
	}
	public void setTask_biz(String task_biz) {
		this.task_biz = task_biz;
	}
}
