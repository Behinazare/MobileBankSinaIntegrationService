/**
 * AutoTransferReportRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AutoTransferReportRequestBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferStatusWS autoTransferStatusWS;

    private java.lang.String cif;

    private java.lang.String depositNumber;

    private java.lang.String destinationDepositNumber;

    private java.util.Calendar endDate;

    private java.lang.Long length;

    private java.math.BigDecimal maxAmount;

    private java.math.BigDecimal minAmount;

    private java.lang.Long offset;

    private java.lang.String serial;

    private java.util.Calendar startDate;

    public AutoTransferReportRequestBean() {
    }

    public AutoTransferReportRequestBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferStatusWS autoTransferStatusWS,
           java.lang.String cif,
           java.lang.String depositNumber,
           java.lang.String destinationDepositNumber,
           java.util.Calendar endDate,
           java.lang.Long length,
           java.math.BigDecimal maxAmount,
           java.math.BigDecimal minAmount,
           java.lang.Long offset,
           java.lang.String serial,
           java.util.Calendar startDate) {
           this.autoTransferStatusWS = autoTransferStatusWS;
           this.cif = cif;
           this.depositNumber = depositNumber;
           this.destinationDepositNumber = destinationDepositNumber;
           this.endDate = endDate;
           this.length = length;
           this.maxAmount = maxAmount;
           this.minAmount = minAmount;
           this.offset = offset;
           this.serial = serial;
           this.startDate = startDate;
    }


    /**
     * Gets the autoTransferStatusWS value for this AutoTransferReportRequestBean.
     * 
     * @return autoTransferStatusWS
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferStatusWS getAutoTransferStatusWS() {
        return autoTransferStatusWS;
    }


    /**
     * Sets the autoTransferStatusWS value for this AutoTransferReportRequestBean.
     * 
     * @param autoTransferStatusWS
     */
    public void setAutoTransferStatusWS(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferStatusWS autoTransferStatusWS) {
        this.autoTransferStatusWS = autoTransferStatusWS;
    }


    /**
     * Gets the cif value for this AutoTransferReportRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this AutoTransferReportRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the depositNumber value for this AutoTransferReportRequestBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this AutoTransferReportRequestBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the destinationDepositNumber value for this AutoTransferReportRequestBean.
     * 
     * @return destinationDepositNumber
     */
    public java.lang.String getDestinationDepositNumber() {
        return destinationDepositNumber;
    }


    /**
     * Sets the destinationDepositNumber value for this AutoTransferReportRequestBean.
     * 
     * @param destinationDepositNumber
     */
    public void setDestinationDepositNumber(java.lang.String destinationDepositNumber) {
        this.destinationDepositNumber = destinationDepositNumber;
    }


    /**
     * Gets the endDate value for this AutoTransferReportRequestBean.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this AutoTransferReportRequestBean.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the length value for this AutoTransferReportRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this AutoTransferReportRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the maxAmount value for this AutoTransferReportRequestBean.
     * 
     * @return maxAmount
     */
    public java.math.BigDecimal getMaxAmount() {
        return maxAmount;
    }


    /**
     * Sets the maxAmount value for this AutoTransferReportRequestBean.
     * 
     * @param maxAmount
     */
    public void setMaxAmount(java.math.BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }


    /**
     * Gets the minAmount value for this AutoTransferReportRequestBean.
     * 
     * @return minAmount
     */
    public java.math.BigDecimal getMinAmount() {
        return minAmount;
    }


    /**
     * Sets the minAmount value for this AutoTransferReportRequestBean.
     * 
     * @param minAmount
     */
    public void setMinAmount(java.math.BigDecimal minAmount) {
        this.minAmount = minAmount;
    }


    /**
     * Gets the offset value for this AutoTransferReportRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this AutoTransferReportRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the serial value for this AutoTransferReportRequestBean.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this AutoTransferReportRequestBean.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the startDate value for this AutoTransferReportRequestBean.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AutoTransferReportRequestBean.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoTransferReportRequestBean)) return false;
        AutoTransferReportRequestBean other = (AutoTransferReportRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoTransferStatusWS==null && other.getAutoTransferStatusWS()==null) || 
             (this.autoTransferStatusWS!=null &&
              this.autoTransferStatusWS.equals(other.getAutoTransferStatusWS()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.destinationDepositNumber==null && other.getDestinationDepositNumber()==null) || 
             (this.destinationDepositNumber!=null &&
              this.destinationDepositNumber.equals(other.getDestinationDepositNumber()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.maxAmount==null && other.getMaxAmount()==null) || 
             (this.maxAmount!=null &&
              this.maxAmount.equals(other.getMaxAmount()))) &&
            ((this.minAmount==null && other.getMinAmount()==null) || 
             (this.minAmount!=null &&
              this.minAmount.equals(other.getMinAmount()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate())));
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
        if (getAutoTransferStatusWS() != null) {
            _hashCode += getAutoTransferStatusWS().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getDestinationDepositNumber() != null) {
            _hashCode += getDestinationDepositNumber().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getMaxAmount() != null) {
            _hashCode += getMaxAmount().hashCode();
        }
        if (getMinAmount() != null) {
            _hashCode += getMinAmount().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoTransferReportRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoTransferReportRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoTransferStatusWS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoTransferStatusWS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoTransferStatusWS"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
