/**
 * CreditDossierOrderFieldWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CreditDossierOrderFieldWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreditDossierOrderFieldWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NUMBER = "NUMBER";
    public static final java.lang.String _STATUS = "STATUS";
    public static final java.lang.String _AVAILABLE_FUNDS = "AVAILABLE_FUNDS";
    public static final java.lang.String _TOTAL_FUNDS = "TOTAL_FUNDS";
    public static final java.lang.String _CYCLE_LENGTH = "CYCLE_LENGTH";
    public static final java.lang.String _OPENING_DATE = "OPENING_DATE";
    public static final java.lang.String _EXPIRE_DATE = "EXPIRE_DATE";
    public static final java.lang.String _PAN = "PAN";
    public static final java.lang.String _CARD_HOLDER_NAME = "CARD_HOLDER_NAME";
    public static final java.lang.String _CARD_HOLDER_NATIONAL_CODE = "CARD_HOLDER_NATIONAL_CODE";
    public static final java.lang.String _CARD_STATUS = "CARD_STATUS";
    public static final java.lang.String _CARD_ISSUE_CAUSE = "CARD_ISSUE_CAUSE";
    public static final java.lang.String _CARD_ISSUE_DATE = "CARD_ISSUE_DATE";
    public static final java.lang.String _CARD_EXPIRE_DATE = "CARD_EXPIRE_DATE";
    public static final CreditDossierOrderFieldWS NUMBER = new CreditDossierOrderFieldWS(_NUMBER);
    public static final CreditDossierOrderFieldWS STATUS = new CreditDossierOrderFieldWS(_STATUS);
    public static final CreditDossierOrderFieldWS AVAILABLE_FUNDS = new CreditDossierOrderFieldWS(_AVAILABLE_FUNDS);
    public static final CreditDossierOrderFieldWS TOTAL_FUNDS = new CreditDossierOrderFieldWS(_TOTAL_FUNDS);
    public static final CreditDossierOrderFieldWS CYCLE_LENGTH = new CreditDossierOrderFieldWS(_CYCLE_LENGTH);
    public static final CreditDossierOrderFieldWS OPENING_DATE = new CreditDossierOrderFieldWS(_OPENING_DATE);
    public static final CreditDossierOrderFieldWS EXPIRE_DATE = new CreditDossierOrderFieldWS(_EXPIRE_DATE);
    public static final CreditDossierOrderFieldWS PAN = new CreditDossierOrderFieldWS(_PAN);
    public static final CreditDossierOrderFieldWS CARD_HOLDER_NAME = new CreditDossierOrderFieldWS(_CARD_HOLDER_NAME);
    public static final CreditDossierOrderFieldWS CARD_HOLDER_NATIONAL_CODE = new CreditDossierOrderFieldWS(_CARD_HOLDER_NATIONAL_CODE);
    public static final CreditDossierOrderFieldWS CARD_STATUS = new CreditDossierOrderFieldWS(_CARD_STATUS);
    public static final CreditDossierOrderFieldWS CARD_ISSUE_CAUSE = new CreditDossierOrderFieldWS(_CARD_ISSUE_CAUSE);
    public static final CreditDossierOrderFieldWS CARD_ISSUE_DATE = new CreditDossierOrderFieldWS(_CARD_ISSUE_DATE);
    public static final CreditDossierOrderFieldWS CARD_EXPIRE_DATE = new CreditDossierOrderFieldWS(_CARD_EXPIRE_DATE);
    public java.lang.String getValue() { return _value_;}
    public static CreditDossierOrderFieldWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreditDossierOrderFieldWS enumeration = (CreditDossierOrderFieldWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreditDossierOrderFieldWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreditDossierOrderFieldWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "creditDossierOrderFieldWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
