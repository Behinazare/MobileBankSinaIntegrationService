package com.rahand.sina.integration.provider.part.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rahand.common.dto.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class FaraShensaLoginResponse extends BaseResponse {

    private String token;
    private LocalDateTime expireDate;



}
