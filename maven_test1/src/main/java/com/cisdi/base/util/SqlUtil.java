package com.cisdi.base.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.cisdi.base.common.enums.CommonEnumType;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.business.entity.UserInfo;

/**
 * sql工具
 *
 * @author xiangjz
 */
public class SqlUtil {
	
	/**
	 * 获取组织机构约束
	 * @param alias
	 * @param rootId
	 * @return
	 */
	public static String addDepartRestrain(String alias, Integer rootId){
		if(BaseUtil.isEmpty(alias))
			return "";
		if(BaseUtil.isEmpty(rootId))
			return "";
		String str = " and "+alias+" in (select id from depart_info where deleteflag = 0 "
				+ " and FIND_IN_SET(id, getChildLstDepart("+rootId+")"
				+ ") )";
		return str;
	}
	
	/**
	 * 获取人员机构约束
	 * @param alias
	 * @param rootId
	 * @return
	 */
	public static String addUserDepartRestrain(String alias, Integer rootId){
		if(BaseUtil.isEmpty(alias))
			return "";
		if(BaseUtil.isEmpty(rootId))
			return "";
		String str = " and "+alias+" in (select user_id from user_rel_depart urd where urd.depart_id in "
				+ "(select id from depart_info where deleteflag = 0 "
				+ " and FIND_IN_SET(id, getChildLstDepart("+rootId+")"
				+ ") ) )";
		return str;
	}
}