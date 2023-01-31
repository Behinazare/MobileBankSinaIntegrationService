package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;


public class StatementsResponse extends BaseResponse {

    private List<StatementDto> statements;
    private Integer count;

    public StatementsResponse() {
    }

    @Builder
    public StatementsResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, List<StatementDto> statements, Integer count) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.statements = statements;
        this.count = count;
    }

    public List<StatementDto> getStatements() {
        return statements;
    }

    public void setStatements(List<StatementDto> statements) {
        this.statements = statements;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
