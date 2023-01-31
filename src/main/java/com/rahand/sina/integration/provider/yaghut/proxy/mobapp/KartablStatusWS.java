/**
 * KartablStatusWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class KartablStatusWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected KartablStatusWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _WAITING_OR_CREATED = "WAITING_OR_CREATED";
    public static final java.lang.String _CANCELLED = "CANCELLED";
    public static final java.lang.String _APPROVED = "APPROVED";
    public static final java.lang.String _DENIED = "DENIED";
    public static final java.lang.String _EXECUTE_ORDERED = "EXECUTE_ORDERED";
    public static final java.lang.String _IN_PROGRESS = "IN_PROGRESS";
    public static final java.lang.String _SUCCESSFUL = "SUCCESSFUL";
    public static final java.lang.String _UNSUCCESSFUL = "UNSUCCESSFUL";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final KartablStatusWS WAITING_OR_CREATED = new KartablStatusWS(_WAITING_OR_CREATED);
    public static final KartablStatusWS CANCELLED = new KartablStatusWS(_CANCELLED);
    public static final KartablStatusWS APPROVED = new KartablStatusWS(_APPROVED);
    public static final KartablStatusWS DENIED = new KartablStatusWS(_DENIED);
    public static final KartablStatusWS EXECUTE_ORDERED = new KartablStatusWS(_EXECUTE_ORDERED);
    public static final KartablStatusWS IN_PROGRESS = new KartablStatusWS(_IN_PROGRESS);
    public static final KartablStatusWS SUCCESSFUL = new KartablStatusWS(_SUCCESSFUL);
    public static final KartablStatusWS UNSUCCESSFUL = new KartablStatusWS(_UNSUCCESSFUL);
    public static final KartablStatusWS EXPIRED = new KartablStatusWS(_EXPIRED);
    public java.lang.String getValue() { return _value_;}
    public static KartablStatusWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        KartablStatusWS enumeration = (KartablStatusWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static KartablStatusWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(KartablStatusWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablStatusWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
