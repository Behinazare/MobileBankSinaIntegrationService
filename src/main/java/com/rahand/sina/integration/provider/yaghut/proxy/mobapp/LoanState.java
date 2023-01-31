/**
 * LoanState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoanState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LoanState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNPAID = "UNPAID";
    public static final java.lang.String _PAID_INCOMPLETE = "PAID_INCOMPLETE";
    public static final java.lang.String _ACTIVE = "ACTIVE";
    public static final java.lang.String _DOUBTFUL_RECEIPT = "DOUBTFUL_RECEIPT";
    public static final java.lang.String _SETTLEMENT_READY = "SETTLEMENT_READY";
    public static final java.lang.String _FREE = "FREE";
    public static final java.lang.String _SUSPEND = "SUSPEND";
    public static final java.lang.String _SARRESID_GOZASHTE = "SARRESID_GOZASHTE";
    public static final java.lang.String _OTHER = "OTHER";
    public static final LoanState UNPAID = new LoanState(_UNPAID);
    public static final LoanState PAID_INCOMPLETE = new LoanState(_PAID_INCOMPLETE);
    public static final LoanState ACTIVE = new LoanState(_ACTIVE);
    public static final LoanState DOUBTFUL_RECEIPT = new LoanState(_DOUBTFUL_RECEIPT);
    public static final LoanState SETTLEMENT_READY = new LoanState(_SETTLEMENT_READY);
    public static final LoanState FREE = new LoanState(_FREE);
    public static final LoanState SUSPEND = new LoanState(_SUSPEND);
    public static final LoanState SARRESID_GOZASHTE = new LoanState(_SARRESID_GOZASHTE);
    public static final LoanState OTHER = new LoanState(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static LoanState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LoanState enumeration = (LoanState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LoanState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LoanState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
