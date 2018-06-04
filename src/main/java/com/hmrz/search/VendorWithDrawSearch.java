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
 * 客户提现申请搜索bean
 * </pre>
 * 
 * @author  sandy
 * @data  2016年4月15日
 */
public class VendorWithDrawSearch extends Page
{
    private static final long serialVersionUID = 6016288611268119851L;
    
    /**
     * 结算申请id
     */
    private String balance_id; 
    
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

	public String getBalance_id() {
		return balance_id;
	}

	public void setBalance_id(String balance_id) {
		this.balance_id = balance_id;
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
    
}
