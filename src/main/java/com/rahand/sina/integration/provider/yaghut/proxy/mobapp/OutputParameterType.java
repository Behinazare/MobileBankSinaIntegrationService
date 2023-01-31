/**
 * OutputParameterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class OutputParameterType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OutputParameterType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PAYMENT_DATE = "PAYMENT_DATE";
    public static final java.lang.String _PAYMENT_DEVICE = "PAYMENT_DEVICE";
    public static final java.lang.String _REFERENCE_NUMBER = "REFERENCE_NUMBER";
    public static final java.lang.String _DESCRIPTION = "DESCRIPTION";
    public static final java.lang.String _BILL_ID = "BILL_ID";
    public static final java.lang.String _PAYMENT_ID = "PAYMENT_ID";
    public static final java.lang.String _CHARGE_CODE = "CHARGE_CODE";
    public static final java.lang.String _CHARGE_SERIAL = "CHARGE_SERIAL";
    public static final java.lang.String _PHONE_NUMBER = "PHONE_NUMBER";
    public static final java.lang.String _OTHER = "OTHER";
    public static final OutputParameterType PAYMENT_DATE = new OutputParameterType(_PAYMENT_DATE);
    public static final OutputParameterType PAYMENT_DEVICE = new OutputParameterType(_PAYMENT_DEVICE);
    public static final OutputParameterType REFERENCE_NUMBER = new OutputParameterType(_REFERENCE_NUMBER);
    public static final OutputParameterType DESCRIPTION = new OutputParameterType(_DESCRIPTION);
    public static final OutputParameterType BILL_ID = new OutputParameterType(_BILL_ID);
    public static final OutputParameterType PAYMENT_ID = new OutputParameterType(_PAYMENT_ID);
    public static final OutputParameterType CHARGE_CODE = new OutputParameterType(_CHARGE_CODE);
    public static final OutputParameterType CHARGE_SERIAL = new OutputParameterType(_CHARGE_SERIAL);
    public static final OutputParameterType PHONE_NUMBER = new OutputParameterType(_PHONE_NUMBER);
    public static final OutputParameterType OTHER = new OutputParameterType(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static OutputParameterType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OutputParameterType enumeration = (OutputParameterType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OutputParameterType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OutputParameterType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "outputParameterType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
