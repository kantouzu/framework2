package com.cisdi.base.common.constant;

/**
 * 
 * @功能：应用框架常量类
 * 
 * @创建日期：2017-01-23
 * 
 */
public class CommonConstant {
	
	/**
	 *公共提示信息
	 */
	public static final String MES_OP_INFO = "操作成功";
	public static final String MES_OP_FA_INFO = "操作失败";
	public static final String MES_ADD_INFO = "录入成功";
	public static final String MES_ADD_FA_INFO = "录入失败";
	public static final String MES_UPDATE_INFO = "编辑成功";
	public static final String MES_UPDATE_FA_INFO = "编辑失败";
	public static final String MES_DELETE_INFO = "删除成功";
	public static final String MES_DELETE_FA_INFO = "删除失败";

    /**
     * 接口字段验证错误信息
     */
    public static final String MSG_COL_NULL = "字段不能为空";
    public static final String MSG_COL_ERR = "字段不正确，请根据对应接口获取数据";
    public static final String MSG_COL_FMT_ERR = "字段不正确，请输入正确的格式";
    public static final String MSG_COL_ID_ERR = "字段不正确，请输入正确的项目ID";

    /**
	 * 应用框架日期常量
	 */
	//简单年月日日期格式
	public static final String DATE_SHORT_SIMPLE_FORMAT = "yyyyMMdd";
	//年月日日期格式
	public static final String DATE_SHORT_FORMAT = "yyyy-MM-dd";
	//中文年月日日期格式
	public static final String DATE_SHORT_CHN_FORMAT = "yyyy年MM月dd日";
	//年月日时日期格式
	public static final String DATE_WITHHOUR_FORMAT = "yyyy-MM-dd HH";
	//中文年月日时日期格式
	public static final String DATE_WITHHOUR_CHN_FORMAT = "yyyy年MM月dd日 HH";
	//年月日时分日期格式
	public static final String DATE_WITHMINUTE_FORMAT = "yyyy-MM-dd HH:mm";
	//中文年月日时分日期格式
	public static final String DATE_WITHMINUTE_CHN_FORMAT = "yyyy年MM月dd日 HH:mm";
	//年月日时分秒日期格式
	public static final String DATE_WITHSECOND_FORMAT = "yyyy-MM-dd HH:mm:ss";
	//中文年月日时分秒日期格式
	public static final String DATE_WITHSECOND_CHN_FORMAT = "yyyy年MM月dd日 HH:mm:ss";
	//年月日时分秒毫秒日期格式
	public static final String DATE_WITHMILLISECOND_FORMAT = "yyyy-MM-dd HH:mm:ss.S";
	//中文年月日时分秒毫秒日期格式
	public static final String DATE_WITHMILLISECOND_CHN_FORMAT = "yyyy年MM月dd日 HH:mm:ss.S";

	/**
	 * Session中保存的用户信息
	 */
	public static final String SESSION_USER = "user";
	
	/**
	 * 字符编码
	 */
	public static final String UTF8 = "utf-8";
	
	/**
	 * ====================返回处理======================
	 */
	public static final String RC_200= "200";
	public static final String RC_200_TEXT= "操作成功";
	public static final String RC_1001= "1001";
	public static final String RC_1001_TEXT= "服务端错误!";
	public static final String RC_1002= "1002";
	public static final String RC_1002_TEXT= "后端服务暂时不可用";
	public static final String RC_1003= "1003";
	public static final String RC_1003_TEXT= "api接口不被支持";
	public static final String RC_1004= "1004";
	public static final String RC_1004_TEXT= "参数错误,请按照api接口传递参数!";
	public static final String RC_1005= "1005";
	public static final String RC_1005_TEXT= "登录态失效";
	public static final String RC_1006= "1006";
	public static final String RC_1006_TEXT= "交易已被使用";
	public static final String RC_1007= "1007";
	public static final String RC_1007_TEXT= "参数过多";
	public static final String RC_1008= "1008";
	public static final String RC_1008_TEXT= "参数签名算法未被平台所支持";
	public static final String RC_1009= "1009";
	public static final String RC_1009_TEXT= "没有权限访问数据";
	public static final String RC_1010= "1010";
	public static final String RC_1010_TEXT= "应用不存在";
	public static final String RC_1011= "1011";
	public static final String RC_1011_TEXT= "必选参数格式错误";
	public static final String RC_1012= "1012";
	public static final String RC_1012_TEXT= "提交回答的问题生命已结束";
	public static final String RC_1013= "1013";
	public static final String RC_1013_TEXT= "密码错误";
	public static final String RC_1014= "1014";
	public static final String RC_1014_TEXT= "帐号不存在";
	public static final String RC_1015= "1015";
	public static final String RC_1015_TEXT= "此人员不存在";
	
	public static String CONTENT_CLASSTYPE = "";
	
    //-----------------------日志相关-------------------------
    /**
     * 模块
     */
    //用户登录
    public static final String LOG_LOGIN = "0";
    //菜单模块
    public static final String LOG_MENU = "1";
    //用户模块
    public static final String LOG_USER_INFO = "2";
    //菜单模块
    public static final String LOG_LOG_INFO = "3";
    //角色模块
    public static final String LOG_ROLE_INFO = "4";
    //用户角色关联模块
    public static final String LOG_USER_REL_ROLE = "5";
    //角色菜单关联模块
    public static final String LOG_ROLE_REL_MENU = "6";
    //数据字典模块
    public static final String LOG_DICTIONARY = "7";
    //地区模块
    public static final String LOG_LOCATION_INFO = "8";
    //组织机构模块
    public static final String LOG_DEPART_INFO = "9";
    //用户组织机构关联模块
    public static final String LOG_USER_REL_DEPART = "10";
    //用户组织机构关联角色关联模块
    public static final String LOG_USERDEPART_REL_ROLE = "11";
    
    /**
     * 业务类型
     */
    //新增或修改
    public static final String BUSINESS_ADDOREDIT = "0";
    //真删除
    public static final String BUSINESS_DEL = "2";
    //逻辑删除
    public static final String BUSINESS_DELINLOGIC = "3";
    
    
    //其它
    public static final String BUSINESS_OTHER = "9";
    //-----------------------日志相关-------------------------
}
