/**
 * BatchTransferResultBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BatchTransferResultBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferProblemTypeWS depositError;

    private java.lang.String depositOwnerName;

    private java.lang.String destinationDeposit;

    private java.lang.String errorDescription;

    private java.lang.String payId;

    private boolean transferred;

    public BatchTransferResultBean() {
    }

    public BatchTransferResultBean(
           java.math.BigDecimal amount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferProblemTypeWS depositError,
           java.lang.String depositOwnerName,
           java.lang.String destinationDeposit,
           java.lang.String errorDescription,
           java.lang.String payId,
           boolean transferred) {
           this.amount = amount;
           this.depositError = depositError;
           this.depositOwnerName = depositOwnerName;
           this.destinationDeposit = destinationDeposit;
           this.errorDescription = errorDescription;
           this.payId = payId;
           this.transferred = transferred;
    }


    /**
     * Gets the amount value for this BatchTransferResultBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BatchTransferResultBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the depositError value for this BatchTransferResultBean.
     * 
     * @return depositError
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferProblemTypeWS getDepositError() {
        return depositError;
    }


    /**
     * Sets the depositError value for this BatchTransferResultBean.
     * 
     * @param depositError
     */
    public void setDepositError(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferProblemTypeWS depositError) {
        this.depositError = depositError;
    }


    /**
     * Gets the depositOwnerName value for this BatchTransferResultBean.
     * 
     * @return depositOwnerName
     */
    public java.lang.String getDepositOwnerName() {
        return depositOwnerName;
    }


    /**
     * Sets the depositOwnerName value for this BatchTransferResultBean.
     * 
     * @param depositOwnerName
     */
    public void setDepositOwnerName(java.lang.String depositOwnerName) {
        this.depositOwnerName = depositOwnerName;
    }


    /**
     * Gets the destinationDeposit value for this BatchTransferResultBean.
     * 
     * @return destinationDeposit
     */
    public java.lang.String getDestinationDeposit() {
        return destinationDeposit;
    }


    /**
     * Sets the destinationDeposit value for this BatchTransferResultBean.
     * 
     * @param destinationDeposit
     */
    public void setDestinationDeposit(java.lang.String destinationDeposit) {
        this.destinationDeposit = destinationDeposit;
    }


    /**
     * Gets the errorDescription value for this BatchTransferResultBean.
     * 
     * @return errorDescription
     */
    public java.lang.String getErrorDescription() {
        return errorDescription;
    }


    /**
     * Sets the errorDescription value for this BatchTransferResultBean.
     * 
     * @param errorDescription
     */
    public void setErrorDescription(java.lang.String errorDescription) {
        this.errorDescription = errorDescription;
    }


    /**
     * Gets the payId value for this BatchTransferResultBean.
     * 
     * @return payId
     */
    public java.lang.String getPayId() {
        return payId;
    }


    /**
     * Sets the payId value for this BatchTransferResultBean.
     * 
     * @param payId
     */
    public void setPayId(java.lang.String payId) {
        this.payId = payId;
    }


    /**
     * Gets the transferred value for this BatchTransferResultBean.
     * 
     * @return transferred
     */
    public boolean isTransferred() {
        return transferred;
    }


    /**
     * Sets the transferred value for this BatchTransferResultBean.
     * 
     * @param transferred
     */
    public void setTransferred(boolean transferred) {
        this.transferred = transferred;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchTransferResultBean)) return false;
        BatchTransferResultBean other = (BatchTransferResultBean) obj;
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
            ((this.depositError==null && other.getDepositError()==null) || 
             (this.depositError!=null &&
              this.depositError.equals(other.getDepositError()))) &&
            ((this.depositOwnerName==null && other.getDepositOwnerName()==null) || 
             (this.depositOwnerName!=null &&
              this.depositOwnerName.equals(other.getDepositOwnerName()))) &&
            ((this.destinationDeposit==null && other.getDestinationDeposit()==null) || 
             (this.destinationDeposit!=null &&
              this.destinationDeposit.equals(other.getDestinationDeposit()))) &&
            ((this.errorDescription==null && other.getErrorDescription()==null) || 
             (this.errorDescription!=null &&
              this.errorDescription.equals(other.getErrorDescription()))) &&
            ((this.payId==null && other.getPayId()==null) || 
             (this.payId!=null &&
              this.payId.equals(other.getPayId()))) &&
            this.transferred == other.isTransferred();
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
        if (getDepositError() != null) {
            _hashCode += getDepositError().hashCode();
        }
        if (getDepositOwnerName() != null) {
            _hashCode += getDepositOwnerName().hashCode();
        }
        if (getDestinationDeposit() != null) {
            _hashCode += getDestinationDeposit().hashCode();
        }
        if (getErrorDescription() != null) {
            _hashCode += getErrorDescription().hashCode();
        }
        if (getPayId() != null) {
            _hashCode += getPayId().hashCode();
        }
        _hashCode += (isTransferred() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchTransferResultBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "batchTransferResultBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transferProblemTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositOwnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositOwnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("transferred");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferred"));
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
