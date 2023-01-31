/**
 * DestinationBatchTransferBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DestinationBatchTransferBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationBatchTransferInfoBean destinationBatchTransferInfoBean;

    private java.lang.String destinationDepositNumber;

    private java.lang.String payId;

    public DestinationBatchTransferBean() {
    }

    public DestinationBatchTransferBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationBatchTransferInfoBean destinationBatchTransferInfoBean,
           java.lang.String destinationDepositNumber,
           java.lang.String payId) {
           this.destinationBatchTransferInfoBean = destinationBatchTransferInfoBean;
           this.destinationDepositNumber = destinationDepositNumber;
           this.payId = payId;
    }


    /**
     * Gets the destinationBatchTransferInfoBean value for this DestinationBatchTransferBean.
     * 
     * @return destinationBatchTransferInfoBean
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationBatchTransferInfoBean getDestinationBatchTransferInfoBean() {
        return destinationBatchTransferInfoBean;
    }


    /**
     * Sets the destinationBatchTransferInfoBean value for this DestinationBatchTransferBean.
     * 
     * @param destinationBatchTransferInfoBean
     */
    public void setDestinationBatchTransferInfoBean(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationBatchTransferInfoBean destinationBatchTransferInfoBean) {
        this.destinationBatchTransferInfoBean = destinationBatchTransferInfoBean;
    }


    /**
     * Gets the destinationDepositNumber value for this DestinationBatchTransferBean.
     * 
     * @return destinationDepositNumber
     */
    public java.lang.String getDestinationDepositNumber() {
        return destinationDepositNumber;
    }


    /**
     * Sets the destinationDepositNumber value for this DestinationBatchTransferBean.
     * 
     * @param destinationDepositNumber
     */
    public void setDestinationDepositNumber(java.lang.String destinationDepositNumber) {
        this.destinationDepositNumber = destinationDepositNumber;
    }


    /**
     * Gets the payId value for this DestinationBatchTransferBean.
     * 
     * @return payId
     */
    public java.lang.String getPayId() {
        return payId;
    }


    /**
     * Sets the payId value for this DestinationBatchTransferBean.
     * 
     * @param payId
     */
    public void setPayId(java.lang.String payId) {
        this.payId = payId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DestinationBatchTransferBean)) return false;
        DestinationBatchTransferBean other = (DestinationBatchTransferBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.destinationBatchTransferInfoBean==null && other.getDestinationBatchTransferInfoBean()==null) || 
             (this.destinationBatchTransferInfoBean!=null &&
              this.destinationBatchTransferInfoBean.equals(other.getDestinationBatchTransferInfoBean()))) &&
            ((this.destinationDepositNumber==null && other.getDestinationDepositNumber()==null) || 
             (this.destinationDepositNumber!=null &&
              this.destinationDepositNumber.equals(other.getDestinationDepositNumber()))) &&
            ((this.payId==null && other.getPayId()==null) || 
             (this.payId!=null &&
              this.payId.equals(other.getPayId())));
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
        if (getDestinationBatchTransferInfoBean() != null) {
            _hashCode += getDestinationBatchTransferInfoBean().hashCode();
        }
        if (getDestinationDepositNumber() != null) {
            _hashCode += getDestinationDepositNumber().hashCode();
        }
        if (getPayId() != null) {
            _hashCode += getPayId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DestinationBatchTransferBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "destinationBatchTransferBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationBatchTransferInfoBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationBatchTransferInfoBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "destinationBatchTransferInfoBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payId"));
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
