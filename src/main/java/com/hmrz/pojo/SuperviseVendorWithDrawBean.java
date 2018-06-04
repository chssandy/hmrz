/**
 * 文 件 名:  VendorWithDrawBean.java
 * 描    述:   结算
 * 创 建 人:  sandy
 * 创建时间:  2017年4月15日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * <pre>
 * 监播客户申请提现结算bean
 * </pre>
 * 
 * @author  sandy
 * @data  2017年4月15日
 */
public class SuperviseVendorWithDrawBean implements Serializable
{
    private static final long serialVersionUID = 9112742487542677267L;
    
    private String withdraw_id;
    
    private String withdraw_user;
    
    private String withdraw_user_moble;
    
    private String vendor_id;
    
    private String vendor_name;
    
    private String alipay_account;
    
    private String alipay_name;
    
    private String amount;
    private String handling_fee;
    
    private String withdraw_time;
    
    private String contact;
    private String phone;
    private String remark;
    
    private String auditor;
    private String audit_time;
    private String status;
	public String getWithdraw_id() {
		return withdraw_id;
	}
	public void setWithdraw_id(String withdraw_id) {
		this.withdraw_id = withdraw_id;
	}
	public String getWithdraw_user() {
		return withdraw_user;
	}
	public void setWithdraw_user(String withdraw_user) {
		this.withdraw_user = withdraw_user;
	}
	public String getWithdraw_user_moble() {
		return withdraw_user_moble;
	}
	public void setWithdraw_user_moble(String withdraw_user_moble) {
		this.withdraw_user_moble = withdraw_user_moble;
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
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getHandling_fee() {
		return handling_fee;
	}
	public void setHandling_fee(String handling_fee) {
		this.handling_fee = handling_fee;
	}
	public String getWithdraw_time() {
		return withdraw_time;
	}
	public void setWithdraw_time(String withdraw_time) {
		this.withdraw_time = withdraw_time;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SuperviseVendorWithDrawBean [");
		if (withdraw_id != null) {
			builder.append("withdraw_id=");
			builder.append(withdraw_id);
			builder.append(", ");
		}
		if (withdraw_user != null) {
			builder.append("withdraw_user=");
			builder.append(withdraw_user);
			builder.append(", ");
		}
		if (withdraw_user_moble != null) {
			builder.append("withdraw_user_moble=");
			builder.append(withdraw_user_moble);
			builder.append(", ");
		}
		if (vendor_id != null) {
			builder.append("vendor_id=");
			builder.append(vendor_id);
			builder.append(", ");
		}
		if (vendor_name != null) {
			builder.append("vendor_name=");
			builder.append(vendor_name);
			builder.append(", ");
		}
		if (alipay_account != null) {
			builder.append("alipay_account=");
			builder.append(alipay_account);
			builder.append(", ");
		}
		if (alipay_name != null) {
			builder.append("alipay_name=");
			builder.append(alipay_name);
			builder.append(", ");
		}
		if (amount != null) {
			builder.append("amount=");
			builder.append(amount);
			builder.append(", ");
		}
		if (handling_fee != null) {
			builder.append("handling_fee=");
			builder.append(handling_fee);
			builder.append(", ");
		}
		if (withdraw_time != null) {
			builder.append("withdraw_time=");
			builder.append(withdraw_time);
			builder.append(", ");
		}
		if (contact != null) {
			builder.append("contact=");
			builder.append(contact);
			builder.append(", ");
		}
		if (phone != null) {
			builder.append("phone=");
			builder.append(phone);
			builder.append(", ");
		}
		if (remark != null) {
			builder.append("remark=");
			builder.append(remark);
			builder.append(", ");
		}
		if (auditor != null) {
			builder.append("auditor=");
			builder.append(auditor);
			builder.append(", ");
		}
		if (audit_time != null) {
			builder.append("audit_time=");
			builder.append(audit_time);
			builder.append(", ");
		}
		if (status != null) {
			builder.append("status=");
			builder.append(status);
		}
		builder.append("]");
		return builder.toString();
	}
    
}
