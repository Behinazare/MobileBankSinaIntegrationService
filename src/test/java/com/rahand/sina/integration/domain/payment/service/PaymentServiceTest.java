package com.rahand.sina.integration.domain.payment.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.sina.integration.domain.payment.dto.*;
import org.junit.Test;

import java.math.BigDecimal;

public class PaymentServiceTest {

    @Test
    public void mpgPay() {

        PaymentService paymentService = new PaymentService();
        CardPaymentRequest cardPaymentRequest = new CardPaymentRequest();
        cardPaymentRequest.setPan("6393461046382780");
        cardPaymentRequest.setCvv2("963");
        cardPaymentRequest.setExpireDate("0604");
        cardPaymentRequest.setPin("3698521");
        cardPaymentRequest.setAmount(new BigDecimal(20000));
        ResponseDto<CardPaymentResponse> responseDto = paymentService.mpgPay(cardPaymentRequest);
        CardPaymentResponse cardPaymentResponse = responseDto.getResponseData();
    }

    @Test
    public void payByDeposit() {

        PaymentService paymentService = new PaymentService();

        DepositPaymentRequest depositPaymentRequest = new DepositPaymentRequest();
        depositPaymentRequest.setAmount(BigDecimal.valueOf(20000));
        depositPaymentRequest.setDepositNumber("119-813-2295556-1");
        depositPaymentRequest.setCif("2295556");
        ResponseDto<DepositPaymentResponse> responseDto = paymentService.payByDeposit(depositPaymentRequest);
        DepositPaymentResponse depositPaymentResponse = responseDto.getResponseData();

    }

    @Test
    public void rollbackTransaction() {

        PaymentService paymentService = new PaymentService();
        RollbackTransactionRequest rollbackTransactionRequest = new RollbackTransactionRequest();
        rollbackTransactionRequest.setReferenceId("00000000020645325027");
        ResponseDto<RollbackTransactionResponse> responseDto = paymentService.rollbackTransaction(rollbackTransactionRequest);
        RollbackTransactionResponse rollbackTransactionResponse = responseDto.getResponseData();
    }

    @Test
    public void payBillByCard() {
        PaymentService paymentService = new PaymentService();
        PayBillByCardRequest payBillByCardRequest = new PayBillByCardRequest();
        payBillByCardRequest.setBillId("11590006639");
        payBillByCardRequest.setPayId("233107758");
        payBillByCardRequest.setPan("6393461046382780");
        payBillByCardRequest.setCvv2("963");
        payBillByCardRequest.setExpireDate("0604");
        payBillByCardRequest.setPin("3698521");
        paymentService.payBillByCard(payBillByCardRequest);

    }

    @Test
    public void payBillByDeposit() {
    }
}