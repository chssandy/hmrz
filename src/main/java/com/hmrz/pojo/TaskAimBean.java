package com.hmrz.pojo;

import java.io.Serializable;

public class TaskAimBean implements Serializable
{
    
	private static final long serialVersionUID = 8806442778309030279L;

	/**
     * id
     */
    private String task_id;
    
    /**
     * 任务id
     */
    private String task_aim_id;
    
    /**
     * 任务目标id
     */
    private String aim_id;
    
    /**
     * 任务目标信息
     */
    private String aim_value;

	public String getAim_id() {
		return aim_id;
	}

	public void setAim_id(String aim_id) {
		this.aim_id = aim_id;
	}

	public String getAim_value() {
		return aim_value;
	}

	public void setAim_value(String aim_value) {
		this.aim_value = aim_value;
	}

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public String getTask_aim_id() {
		return task_aim_id;
	}

	public void setTask_aim_id(String task_aim_id) {
		this.task_aim_id = task_aim_id;
	}


}
