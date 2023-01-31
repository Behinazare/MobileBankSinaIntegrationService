/**
 * AchTransferSummeryBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AchTransferSummeryBean  implements java.io.Serializable {
    private java.lang.String currency;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BriefAchTransactionBean[] transactions;

    public AchTransferSummeryBean() {
    }

    public AchTransferSummeryBean(
           java.lang.String currency,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BriefAchTransactionBean[] transactions) {
           this.currency = currency;
           this.transactions = transactions;
    }


    /**
     * Gets the currency value for this AchTransferSummeryBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AchTransferSummeryBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the transactions value for this AchTransferSummeryBean.
     * 
     * @return transactions
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BriefAchTransactionBean[] getTransactions() {
        return transactions;
    }


    /**
     * Sets the transactions value for this AchTransferSummeryBean.
     * 
     * @param transactions
     */
    public void setTransactions(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BriefAchTransactionBean[] transactions) {
        this.transactions = transactions;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BriefAchTransactionBean getTransactions(int i) {
        return this.transactions[i];
    }

    public void setTransactions(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BriefAchTransactionBean _value) {
        this.transactions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AchTransferSummeryBean)) return false;
        AchTransferSummeryBean other = (AchTransferSummeryBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.transactions==null && other.getTransactions()==null) || 
             (this.transactions!=null &&
              java.util.Arrays.equals(this.transactions, other.getTransactions())));
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getTransactions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AchTransferSummeryBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achTransferSummeryBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "briefAchTransactionBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
