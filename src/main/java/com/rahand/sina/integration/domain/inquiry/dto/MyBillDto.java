package com.rahand.sina.integration.domain.inquiry.dto;

import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyBillDto{

    private String userId;
    private String billId;
    private String payId;
    private String billName;
    private BillType billType;
    private boolean savedBill;

}
