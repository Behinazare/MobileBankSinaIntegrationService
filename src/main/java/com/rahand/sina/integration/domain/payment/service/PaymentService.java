package com.rahand.sina.integration.domain.payment.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.sina.integration.domain.payment.dto.*;
import com.rahand.sina.integration.domain.payment.service.spec.Payment;
import com.rahand.sina.integration.provider.yaghut.service.payment.YaghutPaymentService;

public class PaymentService {

    private Payment paymentService;

    public PaymentService() {
        paymentService = new YaghutPaymentService();
    }

    public ResponseDto<CardPaymentResponse> mpgPay(CardPaymentRequest cardPaymentRequest){

        ResponseDto<CardPaymentResponse> response = new ResponseDto<>();
        CardPaymentResponse cardPaymentResponse = paymentService.payByCard(cardPaymentRequest);

        if (cardPaymentResponse.isSessionExpired()){
            cardPaymentResponse = paymentService.payByCard(cardPaymentRequest);
        }

        if (cardPaymentResponse.isError()){
            response.setError(true);
            response.setMessage(cardPaymentResponse.getErrorMessage());
            response.setResponseData(cardPaymentResponse);

        }else {
            response.setError(false);
            response.setResponseData(cardPaymentResponse);
        }

        return response;
    }

    public ResponseDto<DepositPaymentResponse> payByDeposit(DepositPaymentRequest depositPaymentRequest) {

        ResponseDto<DepositPaymentResponse> response = new ResponseDto<>();
        DepositPaymentResponse depositPaymentResponse = paymentService.payByDeposit(depositPaymentRequest);

        if (depositPaymentResponse.isSessionExpired()) {
            depositPaymentResponse = paymentService.payByDeposit(depositPaymentRequest);
        }

        if (depositPaymentResponse.isError()) {
            response.setError(true);
            response.setMessage(depositPaymentResponse.getErrorMessage());
            response.setResponseData(depositPaymentResponse);
        } else {
            response.setError(false);
            response.setResponseData(depositPaymentResponse);
        }

        return response;
    }

    public ResponseDto<PayBillByCardResponse> payBillByCard(PayBillByCardRequest payBillByCardRequest) {

        ResponseDto<PayBillByCardResponse> response = new ResponseDto<>();
        PayBillByCardResponse payBillByCardResponse = paymentService.payBillByCard(payBillByCardRequest);

        if (payBillByCardResponse.isSessionExpired()) {
            payBillByCardResponse = paymentService.payBillByCard(payBillByCardRequest);
        }

        if (payBillByCardResponse.isError()) {
            response.setError(true);
            response.setMessage(payBillByCardResponse.getErrorMessage());
            response.setResponseData(payBillByCardResponse);
        } else {
            response.setError(false);
            response.setResponseData(payBillByCardResponse);
        }

        return response;
    }

    public ResponseDto<PayBillByDepositResponse> payBillByDeposit(PayBillByDepositRequest payBillByDepositRequest) {

        ResponseDto<PayBillByDepositResponse> response = new ResponseDto<>();
        PayBillByDepositResponse payBillByDepositResponse = paymentService.payBillByDeposit(payBillByDepositRequest);

        if (payBillByDepositResponse.isSessionExpired()) {
            payBillByDepositResponse = paymentService.payBillByDeposit(payBillByDepositRequest);
        }

        if (payBillByDepositResponse.isError()) {
            response.setError(true);
            response.setMessage(payBillByDepositResponse.getErrorMessage());
            response.setResponseData(payBillByDepositResponse);
        } else {
            response.setError(false);
            response.setResponseData(payBillByDepositResponse);
        }

        return response;
    }

    public ResponseDto<RollbackTransactionResponse> rollbackTransaction(RollbackTransactionRequest rollbackTransactionRequest) {

        ResponseDto<RollbackTransactionResponse> response = new ResponseDto<>();
        RollbackTransactionResponse rollbackTransactionResponse = paymentService.rollbackTransaction(rollbackTransactionRequest);

        if (rollbackTransactionResponse.isSessionExpired()) {
            rollbackTransactionResponse = paymentService.rollbackTransaction(rollbackTransactionRequest);
        }

        if (rollbackTransactionResponse.isError()) {
            response.setError(true);
            response.setMessage(rollbackTransactionResponse.getErrorMessage());
            response.setResponseData(rollbackTransactionResponse);
        } else {
            response.setError(false);
            response.setResponseData(rollbackTransactionResponse);
        }

        return response;
    }


}
