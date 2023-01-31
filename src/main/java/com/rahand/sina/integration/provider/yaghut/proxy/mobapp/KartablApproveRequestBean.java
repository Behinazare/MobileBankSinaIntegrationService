/**
 * KartablApproveRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class KartablApproveRequestBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablApproveActionWS action;

    private java.lang.String kartablId;

    private java.lang.String note;

    public KartablApproveRequestBean() {
    }

    public KartablApproveRequestBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablApproveActionWS action,
           java.lang.String kartablId,
           java.lang.String note) {
           this.action = action;
           this.kartablId = kartablId;
           this.note = note;
    }


    /**
     * Gets the action value for this KartablApproveRequestBean.
     * 
     * @return action
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablApproveActionWS getAction() {
        return action;
    }


    /**
     * Sets the action value for this KartablApproveRequestBean.
     * 
     * @param action
     */
    public void setAction(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablApproveActionWS action) {
        this.action = action;
    }


    /**
     * Gets the kartablId value for this KartablApproveRequestBean.
     * 
     * @return kartablId
     */
    public java.lang.String getKartablId() {
        return kartablId;
    }


    /**
     * Sets the kartablId value for this KartablApproveRequestBean.
     * 
     * @param kartablId
     */
    public void setKartablId(java.lang.String kartablId) {
        this.kartablId = kartablId;
    }


    /**
     * Gets the note value for this KartablApproveRequestBean.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this KartablApproveRequestBean.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KartablApproveRequestBean)) return false;
        KartablApproveRequestBean other = (KartablApproveRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.kartablId==null && other.getKartablId()==null) || 
             (this.kartablId!=null &&
              this.kartablId.equals(other.getKartablId()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote())));
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getKartablId() != null) {
            _hashCode += getKartablId().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KartablApproveRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablApproveRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablApproveActionWS"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kartablId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kartablId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "note"));
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
