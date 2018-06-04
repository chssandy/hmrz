/**
 * 文 件 名:  ReportBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年11月23日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

/**
 * <pre>
 * 上报bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年11月23日
 */
public class ReportPlanBean
{
    private String id;
    
    private String name;
    
    private String vendor_id;
    
    /**
     * 是否加水印 0:否 1:是
     */
    private String has_marked;
    
    private double salary;
    
    /**
     * 限定内勤组id
     */
    private String group_id;
    
    private String create_time;
    
    private String create_user;
    
    /**
     * 是否上线  0：否  1：是
     */
    private String status;
    
    /**
     * 是否运营平台发布 0：否  1：是
     */
    private int is_admin;
    
    /**
     * 包含点位数
     */
    private int total_points;
    
    /**
     * 有上报的点位数
     */
    private int report_points;
    
    /**
     * 出现异常的点位数
     */
    private int abnormal_points;
    
    /**
     * 总上报次数
     */
    private int total_report;
    
    public int getTotal_points()
    {
        return total_points;
    }
    
    public void setTotal_points(int total_points)
    {
        this.total_points = total_points;
    }
    
    public int getReport_points()
    {
        return report_points;
    }
    
    public void setReport_points(int report_points)
    {
        this.report_points = report_points;
    }
    
    public int getAbnormal_points()
    {
        return abnormal_points;
    }
    
    public void setAbnormal_points(int abnormal_points)
    {
        this.abnormal_points = abnormal_points;
    }
    
    public int getTotal_report()
    {
        return total_report;
    }
    
    public void setTotal_report(int total_report)
    {
        this.total_report = total_report;
    }
    
    public int getIs_admin()
    {
        return is_admin;
    }
    
    public void setIs_admin(int is_admin)
    {
        this.is_admin = is_admin;
    }
    
    public String getCreate_time()
    {
        return create_time;
    }
    
    public void setCreate_time(String create_time)
    {
        this.create_time = create_time;
    }
    
    public String getHas_marked()
    {
        return has_marked;
    }
    
    public void setHas_marked(String has_marked)
    {
        this.has_marked = has_marked;
    }
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getVendor_id()
    {
        return vendor_id;
    }
    
    public void setVendor_id(String vendor_id)
    {
        this.vendor_id = vendor_id;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    public String getGroup_id()
    {
        return group_id;
    }
    
    public void setGroup_id(String group_id)
    {
        this.group_id = group_id;
    }
    
    public String getCreate_user()
    {
        return create_user;
    }
    
    public void setCreate_user(String create_user)
    {
        this.create_user = create_user;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
}
