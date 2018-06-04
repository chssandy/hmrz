package com.hmrz.pojo;

import java.util.List;

public class ModuleBean
{
    private String module_id;
    
    /**
     * 模块名称
     */
    private String module_name;
    
    /**
     * 父栏目Id
     */
    private String father_id;
    
    /**
     * 模块url
     */
    private String module_url;
    
    /**
     * 栏目小图标名称
     */
    private String icon;
    
    /**
     * 关联url的命名空间，用于权限控制
     */
    private String namespace;
    
    /**
     * 排序等级
     */
    private String sort_level;
    
    /**
     * 操作人
     */
    private String create_user;
    
    /**
     *  添加时间
     */
    private String create_time;
    
    /**
     *   说明
     */
    private String remark;
    
    /**
     * 父节点名称
     */
    private String fatherName;
    
    /**
     * 操作人员名称
     */
    private String create_userName;
    
    /**
     * 子节点数目
     */
    private int childrenNum;
    
    /**
     * 子节点列表
     */
    private List<ModuleBean> childrenList;
    
    /**
     * 关联的角色
     */
    private String roles;
    

	public String getModule_id() {
		return module_id;
	}

	public void setModule_id(String module_id) {
		this.module_id = module_id;
	}

	public String getModule_name() {
		return module_name;
	}

	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}

	public String getFather_id() {
		return father_id;
	}

	public void setFather_id(String father_id) {
		this.father_id = father_id;
	}

	public String getModule_url() {
		return module_url;
	}

	public void setModule_url(String module_url) {
		this.module_url = module_url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getSort_level() {
		return sort_level;
	}

	public void setSort_level(String sort_level) {
		this.sort_level = sort_level;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getCreate_userName() {
		return create_userName;
	}

	public void setCreate_userName(String create_userName) {
		this.create_userName = create_userName;
	}

	public int getChildrenNum() {
		return childrenNum;
	}

	public void setChildrenNum(int childrenNum) {
		this.childrenNum = childrenNum;
	}

	public List<ModuleBean> getChildrenList() {
		return childrenList;
	}

	public void setChildrenList(List<ModuleBean> childrenList) {
		this.childrenList = childrenList;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ModuleBean [module_id=").append(module_id)
				.append(", module_name=").append(module_name)
				.append(", father_id=").append(father_id)
				.append(", module_url=").append(module_url).append(", icon=")
				.append(icon).append(", namespace=").append(namespace)
				.append(", sort_level=").append(sort_level)
				.append(", create_user=").append(create_user)
				.append(", create_time=").append(create_time)
				.append(remark).append(", fatherName=").append(fatherName)
				.append(", create_userName=").append(create_userName)
				.append(", childrenNum=").append(childrenNum)
				.append(", childrenList=").append(childrenList)
				.append(", roles=").append(roles).append("]");
		return builder.toString();
	}
   
}
