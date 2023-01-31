package com.rahand.sina.integration.domain.inquiry.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;

public class MyBillsResponse extends BaseResponse {

    private List<MyBillDto> myBills;
    private String myBillsJson;

    public MyBillsResponse() {
    }

    @Builder
    public MyBillsResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, List<MyBillDto> myBills, String myBillsJson) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.myBills = myBills;
        this.myBillsJson = myBillsJson;
    }

    public List<MyBillDto> getMyBills() {
        return myBills;
    }

    public void setMyBills(List<MyBillDto> myBills) {
        this.myBills = myBills;
    }

    public String getMyBillsJson() {
        return myBillsJson;
    }

    public void setMyBillsJson(String myBillsJson) {
        this.myBillsJson = myBillsJson;
    }
}
