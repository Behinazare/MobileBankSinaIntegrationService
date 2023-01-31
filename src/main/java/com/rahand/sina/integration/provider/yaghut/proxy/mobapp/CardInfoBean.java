/**
 * CardInfoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardInfoBean  implements java.io.Serializable {
    private java.lang.String cvv2;

    private java.lang.String expireDate;

    private java.lang.String pan;

    private java.lang.String pin2;

    public CardInfoBean() {
    }

    public CardInfoBean(
           java.lang.String cvv2,
           java.lang.String expireDate,
           java.lang.String pan,
           java.lang.String pin2) {
           this.cvv2 = cvv2;
           this.expireDate = expireDate;
           this.pan = pan;
           this.pin2 = pin2;
    }


    /**
     * Gets the cvv2 value for this CardInfoBean.
     * 
     * @return cvv2
     */
    public java.lang.String getCvv2() {
        return cvv2;
    }


    /**
     * Sets the cvv2 value for this CardInfoBean.
     * 
     * @param cvv2
     */
    public void setCvv2(java.lang.String cvv2) {
        this.cvv2 = cvv2;
    }


    /**
     * Gets the expireDate value for this CardInfoBean.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this CardInfoBean.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the pan value for this CardInfoBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CardInfoBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the pin2 value for this CardInfoBean.
     * 
     * @return pin2
     */
    public java.lang.String getPin2() {
        return pin2;
    }


    /**
     * Sets the pin2 value for this CardInfoBean.
     * 
     * @param pin2
     */
    public void setPin2(java.lang.String pin2) {
        this.pin2 = pin2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardInfoBean)) return false;
        CardInfoBean other = (CardInfoBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cvv2==null && other.getCvv2()==null) || 
             (this.cvv2!=null &&
              this.cvv2.equals(other.getCvv2()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.pin2==null && other.getPin2()==null) || 
             (this.pin2!=null &&
              this.pin2.equals(other.getPin2())));
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
        if (getCvv2() != null) {
            _hashCode += getCvv2().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getPin2() != null) {
            _hashCode += getPin2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardInfoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardInfoBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvv2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvv2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pin2"));
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
