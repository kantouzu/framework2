package com.cisdi.base.common.enums;

import com.cisdi.base.util.BaseUtil;


/**
 * 
 * @功能说明：枚举定义{ }
 * @作者：xiangjz
 * @创建日期： 2018-01-02
 */
public class CommonEnumType {

	private static SystemResourceUtil util = SystemResourceUtil.getInstance();

	/**
	 * 根据key获取名称
	 * 
	 * @param val
	 * @return
	 */
	public static String getEnumNameByKey(String val, String keys) {

		Object key = util.resourceAsMap("comEnum_" + val + "_map").get(keys);
		if (BaseUtil.isEmpty(key))
			return "";
		return (String) key;
	}

	/**
	 * 非业务用户类型代码
	 */
	public enum UserTypeCode {
		超级管理员("1000"), 系统管理员("1001"), 普通管理员("2000"), 录入人员("3001"), 
//		初审人员("4001"), 复审人员("4002"), 终审人员("4003"), 
		查询人员("5001");

		private String value;

		public String getValue() {
			return value;
		}

		UserTypeCode(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 用户角色种类
	 */
	public enum RoleType {
		非业务型("0"), 业务型("1");
		
		private String value;
		
		public String getValue() {
			return value;
		}
		
		RoleType(String value) {
			this.value = value;
		}
	}

	/**
	 * 审核状态:(13-草稿,1-待确认，2-初审中，3-复审中，4-终审中，5-集团审核中，6-通过，7-退回)
	 */
	public enum AuditStatue {
        待确认("1"), 三级审核中("2"), 二级初审中("3"), 二级复审中("8"), 二级终审中("9"), 集团初审中("4"), 集团复审中("5"), 集团终审中("10"), 股份审核中("11"), 股份外审核中("12"), 通过("6"), 退回("7"),草稿("13");
		private String value;

		public String getValue() {
			return value;
		}

		AuditStatue(String value) {
			this.value = value;
		}
	}

	/**
	 * 审核结果:0--不通过,1--通过
	 */
	public enum AuditResult {
		不通过("0"), 通过("1");
		private String value;

		public String getValue() {
			return value;
		}

		AuditResult(String value) {
			this.value = value;
		}
	}

	/**
	 * 比较运算枚举:大于("0"),小于("1"),等于("2");
	 */
	public enum CompareCalculate {
		大于("0"), 小于("1"), 等于("2");
		private String value;

		public String getValue() {
			return value;
		}

		CompareCalculate(String value) {
			this.value = value;
		}
	}

	/**
	 * 附件类型:
	 */
	public enum AttachType {
		工程合同附件("1"), 房地产相关附件("2"), 消息附件("3");
		private String value;

		public String getValue() {
			return value;
		}

		AttachType(String value) {
			this.value = value;
		}
	}

	/**
	 * 未删除/已删除
	 */
	public enum DeleteFlag {
		未删除("0"), 已删除("1");
		private String value;

		public String getValue() {
			return value;
		}

		DeleteFlag(String value) {
			this.value = value;
		}
	}

	/**
	 * 性别
	 */
	public enum GenderFlag {
		女("f"), 男("m");
		private String value;

		public String getValue() {
			return value;
		}

		GenderFlag(String value) {
			this.value = value;
		}
	}

	/**
	 * 是/否
	 */
	public enum YesOrNo {
		否("0"), 是("1");
		private String value;

		public String getValue() {
			return value;
		}

		YesOrNo(String value) {
			this.value = value;
		}
	}

	/**
	 * 日志记录模块名称
	 */
	public enum LogModuleType {
		用户登录("0");
		private String value;

		public String getValue() {
			return value;
		}

		LogModuleType(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 客户端种类
	 */
	public enum ClientType {
		pc("0"),Android("1"),iOS("2"),wap("3"),other("4");
		private String value;
		
		public String getValue() {
			return value;
		}
		
		ClientType(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 业务操作类型
	 */
	public enum BusinessType {
		新增("0"),修改("1"),真删除("2"),逻辑删除("3"),其它("9");
		private String value;
		
		public String getValue() {
			return value;
		}
		
		BusinessType(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 表连接类型
	 */
	public enum JoinType {
		COMMA(","), //
        JOIN("JOIN"), //
        INNER_JOIN("INNER JOIN"), //
        CROSS_JOIN("CROSS JOIN"), //
        NATURAL_JOIN("NATURAL JOIN"), //
        NATURAL_INNER_JOIN("NATURAL INNER JOIN"), //
        LEFT_OUTER_JOIN("LEFT JOIN"), RIGHT_OUTER_JOIN("RIGHT JOIN"), FULL_OUTER_JOIN("FULL JOIN"),
        STRAIGHT_JOIN("STRAIGHT_JOIN");
		private String value;
		
		public String getValue() {
			return value;
		}
		
		JoinType(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 数据字典类型
	 */
	public enum DicType {
		测试字典1("1001"),测试字典2("1002");
		private String value;
		
		public String getValue() {
			return value;
		}
		
		DicType(String value) {
			this.value = value;
		}
	}
}