package com.cisdi.business.entity;

import com.cisdi.base.entity.BaseEntity;
import java.util.Date;

/* 读取表结构信息 */
public class LogInfo extends BaseEntity {
    
    private static final long serialVersionUID = 1L;
    
    public LogInfo() {

    }
    
    /* 用户id  */
    private Integer userId;
    /* ip地址  */
    private String ipAddress;
    /* 模块名称  */
    private String moduleType;
    /* BusinessType  */
    private String businessType;
    /* 操作内容  */
    private String operation;
    /* YesOrNo  */
    private String isSuccess;
    /* 请求参数  */
    private String requestParam;
    /* 返回结果字符串  */
    private String responseResult;
    /* 异常信息  */
    private String errMsg;
    /* 备注  */
    private String remark;
    /* ClientType  */
    private String clientType;
    
    public Integer getUserId() {
        return this.userId;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }
    public String getModuleType() {
        return this.moduleType;
    }
    public String getBusinessType() {
        return this.businessType;
    }
    public String getOperation() {
        return this.operation;
    }
    public String getIsSuccess() {
        return this.isSuccess;
    }
    public String getRequestParam() {
        return this.requestParam;
    }
    public String getResponseResult() {
        return this.responseResult;
    }
    public String getErrMsg() {
        return this.errMsg;
    }
    public String getRemark() {
        return this.remark;
    }
    public String getClientType() {
        return this.clientType;
    }
   
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }
    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam;
    }
    public void setResponseResult(String responseResult) {
        this.responseResult = responseResult;
    }
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
  
}