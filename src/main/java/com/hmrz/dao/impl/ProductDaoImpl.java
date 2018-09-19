/**
 * com.hmrz.dao.impl/ProductDaoImpl.java
 * chs_sandy
 * 下午4:34:01
 */
package com.hmrz.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.common.log.LoggerAdapter;
import com.hmrz.common.log.LoggerAdapterFacory;
import com.hmrz.dao.ProductDao;
import com.hmrz.pojo.ProductBean;
import com.hmrz.search.ProductSearch;

/**
 * @author chs_sandy
 *
 */
public class ProductDaoImpl implements ProductDao {

	@Autowired
    private SqlSessionTemplate sqlSession;
	
	private static LoggerAdapter log = LoggerAdapterFacory.getLoggerAdapter(ProductDaoImpl.class);
	
	@Override
	public List<ProductBean> getList(ProductSearch search) throws HmrzException {
		List<ProductBean> list = null;
        try
        {
            list = sqlSession.selectList("com.hmrz.mybatis.product.getProductList", search);
        }
        catch (DataAccessException e)
        {
            String msg = "查询产品列表出错！";
            log.error(msg, e);
            throw new HmrzException(e);
        }
        return list;
	}

	@Override
	public int getCount(ProductSearch search) throws HmrzException {
		int count = 0;
        try
        {
            count = sqlSession.selectOne("com.hmrz.mybatis.product.getProductCount", search);
        }
        catch (DataAccessException e)
        {
            String msg = "查询产品列表总条数出错！";
            log.error(msg, e);
            throw new HmrzException(e);
        }
        return count;
	}

	@Override
	public ProductBean getProduct(ProductSearch search) throws HmrzException {
		ProductBean bean = null;
        try
        {
        	bean = sqlSession.selectOne("com.hmrz.mybatis.product.getProduct", search);
        }
        catch (Exception ex)
        {
            String errMsg = "查询产品信息失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
        return bean;
	}

	@Override
	public String addProduct(ProductBean bean) throws HmrzException {
		String returnId = null;
        try
        {
            int affected = sqlSession.insert("com.hmrz.mybatis.product.addProduct", bean);
            if (affected > 0)
            {
                returnId = bean.getProduct_id();
            }
        }
        catch (DataAccessException e)
        {
            String msg = "保存产品信息出错！";
            log.error(msg, e);
            throw new HmrzException(e);
        }
        return returnId;
	}

	/* (non-Javadoc)
	 * @see com.hmrz.dao.ProductDao#delProduct(java.util.Map)
	 */
	@Override
	public String delProduct(Map<String, Object> map) throws HmrzException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hmrz.dao.ProductDao#modifyProduct(com.hmrz.pojo.ProductBean)
	 */
	@Override
	public boolean modifyProduct(ProductBean bean) throws HmrzException {
		// TODO Auto-generated method stub
		return false;
	}

}


