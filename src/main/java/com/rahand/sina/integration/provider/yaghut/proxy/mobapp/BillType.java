/**
 * BillType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _WATER = "WATER";
    public static final java.lang.String _ELECTRICITY = "ELECTRICITY";
    public static final java.lang.String _GAS = "GAS";
    public static final java.lang.String _IMMOBILE_PHONE = "IMMOBILE_PHONE";
    public static final java.lang.String _MOBILE_PHONE = "MOBILE_PHONE";
    public static final java.lang.String _MUNICIPALITY_DUE = "MUNICIPALITY_DUE";
    public static final java.lang.String _CUSTOM = "CUSTOM";
    public static final java.lang.String _MUNICIPALITY_7 = "MUNICIPALITY_7";
    public static final java.lang.String _TAX = "TAX";
    public static final BillType UNKNOWN = new BillType(_UNKNOWN);
    public static final BillType WATER = new BillType(_WATER);
    public static final BillType ELECTRICITY = new BillType(_ELECTRICITY);
    public static final BillType GAS = new BillType(_GAS);
    public static final BillType IMMOBILE_PHONE = new BillType(_IMMOBILE_PHONE);
    public static final BillType MOBILE_PHONE = new BillType(_MOBILE_PHONE);
    public static final BillType MUNICIPALITY_DUE = new BillType(_MUNICIPALITY_DUE);
    public static final BillType CUSTOM = new BillType(_CUSTOM);
    public static final BillType MUNICIPALITY_7 = new BillType(_MUNICIPALITY_7);
    public static final BillType TAX = new BillType(_TAX);
    public java.lang.String getValue() { return _value_;}
    public static BillType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillType enumeration = (BillType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
