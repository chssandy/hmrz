/**
 * 文 件 名:  ShareWXLineChartPointBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年4月15日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

/**
 * <pre>
 * 微信分享折线图点数据
 * </pre>
 * 
 * @author  pfma
 * @data  2016年4月15日
 */
public class ShareWXLineChartPointBean
{
    private String date;
    
    private Double value;
    
    public String getDate()
    {
        return date;
    }
    
    public void setDate(String date)
    {
        this.date = date;
    }
    
    public Double getValue()
    {
        return value;
    }
    
    public void setValue(Double value)
    {
        this.value = value;
    }
}
