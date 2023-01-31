/**
 * AchAutoTransferResultBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AchAutoTransferResultBean  implements java.io.Serializable {
    private java.lang.String currency;

    private java.lang.String referenceId;

    private java.lang.String sourceIbanNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS status;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchAutoTransactionResultBean[] transactions;

    private java.lang.String transferDescription;

    public AchAutoTransferResultBean() {
    }

    public AchAutoTransferResultBean(
           java.lang.String currency,
           java.lang.String referenceId,
           java.lang.String sourceIbanNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS status,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchAutoTransactionResultBean[] transactions,
           java.lang.String transferDescription) {
           this.currency = currency;
           this.referenceId = referenceId;
           this.sourceIbanNumber = sourceIbanNumber;
           this.status = status;
           this.transactions = transactions;
           this.transferDescription = transferDescription;
    }


    /**
     * Gets the currency value for this AchAutoTransferResultBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AchAutoTransferResultBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the referenceId value for this AchAutoTransferResultBean.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this AchAutoTransferResultBean.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the sourceIbanNumber value for this AchAutoTransferResultBean.
     * 
     * @return sourceIbanNumber
     */
    public java.lang.String getSourceIbanNumber() {
        return sourceIbanNumber;
    }


    /**
     * Sets the sourceIbanNumber value for this AchAutoTransferResultBean.
     * 
     * @param sourceIbanNumber
     */
    public void setSourceIbanNumber(java.lang.String sourceIbanNumber) {
        this.sourceIbanNumber = sourceIbanNumber;
    }


    /**
     * Gets the status value for this AchAutoTransferResultBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AchAutoTransferResultBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransferStatusWS status) {
        this.status = status;
    }


    /**
     * Gets the transactions value for this AchAutoTransferResultBean.
     * 
     * @return transactions
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchAutoTransactionResultBean[] getTransactions() {
        return transactions;
    }


    /**
     * Sets the transactions value for this AchAutoTransferResultBean.
     * 
     * @param transactions
     */
    public void setTransactions(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchAutoTransactionResultBean[] transactions) {
        this.transactions = transactions;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchAutoTransactionResultBean getTransactions(int i) {
        return this.transactions[i];
    }

    public void setTransactions(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchAutoTransactionResultBean _value) {
        this.transactions[i] = _value;
    }


    /**
     * Gets the transferDescription value for this AchAutoTransferResultBean.
     * 
     * @return transferDescription
     */
    public java.lang.String getTransferDescription() {
        return transferDescription;
    }


    /**
     * Sets the transferDescription value for this AchAutoTransferResultBean.
     * 
     * @param transferDescription
     */
    public void setTransferDescription(java.lang.String transferDescription) {
        this.transferDescription = transferDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AchAutoTransferResultBean)) return false;
        AchAutoTransferResultBean other = (AchAutoTransferResultBean) obj;
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
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.sourceIbanNumber==null && other.getSourceIbanNumber()==null) || 
             (this.sourceIbanNumber!=null &&
              this.sourceIbanNumber.equals(other.getSourceIbanNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getSourceIbanNumber() != null) {
            _hashCode += getSourceIbanNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(AchAutoTransferResultBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achAutoTransferResultBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("sourceIbanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceIbanNumber"));
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
        elemField.setFieldName("transactions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "destinationAchAutoTransactionResultBean"));
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
