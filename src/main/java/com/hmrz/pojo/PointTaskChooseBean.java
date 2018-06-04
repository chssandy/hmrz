/**
 * 文 件 名:  PointRecordBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年8月24日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.util.Date;

/**
 * <pre>
 * 点位与任务执行结果关联备选bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年8月24日
 */
public class PointTaskChooseBean
{
    private String task_id;
    
    private String execute_id;
    
    private String task_name;
    
    private String vendor_name;
    
    private String task_type;
    
    private String executor;
    
    private Date submit_time;
    
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
    
    public String getVendor_name()
    {
        return vendor_name;
    }
    
    public void setVendor_name(String vendor_name)
    {
        this.vendor_name = vendor_name;
    }
    
    public String getTask_type()
    {
        return task_type;
    }
    
    public void setTask_type(String task_type)
    {
        this.task_type = task_type;
    }
    
    public String getExecutor()
    {
        return executor;
    }
    
    public void setExecutor(String executor)
    {
        this.executor = executor;
    }
    
    public Date getSubmit_time()
    {
        return submit_time;
    }
    
    public void setSubmit_time(Date submit_time)
    {
        this.submit_time = submit_time;
    }
}
