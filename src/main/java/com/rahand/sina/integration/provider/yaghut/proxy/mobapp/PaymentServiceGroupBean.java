/**
 * PaymentServiceGroupBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PaymentServiceGroupBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceGroupBean[] childGroups;

    private java.lang.String foreignTitle;

    private java.lang.String id;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceBean[] paymentServices;

    private java.lang.String title;

    public PaymentServiceGroupBean() {
    }

    public PaymentServiceGroupBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceGroupBean[] childGroups,
           java.lang.String foreignTitle,
           java.lang.String id,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceBean[] paymentServices,
           java.lang.String title) {
           this.childGroups = childGroups;
           this.foreignTitle = foreignTitle;
           this.id = id;
           this.paymentServices = paymentServices;
           this.title = title;
    }


    /**
     * Gets the childGroups value for this PaymentServiceGroupBean.
     * 
     * @return childGroups
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceGroupBean[] getChildGroups() {
        return childGroups;
    }


    /**
     * Sets the childGroups value for this PaymentServiceGroupBean.
     * 
     * @param childGroups
     */
    public void setChildGroups(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceGroupBean[] childGroups) {
        this.childGroups = childGroups;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceGroupBean getChildGroups(int i) {
        return this.childGroups[i];
    }

    public void setChildGroups(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceGroupBean _value) {
        this.childGroups[i] = _value;
    }


    /**
     * Gets the foreignTitle value for this PaymentServiceGroupBean.
     * 
     * @return foreignTitle
     */
    public java.lang.String getForeignTitle() {
        return foreignTitle;
    }


    /**
     * Sets the foreignTitle value for this PaymentServiceGroupBean.
     * 
     * @param foreignTitle
     */
    public void setForeignTitle(java.lang.String foreignTitle) {
        this.foreignTitle = foreignTitle;
    }


    /**
     * Gets the id value for this PaymentServiceGroupBean.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PaymentServiceGroupBean.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the paymentServices value for this PaymentServiceGroupBean.
     * 
     * @return paymentServices
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceBean[] getPaymentServices() {
        return paymentServices;
    }


    /**
     * Sets the paymentServices value for this PaymentServiceGroupBean.
     * 
     * @param paymentServices
     */
    public void setPaymentServices(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceBean[] paymentServices) {
        this.paymentServices = paymentServices;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceBean getPaymentServices(int i) {
        return this.paymentServices[i];
    }

    public void setPaymentServices(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceBean _value) {
        this.paymentServices[i] = _value;
    }


    /**
     * Gets the title value for this PaymentServiceGroupBean.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PaymentServiceGroupBean.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentServiceGroupBean)) return false;
        PaymentServiceGroupBean other = (PaymentServiceGroupBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.childGroups==null && other.getChildGroups()==null) || 
             (this.childGroups!=null &&
              java.util.Arrays.equals(this.childGroups, other.getChildGroups()))) &&
            ((this.foreignTitle==null && other.getForeignTitle()==null) || 
             (this.foreignTitle!=null &&
              this.foreignTitle.equals(other.getForeignTitle()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.paymentServices==null && other.getPaymentServices()==null) || 
             (this.paymentServices!=null &&
              java.util.Arrays.equals(this.paymentServices, other.getPaymentServices()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        if (getChildGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getForeignTitle() != null) {
            _hashCode += getForeignTitle().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPaymentServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentServiceGroupBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentServiceGroupBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "childGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentServiceGroupBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentServices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentServiceBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
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
