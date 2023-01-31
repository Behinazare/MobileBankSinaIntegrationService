/**
 * SearchBillPaymentBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SearchBillPaymentBean  implements java.io.Serializable {
    private java.lang.String billId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType[] billTypes;

    private java.lang.String cardPan;

    private java.lang.String depositNumber;

    private java.math.BigDecimal fromPaymentAmount;

    private java.util.Calendar fromPaymentDate;

    private long length;

    private long offset;

    private java.lang.String payId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatus paymentBillStatus;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ClientType[] paymentClientTypes;

    private java.lang.String paymentServiceId;

    private java.lang.String referenceNumber;

    private java.math.BigDecimal toPaymentAmount;

    private java.util.Calendar toPaymentDate;

    public SearchBillPaymentBean() {
    }

    public SearchBillPaymentBean(
           java.lang.String billId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType[] billTypes,
           java.lang.String cardPan,
           java.lang.String depositNumber,
           java.math.BigDecimal fromPaymentAmount,
           java.util.Calendar fromPaymentDate,
           long length,
           long offset,
           java.lang.String payId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatus paymentBillStatus,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ClientType[] paymentClientTypes,
           java.lang.String paymentServiceId,
           java.lang.String referenceNumber,
           java.math.BigDecimal toPaymentAmount,
           java.util.Calendar toPaymentDate) {
           this.billId = billId;
           this.billTypes = billTypes;
           this.cardPan = cardPan;
           this.depositNumber = depositNumber;
           this.fromPaymentAmount = fromPaymentAmount;
           this.fromPaymentDate = fromPaymentDate;
           this.length = length;
           this.offset = offset;
           this.payId = payId;
           this.paymentBillStatus = paymentBillStatus;
           this.paymentClientTypes = paymentClientTypes;
           this.paymentServiceId = paymentServiceId;
           this.referenceNumber = referenceNumber;
           this.toPaymentAmount = toPaymentAmount;
           this.toPaymentDate = toPaymentDate;
    }


    /**
     * Gets the billId value for this SearchBillPaymentBean.
     * 
     * @return billId
     */
    public java.lang.String getBillId() {
        return billId;
    }


    /**
     * Sets the billId value for this SearchBillPaymentBean.
     * 
     * @param billId
     */
    public void setBillId(java.lang.String billId) {
        this.billId = billId;
    }


    /**
     * Gets the billTypes value for this SearchBillPaymentBean.
     * 
     * @return billTypes
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType[] getBillTypes() {
        return billTypes;
    }


    /**
     * Sets the billTypes value for this SearchBillPaymentBean.
     * 
     * @param billTypes
     */
    public void setBillTypes(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType[] billTypes) {
        this.billTypes = billTypes;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType getBillTypes(int i) {
        return this.billTypes[i];
    }

    public void setBillTypes(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType _value) {
        this.billTypes[i] = _value;
    }


    /**
     * Gets the cardPan value for this SearchBillPaymentBean.
     * 
     * @return cardPan
     */
    public java.lang.String getCardPan() {
        return cardPan;
    }


    /**
     * Sets the cardPan value for this SearchBillPaymentBean.
     * 
     * @param cardPan
     */
    public void setCardPan(java.lang.String cardPan) {
        this.cardPan = cardPan;
    }


    /**
     * Gets the depositNumber value for this SearchBillPaymentBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this SearchBillPaymentBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the fromPaymentAmount value for this SearchBillPaymentBean.
     * 
     * @return fromPaymentAmount
     */
    public java.math.BigDecimal getFromPaymentAmount() {
        return fromPaymentAmount;
    }


    /**
     * Sets the fromPaymentAmount value for this SearchBillPaymentBean.
     * 
     * @param fromPaymentAmount
     */
    public void setFromPaymentAmount(java.math.BigDecimal fromPaymentAmount) {
        this.fromPaymentAmount = fromPaymentAmount;
    }


    /**
     * Gets the fromPaymentDate value for this SearchBillPaymentBean.
     * 
     * @return fromPaymentDate
     */
    public java.util.Calendar getFromPaymentDate() {
        return fromPaymentDate;
    }


    /**
     * Sets the fromPaymentDate value for this SearchBillPaymentBean.
     * 
     * @param fromPaymentDate
     */
    public void setFromPaymentDate(java.util.Calendar fromPaymentDate) {
        this.fromPaymentDate = fromPaymentDate;
    }


    /**
     * Gets the length value for this SearchBillPaymentBean.
     * 
     * @return length
     */
    public long getLength() {
        return length;
    }


    /**
     * Sets the length value for this SearchBillPaymentBean.
     * 
     * @param length
     */
    public void setLength(long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this SearchBillPaymentBean.
     * 
     * @return offset
     */
    public long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this SearchBillPaymentBean.
     * 
     * @param offset
     */
    public void setOffset(long offset) {
        this.offset = offset;
    }


    /**
     * Gets the payId value for this SearchBillPaymentBean.
     * 
     * @return payId
     */
    public java.lang.String getPayId() {
        return payId;
    }


    /**
     * Sets the payId value for this SearchBillPaymentBean.
     * 
     * @param payId
     */
    public void setPayId(java.lang.String payId) {
        this.payId = payId;
    }


    /**
     * Gets the paymentBillStatus value for this SearchBillPaymentBean.
     * 
     * @return paymentBillStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatus getPaymentBillStatus() {
        return paymentBillStatus;
    }


    /**
     * Sets the paymentBillStatus value for this SearchBillPaymentBean.
     * 
     * @param paymentBillStatus
     */
    public void setPaymentBillStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentBillStatus paymentBillStatus) {
        this.paymentBillStatus = paymentBillStatus;
    }


    /**
     * Gets the paymentClientTypes value for this SearchBillPaymentBean.
     * 
     * @return paymentClientTypes
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ClientType[] getPaymentClientTypes() {
        return paymentClientTypes;
    }


    /**
     * Sets the paymentClientTypes value for this SearchBillPaymentBean.
     * 
     * @param paymentClientTypes
     */
    public void setPaymentClientTypes(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ClientType[] paymentClientTypes) {
        this.paymentClientTypes = paymentClientTypes;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ClientType getPaymentClientTypes(int i) {
        return this.paymentClientTypes[i];
    }

    public void setPaymentClientTypes(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ClientType _value) {
        this.paymentClientTypes[i] = _value;
    }


    /**
     * Gets the paymentServiceId value for this SearchBillPaymentBean.
     * 
     * @return paymentServiceId
     */
    public java.lang.String getPaymentServiceId() {
        return paymentServiceId;
    }


    /**
     * Sets the paymentServiceId value for this SearchBillPaymentBean.
     * 
     * @param paymentServiceId
     */
    public void setPaymentServiceId(java.lang.String paymentServiceId) {
        this.paymentServiceId = paymentServiceId;
    }


    /**
     * Gets the referenceNumber value for this SearchBillPaymentBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this SearchBillPaymentBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the toPaymentAmount value for this SearchBillPaymentBean.
     * 
     * @return toPaymentAmount
     */
    public java.math.BigDecimal getToPaymentAmount() {
        return toPaymentAmount;
    }


    /**
     * Sets the toPaymentAmount value for this SearchBillPaymentBean.
     * 
     * @param toPaymentAmount
     */
    public void setToPaymentAmount(java.math.BigDecimal toPaymentAmount) {
        this.toPaymentAmount = toPaymentAmount;
    }


    /**
     * Gets the toPaymentDate value for this SearchBillPaymentBean.
     * 
     * @return toPaymentDate
     */
    public java.util.Calendar getToPaymentDate() {
        return toPaymentDate;
    }


    /**
     * Sets the toPaymentDate value for this SearchBillPaymentBean.
     * 
     * @param toPaymentDate
     */
    public void setToPaymentDate(java.util.Calendar toPaymentDate) {
        this.toPaymentDate = toPaymentDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchBillPaymentBean)) return false;
        SearchBillPaymentBean other = (SearchBillPaymentBean) obj;
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
            ((this.billTypes==null && other.getBillTypes()==null) || 
             (this.billTypes!=null &&
              java.util.Arrays.equals(this.billTypes, other.getBillTypes()))) &&
            ((this.cardPan==null && other.getCardPan()==null) || 
             (this.cardPan!=null &&
              this.cardPan.equals(other.getCardPan()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.fromPaymentAmount==null && other.getFromPaymentAmount()==null) || 
             (this.fromPaymentAmount!=null &&
              this.fromPaymentAmount.equals(other.getFromPaymentAmount()))) &&
            ((this.fromPaymentDate==null && other.getFromPaymentDate()==null) || 
             (this.fromPaymentDate!=null &&
              this.fromPaymentDate.equals(other.getFromPaymentDate()))) &&
            this.length == other.getLength() &&
            this.offset == other.getOffset() &&
            ((this.payId==null && other.getPayId()==null) || 
             (this.payId!=null &&
              this.payId.equals(other.getPayId()))) &&
            ((this.paymentBillStatus==null && other.getPaymentBillStatus()==null) || 
             (this.paymentBillStatus!=null &&
              this.paymentBillStatus.equals(other.getPaymentBillStatus()))) &&
            ((this.paymentClientTypes==null && other.getPaymentClientTypes()==null) || 
             (this.paymentClientTypes!=null &&
              java.util.Arrays.equals(this.paymentClientTypes, other.getPaymentClientTypes()))) &&
            ((this.paymentServiceId==null && other.getPaymentServiceId()==null) || 
             (this.paymentServiceId!=null &&
              this.paymentServiceId.equals(other.getPaymentServiceId()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.toPaymentAmount==null && other.getToPaymentAmount()==null) || 
             (this.toPaymentAmount!=null &&
              this.toPaymentAmount.equals(other.getToPaymentAmount()))) &&
            ((this.toPaymentDate==null && other.getToPaymentDate()==null) || 
             (this.toPaymentDate!=null &&
              this.toPaymentDate.equals(other.getToPaymentDate())));
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
        if (getBillTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCardPan() != null) {
            _hashCode += getCardPan().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getFromPaymentAmount() != null) {
            _hashCode += getFromPaymentAmount().hashCode();
        }
        if (getFromPaymentDate() != null) {
            _hashCode += getFromPaymentDate().hashCode();
        }
        _hashCode += new Long(getLength()).hashCode();
        _hashCode += new Long(getOffset()).hashCode();
        if (getPayId() != null) {
            _hashCode += getPayId().hashCode();
        }
        if (getPaymentBillStatus() != null) {
            _hashCode += getPaymentBillStatus().hashCode();
        }
        if (getPaymentClientTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentClientTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentClientTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentServiceId() != null) {
            _hashCode += getPaymentServiceId().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getToPaymentAmount() != null) {
            _hashCode += getToPaymentAmount().hashCode();
        }
        if (getToPaymentDate() != null) {
            _hashCode += getToPaymentDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchBillPaymentBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "searchBillPaymentBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("fromPaymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromPaymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromPaymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromPaymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("paymentBillStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentBillStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentBillStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentClientTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentClientTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "clientType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentServiceId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toPaymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toPaymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toPaymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toPaymentDate"));
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
