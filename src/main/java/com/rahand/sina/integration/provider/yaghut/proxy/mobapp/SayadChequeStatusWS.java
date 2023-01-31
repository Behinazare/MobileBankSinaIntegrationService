/**
 * SayadChequeStatusWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SayadChequeStatusWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SayadChequeStatusWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ISSUED = "ISSUED";
    public static final java.lang.String _CASHED = "CASHED";
    public static final java.lang.String _CANCELED = "CANCELED";
    public static final java.lang.String _RETURNED = "RETURNED";
    public static final java.lang.String _PART_RETURNED = "PART_RETURNED";
    public static final java.lang.String _WAITING_FOR_SIGNATURE = "WAITING_FOR_SIGNATURE";
    public static final java.lang.String _ISSUING_IS_WAITED = "ISSUING_IS_WAITED";
    public static final java.lang.String _TRANSFERING_IS_WAITED = "TRANSFERING_IS_WAITED";
    public static final SayadChequeStatusWS ISSUED = new SayadChequeStatusWS(_ISSUED);
    public static final SayadChequeStatusWS CASHED = new SayadChequeStatusWS(_CASHED);
    public static final SayadChequeStatusWS CANCELED = new SayadChequeStatusWS(_CANCELED);
    public static final SayadChequeStatusWS RETURNED = new SayadChequeStatusWS(_RETURNED);
    public static final SayadChequeStatusWS PART_RETURNED = new SayadChequeStatusWS(_PART_RETURNED);
    public static final SayadChequeStatusWS WAITING_FOR_SIGNATURE = new SayadChequeStatusWS(_WAITING_FOR_SIGNATURE);
    public static final SayadChequeStatusWS ISSUING_IS_WAITED = new SayadChequeStatusWS(_ISSUING_IS_WAITED);
    public static final SayadChequeStatusWS TRANSFERING_IS_WAITED = new SayadChequeStatusWS(_TRANSFERING_IS_WAITED);
    public java.lang.String getValue() { return _value_;}
    public static SayadChequeStatusWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SayadChequeStatusWS enumeration = (SayadChequeStatusWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SayadChequeStatusWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SayadChequeStatusWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeStatusWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
