package com.rahand.sina.integration.provider.part.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FaraShenasaBaseErrorResponse{

    @JsonProperty("data")
    private Data data;
    @JsonProperty("meta")
    private Meta meta;


    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Data{

        @JsonProperty("message")
        private Message message;

        @JsonIgnoreProperties(ignoreUnknown = true)
        @lombok.Data
        @Builder
        @AllArgsConstructor
        @NoArgsConstructor
        public static class Message{
            @JsonProperty("fa")
            private String fa;
            @JsonProperty("en")
            private String en;
        }

    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    @lombok.Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Meta{

        @JsonProperty("code")
        private String code;
        @JsonProperty("sourceType")
        private String sourceType;

        @JsonProperty("sourceName")
        private String sourceName;

        @JsonProperty("version")
        private String version;

        @JsonProperty("shansiDate")
        private String date;

        @JsonProperty("requestId")
        private String requestId;
    }

}
