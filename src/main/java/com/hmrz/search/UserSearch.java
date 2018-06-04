/**
 * 文 件 名:  UserSearch.java
 * 描    述:  <用戶管理>
 * 创 建 人:  sandy
 * 创建时间:  2015年6月2日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 用戶管理bean
 * </pre>
 * 
 * @author  sandy
 * @data  2015年6月2日
 */
public class UserSearch extends Page
{
    private static final long serialVersionUID = -1450231905710001482L;
    
    /**
     * 昵称搜索
     */
    private String nick_name_search;
    
    /**
     * 手机号搜索
     */
    private String moble_search;
    
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
    
    /**
     * 注册天数 开始
     */
    private String registered_days_start;
    
    /**
     * 注册天数 结束
     */
    private String registered_days_end;
    
    /**
     * 离线天数 开始
     */
    private String offline_days_start;
    
    /**
     * 离线天数 结束
     */
    private String offline_days_end;
    
    /**
     * 注册时间开始
     */
    private String create_btime;
    
    /**
     * 注册时间结束
     */
    private String create_etime;
    
    /**
     * 是否授权
     */
    private String is_authorized;
    
    /**
     * 平台  0：android  1：ios
     */
    private String platform;
    
    /**
     * 设备品牌
     */
    private String brand;
    
    private String sideline;
    
    public String getSideline() {
		return sideline;
	}

	public void setSideline(String sideline) {
		this.sideline = sideline;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	private String remark;
    
    public String getBrand()
    {
        return brand;
    }
    
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    
    public String getNick_name_search()
    {
        return nick_name_search;
    }
    
    public void setNick_name_search(String nick_name_search)
    {
        this.nick_name_search = nick_name_search;
    }
    
    public String getMoble_search()
    {
        return moble_search;
    }
    
    public void setMoble_search(String moble_search)
    {
        this.moble_search = moble_search;
    }
    
    public String getCity_code()
    {
        return city_code;
    }
    
    public void setCity_code(String city_code)
    {
        this.city_code = city_code;
    }
    
    public String getProvince_code()
    {
        return province_code;
    }
    
    public void setProvince_code(String province_code)
    {
        this.province_code = province_code;
    }
    
    public String getDistrict_code()
    {
        return district_code;
    }
    
    public void setDistrict_code(String district_code)
    {
        this.district_code = district_code;
    }
    
    public String getRegistered_days_start()
    {
        return registered_days_start;
    }
    
    public void setRegistered_days_start(String registered_days_start)
    {
        this.registered_days_start = registered_days_start;
    }
    
    public String getRegistered_days_end()
    {
        return registered_days_end;
    }
    
    public void setRegistered_days_end(String registered_days_end)
    {
        this.registered_days_end = registered_days_end;
    }
    
    public String getOffline_days_start()
    {
        return offline_days_start;
    }
    
    public void setOffline_days_start(String offline_days_start)
    {
        this.offline_days_start = offline_days_start;
    }
    
    public String getOffline_days_end()
    {
        return offline_days_end;
    }
    
    public void setOffline_days_end(String offline_days_end)
    {
        this.offline_days_end = offline_days_end;
    }
    
    public String getCreate_btime()
    {
        return create_btime;
    }
    
    public void setCreate_btime(String create_btime)
    {
        this.create_btime = create_btime;
    }
    
    public String getCreate_etime()
    {
        return create_etime;
    }
    
    public void setCreate_etime(String create_etime)
    {
        this.create_etime = create_etime;
    }
    
    public String getIs_authorized()
    {
        return is_authorized;
    }
    
    public void setIs_authorized(String is_authorized)
    {
        this.is_authorized = is_authorized;
    }
    
    public String getPlatform()
    {
        return platform;
    }
    
    public void setPlatform(String platform)
    {
        this.platform = platform;
    }
    
}
