/**
 * 文 件 名:  RoleBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年11月2日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.util.Date;

/**
 * <pre>
 * 管理员角色bean
 * </pre>
 * 
 * @author  pfma
 * @data  2015年11月2日
 */
public class RoleBean
{
    /**
     * id
     */
    private String role_id;
    
    /**
     * 角色名
     */
    private String role_name;
    
    /**
     * 排序权值
     */
    private int priority;
    
    /**
     * 创建时间
     */
    private Date create_time;
    
    /**
     * 创建人
     */
    private String create_user;
    
    /**
     * 备注
     */
    private String remark;
    
    public String getRole_id()
    {
        return role_id;
    }
    
    public void setRole_id(String role_id)
    {
        this.role_id = role_id;
    }
    
    public String getRole_name()
    {
        return role_name;
    }
    
    public void setRole_name(String role_name)
    {
        this.role_name = role_name;
    }
    
    public int getPriority()
    {
        return priority;
    }
    
    public void setPriority(int priority)
    {
        this.priority = priority;
    }
    
    public Date getCreate_time()
    {
        return create_time;
    }
    
    public void setCreate_time(Date create_time)
    {
        this.create_time = create_time;
    }
    
    public String getCreate_user()
    {
        return create_user;
    }
    
    public void setCreate_user(String create_user)
    {
        this.create_user = create_user;
    }
    
    public String getRemark()
    {
        return remark;
    }
    
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("RoleBean [role_id=");
        builder.append(role_id);
        builder.append(", role_name=");
        builder.append(role_name);
        builder.append(", priority=");
        builder.append(priority);
        builder.append(", create_time=");
        builder.append(create_time);
        builder.append(", create_user=");
        builder.append(create_user);
        builder.append(", remark=");
        builder.append(remark);
        builder.append("]");
        return builder.toString();
    }
}
