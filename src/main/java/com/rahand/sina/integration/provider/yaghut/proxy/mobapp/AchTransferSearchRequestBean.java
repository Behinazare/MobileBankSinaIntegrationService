/**
 * AchTransferSearchRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AchTransferSearchRequestBean  implements java.io.Serializable {
    private java.lang.String cif;

    private java.lang.String description;

    private java.lang.String destinationIbanNumber;

    private java.lang.String destinationOwnerName;

    private java.lang.String factorNumber;

    private java.util.Calendar fromIssueDate;

    private java.util.Calendar fromRegisterDate;

    private java.math.BigDecimal fromTransactionAmount;

    private java.lang.Long length;

    private java.lang.Long offset;

    private java.lang.String referenceId;

    private java.lang.String sourceDepositIban;

    private java.lang.String sourceDepositNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS[] statusSet;

    private java.util.Calendar toIssueDate;

    private java.util.Calendar toRegisterDate;

    private java.math.BigDecimal toTransactionAmount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS[] transactionStatusSet;

    private java.lang.String transferDescription;

    public AchTransferSearchRequestBean() {
    }

    public AchTransferSearchRequestBean(
           java.lang.String cif,
           java.lang.String description,
           java.lang.String destinationIbanNumber,
           java.lang.String destinationOwnerName,
           java.lang.String factorNumber,
           java.util.Calendar fromIssueDate,
           java.util.Calendar fromRegisterDate,
           java.math.BigDecimal fromTransactionAmount,
           java.lang.Long length,
           java.lang.Long offset,
           java.lang.String referenceId,
           java.lang.String sourceDepositIban,
           java.lang.String sourceDepositNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS[] statusSet,
           java.util.Calendar toIssueDate,
           java.util.Calendar toRegisterDate,
           java.math.BigDecimal toTransactionAmount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS[] transactionStatusSet,
           java.lang.String transferDescription) {
           this.cif = cif;
           this.description = description;
           this.destinationIbanNumber = destinationIbanNumber;
           this.destinationOwnerName = destinationOwnerName;
           this.factorNumber = factorNumber;
           this.fromIssueDate = fromIssueDate;
           this.fromRegisterDate = fromRegisterDate;
           this.fromTransactionAmount = fromTransactionAmount;
           this.length = length;
           this.offset = offset;
           this.referenceId = referenceId;
           this.sourceDepositIban = sourceDepositIban;
           this.sourceDepositNumber = sourceDepositNumber;
           this.statusSet = statusSet;
           this.toIssueDate = toIssueDate;
           this.toRegisterDate = toRegisterDate;
           this.toTransactionAmount = toTransactionAmount;
           this.transactionStatusSet = transactionStatusSet;
           this.transferDescription = transferDescription;
    }


    /**
     * Gets the cif value for this AchTransferSearchRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this AchTransferSearchRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the description value for this AchTransferSearchRequestBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AchTransferSearchRequestBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the destinationIbanNumber value for this AchTransferSearchRequestBean.
     * 
     * @return destinationIbanNumber
     */
    public java.lang.String getDestinationIbanNumber() {
        return destinationIbanNumber;
    }


    /**
     * Sets the destinationIbanNumber value for this AchTransferSearchRequestBean.
     * 
     * @param destinationIbanNumber
     */
    public void setDestinationIbanNumber(java.lang.String destinationIbanNumber) {
        this.destinationIbanNumber = destinationIbanNumber;
    }


    /**
     * Gets the destinationOwnerName value for this AchTransferSearchRequestBean.
     * 
     * @return destinationOwnerName
     */
    public java.lang.String getDestinationOwnerName() {
        return destinationOwnerName;
    }


    /**
     * Sets the destinationOwnerName value for this AchTransferSearchRequestBean.
     * 
     * @param destinationOwnerName
     */
    public void setDestinationOwnerName(java.lang.String destinationOwnerName) {
        this.destinationOwnerName = destinationOwnerName;
    }


    /**
     * Gets the factorNumber value for this AchTransferSearchRequestBean.
     * 
     * @return factorNumber
     */
    public java.lang.String getFactorNumber() {
        return factorNumber;
    }


    /**
     * Sets the factorNumber value for this AchTransferSearchRequestBean.
     * 
     * @param factorNumber
     */
    public void setFactorNumber(java.lang.String factorNumber) {
        this.factorNumber = factorNumber;
    }


    /**
     * Gets the fromIssueDate value for this AchTransferSearchRequestBean.
     * 
     * @return fromIssueDate
     */
    public java.util.Calendar getFromIssueDate() {
        return fromIssueDate;
    }


    /**
     * Sets the fromIssueDate value for this AchTransferSearchRequestBean.
     * 
     * @param fromIssueDate
     */
    public void setFromIssueDate(java.util.Calendar fromIssueDate) {
        this.fromIssueDate = fromIssueDate;
    }


    /**
     * Gets the fromRegisterDate value for this AchTransferSearchRequestBean.
     * 
     * @return fromRegisterDate
     */
    public java.util.Calendar getFromRegisterDate() {
        return fromRegisterDate;
    }


    /**
     * Sets the fromRegisterDate value for this AchTransferSearchRequestBean.
     * 
     * @param fromRegisterDate
     */
    public void setFromRegisterDate(java.util.Calendar fromRegisterDate) {
        this.fromRegisterDate = fromRegisterDate;
    }


    /**
     * Gets the fromTransactionAmount value for this AchTransferSearchRequestBean.
     * 
     * @return fromTransactionAmount
     */
    public java.math.BigDecimal getFromTransactionAmount() {
        return fromTransactionAmount;
    }


    /**
     * Sets the fromTransactionAmount value for this AchTransferSearchRequestBean.
     * 
     * @param fromTransactionAmount
     */
    public void setFromTransactionAmount(java.math.BigDecimal fromTransactionAmount) {
        this.fromTransactionAmount = fromTransactionAmount;
    }


    /**
     * Gets the length value for this AchTransferSearchRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this AchTransferSearchRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this AchTransferSearchRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this AchTransferSearchRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the referenceId value for this AchTransferSearchRequestBean.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this AchTransferSearchRequestBean.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the sourceDepositIban value for this AchTransferSearchRequestBean.
     * 
     * @return sourceDepositIban
     */
    public java.lang.String getSourceDepositIban() {
        return sourceDepositIban;
    }


    /**
     * Sets the sourceDepositIban value for this AchTransferSearchRequestBean.
     * 
     * @param sourceDepositIban
     */
    public void setSourceDepositIban(java.lang.String sourceDepositIban) {
        this.sourceDepositIban = sourceDepositIban;
    }


    /**
     * Gets the sourceDepositNumber value for this AchTransferSearchRequestBean.
     * 
     * @return sourceDepositNumber
     */
    public java.lang.String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this AchTransferSearchRequestBean.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(java.lang.String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the statusSet value for this AchTransferSearchRequestBean.
     * 
     * @return statusSet
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS[] getStatusSet() {
        return statusSet;
    }


    /**
     * Sets the statusSet value for this AchTransferSearchRequestBean.
     * 
     * @param statusSet
     */
    public void setStatusSet(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS[] statusSet) {
        this.statusSet = statusSet;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS getStatusSet(int i) {
        return this.statusSet[i];
    }

    public void setStatusSet(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS _value) {
        this.statusSet[i] = _value;
    }


    /**
     * Gets the toIssueDate value for this AchTransferSearchRequestBean.
     * 
     * @return toIssueDate
     */
    public java.util.Calendar getToIssueDate() {
        return toIssueDate;
    }


    /**
     * Sets the toIssueDate value for this AchTransferSearchRequestBean.
     * 
     * @param toIssueDate
     */
    public void setToIssueDate(java.util.Calendar toIssueDate) {
        this.toIssueDate = toIssueDate;
    }


    /**
     * Gets the toRegisterDate value for this AchTransferSearchRequestBean.
     * 
     * @return toRegisterDate
     */
    public java.util.Calendar getToRegisterDate() {
        return toRegisterDate;
    }


    /**
     * Sets the toRegisterDate value for this AchTransferSearchRequestBean.
     * 
     * @param toRegisterDate
     */
    public void setToRegisterDate(java.util.Calendar toRegisterDate) {
        this.toRegisterDate = toRegisterDate;
    }


    /**
     * Gets the toTransactionAmount value for this AchTransferSearchRequestBean.
     * 
     * @return toTransactionAmount
     */
    public java.math.BigDecimal getToTransactionAmount() {
        return toTransactionAmount;
    }


    /**
     * Sets the toTransactionAmount value for this AchTransferSearchRequestBean.
     * 
     * @param toTransactionAmount
     */
    public void setToTransactionAmount(java.math.BigDecimal toTransactionAmount) {
        this.toTransactionAmount = toTransactionAmount;
    }


    /**
     * Gets the transactionStatusSet value for this AchTransferSearchRequestBean.
     * 
     * @return transactionStatusSet
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS[] getTransactionStatusSet() {
        return transactionStatusSet;
    }


    /**
     * Sets the transactionStatusSet value for this AchTransferSearchRequestBean.
     * 
     * @param transactionStatusSet
     */
    public void setTransactionStatusSet(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS[] transactionStatusSet) {
        this.transactionStatusSet = transactionStatusSet;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS getTransactionStatusSet(int i) {
        return this.transactionStatusSet[i];
    }

    public void setTransactionStatusSet(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS _value) {
        this.transactionStatusSet[i] = _value;
    }


    /**
     * Gets the transferDescription value for this AchTransferSearchRequestBean.
     * 
     * @return transferDescription
     */
    public java.lang.String getTransferDescription() {
        return transferDescription;
    }


    /**
     * Sets the transferDescription value for this AchTransferSearchRequestBean.
     * 
     * @param transferDescription
     */
    public void setTransferDescription(java.lang.String transferDescription) {
        this.transferDescription = transferDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AchTransferSearchRequestBean)) return false;
        AchTransferSearchRequestBean other = (AchTransferSearchRequestBean) obj;
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
            ((this.destinationIbanNumber==null && other.getDestinationIbanNumber()==null) || 
             (this.destinationIbanNumber!=null &&
              this.destinationIbanNumber.equals(other.getDestinationIbanNumber()))) &&
            ((this.destinationOwnerName==null && other.getDestinationOwnerName()==null) || 
             (this.destinationOwnerName!=null &&
              this.destinationOwnerName.equals(other.getDestinationOwnerName()))) &&
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
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.sourceDepositIban==null && other.getSourceDepositIban()==null) || 
             (this.sourceDepositIban!=null &&
              this.sourceDepositIban.equals(other.getSourceDepositIban()))) &&
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
            ((this.statusSet==null && other.getStatusSet()==null) || 
             (this.statusSet!=null &&
              java.util.Arrays.equals(this.statusSet, other.getStatusSet()))) &&
            ((this.toIssueDate==null && other.getToIssueDate()==null) || 
             (this.toIssueDate!=null &&
              this.toIssueDate.equals(other.getToIssueDate()))) &&
            ((this.toRegisterDate==null && other.getToRegisterDate()==null) || 
             (this.toRegisterDate!=null &&
              this.toRegisterDate.equals(other.getToRegisterDate()))) &&
            ((this.toTransactionAmount==null && other.getToTransactionAmount()==null) || 
             (this.toTransactionAmount!=null &&
              this.toTransactionAmount.equals(other.getToTransactionAmount()))) &&
            ((this.transactionStatusSet==null && other.getTransactionStatusSet()==null) || 
             (this.transactionStatusSet!=null &&
              java.util.Arrays.equals(this.transactionStatusSet, other.getTransactionStatusSet()))) &&
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
        if (getDestinationIbanNumber() != null) {
            _hashCode += getDestinationIbanNumber().hashCode();
        }
        if (getDestinationOwnerName() != null) {
            _hashCode += getDestinationOwnerName().hashCode();
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
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
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
        if (getStatusSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatusSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatusSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getTransactionStatusSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionStatusSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionStatusSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferDescription() != null) {
            _hashCode += getTransferDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AchTransferSearchRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achTransferSearchRequestBean"));
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
        elemField.setFieldName("destinationIbanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationIbanNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationOwnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationOwnerName"));
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
        elemField.setFieldName("statusSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achTransferStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("transactionStatusSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionStatusSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transactionStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
