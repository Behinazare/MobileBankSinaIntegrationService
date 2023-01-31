/**
 * DepositCustomerResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositCustomerResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositCustomerBean[] depositCustomers;

    private java.lang.String openerCustomerCif;

    private java.lang.String openerCustomerName;

    private long totalRecord;

    public DepositCustomerResponseBean() {
    }

    public DepositCustomerResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositCustomerBean[] depositCustomers,
           java.lang.String openerCustomerCif,
           java.lang.String openerCustomerName,
           long totalRecord) {
           this.depositCustomers = depositCustomers;
           this.openerCustomerCif = openerCustomerCif;
           this.openerCustomerName = openerCustomerName;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the depositCustomers value for this DepositCustomerResponseBean.
     * 
     * @return depositCustomers
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositCustomerBean[] getDepositCustomers() {
        return depositCustomers;
    }


    /**
     * Sets the depositCustomers value for this DepositCustomerResponseBean.
     * 
     * @param depositCustomers
     */
    public void setDepositCustomers(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositCustomerBean[] depositCustomers) {
        this.depositCustomers = depositCustomers;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositCustomerBean getDepositCustomers(int i) {
        return this.depositCustomers[i];
    }

    public void setDepositCustomers(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositCustomerBean _value) {
        this.depositCustomers[i] = _value;
    }


    /**
     * Gets the openerCustomerCif value for this DepositCustomerResponseBean.
     * 
     * @return openerCustomerCif
     */
    public java.lang.String getOpenerCustomerCif() {
        return openerCustomerCif;
    }


    /**
     * Sets the openerCustomerCif value for this DepositCustomerResponseBean.
     * 
     * @param openerCustomerCif
     */
    public void setOpenerCustomerCif(java.lang.String openerCustomerCif) {
        this.openerCustomerCif = openerCustomerCif;
    }


    /**
     * Gets the openerCustomerName value for this DepositCustomerResponseBean.
     * 
     * @return openerCustomerName
     */
    public java.lang.String getOpenerCustomerName() {
        return openerCustomerName;
    }


    /**
     * Sets the openerCustomerName value for this DepositCustomerResponseBean.
     * 
     * @param openerCustomerName
     */
    public void setOpenerCustomerName(java.lang.String openerCustomerName) {
        this.openerCustomerName = openerCustomerName;
    }


    /**
     * Gets the totalRecord value for this DepositCustomerResponseBean.
     * 
     * @return totalRecord
     */
    public long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this DepositCustomerResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositCustomerResponseBean)) return false;
        DepositCustomerResponseBean other = (DepositCustomerResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depositCustomers==null && other.getDepositCustomers()==null) || 
             (this.depositCustomers!=null &&
              java.util.Arrays.equals(this.depositCustomers, other.getDepositCustomers()))) &&
            ((this.openerCustomerCif==null && other.getOpenerCustomerCif()==null) || 
             (this.openerCustomerCif!=null &&
              this.openerCustomerCif.equals(other.getOpenerCustomerCif()))) &&
            ((this.openerCustomerName==null && other.getOpenerCustomerName()==null) || 
             (this.openerCustomerName!=null &&
              this.openerCustomerName.equals(other.getOpenerCustomerName()))) &&
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
        if (getDepositCustomers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositCustomers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositCustomers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpenerCustomerCif() != null) {
            _hashCode += getOpenerCustomerCif().hashCode();
        }
        if (getOpenerCustomerName() != null) {
            _hashCode += getOpenerCustomerName().hashCode();
        }
        _hashCode += new Long(getTotalRecord()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepositCustomerResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositCustomerResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositCustomers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositCustomers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositCustomerBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openerCustomerCif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openerCustomerCif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openerCustomerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openerCustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
