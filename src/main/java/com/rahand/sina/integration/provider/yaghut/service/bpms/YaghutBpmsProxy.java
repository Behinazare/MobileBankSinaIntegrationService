package com.rahand.sina.integration.provider.yaghut.service.bpms;

import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.*;
import com.rahand.sina.integration.provider.yaghut.service.YaghutServiceLocator;

import java.rmi.RemoteException;

public class YaghutBpmsProxy {

    private SoapServices soapServices;

    public YaghutBpmsProxy() {
        soapServices = YaghutServiceLocator.getSinaBpmsService();
    }

    public LoginResponseBean login(UserInfoRequestBean userInfoRequest) throws RemoteException {

        return soapServices.loginStatic(null, userInfoRequest);

    }

    public UserTaskResponseBean getUserTasks(ContextEntry[] context, UserTaskRequestBean userTaskRequest) throws RemoteException {

        return soapServices.getUserTasks(context,userTaskRequest);

    }

    public ProcessTaskFormParametersResponseBean getProcessTaskFormParameters(ContextEntry[] context,
            ProcessTaskFormParametersRequestBean processTaskFormParametersRequestBean) {

        ProcessTaskFormParametersResponseBean processTaskFormParametersResponseBean = null;

        return processTaskFormParametersResponseBean;

    }

    public ProcessStartTaskParametersResponseBean getProcessStartTaskParameters(ContextEntry[] context,
            ProcessStartTaskParametersRequestBean processStartTaskParametersRequestBean) {

        ProcessStartTaskParametersResponseBean processStartTaskParametersResponseBean = null;

        return processStartTaskParametersResponseBean;

    }

    public StartProcessInstanceResponseBean startProcessInstance(ContextEntry[] context,
                                                                 StartProcessInstanceRequestBean startProcessInstanceRequest) throws RemoteException {

        return soapServices.startProcessInstance(context,startProcessInstanceRequest);

    }

    public ProcessDefinitionSearchResponseBean searchProcessDefinition(ContextEntry[] context,
            ProcessDefinitionSearchRequestBean processDefinitionSearchRequestBean) {

        ProcessDefinitionSearchResponseBean processDefinitionSearchResponseBean = null;

        return processDefinitionSearchResponseBean;

    }

    public PerformTaskResponseBean performTask(ContextEntry[] context,
            PerformTaskRequestBean performTaskRequestBean) {

        PerformTaskResponseBean performTaskResponseBean = null;

        return performTaskResponseBean;

    }

    public BackToPreviousTaskResponseBean backToPreviousTask(ContextEntry[] context,
            BackToPreviousTaskRequestBean backToPreviousTaskRequestBean) {

        BackToPreviousTaskResponseBean backToPreviousTaskResponseBean = null;

        return backToPreviousTaskResponseBean;

    }

    public ProcessDetailsByInstanceIdResponseBean getProcessDetailsByInstanceId(ContextEntry[] context,
                                                                                ProcessDetailsByInstanceIdRequestBean processDetailsByInstanceIdRequestBean) throws RemoteException {

        ProcessDetailsByInstanceIdResponseBean processDetailsByInstanceIdResponseBean = soapServices.getProcessDetailsByInstanceId(context,processDetailsByInstanceIdRequestBean);

        return processDetailsByInstanceIdResponseBean;

    }
}
