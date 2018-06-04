/**
 * 文 件 名:  PotentialBean.java
 * 描    述:  <描述>
 * 创 建 人:  sandy
 * 创建时间:  2015年7月27日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * <pre>
 * 潜在用户bean
 * </pre>
 * 
 * @author  sandy
 * @data  2015年7月27日
 */
public class PotentialBean implements Serializable
{
	private static final long serialVersionUID = 7204187662007676204L;

	private String potential_id;
    
    /**
     * 城市
     */
    private String city;
    
    /**
     * 区/县
     */
    private String district_code;
    
    /**
     *  城市名
     */
    private String city_name;
    
    /**
     * 区/县名
     */
    private String district_name;
    
    /**
     * 用户名
     */
    private String name;
    
    /**
     * 性别 0：男 1：女
     */
    private String sex;
    
    /**
     * 手机号
     */
    private String moble;
    
    private String qq;
    
    /**
     * 最后联系时间
     */
    private String last_touch_date;
    
    /**
     * 入库时间
     */
    private String create_time;
    
    /**
     * 备注
     */
    private String remark;

	public String getPotential_id() {
		return potential_id;
	}

	public void setPotential_id(String potential_id) {
		this.potential_id = potential_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict_code() {
		return district_code;
	}

	public void setDistrict_code(String district_code) {
		this.district_code = district_code;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getDistrict_name() {
		return district_name;
	}

	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMoble() {
		return moble;
	}

	public void setMoble(String moble) {
		this.moble = moble;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getLast_touch_date() {
		return last_touch_date;
	}

	public void setLast_touch_date(String last_touch_date) {
		this.last_touch_date = last_touch_date;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
    
}
