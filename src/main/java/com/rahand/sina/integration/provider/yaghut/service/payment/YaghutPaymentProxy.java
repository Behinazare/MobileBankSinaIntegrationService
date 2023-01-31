package com.rahand.sina.integration.provider.yaghut.service.payment;

import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.YaghutServiceLocator;

import java.rmi.RemoteException;

public class YaghutPaymentProxy {

    private SoapServices soapServices;

    public YaghutPaymentProxy() {
        soapServices = YaghutServiceLocator.getMobAppService();
    }

    public PaymentResponseBean doPayment(ContextEntry[] context, PaymentRequestBean paymentRequestBean) throws RemoteException {
        return soapServices.doPayment(context, paymentRequestBean);
    }

    public PaymentResponseInfoBean depositPayment(ContextEntry[] context,DepositPaymentRequestBean depositPaymentRequestBean) throws RemoteException {
        return soapServices.depositPayment(context,depositPaymentRequestBean);
    }

    public BillPaymentResponseBean billPaymentByCard(ContextEntry[] context,BillPaymentRequestBean billPaymentRequestBean) throws RemoteException {
        return soapServices.payBill(context,billPaymentRequestBean);
    }

    public BillPaymentResponseBean billPaymentByDeposit(ContextEntry[] context,DepositBillPaymentRequestBean depositBillPaymentRequestBean) throws RemoteException {
        return soapServices.depositBillPayment(context,depositBillPaymentRequestBean);
    }

    public PaymentServiceGroupBean[] getPaymentService(ContextEntry[] context) throws RemoteException {
        return soapServices.getPaymentServices(context);
    }

    public void rollbackTransaction(ContextEntry[] context, RollbackTransactionRequestBean rollbackTransactionRequestBean) throws RemoteException {
        soapServices.rollbackTransaction(context,rollbackTransactionRequestBean);
    }
}
