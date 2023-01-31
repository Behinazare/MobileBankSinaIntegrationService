/**
 * CardState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CardState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _HOT = "HOT";
    public static final java.lang.String _WARM = "WARM";
    public static final java.lang.String _BLOCKED = "BLOCKED";
    public static final java.lang.String _CAPTURED = "CAPTURED";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _INACTIVE = "INACTIVE";
    public static final java.lang.String _SETTLEMENT = "SETTLEMENT";
    public static final java.lang.String _CLOSED = "CLOSED";
    public static final java.lang.String _DISABLE = "DISABLE";
    public static final CardState OK = new CardState(_OK);
    public static final CardState HOT = new CardState(_HOT);
    public static final CardState WARM = new CardState(_WARM);
    public static final CardState BLOCKED = new CardState(_BLOCKED);
    public static final CardState CAPTURED = new CardState(_CAPTURED);
    public static final CardState EXPIRED = new CardState(_EXPIRED);
    public static final CardState INACTIVE = new CardState(_INACTIVE);
    public static final CardState SETTLEMENT = new CardState(_SETTLEMENT);
    public static final CardState CLOSED = new CardState(_CLOSED);
    public static final CardState DISABLE = new CardState(_DISABLE);
    public java.lang.String getValue() { return _value_;}
    public static CardState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CardState enumeration = (CardState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CardState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CardState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
