package com.hmrz.search;

/**
 * 微信分享任务查询bean
 * @author sandy
 *
 */
public class SharewxSearch extends Page
{
    private static final long serialVersionUID = -8646945689695969830L;
    
    private String name;
    
    private String task_id;
    
    private String status;
    
    private String customer_id;
    
    private String vendor_id;
    
    private String vendor_name;
    
    private String is_desc = "0";
    
    private String create_btime;
    
    private String create_etime;
    
    public String getCustomer_id()
    {
        return customer_id;
    }
    
    public void setCustomer_id(String customer_id)
    {
        this.customer_id = customer_id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getTask_id()
    {
        return task_id;
    }
    
    public void setTask_id(String task_id)
    {
        this.task_id = task_id;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public String getIs_desc() {
		return is_desc;
	}

	public void setIs_desc(String is_desc) {
		this.is_desc = is_desc;
	}

	public String getCreate_btime() {
		return create_btime;
	}

	public void setCreate_btime(String create_btime) {
		this.create_btime = create_btime;
	}

	public String getCreate_etime() {
		return create_etime;
	}

	public void setCreate_etime(String create_etime) {
		this.create_etime = create_etime;
	}
}
