/**
 * 文 件 名:  MemcachedDao.java
 * 描    述:  <描述>
 * 创 建 人:  pfma
 * 创建时间:  2015年6月4日
 * 修改内容:  <修改内容>
 */
package com.hmrz.dao;

import com.hmrz.common.exception.HmrzException;

/**
 * <pre>
 * memcached操作接口
 * </pre>
 * 
 * @author  pfma
 * @data  2015年6月4日
 */
public interface MemcachedDao
{
    /**
     * <pre>
     * 根据key获取缓存的对象,并且刷新缓存过期时间
     * </pre> 
     * @param key
     * @param exp 超时时间
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年6月4日 上午11:04:28
     */
    String getAndTouch(String key, int exp) throws HmrzException;
    
    /**
     * <pre>
     * 根据key获取缓存的对象，并且刷新缓存过期时间
     * </pre> 
     * @param key
     * @param timeout 超时时间
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年6月4日 上午11:04:28
     */
    String getAndTouch(String key) throws HmrzException;
    
    /**
     * <pre>
     * 根据key获取缓存的对象
     * </pre> 
     * @param key
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年6月4日 上午11:04:28
     */
    String get(String key) throws HmrzException;
    
    /**
     * <pre>
     * 向缓存中加入数据
     * </pre> 
     * @param key key
     * @param value 要保持的数据
     * @param exp
     * @throws HmrzException [参数说明]
     * @author pfma 2015年6月4日 上午11:19:33
     */
    boolean set(String key, String value, int exp) throws HmrzException;
    
    /**
     * <pre>
     * 删除数据
     * </pre> 
     * @param key
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年6月4日 上午11:37:40
     */
    boolean delete(String key) throws HmrzException;
    
    /**
     * <pre>
     * Set a new expiration time for an existing item
     * </pre> 
     * @param key 
     * @param exp
     * @return
     * @throws HmrzException [参数说明]
     * @author pfma 2015年7月9日 上午11:25:35
     */
    boolean touch(String key, int exp) throws HmrzException;
}
