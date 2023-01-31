package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.time.LocalDateTime;


public class IssueCardResponse extends BaseResponse {

    private String customerName;
    private String depositNumber;
    private String pan;
    private LocalDateTime expireDate;
    private String persianExpireDate;
    private String cvv2;
    private String track1;
    private String track2;
    private String track3;

    private IssueCardReportDto issueCardReportDto;



    public IssueCardResponse() {
    }


    @Builder
    public IssueCardResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String customerName, String depositNumber, String pan, LocalDateTime expireDate, String persianExpireDate, String cvv2, String track1, String track2, String track3, IssueCardReportDto issueCardReportDto) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.customerName = customerName;
        this.depositNumber = depositNumber;
        this.pan = pan;
        this.expireDate = expireDate;
        this.persianExpireDate = persianExpireDate;
        this.cvv2 = cvv2;
        this.track1 = track1;
        this.track2 = track2;
        this.track3 = track3;
        this.issueCardReportDto = issueCardReportDto;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getPersianExpireDate() {
        return persianExpireDate;
    }

    public void setPersianExpireDate(String persianExpireDate) {
        this.persianExpireDate = persianExpireDate;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDateTime expireDate) {
        this.expireDate = expireDate;
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

    public IssueCardReportDto getIssueCardReportDto() {
        return issueCardReportDto;
    }

    public void setIssueCardReportDto(IssueCardReportDto issueCardReportDto) {
        this.issueCardReportDto = issueCardReportDto;
    }
}
