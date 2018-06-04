package com.hmrz.search;

/**
 * 
 * 搜索分页bean 
 * @author  yl
 * 
 */
public class TaskTypeSearch extends Page
{
    private static final long serialVersionUID = 1590897596246649352L;
    
    private String name;
    
    private int father_id = 1;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFather_id() {
		return father_id;
	}

	public void setFather_id(int father_id) {
		this.father_id = father_id;
	}
   
}
