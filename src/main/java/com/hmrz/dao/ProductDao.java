/**
 * 文 件 名:  ProductDao.java
 * 描    述:  <产品管理>
 * 创 建 人:  sandy
 * 创建时间:  2018年9月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.dao;

import java.util.List;
import java.util.Map;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.ProductBean;
import com.hmrz.search.ProductSearch;

/**
 *<pre>
 * 产品管理
 * </pre>
 * @author  sandy
 * @data  2015-5-22
 */
public interface ProductDao
{
	/**
     * <pre>
     * 产品列表
     * </pre> 
     * @param search 查询条件
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	List<ProductBean> getList(ProductSearch search) throws HmrzException;
    
	
	/**
     * <pre>
     * 查询产品列表总数
     * </pre> 
     * @param search 查询条件
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	int getCount(ProductSearch search) throws HmrzException;
	
	/**
     * <pre>
     * 查询产品
     * </pre> 
     * @param search 查询条件
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	ProductBean getProduct(ProductSearch search) throws HmrzException;
	

	
	/**
     * <pre>
     * 添加产品
     * </pre> 
     * @param ProductBean
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	String addProduct(ProductBean bean) throws HmrzException;
	
	/**
     * <pre>
     * 删除产品信息
     * </pre> 
     * @param map
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	String delProduct(Map<String, Object> map) throws HmrzException;
	
	/**
     * 修改产品信息
     * @param bean 要修改的产品
     * @return true：修改成功；false：修改失败
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    boolean modifyProduct(ProductBean bean) throws HmrzException; 
}
