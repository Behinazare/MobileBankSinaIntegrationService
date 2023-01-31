package com.rahand.sina.integration.domain.inquiry.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.bank.dto.GetMyBillsRequest;
import com.rahand.sina.integration.domain.inquiry.dto.*;
import com.rahand.sina.integration.domain.inquiry.repository.BillRepository;
import com.rahand.sina.integration.domain.inquiry.service.spec.BillInquiry;
import com.rahand.sina.integration.domain.inquiry.service.spec.GovernmentalInquiry;
import com.rahand.sina.integration.provider.faraboom.service.FaraboomBillService;
import com.rahand.sina.integration.provider.tefas.service.TefasInquiryService;
import com.rahand.sina.integration.provider.yaghut.service.general.YaghutGeneralService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InquiryService {

    private GovernmentalInquiry governmentalInquiry;

    private BillInquiry billInquiry;

    public InquiryService() {
        governmentalInquiry = new TefasInquiryService();
    }

    public ResponseDto<ShahkarResponse> shahkar(ShahkarRequest shahkarRequest) {

        ResponseDto<ShahkarResponse> response = new ResponseDto<>();
        ShahkarResponse shahkarResponse = governmentalInquiry.shahkarInquiry(shahkarRequest);

        if (shahkarResponse.isSessionExpired()) {
            shahkarResponse = governmentalInquiry.shahkarInquiry(shahkarRequest);
        }

        if (shahkarResponse.isError()) {
            response.setError(true);
            response.setMessage(shahkarResponse.getErrorMessage());
            response.setResponseData(shahkarResponse);
        } else {
            response.setError(false);
            response.setResponseData(shahkarResponse);
        }

        return response;
    }

    public ResponseDto<PostInquiryResponse> postInquiry(PostInquiryRequest postInquiryRequest) {

        ResponseDto<PostInquiryResponse> response = new ResponseDto<>();
        PostInquiryResponse postInquiryResponse = governmentalInquiry.postInquiry(postInquiryRequest);

        if (postInquiryResponse.isSessionExpired()) {
            postInquiryResponse = governmentalInquiry.postInquiry(postInquiryRequest);
        }


        if (postInquiryResponse.isError()) {
            response.setError(true);
            response.setMessage(postInquiryResponse.getErrorMessage());
            response.setResponseData(postInquiryResponse);
        } else {
            response.setError(false);
            response.setResponseData(postInquiryResponse);
        }

        return response;
    }

    public ResponseDto<PersonalInfoResponse> personalInfoResponseInquiry(PersonalInfoRequest personalInfoRequest) {

        ResponseDto<PersonalInfoResponse> response = new ResponseDto<>();
        PersonalInfoResponse personalInfoResponse = governmentalInquiry.personalInfoInquiry(personalInfoRequest);

        if (personalInfoResponse.isSessionExpired()) {
            personalInfoResponse = governmentalInquiry.personalInfoInquiry(personalInfoRequest);
        }

        if (personalInfoResponse.isError()) {
            response.setError(true);
            response.setMessage(personalInfoResponse.getErrorMessage());
            response.setResponseData(personalInfoResponse);
        } else {
            response.setError(false);
            response.setResponseData(personalInfoResponse);
        }

        return response;
    }

    public ResponseDto<PersonalImageResponse> personalImageInquiry(PersonalImageRequest personalImageRequest) {

        ResponseDto<PersonalImageResponse> response = new ResponseDto<>();
        PersonalImageResponse personalImageResponse = governmentalInquiry.personalImageInquiry(personalImageRequest);

        if (personalImageResponse.isSessionExpired()) {
            personalImageResponse = governmentalInquiry.personalImageInquiry(personalImageRequest);
        }

        if (personalImageResponse.isError()) {
            response.setError(true);
            response.setMessage(personalImageResponse.getErrorMessage());
            response.setResponseData(personalImageResponse);
        } else {
            response.setError(false);
            response.setResponseData(personalImageResponse);
        }

        return response;
    }

    public ResponseDto<BillInquiryResponse> billInquiry(BillInquiryRequest billInquiryRequest) {

        ResponseDto<BillInquiryResponse> response = new ResponseDto<>();
        billInquiry = new FaraboomBillService();
        BillInquiryResponse billInquiryResponse = billInquiry.billInquiry(billInquiryRequest);

        if (billInquiryResponse.isError()) {
            response.setError(true);
            response.setMessage(billInquiryResponse.getErrorMessage());
            response.setResponseData(billInquiryResponse);
        } else {
            response.setError(false);
            response.setResponseData(billInquiryResponse);
        }

        return response;
    }

    public ResponseDto<BillInquiryResponse> getBillInfo(BillInquiryRequest billInquiryRequest) {

        ResponseDto<BillInquiryResponse> response = new ResponseDto<>();
        billInquiry = new YaghutGeneralService();
        BillInquiryResponse billInquiryResponse = billInquiry.getBillInfo(billInquiryRequest);

        if (billInquiryResponse.isError()) {
            response.setError(true);
            response.setMessage(billInquiryResponse.getErrorMessage());
            response.setResponseData(billInquiryResponse);
        } else {
            response.setError(false);
            response.setResponseData(billInquiryResponse);
        }

        return response;
    }

    public ResponseDto<MyBillsResponse> saveMyBill(MyBillDto myBillDto) {

        ResponseDto<MyBillsResponse> response = new ResponseDto<>();

        BillRepository billRepository = new BillRepository();
        billRepository.saveBill(myBillDto);

        return response;
    }

    public ResponseDto<MyBillsResponse> getMyBills(GetMyBillsRequest getMyBillsRequest) {

        ResponseDto<MyBillsResponse> response = new ResponseDto<>();

        BillRepository billRepository = new BillRepository();
        List<MyBillDto> myBills = billRepository.getMyBills(getMyBillsRequest.getUserId());
        MyBillsResponse myBillsResponse = new MyBillsResponse();
        myBillsResponse.setMyBills(myBills);
        Map<String,Object> MyBillsResponseMap = new HashMap<>();
        MyBillsResponseMap.put("editBillProcessKey",getMyBillsRequest.getEditBillProcessKey());
        MyBillsResponseMap.put("deleteBillProcessKey",getMyBillsRequest.getDeleteBillProcessKey());
        MyBillsResponseMap.put("myBills",myBills);
        myBillsResponse.setMyBillsJson(CommonUtil.toJson(MyBillsResponseMap));
        response.setResponseData(myBillsResponse);

        return response;
    }

}
