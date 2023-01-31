/**
 * CardTemplateUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardTemplateUsage implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CardTemplateUsage(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FIRST_ISSUE = "FIRST_ISSUE";
    public static final java.lang.String _GIFT_CARD = "GIFT_CARD";
    public static final java.lang.String _INTERNET_PURCHASE_CARD = "INTERNET_PURCHASE_CARD";
    public static final java.lang.String _CHARGABLE_CARD = "CHARGABLE_CARD";
    public static final java.lang.String _MULTI_PURPOSE_CHARGABLE_CARD = "MULTI_PURPOSE_CHARGABLE_CARD";
    public static final java.lang.String _FAMILY_CARD = "FAMILY_CARD";
    public static final java.lang.String _VIRTUAL_CARD = "VIRTUAL_CARD";
    public static final CardTemplateUsage FIRST_ISSUE = new CardTemplateUsage(_FIRST_ISSUE);
    public static final CardTemplateUsage GIFT_CARD = new CardTemplateUsage(_GIFT_CARD);
    public static final CardTemplateUsage INTERNET_PURCHASE_CARD = new CardTemplateUsage(_INTERNET_PURCHASE_CARD);
    public static final CardTemplateUsage CHARGABLE_CARD = new CardTemplateUsage(_CHARGABLE_CARD);
    public static final CardTemplateUsage MULTI_PURPOSE_CHARGABLE_CARD = new CardTemplateUsage(_MULTI_PURPOSE_CHARGABLE_CARD);
    public static final CardTemplateUsage FAMILY_CARD = new CardTemplateUsage(_FAMILY_CARD);
    public static final CardTemplateUsage VIRTUAL_CARD = new CardTemplateUsage(_VIRTUAL_CARD);
    public java.lang.String getValue() { return _value_;}
    public static CardTemplateUsage fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CardTemplateUsage enumeration = (CardTemplateUsage)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CardTemplateUsage fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CardTemplateUsage.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardTemplateUsage"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
