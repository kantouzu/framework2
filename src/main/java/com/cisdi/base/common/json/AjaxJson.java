package com.cisdi.base.common.json;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.cisdi.base.common.constant.CommonConstant;
import com.cisdi.base.util.BaseUtil;

/**
 * $.ajax后需要接受的JSON
 * 
 * @author xiangjz
 * 
 */
public class AjaxJson {
//	private static AjaxJson j;
	private boolean success = true;// 是否成功
	private String msg = "操作成功";// 提示信息
	private Object obj = null;// 其他信息
	private Map<String, Object> attributes;// 其他参数
	
	/*public static synchronized AjaxJson getInstance() {
		if (BaseUtil.isEmpty(j))
			j = new AjaxJson();
		return j;
	}*/
	
	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String toWriteJsonStr(){
		JSONObject obj = new JSONObject();
		obj.put("success", this.isSuccess());
		obj.put("msg", this.getMsg());
		obj.put("obj", this.obj);
		obj.put("attributes", this.attributes);
		return obj.toString();
	}
	
	//serverfanhui
	public static AjaxJson  succcess(String message){
		AjaxJson aj=new AjaxJson();
		aj.success=true;
		aj.setMsg(message);
		return aj;
	}
	
	//serverfanhui
	public static AjaxJson fail(String message){
		AjaxJson aj=new AjaxJson();
		aj.success=false;
		aj.setMsg(message);
		return aj;
	}
	
	public static AjaxJson returnJsonObj(boolean isSuccess){
		AjaxJson j = new AjaxJson();
		j.setSuccess(isSuccess);
		j.setMsg(isSuccess?CommonConstant.MES_OP_INFO:CommonConstant.MES_OP_FA_INFO);
		return j;
	}
		
	public static AjaxJson returnJsonObj(boolean isSuccess,String msg){
		AjaxJson j = new AjaxJson();
		j.setSuccess(isSuccess);
		j.setMsg(msg);
		return j;
	}
	
	public static AjaxJson returnJsonObj(boolean isSuccess,Object obj){
		AjaxJson j = new AjaxJson();
		j.setSuccess(isSuccess);
		j.setObj(obj);
		j.setMsg(isSuccess?CommonConstant.MES_OP_INFO:CommonConstant.MES_OP_FA_INFO);
		return j;
	}
	
	public static AjaxJson returnJsonObj(boolean isSuccess, String msg, Object obj){
		AjaxJson j = new AjaxJson();
		j.setSuccess(isSuccess);
		j.setMsg(BaseUtil.isEmpty(msg)?isSuccess?CommonConstant.MES_OP_INFO:CommonConstant.MES_OP_FA_INFO:msg);
		j.setObj(obj);
		return j;
	}
	
	public static AjaxJson returnJsonObj(boolean isSuccess, String msg, Map<String,Object> map){
		AjaxJson j = new AjaxJson();
		j.setSuccess(isSuccess);
		j.setMsg(BaseUtil.isEmpty(msg)?isSuccess?CommonConstant.MES_OP_INFO:CommonConstant.MES_OP_FA_INFO:msg);
		j.setAttributes(map);
		return j;
	}
	
	public static AjaxJson returnJsonObj(boolean isSuccess,Map<String,Object> map){
		AjaxJson j = new AjaxJson();
		j.setSuccess(isSuccess);
		j.setMsg(isSuccess?CommonConstant.MES_OP_INFO:CommonConstant.MES_OP_FA_INFO);
		j.setAttributes(map);
		return j;
	}
	
	public static AjaxJson returnJsonObj(boolean isSuccess,Object obj,Map<String,Object> map){
		AjaxJson j = new AjaxJson();
		j.setSuccess(isSuccess);
		j.setObj(obj);
		j.setAttributes(map);
		return j;
	}
	
	public static AjaxJson returnJsonObj(boolean isSuccess,String msg,Object obj,Map<String,Object> map){
		AjaxJson j = new AjaxJson();
		j.setSuccess(isSuccess);
		j.setObj(obj);
		j.setMsg(msg);
		j.setAttributes(map);
		return j;
	}
}
