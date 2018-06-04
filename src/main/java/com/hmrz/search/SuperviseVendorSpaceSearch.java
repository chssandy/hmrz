/**
 * 文 件 名:  SuperviseVendorSpaceSearch.java
 * 描    述:  <描述>
 * 创 建 人:  sandy	
 * 创建时间:  2017年04月20日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 客户拥有点位查询
 * </pre>
 * 
 * @author  sandy
 * @data  2017年04月20日
 */
public class SuperviseVendorSpaceSearch extends Page
{
    private static final long serialVersionUID = 2188325575055553714L;
    
    private String vendor_id;
    
    private String province_id;
    
    private String city_id;
    
    private String name;

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getProvince_id() {
		return province_id;
	}

	public void setProvince_id(String province_id) {
		this.province_id = province_id;
	}

	public String getCity_id() {
		return city_id;
	}

	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
