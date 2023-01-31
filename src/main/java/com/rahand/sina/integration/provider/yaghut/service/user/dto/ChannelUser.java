package com.rahand.sina.integration.provider.yaghut.service.user.dto;

import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoginResponseBean;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChannelUser {

    private String userName;
    private String sessionId;
    private Long sessionCreateTime;
    private Long sessionValidTime;
    private boolean sessionValid;
    private LoginResponseBean loginResponseBean;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Long getSessionCreateTime() {
        return sessionCreateTime;
    }

    public void setSessionCreateTime(Long sessionCreateTime) {
        this.sessionCreateTime = sessionCreateTime;
    }

    public Long getSessionValidTime() {
        return sessionValidTime;
    }

    public void setSessionValidTime(Long sessionValidTime) {
        this.sessionValidTime = sessionValidTime;
    }

    public boolean isSessionValid() {
        return sessionValid;
    }

    public void setSessionValid(boolean sessionValid) {
        this.sessionValid = sessionValid;
    }

    public LoginResponseBean getLoginResponseBean() {
        return loginResponseBean;
    }

    public void setLoginResponseBean(LoginResponseBean loginResponseBean) {
        this.loginResponseBean = loginResponseBean;
    }
}
