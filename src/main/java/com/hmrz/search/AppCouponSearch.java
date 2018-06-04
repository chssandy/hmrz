package com.hmrz.search;

public class AppCouponSearch extends Page{
	
	private static final long serialVersionUID = -4668120074039420590L;

	private String moble;
	
	private String nick_name;
	
	private String create_btime;
	
	private String create_etime;
	
	/**
	 * 0:签到   1：推荐    2：被推荐
	 */
	private String type = "1";
	
	private String is_used;
	
	/**
	 * 签到天数开始
	 */
	private String b_continue_days;
	
	/**
	 * 签到天数结束
	 */
	private String e_continue_days;
	
	public String getMoble() {
		return moble;
	}

	public void setMoble(String moble) {
		this.moble = moble;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getCreate_btime() {
		return create_btime;
	}

	public void setCreate_btime(String create_btime) {
		this.create_btime = create_btime;
	}

	public String getCreate_etime() {
		return create_etime;
	}

	public void setCreate_etime(String create_etime) {
		this.create_etime = create_etime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIs_used() {
		return is_used;
	}

	public void setIs_used(String is_used) {
		this.is_used = is_used;
	}

	public String getB_continue_days() {
		return b_continue_days;
	}

	public void setB_continue_days(String b_continue_days) {
		this.b_continue_days = b_continue_days;
	}

	public String getE_continue_days() {
		return e_continue_days;
	}

	public void setE_continue_days(String e_continue_days) {
		this.e_continue_days = e_continue_days;
	}
}
