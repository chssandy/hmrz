package com.hmrz.search;

public class DBTagSearch extends Page
{
    private static final long serialVersionUID = -8163693939235322533L;
    
    private String name;
    
    private String type;
    
    private String is_available;
    
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
}
