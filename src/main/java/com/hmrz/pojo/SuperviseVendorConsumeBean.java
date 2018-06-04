/**
 * 文  件  名：SuperviseVendorConsumeBean.java
 * 描        述：<描述>
 * 创  建  人：chs_sandy
 * 创建时间：2017年3月25日 下午3:33:31
 * 修改内容：<修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * @pre  监播客户消费明细
 * 
 * @author chs_sandy
 * @date  2017年3月25日  下午3:33:31
 */
public class SuperviseVendorConsumeBean implements Serializable{
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
	 * 金额
	 */
	private String amount;
	/**
	 * 扣费类型  1：监播扣费  2：平台使用费
	 */
	private String type;
	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 操作运营人员
	 */
	private String create_user;
	
	/**
	 * 消费时间
	 */
	private String create_time;

	public String getConsume_id() {
		return consume_id;
	}

	public void setConsume_id(String consume_id) {
		this.consume_id = consume_id;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SuperviseVendorConsumeBean [");
		if (consume_id != null) {
			builder.append("consume_id=");
			builder.append(consume_id);
			builder.append(", ");
		}
		if (vendor_id != null) {
			builder.append("vendor_id=");
			builder.append(vendor_id);
			builder.append(", ");
		}
		if (amount != null) {
			builder.append("amount=");
			builder.append(amount);
			builder.append(", ");
		}
		if (type != null) {
			builder.append("type=");
			builder.append(type);
			builder.append(", ");
		}
		if (remark != null) {
			builder.append("remark=");
			builder.append(remark);
			builder.append(", ");
		}
		if (create_user != null) {
			builder.append("create_user=");
			builder.append(create_user);
			builder.append(", ");
		}
		if (create_time != null) {
			builder.append("create_time=");
			builder.append(create_time);
		}
		builder.append("]");
		return builder.toString();
	}

}
