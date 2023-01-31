/**
 * Soap_sinaMobApp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public interface Soap_sinaMobApp extends javax.xml.rpc.Service {
    public java.lang.String getsoapPortAddress();

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SoapServices getsoapPort() throws javax.xml.rpc.ServiceException;

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SoapServices getsoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
