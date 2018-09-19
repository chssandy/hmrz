/**
 * 文 件 名:  OpusDesignerDao.java
 * 描    述:  <设计师管理>
 * 创 建 人:  sandy
 * 创建时间:  2018年9月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.dao;

import java.util.List;
import java.util.Map;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.OpusDesignerBean;
import com.hmrz.search.OpusDesignerSearch;

/**
 *<pre>
 * 设计师管理
 * </pre>
 * @author  sandy
 * @data  2015-5-22
 */
public interface OpusDesignerDao
{
	/**
     * <pre>
     * 设计师列表
     * </pre> 
     * @param search 查询条件
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	List<OpusDesignerBean> getList(OpusDesignerSearch search) throws HmrzException;
    
	
	/**
     * <pre>
     * 查询设计师列表总数
     * </pre> 
     * @param search 查询条件
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	int getCount(OpusDesignerSearch search) throws HmrzException;
	
	/**
     * <pre>
     * 查询设计师
     * </pre> 
     * @param search 查询条件
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	OpusDesignerBean getOpusDesigner(OpusDesignerSearch search) throws HmrzException;
	

	
	/**
     * <pre>
     * 添加设计师
     * </pre> 
     * @param OpusDesignerBean
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	String addOpusDesigner(OpusDesignerBean bean) throws HmrzException;
	
	/**
     * <pre>
     * 删除设计师信息
     * </pre> 
     * @param map
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午4:19:58
     */
	String delOpusDesigner(Map<String, Object> map) throws HmrzException;
	
	/**
     * 修改设计师信息
     * @param bean 要修改的设计师
     * @return true：修改成功；false：修改失败
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    boolean modifyOpusDesigner(OpusDesignerBean bean) throws HmrzException; 
}
