/**
 * TransferChequeStatusWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class TransferChequeStatusWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransferChequeStatusWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IN_WAY = "IN_WAY";
    public static final java.lang.String _CASH = "CASH";
    public static final java.lang.String _REJECT = "REJECT";
    public static final java.lang.String _SEND_TO_CLER = "SEND_TO_CLER";
    public static final java.lang.String _RETURN = "RETURN";
    public static final java.lang.String _RETURN_REJECT = "RETURN_REJECT";
    public static final java.lang.String _WITHOUT_ACTION = "WITHOUT_ACTION";
    public static final java.lang.String _RETURN_WITHOUT_ACTION = "RETURN_WITHOUT_ACTION";
    public static final TransferChequeStatusWS IN_WAY = new TransferChequeStatusWS(_IN_WAY);
    public static final TransferChequeStatusWS CASH = new TransferChequeStatusWS(_CASH);
    public static final TransferChequeStatusWS REJECT = new TransferChequeStatusWS(_REJECT);
    public static final TransferChequeStatusWS SEND_TO_CLER = new TransferChequeStatusWS(_SEND_TO_CLER);
    public static final TransferChequeStatusWS RETURN = new TransferChequeStatusWS(_RETURN);
    public static final TransferChequeStatusWS RETURN_REJECT = new TransferChequeStatusWS(_RETURN_REJECT);
    public static final TransferChequeStatusWS WITHOUT_ACTION = new TransferChequeStatusWS(_WITHOUT_ACTION);
    public static final TransferChequeStatusWS RETURN_WITHOUT_ACTION = new TransferChequeStatusWS(_RETURN_WITHOUT_ACTION);
    public java.lang.String getValue() { return _value_;}
    public static TransferChequeStatusWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransferChequeStatusWS enumeration = (TransferChequeStatusWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransferChequeStatusWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransferChequeStatusWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transferChequeStatusWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
