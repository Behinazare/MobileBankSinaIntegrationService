package com.rahand.sina.integration.domain.bank.service;

import com.rahand.common.dto.PaymentDataResponse;
import com.rahand.common.dto.ResponseDto;
import com.rahand.common.enums.PaymentMethod;
import com.rahand.common.enums.PaymentTransactionStatus;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.service.spec.Loan;
import com.rahand.sina.integration.provider.yaghut.service.loan.YaghutLoanService;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;

import java.time.LocalDateTime;

public class LoanService {

    private Loan loanService;

    public LoanService() {
        loanService = new YaghutLoanService();
    }

    public ResponseDto<OwnerInquiryResponse> inquiryOtherLoan(OwnerInquiryRequest ownerInquiryRequest) {

        ResponseDto<OwnerInquiryResponse> response = new ResponseDto<>();

        OwnerInquiryResponse ownerInquiryResponse = loanService.inquiryOtherLoan(ownerInquiryRequest);

        if (ownerInquiryResponse.isSessionExpired()) {
            ownerInquiryResponse = loanService.inquiryOtherLoan(ownerInquiryRequest);
        }

        if (ownerInquiryResponse.isError()) {
            response.setError(true);
            response.setMessage(ownerInquiryResponse.getErrorMessage());
            response.setResponseData(ownerInquiryResponse);
        } else {
            response.setError(false);
            response.setResponseData(ownerInquiryResponse);
        }

        return response;
    }

    public ResponseDto<LoanOwnerResponse> getLoanInfo(LoanOwnerRequest loanOwnerRequest) {

        ResponseDto<LoanOwnerResponse> response = new ResponseDto<>();

        LoanOwnerResponse loanOwnerResponse = loanService.getLoanInfo(loanOwnerRequest);

        if (loanOwnerResponse.isSessionExpired()) {
            loanOwnerResponse = loanService.getLoanInfo(loanOwnerRequest);
        }

        if (loanOwnerResponse.isError()) {
            response.setError(true);
            response.setMessage(loanOwnerResponse.getErrorMessage());
            response.setResponseData(loanOwnerResponse);
        } else {
            response.setError(false);
            response.setResponseData(loanOwnerResponse);
        }

        return response;
    }

    public ResponseDto<GetLoansResponse> getLoans(GetLoansRequest getLoansRequest) {

        ResponseDto<GetLoansResponse> response = new ResponseDto<>();

        GetLoansResponse getLoansResponse = loanService.getLoans(getLoansRequest);

        if (getLoansResponse.isSessionExpired()) {
            getLoansResponse = loanService.getLoans(getLoansRequest);
        }

        if (getLoansResponse.isError()) {
            response.setError(true);
            response.setMessage(getLoansResponse.getErrorMessage());
            response.setResponseData(getLoansResponse);
        } else {
            response.setError(false);
            response.setResponseData(getLoansResponse);
        }

        return response;
    }

    public ResponseDto<GetLoansResponse> getLoanList(GetLoansRequest getLoansRequest) {

        ResponseDto<GetLoansResponse> response = new ResponseDto<>();

        GetLoansResponse getLoansResponse = loanService.getLoanList(getLoansRequest);

        if (getLoansResponse.isSessionExpired()) {
            getLoansResponse = loanService.getLoanList(getLoansRequest);
        }

        if (getLoansResponse.isError()) {
            response.setError(true);
            response.setMessage(getLoansResponse.getErrorMessage());
            response.setResponseData(getLoansResponse);
        } else {
            response.setError(false);
            response.setResponseData(getLoansResponse);
        }

        return response;
    }

    public ResponseDto<ChangeLoanAutoPaymentDepositResponse> changeLoanAutoPaymentDeposit(ChangeLoanAutoPaymentDepositRequest changeLoanAutoPaymentDepositRequest) {

        ResponseDto<ChangeLoanAutoPaymentDepositResponse> response = new ResponseDto<>();

        ChangeLoanAutoPaymentDepositResponse changeLoanAutoPaymentDepositResponse = loanService.changeLoanAutoPaymentDeposit(changeLoanAutoPaymentDepositRequest);

        if (changeLoanAutoPaymentDepositResponse.isSessionExpired()) {
            changeLoanAutoPaymentDepositResponse = loanService.changeLoanAutoPaymentDeposit(changeLoanAutoPaymentDepositRequest);
        }

        if (changeLoanAutoPaymentDepositResponse.isError()) {
            response.setError(true);
            response.setMessage(changeLoanAutoPaymentDepositResponse.getErrorMessage());
            response.setResponseData(changeLoanAutoPaymentDepositResponse);
        } else {
            response.setError(false);
            response.setResponseData(changeLoanAutoPaymentDepositResponse);
        }

        return response;
    }

    public ResponseDto<LoanDetailResponse> getLoanDetail(LoanDetailRequest loanDetailRequest) {

        ResponseDto<LoanDetailResponse> response = new ResponseDto<>();

        LoanDetailResponse loanDetailResponse = loanService.getLoanDetail(loanDetailRequest);

        if (loanDetailResponse.isSessionExpired()) {
            loanDetailResponse = loanService.getLoanDetail(loanDetailRequest);
        }

        if (loanDetailResponse.isError()) {
            response.setError(true);
            response.setMessage(loanDetailResponse.getErrorMessage());
            response.setResponseData(loanDetailResponse);
        } else {
            response.setError(false);
            response.setResponseData(loanDetailResponse);
        }

        return response;
    }

