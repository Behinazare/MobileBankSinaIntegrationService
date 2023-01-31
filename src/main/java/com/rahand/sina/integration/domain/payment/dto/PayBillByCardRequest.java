package com.rahand.sina.integration.domain.payment.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import lombok.Builder;


public class PayBillByCardRequest extends BaseRequest {

    private String pan;
    private String cvv2;
    private String expireDate;
    private String pin;
    private String billId;
    private String payId;

    private String mobileNumber;

    private String telephoneNumber;

    private BillType billType;


    public PayBillByCardRequest() {
    }

    @Builder
    public PayBillByCardRequest(String userId, String pan, String cvv2, String expireDate, String pin, String billId, String payId, String mobileNumber, String telephoneNumber, BillType billType) {
        super(userId);
        this.pan = pan;
        this.cvv2 = cvv2;
        this.expireDate = expireDate;
        this.pin = pin;
        this.billId = billId;
        this.payId = payId;
        this.mobileNumber = mobileNumber;
        this.telephoneNumber = telephoneNumber;
        this.billType = billType;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }
}
