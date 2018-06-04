/**
 * 文 件 名:  ModuleDao.java
 * 描    述:  <模块相关数据库接口>
 * 创 建 人:  yl
 * 创建时间:  2014年4月11日
 * 修改内容:  <修改内容>
 */
package com.hmrz.dao;

import java.util.List;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.ModuleBean;
import com.hmrz.search.ModuleSearch;

/**
 * <菜单模块相关数据库操作接口>
 * 
 * @author  yl
 * @data  2014年4月11日
 */
public interface ModuleDao
{
    /**
     *  查询所有模块
     */
    public List<ModuleBean> getAllModules(ModuleSearch msb) throws HmrzException;
    
    /**
     * 根据父id查询子模块 
     * @param pid
     * @return
     * @throws LanTuException [参数说明]
     */
    public List<ModuleBean> getModulesByPID(int pid) throws HmrzException;
    
    /**
     * 插入模块
     */
    public boolean insertModule(ModuleBean mb) throws HmrzException;
    
    /**
     * 更新模块
     */
    public boolean updateModule(ModuleBean mb) throws HmrzException;
    
    /**
     * 删除模块
     * @param mb
     * @throws LanTuException
     */
    public boolean delModule(String[] moduleID) throws HmrzException;
    
    /**
     * 根据ID查询模块
     * @param moduleID
     * @return
     * @throws LanTuException [参数说明]
     */
    public ModuleBean getModuleByID(String moduleID) throws HmrzException;
    
    /**
     * 搜索模块
     * @param pattern
     * @return
     * @throws LanTuException [参数说明]
     */
    public List<ModuleBean> searchModules(ModuleSearch msb) throws HmrzException;
    
    /**
     * 查询模块数量
     * @param msb
     * @return
     * @throws LanTuException [参数说明]
     */
    public int getModuleCount(ModuleSearch msb) throws HmrzException;
    
    public void setModuleIndex(ModuleBean module) throws HmrzException;
    
    /**
     * <pre>
     * 获取所有菜单列表
     * </pre> 
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年6月4日 下午3:41:06
     */
    List<ModuleBean> getAllModule() throws HmrzException;
}
