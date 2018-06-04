/**
 * 文 件 名:  VendorWithDrawSearch.java
 * 描      述:  客户提现申请
 * 创 建 人:  sandy
 * 创建时间:  2016年4月15日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 监播客户充值申请搜索bean
 * </pre>
 * 
 * @author  sandy
 * @data  2016年4月15日
 */
public class SuperviseVendorChargeSearch extends Page
{
    private static final long serialVersionUID = 6016288611268119851L;
    
    /**
     * 充值申请id
     */
    private String charge_id; 
    /**
     * 商户id
     */
    private String vendor_id;
    /**
     * 充值订单号，流水号
     */
    private String pay_no;
    /**
     * 充值金额
     */
    private String amount;
    /**
     * 充值来源
     */
    private String source;
    /**
     * 结算申请时间段开始
     */
    private String apply_btime;
    
    /**
     * 结算申请时间段结束
     */
    private String apply_etime;
    /**
     * 结算申请人手机号
     */
    private String  moble;
    
    /**
     * 结算状态  0：申请中   1：已结算  2:打款中  3：打款失败
     */
    private String status;
    
    /**
     * 结算申请处理时间段开始
     */
    private String audit_btime;
    
    /**
     * 结算申请处理时间段结束
     */
    private String audit_etime;
    /**
     * 管理员
     */
    private String auditor;
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
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getApply_btime() {
		return apply_btime;
	}
	public void setApply_btime(String apply_btime) {
		this.apply_btime = apply_btime;
	}
	public String getApply_etime() {
		return apply_etime;
	}
	public void setApply_etime(String apply_etime) {
		this.apply_etime = apply_etime;
	}
	public String getMoble() {
		return moble;
	}
	public void setMoble(String moble) {
		this.moble = moble;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAudit_btime() {
		return audit_btime;
	}
	public void setAudit_btime(String audit_btime) {
		this.audit_btime = audit_btime;
	}
	public String getAudit_etime() {
		return audit_etime;
	}
	public void setAudit_etime(String audit_etime) {
		this.audit_etime = audit_etime;
	}
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SuperviseVendorChargeSearch [");
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
		if (source != null) {
			builder.append("source=");
			builder.append(source);
			builder.append(", ");
		}
		if (apply_btime != null) {
			builder.append("apply_btime=");
			builder.append(apply_btime);
			builder.append(", ");
		}
		if (apply_etime != null) {
			builder.append("apply_etime=");
			builder.append(apply_etime);
			builder.append(", ");
		}
		if (moble != null) {
			builder.append("moble=");
			builder.append(moble);
			builder.append(", ");
		}
		if (status != null) {
			builder.append("status=");
			builder.append(status);
			builder.append(", ");
		}
		if (audit_btime != null) {
			builder.append("audit_btime=");
			builder.append(audit_btime);
			builder.append(", ");
		}
		if (audit_etime != null) {
			builder.append("audit_etime=");
			builder.append(audit_etime);
			builder.append(", ");
		}
		if (auditor != null) {
			builder.append("auditor=");
			builder.append(auditor);
		}
		builder.append("]");
		return builder.toString();
	}
    
}
