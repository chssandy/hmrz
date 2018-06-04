package com.hmrz.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.common.log.LoggerAdapter;
import com.hmrz.common.log.LoggerAdapterFacory;
import com.hmrz.dao.CityDao;
import com.hmrz.pojo.CityBean;
import com.hmrz.search.CitySearch;

public class CityDaoImpl implements CityDao {
	
	@Autowired
    private SqlSessionTemplate sqlSession;
    
    private static LoggerAdapter log = LoggerAdapterFacory.getLoggerAdapter(CityDaoImpl.class);
	@Override
	public List<CityBean> getCityList(CitySearch cs) throws HmrzException {
		
		try{
           return sqlSession.selectList("com.hmrz.mybatis.city.getCityList", cs);
        }
        catch (Exception ex){
            String errMsg = "查询城市列表失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
	}

	
	@Override
	public List<CityBean> getCityTree(CitySearch search) throws HmrzException
	{
		List<CityBean> list = null;
        try
        {
            list = sqlSession.selectList("com.hmrz.mybatis.city.getCityTree", search);
            return list;
        }
        catch (Exception ex)
        {
            String errMsg = "获取全国城市树失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
	}
	

    @Override
    public List<CityBean> getCityByInput(String input) throws HmrzException
    {
        List<CityBean> list = null;
        try
        {
            list = sqlSession.selectList("com.hmrz.mybatis.city.getCityByInput", input);
        }
        catch (DataAccessException e)
        {
            String msg = "根据前提输入动态获取城市信息出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return list;
    }
}
