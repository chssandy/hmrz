/**
 * com.hmrz.dao.impl/CaseDaoImpl.java
 * chs_sandy
 * 下午4:32:25
 */
package com.hmrz.dao.impl;

import java.util.List;
import java.util.Map;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.dao.CaseDao;
import com.hmrz.pojo.CaseBean;
import com.hmrz.search.CaseSearch;

/**
 * @author chs_sandy
 *
 */
public class CaseDaoImpl implements CaseDao {

	/* (non-Javadoc)
	 * @see com.hmrz.dao.CaseDao#getList(com.hmrz.search.CaseSearch)
	 */
	@Override
	public List<CaseBean> getList(CaseSearch search) throws HmrzException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hmrz.dao.CaseDao#getCount(com.hmrz.search.CaseSearch)
	 */
	@Override
	public int getCount(CaseSearch search) throws HmrzException {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.hmrz.dao.CaseDao#getCase(com.hmrz.search.CaseSearch)
	 */
	@Override
	public CaseBean getCase(CaseSearch search) throws HmrzException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hmrz.dao.CaseDao#addCase(com.hmrz.pojo.CaseBean)
	 */
	@Override
	public String addCase(CaseBean bean) throws HmrzException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hmrz.dao.CaseDao#delCase(java.util.Map)
	 */
	@Override
	public String delCase(Map<String, Object> map) throws HmrzException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hmrz.dao.CaseDao#modifyCase(com.hmrz.pojo.CaseBean)
	 */
	@Override
	public boolean modifyCase(CaseBean bean) throws HmrzException {
		// TODO Auto-generated method stub
		return false;
	}

}


