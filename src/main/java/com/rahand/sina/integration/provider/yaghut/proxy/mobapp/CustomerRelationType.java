/**
 * CustomerRelationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CustomerRelationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerRelationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PARENT = "PARENT";
    public static final java.lang.String _GUARDIAN = "GUARDIAN";
    public static final java.lang.String _EXECUTOR = "EXECUTOR";
    public static final java.lang.String _SPOUSE = "SPOUSE";
    public static final java.lang.String _SISTER = "SISTER";
    public static final java.lang.String _BROTHER = "BROTHER";
    public static final java.lang.String _DAUGHTER = "DAUGHTER";
    public static final java.lang.String _SON = "SON";
    public static final java.lang.String _FATHER = "FATHER";
    public static final java.lang.String _MOTHER = "MOTHER";
    public static final java.lang.String _CHAIRMAN = "CHAIRMAN";
    public static final java.lang.String _DIRECTOR = "DIRECTOR";
    public static final java.lang.String _BOARD_OF_DIRECTORS = "BOARD_OF_DIRECTORS";
    public static final java.lang.String _SHAREHOLDER = "SHAREHOLDER";
    public static final java.lang.String _ATTORNEY = "ATTORNEY";
    public static final java.lang.String _REPRESENTATIVE = "REPRESENTATIVE";
    public static final java.lang.String _CHAIRMAN_OF_THE_CHAMBER_OF_COMMERCE = "CHAIRMAN_OF_THE_CHAMBER_OF_COMMERCE";
    public static final java.lang.String _TREASURER = "TREASURER";
    public static final java.lang.String _FINANCIAL_MANAGER = "FINANCIAL_MANAGER";
    public static final java.lang.String _HEAD_OF_ACCOUNTING_DEPARTMENT = "HEAD_OF_ACCOUNTING_DEPARTMENT";
    public static final java.lang.String _FINANCIAL_INFERIOR = "FINANCIAL_INFERIOR";
    public static final java.lang.String _ACCOUNTING_INFERIOR = "ACCOUNTING_INFERIOR";
    public static final CustomerRelationType PARENT = new CustomerRelationType(_PARENT);
    public static final CustomerRelationType GUARDIAN = new CustomerRelationType(_GUARDIAN);
    public static final CustomerRelationType EXECUTOR = new CustomerRelationType(_EXECUTOR);
    public static final CustomerRelationType SPOUSE = new CustomerRelationType(_SPOUSE);
    public static final CustomerRelationType SISTER = new CustomerRelationType(_SISTER);
    public static final CustomerRelationType BROTHER = new CustomerRelationType(_BROTHER);
    public static final CustomerRelationType DAUGHTER = new CustomerRelationType(_DAUGHTER);
    public static final CustomerRelationType SON = new CustomerRelationType(_SON);
    public static final CustomerRelationType FATHER = new CustomerRelationType(_FATHER);
    public static final CustomerRelationType MOTHER = new CustomerRelationType(_MOTHER);
    public static final CustomerRelationType CHAIRMAN = new CustomerRelationType(_CHAIRMAN);
    public static final CustomerRelationType DIRECTOR = new CustomerRelationType(_DIRECTOR);
    public static final CustomerRelationType BOARD_OF_DIRECTORS = new CustomerRelationType(_BOARD_OF_DIRECTORS);
    public static final CustomerRelationType SHAREHOLDER = new CustomerRelationType(_SHAREHOLDER);
    public static final CustomerRelationType ATTORNEY = new CustomerRelationType(_ATTORNEY);
    public static final CustomerRelationType REPRESENTATIVE = new CustomerRelationType(_REPRESENTATIVE);
    public static final CustomerRelationType CHAIRMAN_OF_THE_CHAMBER_OF_COMMERCE = new CustomerRelationType(_CHAIRMAN_OF_THE_CHAMBER_OF_COMMERCE);
    public static final CustomerRelationType TREASURER = new CustomerRelationType(_TREASURER);
    public static final CustomerRelationType FINANCIAL_MANAGER = new CustomerRelationType(_FINANCIAL_MANAGER);
    public static final CustomerRelationType HEAD_OF_ACCOUNTING_DEPARTMENT = new CustomerRelationType(_HEAD_OF_ACCOUNTING_DEPARTMENT);
    public static final CustomerRelationType FINANCIAL_INFERIOR = new CustomerRelationType(_FINANCIAL_INFERIOR);
    public static final CustomerRelationType ACCOUNTING_INFERIOR = new CustomerRelationType(_ACCOUNTING_INFERIOR);
    public java.lang.String getValue() { return _value_;}
    public static CustomerRelationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerRelationType enumeration = (CustomerRelationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerRelationType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomerRelationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "customerRelationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
