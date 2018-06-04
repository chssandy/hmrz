/**
 * 文 件 名:  CreditCalcBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年8月13日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

/**
 * <pre>
 * 信用计算每个指标的详细规则
 * </pre>
 * 
 * @author  pfma
 * @data  2015年8月13日
 */
public class CreditCalcBean
{
    private String calc_id;
    
    private String credit_id;
    
    private Double start;
    
    private Double end;
    
    private Double scale;
    
    private Double value;
    
    private String remark;
    /**
     * 业务类型   1：监测  4：商超督察
     */
    private String task_biz;
    
    public String getCredit_id()
    {
        return credit_id;
    }
    
    public void setCredit_id(String credit_id)
    {
        this.credit_id = credit_id;
    }
    
    public Double getStart()
    {
        return start;
    }
    
    public void setStart(Double start)
    {
        this.start = start;
    }
    
    public Double getEnd()
    {
        return end;
    }
    
    public void setEnd(Double end)
    {
        this.end = end;
    }
    
    public Double getScale()
    {
        return scale;
    }
    
    public void setScale(Double scale)
    {
        this.scale = scale;
    }
    
    public Double getValue()
    {
        return value;
    }
    
    public void setValue(Double value)
    {
        this.value = value;
    }
    
    public String getRemark()
    {
        return remark;
    }
    
    public void setRemark(String remark)
    {
        this.remark = remark;
    }

	public String getCalc_id() {
		return calc_id;
	}

	public void setCalc_id(String calc_id) {
		this.calc_id = calc_id;
	}

	public String getTask_biz() {
		return task_biz;
	}

	public void setTask_biz(String task_biz) {
		this.task_biz = task_biz;
	}
}
