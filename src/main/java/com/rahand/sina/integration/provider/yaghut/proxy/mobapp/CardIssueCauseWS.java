/**
 * CardIssueCauseWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardIssueCauseWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CardIssueCauseWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FIRST_ISSUE = "FIRST_ISSUE";
    public static final java.lang.String _FAILURED = "FAILURED";
    public static final java.lang.String _REDUPLICATE = "REDUPLICATE";
    public static final java.lang.String _PRE_PAID = "PRE_PAID";
    public static final java.lang.String _SALED_PRE_PAID = "SALED_PRE_PAID";
    public static final java.lang.String _WEB_GOODS_CARD = "WEB_GOODS_CARD";
    public static final java.lang.String _NO_NAME_CHARGABLE = "NO_NAME_CHARGABLE";
    public static final java.lang.String _FUEL = "FUEL";
    public static final CardIssueCauseWS FIRST_ISSUE = new CardIssueCauseWS(_FIRST_ISSUE);
    public static final CardIssueCauseWS FAILURED = new CardIssueCauseWS(_FAILURED);
    public static final CardIssueCauseWS REDUPLICATE = new CardIssueCauseWS(_REDUPLICATE);
    public static final CardIssueCauseWS PRE_PAID = new CardIssueCauseWS(_PRE_PAID);
    public static final CardIssueCauseWS SALED_PRE_PAID = new CardIssueCauseWS(_SALED_PRE_PAID);
    public static final CardIssueCauseWS WEB_GOODS_CARD = new CardIssueCauseWS(_WEB_GOODS_CARD);
    public static final CardIssueCauseWS NO_NAME_CHARGABLE = new CardIssueCauseWS(_NO_NAME_CHARGABLE);
    public static final CardIssueCauseWS FUEL = new CardIssueCauseWS(_FUEL);
    public java.lang.String getValue() { return _value_;}
    public static CardIssueCauseWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CardIssueCauseWS enumeration = (CardIssueCauseWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CardIssueCauseWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CardIssueCauseWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardIssueCauseWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
