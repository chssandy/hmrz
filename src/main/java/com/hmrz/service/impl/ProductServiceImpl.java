/**
 * com.hmrz.service.impl/ProductService.java
 * chs_sandy
 * 下午4:39:30
 */
package com.hmrz.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.dao.ProductDao;
import com.hmrz.pojo.ProductBean;
import com.hmrz.search.ProductSearch;
import com.hmrz.service.ProductService;

/**
 * @author chs_sandy
 *
 */
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao dao;

	@Override
	public List<ProductBean> getList(ProductSearch search) throws HmrzException {
		return dao.getList(search);
	}

	@Override
	public int getCount(ProductSearch search) throws HmrzException {
		return dao.getCount(search);
	}

	@Override
	public ProductBean getProduct(ProductSearch search) throws HmrzException {
		return dao.getProduct(search);
	}

	@Override
	public String addProduct(ProductBean bean) throws HmrzException {
		return dao.addProduct(bean);
	}

	@Override
	public String delProduct(String id) throws HmrzException {
		String[] idArr = id.split(",");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", idArr);
		return dao.delProduct(map);
	}

	@Override
	public boolean modifyProduct(ProductBean bean) throws HmrzException {
		return dao.modifyProduct(bean);
	}

}


