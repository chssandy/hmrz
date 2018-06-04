/**
 * 文 件 名:  ManagerService.java
 * 描    述:  <系统用户管理>
 * 创 建 人:  sandy
 * 创建时间:  2015年11月02日
 * 修改内容:  <修改内容>
 */
package com.hmrz.service;

import java.util.List;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.ManagerBean;
import com.hmrz.search.ManagerSearch;

/**
 * 系统用户管理操作接口
 * @author  sandy
 * @date    2015-11-02
 */
public interface ManagerService
{
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
     * 修改用户信息
     * @param manager 要修改的系统用户
     * @return true：修改成功；false：修改失败
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    boolean modifyManager(ManagerBean manager) throws HmrzException;
    
    /**
     * 获取系统用户信息
     * @param managerSearch
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    ManagerBean getManager(ManagerSearch search) throws HmrzException;
    
    /**
     * 删除用户
     * @param manager_id 系统用户id或id字符串
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    boolean delManager(String manager_id) throws HmrzException;
    
    /**
     * 修改系统用户密码
     * @param manager_id 用户id
     * @param password 新密码
     * @param password_salt 新的密码盐
     * @return 是否成功
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    boolean modifyManagerPassword(String manager_id, String password, String password_salt) throws HmrzException;
    
}
