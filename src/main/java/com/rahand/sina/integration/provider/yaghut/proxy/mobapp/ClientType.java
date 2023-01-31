/**
 * ClientType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ClientType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ClientType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ATM = "ATM";
    public static final java.lang.String _POS = "POS";
    public static final java.lang.String _PINPAD = "PINPAD";
    public static final java.lang.String _INTERNET = "INTERNET";
    public static final java.lang.String _VRU = "VRU";
    public static final java.lang.String _POSCONDCOD = "POSCONDCOD";
    public static final java.lang.String _PHONE = "PHONE";
    public static final java.lang.String _OTHER = "OTHER";
    public static final ClientType ATM = new ClientType(_ATM);
    public static final ClientType POS = new ClientType(_POS);
    public static final ClientType PINPAD = new ClientType(_PINPAD);
    public static final ClientType INTERNET = new ClientType(_INTERNET);
    public static final ClientType VRU = new ClientType(_VRU);
    public static final ClientType POSCONDCOD = new ClientType(_POSCONDCOD);
    public static final ClientType PHONE = new ClientType(_PHONE);
    public static final ClientType OTHER = new ClientType(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static ClientType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ClientType enumeration = (ClientType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ClientType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ClientType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "clientType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
