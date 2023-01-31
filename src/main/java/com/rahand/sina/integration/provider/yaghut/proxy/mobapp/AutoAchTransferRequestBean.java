/**
 * AutoAchTransferRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AutoAchTransferRequestBean  implements java.io.Serializable {
    private java.lang.String additionalDocumentDesc;

    private java.lang.String cif;

    private java.util.Calendar confirmExpireDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransactionPeriodBean[] periods;

    private java.lang.String reasonCode;

    private java.lang.String reasonTitle;

    private java.lang.String sourceDepositNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchAutoTransactionBean transaction;

    private java.lang.String transferDescription;

    public AutoAchTransferRequestBean() {
    }

    public AutoAchTransferRequestBean(
           java.lang.String additionalDocumentDesc,
           java.lang.String cif,
           java.util.Calendar confirmExpireDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransactionPeriodBean[] periods,
           java.lang.String reasonCode,
           java.lang.String reasonTitle,
           java.lang.String sourceDepositNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchAutoTransactionBean transaction,
           java.lang.String transferDescription) {
           this.additionalDocumentDesc = additionalDocumentDesc;
           this.cif = cif;
           this.confirmExpireDate = confirmExpireDate;
           this.periods = periods;
           this.reasonCode = reasonCode;
           this.reasonTitle = reasonTitle;
           this.sourceDepositNumber = sourceDepositNumber;
           this.transaction = transaction;
           this.transferDescription = transferDescription;
    }


    /**
     * Gets the additionalDocumentDesc value for this AutoAchTransferRequestBean.
     * 
     * @return additionalDocumentDesc
     */
    public java.lang.String getAdditionalDocumentDesc() {
        return additionalDocumentDesc;
    }


    /**
     * Sets the additionalDocumentDesc value for this AutoAchTransferRequestBean.
     * 
     * @param additionalDocumentDesc
     */
    public void setAdditionalDocumentDesc(java.lang.String additionalDocumentDesc) {
        this.additionalDocumentDesc = additionalDocumentDesc;
    }


    /**
     * Gets the cif value for this AutoAchTransferRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this AutoAchTransferRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the confirmExpireDate value for this AutoAchTransferRequestBean.
     * 
     * @return confirmExpireDate
     */
    public java.util.Calendar getConfirmExpireDate() {
        return confirmExpireDate;
    }


    /**
     * Sets the confirmExpireDate value for this AutoAchTransferRequestBean.
     * 
     * @param confirmExpireDate
     */
    public void setConfirmExpireDate(java.util.Calendar confirmExpireDate) {
        this.confirmExpireDate = confirmExpireDate;
    }


    /**
     * Gets the periods value for this AutoAchTransferRequestBean.
     * 
     * @return periods
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransactionPeriodBean[] getPeriods() {
        return periods;
    }


    /**
     * Sets the periods value for this AutoAchTransferRequestBean.
     * 
     * @param periods
     */
    public void setPeriods(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransactionPeriodBean[] periods) {
        this.periods = periods;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransactionPeriodBean getPeriods(int i) {
        return this.periods[i];
    }

    public void setPeriods(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransactionPeriodBean _value) {
        this.periods[i] = _value;
    }


    /**
     * Gets the reasonCode value for this AutoAchTransferRequestBean.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this AutoAchTransferRequestBean.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the reasonTitle value for this AutoAchTransferRequestBean.
     * 
     * @return reasonTitle
     */
    public java.lang.String getReasonTitle() {
        return reasonTitle;
    }


    /**
     * Sets the reasonTitle value for this AutoAchTransferRequestBean.
     * 
     * @param reasonTitle
     */
    public void setReasonTitle(java.lang.String reasonTitle) {
        this.reasonTitle = reasonTitle;
    }


    /**
     * Gets the sourceDepositNumber value for this AutoAchTransferRequestBean.
     * 
     * @return sourceDepositNumber
     */
    public java.lang.String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this AutoAchTransferRequestBean.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(java.lang.String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the transaction value for this AutoAchTransferRequestBean.
     * 
     * @return transaction
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchAutoTransactionBean getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this AutoAchTransferRequestBean.
     * 
     * @param transaction
     */
    public void setTransaction(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchAutoTransactionBean transaction) {
        this.transaction = transaction;
    }


    /**
     * Gets the transferDescription value for this AutoAchTransferRequestBean.
     * 
     * @return transferDescription
     */
    public java.lang.String getTransferDescription() {
        return transferDescription;
    }


    /**
     * Sets the transferDescription value for this AutoAchTransferRequestBean.
     * 
     * @param transferDescription
     */
    public void setTransferDescription(java.lang.String transferDescription) {
        this.transferDescription = transferDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoAchTransferRequestBean)) return false;
        AutoAchTransferRequestBean other = (AutoAchTransferRequestBean) obj;
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
            ((this.confirmExpireDate==null && other.getConfirmExpireDate()==null) || 
             (this.confirmExpireDate!=null &&
              this.confirmExpireDate.equals(other.getConfirmExpireDate()))) &&
            ((this.periods==null && other.getPeriods()==null) || 
             (this.periods!=null &&
              java.util.Arrays.equals(this.periods, other.getPeriods()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.reasonTitle==null && other.getReasonTitle()==null) || 
             (this.reasonTitle!=null &&
              this.reasonTitle.equals(other.getReasonTitle()))) &&
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              this.transaction.equals(other.getTransaction()))) &&
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
        if (getConfirmExpireDate() != null) {
            _hashCode += getConfirmExpireDate().hashCode();
        }
        if (getPeriods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriods());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriods(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getReasonTitle() != null) {
            _hashCode += getReasonTitle().hashCode();
        }
        if (getSourceDepositNumber() != null) {
            _hashCode += getSourceDepositNumber().hashCode();
        }
        if (getTransaction() != null) {
            _hashCode += getTransaction().hashCode();
        }
        if (getTransferDescription() != null) {
            _hashCode += getTransferDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoAchTransferRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoAchTransferRequestBean"));
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
        elemField.setFieldName("confirmExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confirmExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periods");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoTransactionPeriodBean"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "destinationAchAutoTransactionBean"));
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
