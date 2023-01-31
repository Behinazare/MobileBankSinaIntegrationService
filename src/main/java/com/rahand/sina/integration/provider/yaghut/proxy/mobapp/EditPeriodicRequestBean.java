/**
 * EditPeriodicRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class EditPeriodicRequestBean  implements java.io.Serializable {
    private boolean enable;

    private long id;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaAddressBean[] mediaAddresses;

    public EditPeriodicRequestBean() {
    }

    public EditPeriodicRequestBean(
           boolean enable,
           long id,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaAddressBean[] mediaAddresses) {
           this.enable = enable;
           this.id = id;
           this.mediaAddresses = mediaAddresses;
    }


    /**
     * Gets the enable value for this EditPeriodicRequestBean.
     * 
     * @return enable
     */
    public boolean isEnable() {
        return enable;
    }


    /**
     * Sets the enable value for this EditPeriodicRequestBean.
     * 
     * @param enable
     */
    public void setEnable(boolean enable) {
        this.enable = enable;
    }


    /**
     * Gets the id value for this EditPeriodicRequestBean.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this EditPeriodicRequestBean.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the mediaAddresses value for this EditPeriodicRequestBean.
     * 
     * @return mediaAddresses
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaAddressBean[] getMediaAddresses() {
        return mediaAddresses;
    }


    /**
     * Sets the mediaAddresses value for this EditPeriodicRequestBean.
     * 
     * @param mediaAddresses
     */
    public void setMediaAddresses(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaAddressBean[] mediaAddresses) {
        this.mediaAddresses = mediaAddresses;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaAddressBean getMediaAddresses(int i) {
        return this.mediaAddresses[i];
    }

    public void setMediaAddresses(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaAddressBean _value) {
        this.mediaAddresses[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditPeriodicRequestBean)) return false;
        EditPeriodicRequestBean other = (EditPeriodicRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.enable == other.isEnable() &&
            this.id == other.getId() &&
            ((this.mediaAddresses==null && other.getMediaAddresses()==null) || 
             (this.mediaAddresses!=null &&
              java.util.Arrays.equals(this.mediaAddresses, other.getMediaAddresses())));
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
        _hashCode += (isEnable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getId()).hashCode();
        if (getMediaAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMediaAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMediaAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EditPeriodicRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "editPeriodicRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "mediaAddressBean"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
