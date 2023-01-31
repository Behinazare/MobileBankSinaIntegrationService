package com.rahand.sina.integration.domain.payment.service;

import com.rahand.common.dto.PaymentMethodConfigRequest;
import com.rahand.common.dto.PaymentMethodConfigResponse;
import com.rahand.common.enums.PaymentMethod;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.payment.dto.PaymentRequest;
import com.rahand.sina.integration.domain.payment.dto.PaymentResponse;
import com.rahand.sina.integration.domain.payment.dto.RollBackPayRequest;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComprehensivePayServiceTest {

    @Test
    public void pay() {
        String card = "{\"paymentType\":\"mpg\",\"paymentData\":{\"pan\":\"6393461046382780\",\"pin2\":\"492272470\",\"cvv2\":\"686\",\"expireDate\":\"0604\"}}";
        String deposit = "{\"paymentType\":\"deposit\",\"paymentData\":{\"depositNumber\":\"119-813-2295556-1\",\"securityCode\":\"\",\"cif\":\"2295556\"}}";
        String wallet = "{\"paymentType\":\"wallet\",\"paymentData\":{\"pan\":\"WL9226054364\",\"password\":\"123456\"}}";

        ComprehensivePayService comprehensivePayService = new ComprehensivePayService();
        PaymentRequest paymentRequest = PaymentRequest.builder()

                .paymentDataJson(wallet)
                .paymentServiceId("35")
                .amount(BigDecimal.valueOf(50000))
                .title("شارژ کیف پول")
                .information("رضا قاسمپور")
                .build();

        paymentRequest.setUserId("9226054364");

        PaymentResponse paymentResponse = comprehensivePayService.pay(paymentRequest);

        paymentResponse.getPaymentTransactionStatus().getId();
        CommonUtil.convertToGregorianDate(paymentResponse.getTransactionDate());
        paymentResponse.getTrackerId();
        paymentResponse.getTrackNumber();
        paymentResponse.getTransactionDate();
        if (paymentResponse.isError()){

        }else {

        }
        System.out.println(paymentResponse.getDefaultReceipt());

    }

    @Test
    public void rollBack() {
       ComprehensivePayService comprehensivePayService = new ComprehensivePayService();
        RollBackPayRequest rollBackPayRequest = new RollBackPayRequest();
        rollBackPayRequest.setPaymentMethod(PaymentMethod.WALLET);
        rollBackPayRequest.setTrackerId("76513279");
        comprehensivePayService.rollBack(rollBackPayRequest);
    }

    @Test
    public void getPaymentMethodConfig() {

        List<PaymentMethod> paymentMethods = new ArrayList<>();
        paymentMethods.add(PaymentMethod.BANK_CARD_IPG);

        PaymentMethodConfigRequest paymentMethodConfigRequest = PaymentMethodConfigRequest.builder()
                .userId("9125729214")
                .activePaymentMethods(paymentMethods)
                .ipgUrl("www.google.com")
                .build();

        ComprehensivePayService comprehensivePaymentService = new ComprehensivePayService();
        PaymentMethodConfigResponse paymentMethodConfigResponse = comprehensivePaymentService.getPaymentMethodConfig(paymentMethodConfigRequest);

            paymentMethodConfigResponse.setContainerJson();
    }
}