package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.bank.enums.Currency;
import com.rahand.sina.integration.domain.bank.enums.LoanState;
import lombok.Builder;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LoanDetailResponse extends BaseResponse {

    private String loanNumber;
    private String automaticPaymentAccountNumber;
    private String cbLoanNumber;
    private LoanState loanState;
    private Currency currency;
    private BigDecimal amount;
    private BigDecimal discount;
    private BigDecimal penalty;
    private BigDecimal totalPaidAmount;
    private Integer countOfPaid;
    private BigDecimal totalUnpaidAmount;
    private Integer countOfUnpaid;
    private BigDecimal totalMaturedUnpaidAmount;
    private Integer countOfMaturedUnpaid;

    private List<InstallmentInfoDto> installmentInfos;

    public LoanDetailResponse() {
    }

    @Builder
    public LoanDetailResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String loanNumber, String automaticPaymentAccountNumber, String cbLoanNumber, LoanState loanState, Currency currency, BigDecimal amount, BigDecimal discount, BigDecimal penalty, BigDecimal totalPaidAmount, Integer countOfPaid, BigDecimal totalUnpaidAmount, Integer countOfUnpaid, BigDecimal totalMaturedUnpaidAmount, Integer countOfMaturedUnpaid, List<InstallmentInfoDto> installmentInfos) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.loanNumber = loanNumber;
        this.automaticPaymentAccountNumber = automaticPaymentAccountNumber;
        this.cbLoanNumber = cbLoanNumber;
        this.loanState = loanState;
        this.currency = currency;
        this.amount = amount;
        this.discount = discount;
        this.penalty = penalty;
        this.totalPaidAmount = totalPaidAmount;
        this.countOfPaid = countOfPaid;
        this.totalUnpaidAmount = totalUnpaidAmount;
        this.countOfUnpaid = countOfUnpaid;
        this.totalMaturedUnpaidAmount = totalMaturedUnpaidAmount;
        this.countOfMaturedUnpaid = countOfMaturedUnpaid;
        this.installmentInfos = installmentInfos;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getAutomaticPaymentAccountNumber() {
        return automaticPaymentAccountNumber;
    }

    public void setAutomaticPaymentAccountNumber(String automaticPaymentAccountNumber) {
        this.automaticPaymentAccountNumber = automaticPaymentAccountNumber;
    }

    public String getCbLoanNumber() {
        return cbLoanNumber;
    }

    public void setCbLoanNumber(String cbLoanNumber) {
        this.cbLoanNumber = cbLoanNumber;
    }

    public LoanState getLoanState() {
        return loanState;
    }

    public void setLoanState(LoanState loanState) {
        this.loanState = loanState;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getPenalty() {
        return penalty;
    }

    public void setPenalty(BigDecimal penalty) {
        this.penalty = penalty;
    }

    public BigDecimal getTotalPaidAmount() {
        return totalPaidAmount;
    }

    public void setTotalPaidAmount(BigDecimal totalPaidAmount) {
        this.totalPaidAmount = totalPaidAmount;
    }

    public Integer getCountOfPaid() {
        return countOfPaid;
    }

    public void setCountOfPaid(Integer countOfPaid) {
        this.countOfPaid = countOfPaid;
    }

    public BigDecimal getTotalUnpaidAmount() {
        return totalUnpaidAmount;
    }

    public void setTotalUnpaidAmount(BigDecimal totalUnpaidAmount) {
        this.totalUnpaidAmount = totalUnpaidAmount;
    }

    public Integer getCountOfUnpaid() {
        return countOfUnpaid;
    }

    public void setCountOfUnpaid(Integer countOfUnpaid) {
        this.countOfUnpaid = countOfUnpaid;
    }

    public BigDecimal getTotalMaturedUnpaidAmount() {
        return totalMaturedUnpaidAmount;
    }

    public void setTotalMaturedUnpaidAmount(BigDecimal totalMaturedUnpaidAmount) {
        this.totalMaturedUnpaidAmount = totalMaturedUnpaidAmount;
    }

    public Integer getCountOfMaturedUnpaid() {
        return countOfMaturedUnpaid;
    }

    public void setCountOfMaturedUnpaid(Integer countOfMaturedUnpaid) {
        this.countOfMaturedUnpaid = countOfMaturedUnpaid;
    }

    public List<InstallmentInfoDto> getInstallmentInfos() {
        return installmentInfos;
    }

    public void setInstallmentInfos(List<InstallmentInfoDto> installmentInfos) {
        this.installmentInfos = installmentInfos;
    }

    public String getLoanDetailJson() {

        NumberFormat numberFormat = NumberFormat.getInstance();

        Map<String, String> jsonMap = new LinkedHashMap<>();

        jsonMap.put("شماره تسهیلات : ", loanNumber);
        jsonMap.put("وضعیت تسهیلات : ", loanState.getDesc());
        jsonMap.put("کل تسهیلات : ", String.format("%s ریال", numberFormat.format(amount != null ? amount.longValue() : 0)));
        jsonMap.put("مجموع اقساط پرداخت شده : ", String.format("%s ریال", numberFormat.format(totalPaidAmount != null ? totalPaidAmount.longValue() : 0)));
        jsonMap.put("تعداد اقساط پرداخت شده : ", String.valueOf(countOfPaid));
        jsonMap.put("مجموع اقساط پرداخت نشده : ", String.format("%s ریال", numberFormat.format(totalUnpaidAmount != null ? totalUnpaidAmount.longValue() : 0)));
        jsonMap.put("تعداد اقساط پرداخت نشده : ", String.valueOf(countOfUnpaid));
        jsonMap.put("مجموع اقساط سررسید شده : ", String.format("%s ریال", numberFormat.format(totalMaturedUnpaidAmount != null ? totalMaturedUnpaidAmount.longValue() : 0)));
        jsonMap.put("تعداد اقساط  سررسید شده : ", String.valueOf(countOfMaturedUnpaid));
        if (penalty!= null){
            jsonMap.put(" جریمه :", String.format("%s ریال", numberFormat.format(penalty != null ? penalty.longValue() : 0)));
        }
        return CommonUtil.toJson(jsonMap);
    }
}
