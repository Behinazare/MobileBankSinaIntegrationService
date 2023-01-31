/**
 * ProcessCodeWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ProcessCodeWS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProcessCodeWS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _GOODS_AND_SERVICE = "GOODS_AND_SERVICE";
    public static final java.lang.String _CASH = "CASH";
    public static final java.lang.String _DEBIT_ADJUSTMENT = "DEBIT_ADJUSTMENT";
    public static final java.lang.String _CHEQUE_GUARANTEE = "CHEQUE_GUARANTEE";
    public static final java.lang.String _CHEQUE_VERIFICATION = "CHEQUE_VERIFICATION";
    public static final java.lang.String _EURO_CHEQUE = "EURO_CHEQUE";
    public static final java.lang.String _TRAVELLER_CHEQUE = "TRAVELLER_CHEQUE";
    public static final java.lang.String _LETTER_OF_CREDIT = "LETTER_OF_CREDIT";
    public static final java.lang.String _GIRO = "GIRO";
    public static final java.lang.String _GOODS_AND_SERVICE_WITH_CASH_DISBURSEMENT = "GOODS_AND_SERVICE_WITH_CASH_DISBURSEMENT";
    public static final java.lang.String _NON_CASH_FINANCIAL_INSTRUMENT = "NON_CASH_FINANCIAL_INSTRUMENT";
    public static final java.lang.String _QUASI_CASH_AND_SCRIP = "QUASI_CASH_AND_SCRIP";
    public static final java.lang.String _BILL_PAYMENT = "BILL_PAYMENT";
    public static final java.lang.String _RETURNS = "RETURNS";
    public static final java.lang.String _DEPOSITS = "DEPOSITS";
    public static final java.lang.String _CREDIT_ADJUSTMENT = "CREDIT_ADJUSTMENT";
    public static final java.lang.String _CHEQUE_DEPOSIT_GUARANTEE = "CHEQUE_DEPOSIT_GUARANTEE";
    public static final java.lang.String _CHEQUE_DEPOSIT = "CHEQUE_DEPOSIT";
    public static final java.lang.String _DEPOSIT_CONFIRM = "DEPOSIT_CONFIRM";
    public static final java.lang.String _RETRACT_CONFIRM = "RETRACT_CONFIRM";
    public static final java.lang.String _AVAILABLE_FUNDS_INQUIRY = "AVAILABLE_FUNDS_INQUIRY";
    public static final java.lang.String _BALANCE_INQUIRY = "BALANCE_INQUIRY";
    public static final java.lang.String _BILL_INQUIRY = "BILL_INQUIRY";
    public static final java.lang.String _ACCOUNT_CHEQUE_INQUIRY = "ACCOUNT_CHEQUE_INQUIRY";
    public static final java.lang.String _CUSTOMER_PAN_INQUIRY = "CUSTOMER_PAN_INQUIRY";
    public static final java.lang.String _CUSTOMER_DEPOSIT_INQUIRY = "CUSTOMER_DEPOSIT_INQUIRY";
    public static final java.lang.String _BILL = "BILL";
    public static final java.lang.String _ACCOUNT_LIST_INQUIRY = "ACCOUNT_LIST_INQUIRY";
    public static final java.lang.String _MIN_BILL = "MIN_BILL";
    public static final java.lang.String _TRANSFER = "TRANSFER";
    public static final java.lang.String _TRANSFER_FROM = "TRANSFER_FROM";
    public static final java.lang.String _TRANSFER_TO = "TRANSFER_TO";
    public static final java.lang.String _TRANSFER_TO_PAN = "TRANSFER_TO_PAN";
    public static final java.lang.String _PAYMENT = "PAYMENT";
    public static final java.lang.String _GENERAL = "GENERAL";
    public static final java.lang.String _CHARGE_BACK = "CHARGE_BACK";
    public static final java.lang.String _CARD_CAPTURED = "CARD_CAPTURED";
    public static final java.lang.String _CHANGE_PIN_2 = "CHANGE_PIN_2";
    public static final java.lang.String _AMBIGUOUS = "AMBIGUOUS";
    public static final java.lang.String _UN_BLOCK = "UN_BLOCK";
    public static final java.lang.String _ATM_REPLENISH = "ATM_REPLENISH";
    public static final java.lang.String _ATM_BALANCE = "ATM_BALANCE";
    public static final java.lang.String _SUPERVISOR_BALANCE = "SUPERVISOR_BALANCE";
    public static final java.lang.String _MERCHANT_BALANCE = "MERCHANT_BALANCE";
    public static final java.lang.String _MERCHANT_RESET = "MERCHANT_RESET";
    public static final java.lang.String _CHANGE_FLOOR = "CHANGE_FLOOR";
    public static final java.lang.String _CHARGE = "CHARGE";
    public static final java.lang.String _CHANGE_PIN = "CHANGE_PIN";
    public static final java.lang.String _CARD_AND_PIN_VERIFICATION = "CARD_AND_PIN_VERIFICATION";
    public static final java.lang.String _RETRACT = "RETRACT";
    public static final ProcessCodeWS GOODS_AND_SERVICE = new ProcessCodeWS(_GOODS_AND_SERVICE);
    public static final ProcessCodeWS CASH = new ProcessCodeWS(_CASH);
    public static final ProcessCodeWS DEBIT_ADJUSTMENT = new ProcessCodeWS(_DEBIT_ADJUSTMENT);
    public static final ProcessCodeWS CHEQUE_GUARANTEE = new ProcessCodeWS(_CHEQUE_GUARANTEE);
    public static final ProcessCodeWS CHEQUE_VERIFICATION = new ProcessCodeWS(_CHEQUE_VERIFICATION);
    public static final ProcessCodeWS EURO_CHEQUE = new ProcessCodeWS(_EURO_CHEQUE);
    public static final ProcessCodeWS TRAVELLER_CHEQUE = new ProcessCodeWS(_TRAVELLER_CHEQUE);
    public static final ProcessCodeWS LETTER_OF_CREDIT = new ProcessCodeWS(_LETTER_OF_CREDIT);
    public static final ProcessCodeWS GIRO = new ProcessCodeWS(_GIRO);
    public static final ProcessCodeWS GOODS_AND_SERVICE_WITH_CASH_DISBURSEMENT = new ProcessCodeWS(_GOODS_AND_SERVICE_WITH_CASH_DISBURSEMENT);
    public static final ProcessCodeWS NON_CASH_FINANCIAL_INSTRUMENT = new ProcessCodeWS(_NON_CASH_FINANCIAL_INSTRUMENT);
    public static final ProcessCodeWS QUASI_CASH_AND_SCRIP = new ProcessCodeWS(_QUASI_CASH_AND_SCRIP);
    public static final ProcessCodeWS BILL_PAYMENT = new ProcessCodeWS(_BILL_PAYMENT);
    public static final ProcessCodeWS RETURNS = new ProcessCodeWS(_RETURNS);
    public static final ProcessCodeWS DEPOSITS = new ProcessCodeWS(_DEPOSITS);
    public static final ProcessCodeWS CREDIT_ADJUSTMENT = new ProcessCodeWS(_CREDIT_ADJUSTMENT);
    public static final ProcessCodeWS CHEQUE_DEPOSIT_GUARANTEE = new ProcessCodeWS(_CHEQUE_DEPOSIT_GUARANTEE);
    public static final ProcessCodeWS CHEQUE_DEPOSIT = new ProcessCodeWS(_CHEQUE_DEPOSIT);
    public static final ProcessCodeWS DEPOSIT_CONFIRM = new ProcessCodeWS(_DEPOSIT_CONFIRM);
    public static final ProcessCodeWS RETRACT_CONFIRM = new ProcessCodeWS(_RETRACT_CONFIRM);
    public static final ProcessCodeWS AVAILABLE_FUNDS_INQUIRY = new ProcessCodeWS(_AVAILABLE_FUNDS_INQUIRY);
    public static final ProcessCodeWS BALANCE_INQUIRY = new ProcessCodeWS(_BALANCE_INQUIRY);
    public static final ProcessCodeWS BILL_INQUIRY = new ProcessCodeWS(_BILL_INQUIRY);
    public static final ProcessCodeWS ACCOUNT_CHEQUE_INQUIRY = new ProcessCodeWS(_ACCOUNT_CHEQUE_INQUIRY);
    public static final ProcessCodeWS CUSTOMER_PAN_INQUIRY = new ProcessCodeWS(_CUSTOMER_PAN_INQUIRY);
    public static final ProcessCodeWS CUSTOMER_DEPOSIT_INQUIRY = new ProcessCodeWS(_CUSTOMER_DEPOSIT_INQUIRY);
    public static final ProcessCodeWS BILL = new ProcessCodeWS(_BILL);
    public static final ProcessCodeWS ACCOUNT_LIST_INQUIRY = new ProcessCodeWS(_ACCOUNT_LIST_INQUIRY);
    public static final ProcessCodeWS MIN_BILL = new ProcessCodeWS(_MIN_BILL);
    public static final ProcessCodeWS TRANSFER = new ProcessCodeWS(_TRANSFER);
    public static final ProcessCodeWS TRANSFER_FROM = new ProcessCodeWS(_TRANSFER_FROM);
    public static final ProcessCodeWS TRANSFER_TO = new ProcessCodeWS(_TRANSFER_TO);
    public static final ProcessCodeWS TRANSFER_TO_PAN = new ProcessCodeWS(_TRANSFER_TO_PAN);
    public static final ProcessCodeWS PAYMENT = new ProcessCodeWS(_PAYMENT);
    public static final ProcessCodeWS GENERAL = new ProcessCodeWS(_GENERAL);
    public static final ProcessCodeWS CHARGE_BACK = new ProcessCodeWS(_CHARGE_BACK);
    public static final ProcessCodeWS CARD_CAPTURED = new ProcessCodeWS(_CARD_CAPTURED);
    public static final ProcessCodeWS CHANGE_PIN_2 = new ProcessCodeWS(_CHANGE_PIN_2);
    public static final ProcessCodeWS AMBIGUOUS = new ProcessCodeWS(_AMBIGUOUS);
    public static final ProcessCodeWS UN_BLOCK = new ProcessCodeWS(_UN_BLOCK);
    public static final ProcessCodeWS ATM_REPLENISH = new ProcessCodeWS(_ATM_REPLENISH);
    public static final ProcessCodeWS ATM_BALANCE = new ProcessCodeWS(_ATM_BALANCE);
    public static final ProcessCodeWS SUPERVISOR_BALANCE = new ProcessCodeWS(_SUPERVISOR_BALANCE);
    public static final ProcessCodeWS MERCHANT_BALANCE = new ProcessCodeWS(_MERCHANT_BALANCE);
    public static final ProcessCodeWS MERCHANT_RESET = new ProcessCodeWS(_MERCHANT_RESET);
    public static final ProcessCodeWS CHANGE_FLOOR = new ProcessCodeWS(_CHANGE_FLOOR);
    public static final ProcessCodeWS CHARGE = new ProcessCodeWS(_CHARGE);
    public static final ProcessCodeWS CHANGE_PIN = new ProcessCodeWS(_CHANGE_PIN);
    public static final ProcessCodeWS CARD_AND_PIN_VERIFICATION = new ProcessCodeWS(_CARD_AND_PIN_VERIFICATION);
    public static final ProcessCodeWS RETRACT = new ProcessCodeWS(_RETRACT);
    public java.lang.String getValue() { return _value_;}
    public static ProcessCodeWS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProcessCodeWS enumeration = (ProcessCodeWS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProcessCodeWS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProcessCodeWS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processCodeWS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
