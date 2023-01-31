/**
 * DepositBalanceResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositBalanceResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SupplyBean balance;

    private java.math.BigDecimal blockedBalance;

    private java.lang.String currency;

    public DepositBalanceResponseBean() {
    }

    public DepositBalanceResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SupplyBean balance,
           java.math.BigDecimal blockedBalance,
           java.lang.String currency) {
           this.balance = balance;
           this.blockedBalance = blockedBalance;
           this.currency = currency;
    }


    /**
     * Gets the balance value for this DepositBalanceResponseBean.
     * 
     * @return balance
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SupplyBean getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this DepositBalanceResponseBean.
     * 
     * @param balance
     */
    public void setBalance(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SupplyBean balance) {
        this.balance = balance;
    }


    /**
     * Gets the blockedBalance value for this DepositBalanceResponseBean.
     * 
     * @return blockedBalance
     */
    public java.math.BigDecimal getBlockedBalance() {
        return blockedBalance;
    }


    /**
     * Sets the blockedBalance value for this DepositBalanceResponseBean.
     * 
     * @param blockedBalance
     */
    public void setBlockedBalance(java.math.BigDecimal blockedBalance) {
        this.blockedBalance = blockedBalance;
    }


    /**
     * Gets the currency value for this DepositBalanceResponseBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this DepositBalanceResponseBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositBalanceResponseBean)) return false;
        DepositBalanceResponseBean other = (DepositBalanceResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.blockedBalance==null && other.getBlockedBalance()==null) || 
             (this.blockedBalance!=null &&
              this.blockedBalance.equals(other.getBlockedBalance()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getBlockedBalance() != null) {
            _hashCode += getBlockedBalance().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepositBalanceResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositBalanceResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "supplyBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockedBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockedBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
