/**
 * 文 件 名:  BannerBean.java
 * 描    述:  banner信息发布
 * 创 建 人:  sandy
 * 创建时间:  2015年5月22日
 * 修改内容:  <修改内容>
 */
package com.hmrz.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * < banner bean>
 * 
 * @author  sandy
 * @data  2015年5月22日
 */
public class BannerBean implements Serializable
{
    private static final long serialVersionUID = 85674617832148982L;
    
    /**
     * id，主键
     */
    private String banner_id;
    
    /**
     * banner 标题
     */
    private String title;
    
    /**
     * banner 跳转的路径
     */
    private String url;
    
    /**
     * banner 图片路径
     */
    private String img_url;
    
    /**
     * banner 排序位置
     */
    private String sort;
    /**
     * banner开始时间
     */
    private String show_btime;
	/**
     * banner结束时间
     */
    private String show_etime;
    /**
     * banner状态
     */
    private String status;
    
    /**
     * 创建时间
     */
    private String create_time;
    
    /**
     * 添加人
     */
    private String create_user;
    
    /**
     * 绑定的城市信息
     */
    private List<CityBean> cities;
    
    /**
     * 点击次数
     */
    private String click_nums;
    /**
     * 有效点击次数
     */
    private String uv;

	public String getBanner_id() {
		return banner_id;
	}

	public void setBanner_id(String banner_id) {
		this.banner_id = banner_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
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
	
	public String getShow_btime() {
		return show_btime;
	}

	public void setShow_btime(String show_btime) {
		this.show_btime = show_btime;
	}

	public String getShow_etime() {
		return show_etime;
	}

	public void setShow_etime(String show_etime) {
		this.show_etime = show_etime;
	}
	
	public List<CityBean> getCities() {
		return cities;
	}

	public void setCities(List<CityBean> cities) {
		this.cities = cities;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BannerBean [");
		if (banner_id != null) {
			builder.append("banner_id=");
			builder.append(banner_id);
			builder.append(", ");
		}
		if (title != null) {
			builder.append("title=");
			builder.append(title);
			builder.append(", ");
		}
		if (url != null) {
			builder.append("url=");
			builder.append(url);
			builder.append(", ");
		}
		if (img_url != null) {
			builder.append("img_url=");
			builder.append(img_url);
			builder.append(", ");
		}
		if (sort != null) {
			builder.append("sort=");
			builder.append(sort);
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
		}
		builder.append("]");
		return builder.toString();
	}

	public String getClick_nums() {
		return click_nums;
	}

	public void setClick_nums(String click_nums) {
		this.click_nums = click_nums;
	}

	public String getUv() {
		return uv;
	}

	public void setUv(String uv) {
		this.uv = uv;
	}

}
