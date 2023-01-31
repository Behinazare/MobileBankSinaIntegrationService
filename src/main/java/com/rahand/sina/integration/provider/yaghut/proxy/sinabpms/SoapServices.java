/**
 * SoapServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public interface SoapServices extends java.rmi.Remote {
    public LoginResponseBean loginStatic(ContextEntry[] context, UserInfoRequestBean request) throws java.rmi.RemoteException;
    public UserTaskResponseBean getUserTasks(ContextEntry[] context, UserTaskRequestBean request) throws java.rmi.RemoteException;
    public ProcessTaskFormParametersResponseBean getProcessTaskFormParameters(ContextEntry[] context, ProcessTaskFormParametersRequestBean request) throws java.rmi.RemoteException, InvalidProcessTaskIdWSException;
    public ProcessStartTaskParametersResponseBean getProcessStartTaskParameters(ContextEntry[] context, ProcessStartTaskParametersRequestBean request) throws java.rmi.RemoteException, InvalidProcessDefinitionIdWSException;
    public StartProcessInstanceResponseBean startProcessInstance(ContextEntry[] context, StartProcessInstanceRequestBean request) throws java.rmi.RemoteException, InvalidProcessParametersValueWSException, ProcessActionWSException, InvalidProcessDefinitionIdWSException, InvalidProcessParametersIdWSException;
    public ProcessDefinitionSearchResponseBean searchProcessDefinition(ContextEntry[] context, ProcessDefinitionSearchRequestBean request) throws java.rmi.RemoteException;
    public PerformTaskResponseBean performTask(ContextEntry[] context, PerformTaskRequestBean request) throws java.rmi.RemoteException, InvalidProcessParametersValueWSException, ProcessActionWSException, InvalidProcessTaskIdWSException, InvalidProcessParametersIdWSException;
    public BackToPreviousTaskResponseBean backToPreviousTask(ContextEntry[] context, BackToPreviousTaskRequestBean request) throws java.rmi.RemoteException, ProcessActionWSException, InvalidProcessTaskIdWSException, OperationNotPermittedWSException;
    public ProcessDetailsByInstanceIdResponseBean getProcessDetailsByInstanceId(ContextEntry[] context, ProcessDetailsByInstanceIdRequestBean request) throws java.rmi.RemoteException, InvalidProcessInstanceIdWSException;
}
