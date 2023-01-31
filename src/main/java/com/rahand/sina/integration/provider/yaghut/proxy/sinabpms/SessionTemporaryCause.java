/**
 * SessionTemporaryCause.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class SessionTemporaryCause implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SessionTemporaryCause(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _TICKET_LOGIN = "TICKET_LOGIN";
    public static final String _DIGITAL_SIGNATURE_LOGIN = "DIGITAL_SIGNATURE_LOGIN";
    public static final String _OTHER = "OTHER";
    public static final SessionTemporaryCause TICKET_LOGIN = new SessionTemporaryCause(_TICKET_LOGIN);
    public static final SessionTemporaryCause DIGITAL_SIGNATURE_LOGIN = new SessionTemporaryCause(_DIGITAL_SIGNATURE_LOGIN);
    public static final SessionTemporaryCause OTHER = new SessionTemporaryCause(_OTHER);
    public String getValue() { return _value_;}
    public static SessionTemporaryCause fromValue(String value)
          throws IllegalArgumentException {
        SessionTemporaryCause enumeration = (SessionTemporaryCause)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static SessionTemporaryCause fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionTemporaryCause.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sessionTemporaryCause"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
