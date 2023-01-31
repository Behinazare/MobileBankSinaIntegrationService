/**
 * ServiceConstraintInformationBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ServiceConstraintInformationBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ConstraintInformationBean[] constraints;

    private java.lang.Long serviceId;

    private java.lang.String serviceKey;

    private java.lang.String serviceName;

    public ServiceConstraintInformationBean() {
    }

    public ServiceConstraintInformationBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ConstraintInformationBean[] constraints,
           java.lang.Long serviceId,
           java.lang.String serviceKey,
           java.lang.String serviceName) {
           this.constraints = constraints;
           this.serviceId = serviceId;
           this.serviceKey = serviceKey;
           this.serviceName = serviceName;
    }


    /**
     * Gets the constraints value for this ServiceConstraintInformationBean.
     * 
     * @return constraints
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ConstraintInformationBean[] getConstraints() {
        return constraints;
    }


    /**
     * Sets the constraints value for this ServiceConstraintInformationBean.
     * 
     * @param constraints
     */
    public void setConstraints(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ConstraintInformationBean[] constraints) {
        this.constraints = constraints;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ConstraintInformationBean getConstraints(int i) {
        return this.constraints[i];
    }

    public void setConstraints(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ConstraintInformationBean _value) {
        this.constraints[i] = _value;
    }


    /**
     * Gets the serviceId value for this ServiceConstraintInformationBean.
     * 
     * @return serviceId
     */
    public java.lang.Long getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this ServiceConstraintInformationBean.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.Long serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceKey value for this ServiceConstraintInformationBean.
     * 
     * @return serviceKey
     */
    public java.lang.String getServiceKey() {
        return serviceKey;
    }


    /**
     * Sets the serviceKey value for this ServiceConstraintInformationBean.
     * 
     * @param serviceKey
     */
    public void setServiceKey(java.lang.String serviceKey) {
        this.serviceKey = serviceKey;
    }


    /**
     * Gets the serviceName value for this ServiceConstraintInformationBean.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this ServiceConstraintInformationBean.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceConstraintInformationBean)) return false;
        ServiceConstraintInformationBean other = (ServiceConstraintInformationBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.constraints==null && other.getConstraints()==null) || 
             (this.constraints!=null &&
              java.util.Arrays.equals(this.constraints, other.getConstraints()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.serviceKey==null && other.getServiceKey()==null) || 
             (this.serviceKey!=null &&
              this.serviceKey.equals(other.getServiceKey()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName())));
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
        if (getConstraints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConstraints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConstraints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getServiceKey() != null) {
            _hashCode += getServiceKey().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceConstraintInformationBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "serviceConstraintInformationBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constraints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "constraints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "constraintInformationBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceName"));
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
