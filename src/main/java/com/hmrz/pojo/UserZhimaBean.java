/**
 * 文  件  名：UserZhimaBean.java
 * 描        述：<描述>
 * 创  建  人：chs_sandy
 * 创建时间：2016年9月26日 下午5:03:03
 * 修改内容：<修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * @pre  $
 * 
 * @author chs_sandy
 * @date  2016年9月26日  下午5:03:03
 */
public class UserZhimaBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7398232946616739608L;
	/**
	 * 主键
	 */
	private String zhima_id;
	/**
	 * 用户id
	 */
	private String user_id;
	/**
	 * 身份证号
	 */
	private String cert_no;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 芝麻信用分
	 */
	private String score;
	/**
	 * 用户对用的openid
	 */
	private String open_id;
	/**
	 * 是否授权
	 */
	private String is_authorized;
	/**
	 * 手机号
	 */
	private String moble;
	/**
	 * 用户昵称
	 */
	private String nick_name;
	/**
	 * 更新时间
	 */
	private String update_time;
	
	public String getZhima_id() {
		return zhima_id;
	}
	public void setZhima_id(String zhima_id) {
		this.zhima_id = zhima_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getCert_no() {
		return cert_no;
	}
	public void setCert_no(String cert_no) {
		this.cert_no = cert_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getOpen_id() {
		return open_id;
	}
	public void setOpen_id(String open_id) {
		this.open_id = open_id;
	}
	public String getMoble() {
		return moble;
	}
	public void setMoble(String moble) {
		this.moble = moble;
	}
	public String getIs_authorized() {
		return is_authorized;
	}
	public void setIs_authorized(String is_authorized) {
		this.is_authorized = is_authorized;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

}
