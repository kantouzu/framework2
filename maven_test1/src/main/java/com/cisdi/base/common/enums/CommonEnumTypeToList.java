package com.cisdi.base.common.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cisdi.base.common.enums.CommonEnumType.AttachType;
import com.cisdi.base.common.enums.CommonEnumType.AuditResult;
import com.cisdi.base.common.enums.CommonEnumType.AuditStatue;
import com.cisdi.base.common.enums.CommonEnumType.BusinessType;
import com.cisdi.base.common.enums.CommonEnumType.ClientType;
import com.cisdi.base.common.enums.CommonEnumType.DeleteFlag;
import com.cisdi.base.common.enums.CommonEnumType.DicType;
import com.cisdi.base.common.enums.CommonEnumType.GenderFlag;
import com.cisdi.base.common.enums.CommonEnumType.RoleType;
import com.cisdi.base.common.enums.CommonEnumType.UserTypeCode;
import com.cisdi.base.common.enums.CommonEnumType.YesOrNo;
import com.cisdi.base.common.responseBean.BaseDataBean;
import com.cisdi.base.util.BaseUtil;



/**
 * 
 * @功能说明：枚举 转换
 * @作者：xiangjz
 * @创建日期： 2018-01-02
 */
public  class CommonEnumTypeToList {

	private static CommonEnumTypeToList instance;
	
	public static synchronized CommonEnumTypeToList getInstance() {
		if (BaseUtil.isEmpty(instance))
			instance = new CommonEnumTypeToList();
		return instance;
	}
	
	//系统可模块状态写如内存
	public static Map<Object, Object> writeMemoryTempleStatus(){
		Map<Object, Object> dictionaryParams= new HashMap<Object, Object>();
		//用户类型代码
		dictionaryParams.put("comEnum_UserTypeCode_list", UserTypeCode(dictionaryParams));
		//用户角色种类
		dictionaryParams.put("comEnum_RoleType_list", RoleType(dictionaryParams));
		//审核状态
		dictionaryParams.put("comEnum_AuditStatue_list", AuditStatue(dictionaryParams));
		//审核结果
		dictionaryParams.put("comEnum_AuditResult_list", AuditResult(dictionaryParams));
		//附件类型
		dictionaryParams.put("comEnum_AttachType_list", AttachType(dictionaryParams));
		//未删除/已删除
		dictionaryParams.put("comEnum_DeleteFlag_list", DeleteFlag(dictionaryParams));
		//性别
		dictionaryParams.put("comEnum_GenderFlag_list", GenderFlag(dictionaryParams));
		//是或否
		dictionaryParams.put("comEnum_YesOrNo_list", YesOrNo(dictionaryParams));
		//客户端种类
		dictionaryParams.put("comEnum_ClientType_list", ClientType(dictionaryParams));
		//业务操作类型
		dictionaryParams.put("comEnum_BusinessType_list", BusinessType(dictionaryParams));
		//数据字典类型
		dictionaryParams.put("comEnum_DicType_list", DicType(dictionaryParams));
		return dictionaryParams;
	}
	
	/**
	 * 用户类型代码
	 */
	public static List<BaseDataBean> UserTypeCode(Map<Object, Object> dictionaryParams) {
		List<BaseDataBean> data=new ArrayList<BaseDataBean>();
		Map<Object, Object> dictionary=new HashMap<Object, Object>();
		CommonEnumType.UserTypeCode[] arr = CommonEnumType.UserTypeCode.values();
		for (UserTypeCode p : arr) {
			BaseDataBean bd=new BaseDataBean();
			bd.setValue(p.getValue());
			bd.setName(p.name());
			dictionary.put(p.getValue(), p.name());
			data.add(bd);
		}
		dictionaryParams.put("comEnum_UserTypeCode_map", dictionary);
		return data;
	}
	
	/**
	 * 用户角色种类
	 */
	public static List<BaseDataBean> RoleType(Map<Object, Object> dictionaryParams) {
		List<BaseDataBean> data=new ArrayList<BaseDataBean>();
		Map<Object, Object> dictionary=new HashMap<Object, Object>();
		CommonEnumType.RoleType[] arr = CommonEnumType.RoleType.values();
		for (RoleType p : arr) {
			BaseDataBean bd=new BaseDataBean();
			bd.setValue(p.getValue());
			bd.setName(p.name());
			dictionary.put(p.getValue(), p.name());
			data.add(bd);
		}
		dictionaryParams.put("comEnum_RoleType_map", dictionary);
		return data;
	}
	
	/**
	 * 审核状态
	 */
	public static List<BaseDataBean> AuditStatue(Map<Object, Object> dictionaryParams) {
		List<BaseDataBean> data=new ArrayList<BaseDataBean>();
		Map<Object, Object> dictionary=new HashMap<Object, Object>();
		CommonEnumType.AuditStatue[] arr = CommonEnumType.AuditStatue.values();
		for (AuditStatue p : arr) {
			BaseDataBean bd=new BaseDataBean();
			bd.setValue(p.getValue());
			bd.setName(p.name());
			dictionary.put(p.getValue(), p.name());
			data.add(bd);
		}
		dictionaryParams.put("comEnum_AuditStatue_map", dictionary);
		return data;
	}
	
