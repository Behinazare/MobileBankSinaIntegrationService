/**
 * FeeTypeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class FeeTypeWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeeTypeWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TRANSACTION = "TRANSACTION";
    public static final java.lang.String _TRANSACTION_PROCESSING = "TRANSACTION_PROCESSING";
    public static final java.lang.String _SURCHARGE = "SURCHARGE";
    public static final java.lang.String _SUSPEND_PAY_LATEN = "SUSPEND_PAY_LATEN";
    public static final java.lang.String _STAMP_TAX = "STAMP_TAX";
    public static final java.lang.String _UNUSED_CREDIT = "UNUSED_CREDIT";
    public static final java.lang.String _TRANSFER_TO_NEXT = "TRANSFER_TO_NEXT";
    public static final java.lang.String _RETURN = "RETURN";
    public static final java.lang.String _GOOD_AND_SERVICE = "GOOD_AND_SERVICE";
    public static final java.lang.String _CASH = "CASH";
    public static final java.lang.String _YEARLY = "YEARLY";
    public static final java.lang.String _CARD_ISSUE = "CARD_ISSUE";
    public static final java.lang.String _UN_BLOCK = "UN_BLOCK";
    public static final java.lang.String _UN_REVOKE = "UN_REVOKE";
    public static final java.lang.String _CHANGES = "CHANGES";
    public static final java.lang.String _BILLING = "BILLING";
    public static final java.lang.String _BILL_TYPE = "BILL_TYPE";
    public static final java.lang.String _PAY_LATEN = "PAY_LATEN";
    public static final java.lang.String _INSURANCE = "INSURANCE";
    public static final FeeTypeWS TRANSACTION = new FeeTypeWS(_TRANSACTION);
    public static final FeeTypeWS TRANSACTION_PROCESSING = new FeeTypeWS(_TRANSACTION_PROCESSING);
    public static final FeeTypeWS SURCHARGE = new FeeTypeWS(_SURCHARGE);
    public static final FeeTypeWS SUSPEND_PAY_LATEN = new FeeTypeWS(_SUSPEND_PAY_LATEN);
    public static final FeeTypeWS STAMP_TAX = new FeeTypeWS(_STAMP_TAX);
    public static final FeeTypeWS UNUSED_CREDIT = new FeeTypeWS(_UNUSED_CREDIT);
    public static final FeeTypeWS TRANSFER_TO_NEXT = new FeeTypeWS(_TRANSFER_TO_NEXT);
    public static final FeeTypeWS RETURN = new FeeTypeWS(_RETURN);
    public static final FeeTypeWS GOOD_AND_SERVICE = new FeeTypeWS(_GOOD_AND_SERVICE);
    public static final FeeTypeWS CASH = new FeeTypeWS(_CASH);
    public static final FeeTypeWS YEARLY = new FeeTypeWS(_YEARLY);
    public static final FeeTypeWS CARD_ISSUE = new FeeTypeWS(_CARD_ISSUE);
    public static final FeeTypeWS UN_BLOCK = new FeeTypeWS(_UN_BLOCK);
    public static final FeeTypeWS UN_REVOKE = new FeeTypeWS(_UN_REVOKE);
    public static final FeeTypeWS CHANGES = new FeeTypeWS(_CHANGES);
    public static final FeeTypeWS BILLING = new FeeTypeWS(_BILLING);
    public static final FeeTypeWS BILL_TYPE = new FeeTypeWS(_BILL_TYPE);
    public static final FeeTypeWS PAY_LATEN = new FeeTypeWS(_PAY_LATEN);
    public static final FeeTypeWS INSURANCE = new FeeTypeWS(_INSURANCE);
    public java.lang.String getValue() { return _value_;}
    public static FeeTypeWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeeTypeWS enumeration = (FeeTypeWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeeTypeWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeeTypeWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "feeTypeWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
