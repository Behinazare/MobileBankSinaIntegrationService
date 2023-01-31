package com.rahand.sina.integration.domain.inquiry.dto;

import com.rahand.common.dto.BaseRequest;


public class PostInquiryRequest extends BaseRequest {

    private String postalCode;

    public PostInquiryRequest() {
    }

    public PostInquiryRequest(String userId, String postalCode) {
        super(userId);
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
