/**
 * 文 件 名:  OpusDesignerBean.java
 * 描    述:   设计师
 * 创 建 人:  sandy
 * 创建时间:  2018年6月03日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * <设计师bean>
 * 
 * @author  sandy
 */
public class OpusDesignerBean implements Serializable
{
    private static final long serialVersionUID = 85674617832148982L;
    
    /**
     * id，主键
     */
    
    private String designer_id;
    private String designer_name;
    private String description;
	private String create_user;
    private String create_time;
    private String status;
    private String is_del;
	/**
	 * @return the designer_id
	 */
	public String getDesigner_id() {
		return designer_id;
	}
	/**
	 * @param designer_id the designer_id to set
	 */
	public void setDesigner_id(String designer_id) {
		this.designer_id = designer_id;
	}
	/**
	 * @return the designer_name
	 */
	public String getDesigner_name() {
		return designer_name;
	}
	/**
	 * @param designer_name the designer_name to set
	 */
	public void setDesigner_name(String designer_name) {
		this.designer_name = designer_name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the create_time
	 */
	public String getCreate_time() {
		return create_time;
	}
	/**
	 * @param create_time the create_time to set
	 */
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the is_del
	 */
	public String getIs_del() {
		return is_del;
	}
	/**
	 * @param is_del the is_del to set
	 */
	public void setIs_del(String is_del) {
		this.is_del = is_del;
	}
	/**
	 * @return the create_user
	 */
	public String getCreate_user() {
		return create_user;
	}
	/**
	 * @param create_user the create_user to set
	 */
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

}
