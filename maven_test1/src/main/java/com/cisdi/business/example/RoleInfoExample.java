package com.cisdi.business.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cisdi.base.example.BaseExample;
import com.cisdi.base.util.BaseUtil;

public class RoleInfoExample extends BaseExample {


    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (!BaseUtil.isEmpty(condition)) {
                criteria.add(new Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (!BaseUtil.isEmpty(value)) {
            	criteria.add(new Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (!BaseUtil.isEmpty(value1) && !BaseUtil.isEmpty(value2)) {
            	criteria.add(new Criterion(condition, value1, value2));
            }
        }
        
        public Criteria andIdIsNull() {
            addCriterion("roleInfo.id is null");
            return (Criteria) this;
        }
        
        public Criteria andIdIsNotNull() {
            addCriterion("roleInfo.id is not null");
            return (Criteria) this;
        }
        
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("roleInfo.id =", value, "roleInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("roleInfo.id <>", value, "roleInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("roleInfo.id >", value, "roleInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleInfo.id >=", value, "roleInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThan(Integer value) {
            addCriterion("roleInfo.id <", value, "roleInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("roleInfo.id <=", value, "roleInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("roleInfo.id in", values, "roleInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("roleInfo.id not in", values, "roleInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("roleInfo.id between", value1, value2, "roleInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roleInfo.id not between", value1, value2, "roleInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLike(Integer value) {
            addCriterion("roleInfo.id like", value, "roleInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotLike(Integer value) {
            addCriterion("roleInfo.id not like", value, "roleInfo.id");
            return (Criteria) this;
        }
        public Criteria andRoleNameIsNull() {
            addCriterion("roleInfo.role_name is null");
            return (Criteria) this;
        }
        
        public Criteria andRoleNameIsNotNull() {
            addCriterion("roleInfo.role_name is not null");
            return (Criteria) this;
        }
        
        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("roleInfo.role_name =", value, "roleInfo.role_name");
            return (Criteria) this;
        }
        
        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("roleInfo.role_name <>", value, "roleInfo.role_name");
            return (Criteria) this;
        }
        
        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("roleInfo.role_name >", value, "roleInfo.role_name");
            return (Criteria) this;
        }
        
        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("roleInfo.role_name >=", value, "roleInfo.role_name");
            return (Criteria) this;
        }
        
        public Criteria andRoleNameLessThan(String value) {
            addCriterion("roleInfo.role_name <", value, "roleInfo.role_name");
            return (Criteria) this;
        }
        
        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("roleInfo.role_name <=", value, "roleInfo.role_name");
            return (Criteria) this;
        }
        
        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("roleInfo.role_name in", values, "roleInfo.role_name");
            return (Criteria) this;
        }
        
        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("roleInfo.role_name not in", values, "roleInfo.role_name");
            return (Criteria) this;
        }
        
        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("roleInfo.role_name between", value1, value2, "roleInfo.role_name");
            return (Criteria) this;
        }
        
        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("roleInfo.role_name not between", value1, value2, "roleInfo.role_name");
            return (Criteria) this;
        }
        
        public Criteria andRoleNameLike(String value) {
            addCriterion("roleInfo.role_name like", value, "roleInfo.roleName");
            return (Criteria) this;
        }
        
        public Criteria andRoleNameNotLike(String value) {
            addCriterion("roleInfo.role_name not like", value, "roleInfo.roleName");
            return (Criteria) this;
        }
        public Criteria andRoleCodeIsNull() {
            addCriterion("roleInfo.role_code is null");
            return (Criteria) this;
        }
        
        public Criteria andRoleCodeIsNotNull() {
            addCriterion("roleInfo.role_code is not null");
            return (Criteria) this;
        }
        
        public Criteria andRoleCodeEqualTo(String value) {
            addCriterion("roleInfo.role_code =", value, "roleInfo.role_code");
            return (Criteria) this;
        }
        
        public Criteria andRoleCodeNotEqualTo(String value) {
            addCriterion("roleInfo.role_code <>", value, "roleInfo.role_code");
            return (Criteria) this;
        }
        
        public Criteria andRoleCodeGreaterThan(String value) {
            addCriterion("roleInfo.role_code >", value, "roleInfo.role_code");
            return (Criteria) this;
        }
        
        public Criteria andRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("roleInfo.role_code >=", value, "roleInfo.role_code");
            return (Criteria) this;
        }
        
        public Criteria andRoleCodeLessThan(String value) {
            addCriterion("roleInfo.role_code <", value, "roleInfo.role_code");
            return (Criteria) this;
        }
        
        public Criteria andRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("roleInfo.role_code <=", value, "roleInfo.role_code");
            return (Criteria) this;
        }
        
        public Criteria andRoleCodeIn(List<String> values) {
            addCriterion("roleInfo.role_code in", values, "roleInfo.role_code");
            return (Criteria) this;
        }
        
        public Criteria andRoleCodeNotIn(List<String> values) {
            addCriterion("roleInfo.role_code not in", values, "roleInfo.role_code");
            return (Criteria) this;
        }
        
        public Criteria andRoleCodeBetween(String value1, String value2) {
            addCriterion("roleInfo.role_code between", value1, value2, "roleInfo.role_code");
            return (Criteria) this;
        }
        
        public Criteria andRoleCodeNotBetween(String value1, String value2) {
            addCriterion("roleInfo.role_code not between", value1, value2, "roleInfo.role_code");
            return (Criteria) this;
        }
        
        public Criteria andRoleCodeLike(String value) {
            addCriterion("roleInfo.role_code like", value, "roleInfo.roleCode");
            return (Criteria) this;
        }
        
        public Criteria andRoleCodeNotLike(String value) {
            addCriterion("roleInfo.role_code not like", value, "roleInfo.roleCode");
            return (Criteria) this;
        }
        public Criteria andRoleTypeIsNull() {
            addCriterion("roleInfo.role_type is null");
            return (Criteria) this;
        }
        
        public Criteria andRoleTypeIsNotNull() {
            addCriterion("roleInfo.role_type is not null");
            return (Criteria) this;
        }
        
        public Criteria andRoleTypeEqualTo(String value) {
            addCriterion("roleInfo.role_type =", value, "roleInfo.role_type");
            return (Criteria) this;
        }
        
        public Criteria andRoleTypeNotEqualTo(String value) {
            addCriterion("roleInfo.role_type <>", value, "roleInfo.role_type");
            return (Criteria) this;
        }
        
        public Criteria andRoleTypeGreaterThan(String value) {
            addCriterion("roleInfo.role_type >", value, "roleInfo.role_type");
            return (Criteria) this;
        }
        
        public Criteria andRoleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("roleInfo.role_type >=", value, "roleInfo.role_type");
            return (Criteria) this;
        }
        
        public Criteria andRoleTypeLessThan(String value) {
            addCriterion("roleInfo.role_type <", value, "roleInfo.role_type");
            return (Criteria) this;
        }
        
        public Criteria andRoleTypeLessThanOrEqualTo(String value) {
            addCriterion("roleInfo.role_type <=", value, "roleInfo.role_type");
            return (Criteria) this;
        }
        
        public Criteria andRoleTypeIn(List<String> values) {
            addCriterion("roleInfo.role_type in", values, "roleInfo.role_type");
            return (Criteria) this;
        }
        
        public Criteria andRoleTypeNotIn(List<String> values) {
            addCriterion("roleInfo.role_type not in", values, "roleInfo.role_type");
            return (Criteria) this;
        }
        
        public Criteria andRoleTypeBetween(String value1, String value2) {
            addCriterion("roleInfo.role_type between", value1, value2, "roleInfo.role_type");
            return (Criteria) this;
        }
        
        public Criteria andRoleTypeNotBetween(String value1, String value2) {
            addCriterion("roleInfo.role_type not between", value1, value2, "roleInfo.role_type");
            return (Criteria) this;
        }
        
        public Criteria andRoleTypeLike(String value) {
            addCriterion("roleInfo.role_type like", value, "roleInfo.roleType");
            return (Criteria) this;
        }
        
        public Criteria andRoleTypeNotLike(String value) {
            addCriterion("roleInfo.role_type not like", value, "roleInfo.roleType");
            return (Criteria) this;
        }
        public Criteria andRemarkIsNull() {
            addCriterion("roleInfo.remark is null");
            return (Criteria) this;
        }
        
        public Criteria andRemarkIsNotNull() {
            addCriterion("roleInfo.remark is not null");
            return (Criteria) this;
        }
        
        public Criteria andRemarkEqualTo(String value) {
            addCriterion("roleInfo.remark =", value, "roleInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("roleInfo.remark <>", value, "roleInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("roleInfo.remark >", value, "roleInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("roleInfo.remark >=", value, "roleInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkLessThan(String value) {
            addCriterion("roleInfo.remark <", value, "roleInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("roleInfo.remark <=", value, "roleInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkIn(List<String> values) {
            addCriterion("roleInfo.remark in", values, "roleInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("roleInfo.remark not in", values, "roleInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("roleInfo.remark between", value1, value2, "roleInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("roleInfo.remark not between", value1, value2, "roleInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkLike(String value) {
            addCriterion("roleInfo.remark like", value, "roleInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotLike(String value) {
            addCriterion("roleInfo.remark not like", value, "roleInfo.remark");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNull() {
            addCriterion("roleInfo.create_time is null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("roleInfo.create_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("roleInfo.create_time =", value, "roleInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("roleInfo.create_time <>", value, "roleInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("roleInfo.create_time >", value, "roleInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("roleInfo.create_time >=", value, "roleInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("roleInfo.create_time <", value, "roleInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("roleInfo.create_time <=", value, "roleInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("roleInfo.create_time in", values, "roleInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("roleInfo.create_time not in", values, "roleInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("roleInfo.create_time between", value1, value2, "roleInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("roleInfo.create_time not between", value1, value2, "roleInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLike(Date value) {
            addCriterion("roleInfo.create_time like", value, "roleInfo.createTime");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotLike(Date value) {
            addCriterion("roleInfo.create_time not like", value, "roleInfo.createTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNull() {
            addCriterion("roleInfo.update_time is null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("roleInfo.update_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("roleInfo.update_time =", value, "roleInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("roleInfo.update_time <>", value, "roleInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("roleInfo.update_time >", value, "roleInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("roleInfo.update_time >=", value, "roleInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("roleInfo.update_time <", value, "roleInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("roleInfo.update_time <=", value, "roleInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("roleInfo.update_time in", values, "roleInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("roleInfo.update_time not in", values, "roleInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("roleInfo.update_time between", value1, value2, "roleInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("roleInfo.update_time not between", value1, value2, "roleInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLike(Date value) {
            addCriterion("roleInfo.update_time like", value, "roleInfo.updateTime");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotLike(Date value) {
            addCriterion("roleInfo.update_time not like", value, "roleInfo.updateTime");
            return (Criteria) this;
        }
        public Criteria andDeleteflagIsNull() {
            addCriterion("roleInfo.deleteflag is null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIsNotNull() {
            addCriterion("roleInfo.deleteflag is not null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagEqualTo(String value) {
            addCriterion("roleInfo.deleteflag =", value, "roleInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotEqualTo(String value) {
            addCriterion("roleInfo.deleteflag <>", value, "roleInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThan(String value) {
            addCriterion("roleInfo.deleteflag >", value, "roleInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThanOrEqualTo(String value) {
            addCriterion("roleInfo.deleteflag >=", value, "roleInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThan(String value) {
            addCriterion("roleInfo.deleteflag <", value, "roleInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThanOrEqualTo(String value) {
            addCriterion("roleInfo.deleteflag <=", value, "roleInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIn(List<String> values) {
            addCriterion("roleInfo.deleteflag in", values, "roleInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotIn(List<String> values) {
            addCriterion("roleInfo.deleteflag not in", values, "roleInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagBetween(String value1, String value2) {
            addCriterion("roleInfo.deleteflag between", value1, value2, "roleInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotBetween(String value1, String value2) {
            addCriterion("roleInfo.deleteflag not between", value1, value2, "roleInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLike(String value) {
            addCriterion("roleInfo.deleteflag like", value, "roleInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotLike(String value) {
            addCriterion("roleInfo.deleteflag not like", value, "roleInfo.deleteflag");
            return (Criteria) this;
        }

    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
    
    public void setOredCriteria(List<Criteria> oredCriteria) {
		this.oredCriteria = oredCriteria;
	}

	public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    public Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        public Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        public Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        public Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        public Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        public Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
    
    public List<Criteria> oredCriteria;
    
    public RoleInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
    
    public RoleInfoExample(String deleteflag) {
    	Criteria criteria = new Criteria();
    	criteria.andDeleteflagEqualTo(deleteflag);
    	oredCriteria = new ArrayList<Criteria>();
    	oredCriteria.add(criteria);
    }
}