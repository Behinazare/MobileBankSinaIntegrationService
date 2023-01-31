/**
 * AchTransferBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AchTransferBean  implements java.io.Serializable {
    private boolean acceptable;

    private boolean cancelable;

    private java.util.Calendar confirmExpireDate;

    private java.lang.String currency;

    private java.lang.String referenceId;

    private java.util.Calendar registerDate;

    private boolean resumeable;

    private java.lang.String sourceDepositNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS status;

    private boolean suspendable;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BriefAchTransactionBean[] transactions;

    private java.lang.String transferDescription;

    public AchTransferBean() {
    }

    public AchTransferBean(
           boolean acceptable,
           boolean cancelable,
           java.util.Calendar confirmExpireDate,
           java.lang.String currency,
           java.lang.String referenceId,
           java.util.Calendar registerDate,
           boolean resumeable,
           java.lang.String sourceDepositNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS status,
           boolean suspendable,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BriefAchTransactionBean[] transactions,
           java.lang.String transferDescription) {
           this.acceptable = acceptable;
           this.cancelable = cancelable;
           this.confirmExpireDate = confirmExpireDate;
           this.currency = currency;
           this.referenceId = referenceId;
           this.registerDate = registerDate;
           this.resumeable = resumeable;
           this.sourceDepositNumber = sourceDepositNumber;
           this.status = status;
           this.suspendable = suspendable;
           this.transactions = transactions;
           this.transferDescription = transferDescription;
    }


    /**
     * Gets the acceptable value for this AchTransferBean.
     * 
     * @return acceptable
     */
    public boolean isAcceptable() {
        return acceptable;
    }


    /**
     * Sets the acceptable value for this AchTransferBean.
     * 
     * @param acceptable
     */
    public void setAcceptable(boolean acceptable) {
        this.acceptable = acceptable;
    }


    /**
     * Gets the cancelable value for this AchTransferBean.
     * 
     * @return cancelable
     */
    public boolean isCancelable() {
        return cancelable;
    }


    /**
     * Sets the cancelable value for this AchTransferBean.
     * 
     * @param cancelable
     */
    public void setCancelable(boolean cancelable) {
        this.cancelable = cancelable;
    }


    /**
     * Gets the confirmExpireDate value for this AchTransferBean.
     * 
     * @return confirmExpireDate
     */
    public java.util.Calendar getConfirmExpireDate() {
        return confirmExpireDate;
    }


    /**
     * Sets the confirmExpireDate value for this AchTransferBean.
     * 
     * @param confirmExpireDate
     */
    public void setConfirmExpireDate(java.util.Calendar confirmExpireDate) {
        this.confirmExpireDate = confirmExpireDate;
    }


    /**
     * Gets the currency value for this AchTransferBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AchTransferBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the referenceId value for this AchTransferBean.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this AchTransferBean.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the registerDate value for this AchTransferBean.
     * 
     * @return registerDate
     */
    public java.util.Calendar getRegisterDate() {
        return registerDate;
    }


    /**
     * Sets the registerDate value for this AchTransferBean.
     * 
     * @param registerDate
     */
    public void setRegisterDate(java.util.Calendar registerDate) {
        this.registerDate = registerDate;
    }


    /**
     * Gets the resumeable value for this AchTransferBean.
     * 
     * @return resumeable
     */
    public boolean isResumeable() {
        return resumeable;
    }


    /**
     * Sets the resumeable value for this AchTransferBean.
     * 
     * @param resumeable
     */
    public void setResumeable(boolean resumeable) {
        this.resumeable = resumeable;
    }


    /**
     * Gets the sourceDepositNumber value for this AchTransferBean.
     * 
     * @return sourceDepositNumber
     */
    public java.lang.String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this AchTransferBean.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(java.lang.String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the status value for this AchTransferBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AchTransferBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS status) {
        this.status = status;
    }


    /**
     * Gets the suspendable value for this AchTransferBean.
     * 
     * @return suspendable
     */
    public boolean isSuspendable() {
        return suspendable;
    }


    /**
     * Sets the suspendable value for this AchTransferBean.
     * 
     * @param suspendable
     */
    public void setSuspendable(boolean suspendable) {
        this.suspendable = suspendable;
    }


    /**
     * Gets the transactions value for this AchTransferBean.
     * 
     * @return transactions
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BriefAchTransactionBean[] getTransactions() {
        return transactions;
    }


    /**
     * Sets the transactions value for this AchTransferBean.
     * 
     * @param transactions
     */
    public void setTransactions(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BriefAchTransactionBean[] transactions) {
        this.transactions = transactions;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BriefAchTransactionBean getTransactions(int i) {
        return this.transactions[i];
    }

    public void setTransactions(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BriefAchTransactionBean _value) {
        this.transactions[i] = _value;
    }


    /**
     * Gets the transferDescription value for this AchTransferBean.
     * 
     * @return transferDescription
     */
    public java.lang.String getTransferDescription() {
        return transferDescription;
    }


    /**
     * Sets the transferDescription value for this AchTransferBean.
     * 
     * @param transferDescription
     */
    public void setTransferDescription(java.lang.String transferDescription) {
        this.transferDescription = transferDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AchTransferBean)) return false;
        AchTransferBean other = (AchTransferBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.acceptable == other.isAcceptable() &&
            this.cancelable == other.isCancelable() &&
            ((this.confirmExpireDate==null && other.getConfirmExpireDate()==null) || 
             (this.confirmExpireDate!=null &&
              this.confirmExpireDate.equals(other.getConfirmExpireDate()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.registerDate==null && other.getRegisterDate()==null) || 
             (this.registerDate!=null &&
              this.registerDate.equals(other.getRegisterDate()))) &&
            this.resumeable == other.isResumeable() &&
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.suspendable == other.isSuspendable() &&
            ((this.transactions==null && other.getTransactions()==null) || 
             (this.transactions!=null &&
              java.util.Arrays.equals(this.transactions, other.getTransactions()))) &&
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
        _hashCode += (isAcceptable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCancelable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getConfirmExpireDate() != null) {
            _hashCode += getConfirmExpireDate().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getRegisterDate() != null) {
            _hashCode += getRegisterDate().hashCode();
        }
        _hashCode += (isResumeable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSourceDepositNumber() != null) {
            _hashCode += getSourceDepositNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += (isSuspendable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTransactions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactions(), i);
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
        new org.apache.axis.description.TypeDesc(AchTransferBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achTransferBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acceptable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confirmExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resumeable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resumeable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achTransferStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suspendable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "briefAchTransactionBean"));
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
