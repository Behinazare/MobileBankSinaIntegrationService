/**
 * LoanStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoanStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LoanStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNPAID = "UNPAID";
    public static final java.lang.String _PAID_INCOMPLETE = "PAID_INCOMPLETE";
    public static final java.lang.String _ACTIVE = "ACTIVE";
    public static final java.lang.String _DOUBTFUL_RECEIPT = "DOUBTFUL_RECEIPT";
    public static final java.lang.String _SETTLEMENT_READY = "SETTLEMENT_READY";
    public static final java.lang.String _FREE = "FREE";
    public static final java.lang.String _OTHER = "OTHER";
    public static final LoanStatus UNPAID = new LoanStatus(_UNPAID);
    public static final LoanStatus PAID_INCOMPLETE = new LoanStatus(_PAID_INCOMPLETE);
    public static final LoanStatus ACTIVE = new LoanStatus(_ACTIVE);
    public static final LoanStatus DOUBTFUL_RECEIPT = new LoanStatus(_DOUBTFUL_RECEIPT);
    public static final LoanStatus SETTLEMENT_READY = new LoanStatus(_SETTLEMENT_READY);
    public static final LoanStatus FREE = new LoanStatus(_FREE);
    public static final LoanStatus OTHER = new LoanStatus(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static LoanStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LoanStatus enumeration = (LoanStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LoanStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LoanStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
