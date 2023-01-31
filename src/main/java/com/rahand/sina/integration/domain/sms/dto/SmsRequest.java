package com.rahand.sina.integration.domain.sms.dto;

import com.rahand.common.dto.BaseRequest;

public class SmsRequest extends BaseRequest {

    private String mobileNumber;
    private String message;

    private String customerName;
    private String groupName;
    private String productName;
    private String smsKey;

    public SmsRequest() {
    }

    public SmsRequest(String userId, String mobileNumber, String message, String customerName, String groupName, String productName, String smsKey) {
        super(userId);
        this.mobileNumber = mobileNumber;
        this.message = message;
        this.customerName = customerName;
        this.groupName = groupName;
        this.productName = productName;
        this.smsKey = smsKey;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSmsKey() {
        return smsKey;
    }

    public void setSmsKey(String smsKey) {
        this.smsKey = smsKey;
    }
}
