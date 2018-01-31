package com.cisdi.business.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cisdi.base.example.BaseExample;
import com.cisdi.base.util.BaseUtil;

public class LogInfoExample extends BaseExample {


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
            addCriterion("logInfo.id is null");
            return (Criteria) this;
        }
        
        public Criteria andIdIsNotNull() {
            addCriterion("logInfo.id is not null");
            return (Criteria) this;
        }
        
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("logInfo.id =", value, "logInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("logInfo.id <>", value, "logInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("logInfo.id >", value, "logInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logInfo.id >=", value, "logInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThan(Integer value) {
            addCriterion("logInfo.id <", value, "logInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("logInfo.id <=", value, "logInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("logInfo.id in", values, "logInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("logInfo.id not in", values, "logInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("logInfo.id between", value1, value2, "logInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logInfo.id not between", value1, value2, "logInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdLike(Integer value) {
            addCriterion("logInfo.id like", value, "logInfo.id");
            return (Criteria) this;
        }
        
        public Criteria andIdNotLike(Integer value) {
            addCriterion("logInfo.id not like", value, "logInfo.id");
            return (Criteria) this;
        }
        public Criteria andUserIdIsNull() {
            addCriterion("logInfo.user_id is null");
            return (Criteria) this;
        }
        
        public Criteria andUserIdIsNotNull() {
            addCriterion("logInfo.user_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("logInfo.user_id =", value, "logInfo.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("logInfo.user_id <>", value, "logInfo.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("logInfo.user_id >", value, "logInfo.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logInfo.user_id >=", value, "logInfo.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("logInfo.user_id <", value, "logInfo.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("logInfo.user_id <=", value, "logInfo.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("logInfo.user_id in", values, "logInfo.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("logInfo.user_id not in", values, "logInfo.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("logInfo.user_id between", value1, value2, "logInfo.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logInfo.user_id not between", value1, value2, "logInfo.user_id");
            return (Criteria) this;
        }
        
        public Criteria andUserIdLike(Integer value) {
            addCriterion("logInfo.user_id like", value, "logInfo.userId");
            return (Criteria) this;
        }
        
        public Criteria andUserIdNotLike(Integer value) {
            addCriterion("logInfo.user_id not like", value, "logInfo.userId");
            return (Criteria) this;
        }
        public Criteria andIpAddressIsNull() {
            addCriterion("logInfo.ip_address is null");
            return (Criteria) this;
        }
        
        public Criteria andIpAddressIsNotNull() {
            addCriterion("logInfo.ip_address is not null");
            return (Criteria) this;
        }
        
        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("logInfo.ip_address =", value, "logInfo.ip_address");
            return (Criteria) this;
        }
        
        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("logInfo.ip_address <>", value, "logInfo.ip_address");
            return (Criteria) this;
        }
        
        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("logInfo.ip_address >", value, "logInfo.ip_address");
            return (Criteria) this;
        }
        
        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("logInfo.ip_address >=", value, "logInfo.ip_address");
            return (Criteria) this;
        }
        
        public Criteria andIpAddressLessThan(String value) {
            addCriterion("logInfo.ip_address <", value, "logInfo.ip_address");
            return (Criteria) this;
        }
        
        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("logInfo.ip_address <=", value, "logInfo.ip_address");
            return (Criteria) this;
        }
        
        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("logInfo.ip_address in", values, "logInfo.ip_address");
            return (Criteria) this;
        }
        
        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("logInfo.ip_address not in", values, "logInfo.ip_address");
            return (Criteria) this;
        }
        
        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("logInfo.ip_address between", value1, value2, "logInfo.ip_address");
            return (Criteria) this;
        }
        
        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("logInfo.ip_address not between", value1, value2, "logInfo.ip_address");
            return (Criteria) this;
        }
        
        public Criteria andIpAddressLike(String value) {
            addCriterion("logInfo.ip_address like", value, "logInfo.ipAddress");
            return (Criteria) this;
        }
        
        public Criteria andIpAddressNotLike(String value) {
            addCriterion("logInfo.ip_address not like", value, "logInfo.ipAddress");
            return (Criteria) this;
        }
        public Criteria andModuleTypeIsNull() {
            addCriterion("logInfo.module_type is null");
            return (Criteria) this;
        }
        
        public Criteria andModuleTypeIsNotNull() {
            addCriterion("logInfo.module_type is not null");
            return (Criteria) this;
        }
        
        public Criteria andModuleTypeEqualTo(String value) {
            addCriterion("logInfo.module_type =", value, "logInfo.module_type");
            return (Criteria) this;
        }
        
        public Criteria andModuleTypeNotEqualTo(String value) {
            addCriterion("logInfo.module_type <>", value, "logInfo.module_type");
            return (Criteria) this;
        }
        
        public Criteria andModuleTypeGreaterThan(String value) {
            addCriterion("logInfo.module_type >", value, "logInfo.module_type");
            return (Criteria) this;
        }
        
        public Criteria andModuleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("logInfo.module_type >=", value, "logInfo.module_type");
            return (Criteria) this;
        }
        
        public Criteria andModuleTypeLessThan(String value) {
            addCriterion("logInfo.module_type <", value, "logInfo.module_type");
            return (Criteria) this;
        }
        
        public Criteria andModuleTypeLessThanOrEqualTo(String value) {
            addCriterion("logInfo.module_type <=", value, "logInfo.module_type");
            return (Criteria) this;
        }
        
        public Criteria andModuleTypeIn(List<String> values) {
            addCriterion("logInfo.module_type in", values, "logInfo.module_type");
            return (Criteria) this;
        }
        
        public Criteria andModuleTypeNotIn(List<String> values) {
            addCriterion("logInfo.module_type not in", values, "logInfo.module_type");
            return (Criteria) this;
        }
        
        public Criteria andModuleTypeBetween(String value1, String value2) {
            addCriterion("logInfo.module_type between", value1, value2, "logInfo.module_type");
            return (Criteria) this;
        }
        
        public Criteria andModuleTypeNotBetween(String value1, String value2) {
            addCriterion("logInfo.module_type not between", value1, value2, "logInfo.module_type");
            return (Criteria) this;
        }
        
        public Criteria andModuleTypeLike(String value) {
            addCriterion("logInfo.module_type like", value, "logInfo.moduleType");
            return (Criteria) this;
        }
        
        public Criteria andModuleTypeNotLike(String value) {
            addCriterion("logInfo.module_type not like", value, "logInfo.moduleType");
            return (Criteria) this;
        }
        public Criteria andBusinessTypeIsNull() {
            addCriterion("logInfo.business_type is null");
            return (Criteria) this;
        }
        
        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("logInfo.business_type is not null");
            return (Criteria) this;
        }
        
        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("logInfo.business_type =", value, "logInfo.business_type");
            return (Criteria) this;
        }
        
        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("logInfo.business_type <>", value, "logInfo.business_type");
            return (Criteria) this;
        }
        
        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("logInfo.business_type >", value, "logInfo.business_type");
            return (Criteria) this;
        }
        
        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("logInfo.business_type >=", value, "logInfo.business_type");
            return (Criteria) this;
        }
        
        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("logInfo.business_type <", value, "logInfo.business_type");
            return (Criteria) this;
        }
        
        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("logInfo.business_type <=", value, "logInfo.business_type");
            return (Criteria) this;
        }
        
        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("logInfo.business_type in", values, "logInfo.business_type");
            return (Criteria) this;
        }
        
        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("logInfo.business_type not in", values, "logInfo.business_type");
            return (Criteria) this;
        }
        
        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("logInfo.business_type between", value1, value2, "logInfo.business_type");
            return (Criteria) this;
        }
        
        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("logInfo.business_type not between", value1, value2, "logInfo.business_type");
            return (Criteria) this;
        }
        
        public Criteria andBusinessTypeLike(String value) {
            addCriterion("logInfo.business_type like", value, "logInfo.businessType");
            return (Criteria) this;
        }
        
        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("logInfo.business_type not like", value, "logInfo.businessType");
            return (Criteria) this;
        }
        public Criteria andOperationIsNull() {
            addCriterion("logInfo.operation is null");
            return (Criteria) this;
        }
        
        public Criteria andOperationIsNotNull() {
            addCriterion("logInfo.operation is not null");
            return (Criteria) this;
        }
        
        public Criteria andOperationEqualTo(String value) {
            addCriterion("logInfo.operation =", value, "logInfo.operation");
            return (Criteria) this;
        }
        
        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("logInfo.operation <>", value, "logInfo.operation");
            return (Criteria) this;
        }
        
        public Criteria andOperationGreaterThan(String value) {
            addCriterion("logInfo.operation >", value, "logInfo.operation");
            return (Criteria) this;
        }
        
        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("logInfo.operation >=", value, "logInfo.operation");
            return (Criteria) this;
        }
        
        public Criteria andOperationLessThan(String value) {
            addCriterion("logInfo.operation <", value, "logInfo.operation");
            return (Criteria) this;
        }
        
        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("logInfo.operation <=", value, "logInfo.operation");
            return (Criteria) this;
        }
        
        public Criteria andOperationIn(List<String> values) {
            addCriterion("logInfo.operation in", values, "logInfo.operation");
            return (Criteria) this;
        }
        
        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("logInfo.operation not in", values, "logInfo.operation");
            return (Criteria) this;
        }
        
        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("logInfo.operation between", value1, value2, "logInfo.operation");
            return (Criteria) this;
        }
        
        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("logInfo.operation not between", value1, value2, "logInfo.operation");
            return (Criteria) this;
        }
        
        public Criteria andOperationLike(String value) {
            addCriterion("logInfo.operation like", value, "logInfo.operation");
            return (Criteria) this;
        }
        
        public Criteria andOperationNotLike(String value) {
            addCriterion("logInfo.operation not like", value, "logInfo.operation");
            return (Criteria) this;
        }
        public Criteria andIsSuccessIsNull() {
            addCriterion("logInfo.is_success is null");
            return (Criteria) this;
        }
        
        public Criteria andIsSuccessIsNotNull() {
            addCriterion("logInfo.is_success is not null");
            return (Criteria) this;
        }
        
        public Criteria andIsSuccessEqualTo(String value) {
            addCriterion("logInfo.is_success =", value, "logInfo.is_success");
            return (Criteria) this;
        }
        
        public Criteria andIsSuccessNotEqualTo(String value) {
            addCriterion("logInfo.is_success <>", value, "logInfo.is_success");
            return (Criteria) this;
        }
        
        public Criteria andIsSuccessGreaterThan(String value) {
            addCriterion("logInfo.is_success >", value, "logInfo.is_success");
            return (Criteria) this;
        }
        
        public Criteria andIsSuccessGreaterThanOrEqualTo(String value) {
            addCriterion("logInfo.is_success >=", value, "logInfo.is_success");
            return (Criteria) this;
        }
        
        public Criteria andIsSuccessLessThan(String value) {
            addCriterion("logInfo.is_success <", value, "logInfo.is_success");
            return (Criteria) this;
        }
        
        public Criteria andIsSuccessLessThanOrEqualTo(String value) {
            addCriterion("logInfo.is_success <=", value, "logInfo.is_success");
            return (Criteria) this;
        }
        
        public Criteria andIsSuccessIn(List<String> values) {
            addCriterion("logInfo.is_success in", values, "logInfo.is_success");
            return (Criteria) this;
        }
        
        public Criteria andIsSuccessNotIn(List<String> values) {
            addCriterion("logInfo.is_success not in", values, "logInfo.is_success");
            return (Criteria) this;
        }
        
        public Criteria andIsSuccessBetween(String value1, String value2) {
            addCriterion("logInfo.is_success between", value1, value2, "logInfo.is_success");
            return (Criteria) this;
        }
        
        public Criteria andIsSuccessNotBetween(String value1, String value2) {
            addCriterion("logInfo.is_success not between", value1, value2, "logInfo.is_success");
            return (Criteria) this;
        }
        
        public Criteria andIsSuccessLike(String value) {
            addCriterion("logInfo.is_success like", value, "logInfo.isSuccess");
            return (Criteria) this;
        }
        
        public Criteria andIsSuccessNotLike(String value) {
            addCriterion("logInfo.is_success not like", value, "logInfo.isSuccess");
            return (Criteria) this;
        }
        public Criteria andRequestParamIsNull() {
            addCriterion("logInfo.request_param is null");
            return (Criteria) this;
        }
        
        public Criteria andRequestParamIsNotNull() {
            addCriterion("logInfo.request_param is not null");
            return (Criteria) this;
        }
        
        public Criteria andRequestParamEqualTo(String value) {
            addCriterion("logInfo.request_param =", value, "logInfo.request_param");
            return (Criteria) this;
        }
        
        public Criteria andRequestParamNotEqualTo(String value) {
            addCriterion("logInfo.request_param <>", value, "logInfo.request_param");
            return (Criteria) this;
        }
        
        public Criteria andRequestParamGreaterThan(String value) {
            addCriterion("logInfo.request_param >", value, "logInfo.request_param");
            return (Criteria) this;
        }
        
        public Criteria andRequestParamGreaterThanOrEqualTo(String value) {
            addCriterion("logInfo.request_param >=", value, "logInfo.request_param");
            return (Criteria) this;
        }
        
        public Criteria andRequestParamLessThan(String value) {
            addCriterion("logInfo.request_param <", value, "logInfo.request_param");
            return (Criteria) this;
        }
        
        public Criteria andRequestParamLessThanOrEqualTo(String value) {
            addCriterion("logInfo.request_param <=", value, "logInfo.request_param");
            return (Criteria) this;
        }
        
        public Criteria andRequestParamIn(List<String> values) {
            addCriterion("logInfo.request_param in", values, "logInfo.request_param");
            return (Criteria) this;
        }
        
        public Criteria andRequestParamNotIn(List<String> values) {
            addCriterion("logInfo.request_param not in", values, "logInfo.request_param");
            return (Criteria) this;
        }
        
        public Criteria andRequestParamBetween(String value1, String value2) {
            addCriterion("logInfo.request_param between", value1, value2, "logInfo.request_param");
            return (Criteria) this;
        }
        
        public Criteria andRequestParamNotBetween(String value1, String value2) {
            addCriterion("logInfo.request_param not between", value1, value2, "logInfo.request_param");
            return (Criteria) this;
        }
        
        public Criteria andRequestParamLike(String value) {
            addCriterion("logInfo.request_param like", value, "logInfo.requestParam");
            return (Criteria) this;
        }
        
        public Criteria andRequestParamNotLike(String value) {
            addCriterion("logInfo.request_param not like", value, "logInfo.requestParam");
            return (Criteria) this;
        }
        public Criteria andResponseResultIsNull() {
            addCriterion("logInfo.response_result is null");
            return (Criteria) this;
        }
        
        public Criteria andResponseResultIsNotNull() {
            addCriterion("logInfo.response_result is not null");
            return (Criteria) this;
        }
        
        public Criteria andResponseResultEqualTo(String value) {
            addCriterion("logInfo.response_result =", value, "logInfo.response_result");
            return (Criteria) this;
        }
        
        public Criteria andResponseResultNotEqualTo(String value) {
            addCriterion("logInfo.response_result <>", value, "logInfo.response_result");
            return (Criteria) this;
        }
        
        public Criteria andResponseResultGreaterThan(String value) {
            addCriterion("logInfo.response_result >", value, "logInfo.response_result");
            return (Criteria) this;
        }
        
        public Criteria andResponseResultGreaterThanOrEqualTo(String value) {
            addCriterion("logInfo.response_result >=", value, "logInfo.response_result");
            return (Criteria) this;
        }
        
        public Criteria andResponseResultLessThan(String value) {
            addCriterion("logInfo.response_result <", value, "logInfo.response_result");
            return (Criteria) this;
        }
        
        public Criteria andResponseResultLessThanOrEqualTo(String value) {
            addCriterion("logInfo.response_result <=", value, "logInfo.response_result");
            return (Criteria) this;
        }
        
        public Criteria andResponseResultIn(List<String> values) {
            addCriterion("logInfo.response_result in", values, "logInfo.response_result");
            return (Criteria) this;
        }
        
        public Criteria andResponseResultNotIn(List<String> values) {
            addCriterion("logInfo.response_result not in", values, "logInfo.response_result");
            return (Criteria) this;
        }
        
        public Criteria andResponseResultBetween(String value1, String value2) {
            addCriterion("logInfo.response_result between", value1, value2, "logInfo.response_result");
            return (Criteria) this;
        }
        
        public Criteria andResponseResultNotBetween(String value1, String value2) {
            addCriterion("logInfo.response_result not between", value1, value2, "logInfo.response_result");
            return (Criteria) this;
        }
        
        public Criteria andResponseResultLike(String value) {
            addCriterion("logInfo.response_result like", value, "logInfo.responseResult");
            return (Criteria) this;
        }
        
        public Criteria andResponseResultNotLike(String value) {
            addCriterion("logInfo.response_result not like", value, "logInfo.responseResult");
            return (Criteria) this;
        }
        public Criteria andErrMsgIsNull() {
            addCriterion("logInfo.err_msg is null");
            return (Criteria) this;
        }
        
        public Criteria andErrMsgIsNotNull() {
            addCriterion("logInfo.err_msg is not null");
            return (Criteria) this;
        }
        
        public Criteria andErrMsgEqualTo(String value) {
            addCriterion("logInfo.err_msg =", value, "logInfo.err_msg");
            return (Criteria) this;
        }
        
        public Criteria andErrMsgNotEqualTo(String value) {
            addCriterion("logInfo.err_msg <>", value, "logInfo.err_msg");
            return (Criteria) this;
        }
        
        public Criteria andErrMsgGreaterThan(String value) {
            addCriterion("logInfo.err_msg >", value, "logInfo.err_msg");
            return (Criteria) this;
        }
        
        public Criteria andErrMsgGreaterThanOrEqualTo(String value) {
            addCriterion("logInfo.err_msg >=", value, "logInfo.err_msg");
            return (Criteria) this;
        }
        
        public Criteria andErrMsgLessThan(String value) {
            addCriterion("logInfo.err_msg <", value, "logInfo.err_msg");
            return (Criteria) this;
        }
        
        public Criteria andErrMsgLessThanOrEqualTo(String value) {
            addCriterion("logInfo.err_msg <=", value, "logInfo.err_msg");
            return (Criteria) this;
        }
        
        public Criteria andErrMsgIn(List<String> values) {
            addCriterion("logInfo.err_msg in", values, "logInfo.err_msg");
            return (Criteria) this;
        }
        
        public Criteria andErrMsgNotIn(List<String> values) {
            addCriterion("logInfo.err_msg not in", values, "logInfo.err_msg");
            return (Criteria) this;
        }
        
        public Criteria andErrMsgBetween(String value1, String value2) {
            addCriterion("logInfo.err_msg between", value1, value2, "logInfo.err_msg");
            return (Criteria) this;
        }
        
        public Criteria andErrMsgNotBetween(String value1, String value2) {
            addCriterion("logInfo.err_msg not between", value1, value2, "logInfo.err_msg");
            return (Criteria) this;
        }
        
        public Criteria andErrMsgLike(String value) {
            addCriterion("logInfo.err_msg like", value, "logInfo.errMsg");
            return (Criteria) this;
        }
        
        public Criteria andErrMsgNotLike(String value) {
            addCriterion("logInfo.err_msg not like", value, "logInfo.errMsg");
            return (Criteria) this;
        }
        public Criteria andRemarkIsNull() {
            addCriterion("logInfo.remark is null");
            return (Criteria) this;
        }
        
        public Criteria andRemarkIsNotNull() {
            addCriterion("logInfo.remark is not null");
            return (Criteria) this;
        }
        
        public Criteria andRemarkEqualTo(String value) {
            addCriterion("logInfo.remark =", value, "logInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("logInfo.remark <>", value, "logInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("logInfo.remark >", value, "logInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("logInfo.remark >=", value, "logInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkLessThan(String value) {
            addCriterion("logInfo.remark <", value, "logInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("logInfo.remark <=", value, "logInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkIn(List<String> values) {
            addCriterion("logInfo.remark in", values, "logInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("logInfo.remark not in", values, "logInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("logInfo.remark between", value1, value2, "logInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("logInfo.remark not between", value1, value2, "logInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkLike(String value) {
            addCriterion("logInfo.remark like", value, "logInfo.remark");
            return (Criteria) this;
        }
        
        public Criteria andRemarkNotLike(String value) {
            addCriterion("logInfo.remark not like", value, "logInfo.remark");
            return (Criteria) this;
        }
        public Criteria andClientTypeIsNull() {
            addCriterion("logInfo.client_type is null");
            return (Criteria) this;
        }
        
        public Criteria andClientTypeIsNotNull() {
            addCriterion("logInfo.client_type is not null");
            return (Criteria) this;
        }
        
        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("logInfo.client_type =", value, "logInfo.client_type");
            return (Criteria) this;
        }
        
        public Criteria andClientTypeNotEqualTo(String value) {
            addCriterion("logInfo.client_type <>", value, "logInfo.client_type");
            return (Criteria) this;
        }
        
        public Criteria andClientTypeGreaterThan(String value) {
            addCriterion("logInfo.client_type >", value, "logInfo.client_type");
            return (Criteria) this;
        }
        
        public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("logInfo.client_type >=", value, "logInfo.client_type");
            return (Criteria) this;
        }
        
        public Criteria andClientTypeLessThan(String value) {
            addCriterion("logInfo.client_type <", value, "logInfo.client_type");
            return (Criteria) this;
        }
        
        public Criteria andClientTypeLessThanOrEqualTo(String value) {
            addCriterion("logInfo.client_type <=", value, "logInfo.client_type");
            return (Criteria) this;
        }
        
        public Criteria andClientTypeIn(List<String> values) {
            addCriterion("logInfo.client_type in", values, "logInfo.client_type");
            return (Criteria) this;
        }
        
        public Criteria andClientTypeNotIn(List<String> values) {
            addCriterion("logInfo.client_type not in", values, "logInfo.client_type");
            return (Criteria) this;
        }
        
        public Criteria andClientTypeBetween(String value1, String value2) {
            addCriterion("logInfo.client_type between", value1, value2, "logInfo.client_type");
            return (Criteria) this;
        }
        
        public Criteria andClientTypeNotBetween(String value1, String value2) {
            addCriterion("logInfo.client_type not between", value1, value2, "logInfo.client_type");
            return (Criteria) this;
        }
        
        public Criteria andClientTypeLike(String value) {
            addCriterion("logInfo.client_type like", value, "logInfo.clientType");
            return (Criteria) this;
        }
        
        public Criteria andClientTypeNotLike(String value) {
            addCriterion("logInfo.client_type not like", value, "logInfo.clientType");
            return (Criteria) this;
        }
        public Criteria andCreateTimeIsNull() {
            addCriterion("logInfo.create_time is null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("logInfo.create_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("logInfo.create_time =", value, "logInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("logInfo.create_time <>", value, "logInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("logInfo.create_time >", value, "logInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logInfo.create_time >=", value, "logInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("logInfo.create_time <", value, "logInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("logInfo.create_time <=", value, "logInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("logInfo.create_time in", values, "logInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("logInfo.create_time not in", values, "logInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("logInfo.create_time between", value1, value2, "logInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("logInfo.create_time not between", value1, value2, "logInfo.create_time");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeLike(Date value) {
            addCriterion("logInfo.create_time like", value, "logInfo.createTime");
            return (Criteria) this;
        }
        
        public Criteria andCreateTimeNotLike(Date value) {
            addCriterion("logInfo.create_time not like", value, "logInfo.createTime");
            return (Criteria) this;
        }
        public Criteria andUpdateTimeIsNull() {
            addCriterion("logInfo.update_time is null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("logInfo.update_time is not null");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("logInfo.update_time =", value, "logInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("logInfo.update_time <>", value, "logInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("logInfo.update_time >", value, "logInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logInfo.update_time >=", value, "logInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("logInfo.update_time <", value, "logInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("logInfo.update_time <=", value, "logInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("logInfo.update_time in", values, "logInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("logInfo.update_time not in", values, "logInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("logInfo.update_time between", value1, value2, "logInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("logInfo.update_time not between", value1, value2, "logInfo.update_time");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeLike(Date value) {
            addCriterion("logInfo.update_time like", value, "logInfo.updateTime");
            return (Criteria) this;
        }
        
        public Criteria andUpdateTimeNotLike(Date value) {
            addCriterion("logInfo.update_time not like", value, "logInfo.updateTime");
            return (Criteria) this;
        }
        public Criteria andDeleteflagIsNull() {
            addCriterion("logInfo.deleteflag is null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIsNotNull() {
            addCriterion("logInfo.deleteflag is not null");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagEqualTo(String value) {
            addCriterion("logInfo.deleteflag =", value, "logInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotEqualTo(String value) {
            addCriterion("logInfo.deleteflag <>", value, "logInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThan(String value) {
            addCriterion("logInfo.deleteflag >", value, "logInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagGreaterThanOrEqualTo(String value) {
            addCriterion("logInfo.deleteflag >=", value, "logInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThan(String value) {
            addCriterion("logInfo.deleteflag <", value, "logInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLessThanOrEqualTo(String value) {
            addCriterion("logInfo.deleteflag <=", value, "logInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagIn(List<String> values) {
            addCriterion("logInfo.deleteflag in", values, "logInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotIn(List<String> values) {
            addCriterion("logInfo.deleteflag not in", values, "logInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagBetween(String value1, String value2) {
            addCriterion("logInfo.deleteflag between", value1, value2, "logInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotBetween(String value1, String value2) {
            addCriterion("logInfo.deleteflag not between", value1, value2, "logInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagLike(String value) {
            addCriterion("logInfo.deleteflag like", value, "logInfo.deleteflag");
            return (Criteria) this;
        }
        
        public Criteria andDeleteflagNotLike(String value) {
            addCriterion("logInfo.deleteflag not like", value, "logInfo.deleteflag");
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
    
    public LogInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
    
    public LogInfoExample(String deleteflag) {
    	Criteria criteria = new Criteria();
    	criteria.andDeleteflagEqualTo(deleteflag);
    	oredCriteria = new ArrayList<Criteria>();
    	oredCriteria.add(criteria);
    }
}