/**
 * 文 件 名:  RoleService.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年11月2日
 * 修改内容:  <修改内容>
 */
package com.hmrz.service;

import java.util.List;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.ModuleBean;
import com.hmrz.pojo.RoleBean;
import com.hmrz.search.RoleSearch;

/**
 * <pre>
 * 角色相关业务接口
 * </pre>
 * 
 * @author  pfma
 * @data  2015年11月2日
 */
public interface RoleService
{
    /**
     * <pre>
     * 统计角色总数
     * </pre> 
     * @param search
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年11月2日 下午5:22:07
     */
    int countRole(RoleSearch search) throws HmrzException;
    
    /**
     * <pre>
     * 查询角色列表
     * </pre> 
     * @param search
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年11月2日 下午5:22:25
     */
    List<RoleBean> listRole(RoleSearch search) throws HmrzException;
    
    /**
     * <pre>
     * 新增角色
     * </pre> 
     * @param bean
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年11月2日 下午6:23:55
     */
    String addRole(RoleBean bean) throws HmrzException;
    
    /**
     * <pre>
     * 删除角色
     * </pre> 
     * @param id
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年11月3日 上午9:27:13
     */
    boolean deleteRole(String id) throws HmrzException;
    
    /**
    * <pre>
    * 修改角色信息
    * </pre> 
    * @param bean
    * @return
    * @throws HmrzException [参数说明]
    * @author pfma 2015年11月3日 上午11:01:18
    */
    boolean updateRole(RoleBean bean) throws HmrzException;
    
    /**
     * <pre>
     * 根据用户id和模块父Id查询用户可访问的模块
     * </pre> 
     * @author pfma
     * @param manager_id 用户id
     * @param parent_id 模块父id
     * @return 可访问模块
     * @throws HmrzException [参数说明]
     */
    List<ModuleBean> accessibleModule(String manager_id, String parent_id) throws HmrzException;
    
    /**
     * <pre>
     * 根据角色id获取绑定的模块id字符串
     * </pre> 
     * @param role_id
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年11月3日 上午11:59:39
     */
    String getModulesByRole(String role_id) throws HmrzException;
    
    /**
    * <pre>
    * 给角色绑定菜单权限
    * </pre> 
    * @param role_id 角色id
    * @param module_ids 菜单id，多个id可以用逗号分隔
    * @param operator 操作人
    * @return
    * @throws HmrzException [参数说明]
    * @author pfma 2015年5月27日 下午3:20:31
    */
    boolean setRoleModules(String role_id, String module_ids, String operator) throws HmrzException;
    
}
