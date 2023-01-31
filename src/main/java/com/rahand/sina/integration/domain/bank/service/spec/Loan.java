package com.rahand.sina.integration.domain.bank.service.spec;

import com.rahand.sina.integration.domain.bank.dto.*;

public interface Loan {

    OwnerInquiryResponse inquiryOtherLoan(OwnerInquiryRequest ownerInquiryRequest);

    LoanOwnerResponse getLoanInfo(LoanOwnerRequest loanOwnerRequest);

    GetLoansResponse getLoans(GetLoansRequest getLoansRequest);

    GetLoansResponse getLoanList(GetLoansRequest getLoansRequest);

    ChangeLoanAutoPaymentDepositResponse changeLoanAutoPaymentDeposit(ChangeLoanAutoPaymentDepositRequest changeLoanAutoPaymentDepositRequest);

    LoanDetailResponse getLoanDetail(LoanDetailRequest loanDetailRequest);

    PayLoanByDepositResponse payLoanByDeposit(PayLoanByDepositRequest payLoanByDepositRequest);

    PayLoanByCardResponse payLoanByCard(PayLoanByCardRequest payLoanByCardRequest);

    void initLoanValidation(LoanValidationRequest loanValidationRequest);

    GetLoanValidationResultResponse getLoanValidationResult(GetLoanValidationResultRequest getLoanValidationResultRequest);


}
