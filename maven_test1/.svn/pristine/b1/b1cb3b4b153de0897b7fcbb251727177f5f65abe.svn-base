/**
 * 
 */
package com.cisdi.business.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cisdi.base.common.enums.CommonEnumType.DeleteFlag;
import com.cisdi.base.common.enums.CommonEnumTypeToList;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.entity.SessionToken;
import com.cisdi.business.example.SessionTokenExample;
import com.cisdi.business.service.SessionTokenService;

/**
 * @功能说明：加载sessionToken
 * @author xiangjz
 * @创建日期： 2017-12-29
 */
@SuppressWarnings("unchecked")
public class SessionTokenLoader {
	private static Logger logger = Logger.getLogger(SessionTokenLoader.class);
	
	@Resource
	private SessionTokenService sessionTokenService;
	
	private static SessionTokenLoader instance;
	@SuppressWarnings("rawtypes")
	private static Map<String, Date> sessionTokenParams = new HashMap<String, Date>();
	public static synchronized SessionTokenLoader getInstance() {
		if (BaseUtil.isEmpty(instance))
			instance = new SessionTokenLoader();
		return instance;
	}
	
	/**
	 * 获取整个tokenmap集合
	 * @param key
	 * @return
	 * @throws FrameworkException
	 */
	public Map<String, Date> getTokenMap() {
		return this.sessionTokenParams;
	}

	/**
	 * 获取token的失效时间
	 * @param key
	 * @return
	 * @throws FrameworkException
	 */
	public Date getObjectByKey(String key) {
		if (!sessionTokenParams.keySet().contains(key))
			return null;
		return sessionTokenParams.get(key);
	}
	
	/**
	 * map获取
	 * @param key
	 * @return
	 */
	public Map<Object, Date> resourceAsMap(String key) {
		if (!sessionTokenParams.keySet().contains(key))
			return new HashMap<Object, Date>();
		return (Map<Object, Date>) sessionTokenParams.get(key);

	}
	
	/**
	 * 往缓存中添加一个sessionToken
	 * @param map
	 */
	public void addSessionToken(Map<String, Date> map){
		sessionTokenParams.putAll(map);
	}
	
	/**
	 * 清理一个sessionToken
	 * @param map
	 */
	public void removeSessionToken(Map<String, Object> map){
		sessionTokenParams.remove(map.get("sessionToken"));
	}

}
