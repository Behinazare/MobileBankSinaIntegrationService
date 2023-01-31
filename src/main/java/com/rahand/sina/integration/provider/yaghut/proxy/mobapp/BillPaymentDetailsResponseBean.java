/**
 * BillPaymentDetailsResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillPaymentDetailsResponseBean  implements java.io.Serializable {
    private java.lang.String billId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType billType;

    private java.lang.String cardPan;

    private java.lang.String depositNumber;

    private java.lang.String payId;

    private java.math.BigDecimal paymentAmount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatus paymentBillStatus;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ClientType paymentClient;

    private java.util.Calendar paymentDate;

    private java.lang.String paymentServiceId;

    private java.lang.String paymentServiceTitle;

    private java.lang.String referenceNumber;

    public BillPaymentDetailsResponseBean() {
    }

    public BillPaymentDetailsResponseBean(
           java.lang.String billId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType billType,
           java.lang.String cardPan,
           java.lang.String depositNumber,
           java.lang.String payId,
           java.math.BigDecimal paymentAmount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatus paymentBillStatus,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ClientType paymentClient,
           java.util.Calendar paymentDate,
           java.lang.String paymentServiceId,
           java.lang.String paymentServiceTitle,
           java.lang.String referenceNumber) {
           this.billId = billId;
           this.billType = billType;
           this.cardPan = cardPan;
           this.depositNumber = depositNumber;
           this.payId = payId;
           this.paymentAmount = paymentAmount;
           this.paymentBillStatus = paymentBillStatus;
           this.paymentClient = paymentClient;
           this.paymentDate = paymentDate;
           this.paymentServiceId = paymentServiceId;
           this.paymentServiceTitle = paymentServiceTitle;
           this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the billId value for this BillPaymentDetailsResponseBean.
     * 
     * @return billId
     */
    public java.lang.String getBillId() {
        return billId;
    }


    /**
     * Sets the billId value for this BillPaymentDetailsResponseBean.
     * 
     * @param billId
     */
    public void setBillId(java.lang.String billId) {
        this.billId = billId;
    }


    /**
     * Gets the billType value for this BillPaymentDetailsResponseBean.
     * 
     * @return billType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType getBillType() {
        return billType;
    }


    /**
     * Sets the billType value for this BillPaymentDetailsResponseBean.
     * 
     * @param billType
     */
    public void setBillType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType billType) {
        this.billType = billType;
    }


    /**
     * Gets the cardPan value for this BillPaymentDetailsResponseBean.
     * 
     * @return cardPan
     */
    public java.lang.String getCardPan() {
        return cardPan;
    }


    /**
     * Sets the cardPan value for this BillPaymentDetailsResponseBean.
     * 
     * @param cardPan
     */
    public void setCardPan(java.lang.String cardPan) {
        this.cardPan = cardPan;
    }


    /**
     * Gets the depositNumber value for this BillPaymentDetailsResponseBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this BillPaymentDetailsResponseBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the payId value for this BillPaymentDetailsResponseBean.
     * 
     * @return payId
     */
    public java.lang.String getPayId() {
        return payId;
    }


    /**
     * Sets the payId value for this BillPaymentDetailsResponseBean.
     * 
     * @param payId
     */
    public void setPayId(java.lang.String payId) {
        this.payId = payId;
    }


    /**
     * Gets the paymentAmount value for this BillPaymentDetailsResponseBean.
     * 
     * @return paymentAmount
     */
    public java.math.BigDecimal getPaymentAmount() {
        return paymentAmount;
    }


    /**
     * Sets the paymentAmount value for this BillPaymentDetailsResponseBean.
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(java.math.BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }


    /**
     * Gets the paymentBillStatus value for this BillPaymentDetailsResponseBean.
     * 
     * @return paymentBillStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatus getPaymentBillStatus() {
        return paymentBillStatus;
    }


    /**
     * Sets the paymentBillStatus value for this BillPaymentDetailsResponseBean.
     * 
     * @param paymentBillStatus
     */
    public void setPaymentBillStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatus paymentBillStatus) {
        this.paymentBillStatus = paymentBillStatus;
    }


    /**
     * Gets the paymentClient value for this BillPaymentDetailsResponseBean.
     * 
     * @return paymentClient
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ClientType getPaymentClient() {
        return paymentClient;
    }


    /**
     * Sets the paymentClient value for this BillPaymentDetailsResponseBean.
     * 
     * @param paymentClient
     */
    public void setPaymentClient(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ClientType paymentClient) {
        this.paymentClient = paymentClient;
    }


    /**
     * Gets the paymentDate value for this BillPaymentDetailsResponseBean.
     * 
     * @return paymentDate
     */
    public java.util.Calendar getPaymentDate() {
        return paymentDate;
    }


    /**
     * Sets the paymentDate value for this BillPaymentDetailsResponseBean.
     * 
     * @param paymentDate
     */
    public void setPaymentDate(java.util.Calendar paymentDate) {
        this.paymentDate = paymentDate;
    }


    /**
     * Gets the paymentServiceId value for this BillPaymentDetailsResponseBean.
     * 
     * @return paymentServiceId
     */
    public java.lang.String getPaymentServiceId() {
        return paymentServiceId;
    }


    /**
     * Sets the paymentServiceId value for this BillPaymentDetailsResponseBean.
     * 
     * @param paymentServiceId
     */
    public void setPaymentServiceId(java.lang.String paymentServiceId) {
        this.paymentServiceId = paymentServiceId;
    }


    /**
     * Gets the paymentServiceTitle value for this BillPaymentDetailsResponseBean.
     * 
     * @return paymentServiceTitle
     */
    public java.lang.String getPaymentServiceTitle() {
        return paymentServiceTitle;
    }


    /**
     * Sets the paymentServiceTitle value for this BillPaymentDetailsResponseBean.
     * 
     * @param paymentServiceTitle
     */
    public void setPaymentServiceTitle(java.lang.String paymentServiceTitle) {
        this.paymentServiceTitle = paymentServiceTitle;
    }


    /**
     * Gets the referenceNumber value for this BillPaymentDetailsResponseBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this BillPaymentDetailsResponseBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentDetailsResponseBean)) return false;
        BillPaymentDetailsResponseBean other = (BillPaymentDetailsResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billId==null && other.getBillId()==null) || 
             (this.billId!=null &&
              this.billId.equals(other.getBillId()))) &&
            ((this.billType==null && other.getBillType()==null) || 
             (this.billType!=null &&
              this.billType.equals(other.getBillType()))) &&
            ((this.cardPan==null && other.getCardPan()==null) || 
             (this.cardPan!=null &&
              this.cardPan.equals(other.getCardPan()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.payId==null && other.getPayId()==null) || 
             (this.payId!=null &&
              this.payId.equals(other.getPayId()))) &&
            ((this.paymentAmount==null && other.getPaymentAmount()==null) || 
             (this.paymentAmount!=null &&
              this.paymentAmount.equals(other.getPaymentAmount()))) &&
            ((this.paymentBillStatus==null && other.getPaymentBillStatus()==null) || 
             (this.paymentBillStatus!=null &&
              this.paymentBillStatus.equals(other.getPaymentBillStatus()))) &&
            ((this.paymentClient==null && other.getPaymentClient()==null) || 
             (this.paymentClient!=null &&
              this.paymentClient.equals(other.getPaymentClient()))) &&
            ((this.paymentDate==null && other.getPaymentDate()==null) || 
             (this.paymentDate!=null &&
              this.paymentDate.equals(other.getPaymentDate()))) &&
            ((this.paymentServiceId==null && other.getPaymentServiceId()==null) || 
             (this.paymentServiceId!=null &&
              this.paymentServiceId.equals(other.getPaymentServiceId()))) &&
            ((this.paymentServiceTitle==null && other.getPaymentServiceTitle()==null) || 
             (this.paymentServiceTitle!=null &&
              this.paymentServiceTitle.equals(other.getPaymentServiceTitle()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber())));
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
        if (getBillId() != null) {
            _hashCode += getBillId().hashCode();
        }
        if (getBillType() != null) {
            _hashCode += getBillType().hashCode();
        }
        if (getCardPan() != null) {
            _hashCode += getCardPan().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getPayId() != null) {
            _hashCode += getPayId().hashCode();
        }
        if (getPaymentAmount() != null) {
            _hashCode += getPaymentAmount().hashCode();
        }
        if (getPaymentBillStatus() != null) {
            _hashCode += getPaymentBillStatus().hashCode();
        }
        if (getPaymentClient() != null) {
            _hashCode += getPaymentClient().hashCode();
        }
        if (getPaymentDate() != null) {
            _hashCode += getPaymentDate().hashCode();
        }
        if (getPaymentServiceId() != null) {
            _hashCode += getPaymentServiceId().hashCode();
        }
        if (getPaymentServiceTitle() != null) {
            _hashCode += getPaymentServiceTitle().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillPaymentDetailsResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billPaymentDetailsResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardPan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardPan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
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
        elemField.setFieldName("paymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentBillStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentBillStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentBillStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentClient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentClient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "clientType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentServiceTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentServiceTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNumber"));
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