    public ResponseDto<PayLoanResponse> payLoanInstallment(PayLoanRequest payLoanRequest) {

        ResponseDto<PayLoanResponse> response = new ResponseDto<>();
        PayLoanResponse payLoanResponse = new PayLoanResponse();

        PaymentMethod paymentMethod = CommonUtil.getPaymentData(payLoanRequest.getInputPaymentJson()).getPaymentMethod();

        if (paymentMethod.equals(PaymentMethod.DEPOSIT)) {

            PaymentDataResponse<PaymentDataResponse.DepositPaymentData> paymentDataResponse = CommonUtil.getPaymentData(payLoanRequest.getInputPaymentJson());

            PayLoanByDepositRequest payLoanByDepositRequest = new PayLoanByDepositRequest();
            payLoanByDepositRequest.setLoanNumber(payLoanRequest.getLoanNumber());
            payLoanByDepositRequest.setAmount(payLoanRequest.getAmount());
            payLoanByDepositRequest.setCustomDepositNumber(paymentDataResponse.getPaymentData().getDepositNumber());

            PayLoanByDepositResponse payLoanByDepositResponse = loanService.payLoanByDeposit(payLoanByDepositRequest);

            if (payLoanByDepositResponse.isSessionExpired()) {
                payLoanByDepositResponse = loanService.payLoanByDeposit(payLoanRequest.getPayLoanByDepositRequest());
            }

            if (payLoanByDepositResponse.isError()) {
                response.setError(true);
                response.setMessage(payLoanByDepositResponse.getErrorMessage());

            } else {
                response.setError(false);

                payLoanResponse.setPaymentTransactionStatus(PaymentTransactionStatus.SUCCESSFUL);
                payLoanResponse.setPaymentMethod(paymentMethod);
                payLoanResponse.setAmount(payLoanByDepositResponse.getAppliedAmount());
                payLoanResponse.setTransactionDate(LocalDateTime.now());
                payLoanResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(payLoanResponse.getTransactionDate()));
                payLoanResponse.setTrackNumber(payLoanByDepositResponse.getDocumentNumber());
                payLoanResponse.setTrackerId(payLoanByDepositResponse.getTrackerId());
                payLoanResponse.setRrn(YaghutUtil.generateRRN());
                payLoanResponse.setSource(payLoanByDepositRequest.getCustomDepositNumber());
                payLoanResponse.setTitle(payLoanRequest.getTitle());
                payLoanResponse.setInformation(payLoanRequest.getInformation());
                payLoanResponse.setLoanNumber(payLoanRequest.getLoanNumber());
                payLoanResponse.setDefaultReceipt(payLoanResponse.getReceipt());

                response.setResponseData(payLoanResponse);

            }

        } else if (paymentMethod.equals(PaymentMethod.BANK_CARD_MPG)) {

            PaymentDataResponse<PaymentDataResponse.CardPaymentData> paymentDataResponse = CommonUtil.getPaymentData(payLoanRequest.getInputPaymentJson());

            PayLoanByCardRequest payLoanByCardRequest = new PayLoanByCardRequest();
            payLoanByCardRequest.setLoanNumber(payLoanRequest.getLoanNumber());
            payLoanByCardRequest.setAmount(payLoanRequest.getAmount());
            payLoanByCardRequest.setPan(paymentDataResponse.getPaymentData().getPan());
            payLoanByCardRequest.setExpireDate(paymentDataResponse.getPaymentData().getExpireDate());
            payLoanByCardRequest.setCvv2(paymentDataResponse.getPaymentData().getCvv2());
            payLoanByCardRequest.setPin(paymentDataResponse.getPaymentData().getPin());


            PayLoanByCardResponse payLoanByCardResponse = loanService.payLoanByCard(payLoanByCardRequest);

            if (payLoanByCardResponse.isSessionExpired()) {
                payLoanByCardResponse = loanService.payLoanByCard(payLoanRequest.getPayLoanByCardRequest());
            }

            if (payLoanByCardResponse.isError()) {
                response.setError(true);
                response.setMessage(payLoanByCardResponse.getErrorMessage());
            } else {
                response.setError(false);

                payLoanResponse.setPaymentTransactionStatus(PaymentTransactionStatus.SUCCESSFUL);
                payLoanResponse.setPaymentMethod(paymentMethod);
                payLoanResponse.setAmount(payLoanRequest.getAmount());
                payLoanResponse.setTransactionDate(payLoanByCardResponse.getPaymentDate());
                payLoanResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(payLoanResponse.getTransactionDate()));
                payLoanResponse.setTrackNumber(payLoanByCardResponse.getTrackingNumber());
                payLoanResponse.setRrn(payLoanByCardResponse.getRrn());
                payLoanResponse.setTrackerId(payLoanByCardResponse.getTrackerId());
                payLoanResponse.setSource(payLoanByCardResponse.getSourcePan());
                payLoanResponse.setTitle(payLoanRequest.getTitle());
                payLoanResponse.setInformation(payLoanRequest.getInformation());
                payLoanResponse.setLoanNumber(payLoanRequest.getLoanNumber());
                payLoanResponse.setDefaultReceipt(payLoanResponse.getReceipt());

                response.setResponseData(payLoanResponse);
            }

        } else {
            response.setError(true);
            response.setMessage("روش  پرداخت غیرفعال است یا خطایی در ارتباط با سرور رخ داده است");
        }

        return response;
    }

    public void initLoanValidation(LoanValidationRequest loanValidationRequest) {

    }

}
