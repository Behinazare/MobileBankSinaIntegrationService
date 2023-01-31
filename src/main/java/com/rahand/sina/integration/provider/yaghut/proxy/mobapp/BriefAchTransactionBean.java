/**
 * BriefAchTransactionBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BriefAchTransactionBean  implements java.io.Serializable {
    private java.lang.Long count;

    private java.math.BigDecimal totalAmount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS transactionStatus;

    public BriefAchTransactionBean() {
    }

    public BriefAchTransactionBean(
           java.lang.Long count,
           java.math.BigDecimal totalAmount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS transactionStatus) {
           this.count = count;
           this.totalAmount = totalAmount;
           this.transactionStatus = transactionStatus;
    }


    /**
     * Gets the count value for this BriefAchTransactionBean.
     * 
     * @return count
     */
    public java.lang.Long getCount() {
        return count;
    }


    /**
     * Sets the count value for this BriefAchTransactionBean.
     * 
     * @param count
     */
    public void setCount(java.lang.Long count) {
        this.count = count;
    }


    /**
     * Gets the totalAmount value for this BriefAchTransactionBean.
     * 
     * @return totalAmount
     */
    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this BriefAchTransactionBean.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the transactionStatus value for this BriefAchTransactionBean.
     * 
     * @return transactionStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS getTransactionStatus() {
        return transactionStatus;
    }


    /**
     * Sets the transactionStatus value for this BriefAchTransactionBean.
     * 
     * @param transactionStatus
     */
    public void setTransactionStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BriefAchTransactionBean)) return false;
        BriefAchTransactionBean other = (BriefAchTransactionBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.transactionStatus==null && other.getTransactionStatus()==null) || 
             (this.transactionStatus!=null &&
              this.transactionStatus.equals(other.getTransactionStatus())));
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
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getTransactionStatus() != null) {
            _hashCode += getTransactionStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BriefAchTransactionBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "briefAchTransactionBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transactionStatusWS"));
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
