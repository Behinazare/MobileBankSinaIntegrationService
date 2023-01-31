/**
 * SellOrderField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SellOrderField implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SellOrderField(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TRANSACTION_TYPE = "TRANSACTION_TYPE";
    public static final java.lang.String _CARD_PAN = "CARD_PAN";
    public static final java.lang.String _MERCHANT_ID = "MERCHANT_ID";
    public static final java.lang.String _AMOUNT = "AMOUNT";
    public static final java.lang.String _TRANSACTION_TIME = "TRANSACTION_TIME";
    public static final java.lang.String _RRN = "RRN";
    public static final java.lang.String _DONE = "DONE";
    public static final java.lang.String _CHANNEL = "CHANNEL";
    public static final java.lang.String _VERIFICATION_COUNT = "VERIFICATION_COUNT";
    public static final java.lang.String _MERCHANT_ASSIGNED_CODE = "MERCHANT_ASSIGNED_CODE";
    public static final java.lang.String _BILL_TYPE = "BILL_TYPE";
    public static final java.lang.String _BILL_ID = "BILL_ID";
    public static final java.lang.String _PAYMENT_ID = "PAYMENT_ID";
    public static final SellOrderField TRANSACTION_TYPE = new SellOrderField(_TRANSACTION_TYPE);
    public static final SellOrderField CARD_PAN = new SellOrderField(_CARD_PAN);
    public static final SellOrderField MERCHANT_ID = new SellOrderField(_MERCHANT_ID);
    public static final SellOrderField AMOUNT = new SellOrderField(_AMOUNT);
    public static final SellOrderField TRANSACTION_TIME = new SellOrderField(_TRANSACTION_TIME);
    public static final SellOrderField RRN = new SellOrderField(_RRN);
    public static final SellOrderField DONE = new SellOrderField(_DONE);
    public static final SellOrderField CHANNEL = new SellOrderField(_CHANNEL);
    public static final SellOrderField VERIFICATION_COUNT = new SellOrderField(_VERIFICATION_COUNT);
    public static final SellOrderField MERCHANT_ASSIGNED_CODE = new SellOrderField(_MERCHANT_ASSIGNED_CODE);
    public static final SellOrderField BILL_TYPE = new SellOrderField(_BILL_TYPE);
    public static final SellOrderField BILL_ID = new SellOrderField(_BILL_ID);
    public static final SellOrderField PAYMENT_ID = new SellOrderField(_PAYMENT_ID);
    public java.lang.String getValue() { return _value_;}
    public static SellOrderField fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SellOrderField enumeration = (SellOrderField)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SellOrderField fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SellOrderField.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellOrderField"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
