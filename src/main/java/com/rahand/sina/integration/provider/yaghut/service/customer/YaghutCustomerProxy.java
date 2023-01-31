package com.rahand.sina.integration.provider.yaghut.service.customer;

import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.YaghutServiceLocator;

import java.rmi.RemoteException;

public class YaghutCustomerProxy {

    private SoapServices soapServices;

    public YaghutCustomerProxy() {
        soapServices = YaghutServiceLocator.getMobAppService();
    }

    public UserResponseBean getCustomerInfo(ContextEntry[] context) throws RemoteException {

        return soapServices.getUserInfo(context);

    }

    public UserResponseBean getCustomerInfo(ContextEntry[] context, UserRequestBean userRequest) throws RemoteException {

        return soapServices.getCustomerInfo(context, userRequest);

    }

    public CustomrerDetailResponseBean getCustomerDetailInfo(ContextEntry[] context, CustomerDetailRequestBean customerDetailRequest) throws RemoteException {

        return soapServices.getCustomerDetailInfo(context, customerDetailRequest);

    }

    public CustomerBriefDetailInfoBean[] getCustomerBriefDetailInfo(ContextEntry[] context, CustomerBriefDetailRequestBean customerBriefDetailRequest) throws RemoteException {

        return soapServices.getCustomerBriefDetail(context, customerBriefDetailRequest);

    }

    public CustomerAddressResponseBean getCustomerAddress(ContextEntry[] context, CustomerAddressRequestBean customerAddressRequest) throws RemoteException {

        return soapServices.getCustomerAddress(context, customerAddressRequest);

    }

    public CustomerSignatureInfoBean[] getCustomerSignatures(ContextEntry[] context, CustomerSignatureInquiryBean customerSignatureInquiry) throws RemoteException {

        return soapServices.getCustomerSignatures(context, customerSignatureInquiry);

    }

    public void changePassword(ContextEntry[] context, ChangePasswordRequestBean changePasswordRequestBean) throws RemoteException {

        soapServices.changePassword(context, changePasswordRequestBean);

    }


}
