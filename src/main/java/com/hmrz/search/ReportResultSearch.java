/**
 * 文  件  名：ReportResultSearch.java
 * 描        述：<描述>
 * 创  建  人：chs_sandy
 * 创建时间：2016年11月23日 下午4:09:23
 * 修改内容：<修改内容>
 */
package com.hmrz.search;

/**
 * @pre $
 * 
 * @author chs_sandy
 * @date 2016年11月23日 下午4:09:23
 */
public class ReportResultSearch extends Page
{
    private static final long serialVersionUID = 1906828325855300553L;
    
    private String plan_space_id;
    
    private String execute_id;
    
    private String moble;
    
    private String status;
    
    private String is_normal;
    
    public String getPlan_space_id()
    {
        return plan_space_id;
    }
    
    public void setPlan_space_id(String plan_space_id)
    {
        this.plan_space_id = plan_space_id;
    }
    
    public String getExecute_id()
    {
        return execute_id;
    }
    
    public void setExecute_id(String execute_id)
    {
        this.execute_id = execute_id;
    }
    
    public String getMoble()
    {
        return moble;
    }
    
    public void setMoble(String moble)
    {
        this.moble = moble;
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
    
}
