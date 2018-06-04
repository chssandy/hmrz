package com.hmrz.search;

public class GroupSearch extends Page {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3629149835891680223L;
	
	private String vendor_id;
	
	private String name;
	
	private String create_btime;
	
	private String create_etime;

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
