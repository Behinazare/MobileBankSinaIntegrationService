/**
 * DepositGroupTypeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositGroupTypeWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DepositGroupTypeWS(java.lang.String value) {
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
    public static final DepositGroupTypeWS JARI_ACCOUNT = new DepositGroupTypeWS(_JARI_ACCOUNT);
    public static final DepositGroupTypeWS SPECIAL_LONG_ACCOUNT = new DepositGroupTypeWS(_SPECIAL_LONG_ACCOUNT);
    public static final DepositGroupTypeWS OTHERS = new DepositGroupTypeWS(_OTHERS);
    public static final DepositGroupTypeWS EDARE_SHODE = new DepositGroupTypeWS(_EDARE_SHODE);
    public static final DepositGroupTypeWS ANDOKHTE_ACCOUNT = new DepositGroupTypeWS(_ANDOKHTE_ACCOUNT);
    public static final DepositGroupTypeWS SPECIAL_SHORT_ACCOUNT = new DepositGroupTypeWS(_SPECIAL_SHORT_ACCOUNT);
    public static final DepositGroupTypeWS PASANDAZ = new DepositGroupTypeWS(_PASANDAZ);
    public static final DepositGroupTypeWS SHORT_ACCOUNT = new DepositGroupTypeWS(_SHORT_ACCOUNT);
    public static final DepositGroupTypeWS LONG_ACCOUNT = new DepositGroupTypeWS(_LONG_ACCOUNT);
    public java.lang.String getValue() { return _value_;}
    public static DepositGroupTypeWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DepositGroupTypeWS enumeration = (DepositGroupTypeWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DepositGroupTypeWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DepositGroupTypeWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositGroupTypeWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
