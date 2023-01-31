/**
 * IEchargeServiceV7.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.rayanmehr.proxy;

public interface IEchargeServiceV7 extends java.rmi.Remote {
    public com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7 registerTopup(com.rahand.sina.integration.provider.rayanmehr.proxy.TopupRequestV7 request) throws java.rmi.RemoteException;
    public com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7 twoPhaseTopupRegister(com.rahand.sina.integration.provider.rayanmehr.proxy.TopupRegisterRequestV7 request) throws java.rmi.RemoteException;
    public com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7 twoPhaseTopupProcess(com.rahand.sina.integration.provider.rayanmehr.proxy.TopupProcessRequestV7 request) throws java.rmi.RemoteException;
    public com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7 twoPhaseTopupProcessWithEndUserInfo(com.rahand.sina.integration.provider.rayanmehr.proxy.TopupProcessWithEndUserInfoRequestV7 request) throws java.rmi.RemoteException;
    public com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherResponseV7 registerVoucher(com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherRequestV7 request) throws java.rmi.RemoteException;
    public com.rahand.sina.integration.provider.rayanmehr.proxy.ReverseVoucherResponseV7 reverseVoucher(com.rahand.sina.integration.provider.rayanmehr.proxy.ReverseVoucherRequestV7 request) throws java.rmi.RemoteException;
    public com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherResponseV7 revealVouchers(com.rahand.sina.integration.provider.rayanmehr.proxy.StatusRequestV7 request) throws java.rmi.RemoteException;
    public com.rahand.sina.integration.provider.rayanmehr.proxy.ProductAvailableResponseV7 isProductAvailable(com.rahand.sina.integration.provider.rayanmehr.proxy.ProductAvailableRequestV7 request) throws java.rmi.RemoteException;
    public com.rahand.sina.integration.provider.rayanmehr.proxy.StatusResponseV7 getStatus(com.rahand.sina.integration.provider.rayanmehr.proxy.StatusRequestV7 request) throws java.rmi.RemoteException;
    public com.rahand.sina.integration.provider.rayanmehr.proxy.StatusResponseV7 getStatusByOptionalMerchantData(com.rahand.sina.integration.provider.rayanmehr.proxy.StatusByOptionalMerchantDataRequestV7 request) throws java.rmi.RemoteException;
    public com.rahand.sina.integration.provider.rayanmehr.proxy.BalanceResponseV7 getBalance(com.rahand.sina.integration.provider.rayanmehr.proxy.BalanceRequestV7 request) throws java.rmi.RemoteException;
    public com.rahand.sina.integration.provider.rayanmehr.proxy.InternetPackagesResponseV7 getInternetPackages(com.rahand.sina.integration.provider.rayanmehr.proxy.InternetPackagesRequestV7 request) throws java.rmi.RemoteException;
}
