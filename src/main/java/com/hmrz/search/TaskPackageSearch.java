/**
 * 文 件 名:  TaskPackageSearch.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年11月8日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 任务包查询bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年11月8日
 */
public class TaskPackageSearch extends Page
{
    private static final long serialVersionUID = 3767617488665635047L;
    
    private String id;
    
    private String name;
    
    private String media_type;
    
    private String create_btime;
    
    private String create_etime;
    
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
    
    public String getMedia_type()
    {
        return media_type;
    }
    
    public void setMedia_type(String media_type)
    {
        this.media_type = media_type;
    }
    
    public String getCreate_btime()
    {
        return create_btime;
    }
    
    public void setCreate_btime(String create_btime)
    {
        this.create_btime = create_btime;
    }
    
    public String getCreate_etime()
    {
        return create_etime;
    }
    
    public void setCreate_etime(String create_etime)
    {
        this.create_etime = create_etime;
    }
    
    public static long getSerialversionuid()
    {
        return serialVersionUID;
    }
}
