/**
 * TopupPreviewResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class TopupPreviewResponseBean  implements java.io.Serializable {
    private java.lang.String operatorForeignTitle;

    private java.lang.String operatorId;

    private java.lang.String operatorTitle;

    public TopupPreviewResponseBean() {
    }

    public TopupPreviewResponseBean(
           java.lang.String operatorForeignTitle,
           java.lang.String operatorId,
           java.lang.String operatorTitle) {
           this.operatorForeignTitle = operatorForeignTitle;
           this.operatorId = operatorId;
           this.operatorTitle = operatorTitle;
    }


    /**
     * Gets the operatorForeignTitle value for this TopupPreviewResponseBean.
     * 
     * @return operatorForeignTitle
     */
    public java.lang.String getOperatorForeignTitle() {
        return operatorForeignTitle;
    }


    /**
     * Sets the operatorForeignTitle value for this TopupPreviewResponseBean.
     * 
     * @param operatorForeignTitle
     */
    public void setOperatorForeignTitle(java.lang.String operatorForeignTitle) {
        this.operatorForeignTitle = operatorForeignTitle;
    }


    /**
     * Gets the operatorId value for this TopupPreviewResponseBean.
     * 
     * @return operatorId
     */
    public java.lang.String getOperatorId() {
        return operatorId;
    }


    /**
     * Sets the operatorId value for this TopupPreviewResponseBean.
     * 
     * @param operatorId
     */
    public void setOperatorId(java.lang.String operatorId) {
        this.operatorId = operatorId;
    }


    /**
     * Gets the operatorTitle value for this TopupPreviewResponseBean.
     * 
     * @return operatorTitle
     */
    public java.lang.String getOperatorTitle() {
        return operatorTitle;
    }


    /**
     * Sets the operatorTitle value for this TopupPreviewResponseBean.
     * 
     * @param operatorTitle
     */
    public void setOperatorTitle(java.lang.String operatorTitle) {
        this.operatorTitle = operatorTitle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopupPreviewResponseBean)) return false;
        TopupPreviewResponseBean other = (TopupPreviewResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operatorForeignTitle==null && other.getOperatorForeignTitle()==null) || 
             (this.operatorForeignTitle!=null &&
              this.operatorForeignTitle.equals(other.getOperatorForeignTitle()))) &&
            ((this.operatorId==null && other.getOperatorId()==null) || 
             (this.operatorId!=null &&
              this.operatorId.equals(other.getOperatorId()))) &&
            ((this.operatorTitle==null && other.getOperatorTitle()==null) || 
             (this.operatorTitle!=null &&
              this.operatorTitle.equals(other.getOperatorTitle())));
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
        if (getOperatorForeignTitle() != null) {
            _hashCode += getOperatorForeignTitle().hashCode();
        }
        if (getOperatorId() != null) {
            _hashCode += getOperatorId().hashCode();
        }
        if (getOperatorTitle() != null) {
            _hashCode += getOperatorTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TopupPreviewResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "topupPreviewResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorForeignTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatorForeignTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatorTitle"));
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
