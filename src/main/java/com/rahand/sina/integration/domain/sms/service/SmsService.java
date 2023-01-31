package com.rahand.sina.integration.domain.sms.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.common.util.DBUtility;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.sms.dto.SmsRequest;
import com.rahand.sina.integration.domain.sms.dto.SmsResponse;
import com.rahand.sina.integration.domain.sms.enums.SmsProvider;
import com.rahand.sina.integration.domain.sms.service.spec.Sms;
import com.rahand.sina.integration.provider.armaghan.service.ArmaghanSmsService;
import com.rahand.sina.integration.provider.tefas.service.TefasSmsService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SmsService {

    private Sms smsService;

    public SmsService() {
        getService();
    }

    public void getService() {

        String provider = IntegrationLibConfig.getProperty("SMS_PROVIDER");

        if (provider.equals(SmsProvider.ARMAGHAN.name())) {
            smsService = new ArmaghanSmsService();
        } else if (provider.equals(SmsProvider.TEFAS.name())) {
            smsService = new TefasSmsService();
        } else {
            smsService = new ArmaghanSmsService();
        }

    }

    public ResponseDto<SmsResponse> sendSms(SmsRequest smsRequest) {

        ResponseDto<SmsResponse> response = new ResponseDto<>();
        SmsResponse smsResponse = smsService.sendSms(smsRequest);

        if (smsResponse.isSessionExpired()) {
            smsResponse = smsService.sendSms(smsRequest);
        }

        if (smsResponse.isError()) {
            response.setError(true);
            response.setMessage(smsResponse.getErrorMessage());
            response.setResponseData(smsResponse);
        } else {
            response.setError(false);
            response.setResponseData(smsResponse);
        }

        return response;
    }

    public ResponseDto<String> getSmsFormat(SmsRequest smsRequest) {

        ResponseDto<String> response = new ResponseDto<>();
        String smsFormat = "Empty";
        String query = "select pvalue from XTI22CONFIG t where productname = ? and groupname = ? and pname = ? and customername= ? and status = 1";

        try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {

            preparedStatement.setString(1, smsRequest.getProductName());
            preparedStatement.setString(2, smsRequest.getGroupName());
            preparedStatement.setString(3, smsRequest.getSmsKey());
            preparedStatement.setString(4, smsRequest.getCustomerName());

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                smsFormat = resultSet.getString(1);
            }

            response.setResponseData(smsFormat);

        } catch (SQLException e) {
            response.setError(true);
            response.setMessage("Error in get sms from config");
            CommonUtil.logError(getClass().getSimpleName(), "getSmsFormat", e.getMessage());
        }

        return response;
    }


}
