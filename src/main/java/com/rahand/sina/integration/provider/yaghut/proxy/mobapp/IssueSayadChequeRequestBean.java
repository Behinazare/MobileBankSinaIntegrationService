/**
 * IssueSayadChequeRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class IssueSayadChequeRequestBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String cif;

    private java.lang.String description;

    private java.lang.String destinationIban;

    private java.util.Calendar dueDate;

    private java.lang.String reasonCode;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean[] receivers;

    private java.lang.String sayadId;

    private java.lang.String serialNumber;

    private java.lang.String seriesNumber;

    public IssueSayadChequeRequestBean() {
    }

    public IssueSayadChequeRequestBean(
           java.math.BigDecimal amount,
           java.lang.String cif,
           java.lang.String description,
           java.lang.String destinationIban,
           java.util.Calendar dueDate,
           java.lang.String reasonCode,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean[] receivers,
           java.lang.String sayadId,
           java.lang.String serialNumber,
           java.lang.String seriesNumber) {
           this.amount = amount;
           this.cif = cif;
           this.description = description;
           this.destinationIban = destinationIban;
           this.dueDate = dueDate;
           this.reasonCode = reasonCode;
           this.receivers = receivers;
           this.sayadId = sayadId;
           this.serialNumber = serialNumber;
           this.seriesNumber = seriesNumber;
    }


    /**
     * Gets the amount value for this IssueSayadChequeRequestBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this IssueSayadChequeRequestBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cif value for this IssueSayadChequeRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this IssueSayadChequeRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the description value for this IssueSayadChequeRequestBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this IssueSayadChequeRequestBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the destinationIban value for this IssueSayadChequeRequestBean.
     * 
     * @return destinationIban
     */
    public java.lang.String getDestinationIban() {
        return destinationIban;
    }


    /**
     * Sets the destinationIban value for this IssueSayadChequeRequestBean.
     * 
     * @param destinationIban
     */
    public void setDestinationIban(java.lang.String destinationIban) {
        this.destinationIban = destinationIban;
    }


    /**
     * Gets the dueDate value for this IssueSayadChequeRequestBean.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this IssueSayadChequeRequestBean.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the reasonCode value for this IssueSayadChequeRequestBean.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this IssueSayadChequeRequestBean.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the receivers value for this IssueSayadChequeRequestBean.
     * 
     * @return receivers
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean[] getReceivers() {
        return receivers;
    }


    /**
     * Sets the receivers value for this IssueSayadChequeRequestBean.
     * 
     * @param receivers
     */
    public void setReceivers(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean[] receivers) {
        this.receivers = receivers;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean getReceivers(int i) {
        return this.receivers[i];
    }

    public void setReceivers(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean _value) {
        this.receivers[i] = _value;
    }


    /**
     * Gets the sayadId value for this IssueSayadChequeRequestBean.
     * 
     * @return sayadId
     */
    public java.lang.String getSayadId() {
        return sayadId;
    }


    /**
     * Sets the sayadId value for this IssueSayadChequeRequestBean.
     * 
     * @param sayadId
     */
    public void setSayadId(java.lang.String sayadId) {
        this.sayadId = sayadId;
    }


    /**
     * Gets the serialNumber value for this IssueSayadChequeRequestBean.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this IssueSayadChequeRequestBean.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the seriesNumber value for this IssueSayadChequeRequestBean.
     * 
     * @return seriesNumber
     */
    public java.lang.String getSeriesNumber() {
        return seriesNumber;
    }


    /**
     * Sets the seriesNumber value for this IssueSayadChequeRequestBean.
     * 
     * @param seriesNumber
     */
    public void setSeriesNumber(java.lang.String seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IssueSayadChequeRequestBean)) return false;
        IssueSayadChequeRequestBean other = (IssueSayadChequeRequestBean) obj;
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
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.destinationIban==null && other.getDestinationIban()==null) || 
             (this.destinationIban!=null &&
              this.destinationIban.equals(other.getDestinationIban()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.receivers==null && other.getReceivers()==null) || 
             (this.receivers!=null &&
              java.util.Arrays.equals(this.receivers, other.getReceivers()))) &&
            ((this.sayadId==null && other.getSayadId()==null) || 
             (this.sayadId!=null &&
              this.sayadId.equals(other.getSayadId()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.seriesNumber==null && other.getSeriesNumber()==null) || 
             (this.seriesNumber!=null &&
              this.seriesNumber.equals(other.getSeriesNumber())));
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
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDestinationIban() != null) {
            _hashCode += getDestinationIban().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getReceivers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceivers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceivers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSayadId() != null) {
            _hashCode += getSayadId().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getSeriesNumber() != null) {
            _hashCode += getSeriesNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssueSayadChequeRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "issueSayadChequeRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationIban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receivers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeReceiverBean"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sayadId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sayadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seriesNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seriesNumber"));
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
