/**
 * CardLoanPaymentResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardLoanPaymentResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDepositBean deposit;

    private java.util.Calendar paymentDate;

    private java.lang.String sourcePan;

    private java.lang.String switchResponseRRN;

    private java.lang.String trackingNumber;

    public CardLoanPaymentResponseBean() {
    }

    public CardLoanPaymentResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDepositBean deposit,
           java.util.Calendar paymentDate,
           java.lang.String sourcePan,
           java.lang.String switchResponseRRN,
           java.lang.String trackingNumber) {
           this.deposit = deposit;
           this.paymentDate = paymentDate;
           this.sourcePan = sourcePan;
           this.switchResponseRRN = switchResponseRRN;
           this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the deposit value for this CardLoanPaymentResponseBean.
     * 
     * @return deposit
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDepositBean getDeposit() {
        return deposit;
    }


    /**
     * Sets the deposit value for this CardLoanPaymentResponseBean.
     * 
     * @param deposit
     */
    public void setDeposit(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDepositBean deposit) {
        this.deposit = deposit;
    }


    /**
     * Gets the paymentDate value for this CardLoanPaymentResponseBean.
     * 
     * @return paymentDate
     */
    public java.util.Calendar getPaymentDate() {
        return paymentDate;
    }


    /**
     * Sets the paymentDate value for this CardLoanPaymentResponseBean.
     * 
     * @param paymentDate
     */
    public void setPaymentDate(java.util.Calendar paymentDate) {
        this.paymentDate = paymentDate;
    }


    /**
     * Gets the sourcePan value for this CardLoanPaymentResponseBean.
     * 
     * @return sourcePan
     */
    public java.lang.String getSourcePan() {
        return sourcePan;
    }


    /**
     * Sets the sourcePan value for this CardLoanPaymentResponseBean.
     * 
     * @param sourcePan
     */
    public void setSourcePan(java.lang.String sourcePan) {
        this.sourcePan = sourcePan;
    }


    /**
     * Gets the switchResponseRRN value for this CardLoanPaymentResponseBean.
     * 
     * @return switchResponseRRN
     */
    public java.lang.String getSwitchResponseRRN() {
        return switchResponseRRN;
    }


    /**
     * Sets the switchResponseRRN value for this CardLoanPaymentResponseBean.
     * 
     * @param switchResponseRRN
     */
    public void setSwitchResponseRRN(java.lang.String switchResponseRRN) {
        this.switchResponseRRN = switchResponseRRN;
    }


    /**
     * Gets the trackingNumber value for this CardLoanPaymentResponseBean.
     * 
     * @return trackingNumber
     */
    public java.lang.String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this CardLoanPaymentResponseBean.
     * 
     * @param trackingNumber
     */
    public void setTrackingNumber(java.lang.String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardLoanPaymentResponseBean)) return false;
        CardLoanPaymentResponseBean other = (CardLoanPaymentResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deposit==null && other.getDeposit()==null) || 
             (this.deposit!=null &&
              this.deposit.equals(other.getDeposit()))) &&
            ((this.paymentDate==null && other.getPaymentDate()==null) || 
             (this.paymentDate!=null &&
              this.paymentDate.equals(other.getPaymentDate()))) &&
            ((this.sourcePan==null && other.getSourcePan()==null) || 
             (this.sourcePan!=null &&
              this.sourcePan.equals(other.getSourcePan()))) &&
            ((this.switchResponseRRN==null && other.getSwitchResponseRRN()==null) || 
             (this.switchResponseRRN!=null &&
              this.switchResponseRRN.equals(other.getSwitchResponseRRN()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber())));
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
        if (getDeposit() != null) {
            _hashCode += getDeposit().hashCode();
        }
        if (getPaymentDate() != null) {
            _hashCode += getPaymentDate().hashCode();
        }
        if (getSourcePan() != null) {
            _hashCode += getSourcePan().hashCode();
        }
        if (getSwitchResponseRRN() != null) {
            _hashCode += getSwitchResponseRRN().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardLoanPaymentResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardLoanPaymentResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardDepositBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourcePan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackingNumber"));
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
