/**
 * ChargeCardResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ChargeCardResponseBean  implements java.io.Serializable {
    private boolean doneCompletely;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChargeCardErrorTypeWS errorType;

    public ChargeCardResponseBean() {
    }

    public ChargeCardResponseBean(
           boolean doneCompletely,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChargeCardErrorTypeWS errorType) {
           this.doneCompletely = doneCompletely;
           this.errorType = errorType;
    }


    /**
     * Gets the doneCompletely value for this ChargeCardResponseBean.
     * 
     * @return doneCompletely
     */
    public boolean isDoneCompletely() {
        return doneCompletely;
    }


    /**
     * Sets the doneCompletely value for this ChargeCardResponseBean.
     * 
     * @param doneCompletely
     */
    public void setDoneCompletely(boolean doneCompletely) {
        this.doneCompletely = doneCompletely;
    }


    /**
     * Gets the errorType value for this ChargeCardResponseBean.
     * 
     * @return errorType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChargeCardErrorTypeWS getErrorType() {
        return errorType;
    }


    /**
     * Sets the errorType value for this ChargeCardResponseBean.
     * 
     * @param errorType
     */
    public void setErrorType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChargeCardErrorTypeWS errorType) {
        this.errorType = errorType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeCardResponseBean)) return false;
        ChargeCardResponseBean other = (ChargeCardResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.doneCompletely == other.isDoneCompletely() &&
            ((this.errorType==null && other.getErrorType()==null) || 
             (this.errorType!=null &&
              this.errorType.equals(other.getErrorType())));
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
        _hashCode += (isDoneCompletely() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getErrorType() != null) {
            _hashCode += getErrorType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeCardResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chargeCardResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doneCompletely");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doneCompletely"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chargeCardErrorTypeWS"));
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
