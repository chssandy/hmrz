/**
 * 文 件 名:  MemcachedDaoImpl.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年6月4日
 * 修改内容:  <修改内容>
 */
package com.hmrz.dao.impl;

import net.rubyeye.xmemcached.MemcachedClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.hmrz.common.constants.StaticVariables;
import com.hmrz.common.exception.HmrzException;
import com.hmrz.dao.MemcachedDao;

/**
 * <pre>
 * memcached缓存操作实现
 * </pre>
 * 
 * @author  pfma
 * @data  2015年6月4日
 */
class MemcachedDaoImpl implements MemcachedDao
{
    @Autowired
    private MemcachedClient memcachedClient;
    
    private static long DELAULT_TIMEOUT = 1000L;
    
    @Override
    public String getAndTouch(String key, int exp) throws HmrzException
    {
        if (StringUtils.isEmpty(key))
        {
            return null;
        }
        
        String value = "";
        try
        {
            value = memcachedClient.getAndTouch(key, exp, DELAULT_TIMEOUT);
        }
        catch (Exception e)
        {
            throw new HmrzException("根据key获取缓存的对象出错！", e);
        }
        return value;
    }
    
    @Override
    public String getAndTouch(String key) throws HmrzException
    {
        return getAndTouch(key, StaticVariables.SESSION_TIMEOUT * 60);
    }
    
    @Override
    public String get(String key) throws HmrzException
    {
        if (StringUtils.isEmpty(key))
        {
            return null;
        }
        
        String value = "";
        try
        {
            value = memcachedClient.get(key, DELAULT_TIMEOUT);
        }
        catch (Exception e)
        {
            throw new HmrzException("根据key获取缓存的对象出错！", e);
        }
        return value;
    }
    
    public boolean set(String key, String value, int exp, long timeout) throws HmrzException
    {
        if (StringUtils.isEmpty(value))
        {
            return false;
        }
        boolean success = false;
        try
        {
            success = memcachedClient.set(key, exp, value, timeout);
        }
        catch (Exception e)
        {
            throw new HmrzException("向缓存中加入数据出错！", e);
        }
        return success;
    }
    
    @Override
    public boolean set(String key, String value, int exp) throws HmrzException
    {
        return set(key, value, exp, DELAULT_TIMEOUT);
    }
    
    @Override
    public boolean delete(String key) throws HmrzException
    {
        boolean success = false;
        try
        {
            success = memcachedClient.delete(key, DELAULT_TIMEOUT);
        }
        catch (Exception e)
        {
            throw new HmrzException("删除数据出错！", e);
        }
        return success;
    }
    
    @Override
    public boolean touch(String key, int exp) throws HmrzException
    {
        if (StringUtils.isEmpty(key))
        {
            return false;
        }
        boolean success = false;
        try
        {
            success = memcachedClient.touch(key, exp, DELAULT_TIMEOUT);
        }
        catch (Exception e)
        {
            throw new HmrzException("刷新缓存中的数据超时时间出错！", e);
        }
        return success;
    }
}
