/**
 * ERequestBaseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ERequestBaseBean  implements java.io.Serializable {
    private java.util.Calendar lastStatusChangeDate;

    private java.lang.String referenceNumber;

    private java.util.Calendar registerDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatus status;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusInfoBean statusInfoBean;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusResponse statusResponse;

    public ERequestBaseBean() {
    }

    public ERequestBaseBean(
           java.util.Calendar lastStatusChangeDate,
           java.lang.String referenceNumber,
           java.util.Calendar registerDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatus status,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusInfoBean statusInfoBean,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusResponse statusResponse) {
           this.lastStatusChangeDate = lastStatusChangeDate;
           this.referenceNumber = referenceNumber;
           this.registerDate = registerDate;
           this.status = status;
           this.statusInfoBean = statusInfoBean;
           this.statusResponse = statusResponse;
    }


    /**
     * Gets the lastStatusChangeDate value for this ERequestBaseBean.
     * 
     * @return lastStatusChangeDate
     */
    public java.util.Calendar getLastStatusChangeDate() {
        return lastStatusChangeDate;
    }


    /**
     * Sets the lastStatusChangeDate value for this ERequestBaseBean.
     * 
     * @param lastStatusChangeDate
     */
    public void setLastStatusChangeDate(java.util.Calendar lastStatusChangeDate) {
        this.lastStatusChangeDate = lastStatusChangeDate;
    }


    /**
     * Gets the referenceNumber value for this ERequestBaseBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this ERequestBaseBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the registerDate value for this ERequestBaseBean.
     * 
     * @return registerDate
     */
    public java.util.Calendar getRegisterDate() {
        return registerDate;
    }


    /**
     * Sets the registerDate value for this ERequestBaseBean.
     * 
     * @param registerDate
     */
    public void setRegisterDate(java.util.Calendar registerDate) {
        this.registerDate = registerDate;
    }


    /**
     * Gets the status value for this ERequestBaseBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ERequestBaseBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatus status) {
        this.status = status;
    }


    /**
     * Gets the statusInfoBean value for this ERequestBaseBean.
     * 
     * @return statusInfoBean
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusInfoBean getStatusInfoBean() {
        return statusInfoBean;
    }


    /**
     * Sets the statusInfoBean value for this ERequestBaseBean.
     * 
     * @param statusInfoBean
     */
    public void setStatusInfoBean(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusInfoBean statusInfoBean) {
        this.statusInfoBean = statusInfoBean;
    }


    /**
     * Gets the statusResponse value for this ERequestBaseBean.
     * 
     * @return statusResponse
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusResponse getStatusResponse() {
        return statusResponse;
    }


    /**
     * Sets the statusResponse value for this ERequestBaseBean.
     * 
     * @param statusResponse
     */
    public void setStatusResponse(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusResponse statusResponse) {
        this.statusResponse = statusResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERequestBaseBean)) return false;
        ERequestBaseBean other = (ERequestBaseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lastStatusChangeDate==null && other.getLastStatusChangeDate()==null) || 
             (this.lastStatusChangeDate!=null &&
              this.lastStatusChangeDate.equals(other.getLastStatusChangeDate()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.registerDate==null && other.getRegisterDate()==null) || 
             (this.registerDate!=null &&
              this.registerDate.equals(other.getRegisterDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusInfoBean==null && other.getStatusInfoBean()==null) || 
             (this.statusInfoBean!=null &&
              this.statusInfoBean.equals(other.getStatusInfoBean()))) &&
            ((this.statusResponse==null && other.getStatusResponse()==null) || 
             (this.statusResponse!=null &&
              this.statusResponse.equals(other.getStatusResponse())));
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
        if (getLastStatusChangeDate() != null) {
            _hashCode += getLastStatusChangeDate().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getRegisterDate() != null) {
            _hashCode += getRegisterDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusInfoBean() != null) {
            _hashCode += getStatusInfoBean().hashCode();
        }
        if (getStatusResponse() != null) {
            _hashCode += getStatusResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERequestBaseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestBaseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastStatusChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastStatusChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInfoBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusInfoBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestStatusInfoBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestStatusResponse"));
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
