package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.bank.enums.LoanPaymentByDepositMethod;
import lombok.Builder;

import java.math.BigDecimal;

public class PayLoanByDepositRequest extends BaseRequest {

    private BigDecimal amount;
    private String cif;
    private String loanNumber;
    private String customDepositNumber;
    private String additionalDescription;
    private LoanPaymentByDepositMethod paymentByDepositMethod;

    public PayLoanByDepositRequest() {
    }

    @Builder
    public PayLoanByDepositRequest(String userId, BigDecimal amount, String cif, String loanNumber, String customDepositNumber, String additionalDescription, LoanPaymentByDepositMethod paymentByDepositMethod) {
        super(userId);
        this.amount = amount;
        this.cif = cif;
        this.loanNumber = loanNumber;
        this.customDepositNumber = customDepositNumber;
        this.additionalDescription = additionalDescription;
        this.paymentByDepositMethod = paymentByDepositMethod;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getCustomDepositNumber() {
        return customDepositNumber;
    }

    public void setCustomDepositNumber(String customDepositNumber) {
        this.customDepositNumber = customDepositNumber;
    }

    public String getAdditionalDescription() {
        return additionalDescription;
    }

    public void setAdditionalDescription(String additionalDescription) {
        this.additionalDescription = additionalDescription;
    }

    public LoanPaymentByDepositMethod getPaymentByDepositMethod() {
        return paymentByDepositMethod;
    }

    public void setPaymentByDepositMethod(LoanPaymentByDepositMethod paymentByDepositMethod) {
        this.paymentByDepositMethod = paymentByDepositMethod;
    }
}
