/**
 * LoanInformationBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoanInformationBean  implements java.io.Serializable {
    private java.lang.String loanIban;

    private java.lang.String loanNumber;

    public LoanInformationBean() {
    }

    public LoanInformationBean(
           java.lang.String loanIban,
           java.lang.String loanNumber) {
           this.loanIban = loanIban;
           this.loanNumber = loanNumber;
    }


    /**
     * Gets the loanIban value for this LoanInformationBean.
     * 
     * @return loanIban
     */
    public java.lang.String getLoanIban() {
        return loanIban;
    }


    /**
     * Sets the loanIban value for this LoanInformationBean.
     * 
     * @param loanIban
     */
    public void setLoanIban(java.lang.String loanIban) {
        this.loanIban = loanIban;
    }


    /**
     * Gets the loanNumber value for this LoanInformationBean.
     * 
     * @return loanNumber
     */
    public java.lang.String getLoanNumber() {
        return loanNumber;
    }


    /**
     * Sets the loanNumber value for this LoanInformationBean.
     * 
     * @param loanNumber
     */
    public void setLoanNumber(java.lang.String loanNumber) {
        this.loanNumber = loanNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoanInformationBean)) return false;
        LoanInformationBean other = (LoanInformationBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loanIban==null && other.getLoanIban()==null) || 
             (this.loanIban!=null &&
              this.loanIban.equals(other.getLoanIban()))) &&
            ((this.loanNumber==null && other.getLoanNumber()==null) || 
             (this.loanNumber!=null &&
              this.loanNumber.equals(other.getLoanNumber())));
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
        if (getLoanIban() != null) {
            _hashCode += getLoanIban().hashCode();
        }
        if (getLoanNumber() != null) {
            _hashCode += getLoanNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoanInformationBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanInformationBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanIban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanIban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanNumber"));
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
