/**
 * CreditDossierStatusWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CreditDossierStatusWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreditDossierStatusWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _GENERATED = "GENERATED";
    public static final java.lang.String _FEE_PAID = "FEE_PAID";
    public static final java.lang.String _APPROVED = "APPROVED";
    public static final java.lang.String _CARD_REQUESTED = "CARD_REQUESTED";
    public static final java.lang.String _ACTIVE = "ACTIVE";
    public static final java.lang.String _BLOCKED = "BLOCKED";
    public static final java.lang.String _SETTLEMENT_REQUESTED = "SETTLEMENT_REQUESTED";
    public static final java.lang.String _CLOSED = "CLOSED";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _CONTRACT_ISSUED = "CONTRACT_ISSUED";
    public static final java.lang.String _DELETED = "DELETED";
    public static final java.lang.String _TEMPORARY_BLOCKED = "TEMPORARY_BLOCKED";
    public static final CreditDossierStatusWS GENERATED = new CreditDossierStatusWS(_GENERATED);
    public static final CreditDossierStatusWS FEE_PAID = new CreditDossierStatusWS(_FEE_PAID);
    public static final CreditDossierStatusWS APPROVED = new CreditDossierStatusWS(_APPROVED);
    public static final CreditDossierStatusWS CARD_REQUESTED = new CreditDossierStatusWS(_CARD_REQUESTED);
    public static final CreditDossierStatusWS ACTIVE = new CreditDossierStatusWS(_ACTIVE);
    public static final CreditDossierStatusWS BLOCKED = new CreditDossierStatusWS(_BLOCKED);
    public static final CreditDossierStatusWS SETTLEMENT_REQUESTED = new CreditDossierStatusWS(_SETTLEMENT_REQUESTED);
    public static final CreditDossierStatusWS CLOSED = new CreditDossierStatusWS(_CLOSED);
    public static final CreditDossierStatusWS EXPIRED = new CreditDossierStatusWS(_EXPIRED);
    public static final CreditDossierStatusWS CONTRACT_ISSUED = new CreditDossierStatusWS(_CONTRACT_ISSUED);
    public static final CreditDossierStatusWS DELETED = new CreditDossierStatusWS(_DELETED);
    public static final CreditDossierStatusWS TEMPORARY_BLOCKED = new CreditDossierStatusWS(_TEMPORARY_BLOCKED);
    public java.lang.String getValue() { return _value_;}
    public static CreditDossierStatusWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreditDossierStatusWS enumeration = (CreditDossierStatusWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreditDossierStatusWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreditDossierStatusWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "creditDossierStatusWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
