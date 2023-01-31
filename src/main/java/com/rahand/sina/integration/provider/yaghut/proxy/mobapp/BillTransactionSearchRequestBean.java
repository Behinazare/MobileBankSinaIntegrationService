/**
 * BillTransactionSearchRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillTransactionSearchRequestBean  implements java.io.Serializable {
    private java.lang.String billId;

    private java.lang.String cif;

    private java.math.BigDecimal fromAmount;

    private java.util.Calendar fromDate;

    private java.lang.Long length;

    private java.lang.Long offset;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessCodeWS[] processingCodes;

    private java.lang.Boolean showTotalCount;

    private java.math.BigDecimal toAmount;

    private java.util.Calendar toDate;

    public BillTransactionSearchRequestBean() {
    }

    public BillTransactionSearchRequestBean(
           java.lang.String billId,
           java.lang.String cif,
           java.math.BigDecimal fromAmount,
           java.util.Calendar fromDate,
           java.lang.Long length,
           java.lang.Long offset,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessCodeWS[] processingCodes,
           java.lang.Boolean showTotalCount,
           java.math.BigDecimal toAmount,
           java.util.Calendar toDate) {
           this.billId = billId;
           this.cif = cif;
           this.fromAmount = fromAmount;
           this.fromDate = fromDate;
           this.length = length;
           this.offset = offset;
           this.processingCodes = processingCodes;
           this.showTotalCount = showTotalCount;
           this.toAmount = toAmount;
           this.toDate = toDate;
    }


    /**
     * Gets the billId value for this BillTransactionSearchRequestBean.
     * 
     * @return billId
     */
    public java.lang.String getBillId() {
        return billId;
    }


    /**
     * Sets the billId value for this BillTransactionSearchRequestBean.
     * 
     * @param billId
     */
    public void setBillId(java.lang.String billId) {
        this.billId = billId;
    }


    /**
     * Gets the cif value for this BillTransactionSearchRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this BillTransactionSearchRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the fromAmount value for this BillTransactionSearchRequestBean.
     * 
     * @return fromAmount
     */
    public java.math.BigDecimal getFromAmount() {
        return fromAmount;
    }


    /**
     * Sets the fromAmount value for this BillTransactionSearchRequestBean.
     * 
     * @param fromAmount
     */
    public void setFromAmount(java.math.BigDecimal fromAmount) {
        this.fromAmount = fromAmount;
    }


    /**
     * Gets the fromDate value for this BillTransactionSearchRequestBean.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this BillTransactionSearchRequestBean.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the length value for this BillTransactionSearchRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this BillTransactionSearchRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this BillTransactionSearchRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this BillTransactionSearchRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the processingCodes value for this BillTransactionSearchRequestBean.
     * 
     * @return processingCodes
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessCodeWS[] getProcessingCodes() {
        return processingCodes;
    }


    /**
     * Sets the processingCodes value for this BillTransactionSearchRequestBean.
     * 
     * @param processingCodes
     */
    public void setProcessingCodes(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessCodeWS[] processingCodes) {
        this.processingCodes = processingCodes;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessCodeWS getProcessingCodes(int i) {
        return this.processingCodes[i];
    }

    public void setProcessingCodes(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessCodeWS _value) {
        this.processingCodes[i] = _value;
    }


    /**
     * Gets the showTotalCount value for this BillTransactionSearchRequestBean.
     * 
     * @return showTotalCount
     */
    public java.lang.Boolean getShowTotalCount() {
        return showTotalCount;
    }


    /**
     * Sets the showTotalCount value for this BillTransactionSearchRequestBean.
     * 
     * @param showTotalCount
     */
    public void setShowTotalCount(java.lang.Boolean showTotalCount) {
        this.showTotalCount = showTotalCount;
    }


    /**
     * Gets the toAmount value for this BillTransactionSearchRequestBean.
     * 
     * @return toAmount
     */
    public java.math.BigDecimal getToAmount() {
        return toAmount;
    }


    /**
     * Sets the toAmount value for this BillTransactionSearchRequestBean.
     * 
     * @param toAmount
     */
    public void setToAmount(java.math.BigDecimal toAmount) {
        this.toAmount = toAmount;
    }


    /**
     * Gets the toDate value for this BillTransactionSearchRequestBean.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this BillTransactionSearchRequestBean.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillTransactionSearchRequestBean)) return false;
        BillTransactionSearchRequestBean other = (BillTransactionSearchRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billId==null && other.getBillId()==null) || 
             (this.billId!=null &&
              this.billId.equals(other.getBillId()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.fromAmount==null && other.getFromAmount()==null) || 
             (this.fromAmount!=null &&
              this.fromAmount.equals(other.getFromAmount()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.processingCodes==null && other.getProcessingCodes()==null) || 
             (this.processingCodes!=null &&
              java.util.Arrays.equals(this.processingCodes, other.getProcessingCodes()))) &&
            ((this.showTotalCount==null && other.getShowTotalCount()==null) || 
             (this.showTotalCount!=null &&
              this.showTotalCount.equals(other.getShowTotalCount()))) &&
            ((this.toAmount==null && other.getToAmount()==null) || 
             (this.toAmount!=null &&
              this.toAmount.equals(other.getToAmount()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate())));
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
        if (getBillId() != null) {
            _hashCode += getBillId().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getFromAmount() != null) {
            _hashCode += getFromAmount().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getProcessingCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessingCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessingCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShowTotalCount() != null) {
            _hashCode += getShowTotalCount().hashCode();
        }
        if (getToAmount() != null) {
            _hashCode += getToAmount().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillTransactionSearchRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billTransactionSearchRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("fromAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromDate"));
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
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processingCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processCodeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showTotalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showTotalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toDate"));
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
