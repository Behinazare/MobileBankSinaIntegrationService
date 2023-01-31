package com.rahand.sina.integration.domain.inquiry.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.sina.integration.domain.inquiry.dto.*;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import com.rahand.sina.integration.domain.inquiry.enums.ShahkarIdendtificationType;
import org.junit.Test;

public class InquiryServiceTest {

    @Test
    public void shahkar() {

        InquiryService inquiryService = new InquiryService();
        ShahkarRequest shahkarRequest = new ShahkarRequest();
        shahkarRequest.setShahkarIdendtificationType(ShahkarIdendtificationType.NATIONAL_CODE);
        shahkarRequest.setServiceType(2);
        shahkarRequest.setIdentificationNo("4310687032");
        shahkarRequest.setServiceNumber("09226054364");
        ResponseDto<ShahkarResponse> responseDto = inquiryService.shahkar(shahkarRequest);
        ShahkarResponse shahkarResponse = responseDto.getResponseData();

    }

    @Test
    public void postInquiry() {

        InquiryService inquiryService = new InquiryService();
        PostInquiryRequest postInquiryRequest = new PostInquiryRequest();
        postInquiryRequest.setPostalCode("1334813758");
        ResponseDto<PostInquiryResponse> responseDto = inquiryService.postInquiry(postInquiryRequest);
        PostInquiryResponse postInquiryResponse = responseDto.getResponseData();

    }

    @Test
    public void personalInfoResponseInquiry() {

        InquiryService inquiryService = new InquiryService();
        PersonalInfoRequest personalInfoRequest = new PersonalInfoRequest();
        personalInfoRequest.setNationalCode("3790430617");
        personalInfoRequest.setBirthDate("13780514");
        ResponseDto<PersonalInfoResponse> responseDto = inquiryService.personalInfoResponseInquiry(personalInfoRequest);
        PersonalInfoResponse personalInfoResponse = responseDto.getResponseData();

    }

    @Test
    public void personalImageInquiry() {

        InquiryService inquiryService = new InquiryService();
        PersonalImageRequest personalImageRequest = new PersonalImageRequest();
        personalImageRequest.setNationalCode("3790430617");
        personalImageRequest.setNationalCodeSerial("3P12659098");
        ResponseDto<PersonalImageResponse> responseDto = inquiryService.personalImageInquiry(personalImageRequest);
        PersonalImageResponse personalImageResponse = responseDto.getResponseData();

    }

    @Test
    public void billInquiry() {

        InquiryService inquiryService = new InquiryService();
        BillInquiryRequest billInquiryRequest = new BillInquiryRequest();
        billInquiryRequest.setBillType(BillType.ELECTRICITY);
        billInquiryRequest.setMidterm(false);
        billInquiryRequest.setBillId("2718397214120");

        ResponseDto<BillInquiryResponse> responseDto = inquiryService.billInquiry(billInquiryRequest);
        if (responseDto.isError()) {
            throw new CustomRuntimeException(responseDto.getMessage());
        }

        BillInquiryResponse billInquiryResponse = responseDto.getResponseData();

        if (billInquiryResponse.isPaid()) {
            throw new CustomRuntimeException(billInquiryResponse.getExtraInfo());
        }

    }

    @Test
    public void getBillInfo() {

        InquiryService inquiryService = new InquiryService();
        BillInquiryRequest billInquiryRequest = new BillInquiryRequest();
        billInquiryRequest.setBillId("9793778304123");
        billInquiryRequest.setPayId("109610768");

        ResponseDto<BillInquiryResponse> responseDto = inquiryService.getBillInfo(billInquiryRequest);

        if (responseDto.isError()) {
            throw new CustomRuntimeException(responseDto.getMessage());
        }

        BillInquiryResponse billInquiryResponse = responseDto.getResponseData();

        if (billInquiryResponse.isPaid()) {
            throw new CustomRuntimeException(billInquiryResponse.getExtraInfo());
        }else {
            String inquiryJson = billInquiryResponse.getInquiryJson();
        }
    }

    @Test
    public void saveMyBill() {
    }

    @Test
    public void getMyBills() {

        InquiryService inquiryService = new InquiryService();
        MyBillDto myBillDto = MyBillDto.builder().userId("").billId("").billName("").billType(BillType.get("")).build();
        inquiryService.saveMyBill(myBillDto);
    }
}