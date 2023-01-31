/**
 * InstantInterbankTransferResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class InstantInterbankTransferResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean amountBean;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean commissionResultInfoDto;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InstantInterbankTransferBankBean destinationBank;

    private java.lang.String destinationIBAN;

    private java.lang.String destinationIbanOwnerName;

    private java.lang.String sourceDeposit;

    private java.lang.String traceNumber;

    public InstantInterbankTransferResponseBean() {
    }

    public InstantInterbankTransferResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean amountBean,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean commissionResultInfoDto,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InstantInterbankTransferBankBean destinationBank,
           java.lang.String destinationIBAN,
           java.lang.String destinationIbanOwnerName,
           java.lang.String sourceDeposit,
           java.lang.String traceNumber) {
           this.amountBean = amountBean;
           this.commissionResultInfoDto = commissionResultInfoDto;
           this.destinationBank = destinationBank;
           this.destinationIBAN = destinationIBAN;
           this.destinationIbanOwnerName = destinationIbanOwnerName;
           this.sourceDeposit = sourceDeposit;
           this.traceNumber = traceNumber;
    }


    /**
     * Gets the amountBean value for this InstantInterbankTransferResponseBean.
     * 
     * @return amountBean
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean getAmountBean() {
        return amountBean;
    }


    /**
     * Sets the amountBean value for this InstantInterbankTransferResponseBean.
     * 
     * @param amountBean
     */
    public void setAmountBean(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean amountBean) {
        this.amountBean = amountBean;
    }


    /**
     * Gets the commissionResultInfoDto value for this InstantInterbankTransferResponseBean.
     * 
     * @return commissionResultInfoDto
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean getCommissionResultInfoDto() {
        return commissionResultInfoDto;
    }


    /**
     * Sets the commissionResultInfoDto value for this InstantInterbankTransferResponseBean.
     * 
     * @param commissionResultInfoDto
     */
    public void setCommissionResultInfoDto(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean commissionResultInfoDto) {
        this.commissionResultInfoDto = commissionResultInfoDto;
    }


    /**
     * Gets the destinationBank value for this InstantInterbankTransferResponseBean.
     * 
     * @return destinationBank
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InstantInterbankTransferBankBean getDestinationBank() {
        return destinationBank;
    }


    /**
     * Sets the destinationBank value for this InstantInterbankTransferResponseBean.
     * 
     * @param destinationBank
     */
    public void setDestinationBank(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InstantInterbankTransferBankBean destinationBank) {
        this.destinationBank = destinationBank;
    }


    /**
     * Gets the destinationIBAN value for this InstantInterbankTransferResponseBean.
     * 
     * @return destinationIBAN
     */
    public java.lang.String getDestinationIBAN() {
        return destinationIBAN;
    }


    /**
     * Sets the destinationIBAN value for this InstantInterbankTransferResponseBean.
     * 
     * @param destinationIBAN
     */
    public void setDestinationIBAN(java.lang.String destinationIBAN) {
        this.destinationIBAN = destinationIBAN;
    }


    /**
     * Gets the destinationIbanOwnerName value for this InstantInterbankTransferResponseBean.
     * 
     * @return destinationIbanOwnerName
     */
    public java.lang.String getDestinationIbanOwnerName() {
        return destinationIbanOwnerName;
    }


    /**
     * Sets the destinationIbanOwnerName value for this InstantInterbankTransferResponseBean.
     * 
     * @param destinationIbanOwnerName
     */
    public void setDestinationIbanOwnerName(java.lang.String destinationIbanOwnerName) {
        this.destinationIbanOwnerName = destinationIbanOwnerName;
    }


    /**
     * Gets the sourceDeposit value for this InstantInterbankTransferResponseBean.
     * 
     * @return sourceDeposit
     */
    public java.lang.String getSourceDeposit() {
        return sourceDeposit;
    }


    /**
     * Sets the sourceDeposit value for this InstantInterbankTransferResponseBean.
     * 
     * @param sourceDeposit
     */
    public void setSourceDeposit(java.lang.String sourceDeposit) {
        this.sourceDeposit = sourceDeposit;
    }


    /**
     * Gets the traceNumber value for this InstantInterbankTransferResponseBean.
     * 
     * @return traceNumber
     */
    public java.lang.String getTraceNumber() {
        return traceNumber;
    }


    /**
     * Sets the traceNumber value for this InstantInterbankTransferResponseBean.
     * 
     * @param traceNumber
     */
    public void setTraceNumber(java.lang.String traceNumber) {
        this.traceNumber = traceNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstantInterbankTransferResponseBean)) return false;
        InstantInterbankTransferResponseBean other = (InstantInterbankTransferResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amountBean==null && other.getAmountBean()==null) || 
             (this.amountBean!=null &&
              this.amountBean.equals(other.getAmountBean()))) &&
            ((this.commissionResultInfoDto==null && other.getCommissionResultInfoDto()==null) || 
             (this.commissionResultInfoDto!=null &&
              this.commissionResultInfoDto.equals(other.getCommissionResultInfoDto()))) &&
            ((this.destinationBank==null && other.getDestinationBank()==null) || 
             (this.destinationBank!=null &&
              this.destinationBank.equals(other.getDestinationBank()))) &&
            ((this.destinationIBAN==null && other.getDestinationIBAN()==null) || 
             (this.destinationIBAN!=null &&
              this.destinationIBAN.equals(other.getDestinationIBAN()))) &&
            ((this.destinationIbanOwnerName==null && other.getDestinationIbanOwnerName()==null) || 
             (this.destinationIbanOwnerName!=null &&
              this.destinationIbanOwnerName.equals(other.getDestinationIbanOwnerName()))) &&
            ((this.sourceDeposit==null && other.getSourceDeposit()==null) || 
             (this.sourceDeposit!=null &&
              this.sourceDeposit.equals(other.getSourceDeposit()))) &&
            ((this.traceNumber==null && other.getTraceNumber()==null) || 
             (this.traceNumber!=null &&
              this.traceNumber.equals(other.getTraceNumber())));
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
        if (getAmountBean() != null) {
            _hashCode += getAmountBean().hashCode();
        }
        if (getCommissionResultInfoDto() != null) {
            _hashCode += getCommissionResultInfoDto().hashCode();
        }
        if (getDestinationBank() != null) {
            _hashCode += getDestinationBank().hashCode();
        }
        if (getDestinationIBAN() != null) {
            _hashCode += getDestinationIBAN().hashCode();
        }
        if (getDestinationIbanOwnerName() != null) {
            _hashCode += getDestinationIbanOwnerName().hashCode();
        }
        if (getSourceDeposit() != null) {
            _hashCode += getSourceDeposit().hashCode();
        }
        if (getTraceNumber() != null) {
            _hashCode += getTraceNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstantInterbankTransferResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "instantInterbankTransferResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "amountBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionResultInfoDto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commissionResultInfoDto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "commissionResultInfoBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationBank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "instantInterbankTransferBankBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIBAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationIBAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIbanOwnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationIbanOwnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDeposit"));
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
