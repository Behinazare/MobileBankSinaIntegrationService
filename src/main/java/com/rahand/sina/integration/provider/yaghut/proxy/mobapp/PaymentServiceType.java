/**
 * PaymentServiceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PaymentServiceType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PaymentServiceType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _WATER_BILL = "WATER_BILL";
    public static final java.lang.String _ELECTRICITY = "ELECTRICITY";
    public static final java.lang.String _GAS_BILL = "GAS_BILL";
    public static final java.lang.String _PHONE_BILL = "PHONE_BILL";
    public static final java.lang.String _MOBILE_PHONE_BILL = "MOBILE_PHONE_BILL";
    public static final java.lang.String _MUNICIPALITY_BILL = "MUNICIPALITY_BILL";
    public static final java.lang.String _TAX_BILL = "TAX_BILL";
    public static final java.lang.String _POLICE_BILL = "POLICE_BILL";
    public static final java.lang.String _OTHER = "OTHER";
    public static final PaymentServiceType WATER_BILL = new PaymentServiceType(_WATER_BILL);
    public static final PaymentServiceType ELECTRICITY = new PaymentServiceType(_ELECTRICITY);
    public static final PaymentServiceType GAS_BILL = new PaymentServiceType(_GAS_BILL);
    public static final PaymentServiceType PHONE_BILL = new PaymentServiceType(_PHONE_BILL);
    public static final PaymentServiceType MOBILE_PHONE_BILL = new PaymentServiceType(_MOBILE_PHONE_BILL);
    public static final PaymentServiceType MUNICIPALITY_BILL = new PaymentServiceType(_MUNICIPALITY_BILL);
    public static final PaymentServiceType TAX_BILL = new PaymentServiceType(_TAX_BILL);
    public static final PaymentServiceType POLICE_BILL = new PaymentServiceType(_POLICE_BILL);
    public static final PaymentServiceType OTHER = new PaymentServiceType(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static PaymentServiceType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PaymentServiceType enumeration = (PaymentServiceType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PaymentServiceType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PaymentServiceType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentServiceType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
