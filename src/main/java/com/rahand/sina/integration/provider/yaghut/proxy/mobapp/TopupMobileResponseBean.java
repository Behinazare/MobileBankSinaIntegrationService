/**
 * TopupMobileResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class TopupMobileResponseBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.math.BigDecimal appliedAmount;

    private java.lang.String appliedCurrency;

    private java.lang.String currency;

    private java.lang.String operatorForeignTitle;

    private java.lang.String operatorTitle;

    private java.lang.String refNumber;

    private java.lang.String switchResponseRRN;

    public TopupMobileResponseBean() {
    }

    public TopupMobileResponseBean(
           java.math.BigDecimal amount,
           java.math.BigDecimal appliedAmount,
           java.lang.String appliedCurrency,
           java.lang.String currency,
           java.lang.String operatorForeignTitle,
           java.lang.String operatorTitle,
           java.lang.String refNumber,
           java.lang.String switchResponseRRN) {
           this.amount = amount;
           this.appliedAmount = appliedAmount;
           this.appliedCurrency = appliedCurrency;
           this.currency = currency;
           this.operatorForeignTitle = operatorForeignTitle;
           this.operatorTitle = operatorTitle;
           this.refNumber = refNumber;
           this.switchResponseRRN = switchResponseRRN;
    }


    /**
     * Gets the amount value for this TopupMobileResponseBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TopupMobileResponseBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the appliedAmount value for this TopupMobileResponseBean.
     * 
     * @return appliedAmount
     */
    public java.math.BigDecimal getAppliedAmount() {
        return appliedAmount;
    }


    /**
     * Sets the appliedAmount value for this TopupMobileResponseBean.
     * 
     * @param appliedAmount
     */
    public void setAppliedAmount(java.math.BigDecimal appliedAmount) {
        this.appliedAmount = appliedAmount;
    }


    /**
     * Gets the appliedCurrency value for this TopupMobileResponseBean.
     * 
     * @return appliedCurrency
     */
    public java.lang.String getAppliedCurrency() {
        return appliedCurrency;
    }


    /**
     * Sets the appliedCurrency value for this TopupMobileResponseBean.
     * 
     * @param appliedCurrency
     */
    public void setAppliedCurrency(java.lang.String appliedCurrency) {
        this.appliedCurrency = appliedCurrency;
    }


    /**
     * Gets the currency value for this TopupMobileResponseBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this TopupMobileResponseBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the operatorForeignTitle value for this TopupMobileResponseBean.
     * 
     * @return operatorForeignTitle
     */
    public java.lang.String getOperatorForeignTitle() {
        return operatorForeignTitle;
    }


    /**
     * Sets the operatorForeignTitle value for this TopupMobileResponseBean.
     * 
     * @param operatorForeignTitle
     */
    public void setOperatorForeignTitle(java.lang.String operatorForeignTitle) {
        this.operatorForeignTitle = operatorForeignTitle;
    }


    /**
     * Gets the operatorTitle value for this TopupMobileResponseBean.
     * 
     * @return operatorTitle
     */
    public java.lang.String getOperatorTitle() {
        return operatorTitle;
    }


    /**
     * Sets the operatorTitle value for this TopupMobileResponseBean.
     * 
     * @param operatorTitle
     */
    public void setOperatorTitle(java.lang.String operatorTitle) {
        this.operatorTitle = operatorTitle;
    }


    /**
     * Gets the refNumber value for this TopupMobileResponseBean.
     * 
     * @return refNumber
     */
    public java.lang.String getRefNumber() {
        return refNumber;
    }


    /**
     * Sets the refNumber value for this TopupMobileResponseBean.
     * 
     * @param refNumber
     */
    public void setRefNumber(java.lang.String refNumber) {
        this.refNumber = refNumber;
    }


    /**
     * Gets the switchResponseRRN value for this TopupMobileResponseBean.
     * 
     * @return switchResponseRRN
     */
    public java.lang.String getSwitchResponseRRN() {
        return switchResponseRRN;
    }


    /**
     * Sets the switchResponseRRN value for this TopupMobileResponseBean.
     * 
     * @param switchResponseRRN
     */
    public void setSwitchResponseRRN(java.lang.String switchResponseRRN) {
        this.switchResponseRRN = switchResponseRRN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopupMobileResponseBean)) return false;
        TopupMobileResponseBean other = (TopupMobileResponseBean) obj;
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
            ((this.appliedAmount==null && other.getAppliedAmount()==null) || 
             (this.appliedAmount!=null &&
              this.appliedAmount.equals(other.getAppliedAmount()))) &&
            ((this.appliedCurrency==null && other.getAppliedCurrency()==null) || 
             (this.appliedCurrency!=null &&
              this.appliedCurrency.equals(other.getAppliedCurrency()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.operatorForeignTitle==null && other.getOperatorForeignTitle()==null) || 
             (this.operatorForeignTitle!=null &&
              this.operatorForeignTitle.equals(other.getOperatorForeignTitle()))) &&
            ((this.operatorTitle==null && other.getOperatorTitle()==null) || 
             (this.operatorTitle!=null &&
              this.operatorTitle.equals(other.getOperatorTitle()))) &&
            ((this.refNumber==null && other.getRefNumber()==null) || 
             (this.refNumber!=null &&
              this.refNumber.equals(other.getRefNumber()))) &&
            ((this.switchResponseRRN==null && other.getSwitchResponseRRN()==null) || 
             (this.switchResponseRRN!=null &&
              this.switchResponseRRN.equals(other.getSwitchResponseRRN())));
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
        if (getAppliedAmount() != null) {
            _hashCode += getAppliedAmount().hashCode();
        }
        if (getAppliedCurrency() != null) {
            _hashCode += getAppliedCurrency().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getOperatorForeignTitle() != null) {
            _hashCode += getOperatorForeignTitle().hashCode();
        }
        if (getOperatorTitle() != null) {
            _hashCode += getOperatorTitle().hashCode();
        }
        if (getRefNumber() != null) {
            _hashCode += getRefNumber().hashCode();
        }
        if (getSwitchResponseRRN() != null) {
            _hashCode += getSwitchResponseRRN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TopupMobileResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "topupMobileResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appliedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appliedCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorForeignTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatorForeignTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatorTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchResponseRRN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchResponseRRN"));
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
