/**
 * CurrencyDetailBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CurrencyDetailBean  implements java.io.Serializable {
    private java.math.BigDecimal buyPrice;

    private java.lang.String code;

    private java.lang.Boolean hasBuy;

    private java.lang.Boolean hasSell;

    private java.math.BigDecimal sellPrice;

    public CurrencyDetailBean() {
    }

    public CurrencyDetailBean(
           java.math.BigDecimal buyPrice,
           java.lang.String code,
           java.lang.Boolean hasBuy,
           java.lang.Boolean hasSell,
           java.math.BigDecimal sellPrice) {
           this.buyPrice = buyPrice;
           this.code = code;
           this.hasBuy = hasBuy;
           this.hasSell = hasSell;
           this.sellPrice = sellPrice;
    }


    /**
     * Gets the buyPrice value for this CurrencyDetailBean.
     * 
     * @return buyPrice
     */
    public java.math.BigDecimal getBuyPrice() {
        return buyPrice;
    }


    /**
     * Sets the buyPrice value for this CurrencyDetailBean.
     * 
     * @param buyPrice
     */
    public void setBuyPrice(java.math.BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }


    /**
     * Gets the code value for this CurrencyDetailBean.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this CurrencyDetailBean.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the hasBuy value for this CurrencyDetailBean.
     * 
     * @return hasBuy
     */
    public java.lang.Boolean getHasBuy() {
        return hasBuy;
    }


    /**
     * Sets the hasBuy value for this CurrencyDetailBean.
     * 
     * @param hasBuy
     */
    public void setHasBuy(java.lang.Boolean hasBuy) {
        this.hasBuy = hasBuy;
    }


    /**
     * Gets the hasSell value for this CurrencyDetailBean.
     * 
     * @return hasSell
     */
    public java.lang.Boolean getHasSell() {
        return hasSell;
    }


    /**
     * Sets the hasSell value for this CurrencyDetailBean.
     * 
     * @param hasSell
     */
    public void setHasSell(java.lang.Boolean hasSell) {
        this.hasSell = hasSell;
    }


    /**
     * Gets the sellPrice value for this CurrencyDetailBean.
     * 
     * @return sellPrice
     */
    public java.math.BigDecimal getSellPrice() {
        return sellPrice;
    }


    /**
     * Sets the sellPrice value for this CurrencyDetailBean.
     * 
     * @param sellPrice
     */
    public void setSellPrice(java.math.BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyDetailBean)) return false;
        CurrencyDetailBean other = (CurrencyDetailBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.buyPrice==null && other.getBuyPrice()==null) || 
             (this.buyPrice!=null &&
              this.buyPrice.equals(other.getBuyPrice()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.hasBuy==null && other.getHasBuy()==null) || 
             (this.hasBuy!=null &&
              this.hasBuy.equals(other.getHasBuy()))) &&
            ((this.hasSell==null && other.getHasSell()==null) || 
             (this.hasSell!=null &&
              this.hasSell.equals(other.getHasSell()))) &&
            ((this.sellPrice==null && other.getSellPrice()==null) || 
             (this.sellPrice!=null &&
              this.sellPrice.equals(other.getSellPrice())));
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
        if (getBuyPrice() != null) {
            _hashCode += getBuyPrice().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getHasBuy() != null) {
            _hashCode += getHasBuy().hashCode();
        }
        if (getHasSell() != null) {
            _hashCode += getHasSell().hashCode();
        }
        if (getSellPrice() != null) {
            _hashCode += getSellPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyDetailBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "currencyDetailBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buyPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasBuy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasBuy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasSell");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasSell"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sellPrice"));
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
