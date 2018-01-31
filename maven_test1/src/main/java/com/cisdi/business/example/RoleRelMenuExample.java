package com.cisdi.business.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cisdi.base.example.BaseExample;
import com.cisdi.base.util.BaseUtil;

public class RoleRelMenuExample extends BaseExample {


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
            addCriterion("roleRelMenu.id is null");
            return (Criteria) this;
        }
        
        public Criteria andIdIsNotNull() {
            addCriterion("roleRelMenu.id is not null");
            return (Criteria) this;
        }
        
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("roleRelMenu.id =", value, "roleRelMenu.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("roleRelMenu.id <>", value, "roleRelMenu.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("roleRelMenu.id >", value, "roleRelMenu.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleRelMenu.id >=", value, "roleRelMenu.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThan(Integer value) {
            addCriterion("roleRelMenu.id <", value, "roleRelMenu.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("roleRelMenu.id <=", value, "roleRelMenu.id");
            return (Criteria) this;
        }
        
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("roleRelMenu.id in", values, "roleRelMenu.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("roleRelMenu.id not in", values, "roleRelMenu.id");
            return (Criteria) this;
        }
        
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("roleRelMenu.id between", value1, value2, "roleRelMenu.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roleRelMenu.id not between", value1, value2, "roleRelMenu.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLike(Integer value) {
            addCriterion("roleRelMenu.id like", value, "roleRelMenu.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotLike(Integer value) {
            addCriterion("roleRelMenu.id not like", value, "roleRelMenu.id");
            return (Criteria) this;
        }
        public Criteria andRoleIdIsNull() {
            addCriterion("roleRelMenu.role_id is null");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdIsNotNull() {
            addCriterion("roleRelMenu.role_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("roleRelMenu.role_id =", value, "roleRelMenu.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("roleRelMenu.role_id <>", value, "roleRelMenu.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("roleRelMenu.role_id >", value, "roleRelMenu.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleRelMenu.role_id >=", value, "roleRelMenu.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("roleRelMenu.role_id <", value, "roleRelMenu.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("roleRelMenu.role_id <=", value, "roleRelMenu.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("roleRelMenu.role_id in", values, "roleRelMenu.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("roleRelMenu.role_id not in", values, "roleRelMenu.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("roleRelMenu.role_id between", value1, value2, "roleRelMenu.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roleRelMenu.role_id not between", value1, value2, "roleRelMenu.role_id");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdLike(Integer value) {
            addCriterion("roleRelMenu.role_id like", value, "roleRelMenu.roleId");
            return (Criteria) this;
        }
        
        public Criteria andRoleIdNotLike(Integer value) {
            addCriterion("roleRelMenu.role_id not like", value, "roleRelMenu.roleId");
            return (Criteria) this;
        }
        public Criteria andMenuIdIsNull() {
            addCriterion("roleRelMenu.menu_id is null");
            return (Criteria) this;
        }
        
        public Criteria andMenuIdIsNotNull() {
            addCriterion("roleRelMenu.menu_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("roleRelMenu.menu_id =", value, "roleRelMenu.menu_id");
            return (Criteria) this;
        }
        
        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("roleRelMenu.menu_id <>", value, "roleRelMenu.menu_id");
            return (Criteria) this;
        }
        
        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("roleRelMenu.menu_id >", value, "roleRelMenu.menu_id");
            return (Criteria) this;
        }
        
        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleRelMenu.menu_id >=", value, "roleRelMenu.menu_id");
            return (Criteria) this;
        }
        
        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("roleRelMenu.menu_id <", value, "roleRelMenu.menu_id");
            return (Criteria) this;
        }
        
        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("roleRelMenu.menu_id <=", value, "roleRelMenu.menu_id");
            return (Criteria) this;
        }
        
        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("roleRelMenu.menu_id in", values, "roleRelMenu.menu_id");
            return (Criteria) this;
        }
        
        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("roleRelMenu.menu_id not in", values, "roleRelMenu.menu_id");
            return (Criteria) this;
        }
        
        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("roleRelMenu.menu_id between", value1, value2, "roleRelMenu.menu_id");
            return (Criteria) this;
        }
        
        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roleRelMenu.menu_id not between", value1, value2, "roleRelMenu.menu_id");
            return (Criteria) this;
        }
        
        public Criteria andMenuIdLike(Integer value) {
            addCriterion("roleRelMenu.menu_id like", value, "roleRelMenu.menuId");
            return (Criteria) this;
        }
        
        public Criteria andMenuIdNotLike(Integer value) {
            addCriterion("roleRelMenu.menu_id not like", value, "roleRelMenu.menuId");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNull() {
            addCriterion("roleRelMenu.create_time is null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("roleRelMenu.create_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("roleRelMenu.create_time =", value, "roleRelMenu.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("roleRelMenu.create_time <>", value, "roleRelMenu.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("roleRelMenu.create_time >", value, "roleRelMenu.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("roleRelMenu.create_time >=", value, "roleRelMenu.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("roleRelMenu.create_time <", value, "roleRelMenu.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("roleRelMenu.create_time <=", value, "roleRelMenu.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("roleRelMenu.create_time in", values, "roleRelMenu.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("roleRelMenu.create_time not in", values, "roleRelMenu.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("roleRelMenu.create_time between", value1, value2, "roleRelMenu.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("roleRelMenu.create_time not between", value1, value2, "roleRelMenu.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLike(Date value) {
            addCriterion("roleRelMenu.create_time like", value, "roleRelMenu.createTime");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotLike(Date value) {
            addCriterion("roleRelMenu.create_time not like", value, "roleRelMenu.createTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNull() {
            addCriterion("roleRelMenu.update_time is null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("roleRelMenu.update_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("roleRelMenu.update_time =", value, "roleRelMenu.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("roleRelMenu.update_time <>", value, "roleRelMenu.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("roleRelMenu.update_time >", value, "roleRelMenu.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("roleRelMenu.update_time >=", value, "roleRelMenu.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("roleRelMenu.update_time <", value, "roleRelMenu.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("roleRelMenu.update_time <=", value, "roleRelMenu.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("roleRelMenu.update_time in", values, "roleRelMenu.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("roleRelMenu.update_time not in", values, "roleRelMenu.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("roleRelMenu.update_time between", value1, value2, "roleRelMenu.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("roleRelMenu.update_time not between", value1, value2, "roleRelMenu.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLike(Date value) {
            addCriterion("roleRelMenu.update_time like", value, "roleRelMenu.updateTime");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotLike(Date value) {
            addCriterion("roleRelMenu.update_time not like", value, "roleRelMenu.updateTime");
            return (Criteria) this;
        }
        public Criteria andDeleteflagIsNull() {
            addCriterion("roleRelMenu.deleteflag is null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIsNotNull() {
            addCriterion("roleRelMenu.deleteflag is not null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagEqualTo(String value) {
            addCriterion("roleRelMenu.deleteflag =", value, "roleRelMenu.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotEqualTo(String value) {
            addCriterion("roleRelMenu.deleteflag <>", value, "roleRelMenu.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThan(String value) {
            addCriterion("roleRelMenu.deleteflag >", value, "roleRelMenu.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThanOrEqualTo(String value) {
            addCriterion("roleRelMenu.deleteflag >=", value, "roleRelMenu.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThan(String value) {
            addCriterion("roleRelMenu.deleteflag <", value, "roleRelMenu.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThanOrEqualTo(String value) {
            addCriterion("roleRelMenu.deleteflag <=", value, "roleRelMenu.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIn(List<String> values) {
            addCriterion("roleRelMenu.deleteflag in", values, "roleRelMenu.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotIn(List<String> values) {
            addCriterion("roleRelMenu.deleteflag not in", values, "roleRelMenu.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagBetween(String value1, String value2) {
            addCriterion("roleRelMenu.deleteflag between", value1, value2, "roleRelMenu.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotBetween(String value1, String value2) {
            addCriterion("roleRelMenu.deleteflag not between", value1, value2, "roleRelMenu.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLike(String value) {
            addCriterion("roleRelMenu.deleteflag like", value, "roleRelMenu.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotLike(String value) {
            addCriterion("roleRelMenu.deleteflag not like", value, "roleRelMenu.deleteflag");
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
    
    public RoleRelMenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
    
    public RoleRelMenuExample(String deleteflag) {
    	Criteria criteria = new Criteria();
    	criteria.andDeleteflagEqualTo(deleteflag);
    	oredCriteria = new ArrayList<Criteria>();
    	oredCriteria.add(criteria);
    }
}