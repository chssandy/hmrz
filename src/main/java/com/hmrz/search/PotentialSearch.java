/**
 * 文 件 名:  PotentialSearch.java
 * 描    述:  <描述>
 * 创 建 人:  sandy
 * 创建时间:  2015年7月28日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 潜在用户搜索bean
 * </pre>
 * 
 * @author  sandy
 * @data  2015年7月28日
 */
public class PotentialSearch extends Page
{
    private static final long serialVersionUID = -2780259645825378167L;
    
    private String name;
    
    private String moble;
    
    private String qq;
    
    private String province_code;
    
    private String city_code;
    
    private String district_code;
    
    private String date_start;
    
    private String date_end;
    
    /**
     * 排序字段
     */
    private String sidx;
    
    /**
     * 排序，asc：desc
     */
    private String sord;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoble() {
		return moble;
	}

	public void setMoble(String moble) {
		this.moble = moble;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getProvince_code() {
		return province_code;
	}

	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}

	public String getCity_code() {
		return city_code;
	}

	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}

	public String getDistrict_code() {
		return district_code;
	}

	public void setDistrict_code(String district_code) {
		this.district_code = district_code;
	}

	public String getDate_start() {
		return date_start;
	}

	public void setDate_start(String date_start) {
		this.date_start = date_start;
	}

	public String getDate_end() {
		return date_end;
	}

	public void setDate_end(String date_end) {
		this.date_end = date_end;
	}
    
	public String getSidx()
    {
        return sidx;
    }
    
    public void setSidx(String sidx)
    {
        this.sidx = sidx;
    }
    
    public String getSord()
    {
        return sord;
    }
    
    public void setSord(String sord)
    {
        this.sord = sord;
    }
}
