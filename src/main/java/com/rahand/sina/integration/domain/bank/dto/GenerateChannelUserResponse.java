package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.sina.integration.domain.sms.dto.SmsRequest;
import com.rahand.sina.integration.domain.sms.service.SmsService;
import lombok.Builder;


public class GenerateChannelUserResponse extends BaseResponse {

    private boolean userCreate;
    private String userName;
    private String pass;

    public GenerateChannelUserResponse() {
    }

    @Builder
    public GenerateChannelUserResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean userCreate, String userName, String pass) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.userCreate = userCreate;
        this.userName = userName;
        this.pass = pass;
    }

    public boolean isUserCreate() {
        return userCreate;
    }

    public void setUserCreate(boolean userCreate) {
        this.userCreate = userCreate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean sendMessage(String mobileNumber) {

        SmsService smsService = new SmsService();
        SmsRequest smsRequest = new SmsRequest();
        smsRequest.setMessage(String.format("*بانک سینا* مشتری محترم نام کاربری شما ٪S و رمز عبور ٪s شما می باشد. در حفظ و نگهداری آن کوشا باشید.", userName, pass));
        smsRequest.setMobileNumber(mobileNumber);
        return smsService.sendSms(smsRequest).isError();

    }
}
