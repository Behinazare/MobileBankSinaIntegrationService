package com.rahand.sina.integration.provider.yaghut.service.customer;

import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.service.spec.Customer;
import com.rahand.sina.integration.provider.yaghut.exception.common.YaghutCommonErrorMessage;
import com.rahand.sina.integration.provider.yaghut.exception.common.YaghutCommonException;
import com.rahand.sina.integration.provider.yaghut.exception.dto.YaghutExceptionResponse;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.ProcessDetailsBean;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.ProcessDetailsByInstanceIdResponseBean;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.ProcessParameterValueBean;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.StartProcessInstanceResponseBean;
import com.rahand.sina.integration.provider.yaghut.service.bpms.YaghutBpmsService;
import com.rahand.sina.integration.provider.yaghut.service.bpms.dto.GetProcessDetailResponse;
import com.rahand.sina.integration.provider.yaghut.service.bpms.dto.StartProcessResponse;
import com.rahand.sina.integration.provider.yaghut.service.user.YaghutUserService;
import com.rahand.sina.integration.provider.yaghut.util.YaghutMapper;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;
import org.apache.commons.lang.RandomStringUtils;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class YaghutCustomerService implements Customer {

    private YaghutCustomerProxy yaghutCustomerProxy;
    private YaghutUserService yaghutUserService;

    public YaghutCustomerService() {
        yaghutCustomerProxy = new YaghutCustomerProxy();
        yaghutUserService = YaghutUserService.getInstance();
    }

    @Override
    public CheckCustomerResponse checkCustomer(CheckCustomerRequest checkCustomerRequest) {

        CheckCustomerResponse checkCustomerResponse = new CheckCustomerResponse();
        CustomrerDetailResponseBean customerDetailResponse;
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(checkCustomerRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        CustomerDetailRequestBean customerDetailRequest = new CustomerDetailRequestBean();

        if (loginResponse.getCif() == null) {
            customerDetailRequest.setCode(checkCustomerRequest.getNationalCode());
        }
        try {
            customerDetailResponse = yaghutCustomerProxy.getCustomerDetailInfo(context, customerDetailRequest);
            checkCustomerResponse.setError(false);
            checkCustomerResponse.setCustomer(true);
        } catch (RemoteException e) {

            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }
                checkCustomerResponse.setSessionExpired(true);
                checkCustomerResponse.setError(true);

            } else if (e.toString().equals(YaghutCommonException.INVALID_CUSTOMER_WS_EXCEPTION.getFault())) {
                checkCustomerResponse.setError(false);
                checkCustomerResponse.setCustomer(false);
                checkCustomerResponse.setErrorMessage(YaghutCommonException.INVALID_CUSTOMER_WS_EXCEPTION.getYaghutErrorDescription());
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                checkCustomerResponse.setError(yaghutExceptionResponse.isError());
                checkCustomerResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "checkCustomer", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(customerDetailRequest))
                    .output(e.toString())
                    .build());
        }
        return checkCustomerResponse;

    }

    @Override
    public GenerateChannelUserResponse generateChannelUser(GenerateChannelUserRequest generateChannelUserRequest) {

        GenerateChannelUserResponse generateChannelUserResponse = new GenerateChannelUserResponse();
        generateChannelUserResponse.setError(false);
        generateChannelUserResponse.setUserName(RandomStringUtils.randomAlphabetic(6).toLowerCase());
        generateChannelUserResponse.setPass(RandomStringUtils.randomAlphabetic(10).toLowerCase());
        generateChannelUserResponse.setUserCreate(true);
        return generateChannelUserResponse;
    }

    @Override
    public ChangeChannelPasswordResponse changeChannelPassword(ChangeChannelPasswordRequest changeChannelPasswordRequest) {

        ChangeChannelPasswordResponse changeChannelPasswordResponse = new ChangeChannelPasswordResponse();

        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(changeChannelPasswordRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        ChangePasswordRequestBean changePasswordRequestBean = new ChangePasswordRequestBean();
        changePasswordRequestBean.setCurrentPassword(changeChannelPasswordRequest.getChannelCurrentPassword());
        changePasswordRequestBean.setNewPassword(changeChannelPasswordRequest.getNewPassword());

        try {
            yaghutCustomerProxy.changePassword(context, changePasswordRequestBean);
        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponseBean.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }
                changeChannelPasswordResponse.setSessionExpired(true);
                changeChannelPasswordResponse.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                changeChannelPasswordResponse.setError(yaghutExceptionResponse.isError());
                changeChannelPasswordResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "changeChannelPassword", e.toString(),ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(changePasswordRequestBean))
                    .output(e.toString())
                    .build());
        }

        return changeChannelPasswordResponse;
    }

    @Override
    public CreateCustomerResponse createCustomer(CreateCustomerRequest createCustomerRequest) {

        CreateCustomerResponse createCustomerResponse = new CreateCustomerResponse();
        YaghutBpmsService yaghutBpmsService = new YaghutBpmsService();
        String processDefinitionId = IntegrationLibConfig.getProperty("CREATE_CUSTOMER_PROCESS_DEFINITION_ID");
        ProcessParameterValueBean[] processParameterValueBeans = YaghutMapper.initCreateCustomerProcessParameter(createCustomerRequest);

        StartProcessResponse startProcessResponse = yaghutBpmsService.startProcessInstance(processDefinitionId, processParameterValueBeans);

        if (startProcessResponse.isSessionExpired()) {
            startProcessResponse = yaghutBpmsService.startProcessInstance(processDefinitionId, processParameterValueBeans);
        }

        if (startProcessResponse.isError()) {
            createCustomerResponse.setError(true);
            createCustomerResponse.setErrorMessage(startProcessResponse.getErrorMessage());
        } else {
            StartProcessInstanceResponseBean startProcessInstanceResponseBean = startProcessResponse.getStartProcessInstanceResponseBean();
            createCustomerResponse.setId(startProcessInstanceResponseBean.getProcess().getId());
            createCustomerResponse.setReferenceId(startProcessInstanceResponseBean.getProcess().getReferenceNumber());
            GetProcessDetailResponse getProcessDetailResponse = yaghutBpmsService.getProcessDetailsByInstanceId(createCustomerResponse.getId());

            if (getProcessDetailResponse.isSessionExpired()) {
                getProcessDetailResponse = yaghutBpmsService.getProcessDetailsByInstanceId(createCustomerResponse.getId());
            }

            if (getProcessDetailResponse.isError()) {
                createCustomerResponse.setError(true);
                createCustomerResponse.setErrorMessage(getProcessDetailResponse.getErrorMessage());
            } else {

                ProcessDetailsByInstanceIdResponseBean processDetailsByInstanceIdResponse = getProcessDetailResponse.getProcessDetailsByInstanceIdResponseBean();

                Optional<ProcessDetailsBean> errorInProcess = Arrays.stream(processDetailsByInstanceIdResponse.getProcessDetails())
                        .filter(processDetails -> processDetails.getTitle().equals("Error")).findFirst();

                if (errorInProcess.isPresent()) {
                    String error = errorInProcess.get().getValue();
                    createCustomerResponse.setError(true);
                    createCustomerResponse.setErrorMessage("مشکلی در فرایند تعریف مشتری رخ داده است");
                    createCustomerResponse.setExtraErrorData(error);
                    CommonUtil.logError(getClass().getSimpleName(), "createCustomer", error,ServiceLogsDto.builder()
                            .input(CommonUtil.toJson(createCustomerRequest))
                            .output(error)
                            .build());
                } else {
                    String cif = Arrays.stream(processDetailsByInstanceIdResponse.getProcessDetails())
                            .filter(x -> x.getTitle().equals("CustomerNumber")).findFirst().get().getValue();
                    cif = cif.contains(".") ? cif.substring(0, cif.indexOf(".")) : cif;
                    createCustomerResponse.setError(false);
                    createCustomerResponse.setCif(cif);
                    createCustomerResponse.setCustomerInfo(processDetailsByInstanceIdResponse.getProcessDetails());
                }

            }

        }

        return createCustomerResponse;
    }

    @Override
    public CustomerInfoResponse getCustomerInfo(CustomerInfoRequest customerInfoRequest) {

        CustomerInfoResponse customerInfoResponse = new CustomerInfoResponse();
        UserResponseBean userResponse;
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(customerInfoRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        UserRequestBean userRequestBean = new UserRequestBean();

        if (loginResponse.getCif() == null) {
            userRequestBean.setCif(customerInfoRequest.getCif());
        }

        try {
            userResponse = yaghutCustomerProxy.getCustomerInfo(context, userRequestBean);

            if (userResponse.getCif() == null) {
                customerInfoResponse.setError(true);
                customerInfoResponse.setErrorMessage(YaghutCommonErrorMessage.NOT_FOUND_CUSTOMER);
            } else {
                customerInfoResponse = YaghutMapper.mapToCustomerInfo(userResponse);
                customerInfoResponse.setError(false);
            }
        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }
                customerInfoResponse.setSessionExpired(true);
                customerInfoResponse.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                customerInfoResponse.setError(yaghutExceptionResponse.isError());
                customerInfoResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getCustomerInfo", e.toString(),ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(userRequestBean))
                    .output(e.toString())
                    .build());

        }

        return customerInfoResponse;

    }

    @Override
    public CustomerInfoDetailResponse getCustomerInfoDetail(CustomerInfoDetailRequest customerInfoDetailRequest) {

        CustomerInfoDetailResponse customerInfoDetailResponse = new CustomerInfoDetailResponse();
        CustomrerDetailResponseBean customrerDetailResponseBean;
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(customerInfoDetailRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        CustomerDetailRequestBean customerDetailRequest = new CustomerDetailRequestBean();

        if (loginResponse.getCif() == null) {
            customerDetailRequest.setCode(customerInfoDetailRequest.getIdentityCode());
            customerDetailRequest.setCif(customerInfoDetailRequest.getCif());
        }

        try {
            customrerDetailResponseBean = yaghutCustomerProxy.getCustomerDetailInfo(context, customerDetailRequest);
            customerInfoDetailResponse = YaghutMapper.mapToCustomerInfoDetail(customrerDetailResponseBean);
            customerInfoDetailResponse.setError(false);
        } catch (RemoteException e) {

            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }
                customerInfoDetailResponse.setSessionExpired(true);
                customerInfoDetailResponse.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                customerInfoDetailResponse.setError(yaghutExceptionResponse.isError());
                customerInfoDetailResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getCustomerInfoDetail", e.toString(),ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(customerDetailRequest))
                    .output(e.toString())
                    .build());

        }

        return customerInfoDetailResponse;

    }

    @Override
    public CustomerAddressResponse getCustomerAddress(CustomerAddressRequest customerAddressRequest) {

        CustomerAddressResponse customerAddressResponse = new CustomerAddressResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(customerAddressRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        CustomerAddressResponseBean customerAddressResponseBean;
        CustomerAddressRequestBean customerAddressRequestBean = new CustomerAddressRequestBean();

        if (loginResponseBean.getCif() == null) {
            customerAddressRequestBean.setCif(customerAddressRequest.getCif());
        }
        customerAddressRequestBean.setOffset(customerAddressRequest.getOffset() != null ? customerAddressRequest.getOffset() : 0);
        customerAddressRequestBean.setLength(customerAddressRequest.getLength() != null ? customerAddressRequest.getLength() : 100);

        try {
            customerAddressResponseBean = yaghutCustomerProxy.getCustomerAddress(context, customerAddressRequestBean);
            List<CustomerAddress> customerAddresses = new ArrayList<>();
            if (customerAddressResponseBean.getAddressList() != null) {
                for (int i = 0; i < customerAddressResponseBean.getAddressList().length; i++) {
                    CustomerAddress customerAddress = new CustomerAddress();
                    customerAddress.setAddress(customerAddressResponseBean.getAddressList(i).getAddress());
                    customerAddress.setAddressId(customerAddressResponseBean.getAddressList(i).getAddressId());
                    customerAddresses.add(customerAddress);
                }
            }
            customerAddressResponse.setError(false);
            customerAddressResponse.setCount(customerAddresses.size());
            customerAddressResponse.setCustomerAddresses(customerAddresses);
        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponseBean.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }
                customerAddressResponse.setSessionExpired(true);
                customerAddressResponse.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                customerAddressResponse.setError(yaghutExceptionResponse.isError());
                customerAddressResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getCustomerAddress", e.toString(),ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(customerAddressRequest))
                    .output(e.toString())
                    .build());
        }

        return customerAddressResponse;
    }

    @Override
    public CustomerSignaturesResponse getCustomerSignatures(CustomerSignaturesRequest customerSignaturesRequest) {

        CustomerSignaturesResponse customerSignaturesResponse = new CustomerSignaturesResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(customerSignaturesRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        CustomerSignatureInfoBean[] customerSignatureInfoBeans;
        CustomerSignatureInquiryBean customerSignatureInquiryBean = new CustomerSignatureInquiryBean();

        if (loginResponseBean.getCif() == null) {
            customerSignatureInquiryBean.setCif(customerSignaturesRequest.getCif());
        }

        try {
            customerSignatureInfoBeans = yaghutCustomerProxy.getCustomerSignatures(context, customerSignatureInquiryBean);
            List<CustomerSignatureInfo> customerSignatureInfos = new ArrayList<>();
            if (customerSignatureInfoBeans != null) {
                for (int i = 0; i < customerSignatureInfoBeans.length; i++) {
                    CustomerSignatureInfo customerSignatureInfo = new CustomerSignatureInfo();
                    customerSignatureInfo.setImage(customerSignatureInfoBeans[i].getImage());
                    customerSignatureInfo.setSignatureId(customerSignatureInfoBeans[i].getSignatureId());
                    customerSignatureInfo.setExpireDate(customerSignatureInfoBeans[i].getExpireDate() != null ?
                            YaghutUtil.CalenderToLocalDateTime(customerSignatureInfoBeans[i].getExpireDate()) : null);

                    customerSignatureInfos.add(customerSignatureInfo);
                }
            }
            customerSignaturesResponse.setError(false);
            customerSignaturesResponse.setCount(customerSignatureInfos.size());
            customerSignaturesResponse.setCustomerSignatures(customerSignatureInfos);
        } catch (RemoteException e) {

            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {
                if (loginResponseBean.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }
                customerSignaturesResponse.setSessionExpired(true);
                customerSignaturesResponse.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                customerSignaturesResponse.setError(yaghutExceptionResponse.isError());
                customerSignaturesResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getCustomerSignatures", e.toString(),ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(customerSignatureInquiryBean))
                    .output(e.toString())
                    .build());
        }
        return customerSignaturesResponse;
    }

}
