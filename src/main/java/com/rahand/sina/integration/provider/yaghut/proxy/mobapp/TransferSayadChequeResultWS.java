/**
 * TransferSayadChequeResultWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class TransferSayadChequeResultWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransferSayadChequeResultWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _COMPLETED = "COMPLETED";
    public static final java.lang.String _REGISTERED_AND_WAITING = "REGISTERED_AND_WAITING";
    public static final java.lang.String _CONFIRMED_AND_WAITING = "CONFIRMED_AND_WAITING";
    public static final java.lang.String _CONFIRMED_BY_ALL = "CONFIRMED_BY_ALL";
    public static final java.lang.String _CANCELED = "CANCELED";
    public static final TransferSayadChequeResultWS COMPLETED = new TransferSayadChequeResultWS(_COMPLETED);
    public static final TransferSayadChequeResultWS REGISTERED_AND_WAITING = new TransferSayadChequeResultWS(_REGISTERED_AND_WAITING);
    public static final TransferSayadChequeResultWS CONFIRMED_AND_WAITING = new TransferSayadChequeResultWS(_CONFIRMED_AND_WAITING);
    public static final TransferSayadChequeResultWS CONFIRMED_BY_ALL = new TransferSayadChequeResultWS(_CONFIRMED_BY_ALL);
    public static final TransferSayadChequeResultWS CANCELED = new TransferSayadChequeResultWS(_CANCELED);
    public java.lang.String getValue() { return _value_;}
    public static TransferSayadChequeResultWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransferSayadChequeResultWS enumeration = (TransferSayadChequeResultWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransferSayadChequeResultWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransferSayadChequeResultWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transferSayadChequeResultWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
