/**
 * AddressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AddressType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AddressType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _HOME = "HOME";
    public static final java.lang.String _OFFICE = "OFFICE";
    public static final java.lang.String _TEMPORARY = "TEMPORARY";
    public static final java.lang.String _CENTRAL_OFFICE = "CENTRAL_OFFICE";
    public static final java.lang.String _FACTORY = "FACTORY";
    public static final java.lang.String _WORKSHOP = "WORKSHOP";
    public static final AddressType HOME = new AddressType(_HOME);
    public static final AddressType OFFICE = new AddressType(_OFFICE);
    public static final AddressType TEMPORARY = new AddressType(_TEMPORARY);
    public static final AddressType CENTRAL_OFFICE = new AddressType(_CENTRAL_OFFICE);
    public static final AddressType FACTORY = new AddressType(_FACTORY);
    public static final AddressType WORKSHOP = new AddressType(_WORKSHOP);
    public java.lang.String getValue() { return _value_;}
    public static AddressType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AddressType enumeration = (AddressType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AddressType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AddressType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "addressType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
