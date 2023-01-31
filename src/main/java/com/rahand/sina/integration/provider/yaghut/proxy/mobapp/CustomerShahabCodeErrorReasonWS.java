/**
 * CustomerShahabCodeErrorReasonWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CustomerShahabCodeErrorReasonWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerShahabCodeErrorReasonWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_NATIONAL_ID = "INVALID_NATIONAL_ID";
    public static final java.lang.String _INVALID_BIRTH_OR_REGISTER_DATE = "INVALID_BIRTH_OR_REGISTER_DATE";
    public static final java.lang.String _INVALID_SSN_OR_REGISTER_NUMBER = "INVALID_SSN_OR_REGISTER_NUMBER";
    public static final java.lang.String _INVALID_BIRTH_OR_REGISTER_PLACE = "INVALID_BIRTH_OR_REGISTER_PLACE";
    public static final java.lang.String _INVALID_PERSON_OR_CORPORATE_INFO = "INVALID_PERSON_OR_CORPORATE_INFO";
    public static final java.lang.String _DEAD = "DEAD";
    public static final java.lang.String _BROKEN_UP_CORPORATE = "BROKEN_UP_CORPORATE";
    public static final java.lang.String _INVALID_SHAHAB_CODE = "INVALID_SHAHAB_CODE";
    public static final java.lang.String _INVALID_POSTAL_CODE = "INVALID_POSTAL_CODE";
    public static final java.lang.String _INVALID_CUSTOMER_NUMBER = "INVALID_CUSTOMER_NUMBER";
    public static final java.lang.String _NAHAB_SYSTEM_ERROR = "NAHAB_SYSTEM_ERROR";
    public static final java.lang.String _SERVICE_EXCEPTION = "SERVICE_EXCEPTION";
    public static final CustomerShahabCodeErrorReasonWS INVALID_NATIONAL_ID = new CustomerShahabCodeErrorReasonWS(_INVALID_NATIONAL_ID);
    public static final CustomerShahabCodeErrorReasonWS INVALID_BIRTH_OR_REGISTER_DATE = new CustomerShahabCodeErrorReasonWS(_INVALID_BIRTH_OR_REGISTER_DATE);
    public static final CustomerShahabCodeErrorReasonWS INVALID_SSN_OR_REGISTER_NUMBER = new CustomerShahabCodeErrorReasonWS(_INVALID_SSN_OR_REGISTER_NUMBER);
    public static final CustomerShahabCodeErrorReasonWS INVALID_BIRTH_OR_REGISTER_PLACE = new CustomerShahabCodeErrorReasonWS(_INVALID_BIRTH_OR_REGISTER_PLACE);
    public static final CustomerShahabCodeErrorReasonWS INVALID_PERSON_OR_CORPORATE_INFO = new CustomerShahabCodeErrorReasonWS(_INVALID_PERSON_OR_CORPORATE_INFO);
    public static final CustomerShahabCodeErrorReasonWS DEAD = new CustomerShahabCodeErrorReasonWS(_DEAD);
    public static final CustomerShahabCodeErrorReasonWS BROKEN_UP_CORPORATE = new CustomerShahabCodeErrorReasonWS(_BROKEN_UP_CORPORATE);
    public static final CustomerShahabCodeErrorReasonWS INVALID_SHAHAB_CODE = new CustomerShahabCodeErrorReasonWS(_INVALID_SHAHAB_CODE);
    public static final CustomerShahabCodeErrorReasonWS INVALID_POSTAL_CODE = new CustomerShahabCodeErrorReasonWS(_INVALID_POSTAL_CODE);
    public static final CustomerShahabCodeErrorReasonWS INVALID_CUSTOMER_NUMBER = new CustomerShahabCodeErrorReasonWS(_INVALID_CUSTOMER_NUMBER);
    public static final CustomerShahabCodeErrorReasonWS NAHAB_SYSTEM_ERROR = new CustomerShahabCodeErrorReasonWS(_NAHAB_SYSTEM_ERROR);
    public static final CustomerShahabCodeErrorReasonWS SERVICE_EXCEPTION = new CustomerShahabCodeErrorReasonWS(_SERVICE_EXCEPTION);
    public java.lang.String getValue() { return _value_;}
    public static CustomerShahabCodeErrorReasonWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerShahabCodeErrorReasonWS enumeration = (CustomerShahabCodeErrorReasonWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerShahabCodeErrorReasonWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomerShahabCodeErrorReasonWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "customerShahabCodeErrorReasonWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
