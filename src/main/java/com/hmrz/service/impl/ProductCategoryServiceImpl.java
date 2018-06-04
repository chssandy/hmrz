/**
 * 文 件 名:  BrandServiceImpl.java
 * 描    述:  <品牌管理>
 * 创 建 人:  sandy
 * 创建时间:  2015年5月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.dao.ProductCategoryDao;
import com.hmrz.pojo.ProductCategoryBean;
import com.hmrz.search.ProductCategorySearch;
import com.hmrz.service.ProductCategoryService;

/**
 * <pre>
 * 品牌管理相关操作接口
 * </pre>
 * @author  sandy
 * @data  2015-5-22
 */
public class ProductCategoryServiceImpl   implements  ProductCategoryService
{
	@Autowired
	private ProductCategoryDao dao;
	
	/* (non-Javadoc)
	 * @see com.hmrz.service.ProductCategoryService#getProductCategoryList(com.hmrz.search.ProductCategorySearch)
	 */
	@Override
	public List<ProductCategoryBean> getProductCategoryList(ProductCategorySearch vSearch) throws HmrzException {
		return dao.getProductCategoryList(vSearch);
	}


	/* (non-Javadoc)
	 * @see com.hmrz.service.ProductCategoryService#getProductCategory(com.hmrz.search.ProductCategorySearch)
	 */
	@Override
	public ProductCategoryBean getProductCategory(ProductCategorySearch vSearch) throws HmrzException {
		return dao.getProductCategory(vSearch);
	}

	/* (non-Javadoc)
	 * @see com.hmrz.service.ProductCategoryService#getProductCategoryAll()
	 */
	@Override
	public List<ProductCategoryBean> getProductCategoryAll() throws HmrzException {
		return dao.getProductCategoryAll();
	}



	/* (non-Javadoc)
	 * @see com.hmrz.service.ProductCategoryService#getProductCategoryCount(com.hmrz.search.ProductCategorySearch)
	 */
	@Override
	public int getProductCategoryCount(ProductCategorySearch vSearch) throws HmrzException {
		return dao.getProductCategoryCount(vSearch);
	}


	/* (non-Javadoc)
	 * @see com.hmrz.service.ProductCategoryService#addProductCategory(com.hmrz.pojo.ProductCategoryBean)
	 */
	@Override
	public String addProductCategory(ProductCategoryBean bean) throws HmrzException {
		return dao.addProductCategory(bean);
	}



	/* (non-Javadoc)
	 * @see com.hmrz.service.ProductCategoryService#delProductCategory(java.lang.String)
	 */
	@Override
	public String delProductCategory(String id) throws HmrzException {
		String[] idArr = id.split(",");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", idArr);
		return dao.delProductCategory(map);
	}



	/* (non-Javadoc)
	 * @see com.hmrz.service.ProductCategoryService#modifyProductCategory(com.hmrz.pojo.ProductCategoryBean)
	 */
	@Override
	public boolean modifyProductCategory(ProductCategoryBean bean) throws HmrzException {
		return dao.modifyProductCategory(bean);
	}


}
