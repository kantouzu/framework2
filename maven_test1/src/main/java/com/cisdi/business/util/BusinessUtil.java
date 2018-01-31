package com.cisdi.business.util;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.cisdi.base.common.enums.CommonEnumType.DeleteFlag;
import com.cisdi.base.common.enums.CommonEnumType.UserTypeCode;
import com.cisdi.base.common.json.AjaxJson;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.base.util.DateUtil;
import com.cisdi.business.entity.SessionToken;
import com.cisdi.business.entity.UserInfo;
import com.cisdi.business.example.UserRelRoleExample;
import com.cisdi.business.service.UserRelRoleService;

/**
 * 业务工具
 *
 * @author xiangjz
 */
public class BusinessUtil {
	
	@Autowired
	private static UserRelRoleService userRelRoleService;
	
	/**
	 * 验证token是否失效
	 * @param sessionToken
	 * @return
	 */
	public static boolean isTokenInvalid(SessionToken sessionToken){
		boolean result = false;
		if(BaseUtil.isEmpty(sessionToken) || BaseUtil.isEmpty(sessionToken.getExpireTime()))
			return true;
		Date expireTime = sessionToken.getExpireTime();
		if(expireTime.getTime() < DateUtil.getCurrentDate().getTime())
			return true;
		return result;
	}
	
	/**
     * 转换userInfo
     * @return
     */
    public static UserInfo convertSessionUser(AjaxJson j){
    	return (UserInfo) j.getObj();
    }
	
}