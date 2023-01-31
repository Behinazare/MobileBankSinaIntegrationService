/**
 * SellDetailRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SellDetailRequestBean  implements java.io.Serializable {
    private java.math.BigDecimal amountMax;

    private java.math.BigDecimal amountMin;

    private long length;

    private java.lang.Long mainTransactionId;

    private java.lang.String merchantId;

    private long offset;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderType orderType;

    private java.lang.String refNum;

    private java.lang.String resNum;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellOrderField sellOrderField;

    private java.util.Calendar timeMax;

    private java.util.Calendar timeMin;

    public SellDetailRequestBean() {
    }

    public SellDetailRequestBean(
           java.math.BigDecimal amountMax,
           java.math.BigDecimal amountMin,
           long length,
           java.lang.Long mainTransactionId,
           java.lang.String merchantId,
           long offset,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderType orderType,
           java.lang.String refNum,
           java.lang.String resNum,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellOrderField sellOrderField,
           java.util.Calendar timeMax,
           java.util.Calendar timeMin) {
           this.amountMax = amountMax;
           this.amountMin = amountMin;
           this.length = length;
           this.mainTransactionId = mainTransactionId;
           this.merchantId = merchantId;
           this.offset = offset;
           this.orderType = orderType;
           this.refNum = refNum;
           this.resNum = resNum;
           this.sellOrderField = sellOrderField;
           this.timeMax = timeMax;
           this.timeMin = timeMin;
    }


    /**
     * Gets the amountMax value for this SellDetailRequestBean.
     * 
     * @return amountMax
     */
    public java.math.BigDecimal getAmountMax() {
        return amountMax;
    }


    /**
     * Sets the amountMax value for this SellDetailRequestBean.
     * 
     * @param amountMax
     */
    public void setAmountMax(java.math.BigDecimal amountMax) {
        this.amountMax = amountMax;
    }


    /**
     * Gets the amountMin value for this SellDetailRequestBean.
     * 
     * @return amountMin
     */
    public java.math.BigDecimal getAmountMin() {
        return amountMin;
    }


    /**
     * Sets the amountMin value for this SellDetailRequestBean.
     * 
     * @param amountMin
     */
    public void setAmountMin(java.math.BigDecimal amountMin) {
        this.amountMin = amountMin;
    }


    /**
     * Gets the length value for this SellDetailRequestBean.
     * 
     * @return length
     */
    public long getLength() {
        return length;
    }


    /**
     * Sets the length value for this SellDetailRequestBean.
     * 
     * @param length
     */
    public void setLength(long length) {
        this.length = length;
    }


    /**
     * Gets the mainTransactionId value for this SellDetailRequestBean.
     * 
     * @return mainTransactionId
     */
    public java.lang.Long getMainTransactionId() {
        return mainTransactionId;
    }


    /**
     * Sets the mainTransactionId value for this SellDetailRequestBean.
     * 
     * @param mainTransactionId
     */
    public void setMainTransactionId(java.lang.Long mainTransactionId) {
        this.mainTransactionId = mainTransactionId;
    }


    /**
     * Gets the merchantId value for this SellDetailRequestBean.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this SellDetailRequestBean.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the offset value for this SellDetailRequestBean.
     * 
     * @return offset
     */
    public long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this SellDetailRequestBean.
     * 
     * @param offset
     */
    public void setOffset(long offset) {
        this.offset = offset;
    }


    /**
     * Gets the orderType value for this SellDetailRequestBean.
     * 
     * @return orderType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderType getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this SellDetailRequestBean.
     * 
     * @param orderType
     */
    public void setOrderType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderType orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the refNum value for this SellDetailRequestBean.
     * 
     * @return refNum
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this SellDetailRequestBean.
     * 
     * @param refNum
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the resNum value for this SellDetailRequestBean.
     * 
     * @return resNum
     */
    public java.lang.String getResNum() {
        return resNum;
    }


    /**
     * Sets the resNum value for this SellDetailRequestBean.
     * 
     * @param resNum
     */
    public void setResNum(java.lang.String resNum) {
        this.resNum = resNum;
    }


    /**
     * Gets the sellOrderField value for this SellDetailRequestBean.
     * 
     * @return sellOrderField
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellOrderField getSellOrderField() {
        return sellOrderField;
    }


    /**
     * Sets the sellOrderField value for this SellDetailRequestBean.
     * 
     * @param sellOrderField
     */
    public void setSellOrderField(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellOrderField sellOrderField) {
        this.sellOrderField = sellOrderField;
    }


    /**
     * Gets the timeMax value for this SellDetailRequestBean.
     * 
     * @return timeMax
     */
    public java.util.Calendar getTimeMax() {
        return timeMax;
    }


    /**
     * Sets the timeMax value for this SellDetailRequestBean.
     * 
     * @param timeMax
     */
    public void setTimeMax(java.util.Calendar timeMax) {
        this.timeMax = timeMax;
    }


    /**
     * Gets the timeMin value for this SellDetailRequestBean.
     * 
     * @return timeMin
     */
    public java.util.Calendar getTimeMin() {
        return timeMin;
    }


    /**
     * Sets the timeMin value for this SellDetailRequestBean.
     * 
     * @param timeMin
     */
    public void setTimeMin(java.util.Calendar timeMin) {
        this.timeMin = timeMin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellDetailRequestBean)) return false;
        SellDetailRequestBean other = (SellDetailRequestBean) obj;
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
            this.length == other.getLength() &&
            ((this.mainTransactionId==null && other.getMainTransactionId()==null) || 
             (this.mainTransactionId!=null &&
              this.mainTransactionId.equals(other.getMainTransactionId()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            this.offset == other.getOffset() &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            ((this.refNum==null && other.getRefNum()==null) || 
             (this.refNum!=null &&
              this.refNum.equals(other.getRefNum()))) &&
            ((this.resNum==null && other.getResNum()==null) || 
             (this.resNum!=null &&
              this.resNum.equals(other.getResNum()))) &&
            ((this.sellOrderField==null && other.getSellOrderField()==null) || 
             (this.sellOrderField!=null &&
              this.sellOrderField.equals(other.getSellOrderField()))) &&
            ((this.timeMax==null && other.getTimeMax()==null) || 
             (this.timeMax!=null &&
              this.timeMax.equals(other.getTimeMax()))) &&
            ((this.timeMin==null && other.getTimeMin()==null) || 
             (this.timeMin!=null &&
              this.timeMin.equals(other.getTimeMin())));
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
        _hashCode += new Long(getLength()).hashCode();
        if (getMainTransactionId() != null) {
            _hashCode += getMainTransactionId().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        _hashCode += new Long(getOffset()).hashCode();
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        if (getRefNum() != null) {
            _hashCode += getRefNum().hashCode();
        }
        if (getResNum() != null) {
            _hashCode += getResNum().hashCode();
        }
        if (getSellOrderField() != null) {
            _hashCode += getSellOrderField().hashCode();
        }
        if (getTimeMax() != null) {
            _hashCode += getTimeMax().hashCode();
        }
        if (getTimeMin() != null) {
            _hashCode += getTimeMin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellDetailRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellDetailRequestBean"));
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
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("sellOrderField");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sellOrderField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellOrderField"));
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
