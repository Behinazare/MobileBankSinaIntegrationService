package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.time.LocalDateTime;

public class IssueSpecialCardResponse extends BaseResponse {

    private String holderName;
    private String pan;
    private String cvv2;
    private LocalDateTime expirationDate;
    private String persianExpireDate;

    private String shortExpirationDate;
    private String track1;
    private String track2;
    private String track3;

    public IssueSpecialCardResponse() {
    }

    @Builder
    public IssueSpecialCardResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String holderName, String pan, String cvv2, LocalDateTime expirationDate, String persianExpireDate, String shortExpirationDate, String track1, String track2, String track3) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.holderName = holderName;
        this.pan = pan;
        this.cvv2 = cvv2;
        this.expirationDate = expirationDate;
        this.persianExpireDate = persianExpireDate;
        this.shortExpirationDate = shortExpirationDate;
        this.track1 = track1;
        this.track2 = track2;
        this.track3 = track3;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
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

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getPersianExpireDate() {
        return persianExpireDate;
    }

    public void setPersianExpireDate(String persianExpireDate) {
        this.persianExpireDate = persianExpireDate;
    }

    public String getTrack1() {
        return track1;
    }

    public void setTrack1(String track1) {
        this.track1 = track1;
    }

    public String getTrack2() {
        return track2;
    }

    public void setTrack2(String track2) {
        this.track2 = track2;
    }

    public String getTrack3() {
        return track3;
    }

    public void setTrack3(String track3) {
        this.track3 = track3;
    }

    public String getShortExpirationDate() {
        return shortExpirationDate;
    }

    public void setShortExpirationDate(String shortExpirationDate) {
        this.shortExpirationDate = shortExpirationDate;
    }
}
