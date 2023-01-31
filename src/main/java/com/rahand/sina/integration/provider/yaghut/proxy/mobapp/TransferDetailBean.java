/**
 * TransferDetailBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class TransferDetailBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BankBean destinationBank;

    private java.lang.String destinationDepositNumber;

    private java.lang.String payId;

    private java.util.Calendar registerDate;

    private java.lang.String serial;

    private java.lang.String sourceDepositNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RtgsTransferStatusWS status;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RtgsSystemCodeWS systemCode;

    public TransferDetailBean() {
    }

    public TransferDetailBean(
           java.math.BigDecimal amount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BankBean destinationBank,
           java.lang.String destinationDepositNumber,
           java.lang.String payId,
           java.util.Calendar registerDate,
           java.lang.String serial,
           java.lang.String sourceDepositNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RtgsTransferStatusWS status,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RtgsSystemCodeWS systemCode) {
           this.amount = amount;
           this.destinationBank = destinationBank;
           this.destinationDepositNumber = destinationDepositNumber;
           this.payId = payId;
           this.registerDate = registerDate;
           this.serial = serial;
           this.sourceDepositNumber = sourceDepositNumber;
           this.status = status;
           this.systemCode = systemCode;
    }


    /**
     * Gets the amount value for this TransferDetailBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransferDetailBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the destinationBank value for this TransferDetailBean.
     * 
     * @return destinationBank
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BankBean getDestinationBank() {
        return destinationBank;
    }


    /**
     * Sets the destinationBank value for this TransferDetailBean.
     * 
     * @param destinationBank
     */
    public void setDestinationBank(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BankBean destinationBank) {
        this.destinationBank = destinationBank;
    }


    /**
     * Gets the destinationDepositNumber value for this TransferDetailBean.
     * 
     * @return destinationDepositNumber
     */
    public java.lang.String getDestinationDepositNumber() {
        return destinationDepositNumber;
    }


    /**
     * Sets the destinationDepositNumber value for this TransferDetailBean.
     * 
     * @param destinationDepositNumber
     */
    public void setDestinationDepositNumber(java.lang.String destinationDepositNumber) {
        this.destinationDepositNumber = destinationDepositNumber;
    }


    /**
     * Gets the payId value for this TransferDetailBean.
     * 
     * @return payId
     */
    public java.lang.String getPayId() {
        return payId;
    }


    /**
     * Sets the payId value for this TransferDetailBean.
     * 
     * @param payId
     */
    public void setPayId(java.lang.String payId) {
        this.payId = payId;
    }


    /**
     * Gets the registerDate value for this TransferDetailBean.
     * 
     * @return registerDate
     */
    public java.util.Calendar getRegisterDate() {
        return registerDate;
    }


    /**
     * Sets the registerDate value for this TransferDetailBean.
     * 
     * @param registerDate
     */
    public void setRegisterDate(java.util.Calendar registerDate) {
        this.registerDate = registerDate;
    }


    /**
     * Gets the serial value for this TransferDetailBean.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this TransferDetailBean.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the sourceDepositNumber value for this TransferDetailBean.
     * 
     * @return sourceDepositNumber
     */
    public java.lang.String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this TransferDetailBean.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(java.lang.String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the status value for this TransferDetailBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RtgsTransferStatusWS getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TransferDetailBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RtgsTransferStatusWS status) {
        this.status = status;
    }


    /**
     * Gets the systemCode value for this TransferDetailBean.
     * 
     * @return systemCode
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RtgsSystemCodeWS getSystemCode() {
        return systemCode;
    }


    /**
     * Sets the systemCode value for this TransferDetailBean.
     * 
     * @param systemCode
     */
    public void setSystemCode(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RtgsSystemCodeWS systemCode) {
        this.systemCode = systemCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferDetailBean)) return false;
        TransferDetailBean other = (TransferDetailBean) obj;
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
            ((this.destinationBank==null && other.getDestinationBank()==null) || 
             (this.destinationBank!=null &&
              this.destinationBank.equals(other.getDestinationBank()))) &&
            ((this.destinationDepositNumber==null && other.getDestinationDepositNumber()==null) || 
             (this.destinationDepositNumber!=null &&
              this.destinationDepositNumber.equals(other.getDestinationDepositNumber()))) &&
            ((this.payId==null && other.getPayId()==null) || 
             (this.payId!=null &&
              this.payId.equals(other.getPayId()))) &&
            ((this.registerDate==null && other.getRegisterDate()==null) || 
             (this.registerDate!=null &&
              this.registerDate.equals(other.getRegisterDate()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.systemCode==null && other.getSystemCode()==null) || 
             (this.systemCode!=null &&
              this.systemCode.equals(other.getSystemCode())));
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
        if (getDestinationBank() != null) {
            _hashCode += getDestinationBank().hashCode();
        }
        if (getDestinationDepositNumber() != null) {
            _hashCode += getDestinationDepositNumber().hashCode();
        }
        if (getPayId() != null) {
            _hashCode += getPayId().hashCode();
        }
        if (getRegisterDate() != null) {
            _hashCode += getRegisterDate().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getSourceDepositNumber() != null) {
            _hashCode += getSourceDepositNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSystemCode() != null) {
            _hashCode += getSystemCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferDetailBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transferDetailBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationBank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "bankBean"));
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
        elemField.setFieldName("payId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payId"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "rtgsTransferStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "rtgsSystemCodeWS"));
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
