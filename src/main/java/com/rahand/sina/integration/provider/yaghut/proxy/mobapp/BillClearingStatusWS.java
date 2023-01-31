/**
 * BillClearingStatusWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillClearingStatusWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillClearingStatusWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FULL_SETTLED = "FULL_SETTLED";
    public static final java.lang.String _PARTIAL_SETTLED = "PARTIAL_SETTLED";
    public static final java.lang.String _NO_SETTLED = "NO_SETTLED";
    public static final java.lang.String _FULL_SETTLED_STF = "FULL_SETTLED_STF";
    public static final java.lang.String _SETTLED_BY_LOAN = "SETTLED_BY_LOAN";
    public static final java.lang.String _FULL_SETTLED_IN_NEXT_CYCLE = "FULL_SETTLED_IN_NEXT_CYCLE";
    public static final java.lang.String _SETTLED_BY_SUSPENDING = "SETTLED_BY_SUSPENDING";
    public static final BillClearingStatusWS FULL_SETTLED = new BillClearingStatusWS(_FULL_SETTLED);
    public static final BillClearingStatusWS PARTIAL_SETTLED = new BillClearingStatusWS(_PARTIAL_SETTLED);
    public static final BillClearingStatusWS NO_SETTLED = new BillClearingStatusWS(_NO_SETTLED);
    public static final BillClearingStatusWS FULL_SETTLED_STF = new BillClearingStatusWS(_FULL_SETTLED_STF);
    public static final BillClearingStatusWS SETTLED_BY_LOAN = new BillClearingStatusWS(_SETTLED_BY_LOAN);
    public static final BillClearingStatusWS FULL_SETTLED_IN_NEXT_CYCLE = new BillClearingStatusWS(_FULL_SETTLED_IN_NEXT_CYCLE);
    public static final BillClearingStatusWS SETTLED_BY_SUSPENDING = new BillClearingStatusWS(_SETTLED_BY_SUSPENDING);
    public java.lang.String getValue() { return _value_;}
    public static BillClearingStatusWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillClearingStatusWS enumeration = (BillClearingStatusWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillClearingStatusWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillClearingStatusWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billClearingStatusWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
