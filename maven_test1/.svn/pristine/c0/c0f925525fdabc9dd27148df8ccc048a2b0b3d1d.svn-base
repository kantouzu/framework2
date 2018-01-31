package com.cisdi.base.common.json;

import com.cisdi.base.common.constant.CommonConstant;
import com.cisdi.base.util.BaseUtil;

/**
 * $.ajax后需要接受的JSON
 * 
 * @author xiangjz
 * 
 */
public class InterfaceJson {
	private static InterfaceJson j;
	private boolean state = true;// 是否成功
	private String remark = "操作成功";// 提示信息
	private Object data = null;// 其他信息
	
	public static synchronized InterfaceJson getInstance() {
		if (BaseUtil.isEmpty(j))
			j = new InterfaceJson();
		return j;
	}
	
	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	//serverfanhui
	public static InterfaceJson  succcess(String message){
		InterfaceJson aj=new InterfaceJson();
		aj.state=true;
		aj.setRemark(message);
		return aj;
	}
	
	//serverfanhui
	public static InterfaceJson fail(String message){
		InterfaceJson aj=new InterfaceJson();
		aj.state=false;
		aj.setRemark(message);
		return aj;
	}
	
	public static InterfaceJson returnJsonObj(boolean isSuccess){
		InterfaceJson j = new InterfaceJson();
		j.setState(isSuccess);
		j.setRemark(isSuccess?CommonConstant.MES_OP_INFO:CommonConstant.MES_OP_FA_INFO);
		return j;
	}
		
	public static InterfaceJson returnJsonObj(boolean isSuccess,String msg){
		InterfaceJson j = new InterfaceJson();
		j.setState(isSuccess);
		j.setRemark(msg);
		return j;
	}
	
	public static InterfaceJson returnJsonObj(boolean isSuccess,Object obj){
		InterfaceJson j = new InterfaceJson();
		j.setState(isSuccess);
		j.setData(obj);
		return j;
	}
	
	public static InterfaceJson returnJsonObj(boolean isSuccess, String msg, Object obj){
		InterfaceJson j = new InterfaceJson();
		j.setState(isSuccess);
		j.setRemark(BaseUtil.isEmpty(msg)?isSuccess?CommonConstant.MES_OP_INFO:CommonConstant.MES_OP_FA_INFO:msg);
		j.setData(obj);
		return j;
	}
	
}
