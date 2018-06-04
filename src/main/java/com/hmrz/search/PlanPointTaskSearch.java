/**
 * 文 件 名:  PlanPointTaskSearch.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年8月24日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 投放计划关联点位任务查询bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年8月24日
 */
public class PlanPointTaskSearch extends Page
{
    private static final long serialVersionUID = -8182663171996897801L;
    
    private String point_id;
    
    private String task_btime;
    
    private String task_etime;
    
    private String task_id;
    
    private String is_abnormal;
    
    private String execute_btime;
    
    private String execute_etime;
    
    private String execute_id;
    
    public String getPoint_id()
    {
        return point_id;
    }
    
    public void setPoint_id(String point_id)
    {
        this.point_id = point_id;
    }
    
    public String getTask_btime()
    {
        return task_btime;
    }
    
    public void setTask_btime(String task_btime)
    {
        this.task_btime = task_btime;
    }
    
    public String getTask_etime()
    {
        return task_etime;
    }
    
    public void setTask_etime(String task_etime)
    {
        this.task_etime = task_etime;
    }
    
    public String getTask_id()
    {
        return task_id;
    }
    
    public void setTask_id(String task_id)
    {
        this.task_id = task_id;
    }
    
    public String getIs_abnormal()
    {
        return is_abnormal;
    }
    
    public void setIs_abnormal(String is_abnormal)
    {
        this.is_abnormal = is_abnormal;
    }
    
    public String getExecute_btime()
    {
        return execute_btime;
    }
    
    public void setExecute_btime(String execute_btime)
    {
        this.execute_btime = execute_btime;
    }
    
    public String getExecute_etime()
    {
        return execute_etime;
    }
    
    public void setExecute_etime(String execute_etime)
    {
        this.execute_etime = execute_etime;
    }
    
    public String getExecute_id()
    {
        return execute_id;
    }
    
    public void setExecute_id(String execute_id)
    {
        this.execute_id = execute_id;
    }
}
