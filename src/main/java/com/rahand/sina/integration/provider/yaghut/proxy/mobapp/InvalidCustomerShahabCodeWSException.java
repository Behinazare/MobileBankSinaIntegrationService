/**
 * InvalidCustomerShahabCodeWSException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class InvalidCustomerShahabCodeWSException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.lang.String cif;

    private int code;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerShahabCodeErrorReasonWS customerShahabCodeErrorReason;

    private java.lang.String message1;

    public InvalidCustomerShahabCodeWSException() {
    }

    public InvalidCustomerShahabCodeWSException(
           java.lang.String cif,
           int code,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerShahabCodeErrorReasonWS customerShahabCodeErrorReason,
           java.lang.String message1) {
        this.cif = cif;
        this.code = code;
        this.customerShahabCodeErrorReason = customerShahabCodeErrorReason;
        this.message1 = message1;
    }


    /**
     * Gets the cif value for this InvalidCustomerShahabCodeWSException.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this InvalidCustomerShahabCodeWSException.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the code value for this InvalidCustomerShahabCodeWSException.
     * 
     * @return code
     */
    public int getCode() {
        return code;
    }


    /**
     * Sets the code value for this InvalidCustomerShahabCodeWSException.
     * 
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }


    /**
     * Gets the customerShahabCodeErrorReason value for this InvalidCustomerShahabCodeWSException.
     * 
     * @return customerShahabCodeErrorReason
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerShahabCodeErrorReasonWS getCustomerShahabCodeErrorReason() {
        return customerShahabCodeErrorReason;
    }


    /**
     * Sets the customerShahabCodeErrorReason value for this InvalidCustomerShahabCodeWSException.
     * 
     * @param customerShahabCodeErrorReason
     */
    public void setCustomerShahabCodeErrorReason(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerShahabCodeErrorReasonWS customerShahabCodeErrorReason) {
        this.customerShahabCodeErrorReason = customerShahabCodeErrorReason;
    }


    /**
     * Gets the message1 value for this InvalidCustomerShahabCodeWSException.
     * 
     * @return message1
     */
    public java.lang.String getMessage1() {
        return message1;
    }


    /**
     * Sets the message1 value for this InvalidCustomerShahabCodeWSException.
     * 
     * @param message1
     */
    public void setMessage1(java.lang.String message1) {
        this.message1 = message1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvalidCustomerShahabCodeWSException)) return false;
        InvalidCustomerShahabCodeWSException other = (InvalidCustomerShahabCodeWSException) obj;
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
            this.code == other.getCode() &&
            ((this.customerShahabCodeErrorReason==null && other.getCustomerShahabCodeErrorReason()==null) || 
             (this.customerShahabCodeErrorReason!=null &&
              this.customerShahabCodeErrorReason.equals(other.getCustomerShahabCodeErrorReason()))) &&
            ((this.message1==null && other.getMessage1()==null) || 
             (this.message1!=null &&
              this.message1.equals(other.getMessage1())));
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
        _hashCode += getCode();
        if (getCustomerShahabCodeErrorReason() != null) {
            _hashCode += getCustomerShahabCodeErrorReason().hashCode();
        }
        if (getMessage1() != null) {
            _hashCode += getMessage1().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvalidCustomerShahabCodeWSException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidCustomerShahabCodeWSException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerShahabCodeErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerShahabCodeErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "customerShahabCodeErrorReasonWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
