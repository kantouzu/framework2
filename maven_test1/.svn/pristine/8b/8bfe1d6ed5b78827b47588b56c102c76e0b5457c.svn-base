/**
 * 
 */
package com.cisdi.base.common.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.cisdi.base.util.BaseUtil;

/**
 * @功能说明：加载的业务字典类
 * @author xiangjz
 * @创建日期： 2018-01-02
 */
@SuppressWarnings("unchecked")
public class SystemResourceUtil {
//	private static Logger logger = Logger.getLogger(SystemResourceUtil.class);
	
	
	
	private static SystemResourceUtil instance;
	//存放系统参数和业务字典
	@SuppressWarnings("rawtypes")
	private static Map dictionaryParams = new HashMap();
	/**
	 * 利用单利模式获取一个SystemResource对象
	 * @return SystemResource
	 * 		-SystemResource对象
	 * @throws FrameworkException
	 */
	public static synchronized SystemResourceUtil getInstance() {
		//if (BaseUtil.isEmpty(instance))
			//instance = (SystemResourceUtil) ContextLoader.getCurrentWebApplicationContext().getBean("systemResource");
		//return instance;
		if (BaseUtil.isEmpty(instance))
			instance = new SystemResourceUtil();
		return instance;
	}

	/**
	 * 加载业务字典到内存中
	 * 
	 * @throws FrameworkException
	 */
	public void loadCodeDictionary() {
//		logger.info("开始加载业务字典......");
		System.out.println("开始加载业务字典......");
		//状态读取
		dictionaryParams.putAll(CommonEnumTypeToList.writeMemoryTempleStatus());
		
//		logger.info("加载业务字典成功完成......");
		System.out.println("加载业务字典成功完成......");
	}
	
	/**
	 * 枚举定义——获取相应值转换为list
	 * @param val
	 * @return
	 */
	public static List<Object> getCommonEnumList(String val) {
	   SystemResourceUtil instance=SystemResourceUtil.getInstance();
	   return instance.resourceAsList("comEnum_"+val+"_list");
	}
	
	/**
	 * 枚举定义——获取相应值转换为map
	 * 
	 * @param val
	 * @return
	 */
	public static Map<Object, Object> getCommonEnumMap(String val) {
		SystemResourceUtil instance=SystemResourceUtil.getInstance();
		return instance.resourceAsMap("comEnum_"+val+"_map");
	}
	
	
	/**
	 * 获取资源
	 * @param key
	 * @return
	 * @throws FrameworkException
	 */
	public Object  getObjectByKey(String key) {
		if (!dictionaryParams.keySet().contains(key))
			return null;
		return dictionaryParams.get(key);
	}
	
	/**
	 * 从内存中获取指定业务类型的业务字典集合
	 * @param key -业务字典类别
	 * @return -返回特定类别的值集合
	 * @throws FrameworkException
	 */
	public List<Object> resourceAsList(String key) {
		if (!dictionaryParams.keySet().contains(key))
			return new ArrayList<Object>();
		return (List<Object>) dictionaryParams.get(key);

	}

	/**
	 * map获取
	 * @param key
	 * @return
	 */
	public Map<Object, Object> resourceAsMap(String key) {
		if (!dictionaryParams.keySet().contains(key))
			return new HashMap<Object, Object>();
		return (Map<Object, Object>) dictionaryParams.get(key);

	}

	/**
	 * 从内存中获取指定系统参数的值
	 * @param key
	 * 		-系统字典key
	 * @return String
	 * 		-返回系统字典value
	 */
	public String getResourceAsString(String key) {
		if (!dictionaryParams.keySet().contains("SYS_" + key))
			return null;
		return (String) dictionaryParams.get("SYS_" + key);
	}


	/**
	 * 获取业务字典对应type,value的中文名称
	 * @param type
	 * 		-业务字典类型
	 * @param value
	 * 		-业务字典值
	 * @return
	 * @throws FrameworkException
	 */
	public String getCnNameOfBusinessDictionary(String type, String value) {
		if (BaseUtil.isEmpty(value))
			return null;
		return null;
	}
}
