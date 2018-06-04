/**
 * 文 件 名:  ProductCategorySearch.java
 * 描    述:  <产品类别查询bean>
 * 创 建 人:  sandy
 * 创建时间:  2018年6月4日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 产品类别查询bean
 * </pre>
 * 
 * @author  sandy
 * @data  2018年6月4日
 */
public class ProductCategorySearch extends Page
{
    private static final long serialVersionUID = -1450231905710001482L;
    
    private String category_id_search;
    
    private String category_name_search;

	/**
	 * @return the category_id_search
	 */
	public String getCategory_id_search() {
		return category_id_search;
	}

	/**
	 * @param category_id_search the category_id_search to set
	 */
	public void setCategory_id_search(String category_id_search) {
		this.category_id_search = category_id_search;
	}

	/**
	 * @return the category_name_search
	 */
	public String getCategory_name_search() {
		return category_name_search;
	}

	/**
	 * @param category_name_search the category_name_search to set
	 */
	public void setCategory_name_search(String category_name_search) {
		this.category_name_search = category_name_search;
	}

}
