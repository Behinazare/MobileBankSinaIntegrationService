package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseDto;
import lombok.Builder;


public class BankInfo extends BaseDto {

    private String bankName;
    private String bankCode;

    public BankInfo() {
    }

    @Builder
    public BankInfo(String bankName, String bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
