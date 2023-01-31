/**
 * MessageRelay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.armaghan.proxy;

public interface MessageRelay extends java.rmi.Remote {
    public UserResult getUserInfo(String username, String password) throws java.rmi.RemoteException;
    public ReferenceResult sendMessageOneToMany(String username, String password, String originator, String[] destination, String content, Long userSuppliedId) throws java.rmi.RemoteException;
    public MessageResult pullReceivedMessages(String username, String password) throws java.rmi.RemoteException;
    public CountResult getReceivedMessageCount(String username, String password) throws java.rmi.RemoteException;
    public ReferenceResult sendMessageBinaryUDHOneToMany(String username, String password, String originator, String[] destination, String content, String udh, String mClass, Long userSuppliedId) throws java.rmi.RemoteException;
    public ReferenceResult sendMessageBinaryUDHManyToMany(String username, String password, String[] originator, String[] destination, String[] content, String[] udh, String[] mClass, long[] userSuppliedId) throws java.rmi.RemoteException;
    public ReferenceResult sendMessageUDHOneToMany(String username, String password, String originator, String[] destination, String content, String udh, String mClass, Long userSuppliedId) throws java.rmi.RemoteException;
    public ReferenceResult sendMessageBinaryPortManyToMany(String username, String password, String[] originator, String[] destination, String[] content, String[] destinationPort, String[] sourcePort, String[] mClass, long[] userSuppliedId) throws java.rmi.RemoteException;
    public ReferenceResult sendMessageManyToMany(String username, String password, String[] originator, String[] destination, String[] content, long[] userSuppliedId) throws java.rmi.RemoteException;
    public ReferenceResult sendMessagePortManyToMany(String username, String password, String[] originator, String[] destination, String[] content, String[] destinationPort, String[] sourcePort, String[] mClass, long[] userSuppliedId) throws java.rmi.RemoteException;
    public ReferenceResult sendMessagePortOneToMany(String username, String password, String originator, String[] destination, String content, String destinationPort, String sourcePort, String mClass, Long userSuppliedId) throws java.rmi.RemoteException;
    public ReferenceResult sendMessageUDHManyToMany(String username, String password, String[] originator, String[] destination, String[] content, String[] udh, String[] mClass, long[] userSuppliedId) throws java.rmi.RemoteException;
    public MessageStateResult getMessageState(String username, String password, long[] id) throws java.rmi.RemoteException;
    public ReferenceResult sendMessageBinaryPortOneToMany(String username, String password, String originator, String[] destination, String content, String destinationPort, String sourcePort, String mClass, Long userSuppliedId) throws java.rmi.RemoteException;
}
