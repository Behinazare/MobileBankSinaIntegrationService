/**
 * LoansResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoansResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanBean[] loanBeans;

    private int totalRecord;

    public LoansResponseBean() {
    }

    public LoansResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanBean[] loanBeans,
           int totalRecord) {
           this.loanBeans = loanBeans;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the loanBeans value for this LoansResponseBean.
     * 
     * @return loanBeans
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanBean[] getLoanBeans() {
        return loanBeans;
    }


    /**
     * Sets the loanBeans value for this LoansResponseBean.
     * 
     * @param loanBeans
     */
    public void setLoanBeans(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanBean[] loanBeans) {
        this.loanBeans = loanBeans;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanBean getLoanBeans(int i) {
        return this.loanBeans[i];
    }

    public void setLoanBeans(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanBean _value) {
        this.loanBeans[i] = _value;
    }


    /**
     * Gets the totalRecord value for this LoansResponseBean.
     * 
     * @return totalRecord
     */
    public int getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this LoansResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoansResponseBean)) return false;
        LoansResponseBean other = (LoansResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loanBeans==null && other.getLoanBeans()==null) || 
             (this.loanBeans!=null &&
              java.util.Arrays.equals(this.loanBeans, other.getLoanBeans()))) &&
            this.totalRecord == other.getTotalRecord();
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
        if (getLoanBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoanBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoanBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTotalRecord();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoansResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loansResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanBeans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanBeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
