package com.hmrz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.dao.LogDao;
import com.hmrz.pojo.LogBean;
import com.hmrz.service.LogService;

@Service
public class LogServiceImpl implements LogService
{
    
    @Autowired
    private LogDao logDao;
    
    /**
     * parmars
     * module_id=操作栏目id
     * 
     * type=操作类型，1：新增，2：删除，3：修改
     * is_succeed,0:成功  1：失败
     */
    @Override
    public int addLog(LogBean logBean) throws HmrzException
    {
        return logDao.addLog(logBean);
    }
    
    /**
     * parmars
     * is_succeed,0:成功  1：失败
     */
    @Override
    public void modifyLog(int logId) throws HmrzException
    {
        logDao.modifyLog(logId);
    }
}
