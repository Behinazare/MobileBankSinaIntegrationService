/**
 * BranchOrderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BranchOrderType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BranchOrderType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BRANCH_CODE = "BRANCH_CODE";
    public static final java.lang.String _BRANCH_NAME = "BRANCH_NAME";
    public static final java.lang.String _BALANCE = "BALANCE";
    public static final java.lang.String _CURRENCY = "CURRENCY";
    public static final java.lang.String _CITY_NAME = "CITY_NAME";
    public static final BranchOrderType BRANCH_CODE = new BranchOrderType(_BRANCH_CODE);
    public static final BranchOrderType BRANCH_NAME = new BranchOrderType(_BRANCH_NAME);
    public static final BranchOrderType BALANCE = new BranchOrderType(_BALANCE);
    public static final BranchOrderType CURRENCY = new BranchOrderType(_CURRENCY);
    public static final BranchOrderType CITY_NAME = new BranchOrderType(_CITY_NAME);
    public java.lang.String getValue() { return _value_;}
    public static BranchOrderType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BranchOrderType enumeration = (BranchOrderType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BranchOrderType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BranchOrderType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "branchOrderType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
