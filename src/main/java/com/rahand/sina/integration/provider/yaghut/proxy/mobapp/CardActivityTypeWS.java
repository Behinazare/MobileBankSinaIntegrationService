/**
 * CardActivityTypeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardActivityTypeWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CardActivityTypeWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TRANSFER = "TRANSFER";
    public static final java.lang.String _BILL_PAYMENT = "BILL_PAYMENT";
    public static final java.lang.String _PURCHASE = "PURCHASE";
    public static final java.lang.String _DEPOSIT = "DEPOSIT";
    public static final java.lang.String _WITHDRAWAL = "WITHDRAWAL";
    public static final java.lang.String _CHARGE_BACK = "CHARGE_BACK";
    public static final java.lang.String _CHANGE_SECOND_PIN = "CHANGE_SECOND_PIN";
    public static final java.lang.String _CHANGE_FIRST_PIN = "CHANGE_FIRST_PIN";
    public static final java.lang.String _UNBLOCK = "UNBLOCK";
    public static final java.lang.String _CAPTURED = "CAPTURED";
    public static final java.lang.String _STATEMENT = "STATEMENT";
    public static final java.lang.String _BALANCE = "BALANCE";
    public static final java.lang.String _RETURN = "RETURN";
    public static final java.lang.String _OTHER = "OTHER";
    public static final java.lang.String _CREDIT_DEBIT = "CREDIT_DEBIT";
    public static final CardActivityTypeWS TRANSFER = new CardActivityTypeWS(_TRANSFER);
    public static final CardActivityTypeWS BILL_PAYMENT = new CardActivityTypeWS(_BILL_PAYMENT);
    public static final CardActivityTypeWS PURCHASE = new CardActivityTypeWS(_PURCHASE);
    public static final CardActivityTypeWS DEPOSIT = new CardActivityTypeWS(_DEPOSIT);
    public static final CardActivityTypeWS WITHDRAWAL = new CardActivityTypeWS(_WITHDRAWAL);
    public static final CardActivityTypeWS CHARGE_BACK = new CardActivityTypeWS(_CHARGE_BACK);
    public static final CardActivityTypeWS CHANGE_SECOND_PIN = new CardActivityTypeWS(_CHANGE_SECOND_PIN);
    public static final CardActivityTypeWS CHANGE_FIRST_PIN = new CardActivityTypeWS(_CHANGE_FIRST_PIN);
    public static final CardActivityTypeWS UNBLOCK = new CardActivityTypeWS(_UNBLOCK);
    public static final CardActivityTypeWS CAPTURED = new CardActivityTypeWS(_CAPTURED);
    public static final CardActivityTypeWS STATEMENT = new CardActivityTypeWS(_STATEMENT);
    public static final CardActivityTypeWS BALANCE = new CardActivityTypeWS(_BALANCE);
    public static final CardActivityTypeWS RETURN = new CardActivityTypeWS(_RETURN);
    public static final CardActivityTypeWS OTHER = new CardActivityTypeWS(_OTHER);
    public static final CardActivityTypeWS CREDIT_DEBIT = new CardActivityTypeWS(_CREDIT_DEBIT);
    public java.lang.String getValue() { return _value_;}
    public static CardActivityTypeWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CardActivityTypeWS enumeration = (CardActivityTypeWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CardActivityTypeWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CardActivityTypeWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardActivityTypeWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
