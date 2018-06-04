/**
 * 文 件 名:  ReportPointBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年11月25日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <pre>
 * 上报点位bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年11月25日
 */
public class ReportPointBean
{
    private String id;
    
    private String vendor_id;
    
    private String name;
    
    private String rename;
    
    private String province;
    
    private String city;
    
    private String address;
    
    private String media_type;
    
    @JSONField(serialize = false)
    private String first_type;
    
    @JSONField(serialize = false)
    private String second_type;
    
    /**
     * 广告位位置
     */
    private String position;
    
    @JSONField(serialize = false)
    private String create_user;
    
    @JSONField(serialize = false)
    private String space_id;
    
    @JSONField(serialize = false)
    private String plan_id;
    
    /**
     * 上报次数
     */
    private int report_nums;
    
    /**
     * 异常次数
     */
    private int abnormal_nums;
    
    /**
     * 是否移除  0：否   1：是
     */
    private int is_remove;
    
    public int getIs_remove()
    {
        return is_remove;
    }
    
    public void setIs_remove(int is_remove)
    {
        this.is_remove = is_remove;
    }
    
    public int getReport_nums()
    {
        return report_nums;
    }
    
    public void setReport_nums(int report_nums)
    {
        this.report_nums = report_nums;
    }
    
    public int getAbnormal_nums()
    {
        return abnormal_nums;
    }
    
    public void setAbnormal_nums(int abnormal_nums)
    {
        this.abnormal_nums = abnormal_nums;
    }
    
    public String getPlan_id()
    {
        return plan_id;
    }
    
    public void setPlan_id(String plan_id)
    {
        this.plan_id = plan_id;
    }
    
    public String getSpace_id()
    {
        return space_id;
    }
    
    public void setSpace_id(String space_id)
    {
        this.space_id = space_id;
    }
    
    public String getCreate_user()
    {
        return create_user;
    }
    
    public void setCreate_user(String create_user)
    {
        this.create_user = create_user;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getRename()
    {
        return rename;
    }
    
    public void setRename(String rename)
    {
        this.rename = rename;
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
    
    public String getProvince()
    {
        return province;
    }
    
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getMedia_type()
    {
        this.media_type = getFirst_type() + "-" + getSecond_type();
        return media_type;
    }
    
    public void setMedia_type(String media_type)
    {
        this.media_type = media_type;
    }
    
    public String getFirst_type()
    {
        return first_type;
    }
    
    public void setFirst_type(String first_type)
    {
        this.first_type = first_type;
    }
    
    public String getSecond_type()
    {
        return second_type;
    }
    
    public void setSecond_type(String second_type)
    {
        this.second_type = second_type;
    }
    
    public String getPosition()
    {
        return position;
    }
    
    public void setPosition(String position)
    {
        this.position = position;
    }
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("ReportPointBean [");
        if (id != null)
        {
            builder.append("id=");
            builder.append(id);
            builder.append(", ");
        }
        if (vendor_id != null)
        {
            builder.append("vendor_id=");
            builder.append(vendor_id);
            builder.append(", ");
        }
        if (name != null)
        {
            builder.append("name=");
            builder.append(name);
            builder.append(", ");
        }
        if (rename != null)
        {
            builder.append("rename=");
            builder.append(rename);
            builder.append(", ");
        }
        if (province != null)
        {
            builder.append("province=");
            builder.append(province);
            builder.append(", ");
        }
        if (city != null)
        {
            builder.append("city=");
            builder.append(city);
            builder.append(", ");
        }
        if (address != null)
        {
            builder.append("address=");
            builder.append(address);
            builder.append(", ");
        }
        if (media_type != null)
        {
            builder.append("media_type=");
            builder.append(media_type);
            builder.append(", ");
        }
        if (first_type != null)
        {
            builder.append("first_type=");
            builder.append(first_type);
            builder.append(", ");
        }
        if (second_type != null)
        {
            builder.append("second_type=");
            builder.append(second_type);
            builder.append(", ");
        }
        if (position != null)
        {
            builder.append("position=");
            builder.append(position);
            builder.append(", ");
        }
        if (create_user != null)
        {
            builder.append("create_user=");
            builder.append(create_user);
            builder.append(", ");
        }
        if (space_id != null)
        {
            builder.append("space_id=");
            builder.append(space_id);
            builder.append(", ");
        }
        if (plan_id != null)
        {
            builder.append("plan_id=");
            builder.append(plan_id);
            builder.append(", ");
        }
        builder.append("report_nums=");
        builder.append(report_nums);
        builder.append(", abnormal_nums=");
        builder.append(abnormal_nums);
        builder.append("]");
        return builder.toString();
    }
}
