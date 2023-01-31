package com.rahand.sina.integration.domain.inquiry.service.spec;

import com.rahand.sina.integration.domain.inquiry.dto.BillInquiryRequest;
import com.rahand.sina.integration.domain.inquiry.dto.BillInquiryResponse;

public interface BillInquiry {

    BillInquiryResponse billInquiry(BillInquiryRequest billInquiryRequest);

    BillInquiryResponse getBillInfo(BillInquiryRequest billInquiryRequest);


}
