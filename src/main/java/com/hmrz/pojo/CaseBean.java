/**
 * 文 件 名:  CaseBean.java
 * 描    述:   产品类别
 * 创 建 人:  sandy
 * 创建时间:  2018年6月03日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * <案例bean>
 * 
 * @author  sandy
 */
public class CaseBean implements Serializable
{
    private static final long serialVersionUID = 85674617832148982L;
    
    /**
     * id，主键
     */
    private String case_id;
    private String name;
    private String imgs;
    private String description;
    private String create_user;
    private String create_time;
    private String status;
    private String is_del;
	/**
	 * @return the case_id
	 */
	public String getCase_id() {
		return case_id;
	}
	/**
	 * @param case_id the case_id to set
	 */
	public void setCase_id(String case_id) {
		this.case_id = case_id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the imgs
	 */
	public String getImgs() {
		return imgs;
	}
	/**
	 * @param imgs the imgs to set
	 */
	public void setImgs(String imgs) {
		this.imgs = imgs;
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
