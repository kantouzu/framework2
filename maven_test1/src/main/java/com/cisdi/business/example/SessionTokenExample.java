package com.cisdi.business.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cisdi.base.example.BaseExample;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.example.UserInfoExample.Criterion;

public class SessionTokenExample extends BaseExample {


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
            addCriterion("id is null");
            return (Criteria) this;
        }
        
        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }
        
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }
        
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }
        
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
        
        public Criteria andIdLike(Integer value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotLike(Integer value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }
        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }
        
        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdLike(Integer value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotLike(Integer value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }
        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }
        
        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }
        
        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }
        
        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }
        
        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }
        
        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }
        
        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }
        
        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }
        
        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }
        
        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }
        
        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }
        
        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }
        
        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }
        
        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }
        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }
        
        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("expire_time =", value, "expire_time");
            return (Criteria) this;
        }
        
        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("expire_time <>", value, "expire_time");
            return (Criteria) this;
        }
        
        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("expire_time >", value, "expire_time");
            return (Criteria) this;
        }
        
        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_time >=", value, "expire_time");
            return (Criteria) this;
        }
        
        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("expire_time <", value, "expire_time");
            return (Criteria) this;
        }
        
        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("expire_time <=", value, "expire_time");
            return (Criteria) this;
        }
        
        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("expire_time in", values, "expire_time");
            return (Criteria) this;
        }
        
        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("expire_time not in", values, "expire_time");
            return (Criteria) this;
        }
        
        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("expire_time between", value1, value2, "expire_time");
            return (Criteria) this;
        }
        
        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("expire_time not between", value1, value2, "expire_time");
            return (Criteria) this;
        }
        
        public Criteria andExpireTimeLike(Date value) {
            addCriterion("expire_time like", value, "expireTime");
            return (Criteria) this;
        }
        
        public Criteria andExpireTimeNotLike(Date value) {
            addCriterion("expire_time not like", value, "expireTime");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLike(Date value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotLike(Date value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLike(Date value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotLike(Date value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }
        public Criteria andDeleteflagIsNull() {
            addCriterion("deleteflag is null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIsNotNull() {
            addCriterion("deleteflag is not null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagEqualTo(String value) {
            addCriterion("deleteflag =", value, "deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotEqualTo(String value) {
            addCriterion("deleteflag <>", value, "deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThan(String value) {
            addCriterion("deleteflag >", value, "deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThanOrEqualTo(String value) {
            addCriterion("deleteflag >=", value, "deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThan(String value) {
            addCriterion("deleteflag <", value, "deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThanOrEqualTo(String value) {
            addCriterion("deleteflag <=", value, "deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIn(List<String> values) {
            addCriterion("deleteflag in", values, "deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotIn(List<String> values) {
            addCriterion("deleteflag not in", values, "deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagBetween(String value1, String value2) {
            addCriterion("deleteflag between", value1, value2, "deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotBetween(String value1, String value2) {
            addCriterion("deleteflag not between", value1, value2, "deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLike(String value) {
            addCriterion("deleteflag like", value, "deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotLike(String value) {
            addCriterion("deleteflag not like", value, "deleteflag");
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
    
    public SessionTokenExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
    
    public SessionTokenExample(String deleteflag) {
    	Criteria criteria = new Criteria();
    	criteria.andDeleteflagEqualTo(deleteflag);
    	oredCriteria = new ArrayList<Criteria>();
    	oredCriteria.add(criteria);
    }
}