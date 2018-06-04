/**
 * 文  件  名：VendorConsume.java
 * 描        述：<描述>
 * 创  建  人：chs_sandy
 * 创建时间：2016年3月25日 下午3:33:31
 * 修改内容：<修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * @pre  客户消费明细
 * 
 * @author chs_sandy
 * @date  2016年3月25日  下午3:33:31
 */
public class VendorConsumeBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8429595856457328294L;
	/**
	 * 消费明细id
	 */
	private String consume_id;
	/**
	 * 客户企业ID
	 */
	private String vendor_id;
	/**
	 * 任务类型
	 */
	private String task_type;
	/**
	 * 任务金额
	 */
	private String task_consume;
	/**
	 * 平台费用
	 */
	private String plat_consume;
	/**
	 * 任务id
	 */
	private String task_id;
	/**
	 * 任务执行id
	 */
	private String execute_id;
	/**
	 * 任务名称
	 */
	private String task_name;
	/**
	 * 消费时间
	 */
	private String create_time;
	/**
	 * 执行人手机号
	 */
	private String moble;
	
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getTask_type() {
		return task_type;
	}
	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}
	public String getTask_consume() {
		return task_consume;
	}
	public void setTask_consume(String task_consume) {
		this.task_consume = task_consume;
	}
	public String getPlat_consume() {
		return plat_consume;
	}
	public void setPlat_consume(String plat_consume) {
		this.plat_consume = plat_consume;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public String getExecute_id() {
		return execute_id;
	}
	public void setExecute_id(String execute_id) {
		this.execute_id = execute_id;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getConsume_id() {
		return consume_id;
	}
	public void setConsume_id(String consume_id) {
		this.consume_id = consume_id;
	}
	public String getMoble() {
		return moble;
	}
	public void setMoble(String moble) {
		this.moble = moble;
	}

}
