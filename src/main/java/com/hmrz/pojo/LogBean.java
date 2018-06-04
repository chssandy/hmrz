/**
 * 文 件 名:  LogBean.java
 * 描    述:  <系统日志>
 * 创 建 人:  sandy
 * 创建时间:  2014年7月28日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.util.Date;

/**
 * <table:xt_log>
 * 用户行为操作日志bean
 * @author  sandy
 * @data  2014-4-9
 */
public class LogBean
{
	/**
	 * 主键
	 */
	private String log_id;
    /**
     * 模块
     */
    private String module;
    
    /**
     * 浏览器类型
     */
    private String browser;
    
    /**
     * 操作用户
     */
    private String operator;
    
    /**
     * 操作类型,0:新增;1:修改;2:删除
     */
    private int operateType;
    
    /**
     * 参数
     */
    private String params;
    
    /**
     * 操作时间
     */
    private Date create_time;
    
    /**
     * 操作机器ip
     */
    private String ip;
    
    /**
     * 操作描述标题
     */
    private String title;
    
    /**
     * 是否成功  0：成功  1：失败
     */
    private int is_succeed = 0;
    
    /**
     * 0:web;1:app
     */
    private int platform = 0;
    
    public String getModule()
    {
        return module;
    }
    
    public void setModule(String module)
    {
        this.module = module;
    }
    
    public String getBrowser()
    {
        return browser;
    }
    
    public void setBrowser(String browser)
    {
        this.browser = browser;
    }
    
    public String getOperator()
    {
        return operator;
    }
    
    public void setOperator(String operator)
    {
        this.operator = operator;
    }
    
    public int getOperateType()
    {
        return operateType;
    }
    
    public void setOperateType(int operateType)
    {
        this.operateType = operateType;
    }
    
    public String getParams()
    {
        return params;
    }
    
    public void setParams(String params)
    {
        this.params = params;
    }
    
    public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getIp()
    {
        return ip;
    }
    
    public void setIp(String ip)
    {
        this.ip = ip;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public int getIs_succeed()
    {
        return is_succeed;
    }
    
    public void setIs_succeed(int is_succeed)
    {
        this.is_succeed = is_succeed;
    }
    
    public int getPlatform()
    {
        return platform;
    }
    
    public void setPlatform(int platform)
    {
        this.platform = platform;
    }

	/**
	 * @return the log_id
	 */
	public String getLog_id() {
		return log_id;
	}

	/**
	 * @param log_id the log_id to set
	 */
	public void setLog_id(String log_id) {
		this.log_id = log_id;
	}
    
}
