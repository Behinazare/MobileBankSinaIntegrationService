/**
 * RtgsActionTypeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class RtgsActionTypeWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RtgsActionTypeWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DASTUR_SABT_SHODE = "DASTUR_SABT_SHODE";
    public static final java.lang.String _VIRAYESH_SHODE = "VIRAYESH_SHODE";
    public static final java.lang.String _TALIGH_DAEM = "TALIGH_DAEM";
    public static final java.lang.String _TAEED_SHODE = "TAEED_SHODE";
    public static final java.lang.String _ADAM_TAEED_SHOBE = "ADAM_TAEED_SHOBE";
    public static final java.lang.String _TAEED_SHOBE_SATNA = "TAEED_SHOBE_SATNA";
    public static final java.lang.String _ADAM_TAEED_SHOBE_SATNA = "ADAM_TAEED_SHOBE_SATNA";
    public static final java.lang.String _ERSAL_SHODE_BE_BANK_MAGHSAD = "ERSAL_SHODE_BE_BANK_MAGHSAD";
    public static final java.lang.String _VARIZ_SHODE_BE_BANK_MAGHSAD = "VARIZ_SHODE_BE_BANK_MAGHSAD";
    public static final java.lang.String _VARIZ_NASHODE_BE_BANK_MAGHSAD = "VARIZ_NASHODE_BE_BANK_MAGHSAD";
    public static final RtgsActionTypeWS DASTUR_SABT_SHODE = new RtgsActionTypeWS(_DASTUR_SABT_SHODE);
    public static final RtgsActionTypeWS VIRAYESH_SHODE = new RtgsActionTypeWS(_VIRAYESH_SHODE);
    public static final RtgsActionTypeWS TALIGH_DAEM = new RtgsActionTypeWS(_TALIGH_DAEM);
    public static final RtgsActionTypeWS TAEED_SHODE = new RtgsActionTypeWS(_TAEED_SHODE);
    public static final RtgsActionTypeWS ADAM_TAEED_SHOBE = new RtgsActionTypeWS(_ADAM_TAEED_SHOBE);
    public static final RtgsActionTypeWS TAEED_SHOBE_SATNA = new RtgsActionTypeWS(_TAEED_SHOBE_SATNA);
    public static final RtgsActionTypeWS ADAM_TAEED_SHOBE_SATNA = new RtgsActionTypeWS(_ADAM_TAEED_SHOBE_SATNA);
    public static final RtgsActionTypeWS ERSAL_SHODE_BE_BANK_MAGHSAD = new RtgsActionTypeWS(_ERSAL_SHODE_BE_BANK_MAGHSAD);
    public static final RtgsActionTypeWS VARIZ_SHODE_BE_BANK_MAGHSAD = new RtgsActionTypeWS(_VARIZ_SHODE_BE_BANK_MAGHSAD);
    public static final RtgsActionTypeWS VARIZ_NASHODE_BE_BANK_MAGHSAD = new RtgsActionTypeWS(_VARIZ_NASHODE_BE_BANK_MAGHSAD);
    public java.lang.String getValue() { return _value_;}
    public static RtgsActionTypeWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RtgsActionTypeWS enumeration = (RtgsActionTypeWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RtgsActionTypeWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RtgsActionTypeWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "rtgsActionTypeWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
