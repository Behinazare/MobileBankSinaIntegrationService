/**
 * ChargeCardErrorTypeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ChargeCardErrorTypeWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ChargeCardErrorTypeWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ServiceException = "ServiceException";
    public static final java.lang.String _PermissionException = "PermissionException";
    public static final java.lang.String _InvalidDepositException = "InvalidDepositException";
    public static final java.lang.String _InsufficientFundsException = "InsufficientFundsException";
    public static final java.lang.String _InvalidCardException = "InvalidCardException";
    public static final java.lang.String _InvalidCardStatusException = "InvalidCardStatusException";
    public static final java.lang.String _AmountCostraintException = "AmountCostraintException";
    public static final java.lang.String _MultiCurrencyNotSupportedException = "MultiCurrencyNotSupportedException";
    public static final ChargeCardErrorTypeWS ServiceException = new ChargeCardErrorTypeWS(_ServiceException);
    public static final ChargeCardErrorTypeWS PermissionException = new ChargeCardErrorTypeWS(_PermissionException);
    public static final ChargeCardErrorTypeWS InvalidDepositException = new ChargeCardErrorTypeWS(_InvalidDepositException);
    public static final ChargeCardErrorTypeWS InsufficientFundsException = new ChargeCardErrorTypeWS(_InsufficientFundsException);
    public static final ChargeCardErrorTypeWS InvalidCardException = new ChargeCardErrorTypeWS(_InvalidCardException);
    public static final ChargeCardErrorTypeWS InvalidCardStatusException = new ChargeCardErrorTypeWS(_InvalidCardStatusException);
    public static final ChargeCardErrorTypeWS AmountCostraintException = new ChargeCardErrorTypeWS(_AmountCostraintException);
    public static final ChargeCardErrorTypeWS MultiCurrencyNotSupportedException = new ChargeCardErrorTypeWS(_MultiCurrencyNotSupportedException);
    public java.lang.String getValue() { return _value_;}
    public static ChargeCardErrorTypeWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ChargeCardErrorTypeWS enumeration = (ChargeCardErrorTypeWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ChargeCardErrorTypeWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ChargeCardErrorTypeWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chargeCardErrorTypeWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
