/**
 * 文 件 名:  PackageTaskBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年11月11日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.util.Date;

/**
 * <pre>
 * 任务包关联任务信息
 * </pre>
 * 
 * @author  pfma
 * @data  2016年11月11日
 */
public class PackageTaskBean
{
    private String id;
    
    private String package_id;
    
    private String task_id;
    
    private String task_name;
    
    private String city_name;
    
    private double price;
    
    private Date publish_time;
    
    private String publisher;
    
    private int status;
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getPackage_id()
    {
        return package_id;
    }
    
    public void setPackage_id(String package_id)
    {
        this.package_id = package_id;
    }
    
    public String getTask_id()
    {
        return task_id;
    }
    
    public void setTask_id(String task_id)
    {
        this.task_id = task_id;
    }
    
    public String getTask_name()
    {
        return task_name;
    }
    
    public void setTask_name(String task_name)
    {
        this.task_name = task_name;
    }
    
    public String getCity_name()
    {
        return city_name;
    }
    
    public void setCity_name(String city_name)
    {
        this.city_name = city_name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public Date getPublish_time()
    {
        return publish_time;
    }
    
    public void setPublish_time(Date publish_time)
    {
        this.publish_time = publish_time;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
    
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    
    public int getStatus()
    {
        return status;
    }
    
    public void setStatus(int status)
    {
        this.status = status;
    }
}
