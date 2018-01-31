package com.cisdi.business.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cisdi.base.example.BaseExample;
import com.cisdi.base.util.BaseUtil;

public class DictionaryExample extends BaseExample {


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
            addCriterion("dictionary.id is null");
            return (Criteria) this;
        }
        
        public Criteria andIdIsNotNull() {
            addCriterion("dictionary.id is not null");
            return (Criteria) this;
        }
        
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("dictionary.id =", value, "dictionary.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("dictionary.id <>", value, "dictionary.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("dictionary.id >", value, "dictionary.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dictionary.id >=", value, "dictionary.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThan(Integer value) {
            addCriterion("dictionary.id <", value, "dictionary.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("dictionary.id <=", value, "dictionary.id");
            return (Criteria) this;
        }
        
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("dictionary.id in", values, "dictionary.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("dictionary.id not in", values, "dictionary.id");
            return (Criteria) this;
        }
        
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("dictionary.id between", value1, value2, "dictionary.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dictionary.id not between", value1, value2, "dictionary.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLike(Integer value) {
            addCriterion("dictionary.id like", value, "dictionary.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotLike(Integer value) {
            addCriterion("dictionary.id not like", value, "dictionary.id");
            return (Criteria) this;
        }
        public Criteria andParentIdIsNull() {
            addCriterion("dictionary.parent_id is null");
            return (Criteria) this;
        }
        
        public Criteria andParentIdIsNotNull() {
            addCriterion("dictionary.parent_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("dictionary.parent_id =", value, "dictionary.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("dictionary.parent_id <>", value, "dictionary.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("dictionary.parent_id >", value, "dictionary.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dictionary.parent_id >=", value, "dictionary.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("dictionary.parent_id <", value, "dictionary.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("dictionary.parent_id <=", value, "dictionary.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("dictionary.parent_id in", values, "dictionary.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("dictionary.parent_id not in", values, "dictionary.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("dictionary.parent_id between", value1, value2, "dictionary.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dictionary.parent_id not between", value1, value2, "dictionary.parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdLike(Integer value) {
            addCriterion("dictionary.parent_id like", value, "dictionary.parentId");
            return (Criteria) this;
        }
        
        public Criteria andParentIdNotLike(Integer value) {
            addCriterion("dictionary.parent_id not like", value, "dictionary.parentId");
            return (Criteria) this;
        }
        public Criteria andDicTypeIsNull() {
            addCriterion("dictionary.dic_type is null");
            return (Criteria) this;
        }
        
        public Criteria andDicTypeIsNotNull() {
            addCriterion("dictionary.dic_type is not null");
            return (Criteria) this;
        }
        
        public Criteria andDicTypeEqualTo(String value) {
            addCriterion("dictionary.dic_type =", value, "dictionary.dic_type");
            return (Criteria) this;
        }
        
        public Criteria andDicTypeNotEqualTo(String value) {
            addCriterion("dictionary.dic_type <>", value, "dictionary.dic_type");
            return (Criteria) this;
        }
        
        public Criteria andDicTypeGreaterThan(String value) {
            addCriterion("dictionary.dic_type >", value, "dictionary.dic_type");
            return (Criteria) this;
        }
        
        public Criteria andDicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary.dic_type >=", value, "dictionary.dic_type");
            return (Criteria) this;
        }
        
        public Criteria andDicTypeLessThan(String value) {
            addCriterion("dictionary.dic_type <", value, "dictionary.dic_type");
            return (Criteria) this;
        }
        
        public Criteria andDicTypeLessThanOrEqualTo(String value) {
            addCriterion("dictionary.dic_type <=", value, "dictionary.dic_type");
            return (Criteria) this;
        }
        
        public Criteria andDicTypeIn(List<String> values) {
            addCriterion("dictionary.dic_type in", values, "dictionary.dic_type");
            return (Criteria) this;
        }
        
        public Criteria andDicTypeNotIn(List<String> values) {
            addCriterion("dictionary.dic_type not in", values, "dictionary.dic_type");
            return (Criteria) this;
        }
        
        public Criteria andDicTypeBetween(String value1, String value2) {
            addCriterion("dictionary.dic_type between", value1, value2, "dictionary.dic_type");
            return (Criteria) this;
        }
        
        public Criteria andDicTypeNotBetween(String value1, String value2) {
            addCriterion("dictionary.dic_type not between", value1, value2, "dictionary.dic_type");
            return (Criteria) this;
        }
        
        public Criteria andDicTypeLike(String value) {
            addCriterion("dictionary.dic_type like", value, "dictionary.dicType");
            return (Criteria) this;
        }
        
        public Criteria andDicTypeNotLike(String value) {
            addCriterion("dictionary.dic_type not like", value, "dictionary.dicType");
            return (Criteria) this;
        }
        public Criteria andNameIsNull() {
            addCriterion("dictionary.name is null");
            return (Criteria) this;
        }
        
        public Criteria andNameIsNotNull() {
            addCriterion("dictionary.name is not null");
            return (Criteria) this;
        }
        
        public Criteria andNameEqualTo(String value) {
            addCriterion("dictionary.name =", value, "dictionary.name");
            return (Criteria) this;
        }
        
        public Criteria andNameNotEqualTo(String value) {
            addCriterion("dictionary.name <>", value, "dictionary.name");
            return (Criteria) this;
        }
        
        public Criteria andNameGreaterThan(String value) {
            addCriterion("dictionary.name >", value, "dictionary.name");
            return (Criteria) this;
        }
        
        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary.name >=", value, "dictionary.name");
            return (Criteria) this;
        }
        
        public Criteria andNameLessThan(String value) {
            addCriterion("dictionary.name <", value, "dictionary.name");
            return (Criteria) this;
        }
        
        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("dictionary.name <=", value, "dictionary.name");
            return (Criteria) this;
        }
        
        public Criteria andNameIn(List<String> values) {
            addCriterion("dictionary.name in", values, "dictionary.name");
            return (Criteria) this;
        }
        
        public Criteria andNameNotIn(List<String> values) {
            addCriterion("dictionary.name not in", values, "dictionary.name");
            return (Criteria) this;
        }
        
        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("dictionary.name between", value1, value2, "dictionary.name");
            return (Criteria) this;
        }
        
        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("dictionary.name not between", value1, value2, "dictionary.name");
            return (Criteria) this;
        }
        
        public Criteria andNameLike(String value) {
            addCriterion("dictionary.name like", value, "dictionary.name");
            return (Criteria) this;
        }
        
        public Criteria andNameNotLike(String value) {
            addCriterion("dictionary.name not like", value, "dictionary.name");
            return (Criteria) this;
        }
        public Criteria andRemarkIsNull() {
            addCriterion("dictionary.remark is null");
            return (Criteria) this;
        }
        
        public Criteria andRemarkIsNotNull() {
            addCriterion("dictionary.remark is not null");
            return (Criteria) this;
        }
        
        public Criteria andRemarkEqualTo(String value) {
            addCriterion("dictionary.remark =", value, "dictionary.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("dictionary.remark <>", value, "dictionary.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("dictionary.remark >", value, "dictionary.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary.remark >=", value, "dictionary.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkLessThan(String value) {
            addCriterion("dictionary.remark <", value, "dictionary.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("dictionary.remark <=", value, "dictionary.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkIn(List<String> values) {
            addCriterion("dictionary.remark in", values, "dictionary.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("dictionary.remark not in", values, "dictionary.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("dictionary.remark between", value1, value2, "dictionary.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("dictionary.remark not between", value1, value2, "dictionary.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkLike(String value) {
            addCriterion("dictionary.remark like", value, "dictionary.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotLike(String value) {
            addCriterion("dictionary.remark not like", value, "dictionary.remark");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNull() {
            addCriterion("dictionary.create_time is null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("dictionary.create_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("dictionary.create_time =", value, "dictionary.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("dictionary.create_time <>", value, "dictionary.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("dictionary.create_time >", value, "dictionary.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dictionary.create_time >=", value, "dictionary.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("dictionary.create_time <", value, "dictionary.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dictionary.create_time <=", value, "dictionary.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("dictionary.create_time in", values, "dictionary.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("dictionary.create_time not in", values, "dictionary.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("dictionary.create_time between", value1, value2, "dictionary.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dictionary.create_time not between", value1, value2, "dictionary.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLike(Date value) {
            addCriterion("dictionary.create_time like", value, "dictionary.createTime");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotLike(Date value) {
            addCriterion("dictionary.create_time not like", value, "dictionary.createTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNull() {
            addCriterion("dictionary.update_time is null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("dictionary.update_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("dictionary.update_time =", value, "dictionary.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("dictionary.update_time <>", value, "dictionary.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("dictionary.update_time >", value, "dictionary.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dictionary.update_time >=", value, "dictionary.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("dictionary.update_time <", value, "dictionary.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dictionary.update_time <=", value, "dictionary.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("dictionary.update_time in", values, "dictionary.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("dictionary.update_time not in", values, "dictionary.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("dictionary.update_time between", value1, value2, "dictionary.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dictionary.update_time not between", value1, value2, "dictionary.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLike(Date value) {
            addCriterion("dictionary.update_time like", value, "dictionary.updateTime");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotLike(Date value) {
            addCriterion("dictionary.update_time not like", value, "dictionary.updateTime");
            return (Criteria) this;
        }
        public Criteria andDeleteflagIsNull() {
            addCriterion("dictionary.deleteflag is null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIsNotNull() {
            addCriterion("dictionary.deleteflag is not null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagEqualTo(String value) {
            addCriterion("dictionary.deleteflag =", value, "dictionary.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotEqualTo(String value) {
            addCriterion("dictionary.deleteflag <>", value, "dictionary.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThan(String value) {
            addCriterion("dictionary.deleteflag >", value, "dictionary.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary.deleteflag >=", value, "dictionary.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThan(String value) {
            addCriterion("dictionary.deleteflag <", value, "dictionary.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThanOrEqualTo(String value) {
            addCriterion("dictionary.deleteflag <=", value, "dictionary.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIn(List<String> values) {
            addCriterion("dictionary.deleteflag in", values, "dictionary.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotIn(List<String> values) {
            addCriterion("dictionary.deleteflag not in", values, "dictionary.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagBetween(String value1, String value2) {
            addCriterion("dictionary.deleteflag between", value1, value2, "dictionary.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotBetween(String value1, String value2) {
            addCriterion("dictionary.deleteflag not between", value1, value2, "dictionary.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLike(String value) {
            addCriterion("dictionary.deleteflag like", value, "dictionary.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotLike(String value) {
            addCriterion("dictionary.deleteflag not like", value, "dictionary.deleteflag");
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
    
    public DictionaryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
    
    public DictionaryExample(String deleteflag) {
    	Criteria criteria = new Criteria();
    	criteria.andDeleteflagEqualTo(deleteflag);
    	oredCriteria = new ArrayList<Criteria>();
    	oredCriteria.add(criteria);
    }
}