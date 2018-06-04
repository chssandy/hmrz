/**
 * 文 件 名:  BrandService.java
 * 描    述:  <品牌管理>
 * 创 建 人:  sandy
 * 创建时间:  2015年5月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.service;

import java.util.List;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.ProductCategoryBean;
import com.hmrz.search.ProductCategorySearch;

/**
 * <pre>
 * 品牌操作接口
 * </pre>
 * @author  sandy
 * @data  2015-5-22
 */
public interface ProductCategoryService
{
	/**
     * <pre>
     * 产品类别列表
     * </pre> 
     * @param search 查询条件
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	List<ProductCategoryBean> getProductCategoryList(ProductCategorySearch vSearch) throws HmrzException;
    
	/**
     * <pre>
     * 查询产品类别信息
     * </pre> 
     * @param search 查询条件
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	ProductCategoryBean getProductCategory(ProductCategorySearch vSearch) throws HmrzException;
	
	/**
     * 查询所有产品类别
     */
	List<ProductCategoryBean> getProductCategoryAll() throws HmrzException;
	
	/**
     * <pre>
     * 查询产品类别列表总数
     * </pre> 
     * @param search 查询条件
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	int getProductCategoryCount(ProductCategorySearch vSearch) throws HmrzException;
	
	/**
     * <pre>
     * 添加产品类别信息
     * </pre> 
     * @param VendorBean
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	String addProductCategory(ProductCategoryBean brandBean) throws HmrzException;
	
	/**
     * <pre>
     * 删除产品类别信息
     * </pre> 
     * @param VendorBean
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	String delProductCategory(String id) throws HmrzException;
	
	/**
     * 修改产品类别信息
     * @param brand 要修改的品牌
     * @return true：修改成功；false：修改失败
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    boolean modifyProductCategory(ProductCategoryBean brand) throws HmrzException;
    
}
