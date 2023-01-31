/**
 * AchTransactionSearchRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AchTransactionSearchRequestBean  implements java.io.Serializable {
    private java.lang.String cif;

    private java.lang.String description;

    private java.lang.String factorNumber;

    private java.util.Calendar fromIssueDate;

    private java.util.Calendar fromRegisterDate;

    private java.math.BigDecimal fromTransactionAmount;

    private java.lang.String ibanNumber;

    private java.lang.String ibanOwnerName;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS[] includeTransactionStatus;

    private java.lang.Long length;

    private java.lang.Long offset;

    private java.lang.String payId;

    private java.lang.String referenceId;

    private java.lang.String sourceDepositIban;

    private java.lang.String sourceDepositNumber;

    private java.util.Calendar toIssueDate;

    private java.util.Calendar toRegisterDate;

    private java.math.BigDecimal toTransactionAmount;

    private java.lang.String transactionId;

    private java.lang.String transferDescription;

    public AchTransactionSearchRequestBean() {
    }

    public AchTransactionSearchRequestBean(
           java.lang.String cif,
           java.lang.String description,
           java.lang.String factorNumber,
           java.util.Calendar fromIssueDate,
           java.util.Calendar fromRegisterDate,
           java.math.BigDecimal fromTransactionAmount,
           java.lang.String ibanNumber,
           java.lang.String ibanOwnerName,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS[] includeTransactionStatus,
           java.lang.Long length,
           java.lang.Long offset,
           java.lang.String payId,
           java.lang.String referenceId,
           java.lang.String sourceDepositIban,
           java.lang.String sourceDepositNumber,
           java.util.Calendar toIssueDate,
           java.util.Calendar toRegisterDate,
           java.math.BigDecimal toTransactionAmount,
           java.lang.String transactionId,
           java.lang.String transferDescription) {
           this.cif = cif;
           this.description = description;
           this.factorNumber = factorNumber;
           this.fromIssueDate = fromIssueDate;
           this.fromRegisterDate = fromRegisterDate;
           this.fromTransactionAmount = fromTransactionAmount;
           this.ibanNumber = ibanNumber;
           this.ibanOwnerName = ibanOwnerName;
           this.includeTransactionStatus = includeTransactionStatus;
           this.length = length;
           this.offset = offset;
           this.payId = payId;
           this.referenceId = referenceId;
           this.sourceDepositIban = sourceDepositIban;
           this.sourceDepositNumber = sourceDepositNumber;
           this.toIssueDate = toIssueDate;
           this.toRegisterDate = toRegisterDate;
           this.toTransactionAmount = toTransactionAmount;
           this.transactionId = transactionId;
           this.transferDescription = transferDescription;
    }


    /**
     * Gets the cif value for this AchTransactionSearchRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this AchTransactionSearchRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the description value for this AchTransactionSearchRequestBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AchTransactionSearchRequestBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the factorNumber value for this AchTransactionSearchRequestBean.
     * 
     * @return factorNumber
     */
    public java.lang.String getFactorNumber() {
        return factorNumber;
    }


    /**
     * Sets the factorNumber value for this AchTransactionSearchRequestBean.
     * 
     * @param factorNumber
     */
    public void setFactorNumber(java.lang.String factorNumber) {
        this.factorNumber = factorNumber;
    }


    /**
     * Gets the fromIssueDate value for this AchTransactionSearchRequestBean.
     * 
     * @return fromIssueDate
     */
    public java.util.Calendar getFromIssueDate() {
        return fromIssueDate;
    }


    /**
     * Sets the fromIssueDate value for this AchTransactionSearchRequestBean.
     * 
     * @param fromIssueDate
     */
    public void setFromIssueDate(java.util.Calendar fromIssueDate) {
        this.fromIssueDate = fromIssueDate;
    }


    /**
     * Gets the fromRegisterDate value for this AchTransactionSearchRequestBean.
     * 
     * @return fromRegisterDate
     */
    public java.util.Calendar getFromRegisterDate() {
        return fromRegisterDate;
    }


    /**
     * Sets the fromRegisterDate value for this AchTransactionSearchRequestBean.
     * 
     * @param fromRegisterDate
     */
    public void setFromRegisterDate(java.util.Calendar fromRegisterDate) {
        this.fromRegisterDate = fromRegisterDate;
    }


    /**
     * Gets the fromTransactionAmount value for this AchTransactionSearchRequestBean.
     * 
     * @return fromTransactionAmount
     */
    public java.math.BigDecimal getFromTransactionAmount() {
        return fromTransactionAmount;
    }


    /**
     * Sets the fromTransactionAmount value for this AchTransactionSearchRequestBean.
     * 
     * @param fromTransactionAmount
     */
    public void setFromTransactionAmount(java.math.BigDecimal fromTransactionAmount) {
        this.fromTransactionAmount = fromTransactionAmount;
    }


    /**
     * Gets the ibanNumber value for this AchTransactionSearchRequestBean.
     * 
     * @return ibanNumber
     */
    public java.lang.String getIbanNumber() {
        return ibanNumber;
    }


    /**
     * Sets the ibanNumber value for this AchTransactionSearchRequestBean.
     * 
     * @param ibanNumber
     */
    public void setIbanNumber(java.lang.String ibanNumber) {
        this.ibanNumber = ibanNumber;
    }


    /**
     * Gets the ibanOwnerName value for this AchTransactionSearchRequestBean.
     * 
     * @return ibanOwnerName
     */
    public java.lang.String getIbanOwnerName() {
        return ibanOwnerName;
    }


    /**
     * Sets the ibanOwnerName value for this AchTransactionSearchRequestBean.
     * 
     * @param ibanOwnerName
     */
    public void setIbanOwnerName(java.lang.String ibanOwnerName) {
        this.ibanOwnerName = ibanOwnerName;
    }


    /**
     * Gets the includeTransactionStatus value for this AchTransactionSearchRequestBean.
     * 
     * @return includeTransactionStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS[] getIncludeTransactionStatus() {
        return includeTransactionStatus;
    }


    /**
     * Sets the includeTransactionStatus value for this AchTransactionSearchRequestBean.
     * 
     * @param includeTransactionStatus
     */
    public void setIncludeTransactionStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS[] includeTransactionStatus) {
        this.includeTransactionStatus = includeTransactionStatus;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS getIncludeTransactionStatus(int i) {
        return this.includeTransactionStatus[i];
    }

    public void setIncludeTransactionStatus(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS _value) {
        this.includeTransactionStatus[i] = _value;
    }


    /**
     * Gets the length value for this AchTransactionSearchRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this AchTransactionSearchRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this AchTransactionSearchRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this AchTransactionSearchRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the payId value for this AchTransactionSearchRequestBean.
     * 
     * @return payId
     */
    public java.lang.String getPayId() {
        return payId;
    }


    /**
     * Sets the payId value for this AchTransactionSearchRequestBean.
     * 
     * @param payId
     */
    public void setPayId(java.lang.String payId) {
        this.payId = payId;
    }


    /**
     * Gets the referenceId value for this AchTransactionSearchRequestBean.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this AchTransactionSearchRequestBean.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the sourceDepositIban value for this AchTransactionSearchRequestBean.
     * 
     * @return sourceDepositIban
     */
    public java.lang.String getSourceDepositIban() {
        return sourceDepositIban;
    }


    /**
     * Sets the sourceDepositIban value for this AchTransactionSearchRequestBean.
     * 
     * @param sourceDepositIban
     */
    public void setSourceDepositIban(java.lang.String sourceDepositIban) {
        this.sourceDepositIban = sourceDepositIban;
    }


    /**
     * Gets the sourceDepositNumber value for this AchTransactionSearchRequestBean.
     * 
     * @return sourceDepositNumber
     */
    public java.lang.String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this AchTransactionSearchRequestBean.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(java.lang.String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the toIssueDate value for this AchTransactionSearchRequestBean.
     * 
     * @return toIssueDate
     */
    public java.util.Calendar getToIssueDate() {
        return toIssueDate;
    }


    /**
     * Sets the toIssueDate value for this AchTransactionSearchRequestBean.
     * 
     * @param toIssueDate
     */
    public void setToIssueDate(java.util.Calendar toIssueDate) {
        this.toIssueDate = toIssueDate;
    }


    /**
     * Gets the toRegisterDate value for this AchTransactionSearchRequestBean.
     * 
     * @return toRegisterDate
     */
    public java.util.Calendar getToRegisterDate() {
        return toRegisterDate;
    }


    /**
     * Sets the toRegisterDate value for this AchTransactionSearchRequestBean.
     * 
     * @param toRegisterDate
     */
    public void setToRegisterDate(java.util.Calendar toRegisterDate) {
        this.toRegisterDate = toRegisterDate;
    }


    /**
     * Gets the toTransactionAmount value for this AchTransactionSearchRequestBean.
     * 
     * @return toTransactionAmount
     */
    public java.math.BigDecimal getToTransactionAmount() {
        return toTransactionAmount;
    }


    /**
     * Sets the toTransactionAmount value for this AchTransactionSearchRequestBean.
     * 
     * @param toTransactionAmount
     */
    public void setToTransactionAmount(java.math.BigDecimal toTransactionAmount) {
        this.toTransactionAmount = toTransactionAmount;
    }


    /**
     * Gets the transactionId value for this AchTransactionSearchRequestBean.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this AchTransactionSearchRequestBean.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transferDescription value for this AchTransactionSearchRequestBean.
     * 
     * @return transferDescription
     */
    public java.lang.String getTransferDescription() {
        return transferDescription;
    }


    /**
     * Sets the transferDescription value for this AchTransactionSearchRequestBean.
     * 
     * @param transferDescription
     */
    public void setTransferDescription(java.lang.String transferDescription) {
        this.transferDescription = transferDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AchTransactionSearchRequestBean)) return false;
        AchTransactionSearchRequestBean other = (AchTransactionSearchRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.factorNumber==null && other.getFactorNumber()==null) || 
             (this.factorNumber!=null &&
              this.factorNumber.equals(other.getFactorNumber()))) &&
            ((this.fromIssueDate==null && other.getFromIssueDate()==null) || 
             (this.fromIssueDate!=null &&
              this.fromIssueDate.equals(other.getFromIssueDate()))) &&
            ((this.fromRegisterDate==null && other.getFromRegisterDate()==null) || 
             (this.fromRegisterDate!=null &&
              this.fromRegisterDate.equals(other.getFromRegisterDate()))) &&
            ((this.fromTransactionAmount==null && other.getFromTransactionAmount()==null) || 
             (this.fromTransactionAmount!=null &&
              this.fromTransactionAmount.equals(other.getFromTransactionAmount()))) &&
            ((this.ibanNumber==null && other.getIbanNumber()==null) || 
             (this.ibanNumber!=null &&
              this.ibanNumber.equals(other.getIbanNumber()))) &&
            ((this.ibanOwnerName==null && other.getIbanOwnerName()==null) || 
             (this.ibanOwnerName!=null &&
              this.ibanOwnerName.equals(other.getIbanOwnerName()))) &&
            ((this.includeTransactionStatus==null && other.getIncludeTransactionStatus()==null) || 
             (this.includeTransactionStatus!=null &&
              java.util.Arrays.equals(this.includeTransactionStatus, other.getIncludeTransactionStatus()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.payId==null && other.getPayId()==null) || 
             (this.payId!=null &&
              this.payId.equals(other.getPayId()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.sourceDepositIban==null && other.getSourceDepositIban()==null) || 
             (this.sourceDepositIban!=null &&
              this.sourceDepositIban.equals(other.getSourceDepositIban()))) &&
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
            ((this.toIssueDate==null && other.getToIssueDate()==null) || 
             (this.toIssueDate!=null &&
              this.toIssueDate.equals(other.getToIssueDate()))) &&
            ((this.toRegisterDate==null && other.getToRegisterDate()==null) || 
             (this.toRegisterDate!=null &&
              this.toRegisterDate.equals(other.getToRegisterDate()))) &&
            ((this.toTransactionAmount==null && other.getToTransactionAmount()==null) || 
             (this.toTransactionAmount!=null &&
              this.toTransactionAmount.equals(other.getToTransactionAmount()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transferDescription==null && other.getTransferDescription()==null) || 
             (this.transferDescription!=null &&
              this.transferDescription.equals(other.getTransferDescription())));
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
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFactorNumber() != null) {
            _hashCode += getFactorNumber().hashCode();
        }
        if (getFromIssueDate() != null) {
            _hashCode += getFromIssueDate().hashCode();
        }
        if (getFromRegisterDate() != null) {
            _hashCode += getFromRegisterDate().hashCode();
        }
        if (getFromTransactionAmount() != null) {
            _hashCode += getFromTransactionAmount().hashCode();
        }
        if (getIbanNumber() != null) {
            _hashCode += getIbanNumber().hashCode();
        }
        if (getIbanOwnerName() != null) {
            _hashCode += getIbanOwnerName().hashCode();
        }
        if (getIncludeTransactionStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeTransactionStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeTransactionStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getPayId() != null) {
            _hashCode += getPayId().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getSourceDepositIban() != null) {
            _hashCode += getSourceDepositIban().hashCode();
        }
        if (getSourceDepositNumber() != null) {
            _hashCode += getSourceDepositNumber().hashCode();
        }
        if (getToIssueDate() != null) {
            _hashCode += getToIssueDate().hashCode();
        }
        if (getToRegisterDate() != null) {
            _hashCode += getToRegisterDate().hashCode();
        }
        if (getToTransactionAmount() != null) {
            _hashCode += getToTransactionAmount().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransferDescription() != null) {
            _hashCode += getTransferDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AchTransactionSearchRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achTransactionSearchRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
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
        elemField.setFieldName("fromIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromIssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromRegisterDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromRegisterDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromTransactionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromTransactionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("ibanOwnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ibanOwnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeTransactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeTransactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transactionStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payId"));
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
        elemField.setFieldName("sourceDepositIban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDepositIban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toIssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toRegisterDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toRegisterDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toTransactionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toTransactionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
