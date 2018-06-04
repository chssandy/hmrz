/**
 * 文 件 名:  VendorWithDrawBean.java
 * 描    述:   结算
 * 创 建 人:  sandy
 * 创建时间:  2016年4月15日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * <pre>
 * 服务端客户申请提现充值结算bean
 * </pre>
 * 
 * @author  sandy
 * @data  2016年4月15日
 */
public class VendorWithDrawBean implements Serializable
{
    private static final long serialVersionUID = 9112742487542677267L;
    
    private String balance_id;
    
    private String balance_user;
    
    private String balance_user_moble;
    
    private String vendor_id;
    
    private String vendor_name;
    
    private String alipay_account;
    private String alipay_name;
    private String withdraw_num;
    private String handling_charge;
    private String withdraw_time;
    private String linkman;
    private String linkphone;
    private String remark;
    private String auditor;
    private String audit_time;
    private String status;
	public String getBalance_id() {
		return balance_id;
	}
	public void setBalance_id(String balance_id) {
		this.balance_id = balance_id;
	}
	public String getBalance_user() {
		return balance_user;
	}
	public void setBalance_user(String balance_user) {
		this.balance_user = balance_user;
	}
	public String getBalance_user_moble() {
		return balance_user_moble;
	}
	public void setBalance_user_moble(String balance_user_moble) {
		this.balance_user_moble = balance_user_moble;
	}
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
	public String getAlipay_account() {
		return alipay_account;
	}
	public void setAlipay_account(String alipay_account) {
		this.alipay_account = alipay_account;
	}
	public String getAlipay_name() {
		return alipay_name;
	}
	public void setAlipay_name(String alipay_name) {
		this.alipay_name = alipay_name;
	}
	public String getWithdraw_num() {
		return withdraw_num;
	}
	public void setWithdraw_num(String withdraw_num) {
		this.withdraw_num = withdraw_num;
	}
	public String getHandling_charge() {
		return handling_charge;
	}
	public void setHandling_charge(String handling_charge) {
		this.handling_charge = handling_charge;
	}
	public String getWithdraw_time() {
		return withdraw_time;
	}
	public void setWithdraw_time(String withdraw_time) {
		this.withdraw_time = withdraw_time;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	public String getLinkphone() {
		return linkphone;
	}
	public void setLinkphone(String linkphone) {
		this.linkphone = linkphone;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}
	public String getAudit_time() {
		return audit_time;
	}
	public void setAudit_time(String audit_time) {
		this.audit_time = audit_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
}
