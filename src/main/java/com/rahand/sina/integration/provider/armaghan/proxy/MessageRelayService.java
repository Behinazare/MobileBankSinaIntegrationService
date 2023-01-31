/**
 * MessageRelayService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.armaghan.proxy;

public interface MessageRelayService extends javax.xml.rpc.Service {
    public String getMessageRelayPortAddress();

    public MessageRelay getMessageRelayPort() throws javax.xml.rpc.ServiceException;

    public MessageRelay getMessageRelayPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
