/**
 * CreditBillPaymentRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CreditBillPaymentRequestBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String cif;

    private java.lang.String depositNumber;

    private java.lang.String dossierNumber;

    private boolean fullSettlement;

    private boolean paiedFromAutomaticDeposit;

    public CreditBillPaymentRequestBean() {
    }

    public CreditBillPaymentRequestBean(
           java.math.BigDecimal amount,
           java.lang.String cif,
           java.lang.String depositNumber,
           java.lang.String dossierNumber,
           boolean fullSettlement,
           boolean paiedFromAutomaticDeposit) {
           this.amount = amount;
           this.cif = cif;
           this.depositNumber = depositNumber;
           this.dossierNumber = dossierNumber;
           this.fullSettlement = fullSettlement;
           this.paiedFromAutomaticDeposit = paiedFromAutomaticDeposit;
    }


    /**
     * Gets the amount value for this CreditBillPaymentRequestBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CreditBillPaymentRequestBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cif value for this CreditBillPaymentRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this CreditBillPaymentRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the depositNumber value for this CreditBillPaymentRequestBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this CreditBillPaymentRequestBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the dossierNumber value for this CreditBillPaymentRequestBean.
     * 
     * @return dossierNumber
     */
    public java.lang.String getDossierNumber() {
        return dossierNumber;
    }


    /**
     * Sets the dossierNumber value for this CreditBillPaymentRequestBean.
     * 
     * @param dossierNumber
     */
    public void setDossierNumber(java.lang.String dossierNumber) {
        this.dossierNumber = dossierNumber;
    }


    /**
     * Gets the fullSettlement value for this CreditBillPaymentRequestBean.
     * 
     * @return fullSettlement
     */
    public boolean isFullSettlement() {
        return fullSettlement;
    }


    /**
     * Sets the fullSettlement value for this CreditBillPaymentRequestBean.
     * 
     * @param fullSettlement
     */
    public void setFullSettlement(boolean fullSettlement) {
        this.fullSettlement = fullSettlement;
    }


    /**
     * Gets the paiedFromAutomaticDeposit value for this CreditBillPaymentRequestBean.
     * 
     * @return paiedFromAutomaticDeposit
     */
    public boolean isPaiedFromAutomaticDeposit() {
        return paiedFromAutomaticDeposit;
    }


    /**
     * Sets the paiedFromAutomaticDeposit value for this CreditBillPaymentRequestBean.
     * 
     * @param paiedFromAutomaticDeposit
     */
    public void setPaiedFromAutomaticDeposit(boolean paiedFromAutomaticDeposit) {
        this.paiedFromAutomaticDeposit = paiedFromAutomaticDeposit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditBillPaymentRequestBean)) return false;
        CreditBillPaymentRequestBean other = (CreditBillPaymentRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.dossierNumber==null && other.getDossierNumber()==null) || 
             (this.dossierNumber!=null &&
              this.dossierNumber.equals(other.getDossierNumber()))) &&
            this.fullSettlement == other.isFullSettlement() &&
            this.paiedFromAutomaticDeposit == other.isPaiedFromAutomaticDeposit();
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getDossierNumber() != null) {
            _hashCode += getDossierNumber().hashCode();
        }
        _hashCode += (isFullSettlement() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPaiedFromAutomaticDeposit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditBillPaymentRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "creditBillPaymentRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossierNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dossierNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullSettlement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullSettlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paiedFromAutomaticDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paiedFromAutomaticDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
