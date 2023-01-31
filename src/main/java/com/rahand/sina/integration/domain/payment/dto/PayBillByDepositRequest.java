package com.rahand.sina.integration.domain.payment.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import lombok.Builder;


public class PayBillByDepositRequest extends BaseRequest {

    private String depositNumber;
    private String cif;
    private String billId;
    private String payId;

    private String mobileNumber;

    private String telephoneNumber;

    private BillType billType;


    public PayBillByDepositRequest() {
    }

    @Builder
    public PayBillByDepositRequest(String userId, String depositNumber, String cif, String billId, String payId, String mobileNumber, String telephoneNumber, BillType billType) {
        super(userId);
        this.depositNumber = depositNumber;
        this.cif = cif;
        this.billId = billId;
        this.payId = payId;
        this.mobileNumber = mobileNumber;
        this.telephoneNumber = telephoneNumber;
        this.billType = billType;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
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
