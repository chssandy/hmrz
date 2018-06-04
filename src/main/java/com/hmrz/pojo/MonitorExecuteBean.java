package com.hmrz.pojo;

import java.util.Date;

public class MonitorExecuteBean
{
    
    /**
     * id
     */
    private String execute_id;
    
    /**
     * 申请人
     */
    private String executor;
    
    /**
     * 用户信用分
     */
    private int credit;
    
    /**
     * 申请任务时间
     */
    private String apply_time;
    
    /**
     * 申请任务执行时段
     */
    private String apply_exe_time;
    
    /**
     * 申请任务理由
     */
    private String apply_reason;
    
    /**
     * 申请人手机号
     */
    private String moble;
    
    /**
     * 申请人昵称
     */
    private String nick_name;
    
    /**
     * 任务id
     */
    private String task_id;
    
    /**
     * 申请人备注信息 
     */
    private String remark;
    
    /**
    * 任务名
    */
    private String name;
    
    /**
     * 任务类型
     */
    private String task_type_id;
    
    /**
     * 执行地点
     */
    private String task_location;
    
    /**
     * 薪金
     */
    private String salary;
    
    /**
     * 任务状态  0：待指派 （申请中） 1：待执行  2：待上传  3：待审核  4：完成  5：审核不通过  6：放弃   7:超时
     */
    private String status;
    
    /**
     * 截至时间
     */
    private Date end_time;
    
    /**
     * 任务开始时间
     */
    private Date show_btime;
    
    /**
     * 申请人
     */
    private String apply_user_id;
    
    /**
     * 指派时间
     */
    private Date designate_time;
    
    /**
     * 任务完成时间
     */
    private Date upload_time;
    
    /**
     * 验收时间
     */
    private Date accept_time;
    
    /**
     * 执行开始时间
     */
    private Date do_btime;
    
    /**
     * 截止时间
     */
    private Date do_etime;
    
    /**
     * 审核结果理由
     */
    private String accept_reason;
    
    /**
     * 用户任务评分
     */
    private String score;
    
    /**
     * 用户对应的消息推送token
     */
    private String registration_id;
    
    /**
     * 用户当前使用的手机平台 0：android 1：IOS
     */
    private int platform;
    
    /**
     * 用户执行开始时间
     */
    private Date u_do_btime;
    
    /**
     * 用户执行结束时间
     */
    private Date u_do_etime;
    
    /**
     * 用户上传任务时间
     */
    private Date u_upload_etime;
    
    /**
     * 任务结果是否为正常,0:正常 1:不正常
     */
    private String is_normal;
    
    /**
     * 判断理由
     */
    private String judge_reason;
    
    /**
     * 芝麻信用查询时间
     */
    private String update_time;
    
    /**
     * 芝麻信用是否授权
     */
    private String is_authorized;
    
    /**
     * 芝麻信用分
     */
    private String zhima_score;
    
    private String brand;
    
    public String getBrand()
    {
        return brand;
    }
    
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    
    public String getUpdate_time()
    {
        return update_time;
    }
    
    public void setUpdate_time(String update_time)
    {
        this.update_time = update_time;
    }
    
    public String getIs_authorized()
    {
        return is_authorized;
    }
    
    public void setIs_authorized(String is_authorized)
    {
        this.is_authorized = is_authorized;
    }
    
    public String getZhima_score()
    {
        return zhima_score;
    }
    
    public void setZhima_score(String zhima_score)
    {
        this.zhima_score = zhima_score;
    }
    
    public String getExecute_id()
    {
        return execute_id;
    }
    
    public void setExecute_id(String execute_id)
    {
        this.execute_id = execute_id;
    }
    
    public int getCredit()
    {
        return credit;
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    public String getApply_time()
    {
        return apply_time;
    }
    
    public void setApply_time(String apply_time)
    {
        this.apply_time = apply_time;
    }
    
    public String getApply_exe_time()
    {
        return apply_exe_time;
    }
    
    public void setApply_exe_time(String apply_exe_time)
    {
        this.apply_exe_time = apply_exe_time;
    }
    
    public String getApply_reason()
    {
        return apply_reason;
    }
    
    public void setApply_reason(String apply_reason)
    {
        this.apply_reason = apply_reason;
    }
    
    public String getMoble()
    {
        return moble;
    }
    
    public void setMoble(String moble)
    {
        this.moble = moble;
    }
    
    public String getNick_name()
    {
        return nick_name;
    }
    
    public void setNick_name(String nick_name)
    {
        this.nick_name = nick_name;
    }
    
    public String getTask_id()
    {
        return task_id;
    }
    
    public void setTask_id(String task_id)
    {
        this.task_id = task_id;
    }
    
    public String getRemark()
    {
        return remark;
    }
    
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getTask_type_id()
    {
        return task_type_id;
    }
    
    public void setTask_type_id(String task_type_id)
    {
        this.task_type_id = task_type_id;
    }
    
    public String getTask_location()
    {
        return task_location;
    }
    
    public void setTask_location(String task_location)
    {
        this.task_location = task_location;
    }
    
    public String getSalary()
    {
        return salary;
    }
    
    public void setSalary(String salary)
    {
        this.salary = salary;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public Date getEnd_time()
    {
        return end_time;
    }
    
    public void setEnd_time(Date end_time)
    {
        this.end_time = end_time;
    }
    
    public Date getShow_btime()
    {
        return show_btime;
    }
    
    public void setShow_btime(Date show_btime)
    {
        this.show_btime = show_btime;
    }
    
    public String getApply_user_id()
    {
        return apply_user_id;
    }
    
    public void setApply_user_id(String apply_user_id)
    {
        this.apply_user_id = apply_user_id;
    }
    
    public Date getDesignate_time()
    {
        return designate_time;
    }
    
    public void setDesignate_time(Date designate_time)
    {
        this.designate_time = designate_time;
    }
    
    public Date getUpload_time()
    {
        return upload_time;
    }
    
    public void setUpload_time(Date upload_time)
    {
        this.upload_time = upload_time;
    }
    
    public Date getAccept_time()
    {
        return accept_time;
    }
    
    public void setAccept_time(Date accept_time)
    {
        this.accept_time = accept_time;
    }
    
    public Date getDo_btime()
    {
        return do_btime;
    }
    
    public void setDo_btime(Date do_btime)
    {
        this.do_btime = do_btime;
    }
    
    public Date getDo_etime()
    {
        return do_etime;
    }
    
    public void setDo_etime(Date do_etime)
    {
        this.do_etime = do_etime;
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
    
    public Date getU_do_btime()
    {
        return u_do_btime;
    }
    
    public void setU_do_btime(Date u_do_btime)
    {
        this.u_do_btime = u_do_btime;
    }
    
    public Date getU_do_etime()
    {
        return u_do_etime;
    }
    
    public void setU_do_etime(Date u_do_etime)
    {
        this.u_do_etime = u_do_etime;
    }
    
    public Date getU_upload_etime()
    {
        return u_upload_etime;
    }
    
    public void setU_upload_etime(Date u_upload_etime)
    {
        this.u_upload_etime = u_upload_etime;
    }
    
    public String getIs_normal()
    {
        return is_normal;
    }
    
    public void setIs_normal(String is_normal)
    {
        this.is_normal = is_normal;
    }
    
    public String getJudge_reason()
    {
        return judge_reason;
    }
    
    public void setJudge_reason(String judge_reason)
    {
        this.judge_reason = judge_reason;
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
