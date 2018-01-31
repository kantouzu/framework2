package com.cisdi.business.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cisdi.base.example.BaseExample;
import com.cisdi.base.util.BaseUtil;
import com.cisdi.business.example.UserInfoExample.Criterion;

public class MenuExample extends BaseExample {


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
        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }
        
        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }
        
        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menu_name");
            return (Criteria) this;
        }
        
        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menu_name");
            return (Criteria) this;
        }
        
        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menu_name");
            return (Criteria) this;
        }
        
        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menu_name");
            return (Criteria) this;
        }
        
        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menu_name");
            return (Criteria) this;
        }
        
        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menu_name");
            return (Criteria) this;
        }
        
        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menu_name");
            return (Criteria) this;
        }
        
        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menu_name");
            return (Criteria) this;
        }
        
        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menu_name");
            return (Criteria) this;
        }
        
        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menu_name");
            return (Criteria) this;
        }
        
        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }
        
        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }
        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }
        
        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }
        
        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }
        
        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }
        
        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }
        
        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }
        
        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }
        
        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }
        
        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }
        
        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }
        
        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }
        
        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }
        
        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }
        
        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }
        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }
        
        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parent_id");
            return (Criteria) this;
        }
        
        public Criteria andParentIdLike(Integer value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }
        
        public Criteria andParentIdNotLike(Integer value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }
        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }
        
        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }
        
        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("order_num =", value, "order_num");
            return (Criteria) this;
        }
        
        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "order_num");
            return (Criteria) this;
        }
        
        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("order_num >", value, "order_num");
            return (Criteria) this;
        }
        
        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "order_num");
            return (Criteria) this;
        }
        
        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("order_num <", value, "order_num");
            return (Criteria) this;
        }
        
        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "order_num");
            return (Criteria) this;
        }
        
        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("order_num in", values, "order_num");
            return (Criteria) this;
        }
        
        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("order_num not in", values, "order_num");
            return (Criteria) this;
        }
        
        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "order_num");
            return (Criteria) this;
        }
        
        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "order_num");
            return (Criteria) this;
        }
        
        public Criteria andOrderNumLike(Integer value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }
        
        public Criteria andOrderNumNotLike(Integer value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }
        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }
        
        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }
        
        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }
        
        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }
        
        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }
        
        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }
        
        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }
        
        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }
        
        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }
        
        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }
        
        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }
        
        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }
        
        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }
        
        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }
        public Criteria andIsIgnorePreIsNull() {
            addCriterion("is_ignore_pre is null");
            return (Criteria) this;
        }
        
        public Criteria andIsIgnorePreIsNotNull() {
            addCriterion("is_ignore_pre is not null");
            return (Criteria) this;
        }
        
        public Criteria andIsIgnorePreEqualTo(String value) {
            addCriterion("is_ignore_pre =", value, "is_ignore_pre");
            return (Criteria) this;
        }
        
        public Criteria andIsIgnorePreNotEqualTo(String value) {
            addCriterion("is_ignore_pre <>", value, "is_ignore_pre");
            return (Criteria) this;
        }
        
        public Criteria andIsIgnorePreGreaterThan(String value) {
            addCriterion("is_ignore_pre >", value, "is_ignore_pre");
            return (Criteria) this;
        }
        
        public Criteria andIsIgnorePreGreaterThanOrEqualTo(String value) {
            addCriterion("is_ignore_pre >=", value, "is_ignore_pre");
            return (Criteria) this;
        }
        
        public Criteria andIsIgnorePreLessThan(String value) {
            addCriterion("is_ignore_pre <", value, "is_ignore_pre");
            return (Criteria) this;
        }
        
        public Criteria andIsIgnorePreLessThanOrEqualTo(String value) {
            addCriterion("is_ignore_pre <=", value, "is_ignore_pre");
            return (Criteria) this;
        }
        
        public Criteria andIsIgnorePreIn(List<String> values) {
            addCriterion("is_ignore_pre in", values, "is_ignore_pre");
            return (Criteria) this;
        }
        
        public Criteria andIsIgnorePreNotIn(List<String> values) {
            addCriterion("is_ignore_pre not in", values, "is_ignore_pre");
            return (Criteria) this;
        }
        
        public Criteria andIsIgnorePreBetween(String value1, String value2) {
            addCriterion("is_ignore_pre between", value1, value2, "is_ignore_pre");
            return (Criteria) this;
        }
        
        public Criteria andIsIgnorePreNotBetween(String value1, String value2) {
            addCriterion("is_ignore_pre not between", value1, value2, "is_ignore_pre");
            return (Criteria) this;
        }
        
        public Criteria andIsIgnorePreLike(String value) {
            addCriterion("is_ignore_pre like", value, "isIgnorePre");
            return (Criteria) this;
        }
        
        public Criteria andIsIgnorePreNotLike(String value) {
            addCriterion("is_ignore_pre not like", value, "isIgnorePre");
            return (Criteria) this;
        }
        public Criteria andPreHandleUrlIsNull() {
            addCriterion("pre_handle_url is null");
            return (Criteria) this;
        }
        
        public Criteria andPreHandleUrlIsNotNull() {
            addCriterion("pre_handle_url is not null");
            return (Criteria) this;
        }
        
        public Criteria andPreHandleUrlEqualTo(String value) {
            addCriterion("pre_handle_url =", value, "pre_handle_url");
            return (Criteria) this;
        }
        
        public Criteria andPreHandleUrlNotEqualTo(String value) {
            addCriterion("pre_handle_url <>", value, "pre_handle_url");
            return (Criteria) this;
        }
        
        public Criteria andPreHandleUrlGreaterThan(String value) {
            addCriterion("pre_handle_url >", value, "pre_handle_url");
            return (Criteria) this;
        }
        
        public Criteria andPreHandleUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pre_handle_url >=", value, "pre_handle_url");
            return (Criteria) this;
        }
        
        public Criteria andPreHandleUrlLessThan(String value) {
            addCriterion("pre_handle_url <", value, "pre_handle_url");
            return (Criteria) this;
        }
        
        public Criteria andPreHandleUrlLessThanOrEqualTo(String value) {
            addCriterion("pre_handle_url <=", value, "pre_handle_url");
            return (Criteria) this;
        }
        
        public Criteria andPreHandleUrlIn(List<String> values) {
            addCriterion("pre_handle_url in", values, "pre_handle_url");
            return (Criteria) this;
        }
        
        public Criteria andPreHandleUrlNotIn(List<String> values) {
            addCriterion("pre_handle_url not in", values, "pre_handle_url");
            return (Criteria) this;
        }
        
        public Criteria andPreHandleUrlBetween(String value1, String value2) {
            addCriterion("pre_handle_url between", value1, value2, "pre_handle_url");
            return (Criteria) this;
        }
        
        public Criteria andPreHandleUrlNotBetween(String value1, String value2) {
            addCriterion("pre_handle_url not between", value1, value2, "pre_handle_url");
            return (Criteria) this;
        }
        
        public Criteria andPreHandleUrlLike(String value) {
            addCriterion("pre_handle_url like", value, "preHandleUrl");
            return (Criteria) this;
        }
        
        public Criteria andPreHandleUrlNotLike(String value) {
            addCriterion("pre_handle_url not like", value, "preHandleUrl");
            return (Criteria) this;
        }
        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }
        
        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }
        
        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
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
        public Criteria andIsRootIsNull() {
        	addCriterion("is_root is null");
        	return (Criteria) this;
        }
        
        public Criteria andIsRootIsNotNull() {
        	addCriterion("is_root is not null");
        	return (Criteria) this;
        }
        
        public Criteria andIsRootEqualTo(String value) {
        	addCriterion("is_root =", value, "is_root");
        	return (Criteria) this;
        }
        
        public Criteria andIsRootNotEqualTo(String value) {
        	addCriterion("is_root <>", value, "is_root");
        	return (Criteria) this;
        }
        
        public Criteria andIsRootGreaterThan(String value) {
        	addCriterion("is_root >", value, "is_root");
        	return (Criteria) this;
        }
        
        public Criteria andIsRootGreaterThanOrEqualTo(String value) {
        	addCriterion("is_root >=", value, "is_root");
        	return (Criteria) this;
        }
        
        public Criteria andIsRootLessThan(String value) {
        	addCriterion("is_root <", value, "is_root");
        	return (Criteria) this;
        }
        
        public Criteria andIsRootLessThanOrEqualTo(String value) {
        	addCriterion("is_root <=", value, "is_root");
        	return (Criteria) this;
        }
        
        public Criteria andIsRootIn(List<String> values) {
        	addCriterion("is_root in", values, "is_root");
        	return (Criteria) this;
        }
        
        public Criteria andIsRootNotIn(List<String> values) {
        	addCriterion("is_root not in", values, "is_root");
        	return (Criteria) this;
        }
        
        public Criteria andIsRootBetween(String value1, String value2) {
        	addCriterion("is_root between", value1, value2, "is_root");
        	return (Criteria) this;
        }
        
        public Criteria andIsRootNotBetween(String value1, String value2) {
        	addCriterion("is_root not between", value1, value2, "is_root");
        	return (Criteria) this;
        }
        
        public Criteria andIsRootLike(String value) {
        	addCriterion("is_root like", value, "is_root");
        	return (Criteria) this;
        }
        
        public Criteria andIsRootNotLike(String value) {
        	addCriterion("is_root not like", value, "is_root");
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
    
    public MenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
    
    public MenuExample(String deleteflag) {
    	Criteria criteria = new Criteria();
    	criteria.andDeleteflagEqualTo(deleteflag);
    	oredCriteria = new ArrayList<Criteria>();
    	oredCriteria.add(criteria);
    }
}