/**
 * RtgsTransferStatusWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class RtgsTransferStatusWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RtgsTransferStatusWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SABT_SHODE = "SABT_SHODE";
    public static final java.lang.String _TAEED_SHOBE_SHODE = "TAEED_SHOBE_SHODE";
    public static final java.lang.String _ADAM_TAEED_SHOBE = "ADAM_TAEED_SHOBE";
    public static final java.lang.String _HAZF_SHODE = "HAZF_SHODE";
    public static final java.lang.String _TAEED_SHOBE_SATNA = "TAEED_SHOBE_SATNA";
    public static final java.lang.String _ADAM_TAEED_SHOBE_SATNA = "ADAM_TAEED_SHOBE_SATNA";
    public static final java.lang.String _ERSAL_SHODE = "ERSAL_SHODE";
    public static final java.lang.String _TASFIYEH_SHODE = "TASFIYEH_SHODE";
    public static final java.lang.String _TASFIYEH_NASHODE = "TASFIYEH_NASHODE";
    public static final RtgsTransferStatusWS SABT_SHODE = new RtgsTransferStatusWS(_SABT_SHODE);
    public static final RtgsTransferStatusWS TAEED_SHOBE_SHODE = new RtgsTransferStatusWS(_TAEED_SHOBE_SHODE);
    public static final RtgsTransferStatusWS ADAM_TAEED_SHOBE = new RtgsTransferStatusWS(_ADAM_TAEED_SHOBE);
    public static final RtgsTransferStatusWS HAZF_SHODE = new RtgsTransferStatusWS(_HAZF_SHODE);
    public static final RtgsTransferStatusWS TAEED_SHOBE_SATNA = new RtgsTransferStatusWS(_TAEED_SHOBE_SATNA);
    public static final RtgsTransferStatusWS ADAM_TAEED_SHOBE_SATNA = new RtgsTransferStatusWS(_ADAM_TAEED_SHOBE_SATNA);
    public static final RtgsTransferStatusWS ERSAL_SHODE = new RtgsTransferStatusWS(_ERSAL_SHODE);
    public static final RtgsTransferStatusWS TASFIYEH_SHODE = new RtgsTransferStatusWS(_TASFIYEH_SHODE);
    public static final RtgsTransferStatusWS TASFIYEH_NASHODE = new RtgsTransferStatusWS(_TASFIYEH_NASHODE);
    public java.lang.String getValue() { return _value_;}
    public static RtgsTransferStatusWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RtgsTransferStatusWS enumeration = (RtgsTransferStatusWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RtgsTransferStatusWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RtgsTransferStatusWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "rtgsTransferStatusWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
