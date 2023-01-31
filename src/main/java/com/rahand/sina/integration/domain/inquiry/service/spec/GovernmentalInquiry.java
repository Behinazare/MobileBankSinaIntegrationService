package com.rahand.sina.integration.domain.inquiry.service.spec;

import com.rahand.sina.integration.domain.inquiry.dto.*;

public interface GovernmentalInquiry {

    ShahkarResponse shahkarInquiry(ShahkarRequest shahkarRequest);
    PostInquiryResponse postInquiry(PostInquiryRequest postInquiryRequest);
    PersonalInfoResponse personalInfoInquiry(PersonalInfoRequest personalInfoRequest);
    PersonalImageResponse personalImageInquiry(PersonalImageRequest personalImageRequest);
}
