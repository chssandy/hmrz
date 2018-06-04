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
 * 监播客户申请充值bean
 * </pre>
 * 
 * @author  sandy
 * @data  2017年4月15日
 */
public class SuperviseVendorChargeBean implements Serializable
{
    private static final long serialVersionUID = 9112742487542677267L;
    
    private String charge_id;
    private String vendor_id;
    private String vendor_name;
    private String pay_no;
    private String amount;
    private String create_user;
    private String create_time;
    private String update_user;
    private String update_time;
    private String status;
    private String remark;
    private String source;
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
	public String getPay_no() {
		return pay_no;
	}
	public void setPay_no(String pay_no) {
		this.pay_no = pay_no;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getUpdate_user() {
		return update_user;
	}
	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SuperviseVendorChargeBean [");
		if (charge_id != null) {
			builder.append("charge_id=");
			builder.append(charge_id);
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
		if (pay_no != null) {
			builder.append("pay_no=");
			builder.append(pay_no);
			builder.append(", ");
		}
		if (amount != null) {
			builder.append("amount=");
			builder.append(amount);
			builder.append(", ");
		}
		if (create_user != null) {
			builder.append("create_user=");
			builder.append(create_user);
			builder.append(", ");
		}
		if (create_time != null) {
			builder.append("create_time=");
			builder.append(create_time);
			builder.append(", ");
		}
		if (update_user != null) {
			builder.append("update_user=");
			builder.append(update_user);
			builder.append(", ");
		}
		if (update_time != null) {
			builder.append("update_time=");
			builder.append(update_time);
			builder.append(", ");
		}
		if (status != null) {
			builder.append("status=");
			builder.append(status);
			builder.append(", ");
		}
		if (remark != null) {
			builder.append("remark=");
			builder.append(remark);
			builder.append(", ");
		}
		if (source != null) {
			builder.append("source=");
			builder.append(source);
		}
		builder.append("]");
		return builder.toString();
	}
    
}
