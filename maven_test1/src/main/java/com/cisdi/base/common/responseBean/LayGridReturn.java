package com.cisdi.base.common.responseBean;

import java.util.List;

/**
 * layui提供数据网格的指定返回参数
 * 
 * @author xiangjz
 * 
 */
public class LayGridReturn {
	private Integer code = 200;// 返回状态码
	private String msg = "操作成功";// 提示信息
	private Integer count = 0;// 条数
	private List<Object> data = null;// 数据主体，实为json数组
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<Object> getData() {
		return data;
	}
	public void setData(List<Object> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public LayGridReturn(Integer code, String msg, List data, Integer count) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
		this.count = count;
	}
	
}
