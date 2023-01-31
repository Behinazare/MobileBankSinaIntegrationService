package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

public class GetDepositAverageRequest extends BaseRequest {

    private String cif;
    private List<String> depositNumbers;
    private LocalDateTime from;
    private LocalDateTime to;

    public GetDepositAverageRequest() {
    }

    @Builder
    public GetDepositAverageRequest(String userId, String cif, List<String> depositNumbers, LocalDateTime from, LocalDateTime to) {
        super(userId);
        this.cif = cif;
        this.depositNumbers = depositNumbers;
        this.from = from;
        this.to = to;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public List<String> getDepositNumbers() {
        return depositNumbers;
    }

    public void setDepositNumbers(List<String> depositNumbers) {
        this.depositNumbers = depositNumbers;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }
}
