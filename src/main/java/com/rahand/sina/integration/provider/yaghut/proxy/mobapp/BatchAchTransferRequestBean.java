/**
 * BatchAchTransferRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BatchAchTransferRequestBean  implements java.io.Serializable {
    private java.lang.String additionalDocumentDesc;

    private java.lang.String cif;

    private boolean ignoreError;

    private java.lang.String reasonCode;

    private java.lang.String reasonTitle;

    private java.lang.String sourceDepositNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchTransactionBean[] transactions;

    private java.lang.String transferDescription;

    public BatchAchTransferRequestBean() {
    }

    public BatchAchTransferRequestBean(
           java.lang.String additionalDocumentDesc,
           java.lang.String cif,
           boolean ignoreError,
           java.lang.String reasonCode,
           java.lang.String reasonTitle,
           java.lang.String sourceDepositNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchTransactionBean[] transactions,
           java.lang.String transferDescription) {
           this.additionalDocumentDesc = additionalDocumentDesc;
           this.cif = cif;
           this.ignoreError = ignoreError;
           this.reasonCode = reasonCode;
           this.reasonTitle = reasonTitle;
           this.sourceDepositNumber = sourceDepositNumber;
           this.transactions = transactions;
           this.transferDescription = transferDescription;
    }


    /**
     * Gets the additionalDocumentDesc value for this BatchAchTransferRequestBean.
     * 
     * @return additionalDocumentDesc
     */
    public java.lang.String getAdditionalDocumentDesc() {
        return additionalDocumentDesc;
    }


    /**
     * Sets the additionalDocumentDesc value for this BatchAchTransferRequestBean.
     * 
     * @param additionalDocumentDesc
     */
    public void setAdditionalDocumentDesc(java.lang.String additionalDocumentDesc) {
        this.additionalDocumentDesc = additionalDocumentDesc;
    }


    /**
     * Gets the cif value for this BatchAchTransferRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this BatchAchTransferRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the ignoreError value for this BatchAchTransferRequestBean.
     * 
     * @return ignoreError
     */
    public boolean isIgnoreError() {
        return ignoreError;
    }


    /**
     * Sets the ignoreError value for this BatchAchTransferRequestBean.
     * 
     * @param ignoreError
     */
    public void setIgnoreError(boolean ignoreError) {
        this.ignoreError = ignoreError;
    }


    /**
     * Gets the reasonCode value for this BatchAchTransferRequestBean.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this BatchAchTransferRequestBean.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the reasonTitle value for this BatchAchTransferRequestBean.
     * 
     * @return reasonTitle
     */
    public java.lang.String getReasonTitle() {
        return reasonTitle;
    }


    /**
     * Sets the reasonTitle value for this BatchAchTransferRequestBean.
     * 
     * @param reasonTitle
     */
    public void setReasonTitle(java.lang.String reasonTitle) {
        this.reasonTitle = reasonTitle;
    }


    /**
     * Gets the sourceDepositNumber value for this BatchAchTransferRequestBean.
     * 
     * @return sourceDepositNumber
     */
    public java.lang.String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this BatchAchTransferRequestBean.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(java.lang.String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the transactions value for this BatchAchTransferRequestBean.
     * 
     * @return transactions
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchTransactionBean[] getTransactions() {
        return transactions;
    }


    /**
     * Sets the transactions value for this BatchAchTransferRequestBean.
     * 
     * @param transactions
     */
    public void setTransactions(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchTransactionBean[] transactions) {
        this.transactions = transactions;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchTransactionBean getTransactions(int i) {
        return this.transactions[i];
    }

    public void setTransactions(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchTransactionBean _value) {
        this.transactions[i] = _value;
    }


    /**
     * Gets the transferDescription value for this BatchAchTransferRequestBean.
     * 
     * @return transferDescription
     */
    public java.lang.String getTransferDescription() {
        return transferDescription;
    }


    /**
     * Sets the transferDescription value for this BatchAchTransferRequestBean.
     * 
     * @param transferDescription
     */
    public void setTransferDescription(java.lang.String transferDescription) {
        this.transferDescription = transferDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchAchTransferRequestBean)) return false;
        BatchAchTransferRequestBean other = (BatchAchTransferRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalDocumentDesc==null && other.getAdditionalDocumentDesc()==null) || 
             (this.additionalDocumentDesc!=null &&
              this.additionalDocumentDesc.equals(other.getAdditionalDocumentDesc()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            this.ignoreError == other.isIgnoreError() &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.reasonTitle==null && other.getReasonTitle()==null) || 
             (this.reasonTitle!=null &&
              this.reasonTitle.equals(other.getReasonTitle()))) &&
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
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
        if (getAdditionalDocumentDesc() != null) {
            _hashCode += getAdditionalDocumentDesc().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        _hashCode += (isIgnoreError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getReasonTitle() != null) {
            _hashCode += getReasonTitle().hashCode();
        }
        if (getSourceDepositNumber() != null) {
            _hashCode += getSourceDepositNumber().hashCode();
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
        new org.apache.axis.description.TypeDesc(BatchAchTransferRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "batchAchTransferRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalDocumentDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalDocumentDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("ignoreError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ignoreError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "destinationAchTransactionBean"));
        elemField.setNillable(false);
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
