/**
 * DefaultBillStatementBeanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DefaultBillStatementBeanType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DefaultBillStatementBeanType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FROM_LAST_VIEW_BILL_DATE = "FROM_LAST_VIEW_BILL_DATE";
    public static final java.lang.String _LAST_N_DAY = "LAST_N_DAY";
    public static final java.lang.String _LAST_N_COUNT = "LAST_N_COUNT";
    public static final DefaultBillStatementBeanType FROM_LAST_VIEW_BILL_DATE = new DefaultBillStatementBeanType(_FROM_LAST_VIEW_BILL_DATE);
    public static final DefaultBillStatementBeanType LAST_N_DAY = new DefaultBillStatementBeanType(_LAST_N_DAY);
    public static final DefaultBillStatementBeanType LAST_N_COUNT = new DefaultBillStatementBeanType(_LAST_N_COUNT);
    public java.lang.String getValue() { return _value_;}
    public static DefaultBillStatementBeanType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DefaultBillStatementBeanType enumeration = (DefaultBillStatementBeanType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DefaultBillStatementBeanType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DefaultBillStatementBeanType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "defaultBillStatementBeanType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
