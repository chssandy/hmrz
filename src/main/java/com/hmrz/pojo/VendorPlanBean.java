/**
 * 文 件 名:  VendorPlanBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年8月18日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <pre>
 * 企业投放计划bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年8月18日
 */
public class VendorPlanBean
{
    private String id;
    
    private String vendor_id;
    
    private String name;
    
    /**
     * 关联点位数目
     */
    private int point_nums;
    
    /**
     * 实行监测点位数目
     */
    private int monitor_point_nums;
    
    /**
     * 总执行监测次数
     */
    private int total_monitor_nums;
    
    /**
     * 异常点位数目
     */
    private int abnormal_point_nums;
    
    private Date create_time;
    
    @JSONField(serialize = false)
    private String update_user;
    
    public Date getCreate_time()
    {
        return create_time;
    }
    
    public void setCreate_time(Date create_time)
    {
        this.create_time = create_time;
    }
    
    public int getPoint_nums()
    {
        return point_nums;
    }
    
    public void setPoint_nums(int point_nums)
    {
        this.point_nums = point_nums;
    }
    
    public int getMonitor_point_nums()
    {
        return monitor_point_nums;
    }
    
    public void setMonitor_point_nums(int monitor_point_nums)
    {
        this.monitor_point_nums = monitor_point_nums;
    }
    
    public int getTotal_monitor_nums()
    {
        return total_monitor_nums;
    }
    
    public void setTotal_monitor_nums(int total_monitor_nums)
    {
        this.total_monitor_nums = total_monitor_nums;
    }
    
    public int getAbnormal_point_nums()
    {
        return abnormal_point_nums;
    }
    
    public void setAbnormal_point_nums(int abnormal_point_nums)
    {
        this.abnormal_point_nums = abnormal_point_nums;
    }
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
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
    
    public String getUpdate_user()
    {
        return update_user;
    }
    
    public void setUpdate_user(String update_user)
    {
        this.update_user = update_user;
    }
}
