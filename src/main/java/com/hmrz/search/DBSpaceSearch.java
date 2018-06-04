package com.hmrz.search;

public class DBSpaceSearch extends Page
{
    private static final long serialVersionUID = 1L;
    
    private String lnglat;
    
    private String name;
    
    private String address;
    
    private String province_code;
    
    private String city_code;
    
    private String district_code;
    
    private String type;
    
    private String create_btime;
    
    private String father_type;
    
    private String vendor_id;
    
    private String operator;
    
    private String lng;
    
    private String lat;
    
    /**
     * 查询计划关联点位时需要作为筛选条件
     */
    private String plan_id;
    
    public String getPlan_id()
    {
        return plan_id;
    }
    
    public void setPlan_id(String plan_id)
    {
        this.plan_id = plan_id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
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
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
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
    
    public static long getSerialversionuid()
    {
        return serialVersionUID;
    }
    
    private String create_etime;
    
    public String getLnglat()
    {
        return lnglat;
    }
    
    public void setLnglat(String lnglat)
    {
        this.lnglat = lnglat;
    }
    
    public String getFather_type()
    {
        return father_type;
    }
    
    public void setFather_type(String father_type)
    {
        this.father_type = father_type;
    }
    
    public String getVendor_id()
    {
        return vendor_id;
    }
    
    public void setVendor_id(String vendor_id)
    {
        this.vendor_id = vendor_id;
    }

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}
    
}
