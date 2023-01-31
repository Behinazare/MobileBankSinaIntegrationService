package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.bank.enums.SecurityTicketServiceType;

import java.math.BigDecimal;

public class GenerateSecurityTicketRequest extends BaseRequest {

    private SecurityTicketServiceType securityTicketServiceType;
    private BigDecimal amount;
    private String additionalInformation;

}
