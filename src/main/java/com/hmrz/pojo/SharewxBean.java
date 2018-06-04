/**
 * 文 件 名:  ShareWXBean.java
 * 描    述:  微信分享任务
 * 创 建 人:  sandy
 * 创建时间:  2015年11月09日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.math.BigDecimal;
import java.util.List;


/**
 * <pre>
 * 微信分享任务bean
 * </pre>
 * 
 * @author  sandy
 * @data  2015年11月09日
 */
public class SharewxBean
{
	private String task_id;
	/**
	 * 任务名称
	 */
	private String name;
	/**
	 * 任务描述
	 */
	private String descript;
	/**
	 * 任务可执行开始时间
	 */
	private String do_btime;
	/**
	 * 任务可执行截止时间
	 */
	private String do_etime;
	/**
	 * 发布审核人
	 */
	private String publish_user;
	/**
	 * 任务审核通过，发布时间
	 */
	private String publish_time;
	/**
	 * 任务状态（0：草稿  1：待审核 2：发布  3：驳回  4：全部完成  5：半完成  6：无人执行  7：关闭）
	 */
	private String status;
	/**
	 * 任务所属商户
	 */
	private String vendor_id;
	/**
	 * 任务图标路径
	 */
	private String icon;
	/**
	 * 任务路径（分享用）
	 */
	private String url;
	/**
	 * 单次点击价格
	 */
	private BigDecimal salary;
	/**
	 * 单任务平台费用
	 */
	private BigDecimal plat_fee;
	/**
	 * 分享可被点击总次数
	 */
	private String execute_times;
	/**
	 * 新建时间
	 */
	private String create_time;
	/**
	 * 代发的运营账号
	 */
	private String agent;
	/**
	 * 创建人
	 */
	private String create_user;
	/**
	 * 发布人类别   0：系统人员发布   1：商户发布   2：用户发布
	 */
	private String create_type;
	/**
	 * 是否专属任务   0： 否   1：是
	 */
	private String is_exclusive;
	/**
	 * 驳回理由（运营发布审核）
	 */
	private String reject_reason;
	/**
	 * 备注
	 */
	private String remark;
	
	 /**
     * 城市列表
     */
    private List<CityBean> cityList;
    
    /**
     * 约束bean
     */
    private TaskRestrainBean trb;
	
	public List<CityBean> getCityList() {
		return cityList;
	}
	public void setCityList(List<CityBean> cityList) {
		this.cityList = cityList;
	}
	public TaskRestrainBean getTrb() {
		return trb;
	}
	public void setTrb(TaskRestrainBean trb) {
		this.trb = trb;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
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
	public String getDo_btime() {
		return do_btime;
	}
	public void setDo_btime(String do_btime) {
		this.do_btime = do_btime;
	}
	public String getDo_etime() {
		return do_etime;
	}
	public void setDo_etime(String do_etime) {
		this.do_etime = do_etime;
	}
	public String getPublish_user() {
		return publish_user;
	}
	public void setPublish_user(String publish_user) {
		this.publish_user = publish_user;
	}
	public String getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public BigDecimal getPlat_fee() {
		return plat_fee;
	}
	public void setPlat_fee(BigDecimal plat_fee) {
		this.plat_fee = plat_fee;
	}
	public String getExecute_times() {
		return execute_times;
	}
	public void setExecute_times(String execute_times) {
		this.execute_times = execute_times;
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
	public String getCreate_type() {
		return create_type;
	}
	public void setCreate_type(String create_type) {
		this.create_type = create_type;
	}
	public String getIs_exclusive() {
		return is_exclusive;
	}
	public void setIs_exclusive(String is_exclusive) {
		this.is_exclusive = is_exclusive;
	}
	public String getReject_reason() {
		return reject_reason;
	}
	public void setReject_reason(String reject_reason) {
		this.reject_reason = reject_reason;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
