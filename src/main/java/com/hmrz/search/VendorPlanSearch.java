/**
 * 文 件 名:  VendorPlanSearch.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年8月18日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 企业投放计划查询bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年8月18日
 */
public class VendorPlanSearch extends Page
{
    private static final long serialVersionUID = -1964704708136373379L;
    
    private String vendor_id;
    
    private String name;
    
    private String create_btime;
    
    private String create_etime;
    
    public String getVendor_id()
    {
        return vendor_id;
    }
    
    public void setVendor_id(String vendor_id)
    {
        this.vendor_id = vendor_id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
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
}
