/**
 * ProblemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ProblemType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProblemType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_DEPOSIT_NUMBER = "INVALID_DEPOSIT_NUMBER";
    public static final java.lang.String _INVALID_PRICE = "INVALID_PRICE";
    public static final java.lang.String _USER_PERMISSION_DENIED = "USER_PERMISSION_DENIED";
    public static final java.lang.String _INVALID_CURRENCY = "INVALID_CURRENCY";
    public static final java.lang.String _INSUFFICIENT_FUNDS = "INSUFFICIENT_FUNDS";
    public static final java.lang.String _ILLEGAL_DEPOSIT_STATE = "ILLEGAL_DEPOSIT_STATE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ProblemType INVALID_DEPOSIT_NUMBER = new ProblemType(_INVALID_DEPOSIT_NUMBER);
    public static final ProblemType INVALID_PRICE = new ProblemType(_INVALID_PRICE);
    public static final ProblemType USER_PERMISSION_DENIED = new ProblemType(_USER_PERMISSION_DENIED);
    public static final ProblemType INVALID_CURRENCY = new ProblemType(_INVALID_CURRENCY);
    public static final ProblemType INSUFFICIENT_FUNDS = new ProblemType(_INSUFFICIENT_FUNDS);
    public static final ProblemType ILLEGAL_DEPOSIT_STATE = new ProblemType(_ILLEGAL_DEPOSIT_STATE);
    public static final ProblemType UNKNOWN = new ProblemType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ProblemType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProblemType enumeration = (ProblemType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProblemType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProblemType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "problemType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
