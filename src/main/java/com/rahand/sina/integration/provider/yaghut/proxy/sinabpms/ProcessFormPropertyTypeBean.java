/**
 * ProcessFormPropertyTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class ProcessFormPropertyTypeBean implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProcessFormPropertyTypeBean(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BOOLEAN = "BOOLEAN";
    public static final String _BYTES = "BYTES";
    public static final String _DATE = "DATE";
    public static final String _DOUBLE = "DOUBLE";
    public static final String _FORM_PROPERTY = "FORM_PROPERTY";
    public static final String _INTEGER = "INTEGER";
    public static final String _JPA_ENTITY = "JPA_ENTITY";
    public static final String _LONG = "LONG";
    public static final String _NULL = "NULL";
    public static final String _RUNTIME_VARIABLE = "RUNTIME_VARIABLE";
    public static final String _SERIALIZABLE = "SERIALIZABLE";
    public static final String _SHORT = "SHORT";
    public static final String _STRING = "STRING";
    public static final ProcessFormPropertyTypeBean BOOLEAN = new ProcessFormPropertyTypeBean(_BOOLEAN);
    public static final ProcessFormPropertyTypeBean BYTES = new ProcessFormPropertyTypeBean(_BYTES);
    public static final ProcessFormPropertyTypeBean DATE = new ProcessFormPropertyTypeBean(_DATE);
    public static final ProcessFormPropertyTypeBean DOUBLE = new ProcessFormPropertyTypeBean(_DOUBLE);
    public static final ProcessFormPropertyTypeBean FORM_PROPERTY = new ProcessFormPropertyTypeBean(_FORM_PROPERTY);
    public static final ProcessFormPropertyTypeBean INTEGER = new ProcessFormPropertyTypeBean(_INTEGER);
    public static final ProcessFormPropertyTypeBean JPA_ENTITY = new ProcessFormPropertyTypeBean(_JPA_ENTITY);
    public static final ProcessFormPropertyTypeBean LONG = new ProcessFormPropertyTypeBean(_LONG);
    public static final ProcessFormPropertyTypeBean NULL = new ProcessFormPropertyTypeBean(_NULL);
    public static final ProcessFormPropertyTypeBean RUNTIME_VARIABLE = new ProcessFormPropertyTypeBean(_RUNTIME_VARIABLE);
    public static final ProcessFormPropertyTypeBean SERIALIZABLE = new ProcessFormPropertyTypeBean(_SERIALIZABLE);
    public static final ProcessFormPropertyTypeBean SHORT = new ProcessFormPropertyTypeBean(_SHORT);
    public static final ProcessFormPropertyTypeBean STRING = new ProcessFormPropertyTypeBean(_STRING);
    public String getValue() { return _value_;}
    public static ProcessFormPropertyTypeBean fromValue(String value)
          throws IllegalArgumentException {
        ProcessFormPropertyTypeBean enumeration = (ProcessFormPropertyTypeBean)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ProcessFormPropertyTypeBean fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessFormPropertyTypeBean.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processFormPropertyTypeBean"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
