/**
 * AchTransferStatusWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AchTransferStatusWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AchTransferStatusWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _WAIT_FOR_CUSTOMER_ACCEPT = "WAIT_FOR_CUSTOMER_ACCEPT";
    public static final java.lang.String _WAIT_FOR_BRANCH_ACCEPT = "WAIT_FOR_BRANCH_ACCEPT";
    public static final java.lang.String _BRANCH_REJECT = "BRANCH_REJECT";
    public static final java.lang.String _READY_TO_TRANSFER = "READY_TO_TRANSFER";
    public static final java.lang.String _SUSPEND = "SUSPEND";
    public static final java.lang.String _CANCEL = "CANCEL";
    public static final java.lang.String _PROCESSED = "PROCESSED";
    public static final AchTransferStatusWS WAIT_FOR_CUSTOMER_ACCEPT = new AchTransferStatusWS(_WAIT_FOR_CUSTOMER_ACCEPT);
    public static final AchTransferStatusWS WAIT_FOR_BRANCH_ACCEPT = new AchTransferStatusWS(_WAIT_FOR_BRANCH_ACCEPT);
    public static final AchTransferStatusWS BRANCH_REJECT = new AchTransferStatusWS(_BRANCH_REJECT);
    public static final AchTransferStatusWS READY_TO_TRANSFER = new AchTransferStatusWS(_READY_TO_TRANSFER);
    public static final AchTransferStatusWS SUSPEND = new AchTransferStatusWS(_SUSPEND);
    public static final AchTransferStatusWS CANCEL = new AchTransferStatusWS(_CANCEL);
    public static final AchTransferStatusWS PROCESSED = new AchTransferStatusWS(_PROCESSED);
    public java.lang.String getValue() { return _value_;}
    public static AchTransferStatusWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AchTransferStatusWS enumeration = (AchTransferStatusWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AchTransferStatusWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AchTransferStatusWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achTransferStatusWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
