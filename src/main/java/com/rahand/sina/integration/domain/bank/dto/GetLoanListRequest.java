package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GetLoanListRequest extends BaseRequest {

    private String cif;
    private List<String> depositNumbers;
    private LocalDateTime from;
    private LocalDateTime to;
    private BigDecimal average;

}
