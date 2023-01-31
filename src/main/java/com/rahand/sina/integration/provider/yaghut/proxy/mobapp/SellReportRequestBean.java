/**
 * SellReportRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SellReportRequestBean  implements java.io.Serializable {
    private java.math.BigDecimal amountMax;

    private java.math.BigDecimal amountMin;

    private java.lang.String billId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType[] billTypes;

    private java.lang.String customerRefNum;

    private long length;

    private java.lang.String merchantId;

    private long offset;

    private boolean onlyReversed;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellOrderField orderField;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderType orderType;

    private java.lang.String paymentId;

    private java.lang.String refNum;

    private java.lang.String resNum;

    private java.util.Calendar timeMax;

    private java.util.Calendar timeMin;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionState txState;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionType txType;

    public SellReportRequestBean() {
    }

    public SellReportRequestBean(
           java.math.BigDecimal amountMax,
           java.math.BigDecimal amountMin,
           java.lang.String billId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType[] billTypes,
           java.lang.String customerRefNum,
           long length,
           java.lang.String merchantId,
           long offset,
           boolean onlyReversed,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellOrderField orderField,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderType orderType,
           java.lang.String paymentId,
           java.lang.String refNum,
           java.lang.String resNum,
           java.util.Calendar timeMax,
           java.util.Calendar timeMin,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionState txState,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionType txType) {
           this.amountMax = amountMax;
           this.amountMin = amountMin;
           this.billId = billId;
           this.billTypes = billTypes;
           this.customerRefNum = customerRefNum;
           this.length = length;
           this.merchantId = merchantId;
           this.offset = offset;
           this.onlyReversed = onlyReversed;
           this.orderField = orderField;
           this.orderType = orderType;
           this.paymentId = paymentId;
           this.refNum = refNum;
           this.resNum = resNum;
           this.timeMax = timeMax;
           this.timeMin = timeMin;
           this.txState = txState;
           this.txType = txType;
    }


    /**
     * Gets the amountMax value for this SellReportRequestBean.
     * 
     * @return amountMax
     */
    public java.math.BigDecimal getAmountMax() {
        return amountMax;
    }


    /**
     * Sets the amountMax value for this SellReportRequestBean.
     * 
     * @param amountMax
     */
    public void setAmountMax(java.math.BigDecimal amountMax) {
        this.amountMax = amountMax;
    }


    /**
     * Gets the amountMin value for this SellReportRequestBean.
     * 
     * @return amountMin
     */
    public java.math.BigDecimal getAmountMin() {
        return amountMin;
    }


    /**
     * Sets the amountMin value for this SellReportRequestBean.
     * 
     * @param amountMin
     */
    public void setAmountMin(java.math.BigDecimal amountMin) {
        this.amountMin = amountMin;
    }


    /**
     * Gets the billId value for this SellReportRequestBean.
     * 
     * @return billId
     */
    public java.lang.String getBillId() {
        return billId;
    }


    /**
     * Sets the billId value for this SellReportRequestBean.
     * 
     * @param billId
     */
    public void setBillId(java.lang.String billId) {
        this.billId = billId;
    }


    /**
     * Gets the billTypes value for this SellReportRequestBean.
     * 
     * @return billTypes
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType[] getBillTypes() {
        return billTypes;
    }


    /**
     * Sets the billTypes value for this SellReportRequestBean.
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
     * Gets the customerRefNum value for this SellReportRequestBean.
     * 
     * @return customerRefNum
     */
    public java.lang.String getCustomerRefNum() {
        return customerRefNum;
    }


    /**
     * Sets the customerRefNum value for this SellReportRequestBean.
     * 
     * @param customerRefNum
     */
    public void setCustomerRefNum(java.lang.String customerRefNum) {
        this.customerRefNum = customerRefNum;
    }


    /**
     * Gets the length value for this SellReportRequestBean.
     * 
     * @return length
     */
    public long getLength() {
        return length;
    }


    /**
     * Sets the length value for this SellReportRequestBean.
     * 
     * @param length
     */
    public void setLength(long length) {
        this.length = length;
    }


    /**
     * Gets the merchantId value for this SellReportRequestBean.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this SellReportRequestBean.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the offset value for this SellReportRequestBean.
     * 
     * @return offset
     */
    public long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this SellReportRequestBean.
     * 
     * @param offset
     */
    public void setOffset(long offset) {
        this.offset = offset;
    }


    /**
     * Gets the onlyReversed value for this SellReportRequestBean.
     * 
     * @return onlyReversed
     */
    public boolean isOnlyReversed() {
        return onlyReversed;
    }


    /**
     * Sets the onlyReversed value for this SellReportRequestBean.
     * 
     * @param onlyReversed
     */
    public void setOnlyReversed(boolean onlyReversed) {
        this.onlyReversed = onlyReversed;
    }


    /**
     * Gets the orderField value for this SellReportRequestBean.
     * 
     * @return orderField
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellOrderField getOrderField() {
        return orderField;
    }


    /**
     * Sets the orderField value for this SellReportRequestBean.
     * 
     * @param orderField
     */
    public void setOrderField(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellOrderField orderField) {
        this.orderField = orderField;
    }


    /**
     * Gets the orderType value for this SellReportRequestBean.
     * 
     * @return orderType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderType getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this SellReportRequestBean.
     * 
     * @param orderType
     */
    public void setOrderType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderType orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the paymentId value for this SellReportRequestBean.
     * 
     * @return paymentId
     */
    public java.lang.String getPaymentId() {
        return paymentId;
    }


    /**
     * Sets the paymentId value for this SellReportRequestBean.
     * 
     * @param paymentId
     */
    public void setPaymentId(java.lang.String paymentId) {
        this.paymentId = paymentId;
    }


    /**
     * Gets the refNum value for this SellReportRequestBean.
     * 
     * @return refNum
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this SellReportRequestBean.
     * 
     * @param refNum
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the resNum value for this SellReportRequestBean.
     * 
     * @return resNum
     */
    public java.lang.String getResNum() {
        return resNum;
    }


    /**
     * Sets the resNum value for this SellReportRequestBean.
     * 
     * @param resNum
     */
    public void setResNum(java.lang.String resNum) {
        this.resNum = resNum;
    }


    /**
     * Gets the timeMax value for this SellReportRequestBean.
     * 
     * @return timeMax
     */
    public java.util.Calendar getTimeMax() {
        return timeMax;
    }


    /**
     * Sets the timeMax value for this SellReportRequestBean.
     * 
     * @param timeMax
     */
    public void setTimeMax(java.util.Calendar timeMax) {
        this.timeMax = timeMax;
    }


    /**
     * Gets the timeMin value for this SellReportRequestBean.
     * 
     * @return timeMin
     */
    public java.util.Calendar getTimeMin() {
        return timeMin;
    }


    /**
     * Sets the timeMin value for this SellReportRequestBean.
     * 
     * @param timeMin
     */
    public void setTimeMin(java.util.Calendar timeMin) {
        this.timeMin = timeMin;
    }


    /**
     * Gets the txState value for this SellReportRequestBean.
     * 
     * @return txState
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionState getTxState() {
        return txState;
    }


    /**
     * Sets the txState value for this SellReportRequestBean.
     * 
     * @param txState
     */
    public void setTxState(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionState txState) {
        this.txState = txState;
    }


    /**
     * Gets the txType value for this SellReportRequestBean.
     * 
     * @return txType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionType getTxType() {
        return txType;
    }


    /**
     * Sets the txType value for this SellReportRequestBean.
     * 
     * @param txType
     */
    public void setTxType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionType txType) {
        this.txType = txType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellReportRequestBean)) return false;
        SellReportRequestBean other = (SellReportRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amountMax==null && other.getAmountMax()==null) || 
             (this.amountMax!=null &&
              this.amountMax.equals(other.getAmountMax()))) &&
            ((this.amountMin==null && other.getAmountMin()==null) || 
             (this.amountMin!=null &&
              this.amountMin.equals(other.getAmountMin()))) &&
            ((this.billId==null && other.getBillId()==null) || 
             (this.billId!=null &&
              this.billId.equals(other.getBillId()))) &&
            ((this.billTypes==null && other.getBillTypes()==null) || 
             (this.billTypes!=null &&
              java.util.Arrays.equals(this.billTypes, other.getBillTypes()))) &&
            ((this.customerRefNum==null && other.getCustomerRefNum()==null) || 
             (this.customerRefNum!=null &&
              this.customerRefNum.equals(other.getCustomerRefNum()))) &&
            this.length == other.getLength() &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            this.offset == other.getOffset() &&
            this.onlyReversed == other.isOnlyReversed() &&
            ((this.orderField==null && other.getOrderField()==null) || 
             (this.orderField!=null &&
              this.orderField.equals(other.getOrderField()))) &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            ((this.paymentId==null && other.getPaymentId()==null) || 
             (this.paymentId!=null &&
              this.paymentId.equals(other.getPaymentId()))) &&
            ((this.refNum==null && other.getRefNum()==null) || 
             (this.refNum!=null &&
              this.refNum.equals(other.getRefNum()))) &&
            ((this.resNum==null && other.getResNum()==null) || 
             (this.resNum!=null &&
              this.resNum.equals(other.getResNum()))) &&
            ((this.timeMax==null && other.getTimeMax()==null) || 
             (this.timeMax!=null &&
              this.timeMax.equals(other.getTimeMax()))) &&
            ((this.timeMin==null && other.getTimeMin()==null) || 
             (this.timeMin!=null &&
              this.timeMin.equals(other.getTimeMin()))) &&
            ((this.txState==null && other.getTxState()==null) || 
             (this.txState!=null &&
              this.txState.equals(other.getTxState()))) &&
            ((this.txType==null && other.getTxType()==null) || 
             (this.txType!=null &&
              this.txType.equals(other.getTxType())));
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
        if (getAmountMax() != null) {
            _hashCode += getAmountMax().hashCode();
        }
        if (getAmountMin() != null) {
            _hashCode += getAmountMin().hashCode();
        }
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
        if (getCustomerRefNum() != null) {
            _hashCode += getCustomerRefNum().hashCode();
        }
        _hashCode += new Long(getLength()).hashCode();
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        _hashCode += new Long(getOffset()).hashCode();
        _hashCode += (isOnlyReversed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOrderField() != null) {
            _hashCode += getOrderField().hashCode();
        }
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        if (getPaymentId() != null) {
            _hashCode += getPaymentId().hashCode();
        }
        if (getRefNum() != null) {
            _hashCode += getRefNum().hashCode();
        }
        if (getResNum() != null) {
            _hashCode += getResNum().hashCode();
        }
        if (getTimeMax() != null) {
            _hashCode += getTimeMax().hashCode();
        }
        if (getTimeMin() != null) {
            _hashCode += getTimeMin().hashCode();
        }
        if (getTxState() != null) {
            _hashCode += getTxState().hashCode();
        }
        if (getTxType() != null) {
            _hashCode += getTxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellReportRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellReportRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountMin"));
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
        elemField.setFieldName("billTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlyReversed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onlyReversed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderField");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellOrderField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "orderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellTransactionState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellTransactionType"));
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
