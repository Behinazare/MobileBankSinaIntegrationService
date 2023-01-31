package com.rahand.sina.integration.domain.payment.service.spec;

import com.rahand.sina.integration.domain.payment.dto.*;

public interface Payment {

    CardPaymentResponse payByCard(CardPaymentRequest cardPaymentRequest);

    DepositPaymentResponse payByDeposit(DepositPaymentRequest depositPaymentRequest);

    PayBillByCardResponse payBillByCard(PayBillByCardRequest payBillByCardRequest);

    PayBillByDepositResponse payBillByDeposit(PayBillByDepositRequest payBillByDepositRequest);

    RollbackTransactionResponse rollbackTransaction(RollbackTransactionRequest rollbackTransactionRequest);

}
