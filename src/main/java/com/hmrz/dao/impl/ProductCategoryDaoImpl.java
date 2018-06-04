/**
 * 文 件 名:  BrandDaoImpl.java
 * 描    述:  <商户管理据库接口>
 * 创 建 人:  sandy
 * 创建时间:  2015年05月22日
 * 修改内容:  <修改内容>
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
import com.hmrz.dao.ProductCategoryDao;
import com.hmrz.pojo.ProductCategoryBean;
import com.hmrz.search.ProductCategorySearch;

/**
 * @author  sandy
 * @data  2015-5-22
 */
public class ProductCategoryDaoImpl implements ProductCategoryDao
{
    @Autowired
    private SqlSessionTemplate sqlSession;
    
    private static LoggerAdapter log = LoggerAdapterFacory.getLoggerAdapter(ProductCategoryDaoImpl.class);
    
    @Override
    public List<ProductCategoryBean> getProductCategoryList(ProductCategorySearch vSearch) throws HmrzException
    {
        List<ProductCategoryBean> list = null;
        try
        {
            list = sqlSession.selectList("com.hmrz.mybatis.product.category.getProductCategoryList", vSearch);
        }
        catch (DataAccessException e)
        {
            String msg = "查询产品类别列表出错！";
            log.error(msg, e);
            throw new HmrzException(e);
        }
        return list;
    }
    
    @Override
    public ProductCategoryBean getProductCategory(ProductCategorySearch search) throws HmrzException
    {
    	ProductCategoryBean brand = null;
        try
        {
        	brand = sqlSession.selectOne("com.hmrz.mybatis.product.category.getProductCategory", search);
        }
        catch (Exception ex)
        {
            String errMsg = "查询产品类别信息失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
        
        return brand;
    }
    
    @Override
    public List<ProductCategoryBean> getProductCategoryAll() throws HmrzException
    {
        List<ProductCategoryBean> list = null;
        try
        {
            list = sqlSession.selectList("com.hmrz.mybatis.product.category.getProductCategoryAll");
        }
        catch (DataAccessException e)
        {
            String msg = "查询所有产品类别出错！";
            log.error(msg, e);
            throw new HmrzException(e);
        }
        return list;
    }
    
    @Override
    public int getProductCategoryCount(ProductCategorySearch vSearch) throws HmrzException
    {
        int count = 0;
        try
        {
            count = sqlSession.selectOne("com.hmrz.mybatis.product.category.getProductCategoryCount", vSearch);
        }
        catch (DataAccessException e)
        {
            String msg = "查询产品类别列表总条数出错！";
            log.error(msg, e);
            throw new HmrzException(e);
        }
        return count;
    }
    
    @Override
    public String addProductCategory(ProductCategoryBean bean) throws HmrzException
    {
        String returnId = null;
        try
        {
            int affected = sqlSession.insert("com.hmrz.mybatis.product.category.addProductCategory", bean);
            if (affected > 0)
            {
                returnId = bean.getCategory_id();
            }
        }
        catch (DataAccessException e)
        {
            String msg = "保存产品类别信息出错！";
            log.error(msg, e);
            throw new HmrzException(e);
        }
        return returnId;
    }
    
    @Override
	public boolean modifyProductCategory(ProductCategoryBean brand) throws HmrzException
	{
		int affected;
        try
        {
            affected = sqlSession.update("com.hmrz.mybatis.product.category", brand);
        }
        catch (DataAccessException e)
        {
            String msg = "修改产品类别信息出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return affected > 0 ? true : false;
	}
    
    @Override
    public String delProductCategory(Map<String, Object> map) throws HmrzException
    {
        String returnId = null;
        try
        {
            int affected = sqlSession.update("com.hmrz.mybatis.product.category", map);
            if (affected > 0)
            {
                returnId = "ok";
            }
        }
        catch (DataAccessException e)
        {
            String msg = "删除产品类别出错！";
            log.error(msg, e);
            throw new HmrzException(e);
        }
        return returnId;
    }

}
