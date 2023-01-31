package com.rahand.sina.integration.domain.bank.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.service.EncryptionService;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.authentication.dto.ChannelAuthenticationRequest;
import com.rahand.sina.integration.domain.authentication.dto.ChannelAuthenticationResponse;
import com.rahand.sina.integration.domain.authentication.service.AuthenticationService;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.service.spec.Customer;
import com.rahand.sina.integration.provider.yaghut.exception.common.YaghutCommonException;
import com.rahand.sina.integration.provider.yaghut.exception.dto.YaghutExceptionResponse;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChangePasswordRequestBean;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ContextEntry;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoginResponseBean;
import com.rahand.sina.integration.provider.yaghut.service.customer.YaghutCustomerProxy;
import com.rahand.sina.integration.provider.yaghut.service.customer.YaghutCustomerService;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;

import java.rmi.RemoteException;

public class BankCustomerService {
    private Customer customerService;

    public BankCustomerService() {
        customerService = new YaghutCustomerService();
    }

    public ResponseDto<CheckCustomerResponse> checkCustomer(CheckCustomerRequest checkCustomerRequest) {

        ResponseDto<CheckCustomerResponse> response = new ResponseDto<>();
        CheckCustomerResponse checkCustomerResponse = customerService.checkCustomer(checkCustomerRequest);

        if (checkCustomerResponse.isSessionExpired()) {
            checkCustomerResponse = customerService.checkCustomer(checkCustomerRequest);
        }

        if (checkCustomerResponse.isError()) {
            response.setError(true);
            response.setMessage(checkCustomerResponse.getErrorMessage());
            response.setResponseData(checkCustomerResponse);
        } else {
            response.setError(false);
            response.setResponseData(checkCustomerResponse);
        }

        return response;
    }

    public ResponseDto<GenerateChannelUserResponse> generateChannelUser(GenerateChannelUserRequest generateChannelUserRequest) {

        ResponseDto<GenerateChannelUserResponse> response = new ResponseDto<>();
        GenerateChannelUserResponse generateChannelUserResponse = customerService.generateChannelUser(generateChannelUserRequest);


        if (generateChannelUserResponse.isSessionExpired()) {
            generateChannelUserResponse = customerService.generateChannelUser(generateChannelUserRequest);
        }

        if (generateChannelUserResponse.isError()) {
            response.setError(true);
            response.setMessage(generateChannelUserResponse.getErrorMessage());
            response.setResponseData(generateChannelUserResponse);
        } else {
            response.setError(false);
            response.setResponseData(generateChannelUserResponse);
        }

        return response;
    }

