/**
 * ServiceInfoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ServiceInfoBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String customServiceName;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ServiceDestinationDetailBean serviceDestinationDetail;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ServiceResourceDetailBean serviceResourceDetail;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TicketServiceType ticketServiceType;

    public ServiceInfoBean() {
    }

    public ServiceInfoBean(
           java.math.BigDecimal amount,
           java.lang.String customServiceName,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ServiceDestinationDetailBean serviceDestinationDetail,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ServiceResourceDetailBean serviceResourceDetail,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TicketServiceType ticketServiceType) {
           this.amount = amount;
           this.customServiceName = customServiceName;
           this.serviceDestinationDetail = serviceDestinationDetail;
           this.serviceResourceDetail = serviceResourceDetail;
           this.ticketServiceType = ticketServiceType;
    }


    /**
     * Gets the amount value for this ServiceInfoBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ServiceInfoBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the customServiceName value for this ServiceInfoBean.
     * 
     * @return customServiceName
     */
    public java.lang.String getCustomServiceName() {
        return customServiceName;
    }


    /**
     * Sets the customServiceName value for this ServiceInfoBean.
     * 
     * @param customServiceName
     */
    public void setCustomServiceName(java.lang.String customServiceName) {
        this.customServiceName = customServiceName;
    }


    /**
     * Gets the serviceDestinationDetail value for this ServiceInfoBean.
     * 
     * @return serviceDestinationDetail
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ServiceDestinationDetailBean getServiceDestinationDetail() {
        return serviceDestinationDetail;
    }


    /**
     * Sets the serviceDestinationDetail value for this ServiceInfoBean.
     * 
     * @param serviceDestinationDetail
     */
    public void setServiceDestinationDetail(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ServiceDestinationDetailBean serviceDestinationDetail) {
        this.serviceDestinationDetail = serviceDestinationDetail;
    }


    /**
     * Gets the serviceResourceDetail value for this ServiceInfoBean.
     * 
     * @return serviceResourceDetail
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ServiceResourceDetailBean getServiceResourceDetail() {
        return serviceResourceDetail;
    }


    /**
     * Sets the serviceResourceDetail value for this ServiceInfoBean.
     * 
     * @param serviceResourceDetail
     */
    public void setServiceResourceDetail(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ServiceResourceDetailBean serviceResourceDetail) {
        this.serviceResourceDetail = serviceResourceDetail;
    }


    /**
     * Gets the ticketServiceType value for this ServiceInfoBean.
     * 
     * @return ticketServiceType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TicketServiceType getTicketServiceType() {
        return ticketServiceType;
    }


    /**
     * Sets the ticketServiceType value for this ServiceInfoBean.
     * 
     * @param ticketServiceType
     */
    public void setTicketServiceType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TicketServiceType ticketServiceType) {
        this.ticketServiceType = ticketServiceType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceInfoBean)) return false;
        ServiceInfoBean other = (ServiceInfoBean) obj;
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
            ((this.customServiceName==null && other.getCustomServiceName()==null) || 
             (this.customServiceName!=null &&
              this.customServiceName.equals(other.getCustomServiceName()))) &&
            ((this.serviceDestinationDetail==null && other.getServiceDestinationDetail()==null) || 
             (this.serviceDestinationDetail!=null &&
              this.serviceDestinationDetail.equals(other.getServiceDestinationDetail()))) &&
            ((this.serviceResourceDetail==null && other.getServiceResourceDetail()==null) || 
             (this.serviceResourceDetail!=null &&
              this.serviceResourceDetail.equals(other.getServiceResourceDetail()))) &&
            ((this.ticketServiceType==null && other.getTicketServiceType()==null) || 
             (this.ticketServiceType!=null &&
              this.ticketServiceType.equals(other.getTicketServiceType())));
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
        if (getCustomServiceName() != null) {
            _hashCode += getCustomServiceName().hashCode();
        }
        if (getServiceDestinationDetail() != null) {
            _hashCode += getServiceDestinationDetail().hashCode();
        }
        if (getServiceResourceDetail() != null) {
            _hashCode += getServiceResourceDetail().hashCode();
        }
        if (getTicketServiceType() != null) {
            _hashCode += getTicketServiceType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceInfoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "serviceInfoBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDestinationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceDestinationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "serviceDestinationDetailBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceResourceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceResourceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "serviceResourceDetailBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketServiceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticketServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "ticketServiceType"));
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
