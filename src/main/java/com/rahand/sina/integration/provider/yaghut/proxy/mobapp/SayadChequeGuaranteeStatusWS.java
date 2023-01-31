/**
 * SayadChequeGuaranteeStatusWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SayadChequeGuaranteeStatusWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SayadChequeGuaranteeStatusWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NO_GUARANTEE = "NO_GUARANTEE";
    public static final java.lang.String _IN_PROGRESS = "IN_PROGRESS";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _CONFIRMED_BY_ALL = "CONFIRMED_BY_ALL";
    public static final java.lang.String _REJECTED = "REJECTED";
    public static final java.lang.String _GUARANTEED = "GUARANTEED";
    public static final SayadChequeGuaranteeStatusWS NO_GUARANTEE = new SayadChequeGuaranteeStatusWS(_NO_GUARANTEE);
    public static final SayadChequeGuaranteeStatusWS IN_PROGRESS = new SayadChequeGuaranteeStatusWS(_IN_PROGRESS);
    public static final SayadChequeGuaranteeStatusWS EXPIRED = new SayadChequeGuaranteeStatusWS(_EXPIRED);
    public static final SayadChequeGuaranteeStatusWS CONFIRMED_BY_ALL = new SayadChequeGuaranteeStatusWS(_CONFIRMED_BY_ALL);
    public static final SayadChequeGuaranteeStatusWS REJECTED = new SayadChequeGuaranteeStatusWS(_REJECTED);
    public static final SayadChequeGuaranteeStatusWS GUARANTEED = new SayadChequeGuaranteeStatusWS(_GUARANTEED);
    public java.lang.String getValue() { return _value_;}
    public static SayadChequeGuaranteeStatusWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SayadChequeGuaranteeStatusWS enumeration = (SayadChequeGuaranteeStatusWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SayadChequeGuaranteeStatusWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SayadChequeGuaranteeStatusWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeGuaranteeStatusWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
