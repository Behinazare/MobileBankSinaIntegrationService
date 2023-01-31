package com.rahand.sina.integration.domain.inquiry.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.inquiry.enums.ShahkarIdendtificationType;
import lombok.Builder;


public class ShahkarRequest extends BaseRequest {

    private ShahkarIdendtificationType shahkarIdendtificationType;
    private String identificationNo;
    private int serviceType;
    private String serviceNumber;

    public ShahkarRequest() {
    }

    @Builder
    public ShahkarRequest(String userId, ShahkarIdendtificationType shahkarIdendtificationType, String identificationNo, int serviceType, String serviceNumber) {
        super(userId);
        this.shahkarIdendtificationType = shahkarIdendtificationType;
        this.identificationNo = identificationNo;
        this.serviceType = serviceType;
        this.serviceNumber = serviceNumber;
    }

    public ShahkarIdendtificationType getShahkarIdendtificationType() {
        return shahkarIdendtificationType;
    }

    public void setShahkarIdendtificationType(ShahkarIdendtificationType shahkarIdendtificationType) {
        this.shahkarIdendtificationType = shahkarIdendtificationType;
    }

    public String getIdentificationNo() {
        return identificationNo;
    }

    public void setIdentificationNo(String identificationNo) {
        this.identificationNo = identificationNo;
    }

    public int getServiceType() {
        return serviceType;
    }

    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }
}
