/**
 * ProblemTypeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ProblemTypeWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProblemTypeWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IllegalBillIdException = "IllegalBillIdException";
    public static final java.lang.String _IllegalPayIdException = "IllegalPayIdException";
    public static final java.lang.String _BillTypeSupportException = "BillTypeSupportException";
    public static final java.lang.String _NoSufficientFundException = "NoSufficientFundException";
    public static final java.lang.String _ExceedWithdrawalException = "ExceedWithdrawalException";
    public static final java.lang.String _DuplicateTransactionException = "DuplicateTransactionException";
    public static final java.lang.String _AmountConstrainViolationException = "AmountConstrainViolationException";
    public static final java.lang.String _InvalidDepositOrCardException = "InvalidDepositOrCardException";
    public static final java.lang.String _BusinessException = "BusinessException";
    public static final java.lang.String _ServiceException = "ServiceException";
    public static final ProblemTypeWS IllegalBillIdException = new ProblemTypeWS(_IllegalBillIdException);
    public static final ProblemTypeWS IllegalPayIdException = new ProblemTypeWS(_IllegalPayIdException);
    public static final ProblemTypeWS BillTypeSupportException = new ProblemTypeWS(_BillTypeSupportException);
    public static final ProblemTypeWS NoSufficientFundException = new ProblemTypeWS(_NoSufficientFundException);
    public static final ProblemTypeWS ExceedWithdrawalException = new ProblemTypeWS(_ExceedWithdrawalException);
    public static final ProblemTypeWS DuplicateTransactionException = new ProblemTypeWS(_DuplicateTransactionException);
    public static final ProblemTypeWS AmountConstrainViolationException = new ProblemTypeWS(_AmountConstrainViolationException);
    public static final ProblemTypeWS InvalidDepositOrCardException = new ProblemTypeWS(_InvalidDepositOrCardException);
    public static final ProblemTypeWS BusinessException = new ProblemTypeWS(_BusinessException);
    public static final ProblemTypeWS ServiceException = new ProblemTypeWS(_ServiceException);
    public java.lang.String getValue() { return _value_;}
    public static ProblemTypeWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProblemTypeWS enumeration = (ProblemTypeWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProblemTypeWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProblemTypeWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "problemTypeWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
