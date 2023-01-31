package com.rahand.sina.integration.domain.kyc.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.sina.integration.domain.kyc.dto.GetVideoRecordingTextRequest;
import com.rahand.sina.integration.domain.kyc.dto.GetVideoRecordingTextResponse;
import com.rahand.sina.integration.domain.kyc.dto.IntegratedIdentificationRequest;
import com.rahand.sina.integration.domain.kyc.dto.IntegratedIdentificationResponse;
import org.junit.Test;

public class KycServiceTest {

    @Test
    public void integratedIdentification() {

        KycService kycService = new KycService();
        IntegratedIdentificationRequest integratedIdentificationRequest = new IntegratedIdentificationRequest();
        ResponseDto<IntegratedIdentificationResponse> response = kycService.integratedIdentification(integratedIdentificationRequest);
        IntegratedIdentificationResponse integratedIdentificationResponse = response.getResponseData();

    }

    @Test
    public void getVideoRecordingText() {

        KycService kycService = new KycService();
        GetVideoRecordingTextRequest getVideoRecordingTextRequest = new GetVideoRecordingTextRequest();
        getVideoRecordingTextRequest.setRequestId("");
        ResponseDto<GetVideoRecordingTextResponse> response = kycService.getVideoRecordingText(getVideoRecordingTextRequest);
        GetVideoRecordingTextResponse getVideoRecordingTextResponse = response.getResponseData();

    }
}