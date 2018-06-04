package com.hmrz.pojo;

import java.util.List;
import java.util.Map;

/**
 * 任务类型bean
 * @author yl
 *
 */
public class TaskTypeBean {
	
	/**
	 * id
	 */
	private String task_type_id;
	/**
	 * 父级id
	 */
	private String father_id;
	/**
	 * 任务类型名称
	 */
	private String name;
	/**
	 * 描述
	 */
	private String descript;
	/**
	 * 创建时间
	 */
	private String create_time;
	/**
	 * 创建人
	 */
	private String create_user;
	
	private List<Map<String,String>> task_type_aims;
	
	public String getTask_type_id() {
		return task_type_id;
	}
	public void setTask_type_id(String task_type_id) {
		this.task_type_id = task_type_id;
	}
	public String getFather_id() {
		return father_id;
	}
	public void setFather_id(String father_id) {
		this.father_id = father_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public List<Map<String,String>> getTask_type_aims() {
		return task_type_aims;
	}
	public void setTask_type_aims(List<Map<String,String>> task_type_aims) {
		this.task_type_aims = task_type_aims;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TaskTypeBean [task_type_id=").append(task_type_id)
				.append(", father_id=").append(father_id).append(", name=")
				.append(name).append(", descript=").append(descript)
				.append(", create_time=").append(create_time)
				.append(", create_user=").append(create_user)
				.append("]");
		return builder.toString();
	}
	
}
