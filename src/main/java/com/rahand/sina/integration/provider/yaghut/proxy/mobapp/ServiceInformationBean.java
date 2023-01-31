/**
 * ServiceInformationBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ServiceInformationBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ContextEntry[] contextInformation;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DigitalSignableBean digitalSignableBean;

    public ServiceInformationBean() {
    }

    public ServiceInformationBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ContextEntry[] contextInformation,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DigitalSignableBean digitalSignableBean) {
           this.contextInformation = contextInformation;
           this.digitalSignableBean = digitalSignableBean;
    }


    /**
     * Gets the contextInformation value for this ServiceInformationBean.
     * 
     * @return contextInformation
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ContextEntry[] getContextInformation() {
        return contextInformation;
    }


    /**
     * Sets the contextInformation value for this ServiceInformationBean.
     * 
     * @param contextInformation
     */
    public void setContextInformation(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ContextEntry[] contextInformation) {
        this.contextInformation = contextInformation;
    }


    /**
     * Gets the digitalSignableBean value for this ServiceInformationBean.
     * 
     * @return digitalSignableBean
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DigitalSignableBean getDigitalSignableBean() {
        return digitalSignableBean;
    }


    /**
     * Sets the digitalSignableBean value for this ServiceInformationBean.
     * 
     * @param digitalSignableBean
     */
    public void setDigitalSignableBean(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DigitalSignableBean digitalSignableBean) {
        this.digitalSignableBean = digitalSignableBean;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceInformationBean)) return false;
        ServiceInformationBean other = (ServiceInformationBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contextInformation==null && other.getContextInformation()==null) || 
             (this.contextInformation!=null &&
              java.util.Arrays.equals(this.contextInformation, other.getContextInformation()))) &&
            ((this.digitalSignableBean==null && other.getDigitalSignableBean()==null) || 
             (this.digitalSignableBean!=null &&
              this.digitalSignableBean.equals(other.getDigitalSignableBean())));
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
        if (getContextInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContextInformation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContextInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDigitalSignableBean() != null) {
            _hashCode += getDigitalSignableBean().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceInformationBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "serviceInformationBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contextInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "contextEntry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "data"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitalSignableBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digitalSignableBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "digitalSignableBean"));
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
