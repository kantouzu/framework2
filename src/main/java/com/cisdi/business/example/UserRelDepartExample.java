package com.cisdi.business.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cisdi.base.example.BaseExample;
import com.cisdi.base.util.BaseUtil;

public class UserRelDepartExample extends BaseExample {


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
            addCriterion("userRelDepart.id is null");
            return (Criteria) this;
        }
        
        public Criteria andIdIsNotNull() {
            addCriterion("userRelDepart.id is not null");
            return (Criteria) this;
        }
        
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("userRelDepart.id =", value, "userRelDepart.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("userRelDepart.id <>", value, "userRelDepart.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("userRelDepart.id >", value, "userRelDepart.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userRelDepart.id >=", value, "userRelDepart.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThan(Integer value) {
            addCriterion("userRelDepart.id <", value, "userRelDepart.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("userRelDepart.id <=", value, "userRelDepart.id");
            return (Criteria) this;
        }
        
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("userRelDepart.id in", values, "userRelDepart.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("userRelDepart.id not in", values, "userRelDepart.id");
            return (Criteria) this;
        }
        
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("userRelDepart.id between", value1, value2, "userRelDepart.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userRelDepart.id not between", value1, value2, "userRelDepart.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLike(Integer value) {
            addCriterion("userRelDepart.id like", value, "userRelDepart.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotLike(Integer value) {
            addCriterion("userRelDepart.id not like", value, "userRelDepart.id");
            return (Criteria) this;
        }
        public Criteria andUserIdIsNull() {
            addCriterion("userRelDepart.user_id is null");
            return (Criteria) this;
        }
        
        public Criteria andUserIdIsNotNull() {
            addCriterion("userRelDepart.user_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("userRelDepart.user_id =", value, "userRelDepart.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("userRelDepart.user_id <>", value, "userRelDepart.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("userRelDepart.user_id >", value, "userRelDepart.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userRelDepart.user_id >=", value, "userRelDepart.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("userRelDepart.user_id <", value, "userRelDepart.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("userRelDepart.user_id <=", value, "userRelDepart.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("userRelDepart.user_id in", values, "userRelDepart.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("userRelDepart.user_id not in", values, "userRelDepart.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("userRelDepart.user_id between", value1, value2, "userRelDepart.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userRelDepart.user_id not between", value1, value2, "userRelDepart.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdLike(Integer value) {
            addCriterion("userRelDepart.user_id like", value, "userRelDepart.userId");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotLike(Integer value) {
            addCriterion("userRelDepart.user_id not like", value, "userRelDepart.userId");
            return (Criteria) this;
        }
        public Criteria andDepartIdIsNull() {
            addCriterion("userRelDepart.depart_id is null");
            return (Criteria) this;
        }
        
        public Criteria andDepartIdIsNotNull() {
            addCriterion("userRelDepart.depart_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andDepartIdEqualTo(String value) {
            addCriterion("userRelDepart.depart_id =", value, "userRelDepart.depart_id");
            return (Criteria) this;
        }
        
        public Criteria andDepartIdNotEqualTo(String value) {
            addCriterion("userRelDepart.depart_id <>", value, "userRelDepart.depart_id");
            return (Criteria) this;
        }
        
        public Criteria andDepartIdGreaterThan(String value) {
            addCriterion("userRelDepart.depart_id >", value, "userRelDepart.depart_id");
            return (Criteria) this;
        }
        
        public Criteria andDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("userRelDepart.depart_id >=", value, "userRelDepart.depart_id");
            return (Criteria) this;
        }
        
        public Criteria andDepartIdLessThan(String value) {
            addCriterion("userRelDepart.depart_id <", value, "userRelDepart.depart_id");
            return (Criteria) this;
        }
        
        public Criteria andDepartIdLessThanOrEqualTo(String value) {
            addCriterion("userRelDepart.depart_id <=", value, "userRelDepart.depart_id");
            return (Criteria) this;
        }
        
        public Criteria andDepartIdIn(List<String> values) {
            addCriterion("userRelDepart.depart_id in", values, "userRelDepart.depart_id");
            return (Criteria) this;
        }
        
        public Criteria andDepartIdNotIn(List<String> values) {
            addCriterion("userRelDepart.depart_id not in", values, "userRelDepart.depart_id");
            return (Criteria) this;
        }
        
        public Criteria andDepartIdBetween(String value1, String value2) {
            addCriterion("userRelDepart.depart_id between", value1, value2, "userRelDepart.depart_id");
            return (Criteria) this;
        }
        
        public Criteria andDepartIdNotBetween(String value1, String value2) {
            addCriterion("userRelDepart.depart_id not between", value1, value2, "userRelDepart.depart_id");
            return (Criteria) this;
        }
        
        public Criteria andDepartIdLike(String value) {
            addCriterion("userRelDepart.depart_id like", value, "userRelDepart.departId");
            return (Criteria) this;
        }
        
        public Criteria andDepartIdNotLike(String value) {
            addCriterion("userRelDepart.depart_id not like", value, "userRelDepart.departId");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNull() {
            addCriterion("userRelDepart.create_time is null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("userRelDepart.create_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("userRelDepart.create_time =", value, "userRelDepart.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("userRelDepart.create_time <>", value, "userRelDepart.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("userRelDepart.create_time >", value, "userRelDepart.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userRelDepart.create_time >=", value, "userRelDepart.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("userRelDepart.create_time <", value, "userRelDepart.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("userRelDepart.create_time <=", value, "userRelDepart.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("userRelDepart.create_time in", values, "userRelDepart.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("userRelDepart.create_time not in", values, "userRelDepart.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("userRelDepart.create_time between", value1, value2, "userRelDepart.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("userRelDepart.create_time not between", value1, value2, "userRelDepart.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLike(Date value) {
            addCriterion("userRelDepart.create_time like", value, "userRelDepart.createTime");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotLike(Date value) {
            addCriterion("userRelDepart.create_time not like", value, "userRelDepart.createTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNull() {
            addCriterion("userRelDepart.update_time is null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("userRelDepart.update_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("userRelDepart.update_time =", value, "userRelDepart.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("userRelDepart.update_time <>", value, "userRelDepart.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("userRelDepart.update_time >", value, "userRelDepart.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userRelDepart.update_time >=", value, "userRelDepart.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("userRelDepart.update_time <", value, "userRelDepart.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("userRelDepart.update_time <=", value, "userRelDepart.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("userRelDepart.update_time in", values, "userRelDepart.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("userRelDepart.update_time not in", values, "userRelDepart.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("userRelDepart.update_time between", value1, value2, "userRelDepart.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("userRelDepart.update_time not between", value1, value2, "userRelDepart.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLike(Date value) {
            addCriterion("userRelDepart.update_time like", value, "userRelDepart.updateTime");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotLike(Date value) {
            addCriterion("userRelDepart.update_time not like", value, "userRelDepart.updateTime");
            return (Criteria) this;
        }
        public Criteria andDeleteflagIsNull() {
            addCriterion("userRelDepart.deleteflag is null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIsNotNull() {
            addCriterion("userRelDepart.deleteflag is not null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagEqualTo(String value) {
            addCriterion("userRelDepart.deleteflag =", value, "userRelDepart.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotEqualTo(String value) {
            addCriterion("userRelDepart.deleteflag <>", value, "userRelDepart.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThan(String value) {
            addCriterion("userRelDepart.deleteflag >", value, "userRelDepart.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThanOrEqualTo(String value) {
            addCriterion("userRelDepart.deleteflag >=", value, "userRelDepart.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThan(String value) {
            addCriterion("userRelDepart.deleteflag <", value, "userRelDepart.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThanOrEqualTo(String value) {
            addCriterion("userRelDepart.deleteflag <=", value, "userRelDepart.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIn(List<String> values) {
            addCriterion("userRelDepart.deleteflag in", values, "userRelDepart.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotIn(List<String> values) {
            addCriterion("userRelDepart.deleteflag not in", values, "userRelDepart.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagBetween(String value1, String value2) {
            addCriterion("userRelDepart.deleteflag between", value1, value2, "userRelDepart.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotBetween(String value1, String value2) {
            addCriterion("userRelDepart.deleteflag not between", value1, value2, "userRelDepart.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLike(String value) {
            addCriterion("userRelDepart.deleteflag like", value, "userRelDepart.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotLike(String value) {
            addCriterion("userRelDepart.deleteflag not like", value, "userRelDepart.deleteflag");
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
    
    public UserRelDepartExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
    
    public UserRelDepartExample(String deleteflag) {
    	Criteria criteria = new Criteria();
    	criteria.andDeleteflagEqualTo(deleteflag);
    	oredCriteria = new ArrayList<Criteria>();
    	oredCriteria.add(criteria);
    }
}