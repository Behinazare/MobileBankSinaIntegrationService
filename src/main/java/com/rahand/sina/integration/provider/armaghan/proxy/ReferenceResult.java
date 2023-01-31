/**
 * ReferenceResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.armaghan.proxy;

public class ReferenceResult  implements java.io.Serializable {
    private Long[] references;

    private Error error;

    public ReferenceResult() {
    }

    public ReferenceResult(
           Long[] references,
           Error error) {
           this.references = references;
           this.error = error;
    }


    /**
     * Gets the references value for this ReferenceResult.
     * 
     * @return references
     */
    public Long[] getReferences() {
        return references;
    }


    /**
     * Sets the references value for this ReferenceResult.
     * 
     * @param references
     */
    public void setReferences(Long[] references) {
        this.references = references;
    }

    public Long getReferences(int i) {
        return this.references[i];
    }

    public void setReferences(int i, Long _value) {
        this.references[i] = _value;
    }


    /**
     * Gets the error value for this ReferenceResult.
     * 
     * @return error
     */
    public Error getError() {
        return error;
    }


    /**
     * Sets the error value for this ReferenceResult.
     * 
     * @param error
     */
    public void setError(Error error) {
        this.error = error;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReferenceResult)) return false;
        ReferenceResult other = (ReferenceResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.references==null && other.getReferences()==null) || 
             (this.references!=null &&
              java.util.Arrays.equals(this.references, other.getReferences()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
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
        if (getReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferences());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReferenceResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.smsrelay.armaghan.net/", "referenceResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("references");
        elemField.setXmlName(new javax.xml.namespace.QName("", "references"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.smsrelay.armaghan.net/", "error"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
