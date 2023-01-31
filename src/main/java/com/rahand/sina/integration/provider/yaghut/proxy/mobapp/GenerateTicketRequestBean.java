/**
 * GenerateTicketRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class GenerateTicketRequestBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenerateTicketRequestBeanAdditionalInformationsEntry[] additionalInformations;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TicketMediaType mediaType;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ServiceInfoBean serviceInfoBean;

    public GenerateTicketRequestBean() {
    }

    public GenerateTicketRequestBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenerateTicketRequestBeanAdditionalInformationsEntry[] additionalInformations,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TicketMediaType mediaType,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ServiceInfoBean serviceInfoBean) {
           this.additionalInformations = additionalInformations;
           this.mediaType = mediaType;
           this.serviceInfoBean = serviceInfoBean;
    }


    /**
     * Gets the additionalInformations value for this GenerateTicketRequestBean.
     * 
     * @return additionalInformations
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenerateTicketRequestBeanAdditionalInformationsEntry[] getAdditionalInformations() {
        return additionalInformations;
    }


    /**
     * Sets the additionalInformations value for this GenerateTicketRequestBean.
     * 
     * @param additionalInformations
     */
    public void setAdditionalInformations(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenerateTicketRequestBeanAdditionalInformationsEntry[] additionalInformations) {
        this.additionalInformations = additionalInformations;
    }


    /**
     * Gets the mediaType value for this GenerateTicketRequestBean.
     * 
     * @return mediaType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TicketMediaType getMediaType() {
        return mediaType;
    }


    /**
     * Sets the mediaType value for this GenerateTicketRequestBean.
     * 
     * @param mediaType
     */
    public void setMediaType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TicketMediaType mediaType) {
        this.mediaType = mediaType;
    }


    /**
     * Gets the serviceInfoBean value for this GenerateTicketRequestBean.
     * 
     * @return serviceInfoBean
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ServiceInfoBean getServiceInfoBean() {
        return serviceInfoBean;
    }


    /**
     * Sets the serviceInfoBean value for this GenerateTicketRequestBean.
     * 
     * @param serviceInfoBean
     */
    public void setServiceInfoBean(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ServiceInfoBean serviceInfoBean) {
        this.serviceInfoBean = serviceInfoBean;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateTicketRequestBean)) return false;
        GenerateTicketRequestBean other = (GenerateTicketRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalInformations==null && other.getAdditionalInformations()==null) || 
             (this.additionalInformations!=null &&
              java.util.Arrays.equals(this.additionalInformations, other.getAdditionalInformations()))) &&
            ((this.mediaType==null && other.getMediaType()==null) || 
             (this.mediaType!=null &&
              this.mediaType.equals(other.getMediaType()))) &&
            ((this.serviceInfoBean==null && other.getServiceInfoBean()==null) || 
             (this.serviceInfoBean!=null &&
              this.serviceInfoBean.equals(other.getServiceInfoBean())));
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
        if (getAdditionalInformations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInformations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalInformations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMediaType() != null) {
            _hashCode += getMediaType().hashCode();
        }
        if (getServiceInfoBean() != null) {
            _hashCode += getServiceInfoBean().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerateTicketRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "generateTicketRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInformations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalInformations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", ">>generateTicketRequestBean>additionalInformations>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "ticketMediaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceInfoBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceInfoBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "serviceInfoBean"));
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
