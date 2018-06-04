/**
 * 文 件 名:  ReportPointSearch.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年11月25日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 上报点位查询bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年11月25日
 */
public class ReportPointSearch extends Page
{
    private static final long serialVersionUID = -510358497158765214L;
    
    private String vendor_id;
    
    private String plan_id;
    
    private String province_id;
    
    private String city_id;
    
    private String rename;
    
    private String point_name;
    
    public String getPoint_name()
    {
        return point_name;
    }
    
    public void setPoint_name(String point_name)
    {
        this.point_name = point_name;
    }
    
    public String getVendor_id()
    {
        return vendor_id;
    }
    
    public void setVendor_id(String vendor_id)
    {
        this.vendor_id = vendor_id;
    }
    
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
    
    public String getRename()
    {
        return rename;
    }
    
    public void setRename(String rename)
    {
        this.rename = rename;
    }
}
