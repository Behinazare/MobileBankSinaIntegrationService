/**
 * CardTransactionBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardTransactionBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String billId;

    private java.lang.String currency;

    private java.util.Calendar date;

    private java.math.BigDecimal fee;

    private java.lang.String merchantId;

    private java.lang.String merchantLocation;

    private java.lang.String pan;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessCodeWS processingCode;

    private java.lang.String referenceNumber;

    private java.util.Calendar startCycleDate;

    private java.lang.String traceNumber;

    public CardTransactionBean() {
    }

    public CardTransactionBean(
           java.math.BigDecimal amount,
           java.lang.String billId,
           java.lang.String currency,
           java.util.Calendar date,
           java.math.BigDecimal fee,
           java.lang.String merchantId,
           java.lang.String merchantLocation,
           java.lang.String pan,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessCodeWS processingCode,
           java.lang.String referenceNumber,
           java.util.Calendar startCycleDate,
           java.lang.String traceNumber) {
           this.amount = amount;
           this.billId = billId;
           this.currency = currency;
           this.date = date;
           this.fee = fee;
           this.merchantId = merchantId;
           this.merchantLocation = merchantLocation;
           this.pan = pan;
           this.processingCode = processingCode;
           this.referenceNumber = referenceNumber;
           this.startCycleDate = startCycleDate;
           this.traceNumber = traceNumber;
    }


    /**
     * Gets the amount value for this CardTransactionBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CardTransactionBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the billId value for this CardTransactionBean.
     * 
     * @return billId
     */
    public java.lang.String getBillId() {
        return billId;
    }


    /**
     * Sets the billId value for this CardTransactionBean.
     * 
     * @param billId
     */
    public void setBillId(java.lang.String billId) {
        this.billId = billId;
    }


    /**
     * Gets the currency value for this CardTransactionBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CardTransactionBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the date value for this CardTransactionBean.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this CardTransactionBean.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the fee value for this CardTransactionBean.
     * 
     * @return fee
     */
    public java.math.BigDecimal getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this CardTransactionBean.
     * 
     * @param fee
     */
    public void setFee(java.math.BigDecimal fee) {
        this.fee = fee;
    }


    /**
     * Gets the merchantId value for this CardTransactionBean.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this CardTransactionBean.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the merchantLocation value for this CardTransactionBean.
     * 
     * @return merchantLocation
     */
    public java.lang.String getMerchantLocation() {
        return merchantLocation;
    }


    /**
     * Sets the merchantLocation value for this CardTransactionBean.
     * 
     * @param merchantLocation
     */
    public void setMerchantLocation(java.lang.String merchantLocation) {
        this.merchantLocation = merchantLocation;
    }


    /**
     * Gets the pan value for this CardTransactionBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CardTransactionBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the processingCode value for this CardTransactionBean.
     * 
     * @return processingCode
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessCodeWS getProcessingCode() {
        return processingCode;
    }


    /**
     * Sets the processingCode value for this CardTransactionBean.
     * 
     * @param processingCode
     */
    public void setProcessingCode(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessCodeWS processingCode) {
        this.processingCode = processingCode;
    }


    /**
     * Gets the referenceNumber value for this CardTransactionBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this CardTransactionBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the startCycleDate value for this CardTransactionBean.
     * 
     * @return startCycleDate
     */
    public java.util.Calendar getStartCycleDate() {
        return startCycleDate;
    }


    /**
     * Sets the startCycleDate value for this CardTransactionBean.
     * 
     * @param startCycleDate
     */
    public void setStartCycleDate(java.util.Calendar startCycleDate) {
        this.startCycleDate = startCycleDate;
    }


    /**
     * Gets the traceNumber value for this CardTransactionBean.
     * 
     * @return traceNumber
     */
    public java.lang.String getTraceNumber() {
        return traceNumber;
    }


    /**
     * Sets the traceNumber value for this CardTransactionBean.
     * 
     * @param traceNumber
     */
    public void setTraceNumber(java.lang.String traceNumber) {
        this.traceNumber = traceNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardTransactionBean)) return false;
        CardTransactionBean other = (CardTransactionBean) obj;
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
            ((this.billId==null && other.getBillId()==null) || 
             (this.billId!=null &&
              this.billId.equals(other.getBillId()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.fee==null && other.getFee()==null) || 
             (this.fee!=null &&
              this.fee.equals(other.getFee()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.merchantLocation==null && other.getMerchantLocation()==null) || 
             (this.merchantLocation!=null &&
              this.merchantLocation.equals(other.getMerchantLocation()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.processingCode==null && other.getProcessingCode()==null) || 
             (this.processingCode!=null &&
              this.processingCode.equals(other.getProcessingCode()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.startCycleDate==null && other.getStartCycleDate()==null) || 
             (this.startCycleDate!=null &&
              this.startCycleDate.equals(other.getStartCycleDate()))) &&
            ((this.traceNumber==null && other.getTraceNumber()==null) || 
             (this.traceNumber!=null &&
              this.traceNumber.equals(other.getTraceNumber())));
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
        if (getBillId() != null) {
            _hashCode += getBillId().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getFee() != null) {
            _hashCode += getFee().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getMerchantLocation() != null) {
            _hashCode += getMerchantLocation().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getProcessingCode() != null) {
            _hashCode += getProcessingCode().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getStartCycleDate() != null) {
            _hashCode += getStartCycleDate().hashCode();
        }
        if (getTraceNumber() != null) {
            _hashCode += getTraceNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardTransactionBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardTransactionBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processCodeWS"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traceNumber"));
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
