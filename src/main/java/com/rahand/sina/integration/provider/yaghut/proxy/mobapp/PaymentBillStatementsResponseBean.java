/**
 * PaymentBillStatementsResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PaymentBillStatementsResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatementBean[] paymentBillStatements;

    private long totalRecord;

    public PaymentBillStatementsResponseBean() {
    }

    public PaymentBillStatementsResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatementBean[] paymentBillStatements,
           long totalRecord) {
           this.paymentBillStatements = paymentBillStatements;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the paymentBillStatements value for this PaymentBillStatementsResponseBean.
     * 
     * @return paymentBillStatements
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatementBean[] getPaymentBillStatements() {
        return paymentBillStatements;
    }


    /**
     * Sets the paymentBillStatements value for this PaymentBillStatementsResponseBean.
     * 
     * @param paymentBillStatements
     */
    public void setPaymentBillStatements(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatementBean[] paymentBillStatements) {
        this.paymentBillStatements = paymentBillStatements;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatementBean getPaymentBillStatements(int i) {
        return this.paymentBillStatements[i];
    }

    public void setPaymentBillStatements(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatementBean _value) {
        this.paymentBillStatements[i] = _value;
    }


    /**
     * Gets the totalRecord value for this PaymentBillStatementsResponseBean.
     * 
     * @return totalRecord
     */
    public long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this PaymentBillStatementsResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentBillStatementsResponseBean)) return false;
        PaymentBillStatementsResponseBean other = (PaymentBillStatementsResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentBillStatements==null && other.getPaymentBillStatements()==null) || 
             (this.paymentBillStatements!=null &&
              java.util.Arrays.equals(this.paymentBillStatements, other.getPaymentBillStatements()))) &&
            this.totalRecord == other.getTotalRecord();
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
        if (getPaymentBillStatements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentBillStatements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentBillStatements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getTotalRecord()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentBillStatementsResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentBillStatementsResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentBillStatements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentBillStatements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentBillStatementBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
