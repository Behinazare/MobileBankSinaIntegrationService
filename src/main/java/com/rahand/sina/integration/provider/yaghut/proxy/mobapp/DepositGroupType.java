/**
 * DepositGroupType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositGroupType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DepositGroupType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _JARI_ACCOUNT = "JARI_ACCOUNT";
    public static final java.lang.String _SPECIAL_LONG_ACCOUNT = "SPECIAL_LONG_ACCOUNT";
    public static final java.lang.String _OTHERS = "OTHERS";
    public static final java.lang.String _EDARE_SHODE = "EDARE_SHODE";
    public static final java.lang.String _ANDOKHTE_ACCOUNT = "ANDOKHTE_ACCOUNT";
    public static final java.lang.String _SPECIAL_SHORT_ACCOUNT = "SPECIAL_SHORT_ACCOUNT";
    public static final java.lang.String _PASANDAZ = "PASANDAZ";
    public static final java.lang.String _SHORT_ACCOUNT = "SHORT_ACCOUNT";
    public static final java.lang.String _LONG_ACCOUNT = "LONG_ACCOUNT";
    public static final DepositGroupType JARI_ACCOUNT = new DepositGroupType(_JARI_ACCOUNT);
    public static final DepositGroupType SPECIAL_LONG_ACCOUNT = new DepositGroupType(_SPECIAL_LONG_ACCOUNT);
    public static final DepositGroupType OTHERS = new DepositGroupType(_OTHERS);
    public static final DepositGroupType EDARE_SHODE = new DepositGroupType(_EDARE_SHODE);
    public static final DepositGroupType ANDOKHTE_ACCOUNT = new DepositGroupType(_ANDOKHTE_ACCOUNT);
    public static final DepositGroupType SPECIAL_SHORT_ACCOUNT = new DepositGroupType(_SPECIAL_SHORT_ACCOUNT);
    public static final DepositGroupType PASANDAZ = new DepositGroupType(_PASANDAZ);
    public static final DepositGroupType SHORT_ACCOUNT = new DepositGroupType(_SHORT_ACCOUNT);
    public static final DepositGroupType LONG_ACCOUNT = new DepositGroupType(_LONG_ACCOUNT);
    public java.lang.String getValue() { return _value_;}
    public static DepositGroupType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DepositGroupType enumeration = (DepositGroupType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DepositGroupType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DepositGroupType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositGroupType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
