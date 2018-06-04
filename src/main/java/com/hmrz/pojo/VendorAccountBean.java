/**
 * 文 件 名:  VendorBean.java
 * 描    述:  商户信息
 * 创 建 人:  sandy
 * 创建时间:  2015年5月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * <商户信息bean>
 * 
 * @author  sandy
 * @data  2015年5月22日
 */
public class VendorAccountBean implements Serializable
{
    private static final long serialVersionUID = 85674617832148982L;
    
    /**
     * id，主键
     */
    private String vendor_id;
    
    /**
     * 商户名称
     */
    private String vendor_name;
    
    /**
     * 联系人
     */
    private String contact_user;
    
    /**
     * 联系人电话
     */
    private String moble;
    
    /**
     * 充值总金额
     */
	private String charge;
	
	/**
     * 奖励总金额
     */
	private String reward;
	/**
     * 支出总金额
     */
	private String consume;
	/**
     * 平台费用总金额
     */
	private String plat_fee;
	
	/**
     * 提现总金额
     */
	private String withdraw;
	/**
     * 提现手续费
     */
	private String handling;
	/**
     * 冻结金额
     */
	private String frozen;
	/**
     * 公司账户余额
     */
    private String balance;
    /**
     * 提现冻结金额
     */
    private String withdraw_frozen;
    /**
     * 是否账平（1：是，0：否）
     */
    private String is_balance;
    
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getContact_user() {
		return contact_user;
	}
	public void setContact_user(String contact_user) {
		this.contact_user = contact_user;
	}
	public String getMoble() {
		return moble;
	}
	public void setMoble(String moble) {
		this.moble = moble;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public String getReward() {
		return reward;
	}
	public void setReward(String reward) {
		this.reward = reward;
	}
	public String getConsume() {
		return consume;
	}
	public void setConsume(String consume) {
		this.consume = consume;
	}
	public String getPlat_fee() {
		return plat_fee;
	}
	public void setPlat_fee(String plat_fee) {
		this.plat_fee = plat_fee;
	}
	public String getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(String withdraw) {
		this.withdraw = withdraw;
	}
	public String getHandling() {
		return handling;
	}
	public void setHanding(String handing) {
		this.handling = handing;
	}
	public String getFrozen() {
		return frozen;
	}
	public void setFrozen(String frozen) {
		this.frozen = frozen;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getWithdraw_frozen() {
		return withdraw_frozen;
	}
	public void setWithdraw_frozen(String withdraw_frozen) {
		this.withdraw_frozen = withdraw_frozen;
	}
	public String getIs_balance() {
		return is_balance;
	}
	public void setIs_balance(String is_balance) {
		this.is_balance = is_balance;
	}
	
    
	
}
