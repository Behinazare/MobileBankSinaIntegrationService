package com.rahand.sina.integration.provider.faraboom.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FaraboomLoginResponse {

    @JsonProperty("session_id")
    private String sessionId;
    @JsonProperty("operation_time")
    private Long operationTime;

}
