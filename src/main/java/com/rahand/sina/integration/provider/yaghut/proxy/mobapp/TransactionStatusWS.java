/**
 * TransactionStatusWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class TransactionStatusWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionStatusWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _READY_FOR_PROCESS = "READY_FOR_PROCESS";
    public static final java.lang.String _SUSPENDED = "SUSPENDED";
    public static final java.lang.String _CANCELED = "CANCELED";
    public static final java.lang.String _PROCESS_FAIL = "PROCESS_FAIL";
    public static final java.lang.String _READY_TO_TRANSFER = "READY_TO_TRANSFER";
    public static final java.lang.String _TRANSFERRED = "TRANSFERRED";
    public static final java.lang.String _SETTLED = "SETTLED";
    public static final java.lang.String _NOT_SETTLED = "NOT_SETTLED";
    public static final java.lang.String _REJECTED = "REJECTED";
    public static final TransactionStatusWS READY_FOR_PROCESS = new TransactionStatusWS(_READY_FOR_PROCESS);
    public static final TransactionStatusWS SUSPENDED = new TransactionStatusWS(_SUSPENDED);
    public static final TransactionStatusWS CANCELED = new TransactionStatusWS(_CANCELED);
    public static final TransactionStatusWS PROCESS_FAIL = new TransactionStatusWS(_PROCESS_FAIL);
    public static final TransactionStatusWS READY_TO_TRANSFER = new TransactionStatusWS(_READY_TO_TRANSFER);
    public static final TransactionStatusWS TRANSFERRED = new TransactionStatusWS(_TRANSFERRED);
    public static final TransactionStatusWS SETTLED = new TransactionStatusWS(_SETTLED);
    public static final TransactionStatusWS NOT_SETTLED = new TransactionStatusWS(_NOT_SETTLED);
    public static final TransactionStatusWS REJECTED = new TransactionStatusWS(_REJECTED);
    public java.lang.String getValue() { return _value_;}
    public static TransactionStatusWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionStatusWS enumeration = (TransactionStatusWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionStatusWS fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionStatusWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transactionStatusWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
