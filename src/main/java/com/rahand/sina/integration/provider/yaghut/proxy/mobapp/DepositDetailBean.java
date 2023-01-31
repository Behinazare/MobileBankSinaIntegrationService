/**
 * DepositDetailBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositDetailBean  implements java.io.Serializable {
    private java.math.BigDecimal availablePrice;

    private java.math.BigDecimal blockedAmount;

    private java.lang.String currency;

    private java.lang.String depositNumber;

    private java.util.Calendar expireDate;

    private java.util.Calendar inaugurationDate;

    private java.lang.String nickname;

    private java.math.BigDecimal price;

    public DepositDetailBean() {
    }

    public DepositDetailBean(
           java.math.BigDecimal availablePrice,
           java.math.BigDecimal blockedAmount,
           java.lang.String currency,
           java.lang.String depositNumber,
           java.util.Calendar expireDate,
           java.util.Calendar inaugurationDate,
           java.lang.String nickname,
           java.math.BigDecimal price) {
           this.availablePrice = availablePrice;
           this.blockedAmount = blockedAmount;
           this.currency = currency;
           this.depositNumber = depositNumber;
           this.expireDate = expireDate;
           this.inaugurationDate = inaugurationDate;
           this.nickname = nickname;
           this.price = price;
    }


    /**
     * Gets the availablePrice value for this DepositDetailBean.
     * 
     * @return availablePrice
     */
    public java.math.BigDecimal getAvailablePrice() {
        return availablePrice;
    }


    /**
     * Sets the availablePrice value for this DepositDetailBean.
     * 
     * @param availablePrice
     */
    public void setAvailablePrice(java.math.BigDecimal availablePrice) {
        this.availablePrice = availablePrice;
    }


    /**
     * Gets the blockedAmount value for this DepositDetailBean.
     * 
     * @return blockedAmount
     */
    public java.math.BigDecimal getBlockedAmount() {
        return blockedAmount;
    }


    /**
     * Sets the blockedAmount value for this DepositDetailBean.
     * 
     * @param blockedAmount
     */
    public void setBlockedAmount(java.math.BigDecimal blockedAmount) {
        this.blockedAmount = blockedAmount;
    }


    /**
     * Gets the currency value for this DepositDetailBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this DepositDetailBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the depositNumber value for this DepositDetailBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this DepositDetailBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the expireDate value for this DepositDetailBean.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this DepositDetailBean.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the inaugurationDate value for this DepositDetailBean.
     * 
     * @return inaugurationDate
     */
    public java.util.Calendar getInaugurationDate() {
        return inaugurationDate;
    }


    /**
     * Sets the inaugurationDate value for this DepositDetailBean.
     * 
     * @param inaugurationDate
     */
    public void setInaugurationDate(java.util.Calendar inaugurationDate) {
        this.inaugurationDate = inaugurationDate;
    }


    /**
     * Gets the nickname value for this DepositDetailBean.
     * 
     * @return nickname
     */
    public java.lang.String getNickname() {
        return nickname;
    }


    /**
     * Sets the nickname value for this DepositDetailBean.
     * 
     * @param nickname
     */
    public void setNickname(java.lang.String nickname) {
        this.nickname = nickname;
    }


    /**
     * Gets the price value for this DepositDetailBean.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this DepositDetailBean.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositDetailBean)) return false;
        DepositDetailBean other = (DepositDetailBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availablePrice==null && other.getAvailablePrice()==null) || 
             (this.availablePrice!=null &&
              this.availablePrice.equals(other.getAvailablePrice()))) &&
            ((this.blockedAmount==null && other.getBlockedAmount()==null) || 
             (this.blockedAmount!=null &&
              this.blockedAmount.equals(other.getBlockedAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.inaugurationDate==null && other.getInaugurationDate()==null) || 
             (this.inaugurationDate!=null &&
              this.inaugurationDate.equals(other.getInaugurationDate()))) &&
            ((this.nickname==null && other.getNickname()==null) || 
             (this.nickname!=null &&
              this.nickname.equals(other.getNickname()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice())));
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
        if (getAvailablePrice() != null) {
            _hashCode += getAvailablePrice().hashCode();
        }
        if (getBlockedAmount() != null) {
            _hashCode += getBlockedAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getInaugurationDate() != null) {
            _hashCode += getInaugurationDate().hashCode();
        }
        if (getNickname() != null) {
            _hashCode += getNickname().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepositDetailBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositDetailBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availablePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availablePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockedAmount"));
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
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inaugurationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inaugurationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
