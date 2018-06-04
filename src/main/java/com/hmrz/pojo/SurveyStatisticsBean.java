/**
 * 文 件 名:  SurveyStatisticsBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年4月5日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.util.List;

/**
 * <pre>
 * 问卷调查统计展示相关bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年4月5日
 */
public class SurveyStatisticsBean
{
    private String title;
    
    private String index;
    
    private String type;
    
    private List<option> options;
    
    static class option
    {
        private String name;
        
        private int value;
        
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
        
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getIndex()
    {
        return index;
    }
    
    public void setIndex(String index)
    {
        this.index = index;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public List<option> getOptions()
    {
        return options;
    }
    
    public void setOptions(List<option> options)
    {
        this.options = options;
    }
}
