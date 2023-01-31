/**
 * BranchBalanceSearchBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BranchBalanceSearchBean  implements java.io.Serializable {
    private java.lang.String branchCode;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchOrderType branchOrder;

    private java.lang.String cityCode;

    private java.lang.String currency;

    private java.math.BigDecimal fromAmount;

    private java.lang.Long fromValuableItemTypeCount;

    private long length;

    private long offset;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS orderType;

    private java.math.BigDecimal toAmount;

    private java.lang.Long toValuableItemTypeCount;

    private java.lang.String valuableItem;

    private java.lang.String valuableItemType;

    public BranchBalanceSearchBean() {
    }

    public BranchBalanceSearchBean(
           java.lang.String branchCode,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchOrderType branchOrder,
           java.lang.String cityCode,
           java.lang.String currency,
           java.math.BigDecimal fromAmount,
           java.lang.Long fromValuableItemTypeCount,
           long length,
           long offset,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS orderType,
           java.math.BigDecimal toAmount,
           java.lang.Long toValuableItemTypeCount,
           java.lang.String valuableItem,
           java.lang.String valuableItemType) {
           this.branchCode = branchCode;
           this.branchOrder = branchOrder;
           this.cityCode = cityCode;
           this.currency = currency;
           this.fromAmount = fromAmount;
           this.fromValuableItemTypeCount = fromValuableItemTypeCount;
           this.length = length;
           this.offset = offset;
           this.orderType = orderType;
           this.toAmount = toAmount;
           this.toValuableItemTypeCount = toValuableItemTypeCount;
           this.valuableItem = valuableItem;
           this.valuableItemType = valuableItemType;
    }


    /**
     * Gets the branchCode value for this BranchBalanceSearchBean.
     * 
     * @return branchCode
     */
    public java.lang.String getBranchCode() {
        return branchCode;
    }


    /**
     * Sets the branchCode value for this BranchBalanceSearchBean.
     * 
     * @param branchCode
     */
    public void setBranchCode(java.lang.String branchCode) {
        this.branchCode = branchCode;
    }


    /**
     * Gets the branchOrder value for this BranchBalanceSearchBean.
     * 
     * @return branchOrder
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchOrderType getBranchOrder() {
        return branchOrder;
    }


    /**
     * Sets the branchOrder value for this BranchBalanceSearchBean.
     * 
     * @param branchOrder
     */
    public void setBranchOrder(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchOrderType branchOrder) {
        this.branchOrder = branchOrder;
    }


    /**
     * Gets the cityCode value for this BranchBalanceSearchBean.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this BranchBalanceSearchBean.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }


    /**
     * Gets the currency value for this BranchBalanceSearchBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BranchBalanceSearchBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the fromAmount value for this BranchBalanceSearchBean.
     * 
     * @return fromAmount
     */
    public java.math.BigDecimal getFromAmount() {
        return fromAmount;
    }


    /**
     * Sets the fromAmount value for this BranchBalanceSearchBean.
     * 
     * @param fromAmount
     */
    public void setFromAmount(java.math.BigDecimal fromAmount) {
        this.fromAmount = fromAmount;
    }


    /**
     * Gets the fromValuableItemTypeCount value for this BranchBalanceSearchBean.
     * 
     * @return fromValuableItemTypeCount
     */
    public java.lang.Long getFromValuableItemTypeCount() {
        return fromValuableItemTypeCount;
    }


    /**
     * Sets the fromValuableItemTypeCount value for this BranchBalanceSearchBean.
     * 
     * @param fromValuableItemTypeCount
     */
    public void setFromValuableItemTypeCount(java.lang.Long fromValuableItemTypeCount) {
        this.fromValuableItemTypeCount = fromValuableItemTypeCount;
    }


    /**
     * Gets the length value for this BranchBalanceSearchBean.
     * 
     * @return length
     */
    public long getLength() {
        return length;
    }


    /**
     * Sets the length value for this BranchBalanceSearchBean.
     * 
     * @param length
     */
    public void setLength(long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this BranchBalanceSearchBean.
     * 
     * @return offset
     */
    public long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this BranchBalanceSearchBean.
     * 
     * @param offset
     */
    public void setOffset(long offset) {
        this.offset = offset;
    }


    /**
     * Gets the orderType value for this BranchBalanceSearchBean.
     * 
     * @return orderType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this BranchBalanceSearchBean.
     * 
     * @param orderType
     */
    public void setOrderType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the toAmount value for this BranchBalanceSearchBean.
     * 
     * @return toAmount
     */
    public java.math.BigDecimal getToAmount() {
        return toAmount;
    }


    /**
     * Sets the toAmount value for this BranchBalanceSearchBean.
     * 
     * @param toAmount
     */
    public void setToAmount(java.math.BigDecimal toAmount) {
        this.toAmount = toAmount;
    }


    /**
     * Gets the toValuableItemTypeCount value for this BranchBalanceSearchBean.
     * 
     * @return toValuableItemTypeCount
     */
    public java.lang.Long getToValuableItemTypeCount() {
        return toValuableItemTypeCount;
    }


    /**
     * Sets the toValuableItemTypeCount value for this BranchBalanceSearchBean.
     * 
     * @param toValuableItemTypeCount
     */
    public void setToValuableItemTypeCount(java.lang.Long toValuableItemTypeCount) {
        this.toValuableItemTypeCount = toValuableItemTypeCount;
    }


    /**
     * Gets the valuableItem value for this BranchBalanceSearchBean.
     * 
     * @return valuableItem
     */
    public java.lang.String getValuableItem() {
        return valuableItem;
    }


    /**
     * Sets the valuableItem value for this BranchBalanceSearchBean.
     * 
     * @param valuableItem
     */
    public void setValuableItem(java.lang.String valuableItem) {
        this.valuableItem = valuableItem;
    }


    /**
     * Gets the valuableItemType value for this BranchBalanceSearchBean.
     * 
     * @return valuableItemType
     */
    public java.lang.String getValuableItemType() {
        return valuableItemType;
    }


    /**
     * Sets the valuableItemType value for this BranchBalanceSearchBean.
     * 
     * @param valuableItemType
     */
    public void setValuableItemType(java.lang.String valuableItemType) {
        this.valuableItemType = valuableItemType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BranchBalanceSearchBean)) return false;
        BranchBalanceSearchBean other = (BranchBalanceSearchBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.branchCode==null && other.getBranchCode()==null) || 
             (this.branchCode!=null &&
              this.branchCode.equals(other.getBranchCode()))) &&
            ((this.branchOrder==null && other.getBranchOrder()==null) || 
             (this.branchOrder!=null &&
              this.branchOrder.equals(other.getBranchOrder()))) &&
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.fromAmount==null && other.getFromAmount()==null) || 
             (this.fromAmount!=null &&
              this.fromAmount.equals(other.getFromAmount()))) &&
            ((this.fromValuableItemTypeCount==null && other.getFromValuableItemTypeCount()==null) || 
             (this.fromValuableItemTypeCount!=null &&
              this.fromValuableItemTypeCount.equals(other.getFromValuableItemTypeCount()))) &&
            this.length == other.getLength() &&
            this.offset == other.getOffset() &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            ((this.toAmount==null && other.getToAmount()==null) || 
             (this.toAmount!=null &&
              this.toAmount.equals(other.getToAmount()))) &&
            ((this.toValuableItemTypeCount==null && other.getToValuableItemTypeCount()==null) || 
             (this.toValuableItemTypeCount!=null &&
              this.toValuableItemTypeCount.equals(other.getToValuableItemTypeCount()))) &&
            ((this.valuableItem==null && other.getValuableItem()==null) || 
             (this.valuableItem!=null &&
              this.valuableItem.equals(other.getValuableItem()))) &&
            ((this.valuableItemType==null && other.getValuableItemType()==null) || 
             (this.valuableItemType!=null &&
              this.valuableItemType.equals(other.getValuableItemType())));
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
        if (getBranchCode() != null) {
            _hashCode += getBranchCode().hashCode();
        }
        if (getBranchOrder() != null) {
            _hashCode += getBranchOrder().hashCode();
        }
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getFromAmount() != null) {
            _hashCode += getFromAmount().hashCode();
        }
        if (getFromValuableItemTypeCount() != null) {
            _hashCode += getFromValuableItemTypeCount().hashCode();
        }
        _hashCode += new Long(getLength()).hashCode();
        _hashCode += new Long(getOffset()).hashCode();
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        if (getToAmount() != null) {
            _hashCode += getToAmount().hashCode();
        }
        if (getToValuableItemTypeCount() != null) {
            _hashCode += getToValuableItemTypeCount().hashCode();
        }
        if (getValuableItem() != null) {
            _hashCode += getValuableItem().hashCode();
        }
        if (getValuableItemType() != null) {
            _hashCode += getValuableItemType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BranchBalanceSearchBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "branchBalanceSearchBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "branchOrderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityCode"));
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
        elemField.setFieldName("fromAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromValuableItemTypeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromValuableItemTypeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("orderType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "orderDirectionWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toValuableItemTypeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toValuableItemTypeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuableItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valuableItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuableItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valuableItemType"));
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
