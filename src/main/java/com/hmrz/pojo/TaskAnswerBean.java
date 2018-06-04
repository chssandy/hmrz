/**
 * 任务结果bean
 * Author：sandy
 */
package com.hmrz.pojo;

import java.io.Serializable;

public class TaskAnswerBean implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7499798959097387856L;
	/**
	 * 题目ID
	 */
	private String cid;
	/**
	 * 题目
	 */
	private String label;
	/**
	 * 题目描述
	 */
	private String descript;
	
	/**
	 * 题目类型
	 */
	private String field_type;
	
	/**
	 * 题目选项
	 */
	private String options;
	/**
	 * 题目答案
	 */
	private String value;
	/**
	 * 题目图片
	 */
	private String img_url;
	/**
	 * 是否必答题
	 */
	private String required;
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getField_type() {
		return field_type;
	}
	public void setField_type(String field_type) {
		this.field_type = field_type;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getRequired() {
		return required;
	}
	public void setRequired(String required) {
		this.required = required;
	}
		
}
