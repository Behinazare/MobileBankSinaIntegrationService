package com.rahand.sina.integration.domain.echarge.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.echarge.enums.EchargeOperator;
import com.rahand.sina.integration.domain.echarge.enums.EchargeType;
import lombok.Builder;



public class GetInternetPackageRequest extends BaseRequest {

    private EchargeOperator echargeOperator;
    private EchargeType echargeType;

    public GetInternetPackageRequest() {
    }

    @Builder
    public GetInternetPackageRequest(String userId, EchargeOperator echargeOperator, EchargeType echargeType) {
        super(userId);
        this.echargeOperator = echargeOperator;
        this.echargeType = echargeType;
    }

    public EchargeOperator getEchargeOperator() {
        return echargeOperator;
    }

    public void setEchargeOperator(EchargeOperator echargeOperator) {
        this.echargeOperator = echargeOperator;
    }

    public EchargeType getEchargeType() {
        return echargeType;
    }

    public void setEchargeType(EchargeType echargeType) {
        this.echargeType = echargeType;
    }
}
