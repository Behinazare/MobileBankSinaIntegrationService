/**
 * ERequestStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ERequestStatusResponse implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ERequestStatusResponse(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REGISTERED = "REGISTERED";
    public static final java.lang.String _PENDING = "PENDING";
    public static final java.lang.String _CANCELED = "CANCELED";
    public static final java.lang.String _DISAPPROVED = "DISAPPROVED";
    public static final java.lang.String _APPROVED = "APPROVED";
    public static final java.lang.String _FAILED = "FAILED";
    public static final java.lang.String _REGISTER_FAILED = "REGISTER_FAILED";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _EXPIRE_FAILED = "EXPIRE_FAILED";
    public static final java.lang.String _OTHERS = "OTHERS";
    public static final ERequestStatusResponse REGISTERED = new ERequestStatusResponse(_REGISTERED);
    public static final ERequestStatusResponse PENDING = new ERequestStatusResponse(_PENDING);
    public static final ERequestStatusResponse CANCELED = new ERequestStatusResponse(_CANCELED);
    public static final ERequestStatusResponse DISAPPROVED = new ERequestStatusResponse(_DISAPPROVED);
    public static final ERequestStatusResponse APPROVED = new ERequestStatusResponse(_APPROVED);
    public static final ERequestStatusResponse FAILED = new ERequestStatusResponse(_FAILED);
    public static final ERequestStatusResponse REGISTER_FAILED = new ERequestStatusResponse(_REGISTER_FAILED);
    public static final ERequestStatusResponse EXPIRED = new ERequestStatusResponse(_EXPIRED);
    public static final ERequestStatusResponse EXPIRE_FAILED = new ERequestStatusResponse(_EXPIRE_FAILED);
    public static final ERequestStatusResponse OTHERS = new ERequestStatusResponse(_OTHERS);
    public java.lang.String getValue() { return _value_;}
    public static ERequestStatusResponse fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ERequestStatusResponse enumeration = (ERequestStatusResponse)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ERequestStatusResponse fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ERequestStatusResponse.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestStatusResponse"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
