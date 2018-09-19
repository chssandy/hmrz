/**
 * 文 件 名:  CaseDao.java
 * 描    述:  <案例管理>
 * 创 建 人:  sandy
 * 创建时间:  2018年9月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.dao;

import java.util.List;
import java.util.Map;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.CaseBean;
import com.hmrz.search.CaseSearch;

/**
 *<pre>
 * 案例管理
 * </pre>
 * @author  sandy
 * @data  2015-5-22
 */
public interface CaseDao
{
	/**
     * <pre>
     * 案例列表
     * </pre> 
     * @param search 查询条件
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	List<CaseBean> getList(CaseSearch search) throws HmrzException;
    
	
	/**
     * <pre>
     * 查询案例列表总数
     * </pre> 
     * @param search 查询条件
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	int getCount(CaseSearch search) throws HmrzException;
	
	/**
     * <pre>
     * 查询案例
     * </pre> 
     * @param search 查询条件
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	CaseBean getCase(CaseSearch search) throws HmrzException;
	

	
	/**
     * <pre>
     * 添加案例
     * </pre> 
     * @param CaseBean
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	String addCase(CaseBean bean) throws HmrzException;
	
	/**
     * <pre>
     * 删除案例信息
     * </pre> 
     * @param map
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	String delCase(Map<String, Object> map) throws HmrzException;
	
	/**
     * 修改案例信息
     * @param bean 要修改的案例
     * @return true：修改成功；false：修改失败
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    boolean modifyCase(CaseBean bean) throws HmrzException; 
}
