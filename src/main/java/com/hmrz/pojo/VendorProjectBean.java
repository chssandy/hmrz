/**
 * 文 件 名:  VendorProjectBean.java
 * 描    述:  商户项目信息
 * 创 建 人:  sandy
 * 创建时间:  2015年5月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * <商户项目信息bean>
 * 
 * @author  sandy
 * @data  2015年5月22日
 */
public class VendorProjectBean implements Serializable
{
    private static final long serialVersionUID = 85674617832148982L;
    
    /**
     * id，主键
     */
    private String project_id;
    
    /**
     * 序列号
     */
    private String serial_number;
    
    /**
     * 商户id
     */
    private String vendor_id;
    
    /**
     * 项目名称
     */
    private String project_name;
    
    /**
     * 包含任务
     */
    private List<String> tasks;
    
    /**
     * 项目要求
     */
    private String project_requirement;
    
    /**
     * 业务类型
     */
    private String task_biz;
    
    /**
     * 任务类型
     */
    private String task_type;
    /**
     * 媒体类型
     */
    private String task_type_id;
    
    /**
     * 备注
     */
    private String remark;
    
    /**
     * 创建时间
     */
    private String create_time;
    
    /**
     * 添加人
     */
    private String create_user;
    
    /**
     * 添加人类型    1：运营代发   0:客户自行发布
     */
    private String create_type;
    /**
     * 代理人
     */
    private String agent;
    
    /**
     * 是否删除
     */
    private String is_del;
    
    /**
     * 商户名称
     */
    private String vendor_name;
    
    /**
     * 业务类型名称
     */
    private String task_biz_name;
    /**
     * 任务类型名称
     */
    private String task_type_name;
    /**
     * 媒体类型名称
     */
    private String task_type_id_name;
    
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public List<String> getTasks() {
		return tasks;
	}
	public void setTasks(List<String> tasks) {
		this.tasks = tasks;
	}
	public String getProject_requirement() {
		return project_requirement;
	}
	public void setProject_requirement(String project_requirement) {
		this.project_requirement = project_requirement;
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
	public String getTask_type_id() {
		return task_type_id;
	}
	public void setTask_type_id(String task_type_id) {
		this.task_type_id = task_type_id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getIs_del() {
		return is_del;
	}
	public void setIs_del(String is_del) {
		this.is_del = is_del;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getTask_biz_name() {
		return task_biz_name;
	}
	public void setTask_biz_name(String task_biz_name) {
		this.task_biz_name = task_biz_name;
	}
	public String getTask_type_name() {
		return task_type_name;
	}
	public void setTask_type_name(String task_type_name) {
		this.task_type_name = task_type_name;
	}
	public String getTask_type_id_name() {
		return task_type_id_name;
	}
	public void setTask_type_id_name(String task_type_id_name) {
		this.task_type_id_name = task_type_id_name;
	}
	public String getCreate_type() {
		return create_type;
	}
	public void setCreate_type(String create_type) {
		this.create_type = create_type;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
    
}
