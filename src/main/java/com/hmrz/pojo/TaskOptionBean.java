package com.hmrz.pojo;
/**
 * 调研题目选项bean
 * @author yl
 *
 */
public class TaskOptionBean implements Comparable<TaskOptionBean> {
	
	/**
	 * 选项id
	 */
	private String option_id;
	/**
	 * 任务id
	 */
	private String task_id;
	/**
	 * 题目id
	 */
	private String topic_id;
	/**
	 * 选项标题
	 */
	private String option_title;
	/**
	 * 题目选项标题对应值如（0/1）代表（男/女）
	 */
	private transient String option_value;
	/**
	 * 是否默认选中
	 */
	private boolean checked;
	/**
	 * 图片url
	 */
	private String img_url;
	/**
	 * 选项跳转
	 */
	private String skipto;
	/**
	 * 选项标题（前台接收数据）
	 */
	private String label;
	
	public String getOption_id() {
		return option_id;
	}
	public void setOption_id(String option_id) {
		this.option_id = option_id;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public String getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(String topic_id) {
		this.topic_id = topic_id;
	}
	public String getOption_title() {
		return option_title;
	}
	public void setOption_title(String option_title) {
		this.option_title = option_title;
	}
	public String getOption_value() {
		return option_value;
	}
	public void setOption_value(String option_value) {
		this.option_value = option_value;
	}
	public boolean getChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getSkipto() {
		return skipto;
	}
	public void setSkipto(String skipto) {
		this.skipto = skipto;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@Override
	public int compareTo(TaskOptionBean o) {
		return Integer.valueOf(option_value) - Integer.valueOf(o.getOption_value());
	}
	
}
