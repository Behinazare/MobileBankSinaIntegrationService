package com.rahand.sina.integration.provider.tefas.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rahand.common.dto.BaseResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenResponse extends BaseResponse {

    @JsonProperty(value = "apiUserName")
    private String apiUserName;
    @JsonProperty(value = "token", required = true)
    private String token;

    public String getApiUserName() {
        return apiUserName;
    }

    public void setApiUserName(String apiUserName) {
        this.apiUserName = apiUserName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
