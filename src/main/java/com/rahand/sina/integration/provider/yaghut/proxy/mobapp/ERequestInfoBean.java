/**
 * ERequestInfoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ERequestInfoBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestActionInfoBean[] actions;

    private java.util.Calendar lastModifyDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestParameterBean[] parameters;

    private java.lang.String referenceNumber;

    private java.util.Calendar registerDate;

    private java.lang.String registeredId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatus status;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusResponse statusResponse;

    private java.lang.String title;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusInfoBean eRequestStatus;

    public ERequestInfoBean() {
    }

    public ERequestInfoBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestActionInfoBean[] actions,
           java.util.Calendar lastModifyDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestParameterBean[] parameters,
           java.lang.String referenceNumber,
           java.util.Calendar registerDate,
           java.lang.String registeredId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatus status,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusResponse statusResponse,
           java.lang.String title,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusInfoBean eRequestStatus) {
           this.actions = actions;
           this.lastModifyDate = lastModifyDate;
           this.parameters = parameters;
           this.referenceNumber = referenceNumber;
           this.registerDate = registerDate;
           this.registeredId = registeredId;
           this.status = status;
           this.statusResponse = statusResponse;
           this.title = title;
           this.eRequestStatus = eRequestStatus;
    }


    /**
     * Gets the actions value for this ERequestInfoBean.
     * 
     * @return actions
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestActionInfoBean[] getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this ERequestInfoBean.
     * 
     * @param actions
     */
    public void setActions(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestActionInfoBean[] actions) {
        this.actions = actions;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestActionInfoBean getActions(int i) {
        return this.actions[i];
    }

    public void setActions(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestActionInfoBean _value) {
        this.actions[i] = _value;
    }


    /**
     * Gets the lastModifyDate value for this ERequestInfoBean.
     * 
     * @return lastModifyDate
     */
    public java.util.Calendar getLastModifyDate() {
        return lastModifyDate;
    }


    /**
     * Sets the lastModifyDate value for this ERequestInfoBean.
     * 
     * @param lastModifyDate
     */
    public void setLastModifyDate(java.util.Calendar lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }


    /**
     * Gets the parameters value for this ERequestInfoBean.
     * 
     * @return parameters
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestParameterBean[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this ERequestInfoBean.
     * 
     * @param parameters
     */
    public void setParameters(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestParameterBean[] parameters) {
        this.parameters = parameters;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestParameterBean getParameters(int i) {
        return this.parameters[i];
    }

    public void setParameters(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestParameterBean _value) {
        this.parameters[i] = _value;
    }


    /**
     * Gets the referenceNumber value for this ERequestInfoBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this ERequestInfoBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the registerDate value for this ERequestInfoBean.
     * 
     * @return registerDate
     */
    public java.util.Calendar getRegisterDate() {
        return registerDate;
    }


    /**
     * Sets the registerDate value for this ERequestInfoBean.
     * 
     * @param registerDate
     */
    public void setRegisterDate(java.util.Calendar registerDate) {
        this.registerDate = registerDate;
    }


    /**
     * Gets the registeredId value for this ERequestInfoBean.
     * 
     * @return registeredId
     */
    public java.lang.String getRegisteredId() {
        return registeredId;
    }


    /**
     * Sets the registeredId value for this ERequestInfoBean.
     * 
     * @param registeredId
     */
    public void setRegisteredId(java.lang.String registeredId) {
        this.registeredId = registeredId;
    }


    /**
     * Gets the status value for this ERequestInfoBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ERequestInfoBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatus status) {
        this.status = status;
    }


    /**
     * Gets the statusResponse value for this ERequestInfoBean.
     * 
     * @return statusResponse
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusResponse getStatusResponse() {
        return statusResponse;
    }


    /**
     * Sets the statusResponse value for this ERequestInfoBean.
     * 
     * @param statusResponse
     */
    public void setStatusResponse(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusResponse statusResponse) {
        this.statusResponse = statusResponse;
    }


    /**
     * Gets the title value for this ERequestInfoBean.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ERequestInfoBean.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the eRequestStatus value for this ERequestInfoBean.
     * 
     * @return eRequestStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusInfoBean getERequestStatus() {
        return eRequestStatus;
    }


    /**
     * Sets the eRequestStatus value for this ERequestInfoBean.
     * 
     * @param eRequestStatus
     */
    public void setERequestStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusInfoBean eRequestStatus) {
        this.eRequestStatus = eRequestStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERequestInfoBean)) return false;
        ERequestInfoBean other = (ERequestInfoBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              java.util.Arrays.equals(this.actions, other.getActions()))) &&
            ((this.lastModifyDate==null && other.getLastModifyDate()==null) || 
             (this.lastModifyDate!=null &&
              this.lastModifyDate.equals(other.getLastModifyDate()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.registerDate==null && other.getRegisterDate()==null) || 
             (this.registerDate!=null &&
              this.registerDate.equals(other.getRegisterDate()))) &&
            ((this.registeredId==null && other.getRegisteredId()==null) || 
             (this.registeredId!=null &&
              this.registeredId.equals(other.getRegisteredId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusResponse==null && other.getStatusResponse()==null) || 
             (this.statusResponse!=null &&
              this.statusResponse.equals(other.getStatusResponse()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.eRequestStatus==null && other.getERequestStatus()==null) || 
             (this.eRequestStatus!=null &&
              this.eRequestStatus.equals(other.getERequestStatus())));
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
        if (getActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifyDate() != null) {
            _hashCode += getLastModifyDate().hashCode();
        }
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getRegisterDate() != null) {
            _hashCode += getRegisterDate().hashCode();
        }
        if (getRegisteredId() != null) {
            _hashCode += getRegisteredId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusResponse() != null) {
            _hashCode += getStatusResponse().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getERequestStatus() != null) {
            _hashCode += getERequestStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERequestInfoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestInfoBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestActionInfoBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastModifyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestParameterBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("statusResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestStatusResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERequestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eRequestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestStatusInfoBean"));
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
