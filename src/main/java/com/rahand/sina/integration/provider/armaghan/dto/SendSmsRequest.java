package com.rahand.sina.integration.provider.armaghan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendSmsRequest {

    @JsonProperty("username")
    private String userName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("originator")
    private String senderNumber;
    @JsonProperty("destination")
    private String[] receiverMobileNumbers;
    @JsonProperty("content")
    private String message;
    @JsonProperty("userSuppliedId")
    private Long userSuppliedId;
}
