/**
 * 2014-03-20 14:34
 * @author pfma
 */
package com.hmrz.common.log;

import com.hmrz.common.log.Impl.Log4jLogger;

/**
 * 日志对象工厂
 * 
 * @author pfma
 */
public class LoggerAdapterFacory
{
    @SuppressWarnings("rawtypes")
    public static LoggerAdapter getLoggerAdapter(Class clazz)
    {
        return new Log4jLogger(clazz);
    }
}
