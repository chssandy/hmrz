package com.hmrz.search;

public class DBUserSearch extends Page{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3969800541082084040L;

	private String moble;
	
	private String vendor_name;
	
	private String create_btime;
	
	private String create_etime;

	public String getMoble() {
		return moble;
	}

	public void setMoble(String moble) {
		this.moble = moble;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
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
}
