/**
 * 文 件 名:  DBTagBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2017年5月16日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

/**
 * <pre>
 * 点位记录标签
 * </pre>
 * 
 * @author  pfma
 * @data  2017年5月16日
 */
public class DBTagBean
{
    private String id;
    
    private String name;
    
    private String type;
    
    private String is_available;
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public String getIs_available()
    {
        return is_available;
    }
    
    public void setIs_available(String is_available)
    {
        this.is_available = is_available;
    }
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("DBTagBean [");
        if (id != null)
        {
            builder.append("id=");
            builder.append(id);
            builder.append(", ");
        }
        if (name != null)
        {
            builder.append("name=");
            builder.append(name);
            builder.append(", ");
        }
        if (type != null)
        {
            builder.append("type=");
            builder.append(type);
            builder.append(", ");
        }
        if (is_available != null)
        {
            builder.append("is_available=");
            builder.append(is_available);
        }
        builder.append("]");
        return builder.toString();
    }
}
