/**
 * ReqStatusBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ReqStatusBean  implements java.io.Serializable {
    private java.lang.String applyAmount;

    private java.lang.String currency;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RequestStatusTypeWS requestStatus;

    private java.util.Calendar requestTime;

    private java.lang.String switchResponseRRN;

    private java.lang.String traceNumber;

    private java.lang.String trackerId;

    public ReqStatusBean() {
    }

    public ReqStatusBean(
           java.lang.String applyAmount,
           java.lang.String currency,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RequestStatusTypeWS requestStatus,
           java.util.Calendar requestTime,
           java.lang.String switchResponseRRN,
           java.lang.String traceNumber,
           java.lang.String trackerId) {
           this.applyAmount = applyAmount;
           this.currency = currency;
           this.requestStatus = requestStatus;
           this.requestTime = requestTime;
           this.switchResponseRRN = switchResponseRRN;
           this.traceNumber = traceNumber;
           this.trackerId = trackerId;
    }


    /**
     * Gets the applyAmount value for this ReqStatusBean.
     * 
     * @return applyAmount
     */
    public java.lang.String getApplyAmount() {
        return applyAmount;
    }


    /**
     * Sets the applyAmount value for this ReqStatusBean.
     * 
     * @param applyAmount
     */
    public void setApplyAmount(java.lang.String applyAmount) {
        this.applyAmount = applyAmount;
    }


    /**
     * Gets the currency value for this ReqStatusBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ReqStatusBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the requestStatus value for this ReqStatusBean.
     * 
     * @return requestStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RequestStatusTypeWS getRequestStatus() {
        return requestStatus;
    }


    /**
     * Sets the requestStatus value for this ReqStatusBean.
     * 
     * @param requestStatus
     */
    public void setRequestStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.RequestStatusTypeWS requestStatus) {
        this.requestStatus = requestStatus;
    }


    /**
     * Gets the requestTime value for this ReqStatusBean.
     * 
     * @return requestTime
     */
    public java.util.Calendar getRequestTime() {
        return requestTime;
    }


    /**
     * Sets the requestTime value for this ReqStatusBean.
     * 
     * @param requestTime
     */
    public void setRequestTime(java.util.Calendar requestTime) {
        this.requestTime = requestTime;
    }


    /**
     * Gets the switchResponseRRN value for this ReqStatusBean.
     * 
     * @return switchResponseRRN
     */
    public java.lang.String getSwitchResponseRRN() {
        return switchResponseRRN;
    }


    /**
     * Sets the switchResponseRRN value for this ReqStatusBean.
     * 
     * @param switchResponseRRN
     */
    public void setSwitchResponseRRN(java.lang.String switchResponseRRN) {
        this.switchResponseRRN = switchResponseRRN;
    }


    /**
     * Gets the traceNumber value for this ReqStatusBean.
     * 
     * @return traceNumber
     */
    public java.lang.String getTraceNumber() {
        return traceNumber;
    }


    /**
     * Sets the traceNumber value for this ReqStatusBean.
     * 
     * @param traceNumber
     */
    public void setTraceNumber(java.lang.String traceNumber) {
        this.traceNumber = traceNumber;
    }


    /**
     * Gets the trackerId value for this ReqStatusBean.
     * 
     * @return trackerId
     */
    public java.lang.String getTrackerId() {
        return trackerId;
    }


    /**
     * Sets the trackerId value for this ReqStatusBean.
     * 
     * @param trackerId
     */
    public void setTrackerId(java.lang.String trackerId) {
        this.trackerId = trackerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReqStatusBean)) return false;
        ReqStatusBean other = (ReqStatusBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applyAmount==null && other.getApplyAmount()==null) || 
             (this.applyAmount!=null &&
              this.applyAmount.equals(other.getApplyAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.requestStatus==null && other.getRequestStatus()==null) || 
             (this.requestStatus!=null &&
              this.requestStatus.equals(other.getRequestStatus()))) &&
            ((this.requestTime==null && other.getRequestTime()==null) || 
             (this.requestTime!=null &&
              this.requestTime.equals(other.getRequestTime()))) &&
            ((this.switchResponseRRN==null && other.getSwitchResponseRRN()==null) || 
             (this.switchResponseRRN!=null &&
              this.switchResponseRRN.equals(other.getSwitchResponseRRN()))) &&
            ((this.traceNumber==null && other.getTraceNumber()==null) || 
             (this.traceNumber!=null &&
              this.traceNumber.equals(other.getTraceNumber()))) &&
            ((this.trackerId==null && other.getTrackerId()==null) || 
             (this.trackerId!=null &&
              this.trackerId.equals(other.getTrackerId())));
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
        if (getApplyAmount() != null) {
            _hashCode += getApplyAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getRequestStatus() != null) {
            _hashCode += getRequestStatus().hashCode();
        }
        if (getRequestTime() != null) {
            _hashCode += getRequestTime().hashCode();
        }
        if (getSwitchResponseRRN() != null) {
            _hashCode += getSwitchResponseRRN().hashCode();
        }
        if (getTraceNumber() != null) {
            _hashCode += getTraceNumber().hashCode();
        }
        if (getTrackerId() != null) {
            _hashCode += getTrackerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReqStatusBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "reqStatusBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applyAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "requestStatusTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchResponseRRN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchResponseRRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackerId"));
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
