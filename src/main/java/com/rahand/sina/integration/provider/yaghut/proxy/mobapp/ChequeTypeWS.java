/**
 * ChequeTypeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ChequeTypeWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ChequeTypeWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CURRENT_CHEQUE = "CURRENT_CHEQUE";
    public static final java.lang.String _BANK_DRAFT_CHEQUE = "BANK_DRAFT_CHEQUE";
    public static final java.lang.String _GUARANTEE_CHEQUE = "GUARANTEE_CHEQUE";
    public static final java.lang.String _TRAVELS_CHEQUE = "TRAVELS_CHEQUE";
    public static final java.lang.String _OTHERS_CHEQUE = "OTHERS_CHEQUE";
    public static final java.lang.String _BANK_CHEQUE = "BANK_CHEQUE";
    public static final java.lang.String _IRAN_CHEQUE = "IRAN_CHEQUE";
    public static final ChequeTypeWS CURRENT_CHEQUE = new ChequeTypeWS(_CURRENT_CHEQUE);
    public static final ChequeTypeWS BANK_DRAFT_CHEQUE = new ChequeTypeWS(_BANK_DRAFT_CHEQUE);
    public static final ChequeTypeWS GUARANTEE_CHEQUE = new ChequeTypeWS(_GUARANTEE_CHEQUE);
    public static final ChequeTypeWS TRAVELS_CHEQUE = new ChequeTypeWS(_TRAVELS_CHEQUE);
    public static final ChequeTypeWS OTHERS_CHEQUE = new ChequeTypeWS(_OTHERS_CHEQUE);
    public static final ChequeTypeWS BANK_CHEQUE = new ChequeTypeWS(_BANK_CHEQUE);
    public static final ChequeTypeWS IRAN_CHEQUE = new ChequeTypeWS(_IRAN_CHEQUE);
    public java.lang.String getValue() { return _value_;}
    public static ChequeTypeWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ChequeTypeWS enumeration = (ChequeTypeWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ChequeTypeWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ChequeTypeWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chequeTypeWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
