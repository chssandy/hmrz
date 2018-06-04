/**
 * 文 件 名:  ModuleService.java
 * 描    述:  <菜单模块业务操作接口>
 * 创 建 人:  yl
 * 创建时间:  2014年4月11日
 * 修改内容:  <修改内容>
 */
package com.hmrz.service;

import java.util.List;
import java.util.Map;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.ModuleBean;
import com.hmrz.search.ModuleSearch;

/**
 * <菜单模块相关的操作>
 * <功能详细描述>
 * 
 * @author  yl
 * @data  2014年4月11日
 */
public interface ModuleService
{
    
    /**
     *  查询所有模块
     * @throws HmrzException 
     */
    public List<ModuleBean> getAllModules(ModuleSearch msb) throws HmrzException;
    
    /**
     *  根据父节点查询所有子节点模块
     *  @throws HmrzException 
     */
    public List<ModuleBean> getModuleByPID(int pid) throws HmrzException;
    
    /**
     *   增加模块
     *   @throws HmrzException 
     */
    public boolean insertModule(ModuleBean mb) throws HmrzException;
    
    /**
     * 更新模块
     * @throws HmrzException 
     */
    public boolean updateModule(ModuleBean mb) throws HmrzException;
    
    /**
     * 删除模块（置标志）
     * @param mb
     * @throws HmrzException
     */
    public boolean delModule(String[] moduleID) throws HmrzException;
    
    /**
     * 
     * <pre>
     * 根据id获取当前菜单
     * </pre> 
     * @param id
     * @return
     * @throws HmrzException [参数说明]
     */
    public ModuleBean getModuleByID(String id) throws HmrzException;
    
    /**
     * 获取模块bean的json字符串
     * @param pid
     * @return
     * @throws HmrzException
     */
    public String getBeansJson(int pid, String moduleID) throws HmrzException;
    
    /**
     * 搜索模块
     * @param msb
     * @return
     * @throws HmrzException [参数说明]
     */
    public List<ModuleBean> searchModule(ModuleSearch msb) throws HmrzException;
    
    /**
     * 查询模块数量
     * @param msb
     * @return [参数说明]
     */
    public int getModuleCount(ModuleSearch msb) throws HmrzException;
    
    public void setModuleIndex(List<ModuleBean> list) throws HmrzException;
    
    /**
     * <pre>
     * 获取所有菜单与角色的对应关系
     * </pre> 
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年6月4日 下午2:59:59
     */
    Map<String, List<String>> getAllModuleRoles() throws HmrzException;
}
