/**
 * SignRequestDetailBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SignRequestDetailBean  implements java.io.Serializable {
    private java.util.Calendar requestDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RequestTypeWS requestType;

    private java.lang.String requesterForeignName;

    private java.lang.String requesterName;

    private java.lang.String serviceForeignTitle;

    private java.lang.Long serviceId;

    private java.lang.String serviceTitle;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignerBean[] signers;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignRequestStatusWS status;

    private java.lang.String trackingNumber;

    public SignRequestDetailBean() {
    }

    public SignRequestDetailBean(
           java.util.Calendar requestDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RequestTypeWS requestType,
           java.lang.String requesterForeignName,
           java.lang.String requesterName,
           java.lang.String serviceForeignTitle,
           java.lang.Long serviceId,
           java.lang.String serviceTitle,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignerBean[] signers,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignRequestStatusWS status,
           java.lang.String trackingNumber) {
           this.requestDate = requestDate;
           this.requestType = requestType;
           this.requesterForeignName = requesterForeignName;
           this.requesterName = requesterName;
           this.serviceForeignTitle = serviceForeignTitle;
           this.serviceId = serviceId;
           this.serviceTitle = serviceTitle;
           this.signers = signers;
           this.status = status;
           this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the requestDate value for this SignRequestDetailBean.
     * 
     * @return requestDate
     */
    public java.util.Calendar getRequestDate() {
        return requestDate;
    }


    /**
     * Sets the requestDate value for this SignRequestDetailBean.
     * 
     * @param requestDate
     */
    public void setRequestDate(java.util.Calendar requestDate) {
        this.requestDate = requestDate;
    }


    /**
     * Gets the requestType value for this SignRequestDetailBean.
     * 
     * @return requestType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RequestTypeWS getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this SignRequestDetailBean.
     * 
     * @param requestType
     */
    public void setRequestType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RequestTypeWS requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the requesterForeignName value for this SignRequestDetailBean.
     * 
     * @return requesterForeignName
     */
    public java.lang.String getRequesterForeignName() {
        return requesterForeignName;
    }


    /**
     * Sets the requesterForeignName value for this SignRequestDetailBean.
     * 
     * @param requesterForeignName
     */
    public void setRequesterForeignName(java.lang.String requesterForeignName) {
        this.requesterForeignName = requesterForeignName;
    }


    /**
     * Gets the requesterName value for this SignRequestDetailBean.
     * 
     * @return requesterName
     */
    public java.lang.String getRequesterName() {
        return requesterName;
    }


    /**
     * Sets the requesterName value for this SignRequestDetailBean.
     * 
     * @param requesterName
     */
    public void setRequesterName(java.lang.String requesterName) {
        this.requesterName = requesterName;
    }


    /**
     * Gets the serviceForeignTitle value for this SignRequestDetailBean.
     * 
     * @return serviceForeignTitle
     */
    public java.lang.String getServiceForeignTitle() {
        return serviceForeignTitle;
    }


    /**
     * Sets the serviceForeignTitle value for this SignRequestDetailBean.
     * 
     * @param serviceForeignTitle
     */
    public void setServiceForeignTitle(java.lang.String serviceForeignTitle) {
        this.serviceForeignTitle = serviceForeignTitle;
    }


    /**
     * Gets the serviceId value for this SignRequestDetailBean.
     * 
     * @return serviceId
     */
    public java.lang.Long getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this SignRequestDetailBean.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.Long serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceTitle value for this SignRequestDetailBean.
     * 
     * @return serviceTitle
     */
    public java.lang.String getServiceTitle() {
        return serviceTitle;
    }


    /**
     * Sets the serviceTitle value for this SignRequestDetailBean.
     * 
     * @param serviceTitle
     */
    public void setServiceTitle(java.lang.String serviceTitle) {
        this.serviceTitle = serviceTitle;
    }


    /**
     * Gets the signers value for this SignRequestDetailBean.
     * 
     * @return signers
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignerBean[] getSigners() {
        return signers;
    }


    /**
     * Sets the signers value for this SignRequestDetailBean.
     * 
     * @param signers
     */
    public void setSigners(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignerBean[] signers) {
        this.signers = signers;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignerBean getSigners(int i) {
        return this.signers[i];
    }

    public void setSigners(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignerBean _value) {
        this.signers[i] = _value;
    }


    /**
     * Gets the status value for this SignRequestDetailBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignRequestStatusWS getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SignRequestDetailBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignRequestStatusWS status) {
        this.status = status;
    }


    /**
     * Gets the trackingNumber value for this SignRequestDetailBean.
     * 
     * @return trackingNumber
     */
    public java.lang.String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this SignRequestDetailBean.
     * 
     * @param trackingNumber
     */
    public void setTrackingNumber(java.lang.String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignRequestDetailBean)) return false;
        SignRequestDetailBean other = (SignRequestDetailBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestDate==null && other.getRequestDate()==null) || 
             (this.requestDate!=null &&
              this.requestDate.equals(other.getRequestDate()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.requesterForeignName==null && other.getRequesterForeignName()==null) || 
             (this.requesterForeignName!=null &&
              this.requesterForeignName.equals(other.getRequesterForeignName()))) &&
            ((this.requesterName==null && other.getRequesterName()==null) || 
             (this.requesterName!=null &&
              this.requesterName.equals(other.getRequesterName()))) &&
            ((this.serviceForeignTitle==null && other.getServiceForeignTitle()==null) || 
             (this.serviceForeignTitle!=null &&
              this.serviceForeignTitle.equals(other.getServiceForeignTitle()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.serviceTitle==null && other.getServiceTitle()==null) || 
             (this.serviceTitle!=null &&
              this.serviceTitle.equals(other.getServiceTitle()))) &&
            ((this.signers==null && other.getSigners()==null) || 
             (this.signers!=null &&
              java.util.Arrays.equals(this.signers, other.getSigners()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber())));
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
        if (getRequestDate() != null) {
            _hashCode += getRequestDate().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getRequesterForeignName() != null) {
            _hashCode += getRequesterForeignName().hashCode();
        }
        if (getRequesterName() != null) {
            _hashCode += getRequesterName().hashCode();
        }
        if (getServiceForeignTitle() != null) {
            _hashCode += getServiceForeignTitle().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getServiceTitle() != null) {
            _hashCode += getServiceTitle().hashCode();
        }
        if (getSigners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSigners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSigners(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignRequestDetailBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "signRequestDetailBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "requestTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesterForeignName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requesterForeignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesterName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requesterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceForeignTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceForeignTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "signerBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "signRequestStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackingNumber"));
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
