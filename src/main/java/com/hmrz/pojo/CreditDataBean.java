/**
 * 文 件 名:  CreditDateBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年8月19日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

/**
 * <pre>
 * 信用积分数据
 * </pre>
 * 
 * @author  pfma
 * @data  2015年8月19日
 */
public class CreditDataBean
{
    private String user_id;
    
    /**
     * 职业得分
     */
    private int occupation;
    
    /**
     * 完成任务平均时间得分
     */
    private int task_finish;
    
    /**
     * 上传任务平均时间得分
     */
    private int task_upload;
    
    /**
     * 任务合格率得分
     */
    private int task_qualified;
    
    /**
     * 任务质量得分
     */
    private int task_quility;
    
    /**
     * 任务超时占比得分
     */
    private int task_overdue;
    
    /**
     * 任务放弃占比得分
     */
    private int task_abandon;
    
    /**
     * 运营评分
     */
    private int score;
    
    /**
     * 用户总信用积分，不包括运营评分
     */
    private int total;
    /**
     * 业务类型   1：监测  4：商超督察
     */
    private String task_biz;
    
    public String getUser_id()
    {
        return user_id;
    }
    
    public void setUser_id(String user_id)
    {
        this.user_id = user_id;
    }
    
    public int getOccupation()
    {
        return occupation;
    }
    
    public void setOccupation(int occupation)
    {
        this.occupation = occupation;
    }
    
    public int getTask_finish()
    {
        return task_finish;
    }
    
    public void setTask_finish(int task_finish)
    {
        this.task_finish = task_finish;
    }
    
    public int getTask_upload()
    {
        return task_upload;
    }
    
    public void setTask_upload(int task_upload)
    {
        this.task_upload = task_upload;
    }
    
    public int getTask_qualified()
    {
        return task_qualified;
    }
    
    public void setTask_qualified(int task_qualified)
    {
        this.task_qualified = task_qualified;
    }
    
    public int getTask_quility()
    {
        return task_quility;
    }
    
    public void setTask_quility(int task_quility)
    {
        this.task_quility = task_quility;
    }
    
    public int getTask_overdue()
    {
        return task_overdue;
    }
    
    public void setTask_overdue(int task_overdue)
    {
        this.task_overdue = task_overdue;
    }
    
    public int getTask_abandon()
    {
        return task_abandon;
    }
    
    public void setTask_abandon(int task_abandon)
    {
        this.task_abandon = task_abandon;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void setScore(int score)
    {
        this.score = score;
    }
    
    public int getTotal()
    {
        return total;
    }
    
    public void setTotal(int total)
    {
        this.total = total;
    }

	public String getTask_biz() {
		return task_biz;
	}

	public void setTask_biz(String task_biz) {
		this.task_biz = task_biz;
	}
}
