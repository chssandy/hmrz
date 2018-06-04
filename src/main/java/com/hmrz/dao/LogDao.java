/**
 * 文 件 名:  LogDao.java
 * 描    述:  <系统日志记录，行为操作>
 * 创 建 人:  sandy
 * 创建时间:  2014年5月8日
 * 修改内容:  <修改内容>
 */
package com.hmrz.dao;

import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.LogBean;

public interface LogDao
{
    /**
     * 新增系统日志
     * <一句话功能简述>
     * <功能详细描述>
     * @param  logBean
     * @return
     * @throws HmrzException [参数说明]
     */
    int addLog(LogBean logBean) throws HmrzException;
    
    /**
     * 修改系统日志状态
     * <一句话功能简述>
     * <功能详细描述>
     * @param  logId
     * @return
     * @throws HmrzException [参数说明]
     */
    void modifyLog(int logId) throws HmrzException;
    
}
