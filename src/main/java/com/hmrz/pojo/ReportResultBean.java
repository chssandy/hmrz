/**
 * 文  件  名：ReportResultBean.java
 * 描        述：<描述>
 * 创  建  人：chs_sandy
 * 创建时间：2016年11月23日 下午4:13:54
 * 修改内容：<修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * @pre $
 * 
 * @author chs_sandy
 * @date 2016年11月23日 下午4:13:54
 */
public class ReportResultBean implements Serializable
{
    private static final long serialVersionUID = -6680644830905774584L;
    
    /**
     * 执行编号
     */
    private String execute_id;
    
    /**
     * 点位名称
     */
    private String name;
    
    /**
     * 客户点位名称
     */
    private String rename;
    
    /**
     * 上报单价
     */
    private String salary;
    
    /**
     * 执行结果，英文逗号分隔的字符串
     */
    private String answer;
    
    /**
     * 状态    2：已提交待上传   3：待审核  4：审核通过  5：审核不通过
     */
    private String status;
    
    /**
     * 是否正常
     */
    private String is_normal;
    
    /**
     * admin运营审核人员
     */
    private String auditor;
    
    /**
     * biz客户审核人员
     */
    private String biz_auditor;
    
    /**
     * 执行用户id
     */
    private String executor;
    
    /**
     * 用户
     */
    private String moble;
    
    /**
     * 所属企业
     */
    private String vendor_id;
    
    /**
     * 所属上报计划id
     */
    private String plan_id;
    
    /**
     * 上报提交时间
     */
    private String commit_time;
    
    /**
     * 上报上传时间
     */
    private String upload_time;
    
    public String getExecute_id()
    {
        return execute_id;
    }
    
    public void setExecute_id(String execute_id)
    {
        this.execute_id = execute_id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getRename()
    {
        return rename;
    }
    
    public void setRename(String rename)
    {
        this.rename = rename;
    }
    
    public String getAnswer()
    {
        return answer;
    }
    
    public void setAnswer(String answer)
    {
        this.answer = answer;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public String getIs_normal()
    {
        return is_normal;
    }
    
    public void setIs_normal(String is_normal)
    {
        this.is_normal = is_normal;
    }
    
    public String getAuditor()
    {
        return auditor;
    }
    
    public void setAuditor(String auditor)
    {
        this.auditor = auditor;
    }
    
    public String getBiz_auditor()
    {
        return biz_auditor;
    }
    
    public void setBiz_auditor(String biz_auditor)
    {
        this.biz_auditor = biz_auditor;
    }
    
    public String getSalary()
    {
        return salary;
    }
    
    public void setSalary(String salary)
    {
        this.salary = salary;
    }
    
    public String getExecutor()
    {
        return executor;
    }
    
    public void setExecutor(String executor)
    {
        this.executor = executor;
    }
    
    public String getVendor_id()
    {
        return vendor_id;
    }
    
    public void setVendor_id(String vendor_id)
    {
        this.vendor_id = vendor_id;
    }
    
    public String getPlan_id()
    {
        return plan_id;
    }
    
    public void setPlan_id(String plan_id)
    {
        this.plan_id = plan_id;
    }
    
    public String getMoble()
    {
        return moble;
    }
    
    public void setMoble(String moble)
    {
        this.moble = moble;
    }
    
    public String getCommit_time()
    {
        return commit_time;
    }
    
    public void setCommit_time(String commit_time)
    {
        this.commit_time = commit_time;
    }
    
    public String getUpload_time()
    {
        return upload_time;
    }
    
    public void setUpload_time(String upload_time)
    {
        this.upload_time = upload_time;
    }
    
}
