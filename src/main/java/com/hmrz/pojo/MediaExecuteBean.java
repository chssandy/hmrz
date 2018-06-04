/**
 * 调研任务结果bean
 * Author：sandy
 */
package com.hmrz.pojo;

import java.io.Serializable;
import java.util.List;

public class MediaExecuteBean implements Serializable
{
    private static final long serialVersionUID = 7499798959097387856L;
    
    /**
     * 执行编号
     */
    private String execute_id;
    
    /**
     * 任务ID
     */
    private String task_id;
    
    /**
     * 任务名称
     */
    private String name;
    
    /**
     * 任务金额
     */
    private String salary;
    
    /**
     * 平台费用
     */
    private String plat_fee;
    
    /**
     * 任务所属客户
     */
    private String vendor_id;
    
    /**
     * 任务执行人
     */
    private String executor;
    
    /**
     * 任务执行人设备
     */
    private String registration_id;
    
    /**
     * 任务执行人平台
     */
    private int platform;
    
    /**
     * 审核时间
     */
    private String accept_time;
    
    /**
     * 任务提交时间
     */
    private String upload_time;
    
    /**
     * 任务状态
     */
    private String status;
    
    /**
     * 审核理由
     */
    private String accept_reason;
    
    /**
     * 得分
     */
    private String score;
    
    /**
     * 是否正常
     */
    private String is_passed;
    
    /**
     * 是否正常的理由
     */
    private String passed_reason;
    
    /**
     * 执行城市
     */
    private String exe_city;
    
    /**
     * 任务类别（三类）
     */
    private String task_type_id;
    
    /**
     * 任务类别（一类）
     */
    private String father_id;
    
    /**
     * 代理审核人
     */
    private String audit_agent;
    
    /**
    * 点位信息列表
    */
    private List<TaskPointBean> mediaPointList;
    
    private String brand;
    
    public String getBrand()
    {
        return brand;
    }
    
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    
    public String getExecute_id()
    {
        return execute_id;
    }
    
    public void setExecute_id(String execute_id)
    {
        this.execute_id = execute_id;
    }
    
    public String getTask_id()
    {
        return task_id;
    }
    
    public void setTask_id(String task_id)
    {
        this.task_id = task_id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getExecutor()
    {
        return executor;
    }
    
    public void setExecutor(String executor)
    {
        this.executor = executor;
    }
    
    public String getAccept_time()
    {
        return accept_time;
    }
    
    public void setAccept_time(String accept_time)
    {
        this.accept_time = accept_time;
    }
    
    public String getUpload_time()
    {
        return upload_time;
    }
    
    public void setUpload_time(String upload_time)
    {
        this.upload_time = upload_time;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public String getAccept_reason()
    {
        return accept_reason;
    }
    
    public void setAccept_reason(String accept_reason)
    {
        this.accept_reason = accept_reason;
    }
    
    public String getScore()
    {
        return score;
    }
    
    public void setScore(String score)
    {
        this.score = score;
    }
    
    public String getIs_passed()
    {
        return is_passed;
    }
    
    public void setIs_passed(String is_passed)
    {
        this.is_passed = is_passed;
    }
    
    public String getPassed_reason()
    {
        return passed_reason;
    }
    
    public void setPassed_reason(String passed_reason)
    {
        this.passed_reason = passed_reason;
    }
    
    public String getExe_city()
    {
        return exe_city;
    }
    
    public void setExe_city(String exe_city)
    {
        this.exe_city = exe_city;
    }
    
    public String getSalary()
    {
        return salary;
    }
    
    public void setSalary(String salary)
    {
        this.salary = salary;
    }
    
    public String getRegistration_id()
    {
        return registration_id;
    }
    
    public void setRegistration_id(String registration_id)
    {
        this.registration_id = registration_id;
    }
    
    public int getPlatform()
    {
        return platform;
    }
    
    public void setPlatform(int platform)
    {
        this.platform = platform;
    }
    
    public String getVendor_id()
    {
        return vendor_id;
    }
    
    public void setVendor_id(String vendor_id)
    {
        this.vendor_id = vendor_id;
    }
    
    public String getPlat_fee()
    {
        return plat_fee;
    }
    
    public void setPlat_fee(String plat_fee)
    {
        this.plat_fee = plat_fee;
    }
    
    public String getTask_type_id()
    {
        return task_type_id;
    }
    
    public void setTask_type_id(String task_type_id)
    {
        this.task_type_id = task_type_id;
    }
    
    public String getFather_id()
    {
        return father_id;
    }
    
    public void setFather_id(String father_id)
    {
        this.father_id = father_id;
    }
    
    public List<TaskPointBean> getMediaPointList()
    {
        return mediaPointList;
    }
    
    public void setMediaPointList(List<TaskPointBean> mediaPointList)
    {
        this.mediaPointList = mediaPointList;
    }
    
    public String getAudit_agent()
    {
        return audit_agent;
    }
    
    public void setAudit_agent(String audit_agent)
    {
        this.audit_agent = audit_agent;
    }
    
}
