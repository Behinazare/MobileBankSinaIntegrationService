/**
 * BillCycleStatusWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillCycleStatusWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillCycleStatusWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CLOSE = "CLOSE";
    public static final java.lang.String _OPEN = "OPEN";
    public static final java.lang.String _CLOSE_OUT_OF_BALANCE = "CLOSE_OUT_OF_BALANCE";
    public static final java.lang.String _CLOSE_IN_BALANCE = "CLOSE_IN_BALANCE";
    public static final java.lang.String _CLOSE_MANUALLY_IN_BALANCE = "CLOSE_MANUALLY_IN_BALANCE";
    public static final java.lang.String _CLOSE_BATCH_ID_CONFLICT = "CLOSE_BATCH_ID_CONFLICT";
    public static final java.lang.String _ISSUE_STATEMENT = "ISSUE_STATEMENT";
    public static final java.lang.String _OPEN_LOAN = "OPEN_LOAN";
    public static final java.lang.String _TRANSFER_TO_NEXT = "TRANSFER_TO_NEXT";
    public static final java.lang.String _STORE = "STORE";
    public static final java.lang.String _OPEN_LOAN_FOR_ORIGINAL_AMOUNT = "OPEN_LOAN_FOR_ORIGINAL_AMOUNT";
    public static final java.lang.String _CLOSE_SUSPENDED = "CLOSE_SUSPENDED";
    public static final BillCycleStatusWS CLOSE = new BillCycleStatusWS(_CLOSE);
    public static final BillCycleStatusWS OPEN = new BillCycleStatusWS(_OPEN);
    public static final BillCycleStatusWS CLOSE_OUT_OF_BALANCE = new BillCycleStatusWS(_CLOSE_OUT_OF_BALANCE);
    public static final BillCycleStatusWS CLOSE_IN_BALANCE = new BillCycleStatusWS(_CLOSE_IN_BALANCE);
    public static final BillCycleStatusWS CLOSE_MANUALLY_IN_BALANCE = new BillCycleStatusWS(_CLOSE_MANUALLY_IN_BALANCE);
    public static final BillCycleStatusWS CLOSE_BATCH_ID_CONFLICT = new BillCycleStatusWS(_CLOSE_BATCH_ID_CONFLICT);
    public static final BillCycleStatusWS ISSUE_STATEMENT = new BillCycleStatusWS(_ISSUE_STATEMENT);
    public static final BillCycleStatusWS OPEN_LOAN = new BillCycleStatusWS(_OPEN_LOAN);
    public static final BillCycleStatusWS TRANSFER_TO_NEXT = new BillCycleStatusWS(_TRANSFER_TO_NEXT);
    public static final BillCycleStatusWS STORE = new BillCycleStatusWS(_STORE);
    public static final BillCycleStatusWS OPEN_LOAN_FOR_ORIGINAL_AMOUNT = new BillCycleStatusWS(_OPEN_LOAN_FOR_ORIGINAL_AMOUNT);
    public static final BillCycleStatusWS CLOSE_SUSPENDED = new BillCycleStatusWS(_CLOSE_SUSPENDED);
    public java.lang.String getValue() { return _value_;}
    public static BillCycleStatusWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillCycleStatusWS enumeration = (BillCycleStatusWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillCycleStatusWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillCycleStatusWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billCycleStatusWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