    public ResponseDto<ChangeChannelPasswordResponse> changeChannelPassword(ChangeChannelPasswordRequest changeChannelPasswordRequest) {

        ResponseDto<ChangeChannelPasswordResponse> response = new ResponseDto<>();

        String userName = EncryptionService.decrypt(changeChannelPasswordRequest.getChannelUserName()).getDecryptedData();
        String currentPass = EncryptionService.decrypt(changeChannelPasswordRequest.getChannelCurrentPassword()).getDecryptedData();
        String newPass = EncryptionService.decrypt(changeChannelPasswordRequest.getNewPassword()).getDecryptedData();
        String repeatPass = EncryptionService.decrypt(changeChannelPasswordRequest.getRepeatNewPassword()).getDecryptedData();


        if (!newPass.equals(repeatPass)) {
            throw new CustomRuntimeException("تکرار رمز عبور جدید اشتباه است");
        }

        AuthenticationService authenticationService = new AuthenticationService();
        ResponseDto<ChannelAuthenticationResponse> authenticationResponse = authenticationService.channelUserAuthentication(ChannelAuthenticationRequest.builder()
                .userName(changeChannelPasswordRequest.getChannelUserName())
                .password(changeChannelPasswordRequest.getChannelCurrentPassword())
                .nationalCode(changeChannelPasswordRequest.getNationalCode())
                .build());

        if (authenticationResponse.isError() || !authenticationResponse.getResponseData().isChannelUser()) {
            throw new CustomRuntimeException(authenticationResponse.getMessage());
        }

        changeChannelPasswordRequest.setChannelCurrentPassword(currentPass);
        changeChannelPasswordRequest.setNewPassword(newPass);

        ChangeChannelPasswordResponse changeChannelPasswordResponse = customerService.changeChannelPassword(changeChannelPasswordRequest);

        if (changeChannelPasswordResponse.isSessionExpired()) {
            changeChannelPasswordResponse = customerService.changeChannelPassword(changeChannelPasswordRequest);
        }

        if (changeChannelPasswordResponse.isError()) {
            throw new CustomRuntimeException(changeChannelPasswordResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(changeChannelPasswordResponse);
        }

        return response;

    }

    public ResponseDto<ChangeChannelPasswordResponse> changeChannelPasswordInAuthentication(ChangeChannelPasswordRequest changeChannelPasswordRequest) {

        // todo ... refactor
        ResponseDto<ChangeChannelPasswordResponse> response = new ResponseDto<>();
        ChangeChannelPasswordResponse changeChannelPasswordResponse = new ChangeChannelPasswordResponse();
        String userName = EncryptionService.decrypt(changeChannelPasswordRequest.getChannelUserName()).getDecryptedData();
        String currentPass = EncryptionService.decrypt(changeChannelPasswordRequest.getChannelCurrentPassword()).getDecryptedData();
        String newPass = EncryptionService.decrypt(changeChannelPasswordRequest.getNewPassword()).getDecryptedData();
        String repeatPass = EncryptionService.decrypt(changeChannelPasswordRequest.getRepeatNewPassword()).getDecryptedData();


        if (!newPass.equals(repeatPass)) {
            throw new CustomRuntimeException("تکرار رمز عبور جدید اشتباه است");
        }

        AuthenticationService authenticationService = new AuthenticationService();
        ResponseDto<ChannelAuthenticationResponse> authenticationResponse = authenticationService.channelUserAuthenticationWithResponse(ChannelAuthenticationRequest.builder()
                .userName(changeChannelPasswordRequest.getChannelUserName())
                .password(changeChannelPasswordRequest.getChannelCurrentPassword())
                .nationalCode(changeChannelPasswordRequest.getNationalCode())
                .build());

        if (authenticationResponse.isError() || !authenticationResponse.getResponseData().isChannelUser()) {
            throw new CustomRuntimeException(authenticationResponse.getMessage());
        }

        changeChannelPasswordRequest.setChannelCurrentPassword(currentPass);
        changeChannelPasswordRequest.setNewPassword(newPass);

        LoginResponseBean loginResponseBean = authenticationResponse.getResponseData().getLoginResponseBean();
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        ChangePasswordRequestBean changePasswordRequestBean = new ChangePasswordRequestBean();
        changePasswordRequestBean.setCurrentPassword(changeChannelPasswordRequest.getChannelCurrentPassword());
        changePasswordRequestBean.setNewPassword(changeChannelPasswordRequest.getNewPassword());

        YaghutCustomerProxy yaghutCustomerProxy = new YaghutCustomerProxy();
        try {
            yaghutCustomerProxy.changePassword(context, changePasswordRequestBean);

        } catch (RemoteException e) {

            YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
            changeChannelPasswordResponse.setError(yaghutExceptionResponse.isError());
            changeChannelPasswordResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            CommonUtil.logError(getClass().getSimpleName(), "changeChannelPasswordInAuthentication", e.toString());

        }

        if (changeChannelPasswordResponse.isError()) {
            throw new CustomRuntimeException(changeChannelPasswordResponse.getErrorMessage());
        } else {
            response.setError(false);
            response.setResponseData(changeChannelPasswordResponse);
        }

        return response;

    }

    public ResponseDto<CustomerInfoResponse> getCustomerInfo(CustomerInfoRequest customerInfoRequest) {

        ResponseDto<CustomerInfoResponse> response = new ResponseDto<>();
        CustomerInfoResponse customerInfoResponse = customerService.getCustomerInfo(customerInfoRequest);

        if (customerInfoResponse.isSessionExpired()) {
            customerInfoResponse = customerService.getCustomerInfo(customerInfoRequest);
        }

        if (customerInfoResponse.isError()) {
            response.setError(true);
            response.setMessage(customerInfoResponse.getErrorMessage());
            response.setResponseData(customerInfoResponse);
        } else {
            response.setError(false);
            response.setResponseData(customerInfoResponse);
        }

        return response;
    }

    public ResponseDto<CustomerInfoDetailResponse> getCustomerDetailInfo(CustomerInfoDetailRequest customerInfoDetailRequest) {

        ResponseDto<CustomerInfoDetailResponse> response = new ResponseDto<>();
        CustomerInfoDetailResponse customerInfoDetailResponse = customerService.getCustomerInfoDetail(customerInfoDetailRequest);

        if (customerInfoDetailResponse.isSessionExpired()) {
            customerInfoDetailResponse = customerService.getCustomerInfoDetail(customerInfoDetailRequest);
        }

        if (customerInfoDetailResponse.isError()) {
            response.setError(true);
            response.setMessage(customerInfoDetailResponse.getErrorMessage());
            response.setResponseData(customerInfoDetailResponse);
        } else {
            response.setError(false);
            response.setResponseData(customerInfoDetailResponse);
        }

        return response;
    }

    public ResponseDto<CreateCustomerResponse> createCustomer(CreateCustomerRequest createCustomerRequest) {

        ResponseDto<CreateCustomerResponse> response = new ResponseDto<>();
        CreateCustomerResponse createCustomerResponse = customerService.createCustomer(createCustomerRequest);

        if (createCustomerResponse.isError()) {
            response.setError(true);
            response.setMessage(createCustomerResponse.getErrorMessage());
            response.setResponseData(createCustomerResponse);
        } else {
            response.setError(false);
            response.setResponseData(createCustomerResponse);
        }

        return response;

    }

    public ResponseDto<CustomerAddressResponse> getCustomerAddresses(CustomerAddressRequest customerAddressRequest) {

        ResponseDto<CustomerAddressResponse> response = new ResponseDto<>();
        CustomerAddressResponse customerAddressResponse = customerService.getCustomerAddress(customerAddressRequest);

        if (customerAddressResponse.isSessionExpired()) {
            customerAddressResponse = customerService.getCustomerAddress(customerAddressRequest);
        }

        if (customerAddressResponse.isError()) {
            response.setError(true);
            response.setMessage(customerAddressResponse.getErrorMessage());
            response.setResponseData(customerAddressResponse);
        } else {
            response.setError(false);
            response.setResponseData(customerAddressResponse);
        }

        return response;
    }

    public ResponseDto<CustomerSignaturesResponse> getCustomerSignatures(CustomerSignaturesRequest customerSignaturesRequest) {

        ResponseDto<CustomerSignaturesResponse> response = new ResponseDto<>();
        CustomerSignaturesResponse customerSignaturesResponse = customerService.getCustomerSignatures(customerSignaturesRequest);

        if (customerSignaturesResponse.isSessionExpired()) {
            customerSignaturesResponse = customerService.getCustomerSignatures(customerSignaturesRequest);
        }

        if (customerSignaturesResponse.isError()) {
            response.setError(true);
            response.setMessage(customerSignaturesResponse.getErrorMessage());
            response.setResponseData(customerSignaturesResponse);
        } else {
            response.setError(false);
            response.setResponseData(customerSignaturesResponse);
        }

        return response;
    }


}
