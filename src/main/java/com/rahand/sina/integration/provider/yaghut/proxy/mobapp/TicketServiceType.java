/**
 * TicketServiceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class TicketServiceType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TicketServiceType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BATCH_TRANSFER = "BATCH_TRANSFER";
    public static final java.lang.String _NORMAL_TRANSFER = "NORMAL_TRANSFER";
    public static final java.lang.String _AUTO_TRANSFER = "AUTO_TRANSFER";
    public static final java.lang.String _SATNA = "SATNA";
    public static final java.lang.String _NORMAL_ACH_TRANSFER = "NORMAL_ACH_TRANSFER";
    public static final java.lang.String _BATCH_ACH_TRANSFER = "BATCH_ACH_TRANSFER";
    public static final java.lang.String _AUTO_ACH_TRANSFER = "AUTO_ACH_TRANSFER";
    public static final java.lang.String _PAY_LOAN = "PAY_LOAN";
    public static final java.lang.String _PAY_BILL = "PAY_BILL";
    public static final java.lang.String _PURCHASE_BONDS = "PURCHASE_BONDS";
    public static final java.lang.String _SETTLE_BONDS = "SETTLE_BONDS";
    public static final java.lang.String _DEPOSIT_BILL_PAYMENT = "DEPOSIT_BILL_PAYMENT";
    public static final java.lang.String _DEPOSIT_BATCH_PAYMENT = "DEPOSIT_BATCH_PAYMENT";
    public static final java.lang.String _DEPOSIT_TO_CARD_TRANSFER = "DEPOSIT_TO_CARD_TRANSFER";
    public static final java.lang.String _APPROVE_KARTABL = "APPROVE_KARTABL";
    public static final java.lang.String _EXECUTE_KARTABL = "EXECUTE_KARTABL";
    public static final java.lang.String _LOGIN = "LOGIN";
    public static final java.lang.String _SIGNUP = "SIGNUP";
    public static final java.lang.String _RESET_STATIC_PASSWORD = "RESET_STATIC_PASSWORD";
    public static final java.lang.String _TWO_PHASE_LOGIN = "TWO_PHASE_LOGIN";
    public static final java.lang.String _TOPUP_MOBILE_BY_DEPOSIT = "TOPUP_MOBILE_BY_DEPOSIT";
    public static final java.lang.String _DEPOSIT_PAYMENT = "DEPOSIT_PAYMENT";
    public static final java.lang.String _CUSTOM = "CUSTOM";
    public static final java.lang.String _INAUGURATE_DEPOSIT = "INAUGURATE_DEPOSIT";
    public static final java.lang.String _POL_PAYMENT = "POL_PAYMENT";
    public static final java.lang.String _BULK_ACH_TRANSFER = "BULK_ACH_TRANSFER";
    public static final TicketServiceType BATCH_TRANSFER = new TicketServiceType(_BATCH_TRANSFER);
    public static final TicketServiceType NORMAL_TRANSFER = new TicketServiceType(_NORMAL_TRANSFER);
    public static final TicketServiceType AUTO_TRANSFER = new TicketServiceType(_AUTO_TRANSFER);
    public static final TicketServiceType SATNA = new TicketServiceType(_SATNA);
    public static final TicketServiceType NORMAL_ACH_TRANSFER = new TicketServiceType(_NORMAL_ACH_TRANSFER);
    public static final TicketServiceType BATCH_ACH_TRANSFER = new TicketServiceType(_BATCH_ACH_TRANSFER);
    public static final TicketServiceType AUTO_ACH_TRANSFER = new TicketServiceType(_AUTO_ACH_TRANSFER);
    public static final TicketServiceType PAY_LOAN = new TicketServiceType(_PAY_LOAN);
    public static final TicketServiceType PAY_BILL = new TicketServiceType(_PAY_BILL);
    public static final TicketServiceType PURCHASE_BONDS = new TicketServiceType(_PURCHASE_BONDS);
    public static final TicketServiceType SETTLE_BONDS = new TicketServiceType(_SETTLE_BONDS);
    public static final TicketServiceType DEPOSIT_BILL_PAYMENT = new TicketServiceType(_DEPOSIT_BILL_PAYMENT);
    public static final TicketServiceType DEPOSIT_BATCH_PAYMENT = new TicketServiceType(_DEPOSIT_BATCH_PAYMENT);
    public static final TicketServiceType DEPOSIT_TO_CARD_TRANSFER = new TicketServiceType(_DEPOSIT_TO_CARD_TRANSFER);
    public static final TicketServiceType APPROVE_KARTABL = new TicketServiceType(_APPROVE_KARTABL);
    public static final TicketServiceType EXECUTE_KARTABL = new TicketServiceType(_EXECUTE_KARTABL);
    public static final TicketServiceType LOGIN = new TicketServiceType(_LOGIN);
    public static final TicketServiceType SIGNUP = new TicketServiceType(_SIGNUP);
    public static final TicketServiceType RESET_STATIC_PASSWORD = new TicketServiceType(_RESET_STATIC_PASSWORD);
    public static final TicketServiceType TWO_PHASE_LOGIN = new TicketServiceType(_TWO_PHASE_LOGIN);
    public static final TicketServiceType TOPUP_MOBILE_BY_DEPOSIT = new TicketServiceType(_TOPUP_MOBILE_BY_DEPOSIT);
    public static final TicketServiceType DEPOSIT_PAYMENT = new TicketServiceType(_DEPOSIT_PAYMENT);
    public static final TicketServiceType CUSTOM = new TicketServiceType(_CUSTOM);
    public static final TicketServiceType INAUGURATE_DEPOSIT = new TicketServiceType(_INAUGURATE_DEPOSIT);
    public static final TicketServiceType POL_PAYMENT = new TicketServiceType(_POL_PAYMENT);
    public static final TicketServiceType BULK_ACH_TRANSFER = new TicketServiceType(_BULK_ACH_TRANSFER);
    public java.lang.String getValue() { return _value_;}
    public static TicketServiceType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TicketServiceType enumeration = (TicketServiceType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TicketServiceType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TicketServiceType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "ticketServiceType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
