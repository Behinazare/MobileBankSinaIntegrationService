/**
 * Soap_sinaMobAppLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class Soap_sinaMobAppLocator extends org.apache.axis.client.Service implements com.rahand.sina.integration.provider.yaghut.proxy.mobapp.Soap_sinaMobApp {

    public Soap_sinaMobAppLocator() {
    }


    public Soap_sinaMobAppLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Soap_sinaMobAppLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for soapPort
    private java.lang.String soapPort_address = "https://ebtest2.sinabank.ir/sina/soap/soap_sinaMobApp";

    public java.lang.String getsoapPortAddress() {
        return soapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String soapPortWSDDServiceName = "soapPort";

    public java.lang.String getsoapPortWSDDServiceName() {
        return soapPortWSDDServiceName;
    }

    public void setsoapPortWSDDServiceName(java.lang.String name) {
        soapPortWSDDServiceName = name;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SoapServices getsoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(soapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsoapPort(endpoint);
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SoapServices getsoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SoapPortBindingStub _stub = new com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SoapPortBindingStub(portAddress, this);
            _stub.setPortName(getsoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsoapPortEndpointAddress(java.lang.String address) {
        soapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SoapServices.class.isAssignableFrom(serviceEndpointInterface)) {
                com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SoapPortBindingStub _stub = new com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SoapPortBindingStub(new java.net.URL(soapPort_address), this);
                _stub.setPortName(getsoapPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("soapPort".equals(inputPortName)) {
            return getsoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "soap_sinaMobApp");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "soapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("soapPort".equals(portName)) {
            setsoapPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
