package com.hmrz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.dao.CityDao;
import com.hmrz.pojo.CityBean;
import com.hmrz.search.CitySearch;
import com.hmrz.service.CityService;

public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityDao cityDao;
	
	@Override
	public List<CityBean> getCityList(CitySearch cs) throws HmrzException {
		
		return cs == null ? null: cityDao.getCityList(cs);
	}

	@Override
	public List<CityBean> getCityTree(CitySearch search) throws HmrzException
	{
		return cityDao.getCityTree(search);
	}
	
	@Override
    public List<CityBean> getCityByInput(String input) throws HmrzException
    {
        return cityDao.getCityByInput(input);
    }
}
