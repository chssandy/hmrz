/**
 * 文 件 名:  PlanPointBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年8月19日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <pre>
 * 投放计划点位bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年8月19日
 */
public class PlanPointBean
{
    private String id;
    
    @JSONField(serialize = false)
    private String plan_id;
    
    @JSONField(serialize = false)
    private String point_id;
    
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
    
    /**
     * 关联监测记录数
     */
    private int record_nums;
    
    /**
     * 异常记录数目
     */
    private int abnormal_nums;
    
    /**
     * 是否异常点位 0:否 1: 是
     */
    private int is_abnormal;
    
    @JSONField(serialize = false)
    private String operator;
    
    public String getPlan_id()
    {
        return plan_id;
    }
    
    public void setPlan_id(String plan_id)
    {
        this.plan_id = plan_id;
    }
    
    public String getPoint_id()
    {
        return point_id;
    }
    
    public void setPoint_id(String point_id)
    {
        this.point_id = point_id;
    }
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String id)
    {
        this.id = id;
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
    
    public String getPosition()
    {
        return position;
    }
    
    public void setPosition(String position)
    {
        this.position = position;
    }
    
    public int getRecord_nums()
    {
        return record_nums;
    }
    
    public void setRecord_nums(int record_nums)
    {
        this.record_nums = record_nums;
    }
    
    public int getAbnormal_nums()
    {
        return abnormal_nums;
    }
    
    public void setAbnormal_nums(int abnormal_nums)
    {
        this.abnormal_nums = abnormal_nums;
    }
    
    public int getIs_abnormal()
    {
        return is_abnormal;
    }
    
    public void setIs_abnormal(int is_abnormal)
    {
        this.is_abnormal = is_abnormal;
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
    
    public String getOperator()
    {
        return operator;
    }
    
    public void setOperator(String operator)
    {
        this.operator = operator;
    }
}
