/**
 * 文 件 名:  PackageTaskSearch.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年11月11日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 任务包任务查询bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年11月11日
 */
public class PackageTaskSearch extends Page
{
    private static final long serialVersionUID = 144577234274334795L;
    
    private String package_id;
    
    private int media_type;
    
    private String task_id;
    
    private String task_name;
    
    public String getPackage_id()
    {
        return package_id;
    }
    
    public void setPackage_id(String package_id)
    {
        this.package_id = package_id;
    }
    
    public int getMedia_type()
    {
        return media_type;
    }
    
    public void setMedia_type(int media_type)
    {
        this.media_type = media_type;
    }
    
    public String getTask_id()
    {
        return task_id;
    }
    
    public void setTask_id(String task_id)
    {
        this.task_id = task_id;
    }
    
    public String getTask_name()
    {
        return task_name;
    }
    
    public void setTask_name(String task_name)
    {
        this.task_name = task_name;
    }
}
