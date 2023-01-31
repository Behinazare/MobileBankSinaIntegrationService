/**
 * CardSecondPinTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardSecondPinTypeBean  implements java.io.Serializable {
    private java.lang.Boolean limitedStaticPinActivated;

    private java.lang.Boolean otpActivated;

    private java.lang.Boolean staticPinActivated;

    public CardSecondPinTypeBean() {
    }

    public CardSecondPinTypeBean(
           java.lang.Boolean limitedStaticPinActivated,
           java.lang.Boolean otpActivated,
           java.lang.Boolean staticPinActivated) {
           this.limitedStaticPinActivated = limitedStaticPinActivated;
           this.otpActivated = otpActivated;
           this.staticPinActivated = staticPinActivated;
    }


    /**
     * Gets the limitedStaticPinActivated value for this CardSecondPinTypeBean.
     * 
     * @return limitedStaticPinActivated
     */
    public java.lang.Boolean getLimitedStaticPinActivated() {
        return limitedStaticPinActivated;
    }


    /**
     * Sets the limitedStaticPinActivated value for this CardSecondPinTypeBean.
     * 
     * @param limitedStaticPinActivated
     */
    public void setLimitedStaticPinActivated(java.lang.Boolean limitedStaticPinActivated) {
        this.limitedStaticPinActivated = limitedStaticPinActivated;
    }


    /**
     * Gets the otpActivated value for this CardSecondPinTypeBean.
     * 
     * @return otpActivated
     */
    public java.lang.Boolean getOtpActivated() {
        return otpActivated;
    }


    /**
     * Sets the otpActivated value for this CardSecondPinTypeBean.
     * 
     * @param otpActivated
     */
    public void setOtpActivated(java.lang.Boolean otpActivated) {
        this.otpActivated = otpActivated;
    }


    /**
     * Gets the staticPinActivated value for this CardSecondPinTypeBean.
     * 
     * @return staticPinActivated
     */
    public java.lang.Boolean getStaticPinActivated() {
        return staticPinActivated;
    }


    /**
     * Sets the staticPinActivated value for this CardSecondPinTypeBean.
     * 
     * @param staticPinActivated
     */
    public void setStaticPinActivated(java.lang.Boolean staticPinActivated) {
        this.staticPinActivated = staticPinActivated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardSecondPinTypeBean)) return false;
        CardSecondPinTypeBean other = (CardSecondPinTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limitedStaticPinActivated==null && other.getLimitedStaticPinActivated()==null) || 
             (this.limitedStaticPinActivated!=null &&
              this.limitedStaticPinActivated.equals(other.getLimitedStaticPinActivated()))) &&
            ((this.otpActivated==null && other.getOtpActivated()==null) || 
             (this.otpActivated!=null &&
              this.otpActivated.equals(other.getOtpActivated()))) &&
            ((this.staticPinActivated==null && other.getStaticPinActivated()==null) || 
             (this.staticPinActivated!=null &&
              this.staticPinActivated.equals(other.getStaticPinActivated())));
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
        if (getLimitedStaticPinActivated() != null) {
            _hashCode += getLimitedStaticPinActivated().hashCode();
        }
        if (getOtpActivated() != null) {
            _hashCode += getOtpActivated().hashCode();
        }
        if (getStaticPinActivated() != null) {
            _hashCode += getStaticPinActivated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardSecondPinTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardSecondPinTypeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitedStaticPinActivated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitedStaticPinActivated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otpActivated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otpActivated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticPinActivated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staticPinActivated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
