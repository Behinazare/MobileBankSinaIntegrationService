/**
 * CardStatusCause.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardStatusCause implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CardStatusCause(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _STOLEN_CARD = "STOLEN_CARD";
    public static final java.lang.String _LOST_CARD = "LOST_CARD";
    public static final java.lang.String _ARBITRATION_FIAT = "ARBITRATION_FIAT";
    public static final java.lang.String _REPLICATED_CARD = "REPLICATED_CARD";
    public static final java.lang.String _EXPIRED_CARD = "EXPIRED_CARD";
    public static final java.lang.String _PIN_TRYIES_EXCCEDED = "PIN_TRYIES_EXCCEDED";
    public static final java.lang.String _REPLICATED_CARD_CAPTURED = "REPLICATED_CARD_CAPTURED";
    public static final java.lang.String _OTHER = "OTHER";
    public static final CardStatusCause OK = new CardStatusCause(_OK);
    public static final CardStatusCause STOLEN_CARD = new CardStatusCause(_STOLEN_CARD);
    public static final CardStatusCause LOST_CARD = new CardStatusCause(_LOST_CARD);
    public static final CardStatusCause ARBITRATION_FIAT = new CardStatusCause(_ARBITRATION_FIAT);
    public static final CardStatusCause REPLICATED_CARD = new CardStatusCause(_REPLICATED_CARD);
    public static final CardStatusCause EXPIRED_CARD = new CardStatusCause(_EXPIRED_CARD);
    public static final CardStatusCause PIN_TRYIES_EXCCEDED = new CardStatusCause(_PIN_TRYIES_EXCCEDED);
    public static final CardStatusCause REPLICATED_CARD_CAPTURED = new CardStatusCause(_REPLICATED_CARD_CAPTURED);
    public static final CardStatusCause OTHER = new CardStatusCause(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static CardStatusCause fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CardStatusCause enumeration = (CardStatusCause)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CardStatusCause fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CardStatusCause.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardStatusCause"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
