package com.rahand.sina.integration.domain.echarge.dto;

import com.rahand.bpm.framework.json.ContainerJson;
import com.rahand.common.dto.BaseResponse;
import com.rahand.sina.integration.domain.echarge.enums.EchargeOperator;
import com.rahand.sina.integration.domain.echarge.enums.EchargeType;
import lombok.Builder;

import java.util.List;



public class GetInternetPackageResponse extends BaseResponse {

    private EchargeOperator echargeOperator;
    private EchargeType echargeType;
    private String internetPackageJson;
    private ContainerJson internetPackageContainerJson;
    private List<InternetPackage> internetPackages;
    private Integer count;

    public GetInternetPackageResponse() {
    }

    @Builder
    public GetInternetPackageResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, EchargeOperator echargeOperator, EchargeType echargeType, String internetPackageJson, ContainerJson internetPackageContainerJson, List<InternetPackage> internetPackages, Integer count) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.echargeOperator = echargeOperator;
        this.echargeType = echargeType;
        this.internetPackageJson = internetPackageJson;
        this.internetPackageContainerJson = internetPackageContainerJson;
        this.internetPackages = internetPackages;
        this.count = count;
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

    public String getInternetPackageJson() {
        return internetPackageJson;
    }

    public void setInternetPackageJson(String internetPackageJson) {
        this.internetPackageJson = internetPackageJson;
    }

    public ContainerJson getInternetPackageContainerJson() {
        return internetPackageContainerJson;
    }

    public void setInternetPackageContainerJson(ContainerJson internetPackageContainerJson) {
        this.internetPackageContainerJson = internetPackageContainerJson;
    }

    public List<InternetPackage> getInternetPackages() {
        return internetPackages;
    }

    public void setInternetPackages(List<InternetPackage> internetPackages) {
        this.internetPackages = internetPackages;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
