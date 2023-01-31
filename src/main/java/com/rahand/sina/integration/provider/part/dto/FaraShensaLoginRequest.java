package com.rahand.sina.integration.provider.part.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class FaraShensaLoginRequest {

    private String system;
    private AuthenticationPack authenticationPack;


    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class AuthenticationPack{

        private String username;
        private String password;
    }
}
