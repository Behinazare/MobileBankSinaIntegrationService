/**
 * AuthenticationTypeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AuthenticationTypeWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AuthenticationTypeWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _STATIC_USERNAME_CHANNEL = "STATIC_USERNAME_CHANNEL";
    public static final java.lang.String _OTP1 = "OTP1";
    public static final java.lang.String _OTP2 = "OTP2";
    public static final java.lang.String _OTP3 = "OTP3";
    public static final AuthenticationTypeWS STATIC_USERNAME_CHANNEL = new AuthenticationTypeWS(_STATIC_USERNAME_CHANNEL);
    public static final AuthenticationTypeWS OTP1 = new AuthenticationTypeWS(_OTP1);
    public static final AuthenticationTypeWS OTP2 = new AuthenticationTypeWS(_OTP2);
    public static final AuthenticationTypeWS OTP3 = new AuthenticationTypeWS(_OTP3);
    public java.lang.String getValue() { return _value_;}
    public static AuthenticationTypeWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AuthenticationTypeWS enumeration = (AuthenticationTypeWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AuthenticationTypeWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AuthenticationTypeWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "authenticationTypeWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
