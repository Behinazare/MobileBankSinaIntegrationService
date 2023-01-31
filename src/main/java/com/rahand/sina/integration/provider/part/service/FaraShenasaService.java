package com.rahand.sina.integration.provider.part.service;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.kyc.dto.GetVideoRecordingTextRequest;
import com.rahand.sina.integration.domain.kyc.dto.GetVideoRecordingTextResponse;
import com.rahand.sina.integration.domain.kyc.dto.IntegratedIdentificationRequest;
import com.rahand.sina.integration.domain.kyc.dto.IntegratedIdentificationResponse;
import com.rahand.sina.integration.domain.kyc.service.spec.Kyc;
import com.rahand.sina.integration.provider.part.dto.FaraShenasaBaseResponse;
import com.rahand.sina.integration.provider.part.util.PartRestClient;
import okhttp3.Headers;
import okhttp3.Response;

import java.util.Map;

public class FaraShenasaService implements Kyc {


    @Override
    public IntegratedIdentificationResponse integratedIdentification(IntegratedIdentificationRequest integratedIdentificationRequest) {
        return null;
    }

    @Override
    public GetVideoRecordingTextResponse getVideoRecordingText(GetVideoRecordingTextRequest getVideoRecordingTextRequest) {

        GetVideoRecordingTextResponse getVideoRecordingTextResponse = new GetVideoRecordingTextResponse();

        String apiUrl = IntegrationLibConfig.getProperty("FARASHENASA_BASE_URL") + String.format("/service/onlineAuth@3/test?uniqueKey=%s", getVideoRecordingTextRequest.getRequestId());

        Headers headers = new Headers.Builder()
                .add("token", FaraShenasaLoginService.login().getToken())
                .build();

        Response response = PartRestClient.getRequest(apiUrl, headers, 30l);

        if (response.isSuccessful()) {
            String responseJson = PartRestClient.responseBodyToString(response);
            FaraShenasaBaseResponse<Map<String, String>, Map<String, String>> faraShenasaBaseResponse = CommonUtil.jsonToObject(responseJson, FaraShenasaBaseResponse.class);
            getVideoRecordingTextResponse.setError(false);
            getVideoRecordingTextResponse.setText(faraShenasaBaseResponse.getData().get("text"));
            getVideoRecordingTextResponse.setMaxTime(Integer.valueOf(faraShenasaBaseResponse.getData().get("time")));
            getVideoRecordingTextResponse.setMinTime(Integer.valueOf(faraShenasaBaseResponse.getData().get("minTime")));
        } else {
            String responseJson = PartRestClient.responseBodyToString(response);
            getVideoRecordingTextResponse.setError(true);
            getVideoRecordingTextResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);

            CommonUtil.logError(getClass().getSimpleName(), "getVideoRecordingText", responseJson, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(getVideoRecordingTextRequest))
                    .output(responseJson)
                    .build());
        }

        return getVideoRecordingTextResponse;
    }
}
