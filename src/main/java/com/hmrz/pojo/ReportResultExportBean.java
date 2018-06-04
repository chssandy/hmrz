/**
 * 文 件 名:  ReportResultExportBean.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2016年11月30日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.util.Date;

/**
 * <pre>
 * 执行结果导出bean
 * </pre>
 * 
 * @author  pfma
 * @data  2016年11月30日
 */
public class ReportResultExportBean
{
    private String execute_id;
    
    private Date upload_time;
    
    private String imgs;
    
    private int is_normal;
    
    public int getIs_normal()
    {
        return is_normal;
    }
    
    public void setIs_normal(int is_normal)
    {
        this.is_normal = is_normal;
    }
    
    public String getExecute_id()
    {
        return execute_id;
    }
    
    public void setExecute_id(String execute_id)
    {
        this.execute_id = execute_id;
    }
    
    public Date getUpload_time()
    {
        return upload_time;
    }
    
    public void setUpload_time(Date upload_time)
    {
        this.upload_time = upload_time;
    }
    
    public String getImgs()
    {
        return imgs;
    }
    
    public void setImgs(String imgs)
    {
        this.imgs = imgs;
    }
}
