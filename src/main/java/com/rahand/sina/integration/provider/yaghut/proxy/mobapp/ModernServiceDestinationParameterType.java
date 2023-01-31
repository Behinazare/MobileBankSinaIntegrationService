/**
 * ModernServiceDestinationParameterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ModernServiceDestinationParameterType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ModernServiceDestinationParameterType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DEPOSIT = "DEPOSIT";
    public static final java.lang.String _CARD = "CARD";
    public static final java.lang.String _IBAN = "IBAN";
    public static final java.lang.String _BILL_PAYMENT_ID = "BILL_PAYMENT_ID";
    public static final java.lang.String _SERIES_ID = "SERIES_ID";
    public static final java.lang.String _DOSSIER_NUMBER = "DOSSIER_NUMBER";
    public static final java.lang.String _LOAN_NUMBER = "LOAN_NUMBER";
    public static final java.lang.String _MOBILE_NUMBER = "MOBILE_NUMBER";
    public static final java.lang.String _PAYMENT_SERVICE_ID = "PAYMENT_SERVICE_ID";
    public static final ModernServiceDestinationParameterType DEPOSIT = new ModernServiceDestinationParameterType(_DEPOSIT);
    public static final ModernServiceDestinationParameterType CARD = new ModernServiceDestinationParameterType(_CARD);
    public static final ModernServiceDestinationParameterType IBAN = new ModernServiceDestinationParameterType(_IBAN);
    public static final ModernServiceDestinationParameterType BILL_PAYMENT_ID = new ModernServiceDestinationParameterType(_BILL_PAYMENT_ID);
    public static final ModernServiceDestinationParameterType SERIES_ID = new ModernServiceDestinationParameterType(_SERIES_ID);
    public static final ModernServiceDestinationParameterType DOSSIER_NUMBER = new ModernServiceDestinationParameterType(_DOSSIER_NUMBER);
    public static final ModernServiceDestinationParameterType LOAN_NUMBER = new ModernServiceDestinationParameterType(_LOAN_NUMBER);
    public static final ModernServiceDestinationParameterType MOBILE_NUMBER = new ModernServiceDestinationParameterType(_MOBILE_NUMBER);
    public static final ModernServiceDestinationParameterType PAYMENT_SERVICE_ID = new ModernServiceDestinationParameterType(_PAYMENT_SERVICE_ID);
    public java.lang.String getValue() { return _value_;}
    public static ModernServiceDestinationParameterType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ModernServiceDestinationParameterType enumeration = (ModernServiceDestinationParameterType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ModernServiceDestinationParameterType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ModernServiceDestinationParameterType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "modernServiceDestinationParameterType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
