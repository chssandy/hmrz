/**
 * 文 件 名:  CityMapDaoImpl.java
 * 描    述:  <城市空间数据库接口>
 * 创 建 人:  sandy
 * 创建时间:  2014年5月8日
 * 修改内容:  <修改内容>
 */
package com.hmrz.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.common.log.LoggerAdapter;
import com.hmrz.common.log.LoggerAdapterFacory;
import com.hmrz.dao.LogDao;
import com.hmrz.pojo.LogBean;

public class LogDaoImpl implements LogDao
{
    @Autowired
    private SqlSessionTemplate sqlSession;
    
    private static LoggerAdapter log = LoggerAdapterFacory.getLoggerAdapter(LogDaoImpl.class);
    
    /**
     * 新增系统日志
     * @param  logBean
     * @return
     * @throws HmrzException [参数说明]
     */
    @Override
    public int addLog(LogBean logBean) throws HmrzException
    {
        int affected = 0;
        try
        {
            affected = sqlSession.insert("com.hmrz.mybatis.log.addLog", logBean);
        }
        catch (DataAccessException e)
        {
            String msg = "新增系统日志出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
        return affected;
    }
    
    /**
     * 修改系统日志状态
     * <一句话功能简述>
     * <功能详细描述>
     * @param  logId
     * @return
     * @throws HmrzException [参数说明]
     */
    @Override
    public void modifyLog(int logId) throws HmrzException
    {
        try
        {
            sqlSession.update("com.hmrz.mybatis.log.modifyLog", logId);
            
        }
        catch (DataAccessException e)
        {
            String msg = "修改系统日志状态出错！";
            log.error(msg, e);
            throw new HmrzException(msg, e);
        }
    }
}
