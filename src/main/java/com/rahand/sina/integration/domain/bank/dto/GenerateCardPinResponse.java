package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;


public class GenerateCardPinResponse extends BaseResponse {

    private String pan;
    private String cvv2;
    private String pin;
    private String CardOwnerName;

    public GenerateCardPinResponse() {
    }

    @Builder
    public GenerateCardPinResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String pan, String cvv2, String pin, String cardOwnerName) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.pan = pan;
        this.cvv2 = cvv2;
        this.pin = pin;
        CardOwnerName = cardOwnerName;
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

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCardOwnerName() {
        return CardOwnerName;
    }

    public void setCardOwnerName(String cardOwnerName) {
        CardOwnerName = cardOwnerName;
    }
}
