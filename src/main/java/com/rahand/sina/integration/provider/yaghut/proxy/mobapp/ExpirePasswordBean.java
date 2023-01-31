/**
 * ExpirePasswordBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ExpirePasswordBean  implements java.io.Serializable {
    private java.lang.String countDayForExpire;

    private java.util.Calendar enterDate;

    public ExpirePasswordBean() {
    }

    public ExpirePasswordBean(
           java.lang.String countDayForExpire,
           java.util.Calendar enterDate) {
           this.countDayForExpire = countDayForExpire;
           this.enterDate = enterDate;
    }


    /**
     * Gets the countDayForExpire value for this ExpirePasswordBean.
     * 
     * @return countDayForExpire
     */
    public java.lang.String getCountDayForExpire() {
        return countDayForExpire;
    }


    /**
     * Sets the countDayForExpire value for this ExpirePasswordBean.
     * 
     * @param countDayForExpire
     */
    public void setCountDayForExpire(java.lang.String countDayForExpire) {
        this.countDayForExpire = countDayForExpire;
    }


    /**
     * Gets the enterDate value for this ExpirePasswordBean.
     * 
     * @return enterDate
     */
    public java.util.Calendar getEnterDate() {
        return enterDate;
    }


    /**
     * Sets the enterDate value for this ExpirePasswordBean.
     * 
     * @param enterDate
     */
    public void setEnterDate(java.util.Calendar enterDate) {
        this.enterDate = enterDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpirePasswordBean)) return false;
        ExpirePasswordBean other = (ExpirePasswordBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countDayForExpire==null && other.getCountDayForExpire()==null) || 
             (this.countDayForExpire!=null &&
              this.countDayForExpire.equals(other.getCountDayForExpire()))) &&
            ((this.enterDate==null && other.getEnterDate()==null) || 
             (this.enterDate!=null &&
              this.enterDate.equals(other.getEnterDate())));
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
        if (getCountDayForExpire() != null) {
            _hashCode += getCountDayForExpire().hashCode();
        }
        if (getEnterDate() != null) {
            _hashCode += getEnterDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpirePasswordBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "expirePasswordBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countDayForExpire");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countDayForExpire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enterDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enterDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
