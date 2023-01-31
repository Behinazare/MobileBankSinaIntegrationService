package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class ChangeChannelPasswordRequest extends BaseRequest {

    private String channelUserName;
    private String channelUserPass;
    private String channelCurrentPassword;
    private String newPassword;
    private String repeatNewPassword;

    private String nationalCode;

    public ChangeChannelPasswordRequest() {
    }


    @Builder
    public ChangeChannelPasswordRequest(String userId, String channelUserName, String channelUserPass, String channelCurrentPassword, String newPassword, String repeatNewPassword, String nationalCode) {
        super(userId);
        this.channelUserName = channelUserName;
        this.channelUserPass = channelUserPass;
        this.channelCurrentPassword = channelCurrentPassword;
        this.newPassword = newPassword;
        this.repeatNewPassword = repeatNewPassword;
        this.nationalCode = nationalCode;
    }

    public String getChannelUserName() {
        return channelUserName;
    }

    public void setChannelUserName(String channelUserName) {
        this.channelUserName = channelUserName;
    }

    public String getChannelUserPass() {
        return channelUserPass;
    }

    public void setChannelUserPass(String channelUserPass) {
        this.channelUserPass = channelUserPass;
    }

    public String getChannelCurrentPassword() {
        return channelCurrentPassword;
    }

    public void setChannelCurrentPassword(String channelCurrentPassword) {
        this.channelCurrentPassword = channelCurrentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getRepeatNewPassword() {
        return repeatNewPassword;
    }

    public void setRepeatNewPassword(String repeatNewPassword) {
        this.repeatNewPassword = repeatNewPassword;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
