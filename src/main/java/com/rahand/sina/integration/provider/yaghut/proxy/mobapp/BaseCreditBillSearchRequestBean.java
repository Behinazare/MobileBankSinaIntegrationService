/**
 * BaseCreditBillSearchRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BaseCreditBillSearchRequestBean  implements java.io.Serializable {
    private java.lang.String cif;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillClearingStatusWS clearingStatus;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillCycleStatusWS cycleStatus;

    private java.lang.String dossierNumber;

    private java.util.Calendar fromEndCycleDate;

    private java.util.Calendar fromStartCycleDate;

    private java.lang.Long length;

    private java.lang.Long offset;

    private java.lang.Boolean showTotalCount;

    private java.util.Calendar toEndCycleDate;

    private java.util.Calendar toStartCycleDate;

    public BaseCreditBillSearchRequestBean() {
    }

    public BaseCreditBillSearchRequestBean(
           java.lang.String cif,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillClearingStatusWS clearingStatus,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillCycleStatusWS cycleStatus,
           java.lang.String dossierNumber,
           java.util.Calendar fromEndCycleDate,
           java.util.Calendar fromStartCycleDate,
           java.lang.Long length,
           java.lang.Long offset,
           java.lang.Boolean showTotalCount,
           java.util.Calendar toEndCycleDate,
           java.util.Calendar toStartCycleDate) {
           this.cif = cif;
           this.clearingStatus = clearingStatus;
           this.cycleStatus = cycleStatus;
           this.dossierNumber = dossierNumber;
           this.fromEndCycleDate = fromEndCycleDate;
           this.fromStartCycleDate = fromStartCycleDate;
           this.length = length;
           this.offset = offset;
           this.showTotalCount = showTotalCount;
           this.toEndCycleDate = toEndCycleDate;
           this.toStartCycleDate = toStartCycleDate;
    }


    /**
     * Gets the cif value for this BaseCreditBillSearchRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this BaseCreditBillSearchRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the clearingStatus value for this BaseCreditBillSearchRequestBean.
     * 
     * @return clearingStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillClearingStatusWS getClearingStatus() {
        return clearingStatus;
    }


    /**
     * Sets the clearingStatus value for this BaseCreditBillSearchRequestBean.
     * 
     * @param clearingStatus
     */
    public void setClearingStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillClearingStatusWS clearingStatus) {
        this.clearingStatus = clearingStatus;
    }


    /**
     * Gets the cycleStatus value for this BaseCreditBillSearchRequestBean.
     * 
     * @return cycleStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillCycleStatusWS getCycleStatus() {
        return cycleStatus;
    }


    /**
     * Sets the cycleStatus value for this BaseCreditBillSearchRequestBean.
     * 
     * @param cycleStatus
     */
    public void setCycleStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillCycleStatusWS cycleStatus) {
        this.cycleStatus = cycleStatus;
    }


    /**
     * Gets the dossierNumber value for this BaseCreditBillSearchRequestBean.
     * 
     * @return dossierNumber
     */
    public java.lang.String getDossierNumber() {
        return dossierNumber;
    }


    /**
     * Sets the dossierNumber value for this BaseCreditBillSearchRequestBean.
     * 
     * @param dossierNumber
     */
    public void setDossierNumber(java.lang.String dossierNumber) {
        this.dossierNumber = dossierNumber;
    }


    /**
     * Gets the fromEndCycleDate value for this BaseCreditBillSearchRequestBean.
     * 
     * @return fromEndCycleDate
     */
    public java.util.Calendar getFromEndCycleDate() {
        return fromEndCycleDate;
    }


    /**
     * Sets the fromEndCycleDate value for this BaseCreditBillSearchRequestBean.
     * 
     * @param fromEndCycleDate
     */
    public void setFromEndCycleDate(java.util.Calendar fromEndCycleDate) {
        this.fromEndCycleDate = fromEndCycleDate;
    }


    /**
     * Gets the fromStartCycleDate value for this BaseCreditBillSearchRequestBean.
     * 
     * @return fromStartCycleDate
     */
    public java.util.Calendar getFromStartCycleDate() {
        return fromStartCycleDate;
    }


    /**
     * Sets the fromStartCycleDate value for this BaseCreditBillSearchRequestBean.
     * 
     * @param fromStartCycleDate
     */
    public void setFromStartCycleDate(java.util.Calendar fromStartCycleDate) {
        this.fromStartCycleDate = fromStartCycleDate;
    }


    /**
     * Gets the length value for this BaseCreditBillSearchRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this BaseCreditBillSearchRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this BaseCreditBillSearchRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this BaseCreditBillSearchRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the showTotalCount value for this BaseCreditBillSearchRequestBean.
     * 
     * @return showTotalCount
     */
    public java.lang.Boolean getShowTotalCount() {
        return showTotalCount;
    }


    /**
     * Sets the showTotalCount value for this BaseCreditBillSearchRequestBean.
     * 
     * @param showTotalCount
     */
    public void setShowTotalCount(java.lang.Boolean showTotalCount) {
        this.showTotalCount = showTotalCount;
    }


    /**
     * Gets the toEndCycleDate value for this BaseCreditBillSearchRequestBean.
     * 
     * @return toEndCycleDate
     */
    public java.util.Calendar getToEndCycleDate() {
        return toEndCycleDate;
    }


    /**
     * Sets the toEndCycleDate value for this BaseCreditBillSearchRequestBean.
     * 
     * @param toEndCycleDate
     */
    public void setToEndCycleDate(java.util.Calendar toEndCycleDate) {
        this.toEndCycleDate = toEndCycleDate;
    }


    /**
     * Gets the toStartCycleDate value for this BaseCreditBillSearchRequestBean.
     * 
     * @return toStartCycleDate
     */
    public java.util.Calendar getToStartCycleDate() {
        return toStartCycleDate;
    }


    /**
     * Sets the toStartCycleDate value for this BaseCreditBillSearchRequestBean.
     * 
     * @param toStartCycleDate
     */
    public void setToStartCycleDate(java.util.Calendar toStartCycleDate) {
        this.toStartCycleDate = toStartCycleDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseCreditBillSearchRequestBean)) return false;
        BaseCreditBillSearchRequestBean other = (BaseCreditBillSearchRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.clearingStatus==null && other.getClearingStatus()==null) || 
             (this.clearingStatus!=null &&
              this.clearingStatus.equals(other.getClearingStatus()))) &&
            ((this.cycleStatus==null && other.getCycleStatus()==null) || 
             (this.cycleStatus!=null &&
              this.cycleStatus.equals(other.getCycleStatus()))) &&
            ((this.dossierNumber==null && other.getDossierNumber()==null) || 
             (this.dossierNumber!=null &&
              this.dossierNumber.equals(other.getDossierNumber()))) &&
            ((this.fromEndCycleDate==null && other.getFromEndCycleDate()==null) || 
             (this.fromEndCycleDate!=null &&
              this.fromEndCycleDate.equals(other.getFromEndCycleDate()))) &&
            ((this.fromStartCycleDate==null && other.getFromStartCycleDate()==null) || 
             (this.fromStartCycleDate!=null &&
              this.fromStartCycleDate.equals(other.getFromStartCycleDate()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.showTotalCount==null && other.getShowTotalCount()==null) || 
             (this.showTotalCount!=null &&
              this.showTotalCount.equals(other.getShowTotalCount()))) &&
            ((this.toEndCycleDate==null && other.getToEndCycleDate()==null) || 
             (this.toEndCycleDate!=null &&
              this.toEndCycleDate.equals(other.getToEndCycleDate()))) &&
            ((this.toStartCycleDate==null && other.getToStartCycleDate()==null) || 
             (this.toStartCycleDate!=null &&
              this.toStartCycleDate.equals(other.getToStartCycleDate())));
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
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getClearingStatus() != null) {
            _hashCode += getClearingStatus().hashCode();
        }
        if (getCycleStatus() != null) {
            _hashCode += getCycleStatus().hashCode();
        }
        if (getDossierNumber() != null) {
            _hashCode += getDossierNumber().hashCode();
        }
        if (getFromEndCycleDate() != null) {
            _hashCode += getFromEndCycleDate().hashCode();
        }
        if (getFromStartCycleDate() != null) {
            _hashCode += getFromStartCycleDate().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getShowTotalCount() != null) {
            _hashCode += getShowTotalCount().hashCode();
        }
        if (getToEndCycleDate() != null) {
            _hashCode += getToEndCycleDate().hashCode();
        }
        if (getToStartCycleDate() != null) {
            _hashCode += getToStartCycleDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseCreditBillSearchRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "baseCreditBillSearchRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clearingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billClearingStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billCycleStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossierNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dossierNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromEndCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromEndCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromStartCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromStartCycleDate"));
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
        elemField.setFieldName("showTotalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showTotalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toEndCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toEndCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toStartCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toStartCycleDate"));
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
