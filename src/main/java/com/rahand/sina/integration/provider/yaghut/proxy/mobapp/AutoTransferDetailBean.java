/**
 * AutoTransferDetailBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AutoTransferDetailBean  implements java.io.Serializable {
    private java.lang.Boolean disable;

    private java.util.Calendar endDate;

    private long failedCount;

    private java.lang.String note;

    private java.util.Calendar registerDate;

    private java.lang.String serial;

    private java.lang.String sourceDepositNumber;

    private java.util.Calendar startDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferStatusWS status;

    private java.lang.Short successTransactionNumber;

    private long suspendedCount;

    private java.lang.Short transactionCount;

    private long unProcessedCount;

    public AutoTransferDetailBean() {
    }

    public AutoTransferDetailBean(
           java.lang.Boolean disable,
           java.util.Calendar endDate,
           long failedCount,
           java.lang.String note,
           java.util.Calendar registerDate,
           java.lang.String serial,
           java.lang.String sourceDepositNumber,
           java.util.Calendar startDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferStatusWS status,
           java.lang.Short successTransactionNumber,
           long suspendedCount,
           java.lang.Short transactionCount,
           long unProcessedCount) {
           this.disable = disable;
           this.endDate = endDate;
           this.failedCount = failedCount;
           this.note = note;
           this.registerDate = registerDate;
           this.serial = serial;
           this.sourceDepositNumber = sourceDepositNumber;
           this.startDate = startDate;
           this.status = status;
           this.successTransactionNumber = successTransactionNumber;
           this.suspendedCount = suspendedCount;
           this.transactionCount = transactionCount;
           this.unProcessedCount = unProcessedCount;
    }


    /**
     * Gets the disable value for this AutoTransferDetailBean.
     * 
     * @return disable
     */
    public java.lang.Boolean getDisable() {
        return disable;
    }


    /**
     * Sets the disable value for this AutoTransferDetailBean.
     * 
     * @param disable
     */
    public void setDisable(java.lang.Boolean disable) {
        this.disable = disable;
    }


    /**
     * Gets the endDate value for this AutoTransferDetailBean.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this AutoTransferDetailBean.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the failedCount value for this AutoTransferDetailBean.
     * 
     * @return failedCount
     */
    public long getFailedCount() {
        return failedCount;
    }


    /**
     * Sets the failedCount value for this AutoTransferDetailBean.
     * 
     * @param failedCount
     */
    public void setFailedCount(long failedCount) {
        this.failedCount = failedCount;
    }


    /**
     * Gets the note value for this AutoTransferDetailBean.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this AutoTransferDetailBean.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the registerDate value for this AutoTransferDetailBean.
     * 
     * @return registerDate
     */
    public java.util.Calendar getRegisterDate() {
        return registerDate;
    }


    /**
     * Sets the registerDate value for this AutoTransferDetailBean.
     * 
     * @param registerDate
     */
    public void setRegisterDate(java.util.Calendar registerDate) {
        this.registerDate = registerDate;
    }


    /**
     * Gets the serial value for this AutoTransferDetailBean.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this AutoTransferDetailBean.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the sourceDepositNumber value for this AutoTransferDetailBean.
     * 
     * @return sourceDepositNumber
     */
    public java.lang.String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this AutoTransferDetailBean.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(java.lang.String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the startDate value for this AutoTransferDetailBean.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AutoTransferDetailBean.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this AutoTransferDetailBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferStatusWS getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AutoTransferDetailBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferStatusWS status) {
        this.status = status;
    }


    /**
     * Gets the successTransactionNumber value for this AutoTransferDetailBean.
     * 
     * @return successTransactionNumber
     */
    public java.lang.Short getSuccessTransactionNumber() {
        return successTransactionNumber;
    }


    /**
     * Sets the successTransactionNumber value for this AutoTransferDetailBean.
     * 
     * @param successTransactionNumber
     */
    public void setSuccessTransactionNumber(java.lang.Short successTransactionNumber) {
        this.successTransactionNumber = successTransactionNumber;
    }


    /**
     * Gets the suspendedCount value for this AutoTransferDetailBean.
     * 
     * @return suspendedCount
     */
    public long getSuspendedCount() {
        return suspendedCount;
    }


    /**
     * Sets the suspendedCount value for this AutoTransferDetailBean.
     * 
     * @param suspendedCount
     */
    public void setSuspendedCount(long suspendedCount) {
        this.suspendedCount = suspendedCount;
    }


    /**
     * Gets the transactionCount value for this AutoTransferDetailBean.
     * 
     * @return transactionCount
     */
    public java.lang.Short getTransactionCount() {
        return transactionCount;
    }


    /**
     * Sets the transactionCount value for this AutoTransferDetailBean.
     * 
     * @param transactionCount
     */
    public void setTransactionCount(java.lang.Short transactionCount) {
        this.transactionCount = transactionCount;
    }


    /**
     * Gets the unProcessedCount value for this AutoTransferDetailBean.
     * 
     * @return unProcessedCount
     */
    public long getUnProcessedCount() {
        return unProcessedCount;
    }


    /**
     * Sets the unProcessedCount value for this AutoTransferDetailBean.
     * 
     * @param unProcessedCount
     */
    public void setUnProcessedCount(long unProcessedCount) {
        this.unProcessedCount = unProcessedCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoTransferDetailBean)) return false;
        AutoTransferDetailBean other = (AutoTransferDetailBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.disable==null && other.getDisable()==null) || 
             (this.disable!=null &&
              this.disable.equals(other.getDisable()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            this.failedCount == other.getFailedCount() &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.registerDate==null && other.getRegisterDate()==null) || 
             (this.registerDate!=null &&
              this.registerDate.equals(other.getRegisterDate()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.successTransactionNumber==null && other.getSuccessTransactionNumber()==null) || 
             (this.successTransactionNumber!=null &&
              this.successTransactionNumber.equals(other.getSuccessTransactionNumber()))) &&
            this.suspendedCount == other.getSuspendedCount() &&
            ((this.transactionCount==null && other.getTransactionCount()==null) || 
             (this.transactionCount!=null &&
              this.transactionCount.equals(other.getTransactionCount()))) &&
            this.unProcessedCount == other.getUnProcessedCount();
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
        if (getDisable() != null) {
            _hashCode += getDisable().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        _hashCode += new Long(getFailedCount()).hashCode();
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getRegisterDate() != null) {
            _hashCode += getRegisterDate().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getSourceDepositNumber() != null) {
            _hashCode += getSourceDepositNumber().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSuccessTransactionNumber() != null) {
            _hashCode += getSuccessTransactionNumber().hashCode();
        }
        _hashCode += new Long(getSuspendedCount()).hashCode();
        if (getTransactionCount() != null) {
            _hashCode += getTransactionCount().hashCode();
        }
        _hashCode += new Long(getUnProcessedCount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoTransferDetailBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoTransferDetailBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("failedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("sourceDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDepositNumber"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoTransferStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successTransactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "successTransactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suspendedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unProcessedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unProcessedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
