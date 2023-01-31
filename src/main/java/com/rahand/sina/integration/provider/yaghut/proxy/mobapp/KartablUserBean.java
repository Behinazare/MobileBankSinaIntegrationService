/**
 * KartablUserBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class KartablUserBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablAssignedUserBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserActionWS lastAction;

    private java.util.Calendar lastActionDate;

    private java.lang.String lastActionNote;

    public KartablUserBean() {
    }

    public KartablUserBean(
           boolean activeUser,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenderWS gender,
           java.lang.String name,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserRoleWS role,
           java.lang.String userId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserActionWS lastAction,
           java.util.Calendar lastActionDate,
           java.lang.String lastActionNote) {
        super(
            activeUser,
            gender,
            name,
            role,
            userId);
        this.lastAction = lastAction;
        this.lastActionDate = lastActionDate;
        this.lastActionNote = lastActionNote;
    }


    /**
     * Gets the lastAction value for this KartablUserBean.
     * 
     * @return lastAction
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserActionWS getLastAction() {
        return lastAction;
    }


    /**
     * Sets the lastAction value for this KartablUserBean.
     * 
     * @param lastAction
     */
    public void setLastAction(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserActionWS lastAction) {
        this.lastAction = lastAction;
    }


    /**
     * Gets the lastActionDate value for this KartablUserBean.
     * 
     * @return lastActionDate
     */
    public java.util.Calendar getLastActionDate() {
        return lastActionDate;
    }


    /**
     * Sets the lastActionDate value for this KartablUserBean.
     * 
     * @param lastActionDate
     */
    public void setLastActionDate(java.util.Calendar lastActionDate) {
        this.lastActionDate = lastActionDate;
    }


    /**
     * Gets the lastActionNote value for this KartablUserBean.
     * 
     * @return lastActionNote
     */
    public java.lang.String getLastActionNote() {
        return lastActionNote;
    }


    /**
     * Sets the lastActionNote value for this KartablUserBean.
     * 
     * @param lastActionNote
     */
    public void setLastActionNote(java.lang.String lastActionNote) {
        this.lastActionNote = lastActionNote;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KartablUserBean)) return false;
        KartablUserBean other = (KartablUserBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lastAction==null && other.getLastAction()==null) || 
             (this.lastAction!=null &&
              this.lastAction.equals(other.getLastAction()))) &&
            ((this.lastActionDate==null && other.getLastActionDate()==null) || 
             (this.lastActionDate!=null &&
              this.lastActionDate.equals(other.getLastActionDate()))) &&
            ((this.lastActionNote==null && other.getLastActionNote()==null) || 
             (this.lastActionNote!=null &&
              this.lastActionNote.equals(other.getLastActionNote())));
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
        if (getLastAction() != null) {
            _hashCode += getLastAction().hashCode();
        }
        if (getLastActionDate() != null) {
            _hashCode += getLastActionDate().hashCode();
        }
        if (getLastActionNote() != null) {
            _hashCode += getLastActionNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KartablUserBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablUserBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablUserActionWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastActionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActionNote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastActionNote"));
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
