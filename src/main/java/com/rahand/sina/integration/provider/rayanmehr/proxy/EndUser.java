/**
 * EndUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.rayanmehr.proxy;

public class EndUser  implements java.io.Serializable {
    private java.lang.String maskedPan;

    private java.lang.String mobile;

    private java.lang.String nationalCode;

    private java.lang.String rrn;

    public EndUser() {
    }

    public EndUser(
           java.lang.String maskedPan,
           java.lang.String mobile,
           java.lang.String nationalCode,
           java.lang.String rrn) {
           this.maskedPan = maskedPan;
           this.mobile = mobile;
           this.nationalCode = nationalCode;
           this.rrn = rrn;
    }


    /**
     * Gets the maskedPan value for this EndUser.
     * 
     * @return maskedPan
     */
    public java.lang.String getMaskedPan() {
        return maskedPan;
    }


    /**
     * Sets the maskedPan value for this EndUser.
     * 
     * @param maskedPan
     */
    public void setMaskedPan(java.lang.String maskedPan) {
        this.maskedPan = maskedPan;
    }


    /**
     * Gets the mobile value for this EndUser.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this EndUser.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the nationalCode value for this EndUser.
     * 
     * @return nationalCode
     */
    public java.lang.String getNationalCode() {
        return nationalCode;
    }


    /**
     * Sets the nationalCode value for this EndUser.
     * 
     * @param nationalCode
     */
    public void setNationalCode(java.lang.String nationalCode) {
        this.nationalCode = nationalCode;
    }


    /**
     * Gets the rrn value for this EndUser.
     * 
     * @return rrn
     */
    public java.lang.String getRrn() {
        return rrn;
    }


    /**
     * Sets the rrn value for this EndUser.
     * 
     * @param rrn
     */
    public void setRrn(java.lang.String rrn) {
        this.rrn = rrn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EndUser)) return false;
        EndUser other = (EndUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maskedPan==null && other.getMaskedPan()==null) || 
             (this.maskedPan!=null &&
              this.maskedPan.equals(other.getMaskedPan()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.nationalCode==null && other.getNationalCode()==null) || 
             (this.nationalCode!=null &&
              this.nationalCode.equals(other.getNationalCode()))) &&
            ((this.rrn==null && other.getRrn()==null) || 
             (this.rrn!=null &&
              this.rrn.equals(other.getRrn())));
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
        if (getMaskedPan() != null) {
            _hashCode += getMaskedPan().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getNationalCode() != null) {
            _hashCode += getNationalCode().hashCode();
        }
        if (getRrn() != null) {
            _hashCode += getRrn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EndUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.Entity", "EndUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskedPan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.Entity", "MaskedPan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.Entity", "Mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.Entity", "NationalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rrn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.Entity", "Rrn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
