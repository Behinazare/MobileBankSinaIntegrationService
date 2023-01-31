/**
 * SignRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SignRequestBean  implements java.io.Serializable {
    private java.lang.String cif;

    private java.util.Calendar fromRequestDate;

    private java.util.Calendar fromSignDate;

    private java.lang.Long length;

    private java.lang.Long offset;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.UserRequestStatus[] requestStatus;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RequestTypeWS requestType;

    private java.lang.Long serviceId;

    private java.util.Calendar toRequestDate;

    private java.util.Calendar toSignDate;

    private java.lang.String trakingNumber;

    public SignRequestBean() {
    }

    public SignRequestBean(
           java.lang.String cif,
           java.util.Calendar fromRequestDate,
           java.util.Calendar fromSignDate,
           java.lang.Long length,
           java.lang.Long offset,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.UserRequestStatus[] requestStatus,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RequestTypeWS requestType,
           java.lang.Long serviceId,
           java.util.Calendar toRequestDate,
           java.util.Calendar toSignDate,
           java.lang.String trakingNumber) {
           this.cif = cif;
           this.fromRequestDate = fromRequestDate;
           this.fromSignDate = fromSignDate;
           this.length = length;
           this.offset = offset;
           this.requestStatus = requestStatus;
           this.requestType = requestType;
           this.serviceId = serviceId;
           this.toRequestDate = toRequestDate;
           this.toSignDate = toSignDate;
           this.trakingNumber = trakingNumber;
    }


    /**
     * Gets the cif value for this SignRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this SignRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the fromRequestDate value for this SignRequestBean.
     * 
     * @return fromRequestDate
     */
    public java.util.Calendar getFromRequestDate() {
        return fromRequestDate;
    }


    /**
     * Sets the fromRequestDate value for this SignRequestBean.
     * 
     * @param fromRequestDate
     */
    public void setFromRequestDate(java.util.Calendar fromRequestDate) {
        this.fromRequestDate = fromRequestDate;
    }


    /**
     * Gets the fromSignDate value for this SignRequestBean.
     * 
     * @return fromSignDate
     */
    public java.util.Calendar getFromSignDate() {
        return fromSignDate;
    }


    /**
     * Sets the fromSignDate value for this SignRequestBean.
     * 
     * @param fromSignDate
     */
    public void setFromSignDate(java.util.Calendar fromSignDate) {
        this.fromSignDate = fromSignDate;
    }


    /**
     * Gets the length value for this SignRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this SignRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this SignRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this SignRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the requestStatus value for this SignRequestBean.
     * 
     * @return requestStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.UserRequestStatus[] getRequestStatus() {
        return requestStatus;
    }


    /**
     * Sets the requestStatus value for this SignRequestBean.
     * 
     * @param requestStatus
     */
    public void setRequestStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.UserRequestStatus[] requestStatus) {
        this.requestStatus = requestStatus;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.UserRequestStatus getRequestStatus(int i) {
        return this.requestStatus[i];
    }

    public void setRequestStatus(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.UserRequestStatus _value) {
        this.requestStatus[i] = _value;
    }


    /**
     * Gets the requestType value for this SignRequestBean.
     * 
     * @return requestType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RequestTypeWS getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this SignRequestBean.
     * 
     * @param requestType
     */
    public void setRequestType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RequestTypeWS requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the serviceId value for this SignRequestBean.
     * 
     * @return serviceId
     */
    public java.lang.Long getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this SignRequestBean.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.Long serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the toRequestDate value for this SignRequestBean.
     * 
     * @return toRequestDate
     */
    public java.util.Calendar getToRequestDate() {
        return toRequestDate;
    }


    /**
     * Sets the toRequestDate value for this SignRequestBean.
     * 
     * @param toRequestDate
     */
    public void setToRequestDate(java.util.Calendar toRequestDate) {
        this.toRequestDate = toRequestDate;
    }


    /**
     * Gets the toSignDate value for this SignRequestBean.
     * 
     * @return toSignDate
     */
    public java.util.Calendar getToSignDate() {
        return toSignDate;
    }


    /**
     * Sets the toSignDate value for this SignRequestBean.
     * 
     * @param toSignDate
     */
    public void setToSignDate(java.util.Calendar toSignDate) {
        this.toSignDate = toSignDate;
    }


    /**
     * Gets the trakingNumber value for this SignRequestBean.
     * 
     * @return trakingNumber
     */
    public java.lang.String getTrakingNumber() {
        return trakingNumber;
    }


    /**
     * Sets the trakingNumber value for this SignRequestBean.
     * 
     * @param trakingNumber
     */
    public void setTrakingNumber(java.lang.String trakingNumber) {
        this.trakingNumber = trakingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignRequestBean)) return false;
        SignRequestBean other = (SignRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.fromRequestDate==null && other.getFromRequestDate()==null) || 
             (this.fromRequestDate!=null &&
              this.fromRequestDate.equals(other.getFromRequestDate()))) &&
            ((this.fromSignDate==null && other.getFromSignDate()==null) || 
             (this.fromSignDate!=null &&
              this.fromSignDate.equals(other.getFromSignDate()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.requestStatus==null && other.getRequestStatus()==null) || 
             (this.requestStatus!=null &&
              java.util.Arrays.equals(this.requestStatus, other.getRequestStatus()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.toRequestDate==null && other.getToRequestDate()==null) || 
             (this.toRequestDate!=null &&
              this.toRequestDate.equals(other.getToRequestDate()))) &&
            ((this.toSignDate==null && other.getToSignDate()==null) || 
             (this.toSignDate!=null &&
              this.toSignDate.equals(other.getToSignDate()))) &&
            ((this.trakingNumber==null && other.getTrakingNumber()==null) || 
             (this.trakingNumber!=null &&
              this.trakingNumber.equals(other.getTrakingNumber())));
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
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getFromRequestDate() != null) {
            _hashCode += getFromRequestDate().hashCode();
        }
        if (getFromSignDate() != null) {
            _hashCode += getFromSignDate().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getRequestStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getToRequestDate() != null) {
            _hashCode += getToRequestDate().hashCode();
        }
        if (getToSignDate() != null) {
            _hashCode += getToSignDate().hashCode();
        }
        if (getTrakingNumber() != null) {
            _hashCode += getTrakingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "signRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromRequestDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromRequestDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromSignDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromSignDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "userRequestStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "requestTypeWS"));
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
        elemField.setFieldName("toRequestDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toRequestDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toSignDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toSignDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trakingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trakingNumber"));
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
