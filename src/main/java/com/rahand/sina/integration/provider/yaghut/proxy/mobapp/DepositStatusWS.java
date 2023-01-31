/**
 * DepositStatusWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositStatusWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DepositStatusWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CLOSE = "CLOSE";
    public static final java.lang.String _OPEN = "OPEN";
    public static final java.lang.String _NEGATIVE_BLOCK = "NEGATIVE_BLOCK";
    public static final java.lang.String _POSITIVE_BLOCK = "POSITIVE_BLOCK";
    public static final java.lang.String _BLOCK = "BLOCK";
    public static final java.lang.String _RESTING = "RESTING";
    public static final java.lang.String _OLD = "OLD";
    public static final java.lang.String _OPENING = "OPENING";
    public static final DepositStatusWS CLOSE = new DepositStatusWS(_CLOSE);
    public static final DepositStatusWS OPEN = new DepositStatusWS(_OPEN);
    public static final DepositStatusWS NEGATIVE_BLOCK = new DepositStatusWS(_NEGATIVE_BLOCK);
    public static final DepositStatusWS POSITIVE_BLOCK = new DepositStatusWS(_POSITIVE_BLOCK);
    public static final DepositStatusWS BLOCK = new DepositStatusWS(_BLOCK);
    public static final DepositStatusWS RESTING = new DepositStatusWS(_RESTING);
    public static final DepositStatusWS OLD = new DepositStatusWS(_OLD);
    public static final DepositStatusWS OPENING = new DepositStatusWS(_OPENING);
    public java.lang.String getValue() { return _value_;}
    public static DepositStatusWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DepositStatusWS enumeration = (DepositStatusWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DepositStatusWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DepositStatusWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositStatusWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
