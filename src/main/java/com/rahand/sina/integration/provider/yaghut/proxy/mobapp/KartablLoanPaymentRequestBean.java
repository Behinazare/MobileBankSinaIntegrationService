/**
 * KartablLoanPaymentRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class KartablLoanPaymentRequestBean  implements java.io.Serializable {
    private java.lang.String additionalDescription;

    private java.math.BigDecimal amount;

    private java.lang.String cif;

    private java.lang.String customDepositNumber;

    private java.lang.String loanNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanPaymentMethodWS paymentMethod;

    public KartablLoanPaymentRequestBean() {
    }

    public KartablLoanPaymentRequestBean(
           java.lang.String additionalDescription,
           java.math.BigDecimal amount,
           java.lang.String cif,
           java.lang.String customDepositNumber,
           java.lang.String loanNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanPaymentMethodWS paymentMethod) {
           this.additionalDescription = additionalDescription;
           this.amount = amount;
           this.cif = cif;
           this.customDepositNumber = customDepositNumber;
           this.loanNumber = loanNumber;
           this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the additionalDescription value for this KartablLoanPaymentRequestBean.
     * 
     * @return additionalDescription
     */
    public java.lang.String getAdditionalDescription() {
        return additionalDescription;
    }


    /**
     * Sets the additionalDescription value for this KartablLoanPaymentRequestBean.
     * 
     * @param additionalDescription
     */
    public void setAdditionalDescription(java.lang.String additionalDescription) {
        this.additionalDescription = additionalDescription;
    }


    /**
     * Gets the amount value for this KartablLoanPaymentRequestBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this KartablLoanPaymentRequestBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cif value for this KartablLoanPaymentRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this KartablLoanPaymentRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the customDepositNumber value for this KartablLoanPaymentRequestBean.
     * 
     * @return customDepositNumber
     */
    public java.lang.String getCustomDepositNumber() {
        return customDepositNumber;
    }


    /**
     * Sets the customDepositNumber value for this KartablLoanPaymentRequestBean.
     * 
     * @param customDepositNumber
     */
    public void setCustomDepositNumber(java.lang.String customDepositNumber) {
        this.customDepositNumber = customDepositNumber;
    }


    /**
     * Gets the loanNumber value for this KartablLoanPaymentRequestBean.
     * 
     * @return loanNumber
     */
    public java.lang.String getLoanNumber() {
        return loanNumber;
    }


    /**
     * Sets the loanNumber value for this KartablLoanPaymentRequestBean.
     * 
     * @param loanNumber
     */
    public void setLoanNumber(java.lang.String loanNumber) {
        this.loanNumber = loanNumber;
    }


    /**
     * Gets the paymentMethod value for this KartablLoanPaymentRequestBean.
     * 
     * @return paymentMethod
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanPaymentMethodWS getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this KartablLoanPaymentRequestBean.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanPaymentMethodWS paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KartablLoanPaymentRequestBean)) return false;
        KartablLoanPaymentRequestBean other = (KartablLoanPaymentRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalDescription==null && other.getAdditionalDescription()==null) || 
             (this.additionalDescription!=null &&
              this.additionalDescription.equals(other.getAdditionalDescription()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.customDepositNumber==null && other.getCustomDepositNumber()==null) || 
             (this.customDepositNumber!=null &&
              this.customDepositNumber.equals(other.getCustomDepositNumber()))) &&
            ((this.loanNumber==null && other.getLoanNumber()==null) || 
             (this.loanNumber!=null &&
              this.loanNumber.equals(other.getLoanNumber()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod())));
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
        if (getAdditionalDescription() != null) {
            _hashCode += getAdditionalDescription().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getCustomDepositNumber() != null) {
            _hashCode += getCustomDepositNumber().hashCode();
        }
        if (getLoanNumber() != null) {
            _hashCode += getLoanNumber().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KartablLoanPaymentRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablLoanPaymentRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanPaymentMethodWS"));
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
