/**
 * ParameterTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ParameterTypeBean implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ParameterTypeBean(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PAN = "PAN";
    public static final java.lang.String _MOBILE = "MOBILE";
    public static final java.lang.String _TEXT = "TEXT";
    public static final java.lang.String _IBAN = "IBAN";
    public static final java.lang.String _DEPOSIT_NUMBER = "DEPOSIT_NUMBER";
    public static final ParameterTypeBean PAN = new ParameterTypeBean(_PAN);
    public static final ParameterTypeBean MOBILE = new ParameterTypeBean(_MOBILE);
    public static final ParameterTypeBean TEXT = new ParameterTypeBean(_TEXT);
    public static final ParameterTypeBean IBAN = new ParameterTypeBean(_IBAN);
    public static final ParameterTypeBean DEPOSIT_NUMBER = new ParameterTypeBean(_DEPOSIT_NUMBER);
    public java.lang.String getValue() { return _value_;}
    public static ParameterTypeBean fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ParameterTypeBean enumeration = (ParameterTypeBean)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ParameterTypeBean fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ParameterTypeBean.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "parameterTypeBean"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
