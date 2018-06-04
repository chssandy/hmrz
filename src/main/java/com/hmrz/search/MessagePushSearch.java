/**
 * 文 件 名:  MessagePushSearch.java
 * 描    述:  <描述>
 * 创 建 人:  sandy
 * 创建时间:  2016年05月05日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 消息推送管理查询bean
 * </pre>
 * 
 * @author  sandy
 * @data  2016年05月05日
 */
public class MessagePushSearch extends Page
{
    private static final long serialVersionUID = 5594132554775161723L;
    
    private String manager_name;
    
    private String type;
    
    private String plat_form;
    
    private String create_btime;
    
    private String create_etime;

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlat_form() {
		return plat_form;
	}

	public void setPlat_form(String plat_form) {
		this.plat_form = plat_form;
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
