package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseDto;
import lombok.Builder;

import java.math.BigDecimal;

public class LoanInfoDto extends BaseDto {

    private String id;

    private BigDecimal facilityAmount;

    private String description;

    private Integer rePaymentDuration;

    private Integer installmentsGap;

    public LoanInfoDto() {
    }

    @Builder
    public LoanInfoDto(String id, BigDecimal facilityAmount, String description, Integer rePaymentDuration, Integer installmentsGap) {
        this.id = id;
        this.facilityAmount = facilityAmount;
        this.description = description;
        this.rePaymentDuration = rePaymentDuration;
        this.installmentsGap = installmentsGap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getFacilityAmount() {
        return facilityAmount;
    }

    public void setFacilityAmount(BigDecimal facilityAmount) {
        this.facilityAmount = facilityAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRePaymentDuration() {
        return rePaymentDuration;
    }

    public void setRePaymentDuration(Integer rePaymentDuration) {
        this.rePaymentDuration = rePaymentDuration;
    }

    public Integer getInstallmentsGap() {
        return installmentsGap;
    }

    public void setInstallmentsGap(Integer installmentsGap) {
        this.installmentsGap = installmentsGap;
    }
}
