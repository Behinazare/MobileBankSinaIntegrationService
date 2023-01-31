/**
 * PeriodicRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PeriodicRequestBean  implements java.io.Serializable {
    private java.lang.String depositNumber;

    private short durationLength;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PeriodicDurationType durationType;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaAddressBean[] mediaAddresses;

    private java.util.Calendar registerDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaType[] sendResponses;

    public PeriodicRequestBean() {
    }

    public PeriodicRequestBean(
           java.lang.String depositNumber,
           short durationLength,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PeriodicDurationType durationType,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaAddressBean[] mediaAddresses,
           java.util.Calendar registerDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaType[] sendResponses) {
           this.depositNumber = depositNumber;
           this.durationLength = durationLength;
           this.durationType = durationType;
           this.mediaAddresses = mediaAddresses;
           this.registerDate = registerDate;
           this.sendResponses = sendResponses;
    }


    /**
     * Gets the depositNumber value for this PeriodicRequestBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this PeriodicRequestBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the durationLength value for this PeriodicRequestBean.
     * 
     * @return durationLength
     */
    public short getDurationLength() {
        return durationLength;
    }


    /**
     * Sets the durationLength value for this PeriodicRequestBean.
     * 
     * @param durationLength
     */
    public void setDurationLength(short durationLength) {
        this.durationLength = durationLength;
    }


    /**
     * Gets the durationType value for this PeriodicRequestBean.
     * 
     * @return durationType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PeriodicDurationType getDurationType() {
        return durationType;
    }


    /**
     * Sets the durationType value for this PeriodicRequestBean.
     * 
     * @param durationType
     */
    public void setDurationType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PeriodicDurationType durationType) {
        this.durationType = durationType;
    }


    /**
     * Gets the mediaAddresses value for this PeriodicRequestBean.
     * 
     * @return mediaAddresses
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaAddressBean[] getMediaAddresses() {
        return mediaAddresses;
    }


    /**
     * Sets the mediaAddresses value for this PeriodicRequestBean.
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


    /**
     * Gets the registerDate value for this PeriodicRequestBean.
     * 
     * @return registerDate
     */
    public java.util.Calendar getRegisterDate() {
        return registerDate;
    }


    /**
     * Sets the registerDate value for this PeriodicRequestBean.
     * 
     * @param registerDate
     */
    public void setRegisterDate(java.util.Calendar registerDate) {
        this.registerDate = registerDate;
    }


    /**
     * Gets the sendResponses value for this PeriodicRequestBean.
     * 
     * @return sendResponses
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaType[] getSendResponses() {
        return sendResponses;
    }


    /**
     * Sets the sendResponses value for this PeriodicRequestBean.
     * 
     * @param sendResponses
     */
    public void setSendResponses(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaType[] sendResponses) {
        this.sendResponses = sendResponses;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaType getSendResponses(int i) {
        return this.sendResponses[i];
    }

    public void setSendResponses(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MediaType _value) {
        this.sendResponses[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PeriodicRequestBean)) return false;
        PeriodicRequestBean other = (PeriodicRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            this.durationLength == other.getDurationLength() &&
            ((this.durationType==null && other.getDurationType()==null) || 
             (this.durationType!=null &&
              this.durationType.equals(other.getDurationType()))) &&
            ((this.mediaAddresses==null && other.getMediaAddresses()==null) || 
             (this.mediaAddresses!=null &&
              java.util.Arrays.equals(this.mediaAddresses, other.getMediaAddresses()))) &&
            ((this.registerDate==null && other.getRegisterDate()==null) || 
             (this.registerDate!=null &&
              this.registerDate.equals(other.getRegisterDate()))) &&
            ((this.sendResponses==null && other.getSendResponses()==null) || 
             (this.sendResponses!=null &&
              java.util.Arrays.equals(this.sendResponses, other.getSendResponses())));
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
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        _hashCode += getDurationLength();
        if (getDurationType() != null) {
            _hashCode += getDurationType().hashCode();
        }
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
        if (getRegisterDate() != null) {
            _hashCode += getRegisterDate().hashCode();
        }
        if (getSendResponses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSendResponses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSendResponses(), i);
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
        new org.apache.axis.description.TypeDesc(PeriodicRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "periodicRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "durationLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "durationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "periodicDurationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "mediaAddressBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendResponses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendResponses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "mediaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
