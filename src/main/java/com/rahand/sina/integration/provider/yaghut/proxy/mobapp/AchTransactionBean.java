/**
 * AchTransactionBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AchTransactionBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private boolean cancelable;

    private boolean changeable;

    private java.lang.String currency;

    private java.lang.String description;

    private java.lang.String factorNumber;

    private java.lang.String ibanNumber;

    private java.lang.String ibanOwnerName;

    private java.lang.String id;

    private java.util.Calendar issueDate;

    private java.lang.String payId;

    private java.lang.String referenceId;

    private java.lang.Boolean resumeable;

    private java.lang.String sourceIbanNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS status;

    private boolean suspendable;

    public AchTransactionBean() {
    }

    public AchTransactionBean(
           java.math.BigDecimal amount,
           boolean cancelable,
           boolean changeable,
           java.lang.String currency,
           java.lang.String description,
           java.lang.String factorNumber,
           java.lang.String ibanNumber,
           java.lang.String ibanOwnerName,
           java.lang.String id,
           java.util.Calendar issueDate,
           java.lang.String payId,
           java.lang.String referenceId,
           java.lang.Boolean resumeable,
           java.lang.String sourceIbanNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS status,
           boolean suspendable) {
           this.amount = amount;
           this.cancelable = cancelable;
           this.changeable = changeable;
           this.currency = currency;
           this.description = description;
           this.factorNumber = factorNumber;
           this.ibanNumber = ibanNumber;
           this.ibanOwnerName = ibanOwnerName;
           this.id = id;
           this.issueDate = issueDate;
           this.payId = payId;
           this.referenceId = referenceId;
           this.resumeable = resumeable;
           this.sourceIbanNumber = sourceIbanNumber;
           this.status = status;
           this.suspendable = suspendable;
    }


    /**
     * Gets the amount value for this AchTransactionBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AchTransactionBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cancelable value for this AchTransactionBean.
     * 
     * @return cancelable
     */
    public boolean isCancelable() {
        return cancelable;
    }


    /**
     * Sets the cancelable value for this AchTransactionBean.
     * 
     * @param cancelable
     */
    public void setCancelable(boolean cancelable) {
        this.cancelable = cancelable;
    }


    /**
     * Gets the changeable value for this AchTransactionBean.
     * 
     * @return changeable
     */
    public boolean isChangeable() {
        return changeable;
    }


    /**
     * Sets the changeable value for this AchTransactionBean.
     * 
     * @param changeable
     */
    public void setChangeable(boolean changeable) {
        this.changeable = changeable;
    }


    /**
     * Gets the currency value for this AchTransactionBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AchTransactionBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the description value for this AchTransactionBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AchTransactionBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the factorNumber value for this AchTransactionBean.
     * 
     * @return factorNumber
     */
    public java.lang.String getFactorNumber() {
        return factorNumber;
    }


    /**
     * Sets the factorNumber value for this AchTransactionBean.
     * 
     * @param factorNumber
     */
    public void setFactorNumber(java.lang.String factorNumber) {
        this.factorNumber = factorNumber;
    }


    /**
     * Gets the ibanNumber value for this AchTransactionBean.
     * 
     * @return ibanNumber
     */
    public java.lang.String getIbanNumber() {
        return ibanNumber;
    }


    /**
     * Sets the ibanNumber value for this AchTransactionBean.
     * 
     * @param ibanNumber
     */
    public void setIbanNumber(java.lang.String ibanNumber) {
        this.ibanNumber = ibanNumber;
    }


    /**
     * Gets the ibanOwnerName value for this AchTransactionBean.
     * 
     * @return ibanOwnerName
     */
    public java.lang.String getIbanOwnerName() {
        return ibanOwnerName;
    }


    /**
     * Sets the ibanOwnerName value for this AchTransactionBean.
     * 
     * @param ibanOwnerName
     */
    public void setIbanOwnerName(java.lang.String ibanOwnerName) {
        this.ibanOwnerName = ibanOwnerName;
    }


    /**
     * Gets the id value for this AchTransactionBean.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this AchTransactionBean.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the issueDate value for this AchTransactionBean.
     * 
     * @return issueDate
     */
    public java.util.Calendar getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this AchTransactionBean.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.util.Calendar issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the payId value for this AchTransactionBean.
     * 
     * @return payId
     */
    public java.lang.String getPayId() {
        return payId;
    }


    /**
     * Sets the payId value for this AchTransactionBean.
     * 
     * @param payId
     */
    public void setPayId(java.lang.String payId) {
        this.payId = payId;
    }


    /**
     * Gets the referenceId value for this AchTransactionBean.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this AchTransactionBean.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the resumeable value for this AchTransactionBean.
     * 
     * @return resumeable
     */
    public java.lang.Boolean getResumeable() {
        return resumeable;
    }


    /**
     * Sets the resumeable value for this AchTransactionBean.
     * 
     * @param resumeable
     */
    public void setResumeable(java.lang.Boolean resumeable) {
        this.resumeable = resumeable;
    }


    /**
     * Gets the sourceIbanNumber value for this AchTransactionBean.
     * 
     * @return sourceIbanNumber
     */
    public java.lang.String getSourceIbanNumber() {
        return sourceIbanNumber;
    }


    /**
     * Sets the sourceIbanNumber value for this AchTransactionBean.
     * 
     * @param sourceIbanNumber
     */
    public void setSourceIbanNumber(java.lang.String sourceIbanNumber) {
        this.sourceIbanNumber = sourceIbanNumber;
    }


    /**
     * Gets the status value for this AchTransactionBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AchTransactionBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransactionStatusWS status) {
        this.status = status;
    }


    /**
     * Gets the suspendable value for this AchTransactionBean.
     * 
     * @return suspendable
     */
    public boolean isSuspendable() {
        return suspendable;
    }


    /**
     * Sets the suspendable value for this AchTransactionBean.
     * 
     * @param suspendable
     */
    public void setSuspendable(boolean suspendable) {
        this.suspendable = suspendable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AchTransactionBean)) return false;
        AchTransactionBean other = (AchTransactionBean) obj;
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
            this.cancelable == other.isCancelable() &&
            this.changeable == other.isChangeable() &&
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
            ((this.ibanOwnerName==null && other.getIbanOwnerName()==null) || 
             (this.ibanOwnerName!=null &&
              this.ibanOwnerName.equals(other.getIbanOwnerName()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            ((this.payId==null && other.getPayId()==null) || 
             (this.payId!=null &&
              this.payId.equals(other.getPayId()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.resumeable==null && other.getResumeable()==null) || 
             (this.resumeable!=null &&
              this.resumeable.equals(other.getResumeable()))) &&
            ((this.sourceIbanNumber==null && other.getSourceIbanNumber()==null) || 
             (this.sourceIbanNumber!=null &&
              this.sourceIbanNumber.equals(other.getSourceIbanNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.suspendable == other.isSuspendable();
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
        _hashCode += (isCancelable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isChangeable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getIbanOwnerName() != null) {
            _hashCode += getIbanOwnerName().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        if (getPayId() != null) {
            _hashCode += getPayId().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getResumeable() != null) {
            _hashCode += getResumeable().hashCode();
        }
        if (getSourceIbanNumber() != null) {
            _hashCode += getSourceIbanNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += (isSuspendable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AchTransactionBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achTransactionBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("ibanOwnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ibanOwnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("resumeable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resumeable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transactionStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suspendable"));
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
