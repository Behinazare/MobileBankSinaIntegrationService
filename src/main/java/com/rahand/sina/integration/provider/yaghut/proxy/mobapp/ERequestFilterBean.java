/**
 * ERequestFilterBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ERequestFilterBean  implements java.io.Serializable {
    private java.util.Calendar fromDate;

    private java.util.Calendar fromLastModifyDate;

    private long length;

    private long offset;

    private java.lang.String referenceNumber;

    private java.lang.String registeredId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatus status;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusRequest statusRequest;

    private java.util.Calendar toDate;

    private java.util.Calendar toLastModifyDate;

    private java.lang.String userERequestStatus;

    public ERequestFilterBean() {
    }

    public ERequestFilterBean(
           java.util.Calendar fromDate,
           java.util.Calendar fromLastModifyDate,
           long length,
           long offset,
           java.lang.String referenceNumber,
           java.lang.String registeredId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatus status,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusRequest statusRequest,
           java.util.Calendar toDate,
           java.util.Calendar toLastModifyDate,
           java.lang.String userERequestStatus) {
           this.fromDate = fromDate;
           this.fromLastModifyDate = fromLastModifyDate;
           this.length = length;
           this.offset = offset;
           this.referenceNumber = referenceNumber;
           this.registeredId = registeredId;
           this.status = status;
           this.statusRequest = statusRequest;
           this.toDate = toDate;
           this.toLastModifyDate = toLastModifyDate;
           this.userERequestStatus = userERequestStatus;
    }


    /**
     * Gets the fromDate value for this ERequestFilterBean.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this ERequestFilterBean.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the fromLastModifyDate value for this ERequestFilterBean.
     * 
     * @return fromLastModifyDate
     */
    public java.util.Calendar getFromLastModifyDate() {
        return fromLastModifyDate;
    }


    /**
     * Sets the fromLastModifyDate value for this ERequestFilterBean.
     * 
     * @param fromLastModifyDate
     */
    public void setFromLastModifyDate(java.util.Calendar fromLastModifyDate) {
        this.fromLastModifyDate = fromLastModifyDate;
    }


    /**
     * Gets the length value for this ERequestFilterBean.
     * 
     * @return length
     */
    public long getLength() {
        return length;
    }


    /**
     * Sets the length value for this ERequestFilterBean.
     * 
     * @param length
     */
    public void setLength(long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this ERequestFilterBean.
     * 
     * @return offset
     */
    public long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this ERequestFilterBean.
     * 
     * @param offset
     */
    public void setOffset(long offset) {
        this.offset = offset;
    }


    /**
     * Gets the referenceNumber value for this ERequestFilterBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this ERequestFilterBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the registeredId value for this ERequestFilterBean.
     * 
     * @return registeredId
     */
    public java.lang.String getRegisteredId() {
        return registeredId;
    }


    /**
     * Sets the registeredId value for this ERequestFilterBean.
     * 
     * @param registeredId
     */
    public void setRegisteredId(java.lang.String registeredId) {
        this.registeredId = registeredId;
    }


    /**
     * Gets the status value for this ERequestFilterBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ERequestFilterBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatus status) {
        this.status = status;
    }


    /**
     * Gets the statusRequest value for this ERequestFilterBean.
     * 
     * @return statusRequest
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusRequest getStatusRequest() {
        return statusRequest;
    }


    /**
     * Sets the statusRequest value for this ERequestFilterBean.
     * 
     * @param statusRequest
     */
    public void setStatusRequest(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusRequest statusRequest) {
        this.statusRequest = statusRequest;
    }


    /**
     * Gets the toDate value for this ERequestFilterBean.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this ERequestFilterBean.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the toLastModifyDate value for this ERequestFilterBean.
     * 
     * @return toLastModifyDate
     */
    public java.util.Calendar getToLastModifyDate() {
        return toLastModifyDate;
    }


    /**
     * Sets the toLastModifyDate value for this ERequestFilterBean.
     * 
     * @param toLastModifyDate
     */
    public void setToLastModifyDate(java.util.Calendar toLastModifyDate) {
        this.toLastModifyDate = toLastModifyDate;
    }


    /**
     * Gets the userERequestStatus value for this ERequestFilterBean.
     * 
     * @return userERequestStatus
     */
    public java.lang.String getUserERequestStatus() {
        return userERequestStatus;
    }


    /**
     * Sets the userERequestStatus value for this ERequestFilterBean.
     * 
     * @param userERequestStatus
     */
    public void setUserERequestStatus(java.lang.String userERequestStatus) {
        this.userERequestStatus = userERequestStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERequestFilterBean)) return false;
        ERequestFilterBean other = (ERequestFilterBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.fromLastModifyDate==null && other.getFromLastModifyDate()==null) || 
             (this.fromLastModifyDate!=null &&
              this.fromLastModifyDate.equals(other.getFromLastModifyDate()))) &&
            this.length == other.getLength() &&
            this.offset == other.getOffset() &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.registeredId==null && other.getRegisteredId()==null) || 
             (this.registeredId!=null &&
              this.registeredId.equals(other.getRegisteredId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusRequest==null && other.getStatusRequest()==null) || 
             (this.statusRequest!=null &&
              this.statusRequest.equals(other.getStatusRequest()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.toLastModifyDate==null && other.getToLastModifyDate()==null) || 
             (this.toLastModifyDate!=null &&
              this.toLastModifyDate.equals(other.getToLastModifyDate()))) &&
            ((this.userERequestStatus==null && other.getUserERequestStatus()==null) || 
             (this.userERequestStatus!=null &&
              this.userERequestStatus.equals(other.getUserERequestStatus())));
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
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getFromLastModifyDate() != null) {
            _hashCode += getFromLastModifyDate().hashCode();
        }
        _hashCode += new Long(getLength()).hashCode();
        _hashCode += new Long(getOffset()).hashCode();
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getRegisteredId() != null) {
            _hashCode += getRegisteredId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusRequest() != null) {
            _hashCode += getStatusRequest().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getToLastModifyDate() != null) {
            _hashCode += getToLastModifyDate().hashCode();
        }
        if (getUserERequestStatus() != null) {
            _hashCode += getUserERequestStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERequestFilterBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestFilterBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromLastModifyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromLastModifyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("registeredId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registeredId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("statusRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestStatusRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toLastModifyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toLastModifyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userERequestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userERequestStatus"));
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
