/**
 * 文 件 名:  BrandSearch.java
 * 描    述:  <品牌查询bean>
 * 创 建 人:  sandy
 * 创建时间:  2015年11月03日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 品牌查询bean
 * </pre>
 * 
 * @author  sandy
 * @data  2015年11月03日
 */
public class BrandSearch extends Page
{
    private static final long serialVersionUID = -1450231905710001482L;
    
    private String brand_id_search;
    
    private String brand_name_search;

	public String getBrand_name_search() {
		return brand_name_search;
	}

	public void setBrand_name_search(String brand_name_search) {
		this.brand_name_search = brand_name_search;
	}

	public String getBrand_id_search() {
		return brand_id_search;
	}

	public void setBrand_id_search(String brand_id_search) {
		this.brand_id_search = brand_id_search;
	}


}
