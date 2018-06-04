/**
 * 文 件 名:  BalanceSearch.java
 * 描      述:  结算
 * 创 建 人:  sandy
 * 创建时间:  2015年6月9日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 服务端结算搜索bean
 * </pre>
 * 
 * @author  sandy
 * @data  2015年6月9日
 */
public class UserBalanceSearch extends Page
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
     * 结算申请人
     */
    private String apply_user_id;
    
    /**
     * 结算申请人实名
     */
    private String apply_user_name;
    
    /**
     *结算操作人 
     */
    private String auditor;
    
    /**
     * 结算申请人昵称
     */
    private String nick_name;
    
    /**
     * 结算申请人手机号
     */
    private String moble;
    
    /**
     * 结算起始日期
     */
    private String audit_btime;
    
    /**
     * 结算结束日期
     */
    private String audit_etime;
    
    /**
     * 结算申请人支付账户
     */
    private String account;
    
    /**
     * 结算状态  0：申请中   1：已结算  2:打款中  3：打款失败
     */
    private String status;
    
    /**
     * 类别   0：提现    1：话费充值
     */
    private String type;
    
    /**
     * 城市所在的省id
     */
    private String province_code;
    
    /**
     * 城市id
     */
    private String city_code;
    
    /**
     * 县/区id
     */
    private String district_code;
    
    public String getProvince_code()
    {
        return province_code;
    }
    
    public void setProvince_code(String province_code)
    {
        this.province_code = province_code;
    }
    
    public String getCity_code()
    {
        return city_code;
    }
    
    public void setCity_code(String city_code)
    {
        this.city_code = city_code;
    }
    
    public String getDistrict_code()
    {
        return district_code;
    }
    
    public void setDistrict_code(String district_code)
    {
        this.district_code = district_code;
    }
    
    public String getApply_btime()
    {
        return apply_btime;
    }
    
    public void setApply_btime(String apply_btime)
    {
        this.apply_btime = apply_btime;
    }
    
    public String getApply_etime()
    {
        return apply_etime;
    }
    
    public void setApply_etime(String apply_etime)
    {
        this.apply_etime = apply_etime;
    }
    
    public String getApply_user_id()
    {
        return apply_user_id;
    }
    
    public void setApply_user_id(String apply_user_id)
    {
        this.apply_user_id = apply_user_id;
    }
    
    public String getApply_user_name()
    {
        return apply_user_name;
    }
    
    public void setApply_user_name(String apply_user_name)
    {
        this.apply_user_name = apply_user_name;
    }
    
    public String getAuditor()
    {
        return auditor;
    }
    
    public void setAuditor(String auditor)
    {
        this.auditor = auditor;
    }
    
    public String getNick_name()
    {
        return nick_name;
    }
    
    public void setNick_name(String nick_name)
    {
        this.nick_name = nick_name;
    }
    
    public String getMoble()
    {
        return moble;
    }
    
    public void setMoble(String moble)
    {
        this.moble = moble;
    }
    
    public String getAudit_btime()
    {
        return audit_btime;
    }
    
    public void setAudit_btime(String audit_btime)
    {
        this.audit_btime = audit_btime;
    }
    
    public String getAudit_etime()
    {
        return audit_etime;
    }
    
    public void setAudit_etime(String audit_etime)
    {
        this.audit_etime = audit_etime;
    }
    
    public String getAccount()
    {
        return account;
    }
    
    public void setAccount(String account)
    {
        this.account = account;
    }
    
    public String getBalance_id()
    {
        return balance_id;
    }
    
    public void setBalance_id(String balance_id)
    {
        this.balance_id = balance_id;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
}
