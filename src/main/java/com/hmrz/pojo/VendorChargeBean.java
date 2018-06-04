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
 * 客户申请充值bean
 * </pre>
 * 
 * @author  sandy
 * @data  2016年4月15日
 */
public class VendorChargeBean implements Serializable
{
    private static final long serialVersionUID = 9112742487542677267L;
    
    private String charge_id;
    private String vendor_id;
    private String account;
    private String charge_user;
    private String charge_time;
    private String auditor;
    private String manager_name;
    private String audit_time;
    private String source;
    private String is_success;
    private String remark;
    private String order_num;
    private String alipay_return_status;
    private String vendor_name;
    
	public String getCharge_id() {
		return charge_id;
	}
	public void setCharge_id(String charge_id) {
		this.charge_id = charge_id;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getCharge_user() {
		return charge_user;
	}
	public void setCharge_user(String charge_user) {
		this.charge_user = charge_user;
	}
	public String getCharge_time() {
		return charge_time;
	}
	public void setCharge_time(String charge_time) {
		this.charge_time = charge_time;
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
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getIs_success() {
		return is_success;
	}
	public void setIs_success(String is_success) {
		this.is_success = is_success;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOrder_num() {
		return order_num;
	}
	public void setOrder_num(String order_num) {
		this.order_num = order_num;
	}
	public String getAlipay_return_status() {
		return alipay_return_status;
	}
	public void setAlipay_return_status(String alipay_return_status) {
		this.alipay_return_status = alipay_return_status;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

}
