/**
 * 文 件 名:  UserIncomeBean.java
 * 描    述:  用户收入
 * 创 建 人:  sandy
 * 创建时间:  2015年11月27日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * <pre>
 * 用户收入bean
 * </pre>
 * 
 * @author  sandy
 * @data  2015年11月6日
 */
public class UserIncomeBean implements Serializable
{
    private static final long serialVersionUID = 1038362887501775779L;
    
    
    private String income_id;
    private String user_id;
    private String task_biz;
    private String task_type;
    private String income;
    private String task_id;
    private String task_name;
    private String create_time;
	public String getIncome_id() {
		return income_id;
	}
	public void setIncome_id(String income_id) {
		this.income_id = income_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getTask_biz() {
		return task_biz;
	}
	public void setTask_biz(String task_biz) {
		this.task_biz = task_biz;
	}
	public String getTask_type() {
		return task_type;
	}
	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
}
