/**
 * BillFieldWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillFieldWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillFieldWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DEPOSIT_NUMBER = "DEPOSIT_NUMBER";
    public static final java.lang.String _BALANCE = "BALANCE";
    public static final java.lang.String _DOCUMENT_NUMBER = "DOCUMENT_NUMBER";
    public static final java.lang.String _CHEQUE_NUMBER = "CHEQUE_NUMBER";
    public static final java.lang.String _DATE = "DATE";
    public static final java.lang.String _NOTE = "NOTE";
    public static final java.lang.String _DEPOSIT_TITLE = "DEPOSIT_TITLE";
    public static final java.lang.String _DEBIT = "DEBIT";
    public static final java.lang.String _CREDIT = "CREDIT";
    public static final java.lang.String _TIME = "TIME";
    public static final java.lang.String _AGENTBRANCH = "AGENTBRANCH";
    public static final BillFieldWS DEPOSIT_NUMBER = new BillFieldWS(_DEPOSIT_NUMBER);
    public static final BillFieldWS BALANCE = new BillFieldWS(_BALANCE);
    public static final BillFieldWS DOCUMENT_NUMBER = new BillFieldWS(_DOCUMENT_NUMBER);
    public static final BillFieldWS CHEQUE_NUMBER = new BillFieldWS(_CHEQUE_NUMBER);
    public static final BillFieldWS DATE = new BillFieldWS(_DATE);
    public static final BillFieldWS NOTE = new BillFieldWS(_NOTE);
    public static final BillFieldWS DEPOSIT_TITLE = new BillFieldWS(_DEPOSIT_TITLE);
    public static final BillFieldWS DEBIT = new BillFieldWS(_DEBIT);
    public static final BillFieldWS CREDIT = new BillFieldWS(_CREDIT);
    public static final BillFieldWS TIME = new BillFieldWS(_TIME);
    public static final BillFieldWS AGENTBRANCH = new BillFieldWS(_AGENTBRANCH);
    public java.lang.String getValue() { return _value_;}
    public static BillFieldWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillFieldWS enumeration = (BillFieldWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillFieldWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillFieldWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billFieldWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
