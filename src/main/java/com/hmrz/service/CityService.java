package com.hmrz.service;

import java.util.List;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.CityBean;
import com.hmrz.search.CitySearch;
/**
 * 城市Dao
 * @author yl
 *
 */
public interface CityService {
	
	/**
	 * 查询城市列表
	 * @param cs
	 * @return
	 * @throws HmrzException
	 */
	public List<CityBean> getCityList(CitySearch cs) throws HmrzException;
	
	/**
	 * 获取全国城市树
	 * @author sandy
	 * @date  2015年11月16日  上午11:58:39
	 * @param cs
	 * @return
	 * @throws HmrzException
	 */
	public List<CityBean> getCityTree(CitySearch search) throws HmrzException; 
	
    /**
    * <pre>
    * 根据前提输入动态获取城市信息
    * </pre> 
    * @param input
    * @return
    * @throws HmrzException [参数说明]
    * @author pfma 2015年8月18日 下午4:57:04
    */
    List<CityBean> getCityByInput(String input) throws HmrzException;
}
