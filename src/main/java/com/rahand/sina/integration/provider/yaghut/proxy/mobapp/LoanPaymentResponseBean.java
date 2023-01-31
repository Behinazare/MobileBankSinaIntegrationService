/**
 * LoanPaymentResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoanPaymentResponseBean  implements java.io.Serializable {
    private java.math.BigDecimal appliedAmount;

    private java.lang.String currency;

    private java.lang.String documentNumber;

    private java.lang.String documentTitle;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState loanState;

    public LoanPaymentResponseBean() {
    }

    public LoanPaymentResponseBean(
           java.math.BigDecimal appliedAmount,
           java.lang.String currency,
           java.lang.String documentNumber,
           java.lang.String documentTitle,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState loanState) {
           this.appliedAmount = appliedAmount;
           this.currency = currency;
           this.documentNumber = documentNumber;
           this.documentTitle = documentTitle;
           this.loanState = loanState;
    }


    /**
     * Gets the appliedAmount value for this LoanPaymentResponseBean.
     * 
     * @return appliedAmount
     */
    public java.math.BigDecimal getAppliedAmount() {
        return appliedAmount;
    }


    /**
     * Sets the appliedAmount value for this LoanPaymentResponseBean.
     * 
     * @param appliedAmount
     */
    public void setAppliedAmount(java.math.BigDecimal appliedAmount) {
        this.appliedAmount = appliedAmount;
    }


    /**
     * Gets the currency value for this LoanPaymentResponseBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this LoanPaymentResponseBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the documentNumber value for this LoanPaymentResponseBean.
     * 
     * @return documentNumber
     */
    public java.lang.String getDocumentNumber() {
        return documentNumber;
    }


    /**
     * Sets the documentNumber value for this LoanPaymentResponseBean.
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(java.lang.String documentNumber) {
        this.documentNumber = documentNumber;
    }


    /**
     * Gets the documentTitle value for this LoanPaymentResponseBean.
     * 
     * @return documentTitle
     */
    public java.lang.String getDocumentTitle() {
        return documentTitle;
    }


    /**
     * Sets the documentTitle value for this LoanPaymentResponseBean.
     * 
     * @param documentTitle
     */
    public void setDocumentTitle(java.lang.String documentTitle) {
        this.documentTitle = documentTitle;
    }


    /**
     * Gets the loanState value for this LoanPaymentResponseBean.
     * 
     * @return loanState
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState getLoanState() {
        return loanState;
    }


    /**
     * Sets the loanState value for this LoanPaymentResponseBean.
     * 
     * @param loanState
     */
    public void setLoanState(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState loanState) {
        this.loanState = loanState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoanPaymentResponseBean)) return false;
        LoanPaymentResponseBean other = (LoanPaymentResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appliedAmount==null && other.getAppliedAmount()==null) || 
             (this.appliedAmount!=null &&
              this.appliedAmount.equals(other.getAppliedAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.documentNumber==null && other.getDocumentNumber()==null) || 
             (this.documentNumber!=null &&
              this.documentNumber.equals(other.getDocumentNumber()))) &&
            ((this.documentTitle==null && other.getDocumentTitle()==null) || 
             (this.documentTitle!=null &&
              this.documentTitle.equals(other.getDocumentTitle()))) &&
            ((this.loanState==null && other.getLoanState()==null) || 
             (this.loanState!=null &&
              this.loanState.equals(other.getLoanState())));
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
        if (getAppliedAmount() != null) {
            _hashCode += getAppliedAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDocumentNumber() != null) {
            _hashCode += getDocumentNumber().hashCode();
        }
        if (getDocumentTitle() != null) {
            _hashCode += getDocumentTitle().hashCode();
        }
        if (getLoanState() != null) {
            _hashCode += getLoanState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoanPaymentResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanPaymentResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appliedAmount"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanState"));
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
