/**
 * 文 件 名:  BannerSearch.java
 * 描    述:  <banner查询bean>
 * 创 建 人:  sandy
 * 创建时间:  2015年5月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * banner查询bean
 * </pre>
 * 
 * @author  sandy
 * @data  2015年5月22日
 */
public class BannerSearch extends Page
{
    private static final long serialVersionUID = -1450231905710001482L;
    /**
     * banner标题
     */
    private String title_search;
    
    private String province_code = "-1";
    
    private String city_code = "-1";
    
    private String create_btime;
    
    private String create_etime;
    
    private String show_item;

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

	public String getProvince_code() {
		return province_code;
	}

	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}

	public String getCity_code() {
		return city_code;
	}

	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}

	public String getTitle_search() {
		return title_search;
	}

	public void setTitle_search(String title_search) {
		this.title_search = title_search;
	}

	public String getShow_item() {
		return show_item;
	}

	public void setShow_item(String show_item) {
		this.show_item = show_item;
	}


}
