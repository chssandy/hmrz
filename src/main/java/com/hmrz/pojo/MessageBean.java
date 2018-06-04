/**
 * 文 件 名:  MessageBean.java
 * 描    述:  消息推送
 * 创 建 人:  sandy
 * 创建时间:  2015年6月15日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * < message bean>
 * 
 * @author  sandy
 * @data  2015年6月15日
 */
public class MessageBean implements Serializable
{
    private static final long serialVersionUID = 85674617832148982L;
    
    /**
     * message_id，主键
     */
    private String message_id;
    /**
     * 消息接收人
     */
    private String accepter;
    /**
     * 消息内容
     */
    private String content;
    /**
     * 参数
     */
    private String params;
    /**
     * 消息发送时间
     */
    private String push_time;
    /**
     * 消息类型  0:短信  1：PUSH
     */
    private String type;
    /**
     * 业务行为   0：manager推送    1：系统发送
     */
    private String biz_type;
    /**
     * 备注
     */
    private String remark;
    /**
     * manager推送消息id
     */
    private String push_id;
    /**
     * 创建时间
     */
    private String create_time;
	public String getMessage_id() {
		return message_id;
	}
	public void setMessage_id(String message_id) {
		this.message_id = message_id;
	}
	public String getAccepter() {
		return accepter;
	}
	public void setAccepter(String accepter) {
		this.accepter = accepter;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getPush_time() {
		return push_time;
	}
	public void setPush_time(String push_time) {
		this.push_time = push_time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBiz_type() {
		return biz_type;
	}
	public void setBiz_type(String biz_type) {
		this.biz_type = biz_type;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPush_id() {
		return push_id;
	}
	public void setPush_id(String push_id) {
		this.push_id = push_id;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
}
