/**
 * SupplyBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SupplyBean  implements java.io.Serializable {
    private java.math.BigDecimal availablePrice;

    private java.math.BigDecimal price;

    public SupplyBean() {
    }

    public SupplyBean(
           java.math.BigDecimal availablePrice,
           java.math.BigDecimal price) {
           this.availablePrice = availablePrice;
           this.price = price;
    }


    /**
     * Gets the availablePrice value for this SupplyBean.
     * 
     * @return availablePrice
     */
    public java.math.BigDecimal getAvailablePrice() {
        return availablePrice;
    }


    /**
     * Sets the availablePrice value for this SupplyBean.
     * 
     * @param availablePrice
     */
    public void setAvailablePrice(java.math.BigDecimal availablePrice) {
        this.availablePrice = availablePrice;
    }


    /**
     * Gets the price value for this SupplyBean.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this SupplyBean.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupplyBean)) return false;
        SupplyBean other = (SupplyBean) obj;
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
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupplyBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "supplyBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availablePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availablePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
