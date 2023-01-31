/**
 * SignatureOwnerStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SignatureOwnerStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SignatureOwnerStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DEPOSIT_OWNER = "DEPOSIT_OWNER";
    public static final java.lang.String _OWNER_OF_DEPOSIT_AND_SIGNATURE = "OWNER_OF_DEPOSIT_AND_SIGNATURE";
    public static final java.lang.String _SIGNATURE_OWNER = "SIGNATURE_OWNER";
    public static final java.lang.String _BROKER = "BROKER";
    public static final SignatureOwnerStatus DEPOSIT_OWNER = new SignatureOwnerStatus(_DEPOSIT_OWNER);
    public static final SignatureOwnerStatus OWNER_OF_DEPOSIT_AND_SIGNATURE = new SignatureOwnerStatus(_OWNER_OF_DEPOSIT_AND_SIGNATURE);
    public static final SignatureOwnerStatus SIGNATURE_OWNER = new SignatureOwnerStatus(_SIGNATURE_OWNER);
    public static final SignatureOwnerStatus BROKER = new SignatureOwnerStatus(_BROKER);
    public java.lang.String getValue() { return _value_;}
    public static SignatureOwnerStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SignatureOwnerStatus enumeration = (SignatureOwnerStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SignatureOwnerStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SignatureOwnerStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "signatureOwnerStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
