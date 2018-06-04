/**
 * 文 件 名:  ReleaseCalendarBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年8月19日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.util.Date;

/**
 * <pre>
 * 监测排期bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年8月19日
 */
public class MonitorCalendarBean
{
    private String id;
    
    private String plan_id;
    
    private String vendor_id;
    
    private String start_day;
    
    private String end_day;
    
    private String operator;
    
    private Date create_time;
    
    public String getVendor_id()
    {
        return vendor_id;
    }
    
    public void setVendor_id(String vendor_id)
    {
        this.vendor_id = vendor_id;
    }
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getPlan_id()
    {
        return plan_id;
    }
    
    public void setPlan_id(String plan_id)
    {
        this.plan_id = plan_id;
    }
    
    public String getStart_day()
    {
        return start_day;
    }
    
    public void setStart_day(String start_day)
    {
        this.start_day = start_day;
    }
    
    public String getEnd_day()
    {
        return end_day;
    }
    
    public void setEnd_day(String end_day)
    {
        this.end_day = end_day;
    }
    
    public String getOperator()
    {
        return operator;
    }
    
    public void setOperator(String operator)
    {
        this.operator = operator;
    }
    
    public Date getCreate_time()
    {
        return create_time;
    }
    
    public void setCreate_time(Date create_time)
    {
        this.create_time = create_time;
    }
}
