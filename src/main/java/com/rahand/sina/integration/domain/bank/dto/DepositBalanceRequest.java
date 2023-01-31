package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;


public class DepositBalanceRequest extends BaseRequest {

    private String userName;

    private String password;
    private String depositNumber;
    private String cif;

    public DepositBalanceRequest() {
    }

    public DepositBalanceRequest(String userId, String userName, String password, String depositNumber, String cif) {
        super(userId);
        this.userName = userName;
        this.password = password;
        this.depositNumber = depositNumber;
        this.cif = cif;
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

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}
