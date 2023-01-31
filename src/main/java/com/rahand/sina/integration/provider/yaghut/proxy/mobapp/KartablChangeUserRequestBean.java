/**
 * KartablChangeUserRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class KartablChangeUserRequestBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablChangeUserBean[] changeUsers;

    private java.lang.String kartablId;

    public KartablChangeUserRequestBean() {
    }

    public KartablChangeUserRequestBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablChangeUserBean[] changeUsers,
           java.lang.String kartablId) {
           this.changeUsers = changeUsers;
           this.kartablId = kartablId;
    }


    /**
     * Gets the changeUsers value for this KartablChangeUserRequestBean.
     * 
     * @return changeUsers
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablChangeUserBean[] getChangeUsers() {
        return changeUsers;
    }


    /**
     * Sets the changeUsers value for this KartablChangeUserRequestBean.
     * 
     * @param changeUsers
     */
    public void setChangeUsers(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablChangeUserBean[] changeUsers) {
        this.changeUsers = changeUsers;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablChangeUserBean getChangeUsers(int i) {
        return this.changeUsers[i];
    }

    public void setChangeUsers(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablChangeUserBean _value) {
        this.changeUsers[i] = _value;
    }


    /**
     * Gets the kartablId value for this KartablChangeUserRequestBean.
     * 
     * @return kartablId
     */
    public java.lang.String getKartablId() {
        return kartablId;
    }


    /**
     * Sets the kartablId value for this KartablChangeUserRequestBean.
     * 
     * @param kartablId
     */
    public void setKartablId(java.lang.String kartablId) {
        this.kartablId = kartablId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KartablChangeUserRequestBean)) return false;
        KartablChangeUserRequestBean other = (KartablChangeUserRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeUsers==null && other.getChangeUsers()==null) || 
             (this.changeUsers!=null &&
              java.util.Arrays.equals(this.changeUsers, other.getChangeUsers()))) &&
            ((this.kartablId==null && other.getKartablId()==null) || 
             (this.kartablId!=null &&
              this.kartablId.equals(other.getKartablId())));
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
        if (getChangeUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangeUsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangeUsers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKartablId() != null) {
            _hashCode += getKartablId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KartablChangeUserRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablChangeUserRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablChangeUserBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kartablId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kartablId"));
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
