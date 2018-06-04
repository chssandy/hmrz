/**
 * 文 件 名:  VendorBean.java
 * 描    述:  商户信息
 * 创 建 人:  sandy
 * 创建时间:  2015年5月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;

/**
 * <商户信息bean>
 * 
 * @author  sandy
 * @data  2015年5月22日
 */
public class VendorBean implements Serializable
{
    private static final long serialVersionUID = 85674617832148982L;
    
    /**
     * id，主键
     */
    private String vendor_id;
    
    /**
     * 商户名称
     */
    private String vendor_name;
    
    /**
     * 公司电话
     */
    private String tel;
    
    /**
     * 联系人
     */
    private String contact_user;
    
    /**
     * 联系人电话
     */
    private String moble;
    
    /**
     * 公司邮箱
     */
    private String email;
    
    /**
     * 联系人qq
     */
    private String qq;
    
    /**
     * 公司网址
     */
    private String website;
    
    /**
     * 公司地址
     */
    private String address;
    
    /**
     * 公司账户
     */
    private String vendor_account;
    
    /**
     * 公司账户余额
     */
    private String balance;
    
    /**
     * 公司logo
     */
    private String logo;
    
    /**
     * 创建时间
     */
    private String create_time;
    
    /**
     * 添加人
     */
    private String create_user;
    
    /**
     * 公司简介
     */
    private String description;
    
    /**
     * 营业执照
     */
    private String bussiness_license_nums;
    
    /**
     * 营业执照图片路径
     */
    private String bussiness_license_pic;
    
    /**
     * 税务登记证图片路径
     */
    private String tax_certificate_pic;
    
    /**
     * 是否通过认证 0:没有完善信息 1:等待认证 2:未通过 3:通过
     */
    private String is_auth;
    
    /**
     * 备注
     */
    private String remark;
    
	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getContact_user() {
		return contact_user;
	}

	public void setContact_user(String contact_user) {
		this.contact_user = contact_user;
	}

	public String getMoble() {
		return moble;
	}

	public void setMoble(String moble) {
		this.moble = moble;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VendorBean [");
		if (vendor_id != null) {
			builder.append("vendor_id=");
			builder.append(vendor_id);
			builder.append(", ");
		}
		if (vendor_name != null) {
			builder.append("vendor_name=");
			builder.append(vendor_name);
			builder.append(", ");
		}
		if (tel != null) {
			builder.append("tel=");
			builder.append(tel);
			builder.append(", ");
		}
		if (contact_user != null) {
			builder.append("contact_user=");
			builder.append(contact_user);
			builder.append(", ");
		}
		if (moble != null) {
			builder.append("moble=");
			builder.append(moble);
			builder.append(", ");
		}
		if (email != null) {
			builder.append("email=");
			builder.append(email);
			builder.append(", ");
		}
		if (qq != null) {
			builder.append("qq=");
			builder.append(qq);
			builder.append(", ");
		}
		if (website != null) {
			builder.append("website=");
			builder.append(website);
			builder.append(", ");
		}
		if (address != null) {
			builder.append("address=");
			builder.append(address);
			builder.append(", ");
		}
		if (vendor_account != null) {
			builder.append("vendor_account=");
			builder.append(vendor_account);
			builder.append(", ");
		}
		if (balance != null) {
			builder.append("balance=");
			builder.append(balance);
			builder.append(", ");
		}
		if (logo != null) {
			builder.append("logo=");
			builder.append(logo);
			builder.append(", ");
		}
		if (create_time != null) {
			builder.append("create_time=");
			builder.append(create_time);
			builder.append(", ");
		}
		if (create_user != null) {
			builder.append("create_user=");
			builder.append(create_user);
			builder.append(", ");
		}
		if (description != null) {
			builder.append("description=");
			builder.append(description);
		}
		builder.append("]");
		return builder.toString();
	}

	public String getVendor_account() {
		return vendor_account;
	}

	public void setVendor_account(String vendor_account) {
		this.vendor_account = vendor_account;
	}

	public String getBussiness_license_nums() {
		return bussiness_license_nums;
	}

	public void setBussiness_license_nums(String bussiness_license_nums) {
		this.bussiness_license_nums = bussiness_license_nums;
	}

	public String getBussiness_license_pic() {
		return bussiness_license_pic;
	}

	public void setBussiness_license_pic(String bussiness_license_pic) {
		this.bussiness_license_pic = bussiness_license_pic;
	}

	public String getTax_certificate_pic() {
		return tax_certificate_pic;
	}

	public void setTax_certificate_pic(String tax_certificate_pic) {
		this.tax_certificate_pic = tax_certificate_pic;
	}

	public String getIs_auth() {
		return is_auth;
	}

	public void setIs_auth(String is_auth) {
		this.is_auth = is_auth;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
