/**
 * 文 件 名:  ShareWXChartDataBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年4月14日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

/**
 * <pre>
 * 微信分享图表数据bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年4月14日
 */
public class ShareWXChartDataBean
{
    private String name;
    
    private int value;
    
    /**
     * 省编码或城市编码
     */
    private String code;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void setValue(int value)
    {
        this.value = value;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public void setCode(String code)
    {
        this.code = code;
    }
}
