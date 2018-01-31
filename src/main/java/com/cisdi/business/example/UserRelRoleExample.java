package com.cisdi.business.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cisdi.base.example.BaseExample;
import com.cisdi.base.util.BaseUtil;

public class UserRelRoleExample extends BaseExample {


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
            addCriterion("userRelRole.id is null");
            return (Criteria) this;
        }
        
        public Criteria andIdIsNotNull() {
            addCriterion("userRelRole.id is not null");
            return (Criteria) this;
        }
        
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("userRelRole.id =", value, "userRelRole.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("userRelRole.id <>", value, "userRelRole.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("userRelRole.id >", value, "userRelRole.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userRelRole.id >=", value, "userRelRole.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThan(Integer value) {
            addCriterion("userRelRole.id <", value, "userRelRole.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("userRelRole.id <=", value, "userRelRole.id");
            return (Criteria) this;
        }
        
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("userRelRole.id in", values, "userRelRole.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("userRelRole.id not in", values, "userRelRole.id");
            return (Criteria) this;
        }
        
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("userRelRole.id between", value1, value2, "userRelRole.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userRelRole.id not between", value1, value2, "userRelRole.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLike(Integer value) {
            addCriterion("userRelRole.id like", value, "userRelRole.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotLike(Integer value) {
            addCriterion("userRelRole.id not like", value, "userRelRole.id");
            return (Criteria) this;
        }
        public Criteria andUserIdIsNull() {
            addCriterion("userRelRole.user_id is null");
            return (Criteria) this;
        }
        
        public Criteria andUserIdIsNotNull() {
            addCriterion("userRelRole.user_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("userRelRole.user_id =", value, "userRelRole.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("userRelRole.user_id <>", value, "userRelRole.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("userRelRole.user_id >", value, "userRelRole.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userRelRole.user_id >=", value, "userRelRole.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("userRelRole.user_id <", value, "userRelRole.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("userRelRole.user_id <=", value, "userRelRole.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("userRelRole.user_id in", values, "userRelRole.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("userRelRole.user_id not in", values, "userRelRole.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("userRelRole.user_id between", value1, value2, "userRelRole.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userRelRole.user_id not between", value1, value2, "userRelRole.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdLike(Integer value) {
            addCriterion("userRelRole.user_id like", value, "userRelRole.userId");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotLike(Integer value) {
            addCriterion("userRelRole.user_id not like", value, "userRelRole.userId");
            return (Criteria) this;
        }
        public Criteria andRoleIdIsNull() {
            addCriterion("userRelRole.role_id is null");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdIsNotNull() {
            addCriterion("userRelRole.role_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("userRelRole.role_id =", value, "userRelRole.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("userRelRole.role_id <>", value, "userRelRole.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("userRelRole.role_id >", value, "userRelRole.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userRelRole.role_id >=", value, "userRelRole.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("userRelRole.role_id <", value, "userRelRole.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("userRelRole.role_id <=", value, "userRelRole.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("userRelRole.role_id in", values, "userRelRole.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("userRelRole.role_id not in", values, "userRelRole.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("userRelRole.role_id between", value1, value2, "userRelRole.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userRelRole.role_id not between", value1, value2, "userRelRole.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdLike(Integer value) {
            addCriterion("userRelRole.role_id like", value, "userRelRole.roleId");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdNotLike(Integer value) {
            addCriterion("userRelRole.role_id not like", value, "userRelRole.roleId");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNull() {
            addCriterion("userRelRole.create_time is null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("userRelRole.create_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("userRelRole.create_time =", value, "userRelRole.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("userRelRole.create_time <>", value, "userRelRole.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("userRelRole.create_time >", value, "userRelRole.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userRelRole.create_time >=", value, "userRelRole.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("userRelRole.create_time <", value, "userRelRole.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("userRelRole.create_time <=", value, "userRelRole.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("userRelRole.create_time in", values, "userRelRole.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("userRelRole.create_time not in", values, "userRelRole.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("userRelRole.create_time between", value1, value2, "userRelRole.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("userRelRole.create_time not between", value1, value2, "userRelRole.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLike(Date value) {
            addCriterion("userRelRole.create_time like", value, "userRelRole.createTime");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotLike(Date value) {
            addCriterion("userRelRole.create_time not like", value, "userRelRole.createTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNull() {
            addCriterion("userRelRole.update_time is null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("userRelRole.update_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("userRelRole.update_time =", value, "userRelRole.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("userRelRole.update_time <>", value, "userRelRole.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("userRelRole.update_time >", value, "userRelRole.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userRelRole.update_time >=", value, "userRelRole.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("userRelRole.update_time <", value, "userRelRole.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("userRelRole.update_time <=", value, "userRelRole.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("userRelRole.update_time in", values, "userRelRole.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("userRelRole.update_time not in", values, "userRelRole.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("userRelRole.update_time between", value1, value2, "userRelRole.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("userRelRole.update_time not between", value1, value2, "userRelRole.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLike(Date value) {
            addCriterion("userRelRole.update_time like", value, "userRelRole.updateTime");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotLike(Date value) {
            addCriterion("userRelRole.update_time not like", value, "userRelRole.updateTime");
            return (Criteria) this;
        }
        public Criteria andDeleteflagIsNull() {
            addCriterion("userRelRole.deleteflag is null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIsNotNull() {
            addCriterion("userRelRole.deleteflag is not null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagEqualTo(String value) {
            addCriterion("userRelRole.deleteflag =", value, "userRelRole.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotEqualTo(String value) {
            addCriterion("userRelRole.deleteflag <>", value, "userRelRole.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThan(String value) {
            addCriterion("userRelRole.deleteflag >", value, "userRelRole.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThanOrEqualTo(String value) {
            addCriterion("userRelRole.deleteflag >=", value, "userRelRole.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThan(String value) {
            addCriterion("userRelRole.deleteflag <", value, "userRelRole.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThanOrEqualTo(String value) {
            addCriterion("userRelRole.deleteflag <=", value, "userRelRole.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIn(List<String> values) {
            addCriterion("userRelRole.deleteflag in", values, "userRelRole.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotIn(List<String> values) {
            addCriterion("userRelRole.deleteflag not in", values, "userRelRole.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagBetween(String value1, String value2) {
            addCriterion("userRelRole.deleteflag between", value1, value2, "userRelRole.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotBetween(String value1, String value2) {
            addCriterion("userRelRole.deleteflag not between", value1, value2, "userRelRole.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLike(String value) {
            addCriterion("userRelRole.deleteflag like", value, "userRelRole.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotLike(String value) {
            addCriterion("userRelRole.deleteflag not like", value, "userRelRole.deleteflag");
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
    
    public UserRelRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
    
    public UserRelRoleExample(String deleteflag) {
    	Criteria criteria = new Criteria();
    	criteria.andDeleteflagEqualTo(deleteflag);
    	oredCriteria = new ArrayList<Criteria>();
    	oredCriteria.add(criteria);
    }
}