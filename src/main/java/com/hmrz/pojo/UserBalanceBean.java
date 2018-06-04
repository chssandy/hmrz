/**
 * 文 件 名:  BalanceBean.java
 * 描    述:   结算
 * 创 建 人:  sandy
 * 创建时间:  2015年6月9日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * <pre>
 * 服务端用户申请提现充值结算bean
 * </pre>
 * 
 * @author  sandy
 * @data  2015年6月9日
 */
public class UserBalanceBean implements Serializable
{
    private static final long serialVersionUID = 9112742487542677267L;
    
    private String balance_id;
    
    /**
     * 申请用户昵称
     */
    private String nick_name;
    
    /**
     * 申请用户手机
     */
    private String moble;
    
    /**
     * 充值手机号
     */
    private String charge_moble;
    
    /**
     * 支付账户
     */
    private String balance_account;
    
    /**
     * 支付账户实名
     */
    private String balance_user;
    
    /**
     * 申请结算金额
     */
    private String balance_num;
    
    /**
     * 手续费
     */
    private String handling_charge;
    
    /**
     * 账户余额
     */
    private String balance_residue;
    
    /**
     * 申请时间
     */
    private String balance_time;
    
    /**
     * 支付操作人
     */
    private String auditor;
    
    /**
     * 审核时间(支付确认时间)
     */
    private String audit_time;
    
    /**
     * 类别 0：提现   1：话费充值
     */
    private String type;
    
    /**
     * 状态  0：申请中  1：已打款  2：大款中  3：打款失败
     */
    private String status;
    
    /**
     * 城市
     */
    private String city;
    
    /**
     * 区县
     */
    private String district;
    
    public String getCity()
    {
        return city;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public String getDistrict()
    {
        return district;
    }
    
    public void setDistrict(String district)
    {
        this.district = district;
    }
    
    public String getBalance_id()
    {
        return balance_id;
    }
    
    public void setBalance_id(String balance_id)
    {
        this.balance_id = balance_id;
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
    
    public String getBalance_account()
    {
        return balance_account;
    }
    
    public void setBalance_account(String balance_account)
    {
        this.balance_account = balance_account;
    }
    
    public String getBalance_user()
    {
        return balance_user;
    }
    
    public void setBalance_user(String balance_user)
    {
        this.balance_user = balance_user;
    }
    
    public String getBalance_num()
    {
        return balance_num;
    }
    
    public void setBalance_num(String balance_num)
    {
        this.balance_num = balance_num;
    }
    
    public String getBalance_residue()
    {
        return balance_residue;
    }
    
    public void setBalance_residue(String balance_residue)
    {
        this.balance_residue = balance_residue;
    }
    
    public String getBalance_time()
    {
        return balance_time;
    }
    
    public void setBalance_time(String balance_time)
    {
        this.balance_time = balance_time;
    }
    
    public String getAuditor()
    {
        return auditor;
    }
    
    public void setAuditor(String auditor)
    {
        this.auditor = auditor;
    }
    
    public String getAudit_time()
    {
        return audit_time;
    }
    
    public void setAudit_time(String audit_time)
    {
        this.audit_time = audit_time;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BalanceBean [");
        if (balance_id != null)
        {
            builder.append("balance_id=");
            builder.append(balance_id);
            builder.append(", ");
        }
        if (nick_name != null)
        {
            builder.append("nick_name=");
            builder.append(nick_name);
            builder.append(", ");
        }
        if (moble != null)
        {
            builder.append("moble=");
            builder.append(moble);
            builder.append(", ");
        }
        if (balance_account != null)
        {
            builder.append("balance_account=");
            builder.append(balance_account);
            builder.append(", ");
        }
        if (balance_user != null)
        {
            builder.append("balance_user=");
            builder.append(balance_user);
            builder.append(", ");
        }
        if (balance_num != null)
        {
            builder.append("balance_num=");
            builder.append(balance_num);
            builder.append(", ");
        }
        if (balance_residue != null)
        {
            builder.append("balance_residue=");
            builder.append(balance_residue);
            builder.append(", ");
        }
        if (balance_time != null)
        {
            builder.append("balance_time=");
            builder.append(balance_time);
            builder.append(", ");
        }
        if (auditor != null)
        {
            builder.append("auditor=");
            builder.append(auditor);
            builder.append(", ");
        }
        if (audit_time != null)
        {
            builder.append("audit_time=");
            builder.append(audit_time);
            builder.append(", ");
        }
        if (status != null)
        {
            builder.append("status=");
            builder.append(status);
        }
        builder.append("]");
        return builder.toString();
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public String getHandling_charge()
    {
        return handling_charge;
    }
    
    public void setHandling_charge(String handling_charge)
    {
        this.handling_charge = handling_charge;
    }
    
    public String getCharge_moble()
    {
        return charge_moble;
    }
    
    public void setCharge_moble(String charge_moble)
    {
        this.charge_moble = charge_moble;
    }
}
