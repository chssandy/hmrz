package com.hmrz.service;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.LogBean;

public interface LogService
{
    
    /**
     * 新增系统操作日志信息
     * @param logBean
     * @return
     * @throws HmrzException [参数说明]
     */
    
    int addLog(LogBean logBean) throws HmrzException;
    
    /**
     * 修改系统操作日志信息
     * @param logBean
     * @return
     * @throws HmrzException [参数说明]
     */
    void modifyLog(int logId) throws HmrzException;
    
}
