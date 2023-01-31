/**
 * BranchBalanceInfoDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BranchBalanceInfoDetail  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String currency;

    private java.lang.String valuableItem;

    private java.lang.String valuableItemType;

    private long valuableItemTypeCount;

    public BranchBalanceInfoDetail() {
    }

    public BranchBalanceInfoDetail(
           java.math.BigDecimal amount,
           java.lang.String currency,
           java.lang.String valuableItem,
           java.lang.String valuableItemType,
           long valuableItemTypeCount) {
           this.amount = amount;
           this.currency = currency;
           this.valuableItem = valuableItem;
           this.valuableItemType = valuableItemType;
           this.valuableItemTypeCount = valuableItemTypeCount;
    }


    /**
     * Gets the amount value for this BranchBalanceInfoDetail.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BranchBalanceInfoDetail.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this BranchBalanceInfoDetail.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BranchBalanceInfoDetail.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the valuableItem value for this BranchBalanceInfoDetail.
     * 
     * @return valuableItem
     */
    public java.lang.String getValuableItem() {
        return valuableItem;
    }


    /**
     * Sets the valuableItem value for this BranchBalanceInfoDetail.
     * 
     * @param valuableItem
     */
    public void setValuableItem(java.lang.String valuableItem) {
        this.valuableItem = valuableItem;
    }


    /**
     * Gets the valuableItemType value for this BranchBalanceInfoDetail.
     * 
     * @return valuableItemType
     */
    public java.lang.String getValuableItemType() {
        return valuableItemType;
    }


    /**
     * Sets the valuableItemType value for this BranchBalanceInfoDetail.
     * 
     * @param valuableItemType
     */
    public void setValuableItemType(java.lang.String valuableItemType) {
        this.valuableItemType = valuableItemType;
    }


    /**
     * Gets the valuableItemTypeCount value for this BranchBalanceInfoDetail.
     * 
     * @return valuableItemTypeCount
     */
    public long getValuableItemTypeCount() {
        return valuableItemTypeCount;
    }


    /**
     * Sets the valuableItemTypeCount value for this BranchBalanceInfoDetail.
     * 
     * @param valuableItemTypeCount
     */
    public void setValuableItemTypeCount(long valuableItemTypeCount) {
        this.valuableItemTypeCount = valuableItemTypeCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BranchBalanceInfoDetail)) return false;
        BranchBalanceInfoDetail other = (BranchBalanceInfoDetail) obj;
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
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.valuableItem==null && other.getValuableItem()==null) || 
             (this.valuableItem!=null &&
              this.valuableItem.equals(other.getValuableItem()))) &&
            ((this.valuableItemType==null && other.getValuableItemType()==null) || 
             (this.valuableItemType!=null &&
              this.valuableItemType.equals(other.getValuableItemType()))) &&
            this.valuableItemTypeCount == other.getValuableItemTypeCount();
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getValuableItem() != null) {
            _hashCode += getValuableItem().hashCode();
        }
        if (getValuableItemType() != null) {
            _hashCode += getValuableItemType().hashCode();
        }
        _hashCode += new Long(getValuableItemTypeCount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BranchBalanceInfoDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "branchBalanceInfoDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuableItemTypeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valuableItemTypeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
