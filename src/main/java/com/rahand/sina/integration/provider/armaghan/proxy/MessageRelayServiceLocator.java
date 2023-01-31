/**
 * MessageRelayServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.armaghan.proxy;

public class MessageRelayServiceLocator extends org.apache.axis.client.Service implements MessageRelayService {

    public MessageRelayServiceLocator() {
    }


    public MessageRelayServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MessageRelayServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MessageRelayPort
    private String MessageRelayPort_address = "http://vesal.armaghan.net:8080/core/MessageRelayService";

    public String getMessageRelayPortAddress() {
        return MessageRelayPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String MessageRelayPortWSDDServiceName = "MessageRelayPort";

    public String getMessageRelayPortWSDDServiceName() {
        return MessageRelayPortWSDDServiceName;
    }

    public void setMessageRelayPortWSDDServiceName(String name) {
        MessageRelayPortWSDDServiceName = name;
    }

    public MessageRelay getMessageRelayPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MessageRelayPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMessageRelayPort(endpoint);
    }

    public MessageRelay getMessageRelayPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            MessageRelayServiceSoapBindingStub _stub = new MessageRelayServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getMessageRelayPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMessageRelayPortEndpointAddress(String address) {
        MessageRelayPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (MessageRelay.class.isAssignableFrom(serviceEndpointInterface)) {
                MessageRelayServiceSoapBindingStub _stub = new MessageRelayServiceSoapBindingStub(new java.net.URL(MessageRelayPort_address), this);
                _stub.setPortName(getMessageRelayPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("MessageRelayPort".equals(inputPortName)) {
            return getMessageRelayPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.smsrelay.armaghan.net/", "MessageRelayService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.smsrelay.armaghan.net/", "MessageRelayPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("MessageRelayPort".equals(portName)) {
            setMessageRelayPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
