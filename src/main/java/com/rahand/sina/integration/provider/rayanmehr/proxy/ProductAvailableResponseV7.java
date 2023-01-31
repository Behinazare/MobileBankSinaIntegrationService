/**
 * ProductAvailableResponseV7.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.rayanmehr.proxy;

public class ProductAvailableResponseV7  implements java.io.Serializable {
    private java.lang.Boolean isAvailable;

    private java.lang.Integer resultCode;

    private java.lang.Integer statusCode;

    public ProductAvailableResponseV7() {
    }

    public ProductAvailableResponseV7(
           java.lang.Boolean isAvailable,
           java.lang.Integer resultCode,
           java.lang.Integer statusCode) {
           this.isAvailable = isAvailable;
           this.resultCode = resultCode;
           this.statusCode = statusCode;
    }


    /**
     * Gets the isAvailable value for this ProductAvailableResponseV7.
     * 
     * @return isAvailable
     */
    public java.lang.Boolean getIsAvailable() {
        return isAvailable;
    }


    /**
     * Sets the isAvailable value for this ProductAvailableResponseV7.
     * 
     * @param isAvailable
     */
    public void setIsAvailable(java.lang.Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    /**
     * Gets the resultCode value for this ProductAvailableResponseV7.
     * 
     * @return resultCode
     */
    public java.lang.Integer getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this ProductAvailableResponseV7.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.Integer resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the statusCode value for this ProductAvailableResponseV7.
     * 
     * @return statusCode
     */
    public java.lang.Integer getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this ProductAvailableResponseV7.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.Integer statusCode) {
        this.statusCode = statusCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductAvailableResponseV7)) return false;
        ProductAvailableResponseV7 other = (ProductAvailableResponseV7) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isAvailable==null && other.getIsAvailable()==null) || 
             (this.isAvailable!=null &&
              this.isAvailable.equals(other.getIsAvailable()))) &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode())));
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
        if (getIsAvailable() != null) {
            _hashCode += getIsAvailable().hashCode();
        }
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductAvailableResponseV7.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ProductAvailableResponseV7"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "IsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
