/**
 * com.hmrz.service.impl/OpusDesignerServiceImpl.java
 * chs_sandy
 * 下午4:39:04
 */
package com.hmrz.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.dao.OpusDesignerDao;
import com.hmrz.pojo.OpusDesignerBean;
import com.hmrz.search.OpusDesignerSearch;
import com.hmrz.service.OpusDesignerService;

/**
 * @author chs_sandy
 *
 */
public class OpusDesignerServiceImpl implements OpusDesignerService {
	
	private OpusDesignerDao dao;

	@Override
	public List<OpusDesignerBean> getList(OpusDesignerSearch search) throws HmrzException {
		return dao.getList(search);
	}

	@Override
	public int getCount(OpusDesignerSearch search) throws HmrzException {
		return dao.getCount(search);
	}

	@Override
	public OpusDesignerBean getOpusDesigner(OpusDesignerSearch search) throws HmrzException {
		return dao.getOpusDesigner(search);
	}

	@Override
	public String addOpusDesigner(OpusDesignerBean bean) throws HmrzException {
		return dao.addOpusDesigner(bean);
	}

	@Override
	public String delOpusDesigner(String id) throws HmrzException {
		String[] idArr = id.split(",");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", idArr);
		return dao.delOpusDesigner(map);
	}

	@Override
	public boolean modifyOpusDesigner(OpusDesignerBean bean) throws HmrzException {
		return dao.modifyOpusDesigner(bean);
	}

}


