package com.hmrz.pojo;

import java.util.List;

import org.springframework.util.StringUtils;


/**
 * 调研任务题目bean
 * @author yl
 *
 */
public class TaskTopicBean implements Comparable<TaskTopicBean> {
	
	/**
	 * 题目id
	 */
	private String topic_id;
	/**
	 * 关联调研任务id
	 */
	private String task_id;
	/**
	 * 该题在客户端的id
	 */
	private String cid;
	/**
	 * 题目顺序
	 */
	private String sort;
	/**
	 * 类型（静态数据）
	 */
	private String field_type;
	/**
	 * 元素标题
	 */
	private String label;
	/**
	 * 元素描述
	 */
	private String descript;
	/**
	 * 是否必答
	 */
	private boolean required;
	/**
	 * 题目图片URL
	 */
	private String img_url;
	/**
	 * 题目跳转
	 */
	private String skipto;
	/**
	 * 是否有答案要求
	 */
	private boolean include_answer_rules;
	/**
	 * 文本题答案格式要求
	 */
	private String answer_rules;
	/**
	 * 执行规则。条码、二维码题  0:信息校验  1：信息采集；图片题  0：仅拍照   1：拍照或上传
	 */
	private String execute_rule;
	/**
	 * 需要验证的条码、二维码原始图片
	 */
	private String execute_img;
	/**
	 * 题目选项列表
	 */
	private List<TaskOptionBean> options;
	
	public String getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(String topic_id) {
		this.topic_id = topic_id;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getField_type() {
		return field_type;
	}
	public void setField_type(String field_type) {
		this.field_type = field_type;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public boolean getRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getAnswer_rules() {
		return answer_rules;
	}
	public void setAnswer_rules(String answer_rules) {
		this.include_answer_rules = !StringUtils.isEmpty(answer_rules) && !"-1".equals(answer_rules);
		this.answer_rules = answer_rules;
	}
	public List<TaskOptionBean> getOptions() {
		return options;
	}
	public void setOptions(List<TaskOptionBean> options) {
		this.options = options;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public String getExecute_rule() {
		return execute_rule;
	}
	public void setExecute_rule(String execute_rule) {
		this.execute_rule = execute_rule;
	}
	public String getExecute_img() {
		return execute_img;
	}
	public void setExecute_img(String execute_img) {
		this.execute_img = execute_img;
	}
	public String getSkipto() {
		return skipto;
	}
	public void setSkipto(String skipto) {
		this.skipto = skipto;
	}
	public boolean getInclude_answer_rules() {
		return include_answer_rules;
	}
	public void setInclude_answer_rules(boolean include_answer_rules) {
		this.include_answer_rules = include_answer_rules;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SurveyTopicBean [topic_id=").append(topic_id)
				.append(", task_id=").append(task_id).append(", cid=")
				.append(cid).append(", sort=").append(sort)
				.append(", field_type=").append(field_type).append(", label=")
				.append(label).append(", descript=").append(descript)
				.append(", required=").append(required).append(", img_url=")
				.append(img_url).append(", skip_to=").append(skipto)
				.append(", answer_rules=").append(answer_rules)
				.append(", options=").append(options).append("]");
		return builder.toString();
	}
	
	@Override
	public int compareTo(TaskTopicBean o) {
		return Integer.valueOf(sort)-Integer.valueOf(o.getSort());
	}

}
