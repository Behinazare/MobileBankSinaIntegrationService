/**
 * CardBalanceResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardBalanceResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean availableBalance;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean ledgerBalance;

    public CardBalanceResponseBean() {
    }

    public CardBalanceResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean availableBalance,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean ledgerBalance) {
           this.availableBalance = availableBalance;
           this.ledgerBalance = ledgerBalance;
    }


    /**
     * Gets the availableBalance value for this CardBalanceResponseBean.
     * 
     * @return availableBalance
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean getAvailableBalance() {
        return availableBalance;
    }


    /**
     * Sets the availableBalance value for this CardBalanceResponseBean.
     * 
     * @param availableBalance
     */
    public void setAvailableBalance(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean availableBalance) {
        this.availableBalance = availableBalance;
    }


    /**
     * Gets the ledgerBalance value for this CardBalanceResponseBean.
     * 
     * @return ledgerBalance
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean getLedgerBalance() {
        return ledgerBalance;
    }


    /**
     * Sets the ledgerBalance value for this CardBalanceResponseBean.
     * 
     * @param ledgerBalance
     */
    public void setLedgerBalance(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean ledgerBalance) {
        this.ledgerBalance = ledgerBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardBalanceResponseBean)) return false;
        CardBalanceResponseBean other = (CardBalanceResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availableBalance==null && other.getAvailableBalance()==null) || 
             (this.availableBalance!=null &&
              this.availableBalance.equals(other.getAvailableBalance()))) &&
            ((this.ledgerBalance==null && other.getLedgerBalance()==null) || 
             (this.ledgerBalance!=null &&
              this.ledgerBalance.equals(other.getLedgerBalance())));
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
        if (getAvailableBalance() != null) {
            _hashCode += getAvailableBalance().hashCode();
        }
        if (getLedgerBalance() != null) {
            _hashCode += getLedgerBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardBalanceResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardBalanceResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availableBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "amountBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ledgerBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ledgerBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "amountBean"));
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