	/**
	 * 审核结果
	 */
	public static List<BaseDataBean> AuditResult(Map<Object, Object> dictionaryParams) {
		List<BaseDataBean> data=new ArrayList<BaseDataBean>();
		Map<Object, Object> dictionary=new HashMap<Object, Object>();
		CommonEnumType.AuditResult[] arr = CommonEnumType.AuditResult.values();
		for (AuditResult p : arr) {
			BaseDataBean bd=new BaseDataBean();
			bd.setValue(p.getValue());
			bd.setName(p.name());
			dictionary.put(p.getValue(), p.name());
			data.add(bd);
		}
		dictionaryParams.put("comEnum_AuditResult_map", dictionary);
		return data;
	}
	
	
	/**
	 * 附件类型
	 */
	public static List<BaseDataBean> AttachType(Map<Object, Object> dictionaryParams) {
		List<BaseDataBean> data=new ArrayList<BaseDataBean>();
		Map<Object, Object> dictionary=new HashMap<Object, Object>();
		CommonEnumType.AttachType[] arr = CommonEnumType.AttachType.values();
		for (AttachType p : arr) {
			BaseDataBean bd=new BaseDataBean();
			bd.setValue(p.getValue());
			bd.setName(p.name());
			dictionary.put(p.getValue(), p.name());
			data.add(bd);
		}
		dictionaryParams.put("comEnum_AttachType_map", dictionary);
		return data;
	}
	
	
	/**
	 * 未删除/已删除
	 */
	public static List<BaseDataBean> DeleteFlag(Map<Object, Object> dictionaryParams) {
		List<BaseDataBean> data=new ArrayList<BaseDataBean>();
		Map<Object, Object> dictionary=new HashMap<Object, Object>();
		CommonEnumType.DeleteFlag[] arr = CommonEnumType.DeleteFlag.values();
		for (DeleteFlag p : arr) {
			BaseDataBean bd=new BaseDataBean();
			bd.setValue(p.getValue());
			bd.setName(p.name());
			dictionary.put(p.getValue(), p.name());
			data.add(bd);
		}
		dictionaryParams.put("comEnum_DeleteFlag_map", dictionary);
		return data;
	}
	
	/**
	 * 性别
	 */
	public static List<BaseDataBean> GenderFlag(Map<Object, Object> dictionaryParams) {
		List<BaseDataBean> data=new ArrayList<BaseDataBean>();
		Map<Object, Object> dictionary=new HashMap<Object, Object>();
		CommonEnumType.GenderFlag[] arr = CommonEnumType.GenderFlag.values();
		for (GenderFlag p : arr) {
			BaseDataBean bd=new BaseDataBean();
			bd.setValue(p.getValue());
			bd.setName(p.name());
			dictionary.put(p.getValue(), p.name());
			data.add(bd);
		}
		dictionaryParams.put("comEnum_GenderFlag_map", dictionary);
		return data;
	}
	
	/**
	 * 是或否
	 */
	public static List<BaseDataBean> YesOrNo(Map<Object, Object> dictionaryParams) {
		List<BaseDataBean> data=new ArrayList<BaseDataBean>();
		Map<Object, Object> dictionary=new HashMap<Object, Object>();
		CommonEnumType.YesOrNo[] arr = CommonEnumType.YesOrNo.values();
		for (YesOrNo p : arr) {
			BaseDataBean bd=new BaseDataBean();
			bd.setValue(p.getValue());
			bd.setName(p.name());
			dictionary.put(p.getValue(), p.name());
			data.add(bd);
		}
		dictionaryParams.put("comEnum_YesOrNo_map", dictionary);
		return data;
	}
	/**
	 * 客户端种类
	 */
	public static List<BaseDataBean> ClientType(Map<Object, Object> dictionaryParams) {
		List<BaseDataBean> data=new ArrayList<BaseDataBean>();
		Map<Object, Object> dictionary=new HashMap<Object, Object>();
		CommonEnumType.ClientType[] arr = CommonEnumType.ClientType.values();
		for (ClientType p : arr) {
			BaseDataBean bd=new BaseDataBean();
			bd.setValue(p.getValue());
			bd.setName(p.name());
			dictionary.put(p.getValue(), p.name());
			data.add(bd);
		}
		dictionaryParams.put("comEnum_ClientType_map", dictionary);
		return data;
	}
	/**
	 * 业务操作类型
	 */
	public static List<BaseDataBean> BusinessType(Map<Object, Object> dictionaryParams) {
		List<BaseDataBean> data=new ArrayList<BaseDataBean>();
		Map<Object, Object> dictionary=new HashMap<Object, Object>();
		CommonEnumType.BusinessType[] arr = CommonEnumType.BusinessType.values();
		for (BusinessType p : arr) {
			BaseDataBean bd=new BaseDataBean();
			bd.setValue(p.getValue());
			bd.setName(p.name());
			dictionary.put(p.getValue(), p.name());
			data.add(bd);
		}
		dictionaryParams.put("comEnum_BusinessType_map", dictionary);
		return data;
	}
	/**
	 * 数据字典类型
	 */
	public static List<BaseDataBean> DicType(Map<Object, Object> dictionaryParams) {
		List<BaseDataBean> data=new ArrayList<BaseDataBean>();
		Map<Object, Object> dictionary=new HashMap<Object, Object>();
		CommonEnumType.DicType[] arr = CommonEnumType.DicType.values();
		for (DicType p : arr) {
			BaseDataBean bd=new BaseDataBean();
			bd.setValue(p.getValue());
			bd.setName(p.name());
			dictionary.put(p.getValue(), p.name());
			data.add(bd);
		}
		dictionaryParams.put("comEnum_DicType_map", dictionary);
		return data;
	}
}