package com.cisdi.business.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cisdi.base.example.BaseExample;
import com.cisdi.base.util.BaseUtil;

public class UserInfoExample extends BaseExample {


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
            addCriterion("userInfo.id is null");
            return (Criteria) this;
        }
        
        public Criteria andIdIsNotNull() {
            addCriterion("userInfo.id is not null");
            return (Criteria) this;
        }
        
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("userInfo.id =", value, "userInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("userInfo.id <>", value, "userInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("userInfo.id >", value, "userInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userInfo.id >=", value, "userInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThan(Integer value) {
            addCriterion("userInfo.id <", value, "userInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("userInfo.id <=", value, "userInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("userInfo.id in", values, "userInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("userInfo.id not in", values, "userInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("userInfo.id between", value1, value2, "userInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userInfo.id not between", value1, value2, "userInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLike(Integer value) {
            addCriterion("userInfo.id like", value, "userInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotLike(Integer value) {
            addCriterion("userInfo.id not like", value, "userInfo.id");
            return (Criteria) this;
        }
        public Criteria andUserNameIsNull() {
            addCriterion("userInfo.user_name is null");
            return (Criteria) this;
        }
        
        public Criteria andUserNameIsNotNull() {
            addCriterion("userInfo.user_name is not null");
            return (Criteria) this;
        }
        
        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userInfo.user_name =", value, "userInfo.user_name");
            return (Criteria) this;
        }
        
        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userInfo.user_name <>", value, "userInfo.user_name");
            return (Criteria) this;
        }
        
        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userInfo.user_name >", value, "userInfo.user_name");
            return (Criteria) this;
        }
        
        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userInfo.user_name >=", value, "userInfo.user_name");
            return (Criteria) this;
        }
        
        public Criteria andUserNameLessThan(String value) {
            addCriterion("userInfo.user_name <", value, "userInfo.user_name");
            return (Criteria) this;
        }
        
        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userInfo.user_name <=", value, "userInfo.user_name");
            return (Criteria) this;
        }
        
        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userInfo.user_name in", values, "userInfo.user_name");
            return (Criteria) this;
        }
        
        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userInfo.user_name not in", values, "userInfo.user_name");
            return (Criteria) this;
        }
        
        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userInfo.user_name between", value1, value2, "userInfo.user_name");
            return (Criteria) this;
        }
        
        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userInfo.user_name not between", value1, value2, "userInfo.user_name");
            return (Criteria) this;
        }
        
        public Criteria andUserNameLike(String value) {
            addCriterion("userInfo.user_name like", value, "userInfo.userName");
            return (Criteria) this;
        }
        
        public Criteria andUserNameNotLike(String value) {
            addCriterion("userInfo.user_name not like", value, "userInfo.userName");
            return (Criteria) this;
        }
        public Criteria andPwdIsNull() {
            addCriterion("userInfo.pwd is null");
            return (Criteria) this;
        }
        
        public Criteria andPwdIsNotNull() {
            addCriterion("userInfo.pwd is not null");
            return (Criteria) this;
        }
        
        public Criteria andPwdEqualTo(String value) {
            addCriterion("userInfo.pwd =", value, "userInfo.pwd");
            return (Criteria) this;
        }
        
        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("userInfo.pwd <>", value, "userInfo.pwd");
            return (Criteria) this;
        }
        
        public Criteria andPwdGreaterThan(String value) {
            addCriterion("userInfo.pwd >", value, "userInfo.pwd");
            return (Criteria) this;
        }
        
        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("userInfo.pwd >=", value, "userInfo.pwd");
            return (Criteria) this;
        }
        
        public Criteria andPwdLessThan(String value) {
            addCriterion("userInfo.pwd <", value, "userInfo.pwd");
            return (Criteria) this;
        }
        
        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("userInfo.pwd <=", value, "userInfo.pwd");
            return (Criteria) this;
        }
        
        public Criteria andPwdIn(List<String> values) {
            addCriterion("userInfo.pwd in", values, "userInfo.pwd");
            return (Criteria) this;
        }
        
        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("userInfo.pwd not in", values, "userInfo.pwd");
            return (Criteria) this;
        }
        
        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("userInfo.pwd between", value1, value2, "userInfo.pwd");
            return (Criteria) this;
        }
        
        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("userInfo.pwd not between", value1, value2, "userInfo.pwd");
            return (Criteria) this;
        }
        
        public Criteria andPwdLike(String value) {
            addCriterion("userInfo.pwd like", value, "userInfo.pwd");
            return (Criteria) this;
        }
        
        public Criteria andPwdNotLike(String value) {
            addCriterion("userInfo.pwd not like", value, "userInfo.pwd");
            return (Criteria) this;
        }
        public Criteria andNameIsNull() {
            addCriterion("userInfo.name is null");
            return (Criteria) this;
        }
        
        public Criteria andNameIsNotNull() {
            addCriterion("userInfo.name is not null");
            return (Criteria) this;
        }
        
        public Criteria andNameEqualTo(String value) {
            addCriterion("userInfo.name =", value, "userInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameNotEqualTo(String value) {
            addCriterion("userInfo.name <>", value, "userInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameGreaterThan(String value) {
            addCriterion("userInfo.name >", value, "userInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("userInfo.name >=", value, "userInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameLessThan(String value) {
            addCriterion("userInfo.name <", value, "userInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("userInfo.name <=", value, "userInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameIn(List<String> values) {
            addCriterion("userInfo.name in", values, "userInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameNotIn(List<String> values) {
            addCriterion("userInfo.name not in", values, "userInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("userInfo.name between", value1, value2, "userInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("userInfo.name not between", value1, value2, "userInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameLike(String value) {
            addCriterion("userInfo.name like", value, "userInfo.name");
            return (Criteria) this;
        }
        
        public Criteria andNameNotLike(String value) {
            addCriterion("userInfo.name not like", value, "userInfo.name");
            return (Criteria) this;
        }
        public Criteria andDepartnoIsNull() {
            addCriterion("userInfo.departNo is null");
            return (Criteria) this;
        }
        
        public Criteria andDepartnoIsNotNull() {
            addCriterion("userInfo.departNo is not null");
            return (Criteria) this;
        }
        
        public Criteria andDepartnoEqualTo(String value) {
            addCriterion("userInfo.departNo =", value, "userInfo.departNo");
            return (Criteria) this;
        }
        
        public Criteria andDepartnoNotEqualTo(String value) {
            addCriterion("userInfo.departNo <>", value, "userInfo.departNo");
            return (Criteria) this;
        }
        
        public Criteria andDepartnoGreaterThan(String value) {
            addCriterion("userInfo.departNo >", value, "userInfo.departNo");
            return (Criteria) this;
        }
        
        public Criteria andDepartnoGreaterThanOrEqualTo(String value) {
            addCriterion("userInfo.departNo >=", value, "userInfo.departNo");
            return (Criteria) this;
        }
        
        public Criteria andDepartnoLessThan(String value) {
            addCriterion("userInfo.departNo <", value, "userInfo.departNo");
            return (Criteria) this;
        }
        
        public Criteria andDepartnoLessThanOrEqualTo(String value) {
            addCriterion("userInfo.departNo <=", value, "userInfo.departNo");
            return (Criteria) this;
        }
        
        public Criteria andDepartnoIn(List<String> values) {
            addCriterion("userInfo.departNo in", values, "userInfo.departNo");
            return (Criteria) this;
        }
        
        public Criteria andDepartnoNotIn(List<String> values) {
            addCriterion("userInfo.departNo not in", values, "userInfo.departNo");
            return (Criteria) this;
        }
        
        public Criteria andDepartnoBetween(String value1, String value2) {
            addCriterion("userInfo.departNo between", value1, value2, "userInfo.departNo");
            return (Criteria) this;
        }
        
        public Criteria andDepartnoNotBetween(String value1, String value2) {
            addCriterion("userInfo.departNo not between", value1, value2, "userInfo.departNo");
            return (Criteria) this;
        }
        
        public Criteria andDepartnoLike(String value) {
            addCriterion("userInfo.departNo like", value, "userInfo.departno");
            return (Criteria) this;
        }
        
        public Criteria andDepartnoNotLike(String value) {
            addCriterion("userInfo.departNo not like", value, "userInfo.departno");
            return (Criteria) this;
        }
        public Criteria andUsableIsNull() {
            addCriterion("userInfo.usable is null");
            return (Criteria) this;
        }
        
        public Criteria andUsableIsNotNull() {
            addCriterion("userInfo.usable is not null");
            return (Criteria) this;
        }
        
        public Criteria andUsableEqualTo(String value) {
            addCriterion("userInfo.usable =", value, "userInfo.usable");
            return (Criteria) this;
        }
        
        public Criteria andUsableNotEqualTo(String value) {
            addCriterion("userInfo.usable <>", value, "userInfo.usable");
            return (Criteria) this;
        }
        
        public Criteria andUsableGreaterThan(String value) {
            addCriterion("userInfo.usable >", value, "userInfo.usable");
            return (Criteria) this;
        }
        
        public Criteria andUsableGreaterThanOrEqualTo(String value) {
            addCriterion("userInfo.usable >=", value, "userInfo.usable");
            return (Criteria) this;
        }
        
        public Criteria andUsableLessThan(String value) {
            addCriterion("userInfo.usable <", value, "userInfo.usable");
            return (Criteria) this;
        }
        
        public Criteria andUsableLessThanOrEqualTo(String value) {
            addCriterion("userInfo.usable <=", value, "userInfo.usable");
            return (Criteria) this;
        }
        
        public Criteria andUsableIn(List<String> values) {
            addCriterion("userInfo.usable in", values, "userInfo.usable");
            return (Criteria) this;
        }
        
        public Criteria andUsableNotIn(List<String> values) {
            addCriterion("userInfo.usable not in", values, "userInfo.usable");
            return (Criteria) this;
        }
        
        public Criteria andUsableBetween(String value1, String value2) {
            addCriterion("userInfo.usable between", value1, value2, "userInfo.usable");
            return (Criteria) this;
        }
        
        public Criteria andUsableNotBetween(String value1, String value2) {
            addCriterion("userInfo.usable not between", value1, value2, "userInfo.usable");
            return (Criteria) this;
        }
        
        public Criteria andUsableLike(String value) {
            addCriterion("userInfo.usable like", value, "userInfo.usable");
            return (Criteria) this;
        }
        
        public Criteria andUsableNotLike(String value) {
            addCriterion("userInfo.usable not like", value, "userInfo.usable");
            return (Criteria) this;
        }
        public Criteria andPhoneIsNull() {
            addCriterion("userInfo.phone is null");
            return (Criteria) this;
        }
        
        public Criteria andPhoneIsNotNull() {
            addCriterion("userInfo.phone is not null");
            return (Criteria) this;
        }
        
        public Criteria andPhoneEqualTo(String value) {
            addCriterion("userInfo.phone =", value, "userInfo.phone");
            return (Criteria) this;
        }
        
        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("userInfo.phone <>", value, "userInfo.phone");
            return (Criteria) this;
        }
        
        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("userInfo.phone >", value, "userInfo.phone");
            return (Criteria) this;
        }
        
        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("userInfo.phone >=", value, "userInfo.phone");
            return (Criteria) this;
        }
        
        public Criteria andPhoneLessThan(String value) {
            addCriterion("userInfo.phone <", value, "userInfo.phone");
            return (Criteria) this;
        }
        
        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("userInfo.phone <=", value, "userInfo.phone");
            return (Criteria) this;
        }
        
        public Criteria andPhoneIn(List<String> values) {
            addCriterion("userInfo.phone in", values, "userInfo.phone");
            return (Criteria) this;
        }
        
        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("userInfo.phone not in", values, "userInfo.phone");
            return (Criteria) this;
        }
        
        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("userInfo.phone between", value1, value2, "userInfo.phone");
            return (Criteria) this;
        }
        
        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("userInfo.phone not between", value1, value2, "userInfo.phone");
            return (Criteria) this;
        }
        
        public Criteria andPhoneLike(String value) {
            addCriterion("userInfo.phone like", value, "userInfo.phone");
            return (Criteria) this;
        }
        
        public Criteria andPhoneNotLike(String value) {
            addCriterion("userInfo.phone not like", value, "userInfo.phone");
            return (Criteria) this;
        }
        public Criteria andEmailIsNull() {
            addCriterion("userInfo.email is null");
            return (Criteria) this;
        }
        
        public Criteria andEmailIsNotNull() {
            addCriterion("userInfo.email is not null");
            return (Criteria) this;
        }
        
        public Criteria andEmailEqualTo(String value) {
            addCriterion("userInfo.email =", value, "userInfo.email");
            return (Criteria) this;
        }
        
        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("userInfo.email <>", value, "userInfo.email");
            return (Criteria) this;
        }
        
        public Criteria andEmailGreaterThan(String value) {
            addCriterion("userInfo.email >", value, "userInfo.email");
            return (Criteria) this;
        }
        
        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("userInfo.email >=", value, "userInfo.email");
            return (Criteria) this;
        }
        
        public Criteria andEmailLessThan(String value) {
            addCriterion("userInfo.email <", value, "userInfo.email");
            return (Criteria) this;
        }
        
        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("userInfo.email <=", value, "userInfo.email");
            return (Criteria) this;
        }
        
        public Criteria andEmailIn(List<String> values) {
            addCriterion("userInfo.email in", values, "userInfo.email");
            return (Criteria) this;
        }
        
        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("userInfo.email not in", values, "userInfo.email");
            return (Criteria) this;
        }
        
        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("userInfo.email between", value1, value2, "userInfo.email");
            return (Criteria) this;
        }
        
        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("userInfo.email not between", value1, value2, "userInfo.email");
            return (Criteria) this;
        }
        
        public Criteria andEmailLike(String value) {
            addCriterion("userInfo.email like", value, "userInfo.email");
            return (Criteria) this;
        }
        
        public Criteria andEmailNotLike(String value) {
            addCriterion("userInfo.email not like", value, "userInfo.email");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNull() {
            addCriterion("userInfo.create_time is null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("userInfo.create_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("userInfo.create_time =", value, "userInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("userInfo.create_time <>", value, "userInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("userInfo.create_time >", value, "userInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userInfo.create_time >=", value, "userInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("userInfo.create_time <", value, "userInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("userInfo.create_time <=", value, "userInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("userInfo.create_time in", values, "userInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("userInfo.create_time not in", values, "userInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("userInfo.create_time between", value1, value2, "userInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("userInfo.create_time not between", value1, value2, "userInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLike(Date value) {
            addCriterion("userInfo.create_time like", value, "userInfo.createTime");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotLike(Date value) {
            addCriterion("userInfo.create_time not like", value, "userInfo.createTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNull() {
            addCriterion("userInfo.update_time is null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("userInfo.update_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("userInfo.update_time =", value, "userInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("userInfo.update_time <>", value, "userInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("userInfo.update_time >", value, "userInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userInfo.update_time >=", value, "userInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("userInfo.update_time <", value, "userInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("userInfo.update_time <=", value, "userInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("userInfo.update_time in", values, "userInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("userInfo.update_time not in", values, "userInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("userInfo.update_time between", value1, value2, "userInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("userInfo.update_time not between", value1, value2, "userInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLike(Date value) {
            addCriterion("userInfo.update_time like", value, "userInfo.updateTime");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotLike(Date value) {
            addCriterion("userInfo.update_time not like", value, "userInfo.updateTime");
            return (Criteria) this;
        }
        public Criteria andDeleteflagIsNull() {
            addCriterion("userInfo.deleteflag is null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIsNotNull() {
            addCriterion("userInfo.deleteflag is not null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagEqualTo(String value) {
            addCriterion("userInfo.deleteflag =", value, "userInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotEqualTo(String value) {
            addCriterion("userInfo.deleteflag <>", value, "userInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThan(String value) {
            addCriterion("userInfo.deleteflag >", value, "userInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThanOrEqualTo(String value) {
            addCriterion("userInfo.deleteflag >=", value, "userInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThan(String value) {
            addCriterion("userInfo.deleteflag <", value, "userInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThanOrEqualTo(String value) {
            addCriterion("userInfo.deleteflag <=", value, "userInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIn(List<String> values) {
            addCriterion("userInfo.deleteflag in", values, "userInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotIn(List<String> values) {
            addCriterion("userInfo.deleteflag not in", values, "userInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagBetween(String value1, String value2) {
            addCriterion("userInfo.deleteflag between", value1, value2, "userInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotBetween(String value1, String value2) {
            addCriterion("userInfo.deleteflag not between", value1, value2, "userInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLike(String value) {
            addCriterion("userInfo.deleteflag like", value, "userInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotLike(String value) {
            addCriterion("userInfo.deleteflag not like", value, "userInfo.deleteflag");
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
    
    public UserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
    
    public UserInfoExample(String deleteflag) {
    	Criteria criteria = new Criteria();
    	criteria.andDeleteflagEqualTo(deleteflag);
    	oredCriteria = new ArrayList<Criteria>();
    	oredCriteria.add(criteria);
    }
}