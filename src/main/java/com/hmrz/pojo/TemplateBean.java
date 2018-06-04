/**
 * 模板bean
 */
package com.hmrz.pojo;

import java.io.Serializable;
import java.util.List;

public class TemplateBean implements Serializable
{
    private static final long serialVersionUID = 7499798959097387856L;
    
    /**
     * 模板ID
     */
    private String template_id;
    
    /**
     * 模板名称
     */
    private String template_name;
    
    /**
     * 模板描述
     */
    private String descript;
    
    /**
     * 模板所属类别id
     */
    private String task_type_id;
    /**
     * 任务类别名称
     */
    private String task_type_name;
    
    /**
     * 模板所属业务类别
     */
    private String task_biz;
    
    /**
     * 创建人
     */
    private String create_user;
    /**
     * 创建时间
     */
    private String create_time;
    
    /**
     * 创建类别
     */
    private String create_type;
    
    /**
     * 状态
     */
    private String status;
    
    /**
     * 是否公开
     */
    private String is_open;
    
    /**
     * 题目列表
     */
    private List<TaskTopicBean> topicList;
    

	public String getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(String template_id) {
		this.template_id = template_id;
	}

	public String getTemplate_name() {
		return template_name;
	}

	public void setTemplate_name(String template_name) {
		this.template_name = template_name;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getTask_type_id() {
		return task_type_id;
	}

	public void setTask_type_id(String task_type_id) {
		this.task_type_id = task_type_id;
	}

	public String getTask_biz() {
		return task_biz;
	}

	public void setTask_biz(String task_biz) {
		this.task_biz = task_biz;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public String getCreate_type() {
		return create_type;
	}

	public void setCreate_type(String create_type) {
		this.create_type = create_type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIs_open() {
		return is_open;
	}

	public void setIs_open(String is_open) {
		this.is_open = is_open;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<TaskTopicBean> getTopicList() {
		return topicList;
	}

	public void setTopicList(List<TaskTopicBean> topicList) {
		this.topicList = topicList;
	}

	public String getTask_type_name() {
		return task_type_name;
	}

	public void setTask_type_name(String task_type_name) {
		this.task_type_name = task_type_name;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
    
}
