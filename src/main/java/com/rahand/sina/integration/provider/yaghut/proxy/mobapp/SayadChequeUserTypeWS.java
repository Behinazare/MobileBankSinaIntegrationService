/**
 * SayadChequeUserTypeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SayadChequeUserTypeWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SayadChequeUserTypeWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ISSUER = "ISSUER";
    public static final java.lang.String _RECEIVER = "RECEIVER";
    public static final java.lang.String _HOLDER = "HOLDER";
    public static final java.lang.String _AGENT = "AGENT";
    public static final java.lang.String _SIGNER = "SIGNER";
    public static final SayadChequeUserTypeWS ISSUER = new SayadChequeUserTypeWS(_ISSUER);
    public static final SayadChequeUserTypeWS RECEIVER = new SayadChequeUserTypeWS(_RECEIVER);
    public static final SayadChequeUserTypeWS HOLDER = new SayadChequeUserTypeWS(_HOLDER);
    public static final SayadChequeUserTypeWS AGENT = new SayadChequeUserTypeWS(_AGENT);
    public static final SayadChequeUserTypeWS SIGNER = new SayadChequeUserTypeWS(_SIGNER);
    public java.lang.String getValue() { return _value_;}
    public static SayadChequeUserTypeWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SayadChequeUserTypeWS enumeration = (SayadChequeUserTypeWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SayadChequeUserTypeWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SayadChequeUserTypeWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeUserTypeWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
