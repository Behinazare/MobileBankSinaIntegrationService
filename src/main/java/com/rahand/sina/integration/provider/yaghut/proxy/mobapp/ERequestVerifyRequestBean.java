/**
 * ERequestVerifyRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ERequestVerifyRequestBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestVerifyAction action;

    private java.lang.String actionType;

    private java.lang.String note;

    private java.lang.String referenceNumber;

    private java.lang.String registeredId;

    public ERequestVerifyRequestBean() {
    }

    public ERequestVerifyRequestBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestVerifyAction action,
           java.lang.String actionType,
           java.lang.String note,
           java.lang.String referenceNumber,
           java.lang.String registeredId) {
           this.action = action;
           this.actionType = actionType;
           this.note = note;
           this.referenceNumber = referenceNumber;
           this.registeredId = registeredId;
    }


    /**
     * Gets the action value for this ERequestVerifyRequestBean.
     * 
     * @return action
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestVerifyAction getAction() {
        return action;
    }


    /**
     * Sets the action value for this ERequestVerifyRequestBean.
     * 
     * @param action
     */
    public void setAction(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestVerifyAction action) {
        this.action = action;
    }


    /**
     * Gets the actionType value for this ERequestVerifyRequestBean.
     * 
     * @return actionType
     */
    public java.lang.String getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this ERequestVerifyRequestBean.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.String actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the note value for this ERequestVerifyRequestBean.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this ERequestVerifyRequestBean.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the referenceNumber value for this ERequestVerifyRequestBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this ERequestVerifyRequestBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the registeredId value for this ERequestVerifyRequestBean.
     * 
     * @return registeredId
     */
    public java.lang.String getRegisteredId() {
        return registeredId;
    }


    /**
     * Sets the registeredId value for this ERequestVerifyRequestBean.
     * 
     * @param registeredId
     */
    public void setRegisteredId(java.lang.String registeredId) {
        this.registeredId = registeredId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERequestVerifyRequestBean)) return false;
        ERequestVerifyRequestBean other = (ERequestVerifyRequestBean) obj;
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
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.registeredId==null && other.getRegisteredId()==null) || 
             (this.registeredId!=null &&
              this.registeredId.equals(other.getRegisteredId())));
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
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getRegisteredId() != null) {
            _hashCode += getRegisteredId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERequestVerifyRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestVerifyRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestVerifyAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registeredId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registeredId"));
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
