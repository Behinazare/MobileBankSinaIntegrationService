package com.rahand.sina.integration.domain.bank.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.sina.integration.domain.bank.dto.GetBankRequest;
import com.rahand.sina.integration.domain.bank.dto.GetBanksResponse;
import com.rahand.sina.integration.domain.bank.dto.GetBranchRequest;
import com.rahand.sina.integration.domain.bank.dto.GetBranchResponse;
import org.junit.Test;

public class GeneralBankServiceTest {

    @Test
    public void getBanksInfo() {

        GeneralBankService generalBankService = new GeneralBankService();
        GetBankRequest getBankRequest = new GetBankRequest();
        getBankRequest.setLength(1000l);
        getBankRequest.setOffset(0l);
        ResponseDto<GetBanksResponse> responseDto = generalBankService.getBanksInfo(getBankRequest);
        GetBanksResponse getBanksResponse = responseDto.getResponseData();

    }

    @Test
    public void getBranchInfo() {

        GeneralBankService generalBankService = new GeneralBankService();
        GetBranchRequest getBranchRequest = new GetBranchRequest();
        getBranchRequest.setOffset(0l);
        getBranchRequest.setLength(1000l);
        ResponseDto<GetBranchResponse> responseDto = generalBankService.getBranchInfo(getBranchRequest);
        GetBranchResponse getBranchResponse = responseDto.getResponseData();

    }
}