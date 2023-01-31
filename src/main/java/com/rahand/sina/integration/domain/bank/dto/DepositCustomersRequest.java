package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.time.LocalDateTime;


public class DepositCustomersRequest extends BaseRequest {

    private String userName;

    private String password;
    private String depositNumber;
    private boolean attachedSignature;
    private String cif;
    private Long offset;
    private Long length;
    private LocalDateTime validityDate;

    public DepositCustomersRequest() {
    }

    @Builder
    public DepositCustomersRequest(String userId, String userName, String password, String depositNumber, boolean attachedSignature, String cif, Long offset, Long length, LocalDateTime validityDate) {
        super(userId);
        this.userName = userName;
        this.password = password;
        this.depositNumber = depositNumber;
        this.attachedSignature = attachedSignature;
        this.cif = cif;
        this.offset = offset;
        this.length = length;
        this.validityDate = validityDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public boolean isAttachedSignature() {
        return attachedSignature;
    }

    public void setAttachedSignature(boolean attachedSignature) {
        this.attachedSignature = attachedSignature;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public LocalDateTime getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(LocalDateTime validityDate) {
        this.validityDate = validityDate;
    }
}
