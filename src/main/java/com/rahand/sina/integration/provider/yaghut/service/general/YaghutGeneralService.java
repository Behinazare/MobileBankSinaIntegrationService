package com.rahand.sina.integration.provider.yaghut.service.general;

import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.service.spec.General;
import com.rahand.sina.integration.domain.inquiry.dto.BillInfo;
import com.rahand.sina.integration.domain.inquiry.dto.BillInquiryRequest;
import com.rahand.sina.integration.domain.inquiry.dto.BillInquiryResponse;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import com.rahand.sina.integration.domain.inquiry.service.spec.BillInquiry;
import com.rahand.sina.integration.provider.yaghut.exception.common.YaghutCommonException;
import com.rahand.sina.integration.provider.yaghut.exception.dto.YaghutExceptionResponse;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.user.YaghutUserService;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;

import java.rmi.RemoteException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class YaghutGeneralService implements General, BillInquiry {

    private YaghutUserService yaghutUserService;
    private YaghutGeneralProxy yaghutGeneralProxy;

    public YaghutGeneralService() {
        yaghutUserService = YaghutUserService.getInstance();
        yaghutGeneralProxy = new YaghutGeneralProxy();
    }

    @Override
    public GetBanksResponse getBanksInfo(GetBankRequest getBankRequest) {

        GetBanksResponse getBanksResponse = new GetBanksResponse();
        BankSearchRequestBean bankSearchRequestBean = new BankSearchRequestBean();
        bankSearchRequestBean.setOffset(getBankRequest.getOffset());
        bankSearchRequestBean.setLength(getBankRequest.getLength());
        BankResponseBean bankResponseBean;

        try {
            bankResponseBean = yaghutGeneralProxy.getBanks(bankSearchRequestBean);
            List<BankInfo> banks = new ArrayList<>();
            for (int i = 0; i < bankResponseBean.getBanks().length; i++) {
                BankInfoBean bankInfoBean = bankResponseBean.getBanks(i);
                BankInfo bankInfo = new BankInfo();
                bankInfo.setBankName(bankInfoBean.getTitle());
                bankInfo.setBankCode(bankInfoBean.getCode());
                banks.add(bankInfo);
            }
            getBanksResponse.setError(false);
            getBanksResponse.setCount(banks.size());
            getBanksResponse.setBanks(banks);
        } catch (RemoteException e) {
            YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
            getBanksResponse.setError(yaghutExceptionResponse.isError());
            getBanksResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            CommonUtil.logError(getClass().getSimpleName(), "getBanksInfo", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(bankSearchRequestBean))
                    .output(e.toString())
                    .build());
        }

        return getBanksResponse;
    }

    @Override
    public GetBranchResponse getBranchInfo(GetBranchRequest getBranchRequest) {

        GetBranchResponse getBranchResponse = new GetBranchResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(getBranchRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        BranchResponseBean branchResponseBean;
        BranchSearchRequestBean branchSearchRequestBean = new BranchSearchRequestBean();
        branchSearchRequestBean.setName(getBranchRequest.getName());
        branchSearchRequestBean.setCode(getBranchRequest.getCode());
        branchSearchRequestBean.setCity(getBranchRequest.getCity());
        branchSearchRequestBean.setTel(getBranchRequest.getAddress());
        branchSearchRequestBean.setTel(getBranchRequest.getPhone());
        branchSearchRequestBean.setSearch(getBranchRequest.getSearchKeyword());
        branchSearchRequestBean.setOffset(getBranchRequest.getOffset());
        branchSearchRequestBean.setLength(getBranchRequest.getLength());

        try {
            branchResponseBean = yaghutGeneralProxy.getBranches(context, branchSearchRequestBean);
            List<BranchInfo> branchInfos = new ArrayList<>();

            for (int i = 0; i < branchResponseBean.getBranches().length; i++) {

                BranchInfoBean branchInfoBean = branchResponseBean.getBranches(i);
                BranchInfo branchInfo = new BranchInfo();
                branchInfo.setName(branchInfoBean.getName());
                branchInfo.setCode(String.valueOf(branchInfoBean.getCode()));
                branchInfo.setCity(branchInfoBean.getCity());
                branchInfo.setAddress(branchInfoBean.getAddress());
                branchInfo.setPhone(branchInfoBean.getTel());
                branchInfo.setFax(branchInfoBean.getFax());
                branchInfo.setZipCode(branchInfoBean.getZipCode());

                branchInfos.add(branchInfo);
            }

            getBranchResponse.setError(false);
            getBranchResponse.setCount(branchInfos.size());
            getBranchResponse.setBranchInfoList(branchInfos);
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
                getBranchResponse.setSessionExpired(true);
                getBranchResponse.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                getBranchResponse.setError(yaghutExceptionResponse.isError());
                getBranchResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getBranchInfo", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(branchSearchRequestBean))
                    .output(e.toString())
                    .build());
        }

        return getBranchResponse;
    }

    @Override
    public BillInquiryResponse billInquiry(BillInquiryRequest billInquiryRequest) {
        return null;
    }

    @Override
    public BillInquiryResponse getBillInfo(BillInquiryRequest billInquiryRequest) {

        BillInquiryResponse billInquiryResponse = new BillInquiryResponse();

        BillInfoSearchRequestBean billInfoSearchRequestBean = new BillInfoSearchRequestBean();
        billInfoSearchRequestBean.setBillId(billInquiryRequest.getBillId());
        billInfoSearchRequestBean.setPayId(billInquiryRequest.getPayId());
        BillInfoResponseBean billInfoResponseBean;

        try {

            billInfoResponseBean = yaghutGeneralProxy.getBillInfo(billInfoSearchRequestBean);
            billInquiryResponse.setPaid(billInfoResponseBean.isPaid());

            if (billInfoResponseBean.getType().getValue().equals("MOBILE_PHONE")) {
                billInquiryResponse.setBillType(BillType.MOBILE);
            } else if (billInfoResponseBean.getType().getValue().equals("IMMOBILE_PHONE")) {
                billInquiryResponse.setBillType(BillType.TELEPHONE);
            } else {
                billInquiryResponse.setBillType(BillType.get(billInfoResponseBean.getType().getValue()));
            }

            if (!billInquiryResponse.isPaid()) {
                BillInfo billInfo = new BillInfo();
                billInfo.setBillId(billInquiryRequest.getBillId());
                billInfo.setPayId(billInquiryRequest.getPayId());
                billInfo.setAmount(billInfoResponseBean.getAmount());
                billInfo.setPaid(billInfoResponseBean.isPaid());
                billInquiryResponse.setBillInfo(billInfo);

                Map<String, String> inquiryMap = new LinkedHashMap<>();
                inquiryMap.put("نوع قبض", billInquiryResponse.getBillType().getDesc());
                inquiryMap.put("مبلغ", String.format("%s ریال", NumberFormat.getInstance().format(billInfoResponseBean.getAmount().longValue())));
                inquiryMap.put("شناسه قبض", billInquiryRequest.getBillId());
                inquiryMap.put("شناسه پرداخت", billInquiryRequest.getPayId());
                billInquiryResponse.setInquiryJson(CommonUtil.toJson(inquiryMap));
            }

        } catch (RemoteException e) {

            if (YaghutCommonException.checkException(e, "DuplicateEntityWSRuntimeException")) {
                billInquiryResponse.setPaid(true);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                billInquiryResponse.setError(yaghutExceptionResponse.isError());
                billInquiryResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getBillInfo", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(billInfoSearchRequestBean))
                    .output(e.toString())
                    .build());
        }

        if (billInquiryResponse.isPaid()) {
            billInquiryResponse.setExtraInfo("صورت حسابی برای پرداخت وجود ندارد. قبض پرداخت شده است.");
        }

        return billInquiryResponse;
    }
}
