/**
 * CashChequeRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CashChequeRequestBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private boolean checkRegisteredInfo;

    private java.util.Calendar chequeDate;

    private java.lang.String chequeNumber;

    private java.lang.String depositNumber;

    private java.lang.String description;

    private java.lang.String destination;

    public CashChequeRequestBean() {
    }

    public CashChequeRequestBean(
           java.math.BigDecimal amount,
           boolean checkRegisteredInfo,
           java.util.Calendar chequeDate,
           java.lang.String chequeNumber,
           java.lang.String depositNumber,
           java.lang.String description,
           java.lang.String destination) {
           this.amount = amount;
           this.checkRegisteredInfo = checkRegisteredInfo;
           this.chequeDate = chequeDate;
           this.chequeNumber = chequeNumber;
           this.depositNumber = depositNumber;
           this.description = description;
           this.destination = destination;
    }


    /**
     * Gets the amount value for this CashChequeRequestBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CashChequeRequestBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the checkRegisteredInfo value for this CashChequeRequestBean.
     * 
     * @return checkRegisteredInfo
     */
    public boolean isCheckRegisteredInfo() {
        return checkRegisteredInfo;
    }


    /**
     * Sets the checkRegisteredInfo value for this CashChequeRequestBean.
     * 
     * @param checkRegisteredInfo
     */
    public void setCheckRegisteredInfo(boolean checkRegisteredInfo) {
        this.checkRegisteredInfo = checkRegisteredInfo;
    }


    /**
     * Gets the chequeDate value for this CashChequeRequestBean.
     * 
     * @return chequeDate
     */
    public java.util.Calendar getChequeDate() {
        return chequeDate;
    }


    /**
     * Sets the chequeDate value for this CashChequeRequestBean.
     * 
     * @param chequeDate
     */
    public void setChequeDate(java.util.Calendar chequeDate) {
        this.chequeDate = chequeDate;
    }


    /**
     * Gets the chequeNumber value for this CashChequeRequestBean.
     * 
     * @return chequeNumber
     */
    public java.lang.String getChequeNumber() {
        return chequeNumber;
    }


    /**
     * Sets the chequeNumber value for this CashChequeRequestBean.
     * 
     * @param chequeNumber
     */
    public void setChequeNumber(java.lang.String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }


    /**
     * Gets the depositNumber value for this CashChequeRequestBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this CashChequeRequestBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the description value for this CashChequeRequestBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CashChequeRequestBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the destination value for this CashChequeRequestBean.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this CashChequeRequestBean.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CashChequeRequestBean)) return false;
        CashChequeRequestBean other = (CashChequeRequestBean) obj;
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
            this.checkRegisteredInfo == other.isCheckRegisteredInfo() &&
            ((this.chequeDate==null && other.getChequeDate()==null) || 
             (this.chequeDate!=null &&
              this.chequeDate.equals(other.getChequeDate()))) &&
            ((this.chequeNumber==null && other.getChequeNumber()==null) || 
             (this.chequeNumber!=null &&
              this.chequeNumber.equals(other.getChequeNumber()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination())));
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
        _hashCode += (isCheckRegisteredInfo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChequeDate() != null) {
            _hashCode += getChequeDate().hashCode();
        }
        if (getChequeNumber() != null) {
            _hashCode += getChequeNumber().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CashChequeRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cashChequeRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkRegisteredInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkRegisteredInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
