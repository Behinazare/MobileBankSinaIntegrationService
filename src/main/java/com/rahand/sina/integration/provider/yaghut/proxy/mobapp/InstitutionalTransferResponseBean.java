/**
 * InstitutionalTransferResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class InstitutionalTransferResponseBean  implements java.io.Serializable {
    private java.lang.String currency;

    private java.util.Calendar documentDate;

    private java.lang.String institutionTitle;

    private java.lang.String referenceNumber;

    private java.math.BigDecimal sourceDepositBalance;

    public InstitutionalTransferResponseBean() {
    }

    public InstitutionalTransferResponseBean(
           java.lang.String currency,
           java.util.Calendar documentDate,
           java.lang.String institutionTitle,
           java.lang.String referenceNumber,
           java.math.BigDecimal sourceDepositBalance) {
           this.currency = currency;
           this.documentDate = documentDate;
           this.institutionTitle = institutionTitle;
           this.referenceNumber = referenceNumber;
           this.sourceDepositBalance = sourceDepositBalance;
    }


    /**
     * Gets the currency value for this InstitutionalTransferResponseBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this InstitutionalTransferResponseBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the documentDate value for this InstitutionalTransferResponseBean.
     * 
     * @return documentDate
     */
    public java.util.Calendar getDocumentDate() {
        return documentDate;
    }


    /**
     * Sets the documentDate value for this InstitutionalTransferResponseBean.
     * 
     * @param documentDate
     */
    public void setDocumentDate(java.util.Calendar documentDate) {
        this.documentDate = documentDate;
    }


    /**
     * Gets the institutionTitle value for this InstitutionalTransferResponseBean.
     * 
     * @return institutionTitle
     */
    public java.lang.String getInstitutionTitle() {
        return institutionTitle;
    }


    /**
     * Sets the institutionTitle value for this InstitutionalTransferResponseBean.
     * 
     * @param institutionTitle
     */
    public void setInstitutionTitle(java.lang.String institutionTitle) {
        this.institutionTitle = institutionTitle;
    }


    /**
     * Gets the referenceNumber value for this InstitutionalTransferResponseBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this InstitutionalTransferResponseBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the sourceDepositBalance value for this InstitutionalTransferResponseBean.
     * 
     * @return sourceDepositBalance
     */
    public java.math.BigDecimal getSourceDepositBalance() {
        return sourceDepositBalance;
    }


    /**
     * Sets the sourceDepositBalance value for this InstitutionalTransferResponseBean.
     * 
     * @param sourceDepositBalance
     */
    public void setSourceDepositBalance(java.math.BigDecimal sourceDepositBalance) {
        this.sourceDepositBalance = sourceDepositBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstitutionalTransferResponseBean)) return false;
        InstitutionalTransferResponseBean other = (InstitutionalTransferResponseBean) obj;
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
            ((this.documentDate==null && other.getDocumentDate()==null) || 
             (this.documentDate!=null &&
              this.documentDate.equals(other.getDocumentDate()))) &&
            ((this.institutionTitle==null && other.getInstitutionTitle()==null) || 
             (this.institutionTitle!=null &&
              this.institutionTitle.equals(other.getInstitutionTitle()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.sourceDepositBalance==null && other.getSourceDepositBalance()==null) || 
             (this.sourceDepositBalance!=null &&
              this.sourceDepositBalance.equals(other.getSourceDepositBalance())));
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
        if (getDocumentDate() != null) {
            _hashCode += getDocumentDate().hashCode();
        }
        if (getInstitutionTitle() != null) {
            _hashCode += getInstitutionTitle().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getSourceDepositBalance() != null) {
            _hashCode += getSourceDepositBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstitutionalTransferResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "institutionalTransferResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("institutionTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "institutionTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDepositBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDepositBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
