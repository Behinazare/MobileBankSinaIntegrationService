/**
 * EchargeServiceV7Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.rayanmehr.proxy;

public class EchargeServiceV7Locator extends org.apache.axis.client.Service implements com.rahand.sina.integration.provider.rayanmehr.proxy.EchargeServiceV7 {

    public EchargeServiceV7Locator() {
    }


    public EchargeServiceV7Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EchargeServiceV7Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EchargeTransportServiceEndPointV7
    private java.lang.String EchargeTransportServiceEndPointV7_address = "https://api.echargeservices.com/Services/Strict/Version7/EchargeServiceV7.svc/transport";

    public java.lang.String getEchargeTransportServiceEndPointV7Address() {
        return EchargeTransportServiceEndPointV7_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EchargeTransportServiceEndPointV7WSDDServiceName = "EchargeTransportServiceEndPointV7";

    public java.lang.String getEchargeTransportServiceEndPointV7WSDDServiceName() {
        return EchargeTransportServiceEndPointV7WSDDServiceName;
    }

    public void setEchargeTransportServiceEndPointV7WSDDServiceName(java.lang.String name) {
        EchargeTransportServiceEndPointV7WSDDServiceName = name;
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.IEchargeServiceV7 getEchargeTransportServiceEndPointV7() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EchargeTransportServiceEndPointV7_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEchargeTransportServiceEndPointV7(endpoint);
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.IEchargeServiceV7 getEchargeTransportServiceEndPointV7(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.rahand.sina.integration.provider.rayanmehr.proxy.EchargeTransportServiceEndPointV7Stub _stub = new com.rahand.sina.integration.provider.rayanmehr.proxy.EchargeTransportServiceEndPointV7Stub(portAddress, this);
            _stub.setPortName(getEchargeTransportServiceEndPointV7WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEchargeTransportServiceEndPointV7EndpointAddress(java.lang.String address) {
        EchargeTransportServiceEndPointV7_address = address;
    }


    // Use to get a proxy class for EchargeServiceEndPointV7
    private java.lang.String EchargeServiceEndPointV7_address = "https://api.echargeservices.com/Services/Strict/Version7/EchargeServiceV7.svc";

    public java.lang.String getEchargeServiceEndPointV7Address() {
        return EchargeServiceEndPointV7_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EchargeServiceEndPointV7WSDDServiceName = "EchargeServiceEndPointV7";

    public java.lang.String getEchargeServiceEndPointV7WSDDServiceName() {
        return EchargeServiceEndPointV7WSDDServiceName;
    }

    public void setEchargeServiceEndPointV7WSDDServiceName(java.lang.String name) {
        EchargeServiceEndPointV7WSDDServiceName = name;
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.IEchargeServiceV7 getEchargeServiceEndPointV7() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EchargeServiceEndPointV7_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEchargeServiceEndPointV7(endpoint);
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.IEchargeServiceV7 getEchargeServiceEndPointV7(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.rahand.sina.integration.provider.rayanmehr.proxy.EchargeServiceEndPointV7Stub _stub = new com.rahand.sina.integration.provider.rayanmehr.proxy.EchargeServiceEndPointV7Stub(portAddress, this);
            _stub.setPortName(getEchargeServiceEndPointV7WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEchargeServiceEndPointV7EndpointAddress(java.lang.String address) {
        EchargeServiceEndPointV7_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.rahand.sina.integration.provider.rayanmehr.proxy.IEchargeServiceV7.class.isAssignableFrom(serviceEndpointInterface)) {
                com.rahand.sina.integration.provider.rayanmehr.proxy.EchargeTransportServiceEndPointV7Stub _stub = new com.rahand.sina.integration.provider.rayanmehr.proxy.EchargeTransportServiceEndPointV7Stub(new java.net.URL(EchargeTransportServiceEndPointV7_address), this);
                _stub.setPortName(getEchargeTransportServiceEndPointV7WSDDServiceName());
                return _stub;
            }
            if (com.rahand.sina.integration.provider.rayanmehr.proxy.IEchargeServiceV7.class.isAssignableFrom(serviceEndpointInterface)) {
                com.rahand.sina.integration.provider.rayanmehr.proxy.EchargeServiceEndPointV7Stub _stub = new com.rahand.sina.integration.provider.rayanmehr.proxy.EchargeServiceEndPointV7Stub(new java.net.URL(EchargeServiceEndPointV7_address), this);
                _stub.setPortName(getEchargeServiceEndPointV7WSDDServiceName());
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
        if ("EchargeTransportServiceEndPointV7".equals(inputPortName)) {
            return getEchargeTransportServiceEndPointV7();
        }
        else if ("EchargeServiceEndPointV7".equals(inputPortName)) {
            return getEchargeServiceEndPointV7();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "EchargeServiceV7");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "EchargeTransportServiceEndPointV7"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "EchargeServiceEndPointV7"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EchargeTransportServiceEndPointV7".equals(portName)) {
            setEchargeTransportServiceEndPointV7EndpointAddress(address);
        }
        else 
if ("EchargeServiceEndPointV7".equals(portName)) {
            setEchargeServiceEndPointV7EndpointAddress(address);
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
