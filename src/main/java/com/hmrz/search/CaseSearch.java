/**
 * 文 件 名:  CaseSearch.java
 * 描    述:  <案例查询bean>
 * 创 建 人:  sandy
 * 创建时间:  2018年6月4日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 案例查询bean
 * </pre>
 * 
 * @author  sandy
 * @data  2018年6月4日
 */
public class CaseSearch extends Page
{
    private static final long serialVersionUID = -1450231905710001482L;
    
    private String case_id_search;
    
    private String name_search;

	private String status_search;

	/**
	 * @return the name_search
	 */
	public String getName_search() {
		return name_search;
	}

	/**
	 * @param name_search the name_search to set
	 */
	public void setName_search(String name_search) {
		this.name_search = name_search;
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
	 * @return the case_id_search
	 */
	public String getCase_id_search() {
		return case_id_search;
	}

	/**
	 * @param case_id_search the case_id_search to set
	 */
	public void setCase_id_search(String case_id_search) {
		this.case_id_search = case_id_search;
	}

}
