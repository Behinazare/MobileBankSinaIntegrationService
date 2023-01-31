/**
 * TransferProblemTypeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class TransferProblemTypeWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransferProblemTypeWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_DEPOSIT_NUMBER = "INVALID_DEPOSIT_NUMBER";
    public static final java.lang.String _INVALID_AMOUNT = "INVALID_AMOUNT";
    public static final java.lang.String _USER_PERMISSION_DENIED = "USER_PERMISSION_DENIED";
    public static final java.lang.String _INVALID_CURRENCY = "INVALID_CURRENCY";
    public static final java.lang.String _INSUFFICIENT_FUNDS = "INSUFFICIENT_FUNDS";
    public static final java.lang.String _ILLEGAL_DESTINATION_DEPOSIT_STATE = "ILLEGAL_DESTINATION_DEPOSIT_STATE";
    public static final java.lang.String _ILLEGAL_SOURCE_DEPOSIT_STATE = "ILLEGAL_SOURCE_DEPOSIT_STATE";
    public static final java.lang.String _DESTINATION_MAX_BALANCE_VIOLATION = "DESTINATION_MAX_BALANCE_VIOLATION";
    public static final java.lang.String _INVALID_PAYMENT_ID = "INVALID_PAYMENT_ID";
    public static final java.lang.String _PAY_ID_REQUIRED = "PAY_ID_REQUIRED";
    public static final java.lang.String _DOES_NOT_ACCEPT_PAY_ID = "DOES_NOT_ACCEPT_PAY_ID";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final TransferProblemTypeWS INVALID_DEPOSIT_NUMBER = new TransferProblemTypeWS(_INVALID_DEPOSIT_NUMBER);
    public static final TransferProblemTypeWS INVALID_AMOUNT = new TransferProblemTypeWS(_INVALID_AMOUNT);
    public static final TransferProblemTypeWS USER_PERMISSION_DENIED = new TransferProblemTypeWS(_USER_PERMISSION_DENIED);
    public static final TransferProblemTypeWS INVALID_CURRENCY = new TransferProblemTypeWS(_INVALID_CURRENCY);
    public static final TransferProblemTypeWS INSUFFICIENT_FUNDS = new TransferProblemTypeWS(_INSUFFICIENT_FUNDS);
    public static final TransferProblemTypeWS ILLEGAL_DESTINATION_DEPOSIT_STATE = new TransferProblemTypeWS(_ILLEGAL_DESTINATION_DEPOSIT_STATE);
    public static final TransferProblemTypeWS ILLEGAL_SOURCE_DEPOSIT_STATE = new TransferProblemTypeWS(_ILLEGAL_SOURCE_DEPOSIT_STATE);
    public static final TransferProblemTypeWS DESTINATION_MAX_BALANCE_VIOLATION = new TransferProblemTypeWS(_DESTINATION_MAX_BALANCE_VIOLATION);
    public static final TransferProblemTypeWS INVALID_PAYMENT_ID = new TransferProblemTypeWS(_INVALID_PAYMENT_ID);
    public static final TransferProblemTypeWS PAY_ID_REQUIRED = new TransferProblemTypeWS(_PAY_ID_REQUIRED);
    public static final TransferProblemTypeWS DOES_NOT_ACCEPT_PAY_ID = new TransferProblemTypeWS(_DOES_NOT_ACCEPT_PAY_ID);
    public static final TransferProblemTypeWS UNKNOWN = new TransferProblemTypeWS(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static TransferProblemTypeWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransferProblemTypeWS enumeration = (TransferProblemTypeWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransferProblemTypeWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransferProblemTypeWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transferProblemTypeWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
