package com.rahand.sina.integration.provider.armaghan.service;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.sms.dto.SmsRequest;
import com.rahand.sina.integration.domain.sms.dto.SmsResponse;
import com.rahand.sina.integration.domain.sms.service.spec.Sms;
import com.rahand.sina.integration.provider.armaghan.dto.SendSmsRequest;
import com.rahand.sina.integration.provider.armaghan.proxy.MessageRelay;
import com.rahand.sina.integration.provider.armaghan.proxy.MessageRelayServiceLocator;
import com.rahand.sina.integration.provider.armaghan.proxy.ReferenceResult;
import com.rahand.sina.integration.provider.armaghan.util.ArmaghanUtil;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

public class ArmaghanSmsService implements Sms {

    private final static String USER_NAME = IntegrationLibConfig.getProperty("ARMAGHAN_USER_NAME");
    private final static String PASSWORD = IntegrationLibConfig.getProperty("ARMAGHAN_PASSWORD");
    private final static String SENDER_NUMBER = IntegrationLibConfig.getProperty("ARMAGHAN_SENDER_NUMBER");


    static {
        getService();
    }

    private static MessageRelay messageService;

    private static void getService() {


        try {
            URL serviceUrl = new URL(IntegrationLibConfig.getProperty("ARMAGHAN_SERVICE_URL"));
            MessageRelayServiceLocator messageRelayServiceLocator = new MessageRelayServiceLocator();
            messageService = messageRelayServiceLocator.getMessageRelayPort(serviceUrl);

        } catch (ServiceException e) {
            CommonUtil.logError(ArmaghanSmsService.class.getSimpleName(), "getService", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        } catch (MalformedURLException e) {
            CommonUtil.logError(ArmaghanSmsService.class.getSimpleName(), "getService", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        }
    }

    @Override
    public SmsResponse sendSms(SmsRequest smsRequest) {

        SmsResponse smsResponse = new SmsResponse();

        if (!CommonUtil.mobileValidation(smsRequest.getMobileNumber())) {
            smsResponse = new SmsResponse();
            smsResponse.setSend(false);
            smsResponse.setError(true);
            smsResponse.setErrorMessage(CommonErrorMessage.INVALID_MOBILE_NUMBER);
            CommonUtil.logError(getClass().getSimpleName(), "sendSms", smsResponse.getErrorMessage());
            return smsResponse;

        }

        SendSmsRequest sendSmsRequest = SendSmsRequest.builder()
                .userName(USER_NAME)
                .password(PASSWORD)
                .senderNumber(SENDER_NUMBER)
                .receiverMobileNumbers(new String[]{smsRequest.getMobileNumber()})
                .message(smsRequest.getMessage())
                .userSuppliedId(null)
                .build();

        try {

            ReferenceResult result = messageService.sendMessageOneToMany(sendSmsRequest.getUserName(),
                    sendSmsRequest.getPassword(), sendSmsRequest.getSenderNumber(), sendSmsRequest.getReceiverMobileNumbers(),
                    smsRequest.getMessage(), sendSmsRequest.getUserSuppliedId());

            if (result.getError().getErrorCode() == 0) {
                smsResponse.setSend(true);
                smsResponse.setExtraInfo(String.valueOf(result.getReferences()[0]));
            } else {
                int errorCode = result.getError().getErrorCode();
                smsResponse.setSend(false);
                smsResponse.setError(true);
                smsResponse.setErrorMessage(ArmaghanUtil.getClientMessage(errorCode));
                CommonUtil.logError(ArmaghanSmsService.class.getSimpleName(), "sendSms", String.format("Error Code : %s", errorCode), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(sendSmsRequest))
                        .output(CommonUtil.toJson(result))
                        .build());
            }
        } catch (RemoteException e) {
            smsResponse.setSend(false);
            smsResponse.setError(true);
            smsResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            CommonUtil.logError(ArmaghanSmsService.class.getSimpleName(), "sendSms", e.getMessage(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(sendSmsRequest))
                    .output(e.toString())
                    .build());
        }

        return smsResponse;
    }
}
