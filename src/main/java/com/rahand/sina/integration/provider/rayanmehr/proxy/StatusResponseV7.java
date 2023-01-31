/**
 * StatusResponseV7.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.rayanmehr.proxy;

public class StatusResponseV7  implements java.io.Serializable {
    private java.lang.String operationTransactionId;

    private java.lang.Integer resultCode;

    private java.lang.Integer statusCode;

    private java.lang.Long transactionId;

    private java.lang.Integer transactionResultCode;

    private java.lang.Integer transactionStatusCode;

    public StatusResponseV7() {
    }

    public StatusResponseV7(
           java.lang.String operationTransactionId,
           java.lang.Integer resultCode,
           java.lang.Integer statusCode,
           java.lang.Long transactionId,
           java.lang.Integer transactionResultCode,
           java.lang.Integer transactionStatusCode) {
           this.operationTransactionId = operationTransactionId;
           this.resultCode = resultCode;
           this.statusCode = statusCode;
           this.transactionId = transactionId;
           this.transactionResultCode = transactionResultCode;
           this.transactionStatusCode = transactionStatusCode;
    }


    /**
     * Gets the operationTransactionId value for this StatusResponseV7.
     * 
     * @return operationTransactionId
     */
    public java.lang.String getOperationTransactionId() {
        return operationTransactionId;
    }


    /**
     * Sets the operationTransactionId value for this StatusResponseV7.
     * 
     * @param operationTransactionId
     */
    public void setOperationTransactionId(java.lang.String operationTransactionId) {
        this.operationTransactionId = operationTransactionId;
    }


    /**
     * Gets the resultCode value for this StatusResponseV7.
     * 
     * @return resultCode
     */
    public java.lang.Integer getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this StatusResponseV7.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.Integer resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the statusCode value for this StatusResponseV7.
     * 
     * @return statusCode
     */
    public java.lang.Integer getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this StatusResponseV7.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.Integer statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the transactionId value for this StatusResponseV7.
     * 
     * @return transactionId
     */
    public java.lang.Long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this StatusResponseV7.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.Long transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionResultCode value for this StatusResponseV7.
     * 
     * @return transactionResultCode
     */
    public java.lang.Integer getTransactionResultCode() {
        return transactionResultCode;
    }


    /**
     * Sets the transactionResultCode value for this StatusResponseV7.
     * 
     * @param transactionResultCode
     */
    public void setTransactionResultCode(java.lang.Integer transactionResultCode) {
        this.transactionResultCode = transactionResultCode;
    }


    /**
     * Gets the transactionStatusCode value for this StatusResponseV7.
     * 
     * @return transactionStatusCode
     */
    public java.lang.Integer getTransactionStatusCode() {
        return transactionStatusCode;
    }


    /**
     * Sets the transactionStatusCode value for this StatusResponseV7.
     * 
     * @param transactionStatusCode
     */
    public void setTransactionStatusCode(java.lang.Integer transactionStatusCode) {
        this.transactionStatusCode = transactionStatusCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusResponseV7)) return false;
        StatusResponseV7 other = (StatusResponseV7) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationTransactionId==null && other.getOperationTransactionId()==null) || 
             (this.operationTransactionId!=null &&
              this.operationTransactionId.equals(other.getOperationTransactionId()))) &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionResultCode==null && other.getTransactionResultCode()==null) || 
             (this.transactionResultCode!=null &&
              this.transactionResultCode.equals(other.getTransactionResultCode()))) &&
            ((this.transactionStatusCode==null && other.getTransactionStatusCode()==null) || 
             (this.transactionStatusCode!=null &&
              this.transactionStatusCode.equals(other.getTransactionStatusCode())));
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
        if (getOperationTransactionId() != null) {
            _hashCode += getOperationTransactionId().hashCode();
        }
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionResultCode() != null) {
            _hashCode += getTransactionResultCode().hashCode();
        }
        if (getTransactionStatusCode() != null) {
            _hashCode += getTransactionStatusCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusResponseV7.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "StatusResponseV7"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "OperationTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionResultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TransactionResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TransactionStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
