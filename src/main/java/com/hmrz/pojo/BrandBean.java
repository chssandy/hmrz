/**
 * 文 件 名:  BrandBean.java
 * 描    述:  品牌
 * 创 建 人:  sandy
 * 创建时间:  2015年11月03日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * <品牌bean>
 * 
 * @author  sandy
 * @data  2015年11月03日
 */
public class BrandBean implements Serializable
{
    private static final long serialVersionUID = 85674617832148982L;
    
    /**
     * id，主键
     */
    private String brand_id;
    
    /**
     * 项目名称
     */
    private String brand_name;
    
    /**
     * 创建时间
     */
    private String create_time;
    
    /**
     * 添加人
     */
    private String create_user;
    
	public String getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BrandBean [");
		if (brand_id != null) {
			builder.append("brand_id=");
			builder.append(brand_id);
			builder.append(", ");
		}
		if (brand_name != null) {
			builder.append("brand_name=");
			builder.append(brand_name);
			builder.append(", ");
		}
		if (create_time != null) {
			builder.append("create_time=");
			builder.append(create_time);
			builder.append(", ");
		}
		if (create_user != null) {
			builder.append("create_user=");
			builder.append(create_user);
		}
		builder.append("]");
		return builder.toString();
	}
    
}
