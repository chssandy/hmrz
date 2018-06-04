/**
 * 文 件 名:  ManagerServiceImpl.java
 * 描    述:  <系统用户管理>
 * 创 建 人:  sandy
 * 创建时间:  2015年11月02日
 * 修改内容:  <修改内容>
 */
package com.hmrz.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.rubyeye.xmemcached.MemcachedClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.dao.ManagerDao;
import com.hmrz.pojo.ManagerBean;
import com.hmrz.search.ManagerSearch;
import com.hmrz.service.ManagerService;

/**
 * 系统用户管理操作接口
 * @author  sandy
 * @date    2015-11-02
 */
@Service
public class ManagerServiceImpl implements ManagerService
{
    @Autowired
    private ManagerDao managerDao;
    
    @Autowired
    private MemcachedClient memcachedClient;

	@Override
	public List<ManagerBean> getManagerList(ManagerSearch search) throws HmrzException
	{
		return managerDao.getManagerList(search);
	}

	@Override
	public int getManagerListCount(ManagerSearch search) throws HmrzException 
	{
		return managerDao.getManagerListCount(search);
	}

	@Override
	@Transactional(rollbackFor = HmrzException.class)
	public String addManager(ManagerBean manager) throws HmrzException 
	{
		String return_id = managerDao.addManager(manager);
        addManagerRole(manager.getRoles(), return_id, manager.getCreate_user());
        return return_id;
	}

	@Override
	@Transactional(rollbackFor = HmrzException.class)
	public boolean modifyManager(ManagerBean manager) throws HmrzException
	{
		managerDao.delManagerRole(manager.getManager_id());
        addManagerRole(manager.getRoles(), manager.getManager_id(), manager.getCreate_user());
        return managerDao.modifyManager(manager);
    }
	
	@Override
	public ManagerBean getManager(ManagerSearch search) throws HmrzException
	{
		return managerDao.getManager(search);
	}

	@Override
	@Transactional(rollbackFor = HmrzException.class)
	public boolean delManager(String manager_id) throws HmrzException
	{
		managerDao.delManagerRole(manager_id);
		return managerDao.delManager(manager_id);
	}
	
	@Override
	public boolean modifyManagerPassword(String manager_id, String password,String password_salt) throws HmrzException
	{
		ManagerBean bean = new ManagerBean();
		bean.setManager_id(manager_id);
		bean.setPassword(password);
		bean.setPassword_salt(password_salt);
		return managerDao.modifyManager(bean);
	}
	
	/**
     * 保存用户的角色绑定
     * @param roles 角色id，可能是多个id用逗号隔开
     * @param user_id
     * @param operator
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午5:26:58
     */
    private boolean addManagerRole(String roles, String manager_id, String operator) throws HmrzException
    {
        boolean success = false;
        if (!StringUtils.isEmpty(roles))
        {
            String[] roles_arr = roles.split(",");
            for (String role_id : roles_arr)
            {
                if (!StringUtils.isEmpty(role_id))
                {
                    Map<String, String> param = new HashMap<String, String>();
                    param.put("manager_id", manager_id);
                    param.put("role_id", role_id);
                    param.put("create_user", operator);
                    success = managerDao.addManagerRole(param);
                }
            }
        }
        return success;
    }
}
