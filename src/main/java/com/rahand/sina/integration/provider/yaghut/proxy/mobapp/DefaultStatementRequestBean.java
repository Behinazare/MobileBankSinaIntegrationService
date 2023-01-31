/**
 * DefaultStatementRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DefaultStatementRequestBean  implements java.io.Serializable {
    private java.lang.Short billPageSize;

    private java.lang.String depositNumber;

    private java.lang.Short lastN;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DefaultBillStatementBeanType viewType;

    public DefaultStatementRequestBean() {
    }

    public DefaultStatementRequestBean(
           java.lang.Short billPageSize,
           java.lang.String depositNumber,
           java.lang.Short lastN,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DefaultBillStatementBeanType viewType) {
           this.billPageSize = billPageSize;
           this.depositNumber = depositNumber;
           this.lastN = lastN;
           this.viewType = viewType;
    }


    /**
     * Gets the billPageSize value for this DefaultStatementRequestBean.
     * 
     * @return billPageSize
     */
    public java.lang.Short getBillPageSize() {
        return billPageSize;
    }


    /**
     * Sets the billPageSize value for this DefaultStatementRequestBean.
     * 
     * @param billPageSize
     */
    public void setBillPageSize(java.lang.Short billPageSize) {
        this.billPageSize = billPageSize;
    }


    /**
     * Gets the depositNumber value for this DefaultStatementRequestBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this DefaultStatementRequestBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the lastN value for this DefaultStatementRequestBean.
     * 
     * @return lastN
     */
    public java.lang.Short getLastN() {
        return lastN;
    }


    /**
     * Sets the lastN value for this DefaultStatementRequestBean.
     * 
     * @param lastN
     */
    public void setLastN(java.lang.Short lastN) {
        this.lastN = lastN;
    }


    /**
     * Gets the viewType value for this DefaultStatementRequestBean.
     * 
     * @return viewType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DefaultBillStatementBeanType getViewType() {
        return viewType;
    }


    /**
     * Sets the viewType value for this DefaultStatementRequestBean.
     * 
     * @param viewType
     */
    public void setViewType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DefaultBillStatementBeanType viewType) {
        this.viewType = viewType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefaultStatementRequestBean)) return false;
        DefaultStatementRequestBean other = (DefaultStatementRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billPageSize==null && other.getBillPageSize()==null) || 
             (this.billPageSize!=null &&
              this.billPageSize.equals(other.getBillPageSize()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.lastN==null && other.getLastN()==null) || 
             (this.lastN!=null &&
              this.lastN.equals(other.getLastN()))) &&
            ((this.viewType==null && other.getViewType()==null) || 
             (this.viewType!=null &&
              this.viewType.equals(other.getViewType())));
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
        if (getBillPageSize() != null) {
            _hashCode += getBillPageSize().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getLastN() != null) {
            _hashCode += getLastN().hashCode();
        }
        if (getViewType() != null) {
            _hashCode += getViewType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DefaultStatementRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "defaultStatementRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billPageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "defaultBillStatementBeanType"));
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
