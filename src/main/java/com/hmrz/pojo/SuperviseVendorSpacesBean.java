/**
 * 文 件 名:  SuperviseVendorSpacesBean.java
 * 描    述:  <描述>
 * 创 建 人:  sandy
 * 创建时间:  2017年04月20日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * <pre>
 * 投放计划点位bean
 * </pre>
 * 
 * @author  sandy
 * @data  2017年04月20日
 */
public class SuperviseVendorSpacesBean implements Serializable
{
	private static final long serialVersionUID = 4894293412641967065L;

	private String vendor_space_id;
    
    private String vendor_id;
    
    private String space_id;
    
    private String name;
    
    private String rename;
    
    private String create_time;
    
    private String create_user;
    
    private String update_time;
    
    private String update_user;
    
    private String province;
    
    private String city;
    
    private String address;
    
    private String media_type;
    
    private String first_type;
    
    private String second_type;
    
    /**
     * 广告位位置
     */
    private String position;
    
    private int id_del;

	public String getVendor_space_id() {
		return vendor_space_id;
	}

	public void setVendor_space_id(String vendor_space_id) {
		this.vendor_space_id = vendor_space_id;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getSpace_id() {
		return space_id;
	}

	public void setSpace_id(String space_id) {
		this.space_id = space_id;
	}

	public String getRename() {
		return rename;
	}

	public void setRename(String rename) {
		this.rename = rename;
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

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMedia_type() {
		return media_type;
	}

	public void setMedia_type(String media_type) {
		this.media_type = media_type;
	}

	public String getFirst_type() {
		return first_type;
	}

	public void setFirst_type(String first_type) {
		this.first_type = first_type;
	}

	public String getSecond_type() {
		return second_type;
	}

	public void setSecond_type(String second_type) {
		this.second_type = second_type;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getId_del() {
		return id_del;
	}

	public void setId_del(int id_del) {
		this.id_del = id_del;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	public String getUpdate_user() {
		return update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
