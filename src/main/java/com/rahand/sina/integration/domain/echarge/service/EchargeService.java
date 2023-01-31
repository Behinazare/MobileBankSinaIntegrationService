package com.rahand.sina.integration.domain.echarge.service;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ResponseDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.echarge.dto.*;
import com.rahand.sina.integration.domain.echarge.enums.EchargProvider;
import com.rahand.sina.integration.domain.echarge.service.spec.Echarge;
import com.rahand.sina.integration.provider.rayanmehr.service.RayanMehrEcharge;
import com.rahand.sina.integration.provider.yaghut.service.echarge.YaghutEchargeService;

public class EchargeService {

    private Echarge echargeService;
    private EchargProvider echargProvider;

    public EchargeService(EchargProvider echargProvider) {
        this.echargProvider = echargProvider;
        getService(echargProvider);
    }

    public void getService(EchargProvider echargProvider) {

        if (echargProvider.equals(EchargProvider.YAGHUT)) {
            echargeService = new YaghutEchargeService();
        } else if (echargProvider.equals(EchargProvider.RAYANMEHER)) {
            echargeService = new RayanMehrEcharge();
        } else {
            CommonUtil.logError(getClass().getSimpleName(), "getService", "Invalid EchargProvider");
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }
    }


    public ResponseDto<BuyChargeResponse> buyCharge(BuyChargeRequest buyChargeRequest) {

        ResponseDto<BuyChargeResponse> response = new ResponseDto<>();
        BuyChargeResponse buyChargeResponse = echargeService.buyCharge(buyChargeRequest);

        if (buyChargeResponse.isSessionExpired()) {
            buyChargeResponse = echargeService.buyCharge(buyChargeRequest);
        }

        if (buyChargeResponse.isError()) {
            response.setError(true);
            response.setMessage(buyChargeResponse.getErrorMessage());
            response.setResponseData(buyChargeResponse);

        } else {
            response.setError(false);
            response.setResponseData(buyChargeResponse);
        }

        return response;
    }

    public ResponseDto<GetInternetPackageResponse> getInternetPackageList(GetInternetPackageRequest getInternetPackageRequest) {

        ResponseDto<GetInternetPackageResponse> response = new ResponseDto<>();
        GetInternetPackageResponse getInternetPackageResponse = echargeService.getInternetPackageList(getInternetPackageRequest);

        if (getInternetPackageResponse.isError()) {
            response.setError(true);
            response.setMessage(getInternetPackageResponse.getErrorMessage());
            response.setResponseData(getInternetPackageResponse);

        } else {
            response.setError(false);
            response.setResponseData(getInternetPackageResponse);
        }

        return response;
    }

    public ResponseDto<BuyInternetPackageResponse> buyInternetPackage(BuyInternetPackageRequest buyInternetPackageRequest) {

        ResponseDto<BuyInternetPackageResponse> response = new ResponseDto<>();

        BuyInternetPackageResponse buyInternetPackageResponse = echargeService.buyInternetPackage(buyInternetPackageRequest);
        if (buyInternetPackageResponse.isError()) {
            response.setError(true);
            response.setMessage(buyInternetPackageResponse.getErrorMessage());
            response.setResponseData(buyInternetPackageResponse);

        } else {
            response.setError(false);
            response.setResponseData(buyInternetPackageResponse);
        }

        return response;
    }
}
