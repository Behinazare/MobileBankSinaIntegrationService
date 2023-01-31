/**
 * ChangeCardSecondPasswordRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ChangeCardSecondPasswordRequestBean  implements java.io.Serializable {
    private java.lang.String cvv2;

    private java.lang.String expDate;

    private java.lang.String newPin;

    private java.lang.String pan;

    private java.lang.String pin;

    private java.lang.String track2;

    public ChangeCardSecondPasswordRequestBean() {
    }

    public ChangeCardSecondPasswordRequestBean(
           java.lang.String cvv2,
           java.lang.String expDate,
           java.lang.String newPin,
           java.lang.String pan,
           java.lang.String pin,
           java.lang.String track2) {
           this.cvv2 = cvv2;
           this.expDate = expDate;
           this.newPin = newPin;
           this.pan = pan;
           this.pin = pin;
           this.track2 = track2;
    }


    /**
     * Gets the cvv2 value for this ChangeCardSecondPasswordRequestBean.
     * 
     * @return cvv2
     */
    public java.lang.String getCvv2() {
        return cvv2;
    }


    /**
     * Sets the cvv2 value for this ChangeCardSecondPasswordRequestBean.
     * 
     * @param cvv2
     */
    public void setCvv2(java.lang.String cvv2) {
        this.cvv2 = cvv2;
    }


    /**
     * Gets the expDate value for this ChangeCardSecondPasswordRequestBean.
     * 
     * @return expDate
     */
    public java.lang.String getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this ChangeCardSecondPasswordRequestBean.
     * 
     * @param expDate
     */
    public void setExpDate(java.lang.String expDate) {
        this.expDate = expDate;
    }


    /**
     * Gets the newPin value for this ChangeCardSecondPasswordRequestBean.
     * 
     * @return newPin
     */
    public java.lang.String getNewPin() {
        return newPin;
    }


    /**
     * Sets the newPin value for this ChangeCardSecondPasswordRequestBean.
     * 
     * @param newPin
     */
    public void setNewPin(java.lang.String newPin) {
        this.newPin = newPin;
    }


    /**
     * Gets the pan value for this ChangeCardSecondPasswordRequestBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this ChangeCardSecondPasswordRequestBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the pin value for this ChangeCardSecondPasswordRequestBean.
     * 
     * @return pin
     */
    public java.lang.String getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this ChangeCardSecondPasswordRequestBean.
     * 
     * @param pin
     */
    public void setPin(java.lang.String pin) {
        this.pin = pin;
    }


    /**
     * Gets the track2 value for this ChangeCardSecondPasswordRequestBean.
     * 
     * @return track2
     */
    public java.lang.String getTrack2() {
        return track2;
    }


    /**
     * Sets the track2 value for this ChangeCardSecondPasswordRequestBean.
     * 
     * @param track2
     */
    public void setTrack2(java.lang.String track2) {
        this.track2 = track2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeCardSecondPasswordRequestBean)) return false;
        ChangeCardSecondPasswordRequestBean other = (ChangeCardSecondPasswordRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cvv2==null && other.getCvv2()==null) || 
             (this.cvv2!=null &&
              this.cvv2.equals(other.getCvv2()))) &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate()))) &&
            ((this.newPin==null && other.getNewPin()==null) || 
             (this.newPin!=null &&
              this.newPin.equals(other.getNewPin()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.track2==null && other.getTrack2()==null) || 
             (this.track2!=null &&
              this.track2.equals(other.getTrack2())));
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
        if (getCvv2() != null) {
            _hashCode += getCvv2().hashCode();
        }
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        if (getNewPin() != null) {
            _hashCode += getNewPin().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getTrack2() != null) {
            _hashCode += getTrack2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeCardSecondPasswordRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "changeCardSecondPasswordRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvv2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvv2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newPin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "track2"));
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
