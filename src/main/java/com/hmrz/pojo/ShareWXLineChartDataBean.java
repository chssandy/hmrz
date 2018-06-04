/**
 * 文 件 名:  LineBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年2月17日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.util.List;

/**
 * <pre>
 * 折线图配置bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年2月17日
 */
public class ShareWXLineChartDataBean
{
    private String start_date;
    
    private String end_date;
    
    /**
     * 每天所有点击数据
     */
    private List<ShareWXLineChartPointBean> allClick_data;
    
    /**
     * 每天有效点击数据
     */
    private List<ShareWXLineChartPointBean> paidClick_data;
    
    /**
     * 每天花费数据
     */
    private List<ShareWXLineChartPointBean> salary_data;
    
    public String getStart_date()
    {
        return start_date;
    }
    
    public void setStart_date(String start_date)
    {
        this.start_date = start_date;
    }
    
    public String getEnd_date()
    {
        return end_date;
    }
    
    public void setEnd_date(String end_date)
    {
        this.end_date = end_date;
    }
    
    public List<ShareWXLineChartPointBean> getAllClick_data()
    {
        return allClick_data;
    }
    
    public void setAllClick_data(List<ShareWXLineChartPointBean> allClick_data)
    {
        this.allClick_data = allClick_data;
    }
    
    public List<ShareWXLineChartPointBean> getPaidClick_data()
    {
        return paidClick_data;
    }
    
    public void setPaidClick_data(List<ShareWXLineChartPointBean> paidClick_data)
    {
        this.paidClick_data = paidClick_data;
    }
    
    public List<ShareWXLineChartPointBean> getSalary_data()
    {
        return salary_data;
    }
    
    public void setSalary_data(List<ShareWXLineChartPointBean> salary_data)
    {
        this.salary_data = salary_data;
    }
}
