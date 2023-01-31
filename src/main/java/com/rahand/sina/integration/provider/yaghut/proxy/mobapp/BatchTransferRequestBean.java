/**
 * BatchTransferRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BatchTransferRequestBean  implements java.io.Serializable {
    private java.lang.String additionalDocumentDesc;

    private java.lang.String cif;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationBatchTransferBean[] destinationBatchTransferBeans;

    private java.lang.Boolean ignoreError;

    private java.lang.String reasonCode;

    private java.lang.String sourceDepositNumber;

    private java.lang.String sourceDescription;

    public BatchTransferRequestBean() {
    }

    public BatchTransferRequestBean(
           java.lang.String additionalDocumentDesc,
           java.lang.String cif,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationBatchTransferBean[] destinationBatchTransferBeans,
           java.lang.Boolean ignoreError,
           java.lang.String reasonCode,
           java.lang.String sourceDepositNumber,
           java.lang.String sourceDescription) {
           this.additionalDocumentDesc = additionalDocumentDesc;
           this.cif = cif;
           this.destinationBatchTransferBeans = destinationBatchTransferBeans;
           this.ignoreError = ignoreError;
           this.reasonCode = reasonCode;
           this.sourceDepositNumber = sourceDepositNumber;
           this.sourceDescription = sourceDescription;
    }


    /**
     * Gets the additionalDocumentDesc value for this BatchTransferRequestBean.
     * 
     * @return additionalDocumentDesc
     */
    public java.lang.String getAdditionalDocumentDesc() {
        return additionalDocumentDesc;
    }


    /**
     * Sets the additionalDocumentDesc value for this BatchTransferRequestBean.
     * 
     * @param additionalDocumentDesc
     */
    public void setAdditionalDocumentDesc(java.lang.String additionalDocumentDesc) {
        this.additionalDocumentDesc = additionalDocumentDesc;
    }


    /**
     * Gets the cif value for this BatchTransferRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this BatchTransferRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the destinationBatchTransferBeans value for this BatchTransferRequestBean.
     * 
     * @return destinationBatchTransferBeans
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationBatchTransferBean[] getDestinationBatchTransferBeans() {
        return destinationBatchTransferBeans;
    }


    /**
     * Sets the destinationBatchTransferBeans value for this BatchTransferRequestBean.
     * 
     * @param destinationBatchTransferBeans
     */
    public void setDestinationBatchTransferBeans(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationBatchTransferBean[] destinationBatchTransferBeans) {
        this.destinationBatchTransferBeans = destinationBatchTransferBeans;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationBatchTransferBean getDestinationBatchTransferBeans(int i) {
        return this.destinationBatchTransferBeans[i];
    }

    public void setDestinationBatchTransferBeans(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationBatchTransferBean _value) {
        this.destinationBatchTransferBeans[i] = _value;
    }


    /**
     * Gets the ignoreError value for this BatchTransferRequestBean.
     * 
     * @return ignoreError
     */
    public java.lang.Boolean getIgnoreError() {
        return ignoreError;
    }


    /**
     * Sets the ignoreError value for this BatchTransferRequestBean.
     * 
     * @param ignoreError
     */
    public void setIgnoreError(java.lang.Boolean ignoreError) {
        this.ignoreError = ignoreError;
    }


    /**
     * Gets the reasonCode value for this BatchTransferRequestBean.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this BatchTransferRequestBean.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the sourceDepositNumber value for this BatchTransferRequestBean.
     * 
     * @return sourceDepositNumber
     */
    public java.lang.String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this BatchTransferRequestBean.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(java.lang.String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the sourceDescription value for this BatchTransferRequestBean.
     * 
     * @return sourceDescription
     */
    public java.lang.String getSourceDescription() {
        return sourceDescription;
    }


    /**
     * Sets the sourceDescription value for this BatchTransferRequestBean.
     * 
     * @param sourceDescription
     */
    public void setSourceDescription(java.lang.String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchTransferRequestBean)) return false;
        BatchTransferRequestBean other = (BatchTransferRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalDocumentDesc==null && other.getAdditionalDocumentDesc()==null) || 
             (this.additionalDocumentDesc!=null &&
              this.additionalDocumentDesc.equals(other.getAdditionalDocumentDesc()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.destinationBatchTransferBeans==null && other.getDestinationBatchTransferBeans()==null) || 
             (this.destinationBatchTransferBeans!=null &&
              java.util.Arrays.equals(this.destinationBatchTransferBeans, other.getDestinationBatchTransferBeans()))) &&
            ((this.ignoreError==null && other.getIgnoreError()==null) || 
             (this.ignoreError!=null &&
              this.ignoreError.equals(other.getIgnoreError()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
            ((this.sourceDescription==null && other.getSourceDescription()==null) || 
             (this.sourceDescription!=null &&
              this.sourceDescription.equals(other.getSourceDescription())));
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
        if (getAdditionalDocumentDesc() != null) {
            _hashCode += getAdditionalDocumentDesc().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDestinationBatchTransferBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestinationBatchTransferBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinationBatchTransferBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIgnoreError() != null) {
            _hashCode += getIgnoreError().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getSourceDepositNumber() != null) {
            _hashCode += getSourceDepositNumber().hashCode();
        }
        if (getSourceDescription() != null) {
            _hashCode += getSourceDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchTransferRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "batchTransferRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalDocumentDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalDocumentDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("destinationBatchTransferBeans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationBatchTransferBeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "destinationBatchTransferBean"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ignoreError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("sourceDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDescription"));
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
