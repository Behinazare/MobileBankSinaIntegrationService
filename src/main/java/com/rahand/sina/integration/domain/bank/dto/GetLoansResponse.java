package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.common.util.CommonUtil;
import lombok.Builder;

import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetLoansResponse extends BaseResponse {

    private List<LoanDto> loans;
    private Integer count;

    public GetLoansResponse() {
    }

    @Builder
    public GetLoansResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, List<LoanDto> loans, Integer count) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.loans = loans;
        this.count = count;
    }

    public List<LoanDto> getLoans() {
        return loans;
    }

    public void setLoans(List<LoanDto> loans) {
        this.loans = loans;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getLoansJson(){
        return CommonUtil.toJson(loans.stream()
                .map(loan ->  {

                    Map<String,String> jsonMap = new LinkedHashMap<>();
                    jsonMap.put("loanType",loan.getLoanType().getDesc());
                    jsonMap.put("loanNumber",loan.getLoanNumber());
                    jsonMap.put("remained",String.format("%s ریال", NumberFormat.getInstance().format(loan.getLoanRemainder().longValue())));
                    jsonMap.put("currency",loan.getCurrency().getDesc());
                    jsonMap.put("branchName",loan.getBranchName());
                    jsonMap.put("branchCode",loan.getBranchCode());

                    return jsonMap;

                })
                .collect(Collectors.toList()));
    }
}

