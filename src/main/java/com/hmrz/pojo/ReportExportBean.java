/**
 * 文 件 名:  ReportExportBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年11月30日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.util.List;

/**
 * <pre>
 * 计划点位执行情况导出bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年11月30日
 */
public class ReportExportBean
{
    private String plan_space_id;
    
    private String name;
    
    private String rename;
    
    private String address;
    
    private String province;
    
    private String city;
    
    private String first_type;
    
    private String second_type;
    
    private String media_type;
    
    private String position;
    
    private int report_nums;
    
    private int abnormal_nums;
    
    private List<ReportResultExportBean> result;
    
    public String getRename()
    {
        return rename;
    }
    
    public void setRename(String rename)
    {
        this.rename = rename;
    }
    
    public String getPlan_space_id()
    {
        return plan_space_id;
    }
    
    public void setPlan_space_id(String plan_space_id)
    {
        this.plan_space_id = plan_space_id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
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
    
    public List<ReportResultExportBean> getResult()
    {
        return result;
    }
    
    public void setResult(List<ReportResultExportBean> result)
    {
        this.result = result;
    }
}
