/**
 * KartablAssignableUserBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class KartablAssignableUserBean  implements java.io.Serializable {
    private boolean activeUser;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenderWS gender;

    private java.lang.String name;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserTaskWS role;

    private java.lang.String userId;

    public KartablAssignableUserBean() {
    }

    public KartablAssignableUserBean(
           boolean activeUser,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenderWS gender,
           java.lang.String name,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserTaskWS role,
           java.lang.String userId) {
           this.activeUser = activeUser;
           this.gender = gender;
           this.name = name;
           this.role = role;
           this.userId = userId;
    }


    /**
     * Gets the activeUser value for this KartablAssignableUserBean.
     * 
     * @return activeUser
     */
    public boolean isActiveUser() {
        return activeUser;
    }


    /**
     * Sets the activeUser value for this KartablAssignableUserBean.
     * 
     * @param activeUser
     */
    public void setActiveUser(boolean activeUser) {
        this.activeUser = activeUser;
    }


    /**
     * Gets the gender value for this KartablAssignableUserBean.
     * 
     * @return gender
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenderWS getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this KartablAssignableUserBean.
     * 
     * @param gender
     */
    public void setGender(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenderWS gender) {
        this.gender = gender;
    }


    /**
     * Gets the name value for this KartablAssignableUserBean.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this KartablAssignableUserBean.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the role value for this KartablAssignableUserBean.
     * 
     * @return role
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserTaskWS getRole() {
        return role;
    }


    /**
     * Sets the role value for this KartablAssignableUserBean.
     * 
     * @param role
     */
    public void setRole(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserTaskWS role) {
        this.role = role;
    }


    /**
     * Gets the userId value for this KartablAssignableUserBean.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this KartablAssignableUserBean.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KartablAssignableUserBean)) return false;
        KartablAssignableUserBean other = (KartablAssignableUserBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.activeUser == other.isActiveUser() &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        _hashCode += (isActiveUser() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KartablAssignableUserBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablAssignableUserBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "genderWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablUserTaskWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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
