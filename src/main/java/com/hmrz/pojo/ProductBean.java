/**
 * 文 件 名:  ProductBean.java
 * 描    述:   产品
 * 创 建 人:  sandy
 * 创建时间:  2018年6月03日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * <产品bean>
 * 
 * @author  sandy
 */
public class ProductBean implements Serializable
{
    private static final long serialVersionUID = 85674617832148982L;
    
    /**
     * id，主键
     */
    
    private String product_id;
    private String product_name;
    private String description;
    private String category_id;
    private String create_user;
    private String create_time;
    private String status;
    private String is_del;
	/**
	 * @return the product_id
	 */
	public String getProduct_id() {
		return product_id;
	}
	/**
	 * @param product_id the product_id to set
	 */
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
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
	 * @return the category_id
	 */
	public String getCategory_id() {
		return category_id;
	}
	/**
	 * @param category_id the category_id to set
	 */
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
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
	/**
	 * @return the product_name
	 */
	public String getProduct_name() {
		return product_name;
	}
	/**
	 * @param product_name the product_name to set
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

}
