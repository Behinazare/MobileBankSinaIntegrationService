package com.rahand.sina.integration.provider.yaghut.service.bpms;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.*;
import com.rahand.sina.integration.provider.yaghut.service.bpms.dto.GetProcessDetailResponse;
import com.rahand.sina.integration.provider.yaghut.service.bpms.dto.StartProcessResponse;
import com.rahand.sina.integration.provider.yaghut.service.user.YaghutUserService;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;

import java.rmi.RemoteException;

public class YaghutBpmsService {

    private YaghutBpmsProxy yaghutBpmsProxy;
    private YaghutUserService yaghutUserService;

    public YaghutBpmsService() {
        yaghutBpmsProxy = new YaghutBpmsProxy();
        yaghutUserService = YaghutUserService.getInstance();
    }


    public StartProcessResponse startProcessInstance(String processDefinitionId, ProcessParameterValueBean[] parameterValues) {

        StartProcessResponse startProcessResponse = new StartProcessResponse();
        StartProcessInstanceResponseBean startProcessInstanceResponse;
        LoginResponseBean loginResponse = yaghutUserService.getBpmsSessionId();
        ContextEntry[] context = YaghutUtil.createYaghutBpmsSessionContext(loginResponse);
        StartProcessInstanceRequestBean startProcessInstanceRequest = new StartProcessInstanceRequestBean();
        startProcessInstanceRequest.setProcessDefinitionId(processDefinitionId);
        startProcessInstanceRequest.setParameters(parameterValues);

        try {
            startProcessInstanceResponse = yaghutBpmsProxy.startProcessInstance(context, startProcessInstanceRequest);
            startProcessResponse.setError(false);
            startProcessResponse.setStartProcessInstanceResponseBean(startProcessInstanceResponse);
        } catch (InvalidProcessParametersValueWSException e) {
            startProcessResponse.setError(true);
            startProcessResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            CommonUtil.logError(getClass().getSimpleName(), "startProcessInstance", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(startProcessInstanceRequest))
                    .output(e.toString())
                    .build());
        } catch (ProcessActionWSException e) {
            startProcessResponse.setError(true);
            startProcessResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            CommonUtil.logError(getClass().getSimpleName(), "startProcessInstance", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(startProcessInstanceRequest))
                    .output(e.toString())
                    .build());
        } catch (InvalidProcessDefinitionIdWSException e) {
            startProcessResponse.setError(true);
            startProcessResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            CommonUtil.logError(getClass().getSimpleName(), "startProcessInstance", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(startProcessInstanceRequest))
                    .output(e.toString())
                    .build());
        } catch (InvalidProcessParametersIdWSException e) {
            startProcessResponse.setError(true);
            startProcessResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            CommonUtil.logError(getClass().getSimpleName(), "startProcessInstance", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(startProcessInstanceRequest))
                    .output(e.toString())
                    .build());
        } catch (RemoteException e) {

            if (YaghutUtil.checkInvalidSessionException(e.toString())) {
                YaghutUserService.INVALID_BPMS_SESSION_ID = true;
                startProcessResponse.setSessionExpired(true);
                startProcessResponse.setError(true);
                CommonUtil.logError(getClass().getSimpleName(), "startProcessInstance", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(startProcessInstanceRequest))
                        .output(e.toString())
                        .build());

            } else {
                startProcessResponse.setError(true);
                startProcessResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
                CommonUtil.logError(getClass().getSimpleName(), "startProcessInstance", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(startProcessInstanceRequest))
                        .output(e.toString())
                        .build());
            }

        }

        return startProcessResponse;
    }

    public GetProcessDetailResponse getProcessDetailsByInstanceId(String instanceId) {

        GetProcessDetailResponse getProcessDetailResponse = new GetProcessDetailResponse();
        ProcessDetailsByInstanceIdResponseBean processDetailsByInstanceIdResponse;
        LoginResponseBean loginResponse = yaghutUserService.getBpmsSessionId();
        ContextEntry[] context = YaghutUtil.createYaghutBpmsSessionContext(loginResponse);
        ProcessDetailsByInstanceIdRequestBean processDetailsByInstanceIdRequest = new ProcessDetailsByInstanceIdRequestBean();
        processDetailsByInstanceIdRequest.setProcessInstanceId(instanceId);

        try {
            processDetailsByInstanceIdResponse = yaghutBpmsProxy.getProcessDetailsByInstanceId(context, processDetailsByInstanceIdRequest);
            getProcessDetailResponse.setError(false);
            getProcessDetailResponse.setProcessDetailsByInstanceIdResponseBean(processDetailsByInstanceIdResponse);
        } catch (RemoteException e) {
            if (YaghutUtil.checkInvalidSessionException(e.toString())) {
                YaghutUserService.INVALID_BPMS_SESSION_ID = true;
                getProcessDetailResponse.setSessionExpired(true);
                getProcessDetailResponse.setError(true);
                CommonUtil.logError(getClass().getSimpleName(), "getProcessDetailsByInstanceId", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(processDetailsByInstanceIdRequest))
                        .output(e.toString())
                        .build());

            } else {
                getProcessDetailResponse.setError(true);
                getProcessDetailResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
                CommonUtil.logError(getClass().getSimpleName(), "getProcessDetailsByInstanceId", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(processDetailsByInstanceIdRequest))
                        .output(e.toString())
                        .build());
            }
        }
        return getProcessDetailResponse;
    }
}
