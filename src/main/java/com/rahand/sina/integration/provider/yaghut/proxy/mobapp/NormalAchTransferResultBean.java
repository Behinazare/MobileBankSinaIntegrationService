/**
 * NormalAchTransferResultBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class NormalAchTransferResultBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String currency;

    private java.lang.String description;

    private java.lang.String factorNumber;

    private java.lang.String ibanNumber;

    private java.lang.String ownerName;

    private java.lang.String referenceId;

    private java.lang.String sourceIbanNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationTransactionStatusWS transactionStatus;

    private java.lang.String transferDescription;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS transferStatus;

    public NormalAchTransferResultBean() {
    }

    public NormalAchTransferResultBean(
           java.math.BigDecimal amount,
           java.lang.String currency,
           java.lang.String description,
           java.lang.String factorNumber,
           java.lang.String ibanNumber,
           java.lang.String ownerName,
           java.lang.String referenceId,
           java.lang.String sourceIbanNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationTransactionStatusWS transactionStatus,
           java.lang.String transferDescription,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS transferStatus) {
           this.amount = amount;
           this.currency = currency;
           this.description = description;
           this.factorNumber = factorNumber;
           this.ibanNumber = ibanNumber;
           this.ownerName = ownerName;
           this.referenceId = referenceId;
           this.sourceIbanNumber = sourceIbanNumber;
           this.transactionStatus = transactionStatus;
           this.transferDescription = transferDescription;
           this.transferStatus = transferStatus;
    }


    /**
     * Gets the amount value for this NormalAchTransferResultBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this NormalAchTransferResultBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this NormalAchTransferResultBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this NormalAchTransferResultBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the description value for this NormalAchTransferResultBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this NormalAchTransferResultBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the factorNumber value for this NormalAchTransferResultBean.
     * 
     * @return factorNumber
     */
    public java.lang.String getFactorNumber() {
        return factorNumber;
    }


    /**
     * Sets the factorNumber value for this NormalAchTransferResultBean.
     * 
     * @param factorNumber
     */
    public void setFactorNumber(java.lang.String factorNumber) {
        this.factorNumber = factorNumber;
    }


    /**
     * Gets the ibanNumber value for this NormalAchTransferResultBean.
     * 
     * @return ibanNumber
     */
    public java.lang.String getIbanNumber() {
        return ibanNumber;
    }


    /**
     * Sets the ibanNumber value for this NormalAchTransferResultBean.
     * 
     * @param ibanNumber
     */
    public void setIbanNumber(java.lang.String ibanNumber) {
        this.ibanNumber = ibanNumber;
    }


    /**
     * Gets the ownerName value for this NormalAchTransferResultBean.
     * 
     * @return ownerName
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this NormalAchTransferResultBean.
     * 
     * @param ownerName
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the referenceId value for this NormalAchTransferResultBean.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this NormalAchTransferResultBean.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the sourceIbanNumber value for this NormalAchTransferResultBean.
     * 
     * @return sourceIbanNumber
     */
    public java.lang.String getSourceIbanNumber() {
        return sourceIbanNumber;
    }


    /**
     * Sets the sourceIbanNumber value for this NormalAchTransferResultBean.
     * 
     * @param sourceIbanNumber
     */
    public void setSourceIbanNumber(java.lang.String sourceIbanNumber) {
        this.sourceIbanNumber = sourceIbanNumber;
    }


    /**
     * Gets the transactionStatus value for this NormalAchTransferResultBean.
     * 
     * @return transactionStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationTransactionStatusWS getTransactionStatus() {
        return transactionStatus;
    }


    /**
     * Sets the transactionStatus value for this NormalAchTransferResultBean.
     * 
     * @param transactionStatus
     */
    public void setTransactionStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationTransactionStatusWS transactionStatus) {
        this.transactionStatus = transactionStatus;
    }


    /**
     * Gets the transferDescription value for this NormalAchTransferResultBean.
     * 
     * @return transferDescription
     */
    public java.lang.String getTransferDescription() {
        return transferDescription;
    }


    /**
     * Sets the transferDescription value for this NormalAchTransferResultBean.
     * 
     * @param transferDescription
     */
    public void setTransferDescription(java.lang.String transferDescription) {
        this.transferDescription = transferDescription;
    }


    /**
     * Gets the transferStatus value for this NormalAchTransferResultBean.
     * 
     * @return transferStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS getTransferStatus() {
        return transferStatus;
    }


    /**
     * Sets the transferStatus value for this NormalAchTransferResultBean.
     * 
     * @param transferStatus
     */
    public void setTransferStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS transferStatus) {
        this.transferStatus = transferStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NormalAchTransferResultBean)) return false;
        NormalAchTransferResultBean other = (NormalAchTransferResultBean) obj;
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
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.factorNumber==null && other.getFactorNumber()==null) || 
             (this.factorNumber!=null &&
              this.factorNumber.equals(other.getFactorNumber()))) &&
            ((this.ibanNumber==null && other.getIbanNumber()==null) || 
             (this.ibanNumber!=null &&
              this.ibanNumber.equals(other.getIbanNumber()))) &&
            ((this.ownerName==null && other.getOwnerName()==null) || 
             (this.ownerName!=null &&
              this.ownerName.equals(other.getOwnerName()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.sourceIbanNumber==null && other.getSourceIbanNumber()==null) || 
             (this.sourceIbanNumber!=null &&
              this.sourceIbanNumber.equals(other.getSourceIbanNumber()))) &&
            ((this.transactionStatus==null && other.getTransactionStatus()==null) || 
             (this.transactionStatus!=null &&
              this.transactionStatus.equals(other.getTransactionStatus()))) &&
            ((this.transferDescription==null && other.getTransferDescription()==null) || 
             (this.transferDescription!=null &&
              this.transferDescription.equals(other.getTransferDescription()))) &&
            ((this.transferStatus==null && other.getTransferStatus()==null) || 
             (this.transferStatus!=null &&
              this.transferStatus.equals(other.getTransferStatus())));
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFactorNumber() != null) {
            _hashCode += getFactorNumber().hashCode();
        }
        if (getIbanNumber() != null) {
            _hashCode += getIbanNumber().hashCode();
        }
        if (getOwnerName() != null) {
            _hashCode += getOwnerName().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getSourceIbanNumber() != null) {
            _hashCode += getSourceIbanNumber().hashCode();
        }
        if (getTransactionStatus() != null) {
            _hashCode += getTransactionStatus().hashCode();
        }
        if (getTransferDescription() != null) {
            _hashCode += getTransferDescription().hashCode();
        }
        if (getTransferStatus() != null) {
            _hashCode += getTransferStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NormalAchTransferResultBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "normalAchTransferResultBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factorNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "factorNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ibanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ibanNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIbanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceIbanNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "destinationTransactionStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achTransferStatusWS"));
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
