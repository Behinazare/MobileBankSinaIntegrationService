/**
 * AutoTransferBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AutoTransferBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferStatusWS autoTransferStatusWS;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoWithdrawalWSType autoWithdrawalWSType;

    private java.lang.String currency;

    private java.lang.String destinationDepositNumber;

    private java.lang.String documentNumber;

    private java.math.BigDecimal requestedAmount;

    private java.lang.String serial;

    private java.lang.String sourceDepositNumber;

    private java.lang.Boolean successful;

    private java.lang.String transactionCount;

    private java.util.Calendar transactionDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferProblemWSType transferProblemWSType;

    private java.math.BigDecimal transferredAmount;

    private java.util.Calendar transferredDate;

    public AutoTransferBean() {
    }

    public AutoTransferBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferStatusWS autoTransferStatusWS,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoWithdrawalWSType autoWithdrawalWSType,
           java.lang.String currency,
           java.lang.String destinationDepositNumber,
           java.lang.String documentNumber,
           java.math.BigDecimal requestedAmount,
           java.lang.String serial,
           java.lang.String sourceDepositNumber,
           java.lang.Boolean successful,
           java.lang.String transactionCount,
           java.util.Calendar transactionDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferProblemWSType transferProblemWSType,
           java.math.BigDecimal transferredAmount,
           java.util.Calendar transferredDate) {
           this.autoTransferStatusWS = autoTransferStatusWS;
           this.autoWithdrawalWSType = autoWithdrawalWSType;
           this.currency = currency;
           this.destinationDepositNumber = destinationDepositNumber;
           this.documentNumber = documentNumber;
           this.requestedAmount = requestedAmount;
           this.serial = serial;
           this.sourceDepositNumber = sourceDepositNumber;
           this.successful = successful;
           this.transactionCount = transactionCount;
           this.transactionDate = transactionDate;
           this.transferProblemWSType = transferProblemWSType;
           this.transferredAmount = transferredAmount;
           this.transferredDate = transferredDate;
    }


    /**
     * Gets the autoTransferStatusWS value for this AutoTransferBean.
     * 
     * @return autoTransferStatusWS
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferStatusWS getAutoTransferStatusWS() {
        return autoTransferStatusWS;
    }


    /**
     * Sets the autoTransferStatusWS value for this AutoTransferBean.
     * 
     * @param autoTransferStatusWS
     */
    public void setAutoTransferStatusWS(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferStatusWS autoTransferStatusWS) {
        this.autoTransferStatusWS = autoTransferStatusWS;
    }


    /**
     * Gets the autoWithdrawalWSType value for this AutoTransferBean.
     * 
     * @return autoWithdrawalWSType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoWithdrawalWSType getAutoWithdrawalWSType() {
        return autoWithdrawalWSType;
    }


    /**
     * Sets the autoWithdrawalWSType value for this AutoTransferBean.
     * 
     * @param autoWithdrawalWSType
     */
    public void setAutoWithdrawalWSType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoWithdrawalWSType autoWithdrawalWSType) {
        this.autoWithdrawalWSType = autoWithdrawalWSType;
    }


    /**
     * Gets the currency value for this AutoTransferBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AutoTransferBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the destinationDepositNumber value for this AutoTransferBean.
     * 
     * @return destinationDepositNumber
     */
    public java.lang.String getDestinationDepositNumber() {
        return destinationDepositNumber;
    }


    /**
     * Sets the destinationDepositNumber value for this AutoTransferBean.
     * 
     * @param destinationDepositNumber
     */
    public void setDestinationDepositNumber(java.lang.String destinationDepositNumber) {
        this.destinationDepositNumber = destinationDepositNumber;
    }


    /**
     * Gets the documentNumber value for this AutoTransferBean.
     * 
     * @return documentNumber
     */
    public java.lang.String getDocumentNumber() {
        return documentNumber;
    }


    /**
     * Sets the documentNumber value for this AutoTransferBean.
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(java.lang.String documentNumber) {
        this.documentNumber = documentNumber;
    }


    /**
     * Gets the requestedAmount value for this AutoTransferBean.
     * 
     * @return requestedAmount
     */
    public java.math.BigDecimal getRequestedAmount() {
        return requestedAmount;
    }


    /**
     * Sets the requestedAmount value for this AutoTransferBean.
     * 
     * @param requestedAmount
     */
    public void setRequestedAmount(java.math.BigDecimal requestedAmount) {
        this.requestedAmount = requestedAmount;
    }


    /**
     * Gets the serial value for this AutoTransferBean.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this AutoTransferBean.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the sourceDepositNumber value for this AutoTransferBean.
     * 
     * @return sourceDepositNumber
     */
    public java.lang.String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this AutoTransferBean.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(java.lang.String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the successful value for this AutoTransferBean.
     * 
     * @return successful
     */
    public java.lang.Boolean getSuccessful() {
        return successful;
    }


    /**
     * Sets the successful value for this AutoTransferBean.
     * 
     * @param successful
     */
    public void setSuccessful(java.lang.Boolean successful) {
        this.successful = successful;
    }


    /**
     * Gets the transactionCount value for this AutoTransferBean.
     * 
     * @return transactionCount
     */
    public java.lang.String getTransactionCount() {
        return transactionCount;
    }


    /**
     * Sets the transactionCount value for this AutoTransferBean.
     * 
     * @param transactionCount
     */
    public void setTransactionCount(java.lang.String transactionCount) {
        this.transactionCount = transactionCount;
    }


    /**
     * Gets the transactionDate value for this AutoTransferBean.
     * 
     * @return transactionDate
     */
    public java.util.Calendar getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this AutoTransferBean.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.util.Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the transferProblemWSType value for this AutoTransferBean.
     * 
     * @return transferProblemWSType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferProblemWSType getTransferProblemWSType() {
        return transferProblemWSType;
    }


    /**
     * Sets the transferProblemWSType value for this AutoTransferBean.
     * 
     * @param transferProblemWSType
     */
    public void setTransferProblemWSType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferProblemWSType transferProblemWSType) {
        this.transferProblemWSType = transferProblemWSType;
    }


    /**
     * Gets the transferredAmount value for this AutoTransferBean.
     * 
     * @return transferredAmount
     */
    public java.math.BigDecimal getTransferredAmount() {
        return transferredAmount;
    }


    /**
     * Sets the transferredAmount value for this AutoTransferBean.
     * 
     * @param transferredAmount
     */
    public void setTransferredAmount(java.math.BigDecimal transferredAmount) {
        this.transferredAmount = transferredAmount;
    }


    /**
     * Gets the transferredDate value for this AutoTransferBean.
     * 
     * @return transferredDate
     */
    public java.util.Calendar getTransferredDate() {
        return transferredDate;
    }


    /**
     * Sets the transferredDate value for this AutoTransferBean.
     * 
     * @param transferredDate
     */
    public void setTransferredDate(java.util.Calendar transferredDate) {
        this.transferredDate = transferredDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoTransferBean)) return false;
        AutoTransferBean other = (AutoTransferBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoTransferStatusWS==null && other.getAutoTransferStatusWS()==null) || 
             (this.autoTransferStatusWS!=null &&
              this.autoTransferStatusWS.equals(other.getAutoTransferStatusWS()))) &&
            ((this.autoWithdrawalWSType==null && other.getAutoWithdrawalWSType()==null) || 
             (this.autoWithdrawalWSType!=null &&
              this.autoWithdrawalWSType.equals(other.getAutoWithdrawalWSType()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.destinationDepositNumber==null && other.getDestinationDepositNumber()==null) || 
             (this.destinationDepositNumber!=null &&
              this.destinationDepositNumber.equals(other.getDestinationDepositNumber()))) &&
            ((this.documentNumber==null && other.getDocumentNumber()==null) || 
             (this.documentNumber!=null &&
              this.documentNumber.equals(other.getDocumentNumber()))) &&
            ((this.requestedAmount==null && other.getRequestedAmount()==null) || 
             (this.requestedAmount!=null &&
              this.requestedAmount.equals(other.getRequestedAmount()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
            ((this.successful==null && other.getSuccessful()==null) || 
             (this.successful!=null &&
              this.successful.equals(other.getSuccessful()))) &&
            ((this.transactionCount==null && other.getTransactionCount()==null) || 
             (this.transactionCount!=null &&
              this.transactionCount.equals(other.getTransactionCount()))) &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate()))) &&
            ((this.transferProblemWSType==null && other.getTransferProblemWSType()==null) || 
             (this.transferProblemWSType!=null &&
              this.transferProblemWSType.equals(other.getTransferProblemWSType()))) &&
            ((this.transferredAmount==null && other.getTransferredAmount()==null) || 
             (this.transferredAmount!=null &&
              this.transferredAmount.equals(other.getTransferredAmount()))) &&
            ((this.transferredDate==null && other.getTransferredDate()==null) || 
             (this.transferredDate!=null &&
              this.transferredDate.equals(other.getTransferredDate())));
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
        if (getAutoTransferStatusWS() != null) {
            _hashCode += getAutoTransferStatusWS().hashCode();
        }
        if (getAutoWithdrawalWSType() != null) {
            _hashCode += getAutoWithdrawalWSType().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDestinationDepositNumber() != null) {
            _hashCode += getDestinationDepositNumber().hashCode();
        }
        if (getDocumentNumber() != null) {
            _hashCode += getDocumentNumber().hashCode();
        }
        if (getRequestedAmount() != null) {
            _hashCode += getRequestedAmount().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getSourceDepositNumber() != null) {
            _hashCode += getSourceDepositNumber().hashCode();
        }
        if (getSuccessful() != null) {
            _hashCode += getSuccessful().hashCode();
        }
        if (getTransactionCount() != null) {
            _hashCode += getTransactionCount().hashCode();
        }
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        if (getTransferProblemWSType() != null) {
            _hashCode += getTransferProblemWSType().hashCode();
        }
        if (getTransferredAmount() != null) {
            _hashCode += getTransferredAmount().hashCode();
        }
        if (getTransferredDate() != null) {
            _hashCode += getTransferredDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoTransferBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoTransferBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoTransferStatusWS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoTransferStatusWS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoTransferStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoWithdrawalWSType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoWithdrawalWSType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoWithdrawalWSType"));
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
        elemField.setFieldName("destinationDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationDepositNumber"));
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
        elemField.setFieldName("requestedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial"));
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
        elemField.setFieldName("successful");
        elemField.setXmlName(new javax.xml.namespace.QName("", "successful"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferProblemWSType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferProblemWSType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transferProblemWSType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferredAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferredAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferredDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferredDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
