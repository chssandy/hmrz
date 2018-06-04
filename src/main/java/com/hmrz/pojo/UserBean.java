/**
 * 文 件 名:  UserBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年11月6日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <pre>
 * 用户bean
 * </pre>
 * 
 * @author  pfma
 * @data  2015年11月6日
 */
public class UserBean implements Serializable
{
    private static final long serialVersionUID = 1038362887501775779L;
    
    private String user_id;
    
    private String moble;
    
    @JSONField(serialize = false)
    private String password;
    
    @JSONField(serialize = false)
    private String password_salt;
    
    private String avatar;
    
    /**
     * 性别  0：男  1：女
     */
    private String sex;
    
    private String email;
    
    private String nick_name;
    
    private String qq;
    
    private Double balance;
    
    private String remark;
    
    /**
     * 注册时间
     */
    private String create_time;
    
    /**
     * 最后使用时间
     */
    private String last_use_time;
    
    /**
     * 账号
     */
    private String account;
    
    /**
     * 支付账号实名
     */
    private String account_name;
    
    /**
     * jpush的推送token
     */
    @JSONField(serialize = false)
    private String registration_id;
    
    /**
     * 对应平台 0：android；1：IOS
     */
    private int platform;
    
    /**
     * 城市
     */
    private String city;
    
    /**
     * 区县
     */
    private String district;
    
    /**
     * 监测  信用分
     */
    private String monitor_credit;
    
    /**
     * 商超督查  信用分
     */
    private String inspecte_credit;
    
    private int monitor_score;
    
    private int inspecte_score;
    
    /**
     * 用户成功登录后的token
     */
    private String token;
    
    private String birthday;
    
    /**
     * 婚姻状况 0:已婚 1:未婚
     */
    private String marital_status;
    
    /**
     * 职业
     */
    private String occupation;
    
    /**
     * 用来修改的新手机号
     */
    @JSONField(serialize = false)
    private String new_moble;
    
    /**
     * 已经申请的任务数
     */
    private int apply_count;
    
    /**
     * 已经完成的任务数
     */
    private int complete_count;
    
    /**
     *兼职经历
     */
    private String sideline;
    
    private String brand;
    
    public String getBrand()
    {
        return brand;
    }
    
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    
    public int getApply_count()
    {
        return apply_count;
    }
    
    public void setApply_count(int apply_count)
    {
        this.apply_count = apply_count;
    }
    
    public int getComplete_count()
    {
        return complete_count;
    }
    
    public void setComplete_count(int complete_count)
    {
        this.complete_count = complete_count;
    }
    
    public String getNew_moble()
    {
        return new_moble;
    }
    
    public void setNew_moble(String new_moble)
    {
        this.new_moble = new_moble;
    }
    
    public String getOccupation()
    {
        return occupation;
    }
    
    public void setOccupation(String occupation)
    {
        this.occupation = occupation;
    }
    
    public String getMarital_status()
    {
        return marital_status;
    }
    
    public void setMarital_status(String marital_status)
    {
        this.marital_status = marital_status;
    }
    
    public String getBirthday()
    {
        return birthday;
    }
    
    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }
    
    public String getToken()
    {
        return token;
    }
    
    public void setToken(String token)
    {
        this.token = token;
    }
    
    public String getRegistration_id()
    {
        return registration_id;
    }
    
    public void setRegistration_id(String registration_id)
    {
        this.registration_id = registration_id;
    }
    
    public int getPlatform()
    {
        return platform;
    }
    
    public void setPlatform(int platform)
    {
        this.platform = platform;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getUser_id()
    {
        return user_id;
    }
    
    public void setUser_id(String user_id)
    {
        this.user_id = user_id;
    }
    
    public String getMoble()
    {
        return moble;
    }
    
    public void setMoble(String moble)
    {
        this.moble = moble;
    }
    
    public String getPassword_salt()
    {
        return password_salt;
    }
    
    public void setPassword_salt(String password_salt)
    {
        this.password_salt = password_salt;
    }
    
    public String getAvatar()
    {
        return avatar;
    }
    
    public void setAvatar(String avatar)
    {
        this.avatar = avatar;
    }
    
    public String getSex()
    {
        return sex;
    }
    
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getNick_name()
    {
        return nick_name;
    }
    
    public void setNick_name(String nick_name)
    {
        this.nick_name = nick_name;
    }
    
    public String getQq()
    {
        return qq;
    }
    
    public void setQq(String qq)
    {
        this.qq = qq;
    }
    
    public String getAccount()
    {
        return account;
    }
    
    public void setAccount(String account)
    {
        this.account = account;
    }
    
    public String getAccount_name()
    {
        return account_name;
    }
    
    public void setAccount_name(String account_name)
    {
        this.account_name = account_name;
    }
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("UserBean [user_id=");
        builder.append(user_id);
        builder.append(", moble=");
        builder.append(moble);
        builder.append(", password_salt=");
        builder.append(password_salt);
        builder.append(", avatar=");
        builder.append(avatar);
        builder.append(", sex=");
        builder.append(sex);
        builder.append(", email=");
        builder.append(email);
        builder.append(", nick_name=");
        builder.append(nick_name);
        builder.append(", qq=");
        builder.append(qq);
        builder.append(", account=");
        builder.append(account);
        builder.append(", account_name=");
        builder.append(account_name);
        builder.append("]");
        return builder.toString();
    }
    
    public String getCreate_time()
    {
        return create_time;
    }
    
    public void setCreate_time(String create_time)
    {
        this.create_time = create_time;
    }
    
    public String getLast_use_time()
    {
        return last_use_time;
    }
    
    public void setLast_use_time(String last_use_time)
    {
        this.last_use_time = last_use_time;
    }
    
    public String getDistrict()
    {
        return district;
    }
    
    public void setDistrict(String district)
    {
        this.district = district;
    }
    
    public Double getBalance()
    {
        return balance;
    }
    
    public void setBalance(Double balance)
    {
        this.balance = balance;
    }
    
    public String getRemark()
    {
        return remark;
    }
    
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
    public int getMonitor_score()
    {
        return monitor_score;
    }
    
    public void setMonitor_score(int monitor_score)
    {
        this.monitor_score = monitor_score;
    }
    
    public int getInspecte_score()
    {
        return inspecte_score;
    }
    
    public void setInspecte_score(int inspecte_score)
    {
        this.inspecte_score = inspecte_score;
    }
    
    public String getSideline()
    {
        return sideline;
    }
    
    public void setSideline(String sideline)
    {
        this.sideline = sideline;
    }
    
    public String getMonitor_credit()
    {
        return monitor_credit;
    }
    
    public void setMonitor_credit(String monitor_credit)
    {
        this.monitor_credit = monitor_credit;
    }
    
    public String getInspecte_credit()
    {
        return inspecte_credit;
    }
    
    public void setInspecte_credit(String inspecte_credit)
    {
        this.inspecte_credit = inspecte_credit;
    }
}
