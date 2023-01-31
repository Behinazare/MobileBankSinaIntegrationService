/**
 * ChangeCardStatusRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ChangeCardStatusRequestBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatusCause cause;

    private java.lang.String cif;

    private java.lang.String comment;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDestinationState destinationState;

    private java.lang.String pan;

    public ChangeCardStatusRequestBean() {
    }

    public ChangeCardStatusRequestBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatusCause cause,
           java.lang.String cif,
           java.lang.String comment,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDestinationState destinationState,
           java.lang.String pan) {
           this.cause = cause;
           this.cif = cif;
           this.comment = comment;
           this.destinationState = destinationState;
           this.pan = pan;
    }


    /**
     * Gets the cause value for this ChangeCardStatusRequestBean.
     * 
     * @return cause
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatusCause getCause() {
        return cause;
    }


    /**
     * Sets the cause value for this ChangeCardStatusRequestBean.
     * 
     * @param cause
     */
    public void setCause(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatusCause cause) {
        this.cause = cause;
    }


    /**
     * Gets the cif value for this ChangeCardStatusRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this ChangeCardStatusRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the comment value for this ChangeCardStatusRequestBean.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this ChangeCardStatusRequestBean.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the destinationState value for this ChangeCardStatusRequestBean.
     * 
     * @return destinationState
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDestinationState getDestinationState() {
        return destinationState;
    }


    /**
     * Sets the destinationState value for this ChangeCardStatusRequestBean.
     * 
     * @param destinationState
     */
    public void setDestinationState(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDestinationState destinationState) {
        this.destinationState = destinationState;
    }


    /**
     * Gets the pan value for this ChangeCardStatusRequestBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this ChangeCardStatusRequestBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeCardStatusRequestBean)) return false;
        ChangeCardStatusRequestBean other = (ChangeCardStatusRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cause==null && other.getCause()==null) || 
             (this.cause!=null &&
              this.cause.equals(other.getCause()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.destinationState==null && other.getDestinationState()==null) || 
             (this.destinationState!=null &&
              this.destinationState.equals(other.getDestinationState()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan())));
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
        if (getCause() != null) {
            _hashCode += getCause().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getDestinationState() != null) {
            _hashCode += getDestinationState().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeCardStatusRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "changeCardStatusRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cause");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardStatusCause"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardDestinationState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
