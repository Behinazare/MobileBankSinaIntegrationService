package com.rahand.sina.integration.domain.kyc.service.spec;

import com.rahand.sina.integration.domain.kyc.dto.GetVideoRecordingTextRequest;
import com.rahand.sina.integration.domain.kyc.dto.GetVideoRecordingTextResponse;
import com.rahand.sina.integration.domain.kyc.dto.IntegratedIdentificationRequest;
import com.rahand.sina.integration.domain.kyc.dto.IntegratedIdentificationResponse;

public interface Kyc {

    IntegratedIdentificationResponse integratedIdentification(IntegratedIdentificationRequest integratedIdentificationRequest);

    GetVideoRecordingTextResponse getVideoRecordingText(GetVideoRecordingTextRequest getVideoRecordingTextRequest);
}
