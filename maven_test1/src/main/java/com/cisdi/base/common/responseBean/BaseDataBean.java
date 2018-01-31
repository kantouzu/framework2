package com.cisdi.base.common.responseBean;

import java.io.Serializable;



/**
 * @功能说明：系统下拉列表专用vo(eg枚举值)
 * @作者：xiangjz
 * @创建日期： 2017-02-21
 */
public class BaseDataBean  implements Serializable{ 

	/**
	 * 
	 */
	private static final long serialVersionUID = 2118953882058205354L;

	//名字
	private String name; 
	
	//值
	private String value;
	
	//类型值
	private String type;
	
	private String id;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		this.id=this.value;
		return id;
	}

	public void setId(String id) {
		this.id = id;
	} 
	
}
