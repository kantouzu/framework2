package com.cisdi.base.common.table;

import java.io.Serializable;
import java.util.List;

/**
 * @功能说明：通用select联表类
 * 			用于自动拼接主表联从表，自定义连接类型，表名，以及连接字段
 * @作者：xiangjz
 * @创建日期： 2018-01-12
 */
public class TableJoinBean implements Serializable{ 

	private static final long serialVersionUID = 1L;

	//连接类型
	private String joinType; 
	//表名
	private String tableName;
	//别名
	private String alias;
	//连接字段名
	private List<FieldJoinBean> fieldJoin ;
	//其它条件
	private String conditionStr;

	public String getJoinType() {
		return joinType;
	}

	public void setJoinType(String joinType) {
		this.joinType = joinType;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public List<FieldJoinBean> getFieldJoin() {
		return fieldJoin;
	}

	public void setFieldJoin(List<FieldJoinBean> fieldJoin) {
		this.fieldJoin = fieldJoin;
	}

	public String getConditionStr() {
		return conditionStr;
	}

	public void setConditionStr(String conditionStr) {
		this.conditionStr = conditionStr;
	}

	public TableJoinBean() {
		super();
	}

	public TableJoinBean(String joinType, String tableName, String alias) {
		super();
		this.joinType = joinType;
		this.tableName = tableName;
		this.alias = alias;
	}

	public TableJoinBean(String joinType, String tableName, String alias,
			String conditionStr) {
		super();
		this.joinType = joinType;
		this.tableName = tableName;
		this.alias = alias;
		this.conditionStr = conditionStr;
	}

	public TableJoinBean(String joinType, String tableName, String alias,
			List<FieldJoinBean> fieldJoin, String conditionStr) {
		super();
		this.joinType = joinType;
		this.tableName = tableName;
		this.alias = alias;
		this.fieldJoin = fieldJoin;
		this.conditionStr = conditionStr;
	}

}
