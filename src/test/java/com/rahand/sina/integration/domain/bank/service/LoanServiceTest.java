package com.rahand.sina.integration.domain.bank.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.enums.LoanStatus;
import org.junit.Test;

import java.math.BigDecimal;

public class LoanServiceTest {

    @Test
    public void inquiryOtherLoan() {

        LoanService loanService = new LoanService();
        OwnerInquiryRequest ownerInquiryRequest = new OwnerInquiryRequest();
        ownerInquiryRequest.setLoanNumber("396.115.2295556.1");
        ResponseDto<OwnerInquiryResponse> response = loanService.inquiryOtherLoan(ownerInquiryRequest);
        OwnerInquiryResponse ownerInquiryResponse = response.getResponseData();
    }

    @Test
    public void getLoanInfo() {
        LoanService loanService = new LoanService();
        LoanOwnerRequest loanOwnerRequest = new LoanOwnerRequest();
        loanOwnerRequest.setLoanNumber("396.115.2295556.1");
        ResponseDto<LoanOwnerResponse> response = loanService.getLoanInfo(loanOwnerRequest);
        LoanOwnerResponse loanOwnerResponse = response.getResponseData();
    }

    @Test
    public void getLoans() {

        LoanService loanService = new LoanService();
        GetLoansRequest getLoansRequest = new GetLoansRequest();
        getLoansRequest.setCif("2295556");
        getLoansRequest.setLoanStatus(LoanStatus.ACTIVE);
        ResponseDto<GetLoansResponse> response = loanService.getLoans(getLoansRequest);
        GetLoansResponse getLoansResponse = response.getResponseData();
        String json = getLoansResponse.getLoansJson();
    }

    @Test
    public void getLoanList() {

        LoanService loanService = new LoanService();
        GetLoansRequest getLoansRequest = new GetLoansRequest();
        getLoansRequest.setCif("396.115.2295556.1");
        ResponseDto<GetLoansResponse> response = loanService.getLoanList(getLoansRequest);
        GetLoansResponse getLoansResponse = response.getResponseData();
    }

    @Test
    public void changeLoanAutoPaymentDeposit() {
        LoanService loanService = new LoanService();
        ChangeLoanAutoPaymentDepositRequest changeLoanAutoPaymentDepositRequest = new ChangeLoanAutoPaymentDepositRequest();
        changeLoanAutoPaymentDepositRequest.setLoanNumber("");
        changeLoanAutoPaymentDepositRequest.setDepositNumber("");
        ResponseDto<ChangeLoanAutoPaymentDepositResponse> response = loanService.changeLoanAutoPaymentDeposit(changeLoanAutoPaymentDepositRequest);
        ChangeLoanAutoPaymentDepositResponse changeLoanAutoPaymentDepositResponse = response.getResponseData();
    }

    @Test
    public void getLoanDetail() {

        LoanService loanService = new LoanService();
        LoanDetailRequest loanDetailRequest = new LoanDetailRequest();
        loanDetailRequest.setLoanNumber("396.604.2295556.19");
        loanDetailRequest.setHasDetail(true);
        ResponseDto<LoanDetailResponse> response = loanService.getLoanDetail(loanDetailRequest);
        LoanDetailResponse loanDetailResponse = response.getResponseData();
        String json = loanDetailResponse.getLoanDetailJson();

    }

    @Test
    public void payLoanInstallment() {

        LoanService loanService = new LoanService();

        PayLoanRequest payLoanRequest = new PayLoanRequest();
        payLoanRequest.setLoanNumber("396.115.2295556.1");
        payLoanRequest.setAmount(BigDecimal.valueOf(3000000));
        payLoanRequest.setInputPaymentJson("{\n" +
                "   \"paymentType\":\"mpg\",\n" +
                "   \"paymentData\":{\n" +
                "      \"pan\":\"6393461046382780\",\n" +
                "      \"pin2\":\"492272470\",\n" +
                "      \"cvv2\":\"686\",\n" +
                "      \"expireDate\":\"0604\",\n" +
                "      \"customerName\":\"مريمايلخاني\"\n" +
                "   }\n" +
                "}");
        ResponseDto<PayLoanResponse> response = loanService.payLoanInstallment(payLoanRequest);
        PayLoanResponse payLoanResponse = response.getResponseData();

    }
}