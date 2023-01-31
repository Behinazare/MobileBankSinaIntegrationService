/**
 * DossierCycleLengthWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DossierCycleLengthWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DossierCycleLengthWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INFINITE = "INFINITE";
    public static final java.lang.String _BETWEEN_1_79_DAYS = "BETWEEN_1_79_DAYS";
    public static final java.lang.String _WEEKLY = "WEEKLY";
    public static final java.lang.String _TOW_WEEKLY = "TOW_WEEKLY";
    public static final java.lang.String _FIFTEEN_DAYS = "FIFTEEN_DAYS";
    public static final java.lang.String _MONTHLY = "MONTHLY";
    public static final java.lang.String _THREE_MONTHLY = "THREE_MONTHLY";
    public static final java.lang.String _SIX_MONTHLY = "SIX_MONTHLY";
    public static final DossierCycleLengthWS INFINITE = new DossierCycleLengthWS(_INFINITE);
    public static final DossierCycleLengthWS BETWEEN_1_79_DAYS = new DossierCycleLengthWS(_BETWEEN_1_79_DAYS);
    public static final DossierCycleLengthWS WEEKLY = new DossierCycleLengthWS(_WEEKLY);
    public static final DossierCycleLengthWS TOW_WEEKLY = new DossierCycleLengthWS(_TOW_WEEKLY);
    public static final DossierCycleLengthWS FIFTEEN_DAYS = new DossierCycleLengthWS(_FIFTEEN_DAYS);
    public static final DossierCycleLengthWS MONTHLY = new DossierCycleLengthWS(_MONTHLY);
    public static final DossierCycleLengthWS THREE_MONTHLY = new DossierCycleLengthWS(_THREE_MONTHLY);
    public static final DossierCycleLengthWS SIX_MONTHLY = new DossierCycleLengthWS(_SIX_MONTHLY);
    public java.lang.String getValue() { return _value_;}
    public static DossierCycleLengthWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DossierCycleLengthWS enumeration = (DossierCycleLengthWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DossierCycleLengthWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DossierCycleLengthWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "dossierCycleLengthWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
