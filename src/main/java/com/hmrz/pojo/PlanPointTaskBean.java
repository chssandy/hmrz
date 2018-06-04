/**
 * 文 件 名:  PlanTaskBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年8月23日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <pre>
 * 投放计划点位关联任务bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年8月23日
 */
public class PlanPointTaskBean
{
    private String id;
    
    @JSONField(serialize = false)
    private String point_id;
    
    @JSONField(serialize = false)
    private String plan_id;
    
    private String task_id;
    
    private String execute_id;
    
    private String task_name;
    
    private String brand;
    
    private Date task_time;
    
    private Date execute_time;
    
    /**
     * 是否异常点位 0:否 1: 是
     */
    private int is_abnormal;
    
    @JSONField(serialize = false)
    private String operator;
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getPoint_id()
    {
        return point_id;
    }
    
    public void setPoint_id(String point_id)
    {
        this.point_id = point_id;
    }
    
    public String getPlan_id()
    {
        return plan_id;
    }
    
    public void setPlan_id(String plan_id)
    {
        this.plan_id = plan_id;
    }
    
    public String getTask_id()
    {
        return task_id;
    }
    
    public void setTask_id(String task_id)
    {
        this.task_id = task_id;
    }
    
    public String getExecute_id()
    {
        return execute_id;
    }
    
    public void setExecute_id(String execute_id)
    {
        this.execute_id = execute_id;
    }
    
    public String getTask_name()
    {
        return task_name;
    }
    
    public void setTask_name(String task_name)
    {
        this.task_name = task_name;
    }
    
    public String getBrand()
    {
        return brand;
    }
    
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    
    public Date getTask_time()
    {
        return task_time;
    }
    
    public void setTask_time(Date task_time)
    {
        this.task_time = task_time;
    }
    
    public Date getExecute_time()
    {
        return execute_time;
    }
    
    public void setExecute_time(Date execute_time)
    {
        this.execute_time = execute_time;
    }
    
    public int getIs_abnormal()
    {
        return is_abnormal;
    }
    
    public void setIs_abnormal(int is_abnormal)
    {
        this.is_abnormal = is_abnormal;
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
