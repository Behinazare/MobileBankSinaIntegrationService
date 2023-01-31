/**
 * FinancialServiceInfoResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class FinancialServiceInfoResponseBean  implements java.io.Serializable {
    private java.lang.String bankName;

    private java.lang.String currency;

    private java.util.Calendar date;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositInfoBean deposit;

    private java.lang.String sourcePan;

    private java.lang.String switchResponseRRN;

    private java.lang.String systemTraceNumber;

    private java.lang.String trackingNumber;

    public FinancialServiceInfoResponseBean() {
    }

    public FinancialServiceInfoResponseBean(
           java.lang.String bankName,
           java.lang.String currency,
           java.util.Calendar date,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositInfoBean deposit,
           java.lang.String sourcePan,
           java.lang.String switchResponseRRN,
           java.lang.String systemTraceNumber,
           java.lang.String trackingNumber) {
           this.bankName = bankName;
           this.currency = currency;
           this.date = date;
           this.deposit = deposit;
           this.sourcePan = sourcePan;
           this.switchResponseRRN = switchResponseRRN;
           this.systemTraceNumber = systemTraceNumber;
           this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the bankName value for this FinancialServiceInfoResponseBean.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this FinancialServiceInfoResponseBean.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the currency value for this FinancialServiceInfoResponseBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this FinancialServiceInfoResponseBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the date value for this FinancialServiceInfoResponseBean.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this FinancialServiceInfoResponseBean.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the deposit value for this FinancialServiceInfoResponseBean.
     * 
     * @return deposit
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositInfoBean getDeposit() {
        return deposit;
    }


    /**
     * Sets the deposit value for this FinancialServiceInfoResponseBean.
     * 
     * @param deposit
     */
    public void setDeposit(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositInfoBean deposit) {
        this.deposit = deposit;
    }


    /**
     * Gets the sourcePan value for this FinancialServiceInfoResponseBean.
     * 
     * @return sourcePan
     */
    public java.lang.String getSourcePan() {
        return sourcePan;
    }


    /**
     * Sets the sourcePan value for this FinancialServiceInfoResponseBean.
     * 
     * @param sourcePan
     */
    public void setSourcePan(java.lang.String sourcePan) {
        this.sourcePan = sourcePan;
    }


    /**
     * Gets the switchResponseRRN value for this FinancialServiceInfoResponseBean.
     * 
     * @return switchResponseRRN
     */
    public java.lang.String getSwitchResponseRRN() {
        return switchResponseRRN;
    }


    /**
     * Sets the switchResponseRRN value for this FinancialServiceInfoResponseBean.
     * 
     * @param switchResponseRRN
     */
    public void setSwitchResponseRRN(java.lang.String switchResponseRRN) {
        this.switchResponseRRN = switchResponseRRN;
    }


    /**
     * Gets the systemTraceNumber value for this FinancialServiceInfoResponseBean.
     * 
     * @return systemTraceNumber
     */
    public java.lang.String getSystemTraceNumber() {
        return systemTraceNumber;
    }


    /**
     * Sets the systemTraceNumber value for this FinancialServiceInfoResponseBean.
     * 
     * @param systemTraceNumber
     */
    public void setSystemTraceNumber(java.lang.String systemTraceNumber) {
        this.systemTraceNumber = systemTraceNumber;
    }


    /**
     * Gets the trackingNumber value for this FinancialServiceInfoResponseBean.
     * 
     * @return trackingNumber
     */
    public java.lang.String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this FinancialServiceInfoResponseBean.
     * 
     * @param trackingNumber
     */
    public void setTrackingNumber(java.lang.String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FinancialServiceInfoResponseBean)) return false;
        FinancialServiceInfoResponseBean other = (FinancialServiceInfoResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.deposit==null && other.getDeposit()==null) || 
             (this.deposit!=null &&
              this.deposit.equals(other.getDeposit()))) &&
            ((this.sourcePan==null && other.getSourcePan()==null) || 
             (this.sourcePan!=null &&
              this.sourcePan.equals(other.getSourcePan()))) &&
            ((this.switchResponseRRN==null && other.getSwitchResponseRRN()==null) || 
             (this.switchResponseRRN!=null &&
              this.switchResponseRRN.equals(other.getSwitchResponseRRN()))) &&
            ((this.systemTraceNumber==null && other.getSystemTraceNumber()==null) || 
             (this.systemTraceNumber!=null &&
              this.systemTraceNumber.equals(other.getSystemTraceNumber()))) &&
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
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDeposit() != null) {
            _hashCode += getDeposit().hashCode();
        }
        if (getSourcePan() != null) {
            _hashCode += getSourcePan().hashCode();
        }
        if (getSwitchResponseRRN() != null) {
            _hashCode += getSwitchResponseRRN().hashCode();
        }
        if (getSystemTraceNumber() != null) {
            _hashCode += getSystemTraceNumber().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FinancialServiceInfoResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "financialServiceInfoResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankName"));
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
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositInfoBean"));
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
        elemField.setFieldName("systemTraceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemTraceNumber"));
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
