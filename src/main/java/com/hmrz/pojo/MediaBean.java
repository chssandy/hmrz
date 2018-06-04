/**
 * 调研任务bean
 */
package com.hmrz.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class MediaBean implements Serializable
{
    private static final long serialVersionUID = 7499798959097387856L;
    
    /**
     * 任务ID
     */
    private String task_id;
    
    /**
     * 任务名称
     */
    private String name;
    
    /**
     * 任务描述
     */
    private String descript;
    
    /**
     * 表单所属类别id
     */
    private String task_type_id;
    
    /**
     * 表单所属类别名称
     */
    private String task_type_name;
    
    /**
     * 任务奖金（单价）
     */
    private BigDecimal salary;
    
    /**
     * 平台费用
     */
    private BigDecimal plat_fee;
    
    /**
     * 执行总次数
     */
    private String execute_times;
    
    /**
     * 任务可执行开始时间
     */
    private String do_btime;
    
    /**
     * 任务可执行截止时间
     */
    private String do_etime;
	/**
	 * 审核周期（单位/天）
	 */
	private String audit_times;
	/**
	 * 代发的运营账号
	 */
	private String agent;
    
    /**
     * 发布审核人
     */
    private String publish_user;
    
    /**
     * 任务审核通过，发布时间
     */
    private String publish_time;
    
    /**
     * 任务状态（0：草稿  1：待审核 2：发布  3：驳回  4：全部完成  5：半完成  6：无人执行  7：关闭）
     */
    private String status;
    
    /**
     * 任务所属商户
     */
    private String vendor_id;
    
    /**
     * 备注
     */
    private String remark;
    
    /**
     * 创建人
     */
    private String create_user;
    
    /**
     * 发布人类别   0：系统人员发布   1：商户发布   2：用户发布
     */
    private String create_type;
    
    /**
     * 是否专属任务   0： 否   1：是
     */
    private String is_exclusive;
    
    /**
     * 题目列表
     */
    private List<TaskTopicBean> topicList;
    
    /**
     * 城市列表
     */
    private List<CityBean> cityList;
    
    /**
     * 点位信息列表
     */
    private List<TaskPointBean> mediaPointList;  
    
    /**
     * 调研约束bean
     */
    private TaskRestrainBean trb;
    
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
    
    public String getDescript()
    {
        return descript;
    }
    
    public void setDescript(String descript)
    {
        this.descript = descript;
    }
    
    public String getTask_type_id()
    {
        return task_type_id;
    }
    
    public void setTask_type_id(String task_type_id)
    {
        this.task_type_id = task_type_id;
    }
    
    public BigDecimal getSalary()
    {
        return salary;
    }
    
    public void setSalary(BigDecimal salary)
    {
        this.salary = salary;
    }
    
    public String getExecute_times()
    {
        return execute_times;
    }
    
    public void setExecute_times(String execute_times)
    {
        this.execute_times = execute_times;
    }
    
    public String getDo_btime()
    {
        return do_btime;
    }
    
    public void setDo_btime(String do_btime)
    {
        this.do_btime = do_btime;
    }
    
    public String getDo_etime()
    {
        return do_etime;
    }
    
    public void setDo_etime(String do_etime)
    {
        this.do_etime = do_etime;
    }
	public String getAudit_times() {
		return audit_times;
	}
	public void setAudit_times(String audit_times) 
	{
		this.audit_times = audit_times;
	}
    public String getPublish_user()
    {
        return publish_user;
    }
    
    public void setPublish_user(String publish_user)
    {
        this.publish_user = publish_user;
    }
    
    public String getPublish_time()
    {
        return publish_time;
    }
    
    public void setPublish_time(String publish_time)
    {
        this.publish_time = publish_time;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public String getVendor_id()
    {
        return vendor_id;
    }
    
    public void setVendor_id(String vendor_id)
    {
        this.vendor_id = vendor_id;
    }
    
    public String getRemark()
    {
        return remark;
    }
    
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
    public String getCreate_user()
    {
        return create_user;
    }
    
    public void setCreate_user(String create_user)
    {
        this.create_user = create_user;
    }
    
    public String getCreate_type()
    {
        return create_type;
    }
    
    public void setCreate_type(String create_type)
    {
        this.create_type = create_type;
    }
    
    public String getIs_exclusive()
    {
        return is_exclusive;
    }
    
    public void setIs_exclusive(String is_exclusive)
    {
        this.is_exclusive = is_exclusive;
    }
    
    public List<TaskTopicBean> getTopicList()
    {
        return topicList;
    }
    
    public void setTopicList(List<TaskTopicBean> topicList)
    {
        this.topicList = topicList;
    }
    
    public String getTask_type_name()
    {
        return task_type_name;
    }
    
    public void setTask_type_name(String task_type_name)
    {
        this.task_type_name = task_type_name;
    }
    
    public List<CityBean> getCityList()
    {
        return cityList;
    }
    
    public void setCityList(List<CityBean> cityList)
    {
        this.cityList = cityList;
    }
    
    
    public BigDecimal getPlat_fee() {
		return plat_fee;
	}

	public void setPlat_fee(BigDecimal plat_fee) {
		this.plat_fee = plat_fee;
	}
	
	public TaskRestrainBean getTrb() {
		return trb;
	}

	public void setTrb(TaskRestrainBean trb) {
		this.trb = trb;
	}
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("SurveyBean [task_id=")
                .append(task_id)
                .append(", name=")
                .append(name)
                .append(", descript=")
                .append(descript)
                .append(", task_type_id=")
                .append(task_type_id)
                .append(", salary=")
                .append(salary)
                .append(", execute_times=")
                .append(execute_times)
                .append(", do_btime=")
                .append(do_btime)
                .append(", do_etime=")
                .append(do_etime)
                .append(", publish_user=")
                .append(publish_user)
                .append(", publish_time=")
                .append(publish_time)
                .append(", status=")
                .append(status)
                .append(", vendor_id=")
                .append(vendor_id)
                .append(", remark=")
                .append(remark)
                .append(", create_user=")
                .append(create_user)
                .append(", create_type=")
                .append(create_type)
                .append(", is_exclusive=")
                .append(is_exclusive)
                .append("]");
        return builder.toString();
    }

	public List<TaskPointBean> getMediaPointList() {
		return mediaPointList;
	}

	public void setMediaPointList(List<TaskPointBean> mediaPointList) {
		this.mediaPointList = mediaPointList;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}
	
}
