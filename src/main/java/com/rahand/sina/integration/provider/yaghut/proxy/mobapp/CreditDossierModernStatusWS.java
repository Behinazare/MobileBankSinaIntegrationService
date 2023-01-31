/**
 * CreditDossierModernStatusWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CreditDossierModernStatusWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreditDossierModernStatusWS(java.lang.String value) {
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
    public static final CreditDossierModernStatusWS GENERATED = new CreditDossierModernStatusWS(_GENERATED);
    public static final CreditDossierModernStatusWS FEE_PAID = new CreditDossierModernStatusWS(_FEE_PAID);
    public static final CreditDossierModernStatusWS APPROVED = new CreditDossierModernStatusWS(_APPROVED);
    public static final CreditDossierModernStatusWS CARD_REQUESTED = new CreditDossierModernStatusWS(_CARD_REQUESTED);
    public static final CreditDossierModernStatusWS ACTIVE = new CreditDossierModernStatusWS(_ACTIVE);
    public static final CreditDossierModernStatusWS BLOCKED = new CreditDossierModernStatusWS(_BLOCKED);
    public static final CreditDossierModernStatusWS SETTLEMENT_REQUESTED = new CreditDossierModernStatusWS(_SETTLEMENT_REQUESTED);
    public static final CreditDossierModernStatusWS CLOSED = new CreditDossierModernStatusWS(_CLOSED);
    public static final CreditDossierModernStatusWS EXPIRED = new CreditDossierModernStatusWS(_EXPIRED);
    public static final CreditDossierModernStatusWS CONTRACT_ISSUED = new CreditDossierModernStatusWS(_CONTRACT_ISSUED);
    public static final CreditDossierModernStatusWS DELETED = new CreditDossierModernStatusWS(_DELETED);
    public static final CreditDossierModernStatusWS TEMPORARY_BLOCKED = new CreditDossierModernStatusWS(_TEMPORARY_BLOCKED);
    public java.lang.String getValue() { return _value_;}
    public static CreditDossierModernStatusWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreditDossierModernStatusWS enumeration = (CreditDossierModernStatusWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreditDossierModernStatusWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreditDossierModernStatusWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "creditDossierModernStatusWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
