package com.rahand.sina.integration.domain.sms.service.spec;

import com.rahand.sina.integration.domain.sms.dto.SmsRequest;
import com.rahand.sina.integration.domain.sms.dto.SmsResponse;

public interface Sms {

    SmsResponse sendSms(SmsRequest smsRequest);
}
