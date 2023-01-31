/**
 * TransferProblemWSType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class TransferProblemWSType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransferProblemWSType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_DEPOSIT_NUMBER = "INVALID_DEPOSIT_NUMBER";
    public static final java.lang.String _INVALID_PRICE = "INVALID_PRICE";
    public static final java.lang.String _USER_PERMISSION_DENIED = "USER_PERMISSION_DENIED";
    public static final java.lang.String _INVALID_CURRENCY = "INVALID_CURRENCY";
    public static final java.lang.String _INSUFFICIENT_FUNDS = "INSUFFICIENT_FUNDS";
    public static final java.lang.String _ILLEGAL_DESTINATION_DEPOSIT_STATE = "ILLEGAL_DESTINATION_DEPOSIT_STATE";
    public static final java.lang.String _ILLEGAL_SOURCE_DEPOSIT_STATE = "ILLEGAL_SOURCE_DEPOSIT_STATE";
    public static final java.lang.String _DESTINATION_MAX_BALANCE_VIOLATION = "DESTINATION_MAX_BALANCE_VIOLATION";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final TransferProblemWSType INVALID_DEPOSIT_NUMBER = new TransferProblemWSType(_INVALID_DEPOSIT_NUMBER);
    public static final TransferProblemWSType INVALID_PRICE = new TransferProblemWSType(_INVALID_PRICE);
    public static final TransferProblemWSType USER_PERMISSION_DENIED = new TransferProblemWSType(_USER_PERMISSION_DENIED);
    public static final TransferProblemWSType INVALID_CURRENCY = new TransferProblemWSType(_INVALID_CURRENCY);
    public static final TransferProblemWSType INSUFFICIENT_FUNDS = new TransferProblemWSType(_INSUFFICIENT_FUNDS);
    public static final TransferProblemWSType ILLEGAL_DESTINATION_DEPOSIT_STATE = new TransferProblemWSType(_ILLEGAL_DESTINATION_DEPOSIT_STATE);
    public static final TransferProblemWSType ILLEGAL_SOURCE_DEPOSIT_STATE = new TransferProblemWSType(_ILLEGAL_SOURCE_DEPOSIT_STATE);
    public static final TransferProblemWSType DESTINATION_MAX_BALANCE_VIOLATION = new TransferProblemWSType(_DESTINATION_MAX_BALANCE_VIOLATION);
    public static final TransferProblemWSType UNKNOWN = new TransferProblemWSType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static TransferProblemWSType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransferProblemWSType enumeration = (TransferProblemWSType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransferProblemWSType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransferProblemWSType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transferProblemWSType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
