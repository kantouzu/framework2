package com.cisdi.business.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cisdi.base.example.BaseExample;
import com.cisdi.base.util.BaseUtil;

public class DepartInfoExample extends BaseExample {


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
            addCriterion("departInfo.id is null");
            return (Criteria) this;
        }
        
        public Criteria andIdIsNotNull() {
            addCriterion("departInfo.id is not null");
            return (Criteria) this;
        }
        
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("departInfo.id =", value, "departInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("departInfo.id <>", value, "departInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("departInfo.id >", value, "departInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("departInfo.id >=", value, "departInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThan(Integer value) {
            addCriterion("departInfo.id <", value, "departInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("departInfo.id <=", value, "departInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("departInfo.id in", values, "departInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("departInfo.id not in", values, "departInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("departInfo.id between", value1, value2, "departInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("departInfo.id not between", value1, value2, "departInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLike(Integer value) {
            addCriterion("departInfo.id like", value, "departInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotLike(Integer value) {
            addCriterion("departInfo.id not like", value, "departInfo.id");
            return (Criteria) this;
        }
        public Criteria andNameIsNull() {
            addCriterion("departInfo.name is null");
            return (Criteria) this;
        }
        
        public Criteria andNameIsNotNull() {
            addCriterion("departInfo.name is not null");
            return (Criteria) this;
        }
        
        public Criteria andNameEqualTo(String value) {
            addCriterion("departInfo.name =", value, "departInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameNotEqualTo(String value) {
            addCriterion("departInfo.name <>", value, "departInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameGreaterThan(String value) {
            addCriterion("departInfo.name >", value, "departInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("departInfo.name >=", value, "departInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameLessThan(String value) {
            addCriterion("departInfo.name <", value, "departInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("departInfo.name <=", value, "departInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameIn(List<String> values) {
            addCriterion("departInfo.name in", values, "departInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameNotIn(List<String> values) {
            addCriterion("departInfo.name not in", values, "departInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("departInfo.name between", value1, value2, "departInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("departInfo.name not between", value1, value2, "departInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameLike(String value) {
            addCriterion("departInfo.name like", value, "departInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameNotLike(String value) {
            addCriterion("departInfo.name not like", value, "departInfo.name");
            return (Criteria) this;
        }
        public Criteria andParentIdIsNull() {
            addCriterion("departInfo.parent_id is null");
            return (Criteria) this;
        }
        
        public Criteria andParentIdIsNotNull() {
            addCriterion("departInfo.parent_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("departInfo.parent_id =", value, "departInfo.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("departInfo.parent_id <>", value, "departInfo.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("departInfo.parent_id >", value, "departInfo.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("departInfo.parent_id >=", value, "departInfo.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("departInfo.parent_id <", value, "departInfo.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("departInfo.parent_id <=", value, "departInfo.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("departInfo.parent_id in", values, "departInfo.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("departInfo.parent_id not in", values, "departInfo.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("departInfo.parent_id between", value1, value2, "departInfo.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("departInfo.parent_id not between", value1, value2, "departInfo.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdLike(Integer value) {
            addCriterion("departInfo.parent_id like", value, "departInfo.parentId");
            return (Criteria) this;
        }
        
        public Criteria andParentIdNotLike(Integer value) {
            addCriterion("departInfo.parent_id not like", value, "departInfo.parentId");
            return (Criteria) this;
        }
        public Criteria andLevelIsNull() {
            addCriterion("departInfo.level is null");
            return (Criteria) this;
        }
        
        public Criteria andLevelIsNotNull() {
            addCriterion("departInfo.level is not null");
            return (Criteria) this;
        }
        
        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("departInfo.level =", value, "departInfo.level");
            return (Criteria) this;
        }
        
        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("departInfo.level <>", value, "departInfo.level");
            return (Criteria) this;
        }
        
        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("departInfo.level >", value, "departInfo.level");
            return (Criteria) this;
        }
        
        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("departInfo.level >=", value, "departInfo.level");
            return (Criteria) this;
        }
        
        public Criteria andLevelLessThan(Integer value) {
            addCriterion("departInfo.level <", value, "departInfo.level");
            return (Criteria) this;
        }
        
        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("departInfo.level <=", value, "departInfo.level");
            return (Criteria) this;
        }
        
        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("departInfo.level in", values, "departInfo.level");
            return (Criteria) this;
        }
        
        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("departInfo.level not in", values, "departInfo.level");
            return (Criteria) this;
        }
        
        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("departInfo.level between", value1, value2, "departInfo.level");
            return (Criteria) this;
        }
        
        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("departInfo.level not between", value1, value2, "departInfo.level");
            return (Criteria) this;
        }
        
        public Criteria andLevelLike(Integer value) {
            addCriterion("departInfo.level like", value, "departInfo.level");
            return (Criteria) this;
        }
        
        public Criteria andLevelNotLike(Integer value) {
            addCriterion("departInfo.level not like", value, "departInfo.level");
            return (Criteria) this;
        }
        public Criteria andLocIdIsNull() {
            addCriterion("departInfo.loc_id is null");
            return (Criteria) this;
        }
        
        public Criteria andLocIdIsNotNull() {
            addCriterion("departInfo.loc_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andLocIdEqualTo(Integer value) {
            addCriterion("departInfo.loc_id =", value, "departInfo.loc_id");
            return (Criteria) this;
        }
        
        public Criteria andLocIdNotEqualTo(Integer value) {
            addCriterion("departInfo.loc_id <>", value, "departInfo.loc_id");
            return (Criteria) this;
        }
        
        public Criteria andLocIdGreaterThan(Integer value) {
            addCriterion("departInfo.loc_id >", value, "departInfo.loc_id");
            return (Criteria) this;
        }
        
        public Criteria andLocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("departInfo.loc_id >=", value, "departInfo.loc_id");
            return (Criteria) this;
        }
        
        public Criteria andLocIdLessThan(Integer value) {
            addCriterion("departInfo.loc_id <", value, "departInfo.loc_id");
            return (Criteria) this;
        }
        
        public Criteria andLocIdLessThanOrEqualTo(Integer value) {
            addCriterion("departInfo.loc_id <=", value, "departInfo.loc_id");
            return (Criteria) this;
        }
        
        public Criteria andLocIdIn(List<Integer> values) {
            addCriterion("departInfo.loc_id in", values, "departInfo.loc_id");
            return (Criteria) this;
        }
        
        public Criteria andLocIdNotIn(List<Integer> values) {
            addCriterion("departInfo.loc_id not in", values, "departInfo.loc_id");
            return (Criteria) this;
        }
        
        public Criteria andLocIdBetween(Integer value1, Integer value2) {
            addCriterion("departInfo.loc_id between", value1, value2, "departInfo.loc_id");
            return (Criteria) this;
        }
        
        public Criteria andLocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("departInfo.loc_id not between", value1, value2, "departInfo.loc_id");
            return (Criteria) this;
        }
        
        public Criteria andLocIdLike(Integer value) {
            addCriterion("departInfo.loc_id like", value, "departInfo.locId");
            return (Criteria) this;
        }
        
        public Criteria andLocIdNotLike(Integer value) {
            addCriterion("departInfo.loc_id not like", value, "departInfo.locId");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNull() {
            addCriterion("departInfo.create_time is null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("departInfo.create_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("departInfo.create_time =", value, "departInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("departInfo.create_time <>", value, "departInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("departInfo.create_time >", value, "departInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("departInfo.create_time >=", value, "departInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("departInfo.create_time <", value, "departInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("departInfo.create_time <=", value, "departInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("departInfo.create_time in", values, "departInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("departInfo.create_time not in", values, "departInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("departInfo.create_time between", value1, value2, "departInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("departInfo.create_time not between", value1, value2, "departInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLike(Date value) {
            addCriterion("departInfo.create_time like", value, "departInfo.createTime");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotLike(Date value) {
            addCriterion("departInfo.create_time not like", value, "departInfo.createTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNull() {
            addCriterion("departInfo.update_time is null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("departInfo.update_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("departInfo.update_time =", value, "departInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("departInfo.update_time <>", value, "departInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("departInfo.update_time >", value, "departInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("departInfo.update_time >=", value, "departInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("departInfo.update_time <", value, "departInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("departInfo.update_time <=", value, "departInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("departInfo.update_time in", values, "departInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("departInfo.update_time not in", values, "departInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("departInfo.update_time between", value1, value2, "departInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("departInfo.update_time not between", value1, value2, "departInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLike(Date value) {
            addCriterion("departInfo.update_time like", value, "departInfo.updateTime");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotLike(Date value) {
            addCriterion("departInfo.update_time not like", value, "departInfo.updateTime");
            return (Criteria) this;
        }
        public Criteria andDeleteflagIsNull() {
            addCriterion("departInfo.deleteflag is null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIsNotNull() {
            addCriterion("departInfo.deleteflag is not null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagEqualTo(String value) {
            addCriterion("departInfo.deleteflag =", value, "departInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotEqualTo(String value) {
            addCriterion("departInfo.deleteflag <>", value, "departInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThan(String value) {
            addCriterion("departInfo.deleteflag >", value, "departInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThanOrEqualTo(String value) {
            addCriterion("departInfo.deleteflag >=", value, "departInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThan(String value) {
            addCriterion("departInfo.deleteflag <", value, "departInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThanOrEqualTo(String value) {
            addCriterion("departInfo.deleteflag <=", value, "departInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIn(List<String> values) {
            addCriterion("departInfo.deleteflag in", values, "departInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotIn(List<String> values) {
            addCriterion("departInfo.deleteflag not in", values, "departInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagBetween(String value1, String value2) {
            addCriterion("departInfo.deleteflag between", value1, value2, "departInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotBetween(String value1, String value2) {
            addCriterion("departInfo.deleteflag not between", value1, value2, "departInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLike(String value) {
            addCriterion("departInfo.deleteflag like", value, "departInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotLike(String value) {
            addCriterion("departInfo.deleteflag not like", value, "departInfo.deleteflag");
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
    
    public DepartInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
    
    public DepartInfoExample(String deleteflag) {
    	Criteria criteria = new Criteria();
    	criteria.andDeleteflagEqualTo(deleteflag);
    	oredCriteria = new ArrayList<Criteria>();
    	oredCriteria.add(criteria);
    }
}