/**
 * com.hmrz.service.impl/OpusServiceImpl.java
 * chs_sandy
 * 下午4:38:01
 */
package com.hmrz.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.dao.OpusDao;
import com.hmrz.pojo.OpusBean;
import com.hmrz.search.OpusSearch;
import com.hmrz.service.OpusService;

/**
 * @author chs_sandy
 *
 */
public class OpusServiceImpl implements OpusService {
	
	private OpusDao dao;

	@Override
	public List<OpusBean> getList(OpusSearch search) throws HmrzException {
		return dao.getList(search);
	}

	@Override
	public int getCount(OpusSearch search) throws HmrzException {
		return dao.getCount(search);
	}

	@Override
	public OpusBean getOpus(OpusSearch search) throws HmrzException {
		return dao.getOpus(search);
	}

	@Override
	public String addOpus(OpusBean bean) throws HmrzException {
		return dao.addOpus(bean);
	}

	@Override
	public String delOpus(String id) throws HmrzException {
		String[] idArr = id.split(",");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", idArr);
		return dao.delOpus(map);
	}

	@Override
	public boolean modifyOpus(OpusBean bean) throws HmrzException {
		return dao.modifyOpus(bean);
	}

}


