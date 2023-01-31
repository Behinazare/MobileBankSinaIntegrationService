package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;

public class GetDigitalCreditDossiersResponse extends BaseResponse {

    private Integer count;
    private List<DigitalCreditDossiersDto> digitalCreditDossiers;

    public GetDigitalCreditDossiersResponse() {
    }

    @Builder
    public GetDigitalCreditDossiersResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<DigitalCreditDossiersDto> digitalCreditDossiers) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.count = count;
        this.digitalCreditDossiers = digitalCreditDossiers;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<DigitalCreditDossiersDto> getDigitalCreditDossiers() {
        return digitalCreditDossiers;
    }

    public void setDigitalCreditDossiers(List<DigitalCreditDossiersDto> digitalCreditDossiers) {
        this.digitalCreditDossiers = digitalCreditDossiers;
    }
}
