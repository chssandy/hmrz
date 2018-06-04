/**
 * 文 件 名:  MessagePushBean.java
 * 描    述:  消息推送管理
 * 创 建 人:  sandy
 * 创建时间:  2015年6月15日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * < s_message_push bean>
 * 
 * @author  sandy
 * @data  2015年6月15日
 */
public class MessagePushBean implements Serializable
{
    private static final long serialVersionUID = 85674617832148982L;
    
    private String push_id;
    
    private String type; // 0：短信   1：push
    
    private String plat_form; //0：all  1：android  2：IOS
    
    private String extras; //推送目标
    
    private String content; //内容
    
    private String is_real_time; // 是否实时发送
    
    private Date push_time; //发送时间
    
    private String aims; //任务目标规则
    
    private String create_time;
    
    private String create_user;
    
    public String getPush_id()
    {
        return push_id;
    }
    
    public void setPush_id(String push_id)
    {
        this.push_id = push_id;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public String getPlat_form()
    {
        return plat_form;
    }
    
    public void setPlat_form(String plat_form)
    {
        this.plat_form = plat_form;
    }
    
    public String getContent()
    {
        return content;
    }
    
    public void setContent(String content)
    {
        this.content = content;
    }
    
    public String getIs_real_time()
    {
        return is_real_time;
    }
    
    public void setIs_real_time(String is_real_time)
    {
        this.is_real_time = is_real_time;
    }
    
    public Date getPush_time()
    {
        if (null != push_time && push_time.getTime() > new Date().getTime())
        {
            return push_time;
        }
        else
        {
            return null;
        }
    }
    
    public void setPush_time(Date push_time)
    {
        this.push_time = push_time;
    }
    
    public String getAims()
    {
        return aims;
    }
    
    public void setAims(String aims)
    {
        this.aims = aims;
    }
    
    public String getCreate_time()
    {
        return create_time;
    }
    
    public void setCreate_time(String create_time)
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
    
    public String getExtras()
    {
        return extras;
    }
    
    public void setExtras(String extras)
    {
        this.extras = extras;
    }
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("MessagePushBean [");
        if (push_id != null)
        {
            builder.append("push_id=");
            builder.append(push_id);
            builder.append(", ");
        }
        if (type != null)
        {
            builder.append("type=");
            builder.append(type);
            builder.append(", ");
        }
        if (plat_form != null)
        {
            builder.append("plat_form=");
            builder.append(plat_form);
            builder.append(", ");
        }
        if (extras != null)
        {
            builder.append("extras=");
            builder.append(extras);
            builder.append(", ");
        }
        if (content != null)
        {
            builder.append("content=");
            builder.append(content);
            builder.append(", ");
        }
        if (is_real_time != null)
        {
            builder.append("is_real_time=");
            builder.append(is_real_time);
            builder.append(", ");
        }
        if (push_time != null)
        {
            builder.append("push_time=");
            builder.append(push_time);
            builder.append(", ");
        }
        if (aims != null)
        {
            builder.append("aims=");
            builder.append(aims);
            builder.append(", ");
        }
        if (create_time != null)
        {
            builder.append("create_time=");
            builder.append(create_time);
            builder.append(", ");
        }
        if (create_user != null)
        {
            builder.append("create_user=");
            builder.append(create_user);
        }
        builder.append("]");
        return builder.toString();
    }
    
}
