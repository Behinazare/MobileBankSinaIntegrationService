/**
 * RtgsSystemCodeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class RtgsSystemCodeWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RtgsSystemCodeWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TAVASOT_KARBAR_SHOBE = "TAVASOT_KARBAR_SHOBE";
    public static final java.lang.String _TAVASOT_SHOBE_TAEED_KONANDE = "TAVASOT_SHOBE_TAEED_KONANDE";
    public static final java.lang.String _TAVASOT_KARBAR_SHOBE_SANTA = "TAVASOT_KARBAR_SHOBE_SANTA";
    public static final java.lang.String _TAVASOT_BANKDARI_MODERN = "TAVASOT_BANKDARI_MODERN";
    public static final java.lang.String _TAVASOT_FERESTANDE_GIRANDE_SATNA = "TAVASOT_FERESTANDE_GIRANDE_SATNA";
    public static final RtgsSystemCodeWS TAVASOT_KARBAR_SHOBE = new RtgsSystemCodeWS(_TAVASOT_KARBAR_SHOBE);
    public static final RtgsSystemCodeWS TAVASOT_SHOBE_TAEED_KONANDE = new RtgsSystemCodeWS(_TAVASOT_SHOBE_TAEED_KONANDE);
    public static final RtgsSystemCodeWS TAVASOT_KARBAR_SHOBE_SANTA = new RtgsSystemCodeWS(_TAVASOT_KARBAR_SHOBE_SANTA);
    public static final RtgsSystemCodeWS TAVASOT_BANKDARI_MODERN = new RtgsSystemCodeWS(_TAVASOT_BANKDARI_MODERN);
    public static final RtgsSystemCodeWS TAVASOT_FERESTANDE_GIRANDE_SATNA = new RtgsSystemCodeWS(_TAVASOT_FERESTANDE_GIRANDE_SATNA);
    public java.lang.String getValue() { return _value_;}
    public static RtgsSystemCodeWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RtgsSystemCodeWS enumeration = (RtgsSystemCodeWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RtgsSystemCodeWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RtgsSystemCodeWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "rtgsSystemCodeWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
