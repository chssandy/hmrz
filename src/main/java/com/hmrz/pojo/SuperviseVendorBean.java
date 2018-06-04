package com.hmrz.pojo;

import java.io.Serializable;

public class SuperviseVendorBean implements Serializable{
	
	private static final long serialVersionUID = -3737069346490520223L;
	
	private String vendor_id;
	private String name;
	private String contact;
	private String phone;
	private String email;
	private String province_code;
	private String city_code;
	private String address;
	private String create_time;
	private String create_user;
	private String remark;
	private String is_del;
	private String user_id;
	private String moble;
	private String password;
	private String password_salt;
	private String balance;   //余额
	private String charge;    //充值总金额
	private String consume;	  //消费总额
	private String withdraw;  //提现总额
	private String handling_fee; //提现手续费
	
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProvince_code() {
		return province_code;
	}
	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getIs_del() {
		return is_del;
	}
	public void setIs_del(String is_del) {
		this.is_del = is_del;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getMoble() {
		return moble;
	}
	public void setMoble(String moble) {
		this.moble = moble;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword_salt() {
		return password_salt;
	}
	public void setPassword_salt(String password_salt) {
		this.password_salt = password_salt;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public String getConsume() {
		return consume;
	}
	public void setConsume(String consume) {
		this.consume = consume;
	}
	public String getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(String withdraw) {
		this.withdraw = withdraw;
	}
	public String getHandling_fee() {
		return handling_fee;
	}
	public void setHandling_fee(String handling_fee) {
		this.handling_fee = handling_fee;
	}

}
