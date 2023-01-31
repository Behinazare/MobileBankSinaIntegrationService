/**
 * BillPaymentsDetailsResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillPaymentsDetailsResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillPaymentDetailsResponseBean[] billPaymentDetailsResponseBeans;

    private long totalRecord;

    public BillPaymentsDetailsResponseBean() {
    }

    public BillPaymentsDetailsResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillPaymentDetailsResponseBean[] billPaymentDetailsResponseBeans,
           long totalRecord) {
           this.billPaymentDetailsResponseBeans = billPaymentDetailsResponseBeans;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the billPaymentDetailsResponseBeans value for this BillPaymentsDetailsResponseBean.
     * 
     * @return billPaymentDetailsResponseBeans
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillPaymentDetailsResponseBean[] getBillPaymentDetailsResponseBeans() {
        return billPaymentDetailsResponseBeans;
    }


    /**
     * Sets the billPaymentDetailsResponseBeans value for this BillPaymentsDetailsResponseBean.
     * 
     * @param billPaymentDetailsResponseBeans
     */
    public void setBillPaymentDetailsResponseBeans(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillPaymentDetailsResponseBean[] billPaymentDetailsResponseBeans) {
        this.billPaymentDetailsResponseBeans = billPaymentDetailsResponseBeans;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillPaymentDetailsResponseBean getBillPaymentDetailsResponseBeans(int i) {
        return this.billPaymentDetailsResponseBeans[i];
    }

    public void setBillPaymentDetailsResponseBeans(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillPaymentDetailsResponseBean _value) {
        this.billPaymentDetailsResponseBeans[i] = _value;
    }


    /**
     * Gets the totalRecord value for this BillPaymentsDetailsResponseBean.
     * 
     * @return totalRecord
     */
    public long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this BillPaymentsDetailsResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentsDetailsResponseBean)) return false;
        BillPaymentsDetailsResponseBean other = (BillPaymentsDetailsResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billPaymentDetailsResponseBeans==null && other.getBillPaymentDetailsResponseBeans()==null) || 
             (this.billPaymentDetailsResponseBeans!=null &&
              java.util.Arrays.equals(this.billPaymentDetailsResponseBeans, other.getBillPaymentDetailsResponseBeans()))) &&
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
        if (getBillPaymentDetailsResponseBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillPaymentDetailsResponseBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillPaymentDetailsResponseBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getTotalRecord()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillPaymentsDetailsResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billPaymentsDetailsResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPaymentDetailsResponseBeans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billPaymentDetailsResponseBeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billPaymentDetailsResponseBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
