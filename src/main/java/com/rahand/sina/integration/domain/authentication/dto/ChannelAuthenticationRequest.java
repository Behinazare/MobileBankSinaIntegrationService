package com.rahand.sina.integration.domain.authentication.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;


public class ChannelAuthenticationRequest extends BaseRequest {

    private String userName;
    private String password;
    private String nationalCode;
    private String cif;

    public ChannelAuthenticationRequest() {
    }

    @Builder
    public ChannelAuthenticationRequest(String userId, String userName, String password, String nationalCode, String cif) {
        super(userId);
        this.userName = userName;
        this.password = password;
        this.nationalCode = nationalCode;
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

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}
