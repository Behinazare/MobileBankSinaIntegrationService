/**
 * Soap_sinaBPMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public interface Soap_sinaBPMS extends javax.xml.rpc.Service {
    public String getsoapPortAddress();

    public SoapServices getsoapPort() throws javax.xml.rpc.ServiceException;

    public SoapServices getsoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
