/**
 * 文 件 名:  LoginDao.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年11月2日
 * 修改内容:  <修改内容>
 */
package com.hmrz.dao;

import java.util.List;
import java.util.Map;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.ManagerBean;
import com.hmrz.search.ManagerSearch;

/**
 * <pre>
 * 管理员相关数据库接口
 * </pre>
 * 
 * @author  pfma
 * @data  2015年11月2日
 */
public interface ManagerDao
{
    /**
     * <pre>
     * 根据条件查询管理员
     * </pre> 
     * @param search
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年11月2日 上午11:22:29
     */
    ManagerBean getManager(ManagerSearch search) throws HmrzException;
    
    /**
     * 查询系统用户列表
     * @param search 查询条件
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    List<ManagerBean> getManagerList(ManagerSearch search) throws HmrzException;
    
    /**
     * 查询系统用户列表总数
     * @param search search 查询条件
     * @return 总数据数
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:59
     */
    int getManagerListCount(ManagerSearch search) throws HmrzException;
    
    /**
     * 保存新的用户信息
     * @param manager 要保存的系统用户
     * @return 保存后的id，如果保存不成功则为空
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    String addManager(ManagerBean manager) throws HmrzException;
    
    /**
     * 保存新的用户关联角色
     * @param manager 要保存的系统用户
     * @return 保存后的id，如果保存不成功则为空
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    boolean addManagerRole(Map<String, String> param) throws HmrzException;
    
    
    /**
     * 修改用户信息
     * @param manager 要修改的系统用户
     * @return true：修改成功；false：修改失败
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    boolean modifyManager(ManagerBean manager) throws HmrzException;
    
    /**
     * 删除用户
     * @param managerId 系统用户id或id字符串
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    boolean delManager(String manager_id) throws HmrzException;
    
    /**
     * 删除系统用户的角色绑定
     * @param manager_id 系统用户id
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    void delManagerRole(String manager_id) throws HmrzException;
}
