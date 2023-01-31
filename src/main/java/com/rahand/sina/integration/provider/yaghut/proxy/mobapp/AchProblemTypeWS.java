/**
 * AchProblemTypeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AchProblemTypeWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AchProblemTypeWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _InvalidAccountException = "InvalidAccountException";
    public static final java.lang.String _PermissionException = "PermissionException";
    public static final java.lang.String _IllegalSourceDepositStateException = "IllegalSourceDepositStateException";
    public static final java.lang.String _InvalidIBANException = "InvalidIBANException";
    public static final java.lang.String _IllegalDestinationBankException = "IllegalDestinationBankException";
    public static final java.lang.String _IncorrectCustomerInformationException = "IncorrectCustomerInformationException";
    public static final java.lang.String _ExceedDailyAmountException = "ExceedDailyAmountException";
    public static final java.lang.String _ExceedMonthlyAmountException = "ExceedMonthlyAmountException";
    public static final java.lang.String _InvalidReasonCodeException = "InvalidReasonCodeException";
    public static final java.lang.String _ServiceException = "ServiceException";
    public static final AchProblemTypeWS InvalidAccountException = new AchProblemTypeWS(_InvalidAccountException);
    public static final AchProblemTypeWS PermissionException = new AchProblemTypeWS(_PermissionException);
    public static final AchProblemTypeWS IllegalSourceDepositStateException = new AchProblemTypeWS(_IllegalSourceDepositStateException);
    public static final AchProblemTypeWS InvalidIBANException = new AchProblemTypeWS(_InvalidIBANException);
    public static final AchProblemTypeWS IllegalDestinationBankException = new AchProblemTypeWS(_IllegalDestinationBankException);
    public static final AchProblemTypeWS IncorrectCustomerInformationException = new AchProblemTypeWS(_IncorrectCustomerInformationException);
    public static final AchProblemTypeWS ExceedDailyAmountException = new AchProblemTypeWS(_ExceedDailyAmountException);
    public static final AchProblemTypeWS ExceedMonthlyAmountException = new AchProblemTypeWS(_ExceedMonthlyAmountException);
    public static final AchProblemTypeWS InvalidReasonCodeException = new AchProblemTypeWS(_InvalidReasonCodeException);
    public static final AchProblemTypeWS ServiceException = new AchProblemTypeWS(_ServiceException);
    public java.lang.String getValue() { return _value_;}
    public static AchProblemTypeWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AchProblemTypeWS enumeration = (AchProblemTypeWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AchProblemTypeWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AchProblemTypeWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achProblemTypeWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
