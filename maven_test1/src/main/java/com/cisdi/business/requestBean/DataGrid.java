package com.cisdi.business.requestBean;

import java.util.List;


/**
 * easyui的datagrid向后台传递参数使用的model
 * 
 * @author xiangjz
 * 
 */
public class DataGrid {

	private int page = 1;// 当前页
	private int limit = 10;// 每页显示记录数
	
	 //起始行
    public Integer getStartRow() {
    	 return this.page > 0 ? (this.page - 1) * this.limit : 0;
    }

    //每页条数
    public Integer getEndRow() {
    	 return this.limit;
    }

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}


}
