package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.bank.enums.GetStatementsAction;
import lombok.Builder;

import java.time.LocalDateTime;


public class StatementsRequest extends BaseRequest {

    private String depositNumber;
    private String cif;
    private GetStatementsAction action;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private Long length;
    private Long offset;

    public StatementsRequest() {
    }

    @Builder
    public StatementsRequest(String userId, String depositNumber, String cif, GetStatementsAction action, LocalDateTime fromDate, LocalDateTime toDate, Long length, Long offset) {
        super(userId);
        this.depositNumber = depositNumber;
        this.cif = cif;
        this.action = action;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.length = length;
        this.offset = offset;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public GetStatementsAction getAction() {
        return action;
    }

    public void setAction(GetStatementsAction action) {
        this.action = action;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }
}
