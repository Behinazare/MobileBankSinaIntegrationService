/**
 * ERequestVerifyResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ERequestVerifyResponseBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestBaseBean  implements java.io.Serializable {
    private java.util.Calendar actionDate;

    private java.lang.String actionNote;

    public ERequestVerifyResponseBean() {
    }

    public ERequestVerifyResponseBean(
           java.util.Calendar lastStatusChangeDate,
           java.lang.String referenceNumber,
           java.util.Calendar registerDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatus status,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusInfoBean statusInfoBean,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestStatusResponse statusResponse,
           java.util.Calendar actionDate,
           java.lang.String actionNote) {
        super(
            lastStatusChangeDate,
            referenceNumber,
            registerDate,
            status,
            statusInfoBean,
            statusResponse);
        this.actionDate = actionDate;
        this.actionNote = actionNote;
    }


    /**
     * Gets the actionDate value for this ERequestVerifyResponseBean.
     * 
     * @return actionDate
     */
    public java.util.Calendar getActionDate() {
        return actionDate;
    }


    /**
     * Sets the actionDate value for this ERequestVerifyResponseBean.
     * 
     * @param actionDate
     */
    public void setActionDate(java.util.Calendar actionDate) {
        this.actionDate = actionDate;
    }


    /**
     * Gets the actionNote value for this ERequestVerifyResponseBean.
     * 
     * @return actionNote
     */
    public java.lang.String getActionNote() {
        return actionNote;
    }


    /**
     * Sets the actionNote value for this ERequestVerifyResponseBean.
     * 
     * @param actionNote
     */
    public void setActionNote(java.lang.String actionNote) {
        this.actionNote = actionNote;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERequestVerifyResponseBean)) return false;
        ERequestVerifyResponseBean other = (ERequestVerifyResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionDate==null && other.getActionDate()==null) || 
             (this.actionDate!=null &&
              this.actionDate.equals(other.getActionDate()))) &&
            ((this.actionNote==null && other.getActionNote()==null) || 
             (this.actionNote!=null &&
              this.actionNote.equals(other.getActionNote())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getActionDate() != null) {
            _hashCode += getActionDate().hashCode();
        }
        if (getActionNote() != null) {
            _hashCode += getActionNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERequestVerifyResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestVerifyResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionNote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionNote"));
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
