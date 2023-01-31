package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.bank.enums.DynamicPinProcessDetailParameter;
import com.rahand.sina.integration.domain.bank.enums.DynamicPinProcessType;
import lombok.Builder;

import java.math.BigDecimal;


public class DynamicPinRequest extends BaseRequest {

    private String pan;
    private String cvv2;
    private String expireDate;
    private BigDecimal amount;
    private DynamicPinProcessType dynamicPinProcessType;
    private DynamicPinProcessDetailParameter dynamicPinProcessDetailParameter;
    private String dynamicPinProcessDetailValue;
    private String processKey;
    private String instanceId;

    public DynamicPinRequest() {
    }


    @Builder
    public DynamicPinRequest(String userId, String pan, String cvv2, String expireDate, BigDecimal amount, DynamicPinProcessType dynamicPinProcessType, DynamicPinProcessDetailParameter dynamicPinProcessDetailParameter, String dynamicPinProcessDetailValue, String processKey, String instanceId) {
        super(userId);
        this.pan = pan;
        this.cvv2 = cvv2;
        this.expireDate = expireDate;
        this.amount = amount;
        this.dynamicPinProcessType = dynamicPinProcessType;
        this.dynamicPinProcessDetailParameter = dynamicPinProcessDetailParameter;
        this.dynamicPinProcessDetailValue = dynamicPinProcessDetailValue;
        this.processKey = processKey;
        this.instanceId = instanceId;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public DynamicPinProcessType getDynamicPinProcessType() {
        return dynamicPinProcessType;
    }

    public void setDynamicPinProcessType(DynamicPinProcessType dynamicPinProcessType) {
        this.dynamicPinProcessType = dynamicPinProcessType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public DynamicPinProcessDetailParameter getDynamicPinProcessDetailParameter() {
        return dynamicPinProcessDetailParameter;
    }

    public void setDynamicPinProcessDetailParameter(DynamicPinProcessDetailParameter dynamicPinProcessDetailParameter) {
        this.dynamicPinProcessDetailParameter = dynamicPinProcessDetailParameter;
    }

    public String getDynamicPinProcessDetailValue() {
        return dynamicPinProcessDetailValue;
    }

    public void setDynamicPinProcessDetailValue(String dynamicPinProcessDetailValue) {
        this.dynamicPinProcessDetailValue = dynamicPinProcessDetailValue;
    }

    public String getProcessKey() {
        return processKey;
    }

    public void setProcessKey(String processKey) {
        this.processKey = processKey;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
}
