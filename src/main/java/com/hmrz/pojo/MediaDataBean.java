/**
 * 采集任务结果列表bean
 */
package com.hmrz.pojo;

import java.io.Serializable;
import java.util.List;

public class MediaDataBean implements Serializable
{
    private static final long serialVersionUID = 7499798959097387856L;
    
    /**
     * 执行编号ID
     */
    private String execute_id;
    
    /**
     * 提交时间
     */
    private String upload_time;
    
    /**
     * 执行城市
     */
    private String exe_city;
    
    /**
     * 执行人手机号
     */
    private String moble;
    
    /**
     * 答案
     */
    private List<TaskAnswerBean> answerList;
    
    public String getExecute_id()
    {
        return execute_id;
    }
    
    public void setExecute_id(String execute_id)
    {
        this.execute_id = execute_id;
    }
    
    public List<TaskAnswerBean> getAnswerList()
    {
        return answerList;
    }
    
    public void setAnswerList(List<TaskAnswerBean> answerList)
    {
        this.answerList = answerList;
    }
    
    public String getUpload_time()
    {
        return upload_time;
    }
    
    public void setUpload_time(String upload_time)
    {
        this.upload_time = upload_time;
    }
    
    public String getExe_city()
    {
        return exe_city;
    }
    
    public void setExe_city(String exe_city)
    {
        this.exe_city = exe_city;
    }
    
    public String getMoble()
    {
        return moble;
    }
    
    public void setMoble(String moble)
    {
        this.moble = moble;
    }
    
}
