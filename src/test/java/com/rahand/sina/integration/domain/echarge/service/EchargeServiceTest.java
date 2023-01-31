package com.rahand.sina.integration.domain.echarge.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.common.enums.PaymentMethod;
import com.rahand.sina.integration.domain.echarge.dto.*;
import com.rahand.sina.integration.domain.echarge.enums.EchargProvider;
import com.rahand.sina.integration.domain.echarge.enums.EchargeOperator;
import com.rahand.sina.integration.domain.echarge.enums.EchargeType;
import com.rahand.sina.integration.domain.payment.dto.CardPaymentRequest;
import com.rahand.sina.integration.domain.payment.dto.DepositPaymentRequest;
import org.junit.Test;

import java.math.BigDecimal;


public class EchargeServiceTest {

    @Test
    public void buyCharge() {
        PaymentMethod paymentMethod = PaymentMethod.BANK_CARD_MPG;
        EchargeService echargeService = new EchargeService(EchargProvider.YAGHUT);
        BuyChargeRequest buyChargeRequest = new BuyChargeRequest();
        BigDecimal amount = new BigDecimal(20000);
        String mobileNumber = "09226054364";
        buyChargeRequest.setAmount(amount);
        buyChargeRequest.setMobileNumber(mobileNumber);
        buyChargeRequest.setPayerMobileNumber("09226054364");

        if (PaymentMethod.BANK_CARD_MPG.equals(paymentMethod)) {

            buyChargeRequest.setPaymentMethod(paymentMethod);

            CardPaymentRequest cardPaymentRequest = new CardPaymentRequest();
            cardPaymentRequest.setPan("6393461046382780");
            cardPaymentRequest.setCvv2("686");
            cardPaymentRequest.setExpireDate("0604");
            cardPaymentRequest.setPin("492272470");
            cardPaymentRequest.setAmount(amount);

            buyChargeRequest.setCardPaymentRequest(cardPaymentRequest);

        } else if (PaymentMethod.DEPOSIT.equals(paymentMethod)) {

            buyChargeRequest.setPaymentMethod(paymentMethod);

            DepositPaymentRequest depositPaymentRequest = new DepositPaymentRequest();
            depositPaymentRequest.setDepositNumber("119-813-2618257-1");
            buyChargeRequest.setDepositPaymentRequest(depositPaymentRequest);

        }

        ResponseDto<BuyChargeResponse> responseDto = echargeService.buyCharge(buyChargeRequest);
        BuyChargeResponse buyChargeResponse = responseDto.getResponseData();

    }

    @Test
    public void getInternetPackageList() {
        EchargeService echargeService = new EchargeService(EchargProvider.RAYANMEHER);
        GetInternetPackageRequest getInternetPackageRequest = new GetInternetPackageRequest();
        getInternetPackageRequest.setEchargeType(EchargeType.CREDIT);
        getInternetPackageRequest.setEchargeOperator(EchargeOperator.RITL);
        ResponseDto<GetInternetPackageResponse> responseDto = echargeService.getInternetPackageList(getInternetPackageRequest);
        GetInternetPackageResponse getInternetPackageResponse = responseDto.getResponseData();
        getInternetPackageResponse.getInternetPackageContainerJson();
    }

    @Test
    public void buyInternetPackage() {
        PaymentMethod paymentMethod = PaymentMethod.BANK_CARD_MPG;
        EchargeService echargeService = new EchargeService(EchargProvider.RAYANMEHER);
        BuyInternetPackageRequest buyInternetPackageRequest = new BuyInternetPackageRequest();
        BigDecimal amount = new BigDecimal(15260);
        String mobileNumber = "09226054364";
        buyInternetPackageRequest.setAmount(amount);
        buyInternetPackageRequest.setMobileNumber(mobileNumber);
        buyInternetPackageRequest.setProductId("1884");
        buyInternetPackageRequest.setPayerMobileNumber("09226054364");

        if (PaymentMethod.BANK_CARD_MPG.equals(paymentMethod)) {

            buyInternetPackageRequest.setPaymentMethod(paymentMethod);

            CardPaymentRequest cardPaymentRequest = new CardPaymentRequest();
            cardPaymentRequest.setPan("6393461046382798");
            cardPaymentRequest.setCvv2("498");
            cardPaymentRequest.setExpireDate("0605");
            cardPaymentRequest.setPin("497323913");
            cardPaymentRequest.setAmount(amount);

            buyInternetPackageRequest.setCardPaymentRequest(cardPaymentRequest);

        } else if (PaymentMethod.DEPOSIT.equals(paymentMethod)) {

            buyInternetPackageRequest.setPaymentMethod(paymentMethod);

            DepositPaymentRequest depositPaymentRequest = new DepositPaymentRequest();
            depositPaymentRequest.setDepositNumber("119-813-2618257-1");
            depositPaymentRequest.setCif("2618257");
            depositPaymentRequest.setAmount(amount);
            buyInternetPackageRequest.setDepositPaymentRequest(depositPaymentRequest);

        }

        ResponseDto<BuyInternetPackageResponse> responseDto = echargeService.buyInternetPackage(buyInternetPackageRequest);
        BuyInternetPackageResponse buyInternetPackageResponse = responseDto.getResponseData();

    }

}