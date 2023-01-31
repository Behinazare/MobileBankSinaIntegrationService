package com.rahand.sina.integration.domain.sms.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.sina.integration.domain.sms.dto.SmsRequest;
import com.rahand.sina.integration.domain.sms.dto.SmsResponse;
import org.junit.Test;

public class SmsServiceTest {

    @Test
    public void sendSms() {
        SmsService smsService = new SmsService();
        SmsRequest smsRequest = new SmsRequest();
        smsRequest.setMobileNumber("989226054364");
        smsRequest.setMessage("تست");
        ResponseDto<SmsResponse> responseDto = smsService.sendSms(smsRequest);
        SmsResponse smsResponse = responseDto.getResponseData();
    }
}