package com.rahand.sina.integration.provider.yaghut.service.cheque;

import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.enums.Currency;
import com.rahand.sina.integration.domain.bank.enums.PersonalityType;
import com.rahand.sina.integration.domain.bank.enums.*;
import com.rahand.sina.integration.domain.bank.service.spec.Cheque;
import com.rahand.sina.integration.provider.yaghut.exception.common.YaghutCommonException;
import com.rahand.sina.integration.provider.yaghut.exception.dto.YaghutExceptionResponse;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.user.YaghutUserService;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class YaghutChequeService implements Cheque {

    private YaghutUserService yaghutUserService;
    private YaghutChequeProxy yaghutChequeProxy;

    public YaghutChequeService() {

        yaghutUserService = YaghutUserService.getInstance();
        yaghutChequeProxy = new YaghutChequeProxy();
    }

    @Override
    public InquirySayadChequeByIssuerResponse inquirySayadChequeByIssuer(InquirySayadChequeByIssuerRequest inquirySayadChequeByIssuerRequest) {

        InquirySayadChequeByIssuerResponse inquirySayadChequeByIssuerResponse = new InquirySayadChequeByIssuerResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(inquirySayadChequeByIssuerRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        InquirySayadChequeByIssuerResponseBean inquirySayadChequeByIssuerResponseBean;
        InquirySayadChequeByIssuerRequestBean inquirySayadChequeByIssuerRequestBean = new InquirySayadChequeByIssuerRequestBean();

        if (loginResponse.getCif() == null) {
            inquirySayadChequeByIssuerRequestBean.setCif(inquirySayadChequeByIssuerRequest.getCif());
        }

        inquirySayadChequeByIssuerRequestBean.setSayadId(inquirySayadChequeByIssuerRequest.getSayadChequeId());

        try {
            inquirySayadChequeByIssuerResponseBean = yaghutChequeProxy.inquirySayadChequeByIssuer(context, inquirySayadChequeByIssuerRequestBean);
            inquirySayadChequeByIssuerResponse.setSeriesNumber(inquirySayadChequeByIssuerResponseBean.getSeriesNumber());
            inquirySayadChequeByIssuerResponse.setSerialNumber(inquirySayadChequeByIssuerResponseBean.getSerialNumber());
            inquirySayadChequeByIssuerResponse.setSayadId(inquirySayadChequeByIssuerResponseBean.getSayadId());
            inquirySayadChequeByIssuerResponse.setReasonCode(inquirySayadChequeByIssuerResponseBean.getReasonCode());
            inquirySayadChequeByIssuerResponse.setSourceIban(inquirySayadChequeByIssuerResponseBean.getSourceIban());
            inquirySayadChequeByIssuerResponse.setBankCode(inquirySayadChequeByIssuerResponseBean.getBankCode());
            inquirySayadChequeByIssuerResponse.setBranchCode(inquirySayadChequeByIssuerResponseBean.getBranchCode());
            inquirySayadChequeByIssuerResponse.setDescription(inquirySayadChequeByIssuerResponseBean.getDescription());
            inquirySayadChequeByIssuerResponse.setCurrency(inquirySayadChequeByIssuerResponseBean.getCurrency() != null
                    ? Currency.get(inquirySayadChequeByIssuerResponseBean.getCurrency())
                    : Currency.UNKNOWN);

            inquirySayadChequeByIssuerResponse.setDueDate(YaghutUtil.CalenderToLocalDateTime(inquirySayadChequeByIssuerResponseBean.getDueDate()));
            inquirySayadChequeByIssuerResponse.setPersianDueDate(CommonUtil.convertToPersianDate(inquirySayadChequeByIssuerResponse.getDueDate()));
            inquirySayadChequeByIssuerResponse.setAmount(inquirySayadChequeByIssuerResponseBean.getAmount());
            inquirySayadChequeByIssuerResponse.setReceivers(Arrays.stream(inquirySayadChequeByIssuerResponseBean.getReceivers())
                    .map(receiver -> SayadChequeReceiverDto.builder()
                            .name(receiver.getName())
                            .identityId(receiver.getNationalId())
                            .personalityType(PersonalityType.get(receiver.getPersonalityType().getValue()))
                            .pervasiveId(receiver.getPervasiveId())
                            .build())
                    .collect(Collectors.toList()));

            inquirySayadChequeByIssuerResponse.setSayadChequeType(inquirySayadChequeByIssuerResponseBean.getChequeType() != null
                    ? SayadChequeType.get(inquirySayadChequeByIssuerResponseBean.getChequeType().getValue())
                    : SayadChequeType.UNKNOWN);

            inquirySayadChequeByIssuerResponse.setSayadChequeStatus(inquirySayadChequeByIssuerResponseBean.getChequeStatus() != null
                    ? SayadChequeStatus.get(inquirySayadChequeByIssuerResponseBean.getChequeStatus().getValue())
                    : SayadChequeStatus.UNKNOWN);

            inquirySayadChequeByIssuerResponse.setSayadChequeGuaranteeStatus(inquirySayadChequeByIssuerResponseBean.getGuaranteeStatus() != null
                    ? SayadChequeGuaranteeStatus.get(inquirySayadChequeByIssuerResponseBean.getGuaranteeStatus().getValue())
                    : SayadChequeGuaranteeStatus.UNKNOWN);

            inquirySayadChequeByIssuerResponse.setSayadChequeBlockStatus(inquirySayadChequeByIssuerResponseBean.getBlockStatus() != null
                    ? SayadChequeBlockStatus.get(inquirySayadChequeByIssuerResponseBean.getBlockStatus().getValue())
                    : SayadChequeBlockStatus.UNKNOWN);

            inquirySayadChequeByIssuerResponse.setSayadChequeLockStatus(inquirySayadChequeByIssuerResponseBean.getBlockStatus() != null
                    ? SayadChequeLockStatus.get(inquirySayadChequeByIssuerResponseBean.getLocked().getValue())
                    : SayadChequeLockStatus.UNKNOWN);

            inquirySayadChequeByIssuerResponse.setSayadChequeMedia(inquirySayadChequeByIssuerResponseBean.getChequeMedia() != null
                    ? SayadChequeMedia.get(inquirySayadChequeByIssuerResponseBean.getChequeMedia().getValue())
                    : SayadChequeMedia.UNKNOWN);


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

                inquirySayadChequeByIssuerResponse.setSessionExpired(true);
                inquirySayadChequeByIssuerResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidCustomerWSException")) {
                inquirySayadChequeByIssuerResponse.setError(true);
                inquirySayadChequeByIssuerResponse.setErrorMessage("اطلاعات مشتری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidCustomerShahabCodeWSException")) {
                inquirySayadChequeByIssuerResponse.setError(true);
                inquirySayadChequeByIssuerResponse.setErrorMessage("کد شهاب مشنری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "OperationNotPermittedWSException")) {
                inquirySayadChequeByIssuerResponse.setError(true);
                inquirySayadChequeByIssuerResponse.setErrorMessage("شما دسترسی برای انجام عملیات برای این چک را ندارید");
            } else if (YaghutCommonException.checkException(e, "SayadChequeNotFoundWSException")) {
                inquirySayadChequeByIssuerResponse.setError(true);
                inquirySayadChequeByIssuerResponse.setErrorMessage("چک مورد نظر وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                inquirySayadChequeByIssuerResponse.setError(true);
                inquirySayadChequeByIssuerResponse.setErrorMessage("شما دسترسی برای انجام عملیات ندارید");
            } else if (YaghutCommonException.checkException(e, "InvalidSayadCodeWSException")) {
                inquirySayadChequeByIssuerResponse.setError(true);
                inquirySayadChequeByIssuerResponse.setErrorMessage("کد صیاد چک نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "FraudSuspiciousWSException")) {
                inquirySayadChequeByIssuerResponse.setError(true);
                inquirySayadChequeByIssuerResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال تقلب قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "MoneyLaunderingSuspiciousWSException")) {
                inquirySayadChequeByIssuerResponse.setError(true);
                inquirySayadChequeByIssuerResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال پولشویی قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "InvalidBasedOnCbiRulesWSException")) {
                inquirySayadChequeByIssuerResponse.setError(true);
                inquirySayadChequeByIssuerResponse.setErrorMessage("انجام این عملیات از نظر قوانین نظارتی بانک مرکزی نامعتبر است.");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                inquirySayadChequeByIssuerResponse.setError(yaghutExceptionResponse.isError());
                inquirySayadChequeByIssuerResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "inquirySayadChequeByIssuer", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(inquirySayadChequeByIssuerRequestBean))
                    .output(e.toString())
                    .build());
        }

        return inquirySayadChequeByIssuerResponse;
    }

    @Override
    public InquirySayadChequeByHolderResponse inquirySayadChequeByHolder(InquirySayadChequeByHolderRequest inquirySayadChequeByHolderRequest) {

        InquirySayadChequeByHolderResponse inquirySayadChequeByHolderResponse = new InquirySayadChequeByHolderResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(inquirySayadChequeByHolderRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        InquirySayadChequeByHolderResponseBean inquirySayadChequeByHolderResponseBean;
        InquirySayadChequeByHolderRequestBean inquirySayadChequeByHolderRequestBean = new InquirySayadChequeByHolderRequestBean();

        if (loginResponse.getCif() == null) {
            inquirySayadChequeByHolderRequestBean.setCif(inquirySayadChequeByHolderRequest.getCif());
        }

        inquirySayadChequeByHolderRequestBean.setSayadId(inquirySayadChequeByHolderRequest.getSayadChequeId());

        try {
            inquirySayadChequeByHolderResponseBean = yaghutChequeProxy.inquirySayadChequeByHolder(context, inquirySayadChequeByHolderRequestBean);
            inquirySayadChequeByHolderResponse.setSeriesNumber(inquirySayadChequeByHolderResponseBean.getSeriesNumber());
            inquirySayadChequeByHolderResponse.setSerialNumber(inquirySayadChequeByHolderResponseBean.getSerialNumber());
            inquirySayadChequeByHolderResponse.setSayadId(inquirySayadChequeByHolderResponseBean.getSayadId());
            inquirySayadChequeByHolderResponse.setReasonCode(inquirySayadChequeByHolderResponseBean.getReasonCode());
            inquirySayadChequeByHolderResponse.setSourceIban(inquirySayadChequeByHolderResponseBean.getSourceIban());
            inquirySayadChequeByHolderResponse.setBankCode(inquirySayadChequeByHolderResponseBean.getBankCode());
            inquirySayadChequeByHolderResponse.setBranchCode(inquirySayadChequeByHolderResponseBean.getBranchCode());
            inquirySayadChequeByHolderResponse.setDescription(inquirySayadChequeByHolderResponseBean.getDescription());
            inquirySayadChequeByHolderResponse.setCurrency(inquirySayadChequeByHolderResponseBean.getCurrency() != null
                    ? Currency.get(inquirySayadChequeByHolderResponseBean.getCurrency())
                    : Currency.UNKNOWN);

            inquirySayadChequeByHolderResponse.setDueDate(YaghutUtil.CalenderToLocalDateTime(inquirySayadChequeByHolderResponseBean.getDueDate()));
            inquirySayadChequeByHolderResponse.setPersianDueDate(CommonUtil.convertToPersianDate(inquirySayadChequeByHolderResponse.getDueDate()));
            inquirySayadChequeByHolderResponse.setAmount(inquirySayadChequeByHolderResponseBean.getAmount());
            inquirySayadChequeByHolderResponse.setHolders(Arrays.stream(inquirySayadChequeByHolderResponseBean.getHolders())
                    .map(receiver -> SayadChequeHolderDto.builder()
                            .name(receiver.getName())
                            .identityId(receiver.getNationalId())
                            .personalityType(PersonalityType.get(receiver.getPersonalityType().getValue()))
                            .pervasiveId(receiver.getPervasiveId())
                            .build())
                    .collect(Collectors.toList()));

            inquirySayadChequeByHolderResponse.setSayadChequeType(inquirySayadChequeByHolderResponseBean.getChequeType() != null
                    ? SayadChequeType.get(inquirySayadChequeByHolderResponseBean.getChequeType().getValue())
                    : SayadChequeType.UNKNOWN);

            inquirySayadChequeByHolderResponse.setSayadChequeStatus(inquirySayadChequeByHolderResponseBean.getChequeStatus() != null
                    ? SayadChequeStatus.get(inquirySayadChequeByHolderResponseBean.getChequeStatus().getValue())
                    : SayadChequeStatus.UNKNOWN);

            inquirySayadChequeByHolderResponse.setSayadChequeGuaranteeStatus(inquirySayadChequeByHolderResponseBean.getGuaranteeStatus() != null
                    ? SayadChequeGuaranteeStatus.get(inquirySayadChequeByHolderResponseBean.getGuaranteeStatus().getValue())
                    : SayadChequeGuaranteeStatus.UNKNOWN);

            inquirySayadChequeByHolderResponse.setSayadChequeBlockStatus(inquirySayadChequeByHolderResponseBean.getBlockStatus() != null
                    ? SayadChequeBlockStatus.get(inquirySayadChequeByHolderResponseBean.getBlockStatus().getValue())
                    : SayadChequeBlockStatus.UNKNOWN);

            inquirySayadChequeByHolderResponse.setSayadChequeLockStatus(inquirySayadChequeByHolderResponseBean.getBlockStatus() != null
                    ? SayadChequeLockStatus.get(inquirySayadChequeByHolderResponseBean.getLocked().getValue())
                    : SayadChequeLockStatus.UNKNOWN);

            inquirySayadChequeByHolderResponse.setSayadChequeMedia(inquirySayadChequeByHolderResponseBean.getChequeMedia() != null
                    ? SayadChequeMedia.get(inquirySayadChequeByHolderResponseBean.getChequeMedia().getValue())
                    : SayadChequeMedia.UNKNOWN);

            inquirySayadChequeByHolderResponse.setSayadChequeAllowedAcceptAction(inquirySayadChequeByHolderResponseBean.getAllowedAcceptActionType() != null
                    ? SayadChequeAllowedAcceptAction.get(inquirySayadChequeByHolderResponseBean.getAllowedAcceptActionType().getValue())
                    : SayadChequeAllowedAcceptAction.UNKNOWN);

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

                inquirySayadChequeByHolderResponse.setSessionExpired(true);
                inquirySayadChequeByHolderResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidCustomerWSException")) {
                inquirySayadChequeByHolderResponse.setError(true);
                inquirySayadChequeByHolderResponse.setErrorMessage("اطلاعات مشتری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidCustomerShahabCodeWSException")) {
                inquirySayadChequeByHolderResponse.setError(true);
                inquirySayadChequeByHolderResponse.setErrorMessage("کد شهاب مشنری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "OperationNotPermittedWSException")) {
                inquirySayadChequeByHolderResponse.setError(true);
                inquirySayadChequeByHolderResponse.setErrorMessage("شما دسترسی برای انجام عملیات برای این چک را ندارید");
            } else if (YaghutCommonException.checkException(e, "SayadChequeNotFoundWSException")) {
                inquirySayadChequeByHolderResponse.setError(true);
                inquirySayadChequeByHolderResponse.setErrorMessage("چک مورد نظر وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                inquirySayadChequeByHolderResponse.setError(true);
                inquirySayadChequeByHolderResponse.setErrorMessage("شما دسترسی برای انجام عملیات ندارید");
            } else if (YaghutCommonException.checkException(e, "InvalidSayadCodeWSException")) {
                inquirySayadChequeByHolderResponse.setError(true);
                inquirySayadChequeByHolderResponse.setErrorMessage("کد صیاد چک نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "FraudSuspiciousWSException")) {
                inquirySayadChequeByHolderResponse.setError(true);
                inquirySayadChequeByHolderResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال تقلب قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "MoneyLaunderingSuspiciousWSException")) {
                inquirySayadChequeByHolderResponse.setError(true);
                inquirySayadChequeByHolderResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال پولشویی قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "InvalidBasedOnCbiRulesWSException")) {
                inquirySayadChequeByHolderResponse.setError(true);
                inquirySayadChequeByHolderResponse.setErrorMessage("انجام این عملیات از نظر قوانین نظارتی بانک مرکزی نامعتبر است");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                inquirySayadChequeByHolderResponse.setError(yaghutExceptionResponse.isError());
                inquirySayadChequeByHolderResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "inquirySayadChequeByHolder", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(inquirySayadChequeByHolderRequestBean))
                    .output(e.toString())
                    .build());
        }

        return inquirySayadChequeByHolderResponse;
    }

    @Override
    public IssueSayadChequeResponse issueSayadCheque(IssueSayadChequeRequest issueSayadChequeRequest) {

        IssueSayadChequeResponse issueSayadChequeResponse = new IssueSayadChequeResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(issueSayadChequeRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        IssueSayadChequeResponseBean issueSayadChequeResponseBean;
        IssueSayadChequeRequestBean issueSayadChequeRequestBean = new IssueSayadChequeRequestBean();

        if (loginResponse.getCif() == null) {
            issueSayadChequeRequestBean.setCif(issueSayadChequeRequest.getCif());
        }

        issueSayadChequeRequestBean.setSayadId(issueSayadChequeRequest.getSayadId());
        issueSayadChequeRequestBean.setDueDate(YaghutUtil.localDateTimeToCalender(issueSayadChequeRequest.getDueDate()));
        issueSayadChequeRequestBean.setDescription(issueSayadChequeRequest.getDescription());
        issueSayadChequeRequestBean.setReasonCode(issueSayadChequeRequest.getReasonCode());
        issueSayadChequeRequestBean.setAmount(issueSayadChequeRequest.getAmount());
        issueSayadChequeRequestBean.setSerialNumber(issueSayadChequeRequest.getSerialNumber());
        issueSayadChequeRequestBean.setSeriesNumber(issueSayadChequeRequest.getSeriesNumber());
        issueSayadChequeRequestBean.setDestinationIban(issueSayadChequeRequest.getDestinationIban());
        SayadChequeReceiverBean[] sayadChequeReceiverBeans = new SayadChequeReceiverBean[issueSayadChequeRequest.getReceivers().size()];
        for (int i = 0; i < issueSayadChequeRequest.getReceivers().size(); i++) {
            SayadChequeReceiverDto sayadChequeReceiverDto = issueSayadChequeRequest.getReceivers().get(i);
            sayadChequeReceiverBeans[i] = new SayadChequeReceiverBean(sayadChequeReceiverDto.getName(), sayadChequeReceiverDto.getIdentityId(),
                    com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType.fromString(sayadChequeReceiverDto.getPersonalityType().name()),
                    sayadChequeReceiverDto.getPervasiveId());
        }
        issueSayadChequeRequestBean.setReceivers(sayadChequeReceiverBeans);


        try {
            issueSayadChequeResponseBean = yaghutChequeProxy.issueSayadCheque(context, issueSayadChequeRequestBean);
            issueSayadChequeResponse.setIssued(true);

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

                issueSayadChequeResponse.setSessionExpired(true);
                issueSayadChequeResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidIdentificationCodeWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("کد شناسایی مشتری ( کدملی یا شناسه حقوقی ) نامتعبر است.");
            } else if (YaghutCommonException.checkException(e, "CustomerHasReturnedChequeWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("مشتری یا امضادار چک دارای چک برگشتی است");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserStatusWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("وضعیت دارنده چک نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "ChequeExpiredWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("اعتبار چک به اتمام رسیده است");
            } else if (YaghutCommonException.checkException(e, "DuplicateEntityWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("چک با این شماره صیاد قبلا ثبت شده است");
            } else if (YaghutCommonException.checkException(e, "InsufficientFundsWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("امکان ثبت چک به دلیل کافی نبودن موجودی سپرده وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "InvalidCustomerWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("اطلاعات مشتری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeInfoWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage(" اطلاعات چک نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "ChequeSignerHasReturnedChequeWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("مشتری امضاءکننده چک دارای چک برگشتی است. امکان ثبت چک وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserShahabCodeWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("کد شهاب مشنری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("شما دسترسی برای انجام عملیات ندارید");
            } else if (YaghutCommonException.checkException(e, "InvalidSayadCodeWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("کد صیاد چک نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "FraudSuspiciousWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال تقلب قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "MoneyLaunderingSuspiciousWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال پولشویی قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "InvalidBasedOnCbiRulesWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("انجام این عملیات از نظر قوانین نظارتی بانک مرکزی نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserIdentificationCodeWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage(" کد شناسایی کاربر چک نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidCustomerShahabCodeWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("کد شهاب مشنری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "ResourceTypeNotSupportedWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("انجام این عملیات برای این چک پشتیبانی نمی شود");
            } else if (YaghutCommonException.checkException(e, "InsufficientChequeCreditWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("مشتری اعتبار کافی جهت انجام عملیات چک را ندارد");
            } else if (YaghutCommonException.checkException(e, "ReasonCodeIsRequiredWSException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("برای مبالغ بالا مشخص شده توسط بانک مرکزی کد بابت الزامی است");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserTypeWSRuntimeException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("هیچ امضادار حقیقی ای برای سپرده وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "OperationNotPermittedWSRuntimeException")) {
                issueSayadChequeResponse.setError(true);
                issueSayadChequeResponse.setErrorMessage("لیست امضادارهای سپرده و مبلغ ارسال شده با شرایط برداشت از سپرده مطابقت ندارد");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                issueSayadChequeResponse.setError(yaghutExceptionResponse.isError());
                issueSayadChequeResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "issueSayadCheque", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(issueSayadChequeRequestBean))
                    .output(e.toString())
                    .build());
        }

        return issueSayadChequeResponse;
    }

    @Override
    public AcceptanceSayadChequeResponse acceptOrRejectSayadCheque(AcceptanceSayadChequeRequest acceptanceSayadChequeRequest) {

        AcceptanceSayadChequeResponse acceptanceSayadChequeResponse = new AcceptanceSayadChequeResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(acceptanceSayadChequeRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        SayadChequeAcceptanceResponseBean sayadChequeAcceptanceResponseBean;
        SayadChequeAcceptanceRequestBean sayadChequeAcceptanceRequestBean = new SayadChequeAcceptanceRequestBean();

        if (loginResponse.getCif() == null) {
            sayadChequeAcceptanceRequestBean.setCif(acceptanceSayadChequeRequest.getCif());
        }

        sayadChequeAcceptanceRequestBean.setSayadId(acceptanceSayadChequeRequest.getSayadId());
        sayadChequeAcceptanceRequestBean.setAccept(acceptanceSayadChequeRequest.isAccept());
        sayadChequeAcceptanceRequestBean.setDescription(acceptanceSayadChequeRequest.getDescription());
        sayadChequeAcceptanceRequestBean.setAcceptorAgentNationalCode(acceptanceSayadChequeRequest.getAcceptorAgentNationalCode());

        try {
            sayadChequeAcceptanceResponseBean = yaghutChequeProxy.acceptOrRejectSayadCheque(context, sayadChequeAcceptanceRequestBean);
            acceptanceSayadChequeResponse.setAccepted(true);
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

                acceptanceSayadChequeResponse.setSessionExpired(true);
                acceptanceSayadChequeResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "CustomerHasReturnedChequeWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("امکان انجام عملیات به دلیل وجود چک برگشتی وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "ChequeSignerHasReturnedChequeWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("امضاءکننده چک دارای چک برگشتی است");
            } else if (YaghutCommonException.checkException(e, "ChequeExpiredWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("اعتبار چک به اتمام رسیده است");
            } else if (YaghutCommonException.checkException(e, "InvalidCustomerWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("درخواست نامعتبر است امکان انجام عملیات وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "InvalidCustomerShahabCodeWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("کد شهاب نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "OperationNotPermittedWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("امکان دسترسی و انجام عملیات برای چک مورد نظر را ندارید");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeStatusWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("وضعیت چک برای انجام عملیات نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("شما دسترسی برای انجام این عملیات را ندارید");
            } else if (YaghutCommonException.checkException(e, "DuplicateRequestWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("درخواست تکراری است");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserStatusWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("وضعیت چک نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidSayadCodeWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("کد صیاد چک نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "FraudSuspiciousWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال تقلب قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "MoneyLaunderingSuspiciousWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال پولشویی قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "InvalidBasedOnCbiRulesWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("انجام این عملیات از نظر قوانین نظارتی بانک مرکزی نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserIdentificationCodeWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("کد شناسایی کاربر چک نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserShahabCodeWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("کد شهاب کاربر چک نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeInfoWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("اطلاعات چک نا متعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserTypeWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("نوع مشتری نماینده تایید کننده (حقیقی-حقوقی) چک نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "InsufficientChequeCreditWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("به دلیل کافی نبودن اعتبار انجام این عملیات ممکن نیست");
            } else if (YaghutCommonException.checkException(e, "IllegalRequestWSException")) {
                acceptanceSayadChequeResponse.setError(true);
                acceptanceSayadChequeResponse.setErrorMessage("درخواست نامعتبر است امکان انجام عملیات وجود ندارد");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                acceptanceSayadChequeResponse.setError(yaghutExceptionResponse.isError());
                acceptanceSayadChequeResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "acceptOrRejectSayadCheque", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(sayadChequeAcceptanceRequestBean))
                    .output(e.toString())
                    .build());
        }

        return acceptanceSayadChequeResponse;
    }

    @Override
    public InquirySayadChequeTransferResponse inquirySayadChequeTransfer(InquirySayadChequeTransferRequest inquirySayadChequeTransferRequest) {

        InquirySayadChequeTransferResponse inquirySayadChequeTransferResponse = new InquirySayadChequeTransferResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(inquirySayadChequeTransferRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        InquirySayadChequeTransferResponseBean inquirySayadChequeTransferResponseBean;
        InquirySayadChequeTransferRequestBean inquirySayadChequeTransferRequestBean = new InquirySayadChequeTransferRequestBean();

        if (loginResponse.getCif() == null) {
            inquirySayadChequeTransferRequestBean.setCif(inquirySayadChequeTransferRequest.getCif());
        }

        inquirySayadChequeTransferRequestBean.setSayadId(inquirySayadChequeTransferRequest.getSayadChequeId());

        try {
            inquirySayadChequeTransferResponseBean = yaghutChequeProxy.inquirySayadChequeTransfer(context, inquirySayadChequeTransferRequestBean);
            inquirySayadChequeTransferResponse.setSerialNumber(inquirySayadChequeTransferResponseBean.getSerialNumber());
            inquirySayadChequeTransferResponse.setSayadId(inquirySayadChequeTransferResponseBean.getSayadId());
            inquirySayadChequeTransferResponse.setReasonCode(inquirySayadChequeTransferResponseBean.getReasonCode());
            inquirySayadChequeTransferResponse.setSourceIban(inquirySayadChequeTransferResponseBean.getSourceIban());
            inquirySayadChequeTransferResponse.setBankCode(inquirySayadChequeTransferResponseBean.getBankCode());
            inquirySayadChequeTransferResponse.setBranchCode(inquirySayadChequeTransferResponseBean.getBranchCode());
            inquirySayadChequeTransferResponse.setDescription(inquirySayadChequeTransferResponseBean.getDescription());
            inquirySayadChequeTransferResponse.setCurrency(inquirySayadChequeTransferResponseBean.getCurrency() != null
                    ? Currency.get(inquirySayadChequeTransferResponseBean.getCurrency())
                    : Currency.UNKNOWN);

            inquirySayadChequeTransferResponse.setDueDate(YaghutUtil.CalenderToLocalDateTime(inquirySayadChequeTransferResponseBean.getDueDate()));
            inquirySayadChequeTransferResponse.setPersianDueDate(CommonUtil.convertToPersianDate(inquirySayadChequeTransferResponse.getDueDate()));
            inquirySayadChequeTransferResponse.setAmount(inquirySayadChequeTransferResponseBean.getAmount());
            inquirySayadChequeTransferResponse.setHolders(Arrays.stream(inquirySayadChequeTransferResponseBean.getHolders())
                    .map(holder -> SayadChequeTransferHolderDto.builder()
                            .lastActionDate(YaghutUtil.CalenderToLocalDateTime(holder.getLastActionDate()))
                            .persianLastActionDate(CommonUtil.convertToPersianDateTime(YaghutUtil.CalenderToLocalDateTime(holder.getLastActionDate())))
                            .sayadChequeAcceptanceStatus(holder.getAcceptanceStatus() != null
                                    ? SayadChequeAcceptanceStatus.get(holder.getAcceptanceStatus().getValue())
                                    : SayadChequeAcceptanceStatus.UNKNOWN)
                            .build())
                    .collect(Collectors.toList()));

            inquirySayadChequeTransferResponse.setSayadChequeType(inquirySayadChequeTransferResponseBean.getChequeType() != null
                    ? SayadChequeType.get(inquirySayadChequeTransferResponseBean.getChequeType().getValue())
                    : SayadChequeType.UNKNOWN);

            inquirySayadChequeTransferResponse.setSayadChequeStatus(inquirySayadChequeTransferResponseBean.getChequeStatus() != null
                    ? SayadChequeStatus.get(inquirySayadChequeTransferResponseBean.getChequeStatus().getValue())
                    : SayadChequeStatus.UNKNOWN);

            inquirySayadChequeTransferResponse.setSayadChequeGuaranteeStatus(inquirySayadChequeTransferResponseBean.getGuaranteeStatus() != null
                    ? SayadChequeGuaranteeStatus.get(inquirySayadChequeTransferResponseBean.getGuaranteeStatus().getValue())
                    : SayadChequeGuaranteeStatus.UNKNOWN);

            inquirySayadChequeTransferResponse.setSayadChequeBlockStatus(inquirySayadChequeTransferResponseBean.getBlockStatus() != null
                    ? SayadChequeBlockStatus.get(inquirySayadChequeTransferResponseBean.getBlockStatus().getValue())
                    : SayadChequeBlockStatus.UNKNOWN);

            inquirySayadChequeTransferResponse.setSayadChequeLockStatus(inquirySayadChequeTransferResponseBean.getBlockStatus() != null
                    ? SayadChequeLockStatus.get(inquirySayadChequeTransferResponseBean.getLocked().getValue())
                    : SayadChequeLockStatus.UNKNOWN);

            inquirySayadChequeTransferResponse.setSayadChequeMedia(inquirySayadChequeTransferResponseBean.getChequeMedia() != null
                    ? SayadChequeMedia.get(inquirySayadChequeTransferResponseBean.getChequeMedia().getValue())
                    : SayadChequeMedia.UNKNOWN);

            inquirySayadChequeTransferResponse.setSayadChequeAllowedTransferAction(inquirySayadChequeTransferResponseBean.getAllowedTransferActionType() != null
                    ? SayadChequeAllowedTransferAction.get(inquirySayadChequeTransferResponseBean.getAllowedTransferActionType().getValue())
                    : SayadChequeAllowedTransferAction.UNKNOWN);

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

                inquirySayadChequeTransferResponse.setSessionExpired(true);
                inquirySayadChequeTransferResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidCustomerWSException")) {
                inquirySayadChequeTransferResponse.setError(true);
                inquirySayadChequeTransferResponse.setErrorMessage("درخواست نامعتبر است امکان انجام عملیات وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "InvalidCustomerShahabCodeWSException")) {
                inquirySayadChequeTransferResponse.setError(true);
                inquirySayadChequeTransferResponse.setErrorMessage("کد شهاب نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "OperationNotPermittedWSException")) {
                inquirySayadChequeTransferResponse.setError(true);
                inquirySayadChequeTransferResponse.setErrorMessage("امکان دسترسی و انجام عملیات برای چک مورد نظر را ندارید");
            } else if (YaghutCommonException.checkException(e, "SayadChequeNotFoundWSException")) {
                inquirySayadChequeTransferResponse.setError(true);
                inquirySayadChequeTransferResponse.setErrorMessage("چک مورد نظر وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                inquirySayadChequeTransferResponse.setError(true);
                inquirySayadChequeTransferResponse.setErrorMessage("شما دسترسی برای انجام این عملیات را ندارید");
            } else if (YaghutCommonException.checkException(e, "InvalidSayadCodeWSException")) {
                inquirySayadChequeTransferResponse.setError(true);
                inquirySayadChequeTransferResponse.setErrorMessage("کد صیاد چک نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "FraudSuspiciousWSException")) {
                inquirySayadChequeTransferResponse.setError(true);
                inquirySayadChequeTransferResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال تقلب قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "MoneyLaunderingSuspiciousWSException")) {
                inquirySayadChequeTransferResponse.setError(true);
                inquirySayadChequeTransferResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال پولشویی قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "InvalidBasedOnCbiRulesWSException")) {
                inquirySayadChequeTransferResponse.setError(true);
                inquirySayadChequeTransferResponse.setErrorMessage("انجام این عملیات از نظر قوانین نظارتی بانک مرکزی نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "IllegalRequestWSException")) {
                inquirySayadChequeTransferResponse.setError(true);
                inquirySayadChequeTransferResponse.setErrorMessage("درخواست نامعتبر است امکان انجام عملیات وجود ندارد");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                inquirySayadChequeTransferResponse.setError(yaghutExceptionResponse.isError());
                inquirySayadChequeTransferResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "inquirySayadChequeTransfer", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(inquirySayadChequeTransferRequestBean))
                    .output(e.toString())
                    .build());
        }
        return inquirySayadChequeTransferResponse;
    }

    @Override
    public TransferSayadChequeResponse transferSayadCheque(TransferSayadChequeRequest transferSayadChequeRequest) {

        TransferSayadChequeResponse transferSayadChequeResponse = new TransferSayadChequeResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(transferSayadChequeRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        SayadChequeTransferResponseBean sayadChequeTransferResponseBean;
        SayadChequeTransferRequestBean sayadChequeTransferRequestBean = new SayadChequeTransferRequestBean();

        if (loginResponse.getCif() == null) {
            sayadChequeTransferRequestBean.setCif(transferSayadChequeRequest.getCif());
        }

        sayadChequeTransferRequestBean.setSayadId(transferSayadChequeRequest.getSayadId());
        sayadChequeTransferRequestBean.setDescription(transferSayadChequeRequest.getDescription());
        sayadChequeTransferRequestBean.setReasonCode(transferSayadChequeRequest.getReasonCode());
        sayadChequeTransferRequestBean.setDestinationIban(transferSayadChequeRequest.getDestinationIban());
        SayadChequeReceiverBean[] sayadChequeReceiverBeans = new SayadChequeReceiverBean[transferSayadChequeRequest.getReceivers().size()];
        for (int i = 0; i < transferSayadChequeRequest.getReceivers().size(); i++) {
            SayadChequeReceiverDto sayadChequeReceiverDto = transferSayadChequeRequest.getReceivers().get(i);
            sayadChequeReceiverBeans[i] = new SayadChequeReceiverBean(sayadChequeReceiverDto.getName(), sayadChequeReceiverDto.getIdentityId(),
                    com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType.fromString(sayadChequeReceiverDto.getPersonalityType().name()),
                    sayadChequeReceiverDto.getPervasiveId());
        }
        sayadChequeTransferRequestBean.setReceivers(sayadChequeReceiverBeans);

        try {
            sayadChequeTransferResponseBean = yaghutChequeProxy.transferSayadCheque(context, sayadChequeTransferRequestBean);
            transferSayadChequeResponse.setTransferSayadChequeResult(sayadChequeTransferResponseBean.getResult() != null
                    ? TransferSayadChequeResult.get(sayadChequeTransferResponseBean.getResult().getValue())
                    : TransferSayadChequeResult.UNKNOWN);

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

                transferSayadChequeResponse.setSessionExpired(true);
                transferSayadChequeResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidCustomerWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("اطلاعات مشتری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidCustomerShahabCodeWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("کد شهاب نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("شما دسترسی برای انجام این عملیات را ندارید");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeStatusWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("وضعیت چک برای انجام عملیات نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "ChequeIsLockedWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("چک قفل است");
            } else if (YaghutCommonException.checkException(e, "ChequeIsBlockedWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("چک مسدود است");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeReceiversWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("دریافت کنندگان چک نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "IllegalRequestWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("درخواست نامعتبر است امکان انجام عملیات وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserStatusWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("وضعیت چک نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidSayadCodeWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("کد صیاد چک نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "FraudSuspiciousWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال تقلب قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "MoneyLaunderingSuspiciousWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال پولشویی قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "InvalidBasedOnCbiRulesWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("انجام این عملیات از نظر قوانین نظارتی بانک مرکزی نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserIdentificationCodeWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("کد شناسایی کاربر چک نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "OperationNotPermittedWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("امکان دسترسی و انجام عملیات برای چک مورد نظر را ندارید");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserTypeWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("نوع مشتری نماینده تایید کننده (حقیقی-حقوقی) چک نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "ReasonCodeIsRequiredWSException")) {
                transferSayadChequeResponse.setError(true);
                transferSayadChequeResponse.setErrorMessage("برای مبالغ بالا مشخص شده توسط بانک مرکزی کد بابت الزامی است");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                transferSayadChequeResponse.setError(yaghutExceptionResponse.isError());
                transferSayadChequeResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "transferSayadCheque", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(sayadChequeTransferRequestBean))
                    .output(e.toString())
                    .build());
        }

        return transferSayadChequeResponse;
    }

    @Override
    public RejectTransferSayadChequeResponse rejectTransferSayadCheque(RejectTransferSayadChequeRequest rejectTransferSayadChequeRequest) {

        RejectTransferSayadChequeResponse rejectTransferSayadChequeResponse = new RejectTransferSayadChequeResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(rejectTransferSayadChequeRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        SayadChequeRejectTransferResponseBean sayadChequeRejectTransferResponseBean;
        SayadChequeRejectTransferRequestBean sayadChequeRejectTransferRequestBean = new SayadChequeRejectTransferRequestBean();

        if (loginResponse.getCif() == null) {
            sayadChequeRejectTransferRequestBean.setCif(rejectTransferSayadChequeRequest.getCif());
        }

        sayadChequeRejectTransferRequestBean.setSayadId(rejectTransferSayadChequeRequest.getSayadId());
        sayadChequeRejectTransferRequestBean.setDescription(rejectTransferSayadChequeRequest.getDescription());
        sayadChequeRejectTransferRequestBean.setDestinationIban(rejectTransferSayadChequeRequest.getDestinationIban());
        sayadChequeRejectTransferRequestBean.setSigners((String[]) rejectTransferSayadChequeRequest.getSigners().toArray());

        try {
            sayadChequeRejectTransferResponseBean = yaghutChequeProxy.rejectSayadChequeTransfer(context, sayadChequeRejectTransferRequestBean);
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

                rejectTransferSayadChequeResponse.setSessionExpired(true);
                rejectTransferSayadChequeResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidCustomerWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("اطلاعات مشتری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidCustomerShahabCodeWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("کد شهاب نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("شما دسترسی برای انجام این عملیات را ندارید");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeStatusWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("وضعیت چک برای انجام عملیات نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "ChequeIsLockedWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("چک قفل است");
            } else if (YaghutCommonException.checkException(e, "ChequeIsBlockedWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("چک مسدود است");
            } else if (YaghutCommonException.checkException(e, "IllegalRequestWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("درخواست نامعتبر است امکان انجام عملیات وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserStatusWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("وضعیت چک نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidSayadCodeWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("کد صیاد چک نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "FraudSuspiciousWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال تقلب قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "MoneyLaunderingSuspiciousWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("انجام این عملیات به دلیل قوانین مربوطه و احتمال پولشویی قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "InvalidBasedOnCbiRulesWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("انجام این عملیات از نظر قوانین نظارتی بانک مرکزی نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserIdentificationCodeWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("کد شناسایی کاربر چک نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "OperationNotPermittedWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("امکان دسترسی و انجام عملیات برای چک مورد نظر را ندارید");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserTypeWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("نوع مشتری نماینده تایید کننده (حقیقی-حقوقی) چک نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidChequeUserShahabCodeWSException")) {
                rejectTransferSayadChequeResponse.setError(true);
                rejectTransferSayadChequeResponse.setErrorMessage("کد شهاب کاربر چک نامعتبر است");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                rejectTransferSayadChequeResponse.setError(yaghutExceptionResponse.isError());
                rejectTransferSayadChequeResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "rejectTransferSayadCheque", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(sayadChequeRejectTransferRequestBean))
                    .output(e.toString())
                    .build());
        }

        return rejectTransferSayadChequeResponse;
    }
}
