package com.rahand.sina.integration.domain.bank.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.sina.integration.domain.bank.dto.GetBankRequest;
import com.rahand.sina.integration.domain.bank.dto.GetBanksResponse;
import com.rahand.sina.integration.domain.bank.dto.GetBranchRequest;
import com.rahand.sina.integration.domain.bank.dto.GetBranchResponse;
import com.rahand.sina.integration.domain.bank.service.spec.General;
import com.rahand.sina.integration.provider.yaghut.service.general.YaghutGeneralService;

public class GeneralBankService {

    private General generalService;

    public GeneralBankService() {
        generalService = new YaghutGeneralService();
    }

    public ResponseDto<GetBanksResponse> getBanksInfo(GetBankRequest getBankRequest) {

        ResponseDto<GetBanksResponse> response = new ResponseDto<>();
        GetBanksResponse getBanksResponse = generalService.getBanksInfo(getBankRequest);

        if (getBanksResponse.isError()) {
            response.setError(true);
            response.setMessage(getBanksResponse.getErrorMessage());
            response.setResponseData(getBanksResponse);
        } else {
            response.setError(false);
            response.setResponseData(getBanksResponse);
        }
        return response;
    }

    public ResponseDto<GetBranchResponse> getBranchInfo(GetBranchRequest getBranchRequest) {

        ResponseDto<GetBranchResponse> response = new ResponseDto<>();
        GetBranchResponse getBranchResponse = generalService.getBranchInfo(getBranchRequest);

        if (getBranchResponse.isSessionExpired()) {
            getBranchResponse = generalService.getBranchInfo(getBranchRequest);
        }

        if (getBranchResponse.isError()) {
            response.setError(true);
            response.setMessage(getBranchResponse.getErrorMessage());
            response.setResponseData(getBranchResponse);
        } else {
            response.setError(false);
            response.setResponseData(getBranchResponse);
        }

        return response;
    }

}
