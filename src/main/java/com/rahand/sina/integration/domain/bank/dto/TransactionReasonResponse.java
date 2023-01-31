package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;


public class TransactionReasonResponse extends BaseResponse {

   private Integer count;
   private List<TransactionReason> transactionReasons;

   public TransactionReasonResponse() {
   }

   @Builder
   public TransactionReasonResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<TransactionReason> transactionReasons) {
      super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
      this.count = count;
      this.transactionReasons = transactionReasons;
   }

   public Integer getCount() {
      return count;
   }

   public void setCount(Integer count) {
      this.count = count;
   }

   public List<TransactionReason> getTransactionReasons() {
      return transactionReasons;
   }

   public void setTransactionReasons(List<TransactionReason> transactionReasons) {
      this.transactionReasons = transactionReasons;
   }
}
