/**
 * 文  件  名：SuperviseProjectSearch.java
 * 描        述：<描述>
 * 创  建  人：chs_sandy
 * 创建时间：2017年4月21日 上午9:33:20
 * 修改内容：<修改内容>
 */
package com.hmrz.search;

/**
 * @pre  $
 * 
 * @author chs_sandy
 * @date  2017年4月21日  上午9:33:20
 */
public class SuperviseProjectExecuteSearch extends Page{

	private static final long serialVersionUID = 214017580092068373L;

	private String execute_id;
	
	private String executor;
	
	private String status;
	
	private String task_id;

	public String getExecute_id() {
		return execute_id;
	}

	public void setExecute_id(String execute_id) {
		this.execute_id = execute_id;
	}

	public String getExecutor() {
		return executor;
	}

	public void setExecutor(String executor) {
		this.executor = executor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	
}
