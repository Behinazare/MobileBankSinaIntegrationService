/**
 * BillBeanField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillBeanField implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillBeanField(java.lang.String value) {
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
    public static final java.lang.String _REFERENCE_NUMBER = "REFERENCE_NUMBER";
    public static final java.lang.String _STATEMENT_DESCRIPTION = "STATEMENT_DESCRIPTION";
    public static final java.lang.String _BRANCH = "BRANCH";
    public static final java.lang.String _BILL_ROW_ID = "BILL_ROW_ID";
    public static final java.lang.String _TRANSACTION_CODE = "TRANSACTION_CODE";
    public static final java.lang.String _PAY_ID = "PAY_ID";
    public static final BillBeanField DEPOSIT_NUMBER = new BillBeanField(_DEPOSIT_NUMBER);
    public static final BillBeanField BALANCE = new BillBeanField(_BALANCE);
    public static final BillBeanField DOCUMENT_NUMBER = new BillBeanField(_DOCUMENT_NUMBER);
    public static final BillBeanField CHEQUE_NUMBER = new BillBeanField(_CHEQUE_NUMBER);
    public static final BillBeanField DATE = new BillBeanField(_DATE);
    public static final BillBeanField NOTE = new BillBeanField(_NOTE);
    public static final BillBeanField DEPOSIT_TITLE = new BillBeanField(_DEPOSIT_TITLE);
    public static final BillBeanField DEBIT = new BillBeanField(_DEBIT);
    public static final BillBeanField CREDIT = new BillBeanField(_CREDIT);
    public static final BillBeanField TIME = new BillBeanField(_TIME);
    public static final BillBeanField AGENTBRANCH = new BillBeanField(_AGENTBRANCH);
    public static final BillBeanField REFERENCE_NUMBER = new BillBeanField(_REFERENCE_NUMBER);
    public static final BillBeanField STATEMENT_DESCRIPTION = new BillBeanField(_STATEMENT_DESCRIPTION);
    public static final BillBeanField BRANCH = new BillBeanField(_BRANCH);
    public static final BillBeanField BILL_ROW_ID = new BillBeanField(_BILL_ROW_ID);
    public static final BillBeanField TRANSACTION_CODE = new BillBeanField(_TRANSACTION_CODE);
    public static final BillBeanField PAY_ID = new BillBeanField(_PAY_ID);
    public java.lang.String getValue() { return _value_;}
    public static BillBeanField fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillBeanField enumeration = (BillBeanField)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillBeanField fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillBeanField.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billBeanField"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
