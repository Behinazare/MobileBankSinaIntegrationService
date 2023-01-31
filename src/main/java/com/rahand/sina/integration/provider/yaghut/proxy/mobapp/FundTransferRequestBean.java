/**
 * FundTransferRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class FundTransferRequestBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String cvv2;

    private java.lang.String destination;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositOrPanWS destinationType;

    private java.lang.String expDate;

    private java.lang.String merchantId;

    private java.lang.String pan;

    private java.lang.String pin;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PinType pinType;

    private java.lang.String pspCode;

    private java.lang.String track2;

    private java.lang.String twoPhaseReferenceCode;

    public FundTransferRequestBean() {
    }

    public FundTransferRequestBean(
           java.math.BigDecimal amount,
           java.lang.String cvv2,
           java.lang.String destination,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositOrPanWS destinationType,
           java.lang.String expDate,
           java.lang.String merchantId,
           java.lang.String pan,
           java.lang.String pin,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PinType pinType,
           java.lang.String pspCode,
           java.lang.String track2,
           java.lang.String twoPhaseReferenceCode) {
           this.amount = amount;
           this.cvv2 = cvv2;
           this.destination = destination;
           this.destinationType = destinationType;
           this.expDate = expDate;
           this.merchantId = merchantId;
           this.pan = pan;
           this.pin = pin;
           this.pinType = pinType;
           this.pspCode = pspCode;
           this.track2 = track2;
           this.twoPhaseReferenceCode = twoPhaseReferenceCode;
    }


    /**
     * Gets the amount value for this FundTransferRequestBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this FundTransferRequestBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cvv2 value for this FundTransferRequestBean.
     * 
     * @return cvv2
     */
    public java.lang.String getCvv2() {
        return cvv2;
    }


    /**
     * Sets the cvv2 value for this FundTransferRequestBean.
     * 
     * @param cvv2
     */
    public void setCvv2(java.lang.String cvv2) {
        this.cvv2 = cvv2;
    }


    /**
     * Gets the destination value for this FundTransferRequestBean.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this FundTransferRequestBean.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the destinationType value for this FundTransferRequestBean.
     * 
     * @return destinationType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositOrPanWS getDestinationType() {
        return destinationType;
    }


    /**
     * Sets the destinationType value for this FundTransferRequestBean.
     * 
     * @param destinationType
     */
    public void setDestinationType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositOrPanWS destinationType) {
        this.destinationType = destinationType;
    }


    /**
     * Gets the expDate value for this FundTransferRequestBean.
     * 
     * @return expDate
     */
    public java.lang.String getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this FundTransferRequestBean.
     * 
     * @param expDate
     */
    public void setExpDate(java.lang.String expDate) {
        this.expDate = expDate;
    }


    /**
     * Gets the merchantId value for this FundTransferRequestBean.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this FundTransferRequestBean.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the pan value for this FundTransferRequestBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this FundTransferRequestBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the pin value for this FundTransferRequestBean.
     * 
     * @return pin
     */
    public java.lang.String getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this FundTransferRequestBean.
     * 
     * @param pin
     */
    public void setPin(java.lang.String pin) {
        this.pin = pin;
    }


    /**
     * Gets the pinType value for this FundTransferRequestBean.
     * 
     * @return pinType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PinType getPinType() {
        return pinType;
    }


    /**
     * Sets the pinType value for this FundTransferRequestBean.
     * 
     * @param pinType
     */
    public void setPinType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PinType pinType) {
        this.pinType = pinType;
    }


    /**
     * Gets the pspCode value for this FundTransferRequestBean.
     * 
     * @return pspCode
     */
    public java.lang.String getPspCode() {
        return pspCode;
    }


    /**
     * Sets the pspCode value for this FundTransferRequestBean.
     * 
     * @param pspCode
     */
    public void setPspCode(java.lang.String pspCode) {
        this.pspCode = pspCode;
    }


    /**
     * Gets the track2 value for this FundTransferRequestBean.
     * 
     * @return track2
     */
    public java.lang.String getTrack2() {
        return track2;
    }


    /**
     * Sets the track2 value for this FundTransferRequestBean.
     * 
     * @param track2
     */
    public void setTrack2(java.lang.String track2) {
        this.track2 = track2;
    }


    /**
     * Gets the twoPhaseReferenceCode value for this FundTransferRequestBean.
     * 
     * @return twoPhaseReferenceCode
     */
    public java.lang.String getTwoPhaseReferenceCode() {
        return twoPhaseReferenceCode;
    }


    /**
     * Sets the twoPhaseReferenceCode value for this FundTransferRequestBean.
     * 
     * @param twoPhaseReferenceCode
     */
    public void setTwoPhaseReferenceCode(java.lang.String twoPhaseReferenceCode) {
        this.twoPhaseReferenceCode = twoPhaseReferenceCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FundTransferRequestBean)) return false;
        FundTransferRequestBean other = (FundTransferRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.cvv2==null && other.getCvv2()==null) || 
             (this.cvv2!=null &&
              this.cvv2.equals(other.getCvv2()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.destinationType==null && other.getDestinationType()==null) || 
             (this.destinationType!=null &&
              this.destinationType.equals(other.getDestinationType()))) &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.pinType==null && other.getPinType()==null) || 
             (this.pinType!=null &&
              this.pinType.equals(other.getPinType()))) &&
            ((this.pspCode==null && other.getPspCode()==null) || 
             (this.pspCode!=null &&
              this.pspCode.equals(other.getPspCode()))) &&
            ((this.track2==null && other.getTrack2()==null) || 
             (this.track2!=null &&
              this.track2.equals(other.getTrack2()))) &&
            ((this.twoPhaseReferenceCode==null && other.getTwoPhaseReferenceCode()==null) || 
             (this.twoPhaseReferenceCode!=null &&
              this.twoPhaseReferenceCode.equals(other.getTwoPhaseReferenceCode())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCvv2() != null) {
            _hashCode += getCvv2().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getDestinationType() != null) {
            _hashCode += getDestinationType().hashCode();
        }
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getPinType() != null) {
            _hashCode += getPinType().hashCode();
        }
        if (getPspCode() != null) {
            _hashCode += getPspCode().hashCode();
        }
        if (getTrack2() != null) {
            _hashCode += getTrack2().hashCode();
        }
        if (getTwoPhaseReferenceCode() != null) {
            _hashCode += getTwoPhaseReferenceCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FundTransferRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "fundTransferRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvv2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvv2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositOrPanWS"));
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
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("pinType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pinType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "pinType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pspCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pspCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "track2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("twoPhaseReferenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "twoPhaseReferenceCode"));
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
