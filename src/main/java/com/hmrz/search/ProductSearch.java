/**
 * 文 件 名:  ProductSearch.java
 * 描    述:  <产品查询bean>
 * 创 建 人:  sandy
 * 创建时间:  2018年6月4日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 产品查询bean
 * </pre>
 * 
 * @author  sandy
 * @data  2018年6月4日
 */
public class ProductSearch extends Page
{
    private static final long serialVersionUID = -1450231905710001482L;
    
    private String product_id_search;
    
    private String product_name_search;
    
    private String category_id_search;
    
    private String status_search;

	/**
	 * @return the product_id_search
	 */
	public String getProduct_id_search() {
		return product_id_search;
	}

	/**
	 * @param product_id_search the product_id_search to set
	 */
	public void setProduct_id_search(String product_id_search) {
		this.product_id_search = product_id_search;
	}

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
	 * @return the status_search
	 */
	public String getStatus_search() {
		return status_search;
	}

	/**
	 * @param status_search the status_search to set
	 */
	public void setStatus_search(String status_search) {
		this.status_search = status_search;
	}

	/**
	 * @return the product_name_search
	 */
	public String getProduct_name_search() {
		return product_name_search;
	}

	/**
	 * @param product_name_search the product_name_search to set
	 */
	public void setProduct_name_search(String product_name_search) {
		this.product_name_search = product_name_search;
	}

}
