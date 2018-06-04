/**
 * 文 件 名:  PlanPointSearch.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年8月19日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 投放计划点位查询
 * </pre>
 * 
 * @author  pfma
 * @data  2016年8月19日
 */
public class PlanPointSearch extends Page
{
    private static final long serialVersionUID = 2188325575055553714L;
    
    private String plan_id;
    
    private String province_id;
    
    private String city_id;
    
    private String is_abnormal;
    
    private String address;
    
    public String getPlan_id()
    {
        return plan_id;
    }
    
    public void setPlan_id(String plan_id)
    {
        this.plan_id = plan_id;
    }
    
    public String getProvince_id()
    {
        return province_id;
    }
    
    public void setProvince_id(String province_id)
    {
        this.province_id = province_id;
    }
    
    public String getCity_id()
    {
        return city_id;
    }
    
    public void setCity_id(String city_id)
    {
        this.city_id = city_id;
    }
    
    public String getIs_abnormal()
    {
        return is_abnormal;
    }
    
    public void setIs_abnormal(String is_abnormal)
    {
        this.is_abnormal = is_abnormal;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
}
