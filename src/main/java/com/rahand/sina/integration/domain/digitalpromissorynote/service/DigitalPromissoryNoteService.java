package com.rahand.sina.integration.domain.digitalpromissorynote.service;


import com.rahand.common.dto.ResponseDto;
import com.rahand.sina.integration.domain.digitalpromissorynote.dto.*;
import com.rahand.sina.integration.domain.digitalpromissorynote.service.spec.DigitalPromissoryNote;
import com.rahand.sina.integration.provider.faraboom.service.FaraboomPromissoryNoteService;

public class DigitalPromissoryNoteService {

    private DigitalPromissoryNote digitalPromissoryNote;

    public DigitalPromissoryNoteService() {
        digitalPromissoryNote = new FaraboomPromissoryNoteService();

    }

    public ResponseDto<CreateDigitalPromissoryNoteRecipientResponse> createDigitalRecipient(CreateDigitalPromissoryNoteRecipientRequest createDigitalPromissoryNoteRecipientRequest) {

        ResponseDto<CreateDigitalPromissoryNoteRecipientResponse> response = new ResponseDto<>();
        CreateDigitalPromissoryNoteRecipientResponse createDigitalPromissoryNoteRecipientResponse = digitalPromissoryNote.createDigitalRecipient(createDigitalPromissoryNoteRecipientRequest);

        if (createDigitalPromissoryNoteRecipientResponse.isError()) {
            response.setError(true);
            response.setMessage(createDigitalPromissoryNoteRecipientResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(createDigitalPromissoryNoteRecipientResponse);
        }

        return response;
    }


    public ResponseDto<ReceiveDigitalPromissoryNoteResponse> receive(ReceiveDigitalPromissoryNoteRequest receiveDigitalPromissoryNoteRequest) {

        ResponseDto<ReceiveDigitalPromissoryNoteResponse> response = new ResponseDto<>();
        ReceiveDigitalPromissoryNoteResponse receiveDigitalPromissoryNoteResponse = digitalPromissoryNote.receive(receiveDigitalPromissoryNoteRequest);

        if (receiveDigitalPromissoryNoteResponse.isError()) {
            response.setError(true);
            response.setMessage(receiveDigitalPromissoryNoteResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(receiveDigitalPromissoryNoteResponse);
        }

        return response;

    }


    public ResponseDto<GetPaymentUrlDigitalPromissoryNoteResponse> getPaymentUrl(GetPaymentUrlDigitalPromissoryNoteRequest getPaymentUrlDigitalPromissoryNoteRequest) {

        ResponseDto<GetPaymentUrlDigitalPromissoryNoteResponse> response = new ResponseDto<>();
        GetPaymentUrlDigitalPromissoryNoteResponse getPaymentUrlDigitalPromissoryNoteResponse = digitalPromissoryNote.getPaymentUrl(getPaymentUrlDigitalPromissoryNoteRequest);

        if (getPaymentUrlDigitalPromissoryNoteResponse.isError()) {
            response.setError(true);
            response.setMessage(getPaymentUrlDigitalPromissoryNoteResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(getPaymentUrlDigitalPromissoryNoteResponse);
        }

        return response;

    }

    public ResponseDto<PaymentStatusDigitalPromissoryNoteResponse> getPaymentStatus(PaymentStatusDigitalPromissoryNoteRequest paymentStatusDigitalPromissoryNoteRequest) {

        ResponseDto<PaymentStatusDigitalPromissoryNoteResponse> response = new ResponseDto<>();
        PaymentStatusDigitalPromissoryNoteResponse paymentStatusDigitalPromissoryNoteResponse = digitalPromissoryNote.getPaymentStatus(paymentStatusDigitalPromissoryNoteRequest);

        if (paymentStatusDigitalPromissoryNoteResponse.isError()) {
            response.setError(true);
            response.setMessage(paymentStatusDigitalPromissoryNoteResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(paymentStatusDigitalPromissoryNoteResponse);
        }

        return response;

    }

    public ResponseDto<SignDigitalPromissoryNoteResponse> sign(SignDigitalPromissoryNoteRequest signDigitalPromissoryNoteRequest) {

        ResponseDto<SignDigitalPromissoryNoteResponse> response = new ResponseDto<>();
        SignDigitalPromissoryNoteResponse signDigitalPromissoryNoteResponse = digitalPromissoryNote.sign(signDigitalPromissoryNoteRequest);

        if (signDigitalPromissoryNoteResponse.isError()) {
            response.setError(true);
            response.setMessage(signDigitalPromissoryNoteResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(signDigitalPromissoryNoteResponse);
        }

        return response;

    }

    public ResponseDto<FinalRegistrationDigitalPromissoryNoteResponse> finalRegistration(FinalRegistrationDigitalPromissoryNoteRequest finalRegistrationDigitalPromissoryNoteRequest) {

        ResponseDto<FinalRegistrationDigitalPromissoryNoteResponse> response = new ResponseDto<>();
        FinalRegistrationDigitalPromissoryNoteResponse finalRegistrationDigitalPromissoryNoteResponse = digitalPromissoryNote.finalRegistration(finalRegistrationDigitalPromissoryNoteRequest);

        if (finalRegistrationDigitalPromissoryNoteResponse.isError()) {
            response.setError(true);
            response.setMessage(finalRegistrationDigitalPromissoryNoteResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(finalRegistrationDigitalPromissoryNoteResponse);
        }

        return response;

    }

    public ResponseDto<InquiryDigitalPromissoryNotesResponse> inquiryDigitalPromissoryNotes(InquiryDigitalPromissoryNotesRequest inquiryDigitalPromissoryNotesRequest) {

        ResponseDto<InquiryDigitalPromissoryNotesResponse> response = new ResponseDto<>();
        InquiryDigitalPromissoryNotesResponse inquiryDigitalPromissoryNotesResponse = digitalPromissoryNote.inquiryDigitalPromissoryNotes(inquiryDigitalPromissoryNotesRequest);

        if (inquiryDigitalPromissoryNotesResponse.isError()) {
            response.setError(true);
            response.setMessage(inquiryDigitalPromissoryNotesResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(inquiryDigitalPromissoryNotesResponse);
        }

        return response;
    }

    public ResponseDto<RemoveDigitalPromissoryNoteResponse> remove(RemoveDigitalPromissoryNoteRequest removeDigitalPromissoryNoteRequest) {

        ResponseDto<RemoveDigitalPromissoryNoteResponse> response = new ResponseDto<>();
        RemoveDigitalPromissoryNoteResponse removeDigitalPromissoryNoteResponse = digitalPromissoryNote.remove(removeDigitalPromissoryNoteRequest);

        if (removeDigitalPromissoryNoteResponse.isError()) {
            response.setError(true);
            response.setMessage(removeDigitalPromissoryNoteResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(removeDigitalPromissoryNoteResponse);
        }

        return response;

    }

    public ResponseDto<GetAllDigitalPromissoryNoteRecipientResponse> getAllRecipient(GetAllDigitalPromissoryNoteRecipientRequest getAllDigitalPromissoryNoteRecipientRequest) {

        ResponseDto<GetAllDigitalPromissoryNoteRecipientResponse> response = new ResponseDto<>();
        GetAllDigitalPromissoryNoteRecipientResponse getAllDigitalPromissoryNoteRecipientResponse = digitalPromissoryNote.getAllRecipient(getAllDigitalPromissoryNoteRecipientRequest);

        if (getAllDigitalPromissoryNoteRecipientResponse.isError()) {
            response.setError(true);
            response.setMessage(getAllDigitalPromissoryNoteRecipientResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(getAllDigitalPromissoryNoteRecipientResponse);
        }

        return response;

    }

    public ResponseDto<RemoveDigitalPromissoryNoteRecipientResponse> removeRecipient(RemoveDigitalPromissoryNoteRecipientRequest removeDigitalPromissoryNoteRecipientRequest) {

        ResponseDto<RemoveDigitalPromissoryNoteRecipientResponse> response = new ResponseDto<>();
        RemoveDigitalPromissoryNoteRecipientResponse removeDigitalPromissoryNoteRecipientResponse = digitalPromissoryNote.removeRecipient(removeDigitalPromissoryNoteRecipientRequest);

        if (removeDigitalPromissoryNoteRecipientResponse.isError()) {
            response.setError(true);
            response.setMessage(removeDigitalPromissoryNoteRecipientResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(removeDigitalPromissoryNoteRecipientResponse);
        }

        return response;

    }

}
