package com.rahand.sina.integration.domain.authentication.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoginResponseBean;
import lombok.Builder;


public class ChannelAuthenticationResponse extends BaseResponse {

    private boolean channelUser;

    private String code;

    private String name;

    private String cif;
    private LoginResponseBean loginResponseBean;


    public ChannelAuthenticationResponse() {
    }

    @Builder
    public ChannelAuthenticationResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean channelUser, String code, String name, String cif, LoginResponseBean loginResponseBean) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.channelUser = channelUser;
        this.code = code;
        this.name = name;
        this.cif = cif;
        this.loginResponseBean = loginResponseBean;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public boolean isChannelUser() {
        return channelUser;
    }

    public void setChannelUser(boolean channelUser) {
        this.channelUser = channelUser;
    }

    public LoginResponseBean getLoginResponseBean() {
        return loginResponseBean;
    }

    public void setLoginResponseBean(LoginResponseBean loginResponseBean) {
        this.loginResponseBean = loginResponseBean;
    }
}
