/**
 * 文 件 名:  OpusDesignerSearch.java
 * 描    述:  <设计师bean>
 * 创 建 人:  sandy
 * 创建时间:  2018年6月4日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * 设计师查询bean
 * </pre>
 * 
 * @author  sandy
 * @data  2018年6月4日
 */
public class OpusDesignerSearch extends Page
{
    private static final long serialVersionUID = -1450231905710001482L;
    
    private String designer_id_search;
    
    private String designer_name_search;
    
    private String status_search;

	/**
	 * @return the designer_name_search
	 */
	public String getDesigner_name_search() {
		return designer_name_search;
	}

	/**
	 * @param designer_name_search the designer_name_search to set
	 */
	public void setDesigner_name_search(String designer_name_search) {
		this.designer_name_search = designer_name_search;
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
	 * @return the designer_id_search
	 */
	public String getDesigner_id_search() {
		return designer_id_search;
	}

	/**
	 * @param designer_id_search the designer_id_search to set
	 */
	public void setDesigner_id_search(String designer_id_search) {
		this.designer_id_search = designer_id_search;
	}

}
