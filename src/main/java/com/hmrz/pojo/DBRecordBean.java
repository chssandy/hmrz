package com.hmrz.pojo;

import java.util.List;

public class DBRecordBean {
	
	private String record_id;
	/**
	 * 广告位id
	 */
	private String space_id;
	/**
	 * 用户点位id
	 */
	private String vendor_space_id;
	/**
	 * 主题
	 */
	private String theme;
	/***
	 * 广告位名称
	 */
	private String name;
	/**
	 * 品牌
	 */
	private String brand;
	/**
	 * 品牌名
	 */
	private String brand_name;
	
	/**
	 * 行业分类（一级）
	 */
	private String father_trade;
	/**
	 * 行业分类（二级）
	 */
	private String trade;
	/**
	 * 行业分类（二级）名称
	 */
	private String trade_name;
	/**
	 * 采集单位
	 */
	private String vendor_name;
	/**
	 * 媒体类型
	 */
	private String media_name;
	/**
	 * 监测时间
	 */
	private String monitor_time;
	/**
	 * 监测图片
	 */
	private String imgs;
	/**
	 * 任务类型  1：monitor  3：media
	 */
	private String task_biz;
	/**
	 * 任务编号
	 */
	private String task_id;
	/**
	 * 执行编号
	 */
	private String execute_id;
	/**
	 * 是否违法  0：否  1：是
	 */
	private String is_illegal;
	/**
	 * 违法原因
	 */
	private String illegal_reason;
	/**
	 * 创建时间
	 */
	private String create_time;
	/**
	 * 操作人
	 */
	private String operator;
	/**
	 * 违法行为
	 */
	private List<DBIllegalBean> illegals;
	/**
	 * 违法等级（导出字段）
	 */
	private String e_illegal_level;
	/**
	 * 违法代码（导出字段）
	 */
	private String e_illegal_code;
	/**
	 * 一般违法数量（导出字段）
	 */
	private String e_normal;
	/**
	 * 严重违法数量（导出字段）
	 */
	private String e_serious;
	
	/**
	 * 区域标签
	 */
	private String area_tag;
	
	/**
	 * 专项标签
	 */
	private String special_tag;
	
	public String getArea_tag()
    {
        return area_tag;
    }
    public void setArea_tag(String area_tag)
    {
        this.area_tag = area_tag;
    }
    public String getSpecial_tag()
    {
        return special_tag;
    }
    public void setSpecial_tag(String special_tag)
    {
        this.special_tag = special_tag;
    }
    public String getE_illegal_level() {
		return e_illegal_level;
	}
	public void setE_illegal_level(String e_illegal_level) {
		this.e_illegal_level = e_illegal_level;
	}
	public String getE_illegal_code() {
		return e_illegal_code;
	}
	public void setE_illegal_code(String e_illegal_code) {
		this.e_illegal_code = e_illegal_code;
	}
	public String getE_normal() {
		return e_normal;
	}
	public void setE_normal(String e_normal) {
		this.e_normal = e_normal;
	}
	public String getE_serious() {
		return e_serious;
	}
	public void setE_serious(String e_serious) {
		this.e_serious = e_serious;
	}
	public String getRecord_id() {
		return record_id;
	}
	public void setRecord_id(String record_id) {
		this.record_id = record_id;
	}
	public String getSpace_id() {
		return space_id;
	}
	public void setSpace_id(String space_id) {
		this.space_id = space_id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getFather_trade() {
		return father_trade;
	}
	public void setFather_trade(String father_trade) {
		this.father_trade = father_trade;
	}
	public String getTrade() {
		return trade;
	}
	public void setTrade(String trade) {
		this.trade = trade;
	}
	public String getTrade_name() {
		return trade_name;
	}
	public void setTrade_name(String trade_name) {
		this.trade_name = trade_name;
	}
	public String getMonitor_time() {
		return monitor_time;
	}
	public void setMonitor_time(String monitor_time) {
		this.monitor_time = monitor_time;
	}
	public String getImgs() {
		return imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}
	public String getTask_biz() {
		return task_biz;
	}
	public void setTask_biz(String task_biz) {
		this.task_biz = task_biz;
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
	public String getIs_illegal() {
		return is_illegal;
	}
	public void setIs_illegal(String is_illegal) {
		this.is_illegal = is_illegal;
	}
	public String getIllegal_reason() {
		return illegal_reason;
	}
	public void setIllegal_reason(String illegal_reason) {
		this.illegal_reason = illegal_reason;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public List<DBIllegalBean> getIllegals() {
		return illegals;
	}
	public void setIllegals(List<DBIllegalBean> illegals) {
		this.illegals = illegals;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMedia_name() {
		return media_name;
	}
	public void setMedia_name(String media_name) {
		this.media_name = media_name;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getVendor_space_id() {
		return vendor_space_id;
	}
	public void setVendor_space_id(String vendor_space_id) {
		this.vendor_space_id = vendor_space_id;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

}
