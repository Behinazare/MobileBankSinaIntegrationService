package com.rahand.sina.integration.domain.digitalcertificate.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.sina.integration.domain.digitalcertificate.dto.*;
import com.rahand.sina.integration.domain.digitalcertificate.service.spec.DigitalCertificate;
import com.rahand.sina.integration.provider.faraboom.service.FaraboomDigitalCertificateService;

import java.util.List;
import java.util.Map;

public class DigitalCertificateService {

    private DigitalCertificate digitalCertificate;

    public DigitalCertificateService() {
        digitalCertificate = new FaraboomDigitalCertificateService();
    }

    public ResponseDto<DigitalCertificateIntroduceResponse> introduce(DigitalCertificateIntroduceRequest digitalCertificateIntroduceRequest) {

        ResponseDto<DigitalCertificateIntroduceResponse> response = new ResponseDto<>();
        DigitalCertificateIntroduceResponse digitalCertificateIntroduceResponse = digitalCertificate.introduce(digitalCertificateIntroduceRequest);

        if (digitalCertificateIntroduceResponse.isError()) {
            response.setError(true);
            response.setMessage(digitalCertificateIntroduceResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(digitalCertificateIntroduceResponse);
        }

        return response;
    }

    public ResponseDto<DigitalCertificateCreateResponse> create(DigitalCertificateCreateRequest digitalCertificateCreateRequest) {

        ResponseDto<DigitalCertificateCreateResponse> response = new ResponseDto<>();
        DigitalCertificateCreateResponse digitalCertificateCreateResponse = digitalCertificate.create(digitalCertificateCreateRequest);

        if (digitalCertificateCreateResponse.isError()) {
            response.setError(true);
            response.setMessage(digitalCertificateCreateResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(digitalCertificateCreateResponse);
        }

        return response;
    }

    public ResponseDto<DigitalCertificateRemoveResponse> remove(DigitalCertificateRemoveRequest digitalCertificateRemoveRequest) {

        ResponseDto<DigitalCertificateRemoveResponse> response = new ResponseDto<>();
        DigitalCertificateRemoveResponse digitalCertificateRemoveResponse = digitalCertificate.remove(digitalCertificateRemoveRequest);

        if (digitalCertificateRemoveResponse.isError()) {
            response.setError(true);
            response.setMessage(digitalCertificateRemoveResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(digitalCertificateRemoveResponse);
        }

        return response;
    }

    public List<Map<String, Object>> getStates() {

        FaraboomDigitalCertificateService faraboomDigitalCertificateService = new FaraboomDigitalCertificateService();

        return faraboomDigitalCertificateService.getStates();
    }

    public List<Map<String, Object>> getStateCites(Integer stateCode) {

        FaraboomDigitalCertificateService faraboomDigitalCertificateService = new FaraboomDigitalCertificateService();

        return faraboomDigitalCertificateService.getStateCites(stateCode);
    }

    public List<Map<String, Object>> getNonGovernmentalOrganizationType() {

        FaraboomDigitalCertificateService faraboomDigitalCertificateService = new FaraboomDigitalCertificateService();

        return faraboomDigitalCertificateService.getNonGovernmentalOrganizationType();
    }
}
