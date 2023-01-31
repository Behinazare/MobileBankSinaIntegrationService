package com.rahand.sina.integration.domain.echarge.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.common.enums.PaymentMethod;
import com.rahand.sina.integration.domain.digitalcredit.dto.DigitalCreditPaymentExtraInfo;
import com.rahand.sina.integration.domain.digitalcredit.dto.DigitalCreditPaymentRequest;
import com.rahand.sina.integration.domain.payment.dto.CardPaymentRequest;
import com.rahand.sina.integration.domain.payment.dto.DepositPaymentRequest;
import com.rahand.sina.lib.wallet.dto.PayWalletRequest;
import lombok.Builder;

import java.math.BigDecimal;


public class BuyInternetPackageRequest extends BaseRequest {

    private String paymentDataJson;
    private PaymentMethod paymentMethod;
    private String productId;
    private String productName;
    private String mobileNumber;
    private String payerMobileNumber;
    private BigDecimal amount;
    private CardPaymentRequest cardPaymentRequest;
    private DepositPaymentRequest depositPaymentRequest;
    private PayWalletRequest payWalletRequest;
    private DigitalCreditPaymentRequest digitalCreditPaymentRequest;
    private DigitalCreditPaymentExtraInfo digitalCreditPaymentExtraInfo;


    public BuyInternetPackageRequest() {
    }

    @Builder
    public BuyInternetPackageRequest(String userId, String paymentDataJson, PaymentMethod paymentMethod, String productId, String productName, String mobileNumber, String payerMobileNumber, BigDecimal amount, CardPaymentRequest cardPaymentRequest, DepositPaymentRequest depositPaymentRequest, PayWalletRequest payWalletRequest, DigitalCreditPaymentRequest digitalCreditPaymentRequest, DigitalCreditPaymentExtraInfo digitalCreditPaymentExtraInfo) {
        super(userId);
        this.paymentDataJson = paymentDataJson;
        this.paymentMethod = paymentMethod;
        this.productId = productId;
        this.productName = productName;
        this.mobileNumber = mobileNumber;
        this.payerMobileNumber = payerMobileNumber;
        this.amount = amount;
        this.cardPaymentRequest = cardPaymentRequest;
        this.depositPaymentRequest = depositPaymentRequest;
        this.payWalletRequest = payWalletRequest;
        this.digitalCreditPaymentRequest = digitalCreditPaymentRequest;
        this.digitalCreditPaymentExtraInfo = digitalCreditPaymentExtraInfo;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPayerMobileNumber() {
        return payerMobileNumber;
    }

    public void setPayerMobileNumber(String payerMobileNumber) {
        this.payerMobileNumber = payerMobileNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public CardPaymentRequest getCardPaymentRequest() {
        return cardPaymentRequest;
    }

    public void setCardPaymentRequest(CardPaymentRequest cardPaymentRequest) {
        this.cardPaymentRequest = cardPaymentRequest;
    }

    public DepositPaymentRequest getDepositPaymentRequest() {
        return depositPaymentRequest;
    }

    public void setDepositPaymentRequest(DepositPaymentRequest depositPaymentRequest) {
        this.depositPaymentRequest = depositPaymentRequest;
    }

    public PayWalletRequest getPayWalletRequest() {
        return payWalletRequest;
    }

    public void setPayWalletRequest(PayWalletRequest payWalletRequest) {
        this.payWalletRequest = payWalletRequest;
    }

    public String getPaymentDataJson() {
        return paymentDataJson;
    }

    public void setPaymentDataJson(String paymentDataJson) {
        this.paymentDataJson = paymentDataJson;
    }

    public DigitalCreditPaymentRequest getDigitalCreditPaymentRequest() {
        return digitalCreditPaymentRequest;
    }

    public void setDigitalCreditPaymentRequest(DigitalCreditPaymentRequest digitalCreditPaymentRequest) {
        this.digitalCreditPaymentRequest = digitalCreditPaymentRequest;
    }

    public DigitalCreditPaymentExtraInfo getDigitalCreditPaymentExtraInfo() {
        return digitalCreditPaymentExtraInfo;
    }

    public void setDigitalCreditPaymentExtraInfo(DigitalCreditPaymentExtraInfo digitalCreditPaymentExtraInfo) {
        this.digitalCreditPaymentExtraInfo = digitalCreditPaymentExtraInfo;
    }
}
