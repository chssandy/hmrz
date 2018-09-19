/**
 * com.hmrz.service.impl/CaseServiceImpl.java
 * chs_sandy
 * 下午4:37:36
 */
package com.hmrz.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.dao.CaseDao;
import com.hmrz.pojo.CaseBean;
import com.hmrz.search.CaseSearch;
import com.hmrz.service.CaseService;

/**
 * @author chs_sandy
 *
 */
public class CaseServiceImpl implements CaseService {
	
	private CaseDao dao;

	@Override
	public List<CaseBean> getList(CaseSearch search) throws HmrzException {
		return dao.getList(search);
	}

	@Override
	public int getCount(CaseSearch search) throws HmrzException {
		return dao.getCount(search);
	}

	@Override
	public CaseBean getCase(CaseSearch search) throws HmrzException {
		return dao.getCase(search);
	}

	@Override
	public String addCase(CaseBean bean) throws HmrzException {
		return dao.addCase(bean);
	}

	@Override
	public String delCase(String id) throws HmrzException {
		String[] idArr = id.split(",");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", idArr);
		return dao.delCase(map);
	}

	@Override
	public boolean modifyCase(CaseBean bean) throws HmrzException {
		return dao.modifyCase(bean);
	}

}


