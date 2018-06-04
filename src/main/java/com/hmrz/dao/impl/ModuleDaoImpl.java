/**
 * 文 件 名:  ModuleDaoImpl.java
 * 描    述:  <描述>
 * 创 建 人:  yl
 * 创建时间:  2014年4月11日
 * 修改内容:  <修改内容>
 */
package com.hmrz.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.common.log.LoggerAdapter;
import com.hmrz.common.log.LoggerAdapterFacory;
import com.hmrz.dao.ModuleDao;
import com.hmrz.pojo.ModuleBean;
import com.hmrz.search.ModuleSearch;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  yl
 * @data  2014年4月11日
 */
public class ModuleDaoImpl implements ModuleDao
{
    @Autowired
    private SqlSessionTemplate sqlSession;
    
    private static LoggerAdapter log = LoggerAdapterFacory.getLoggerAdapter(ModuleDaoImpl.class);
    
    public List<ModuleBean> getAllModules(ModuleSearch msb) throws HmrzException
    {
        List<ModuleBean> mbList = null;
        try
        {
            mbList = sqlSession.selectList("com.hmrz.mybatis.module.selectAll", msb);
            return mbList;
        }
        catch (Exception ex)
        {
            String errMsg = "查询所有模块失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
    }
    
    /**
     * @param pid
     * @return
     * @throws HmrzException
     */
    public List<ModuleBean> getModulesByPID(int pid) throws HmrzException
    {
        List<ModuleBean> resultList = null;
        try
        {
            resultList = sqlSession.selectList("com.hmrz.mybatis.module.selectByPID", pid);
            return resultList;
        }
        catch (Exception ex)
        {
            String errMsg = "查询子节点失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
    }
    
    /**
     * 插入模块
     */
    public boolean insertModule(ModuleBean mb) throws HmrzException
    {
        int count = 0;
        try
        {
            count = sqlSession.insert("com.hmrz.mybatis.module.add", mb);
            return count == 1 ? true : false;
        }
        catch (Exception ex)
        {
            String errMsg = "插入模块失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
    }
    
    /**
     * 更新模块
     */
    public boolean updateModule(ModuleBean mb) throws HmrzException
    {
        int count = 0;
        try
        {
            count = sqlSession.update("com.hmrz.mybatis.module.update", mb);
            return count == 1 ;
        }
        catch (Exception ex)
        {
            String errMsg = "更新模块失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
    }
    
    /**
     * 删除模块（置删除标志为0）
     */
    public boolean delModule(String[] moduleID) throws HmrzException
    {
        int count = 0;
        try
        {
            String ids = StringUtils.arrayToCommaDelimitedString(moduleID);
            count = sqlSession.update("com.hmrz.mybatis.module.del", ids);
            return count > 0;
        }
        catch (Exception ex)
        {
            String errMsg = "删除模块失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
    }
    
    /**
     * 根据id查询模块
     * @param moduleID
     * @return
     * @throws HmrzException
     */
    public ModuleBean getModuleByID(String moduleID) throws HmrzException
    {
        ModuleBean mb = null;
        try
        {
            mb = sqlSession.selectOne("com.hmrz.mybatis.module.selectByID", moduleID);
            return mb;
        }
        catch (Exception ex)
        {
            String errMsg = "查询模块失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
    }
    
    /**
     * 搜索模块
     * @param pattern
     * @return
     * @throws HmrzException [参数说明]
     */
    public List<ModuleBean> searchModules(ModuleSearch msb) throws HmrzException
    {
        List<ModuleBean> mbList = null;
        try
        {
            mbList = sqlSession.selectList("com.hmrz.mybatis.module.selectAll", msb);
            return mbList;
        }
        catch (Exception ex)
        {
            String errMsg = "搜索模块失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
    }
    
    public int getModuleCount(ModuleSearch msb) throws HmrzException
    {
        int count = 0;
        try
        {
            count = sqlSession.selectOne("com.hmrz.mybatis.module.selectAllCount", msb);
            return count;
        }
        catch (Exception ex)
        {
            String errMsg = "查询模块数量失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
    }
    
    @Override
    public void setModuleIndex(ModuleBean module) throws HmrzException
    {
        try
        {
            sqlSession.selectOne("com.hmrz.mybatis.module.setModuleIndex", module);
        }
        catch (Exception ex)
        {
            String errMsg = "设置菜单排序失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
    }
    
    @Override
    public List<ModuleBean> getAllModule() throws HmrzException
    {
        List<ModuleBean> mbList = null;
        try
        {
            mbList = sqlSession.selectList("com.hmrz.mybatis.module.getAllModule");
        }
        catch (Exception ex)
        {
            String errMsg = "获取所有菜单列表失败！";
            log.error(errMsg, ex);
            throw new HmrzException(errMsg, ex);
        }
        return mbList;
    }
}
