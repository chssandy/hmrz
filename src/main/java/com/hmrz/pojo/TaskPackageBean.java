/**
 * 文 件 名:  TaskPackageBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年11月8日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.util.Date;

/**
 * <pre>
 * 任务包bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年11月8日
 */
public class TaskPackageBean
{
    private String id;
    
    private String name;
    
    private String media_type;
    
    private String icon;
    
    private int status;
    
    private Date create_time;
    
    private double price_start;
    
    private double price_end;
    
    private int sort;
    
    private String remark;
    
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
    
    public String getMedia_type()
    {
        return media_type;
    }
    
    public void setMedia_type(String media_type)
    {
        this.media_type = media_type;
    }
    
    public String getIcon()
    {
        return icon;
    }
    
    public void setIcon(String icon)
    {
        this.icon = icon;
    }
    
    public int getStatus()
    {
        return status;
    }
    
    public void setStatus(int status)
    {
        this.status = status;
    }
    
    public Date getCreate_time()
    {
        return create_time;
    }
    
    public void setCreate_time(Date create_time)
    {
        this.create_time = create_time;
    }
    
    public double getPrice_start()
    {
        return price_start;
    }
    
    public void setPrice_start(double price_start)
    {
        this.price_start = price_start;
    }
    
    public double getPrice_end()
    {
        return price_end;
    }
    
    public void setPrice_end(double price_end)
    {
        this.price_end = price_end;
    }
    
    public int getSort()
    {
        return sort;
    }
    
    public void setSort(int sort)
    {
        this.sort = sort;
    }
    
    public String getRemark()
    {
        return remark;
    }
    
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("TaskPackageBean [");
        if (id != null)
        {
            builder.append("id=");
            builder.append(id);
            builder.append(", ");
        }
        if (name != null)
        {
            builder.append("name=");
            builder.append(name);
            builder.append(", ");
        }
        if (media_type != null)
        {
            builder.append("media_type=");
            builder.append(media_type);
            builder.append(", ");
        }
        if (icon != null)
        {
            builder.append("icon=");
            builder.append(icon);
            builder.append(", ");
        }
        builder.append("status=");
        builder.append(status);
        builder.append(", ");
        if (create_time != null)
        {
            builder.append("create_time=");
            builder.append(create_time);
            builder.append(", ");
        }
        builder.append("price_start=");
        builder.append(price_start);
        builder.append(", price_end=");
        builder.append(price_end);
        builder.append(", sort=");
        builder.append(sort);
        builder.append(", ");
        if (remark != null)
        {
            builder.append("remark=");
            builder.append(remark);
        }
        builder.append("]");
        return builder.toString();
    }
}
