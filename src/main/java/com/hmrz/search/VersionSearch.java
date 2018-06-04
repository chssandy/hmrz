/**
 * 文 件 名:  VersionSearch.java
 * 描    述:  <APP版本查询bean>
 * 创 建 人:  sandy
 * 创建时间:  2015年5月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.search;

/**
 * <pre>
 * APP版本查询bean
 * </pre>
 * 
 * @author  sandy
 * @data  2015年5月22日
 */
public class VersionSearch extends Page
{
    private static final long serialVersionUID = -1450231905710001482L;
    
    /**
     * 手机类型  （0：安卓  1：苹果）
     */
    private String type;
    
    /**
     * app版本数值
     */
    private int version_num;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getVersion_num() {
		return version_num;
	}

	public void setVersion_num(int version_num) {
		this.version_num = version_num;
	}
    
}
