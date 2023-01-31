package com.rahand.sina.integration.domain.kyc.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.sina.integration.domain.kyc.dto.GetVideoRecordingTextRequest;
import com.rahand.sina.integration.domain.kyc.dto.GetVideoRecordingTextResponse;
import com.rahand.sina.integration.domain.kyc.dto.IntegratedIdentificationRequest;
import com.rahand.sina.integration.domain.kyc.dto.IntegratedIdentificationResponse;
import com.rahand.sina.integration.domain.kyc.service.spec.Kyc;
import com.rahand.sina.integration.provider.part.service.FaraShenasaService;

public class KycService {

    private Kyc kycService;

    public KycService() {
        kycService = new FaraShenasaService();
    }

    public ResponseDto<IntegratedIdentificationResponse> integratedIdentification(IntegratedIdentificationRequest integratedIdentificationRequest) {

        ResponseDto<IntegratedIdentificationResponse> response = new ResponseDto<>();
        IntegratedIdentificationResponse integratedIdentificationResponse = kycService.integratedIdentification(integratedIdentificationRequest);

        if (integratedIdentificationResponse.isError()) {
            response.setError(true);
            response.setMessage(integratedIdentificationResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(integratedIdentificationResponse);
        }

        return response;
    }

    public ResponseDto<GetVideoRecordingTextResponse> getVideoRecordingText(GetVideoRecordingTextRequest getVideoRecordingTextRequest) {

        ResponseDto<GetVideoRecordingTextResponse> response = new ResponseDto<>();
        GetVideoRecordingTextResponse getVideoRecordingTextResponse = kycService.getVideoRecordingText(getVideoRecordingTextRequest);

        if (getVideoRecordingTextResponse.isError()) {
            response.setError(true);
            response.setMessage(getVideoRecordingTextResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(getVideoRecordingTextResponse);
        }

        return response;
    }

}
