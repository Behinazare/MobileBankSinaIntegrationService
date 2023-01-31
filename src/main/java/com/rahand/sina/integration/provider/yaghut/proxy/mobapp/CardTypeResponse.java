/**
 * CardTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardTypeResponse implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CardTypeResponse(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DEBIT = "DEBIT";
    public static final java.lang.String _CREDIT = "CREDIT";
    public static final java.lang.String _GIFT = "GIFT";
    public static final java.lang.String _CORPORATION = "CORPORATION";
    public static final java.lang.String _LOAN = "LOAN";
    public static final java.lang.String _DEPOSIT = "DEPOSIT";
    public static final CardTypeResponse DEBIT = new CardTypeResponse(_DEBIT);
    public static final CardTypeResponse CREDIT = new CardTypeResponse(_CREDIT);
    public static final CardTypeResponse GIFT = new CardTypeResponse(_GIFT);
    public static final CardTypeResponse CORPORATION = new CardTypeResponse(_CORPORATION);
    public static final CardTypeResponse LOAN = new CardTypeResponse(_LOAN);
    public static final CardTypeResponse DEPOSIT = new CardTypeResponse(_DEPOSIT);
    public java.lang.String getValue() { return _value_;}
    public static CardTypeResponse fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CardTypeResponse enumeration = (CardTypeResponse)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CardTypeResponse fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CardTypeResponse.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardTypeResponse"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
