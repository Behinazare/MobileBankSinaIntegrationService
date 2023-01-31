/**
 * ProcessTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ProcessTypeBean implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProcessTypeBean(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PURCHASE = "PURCHASE";
    public static final java.lang.String _CASH = "CASH";
    public static final java.lang.String _PURCHASE_REVERSE = "PURCHASE_REVERSE";
    public static final java.lang.String _BALANCE_INQUIRY = "BALANCE_INQUIRY";
    public static final java.lang.String _INVESTIGATE_REQUEST = "INVESTIGATE_REQUEST";
    public static final java.lang.String _SUMMARY_REQUEST = "SUMMARY_REQUEST";
    public static final java.lang.String _TRANSFER_REQUEST = "TRANSFER_REQUEST";
    public static final java.lang.String _TRANSFER_FROM = "TRANSFER_FROM";
    public static final java.lang.String _TRANSFER_TO = "TRANSFER_TO";
    public static final java.lang.String _PAYMENT = "PAYMENT";
    public static final java.lang.String _PASSWORD_CONFIRM_REQUEST = "PASSWORD_CONFIRM_REQUEST";
    public static final ProcessTypeBean PURCHASE = new ProcessTypeBean(_PURCHASE);
    public static final ProcessTypeBean CASH = new ProcessTypeBean(_CASH);
    public static final ProcessTypeBean PURCHASE_REVERSE = new ProcessTypeBean(_PURCHASE_REVERSE);
    public static final ProcessTypeBean BALANCE_INQUIRY = new ProcessTypeBean(_BALANCE_INQUIRY);
    public static final ProcessTypeBean INVESTIGATE_REQUEST = new ProcessTypeBean(_INVESTIGATE_REQUEST);
    public static final ProcessTypeBean SUMMARY_REQUEST = new ProcessTypeBean(_SUMMARY_REQUEST);
    public static final ProcessTypeBean TRANSFER_REQUEST = new ProcessTypeBean(_TRANSFER_REQUEST);
    public static final ProcessTypeBean TRANSFER_FROM = new ProcessTypeBean(_TRANSFER_FROM);
    public static final ProcessTypeBean TRANSFER_TO = new ProcessTypeBean(_TRANSFER_TO);
    public static final ProcessTypeBean PAYMENT = new ProcessTypeBean(_PAYMENT);
    public static final ProcessTypeBean PASSWORD_CONFIRM_REQUEST = new ProcessTypeBean(_PASSWORD_CONFIRM_REQUEST);
    public java.lang.String getValue() { return _value_;}
    public static ProcessTypeBean fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProcessTypeBean enumeration = (ProcessTypeBean)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProcessTypeBean fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProcessTypeBean.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTypeBean"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
