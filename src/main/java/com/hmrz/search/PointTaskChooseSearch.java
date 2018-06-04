/**
 * 文 件 名:  PointTaskChooseSearch.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年8月24日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 点位与任务执行结果关联备选查询
 * </pre>
 * 
 * @author  pfma
 * @data  2016年8月24日
 */
public class PointTaskChooseSearch extends Page
{
    private static final long serialVersionUID = -2325546155412341817L;
    
    private String point_id;
    
    private String task_id;
    
    private String execute_id;
    
    private String task_type;
    
    private String task_name;
    
    private String executor;
    
    public String getPoint_id()
    {
        return point_id;
    }
    
    public void setPoint_id(String point_id)
    {
        this.point_id = point_id;
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
    
    public String getTask_type()
    {
        return task_type;
    }
    
    public void setTask_type(String task_type)
    {
        this.task_type = task_type;
    }
    
    public String getTask_name()
    {
        return task_name;
    }
    
    public void setTask_name(String task_name)
    {
        this.task_name = task_name;
    }
    
    public String getExecutor()
    {
        return executor;
    }
    
    public void setExecutor(String executor)
    {
        this.executor = executor;
    }
}
