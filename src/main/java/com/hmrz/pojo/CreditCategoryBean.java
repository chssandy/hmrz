/**
 * 文 件 名:  CreditCategoryBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年8月12日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

/**
 * <pre>
 * 信用指标bean
 * </pre>
 * 
 * @author  pfma
 * @data  2015年8月12日
 */
public class CreditCategoryBean
{
    /**
     * 分类id，手动指定，不可更改
     */
    private String category_id;
    
    /**
     * 指标名
     */
    private String name;
    
    /**
     * 百分比，所有指标百分比总和必须为1
     */
    private double scale;
    
    /**
     * 根据百分比计算出的指标具体值，跟随百分比变化
     */
    private double value;
    
    /**
     * 业务类型   1：监测  4：商超督察
     */
    private String task_biz;
    
    public String getCategory_id()
    {
        return category_id;
    }
    
    public void setCategory_id(String category_id)
    {
        this.category_id = category_id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public double getScale()
    {
        return scale;
    }
    
    public void setScale(double scale)
    {
        this.scale = scale;
    }
    
    public double getValue()
    {
        return value;
    }
    
    public void setValue(double value)
    {
        this.value = value;
    }

	public String getTask_biz() {
		return task_biz;
	}

	public void setTask_biz(String task_biz) {
		this.task_biz = task_biz;
	}
}
