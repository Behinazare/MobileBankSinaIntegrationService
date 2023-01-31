/**
 * CommissionResultInfoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CommissionResultInfoBean  implements java.io.Serializable {
    private java.math.BigDecimal commissionAmount;

    private java.lang.String commissionCurrency;

    private java.lang.String commissionDepositNumber;

    public CommissionResultInfoBean() {
    }

    public CommissionResultInfoBean(
           java.math.BigDecimal commissionAmount,
           java.lang.String commissionCurrency,
           java.lang.String commissionDepositNumber) {
           this.commissionAmount = commissionAmount;
           this.commissionCurrency = commissionCurrency;
           this.commissionDepositNumber = commissionDepositNumber;
    }


    /**
     * Gets the commissionAmount value for this CommissionResultInfoBean.
     * 
     * @return commissionAmount
     */
    public java.math.BigDecimal getCommissionAmount() {
        return commissionAmount;
    }


    /**
     * Sets the commissionAmount value for this CommissionResultInfoBean.
     * 
     * @param commissionAmount
     */
    public void setCommissionAmount(java.math.BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }


    /**
     * Gets the commissionCurrency value for this CommissionResultInfoBean.
     * 
     * @return commissionCurrency
     */
    public java.lang.String getCommissionCurrency() {
        return commissionCurrency;
    }


    /**
     * Sets the commissionCurrency value for this CommissionResultInfoBean.
     * 
     * @param commissionCurrency
     */
    public void setCommissionCurrency(java.lang.String commissionCurrency) {
        this.commissionCurrency = commissionCurrency;
    }


    /**
     * Gets the commissionDepositNumber value for this CommissionResultInfoBean.
     * 
     * @return commissionDepositNumber
     */
    public java.lang.String getCommissionDepositNumber() {
        return commissionDepositNumber;
    }


    /**
     * Sets the commissionDepositNumber value for this CommissionResultInfoBean.
     * 
     * @param commissionDepositNumber
     */
    public void setCommissionDepositNumber(java.lang.String commissionDepositNumber) {
        this.commissionDepositNumber = commissionDepositNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommissionResultInfoBean)) return false;
        CommissionResultInfoBean other = (CommissionResultInfoBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commissionAmount==null && other.getCommissionAmount()==null) || 
             (this.commissionAmount!=null &&
              this.commissionAmount.equals(other.getCommissionAmount()))) &&
            ((this.commissionCurrency==null && other.getCommissionCurrency()==null) || 
             (this.commissionCurrency!=null &&
              this.commissionCurrency.equals(other.getCommissionCurrency()))) &&
            ((this.commissionDepositNumber==null && other.getCommissionDepositNumber()==null) || 
             (this.commissionDepositNumber!=null &&
              this.commissionDepositNumber.equals(other.getCommissionDepositNumber())));
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
        if (getCommissionAmount() != null) {
            _hashCode += getCommissionAmount().hashCode();
        }
        if (getCommissionCurrency() != null) {
            _hashCode += getCommissionCurrency().hashCode();
        }
        if (getCommissionDepositNumber() != null) {
            _hashCode += getCommissionDepositNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommissionResultInfoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "commissionResultInfoBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commissionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commissionCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commissionDepositNumber"));
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
