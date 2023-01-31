/**
 * OpenDepositRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class OpenDepositRequestBean  implements java.io.Serializable {
    private java.lang.String addressId;

    private java.lang.String branchCode;

    private java.lang.String cif;

    private java.lang.String currency;

    private java.lang.Long depositBranchCode;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS depositGroup;

    private long depositType;

    private java.lang.String email;

    private java.lang.String fax;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InvestmentDepositBean investmentDeposit;

    private java.lang.String mobile;

    private java.util.Calendar reportDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InaugurateDepositDurationUnitWS reportDurationUnit;

    private java.lang.String sameSignatureDepositNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SavingDepositBean savingDeposit;

    private java.math.BigDecimal withdrawableAmount;

    private java.lang.String withdrawableDeposit;

    public OpenDepositRequestBean() {
    }

    public OpenDepositRequestBean(
           java.lang.String addressId,
           java.lang.String branchCode,
           java.lang.String cif,
           java.lang.String currency,
           java.lang.Long depositBranchCode,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS depositGroup,
           long depositType,
           java.lang.String email,
           java.lang.String fax,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InvestmentDepositBean investmentDeposit,
           java.lang.String mobile,
           java.util.Calendar reportDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InaugurateDepositDurationUnitWS reportDurationUnit,
           java.lang.String sameSignatureDepositNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SavingDepositBean savingDeposit,
           java.math.BigDecimal withdrawableAmount,
           java.lang.String withdrawableDeposit) {
           this.addressId = addressId;
           this.branchCode = branchCode;
           this.cif = cif;
           this.currency = currency;
           this.depositBranchCode = depositBranchCode;
           this.depositGroup = depositGroup;
           this.depositType = depositType;
           this.email = email;
           this.fax = fax;
           this.investmentDeposit = investmentDeposit;
           this.mobile = mobile;
           this.reportDate = reportDate;
           this.reportDurationUnit = reportDurationUnit;
           this.sameSignatureDepositNumber = sameSignatureDepositNumber;
           this.savingDeposit = savingDeposit;
           this.withdrawableAmount = withdrawableAmount;
           this.withdrawableDeposit = withdrawableDeposit;
    }


    /**
     * Gets the addressId value for this OpenDepositRequestBean.
     * 
     * @return addressId
     */
    public java.lang.String getAddressId() {
        return addressId;
    }


    /**
     * Sets the addressId value for this OpenDepositRequestBean.
     * 
     * @param addressId
     */
    public void setAddressId(java.lang.String addressId) {
        this.addressId = addressId;
    }


    /**
     * Gets the branchCode value for this OpenDepositRequestBean.
     * 
     * @return branchCode
     */
    public java.lang.String getBranchCode() {
        return branchCode;
    }


    /**
     * Sets the branchCode value for this OpenDepositRequestBean.
     * 
     * @param branchCode
     */
    public void setBranchCode(java.lang.String branchCode) {
        this.branchCode = branchCode;
    }


    /**
     * Gets the cif value for this OpenDepositRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this OpenDepositRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the currency value for this OpenDepositRequestBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OpenDepositRequestBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the depositBranchCode value for this OpenDepositRequestBean.
     * 
     * @return depositBranchCode
     */
    public java.lang.Long getDepositBranchCode() {
        return depositBranchCode;
    }


    /**
     * Sets the depositBranchCode value for this OpenDepositRequestBean.
     * 
     * @param depositBranchCode
     */
    public void setDepositBranchCode(java.lang.Long depositBranchCode) {
        this.depositBranchCode = depositBranchCode;
    }


    /**
     * Gets the depositGroup value for this OpenDepositRequestBean.
     * 
     * @return depositGroup
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS getDepositGroup() {
        return depositGroup;
    }


    /**
     * Sets the depositGroup value for this OpenDepositRequestBean.
     * 
     * @param depositGroup
     */
    public void setDepositGroup(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS depositGroup) {
        this.depositGroup = depositGroup;
    }


    /**
     * Gets the depositType value for this OpenDepositRequestBean.
     * 
     * @return depositType
     */
    public long getDepositType() {
        return depositType;
    }


    /**
     * Sets the depositType value for this OpenDepositRequestBean.
     * 
     * @param depositType
     */
    public void setDepositType(long depositType) {
        this.depositType = depositType;
    }


    /**
     * Gets the email value for this OpenDepositRequestBean.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this OpenDepositRequestBean.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the fax value for this OpenDepositRequestBean.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this OpenDepositRequestBean.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the investmentDeposit value for this OpenDepositRequestBean.
     * 
     * @return investmentDeposit
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InvestmentDepositBean getInvestmentDeposit() {
        return investmentDeposit;
    }


    /**
     * Sets the investmentDeposit value for this OpenDepositRequestBean.
     * 
     * @param investmentDeposit
     */
    public void setInvestmentDeposit(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InvestmentDepositBean investmentDeposit) {
        this.investmentDeposit = investmentDeposit;
    }


    /**
     * Gets the mobile value for this OpenDepositRequestBean.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this OpenDepositRequestBean.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the reportDate value for this OpenDepositRequestBean.
     * 
     * @return reportDate
     */
    public java.util.Calendar getReportDate() {
        return reportDate;
    }


    /**
     * Sets the reportDate value for this OpenDepositRequestBean.
     * 
     * @param reportDate
     */
    public void setReportDate(java.util.Calendar reportDate) {
        this.reportDate = reportDate;
    }


    /**
     * Gets the reportDurationUnit value for this OpenDepositRequestBean.
     * 
     * @return reportDurationUnit
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InaugurateDepositDurationUnitWS getReportDurationUnit() {
        return reportDurationUnit;
    }


    /**
     * Sets the reportDurationUnit value for this OpenDepositRequestBean.
     * 
     * @param reportDurationUnit
     */
    public void setReportDurationUnit(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InaugurateDepositDurationUnitWS reportDurationUnit) {
        this.reportDurationUnit = reportDurationUnit;
    }


    /**
     * Gets the sameSignatureDepositNumber value for this OpenDepositRequestBean.
     * 
     * @return sameSignatureDepositNumber
     */
    public java.lang.String getSameSignatureDepositNumber() {
        return sameSignatureDepositNumber;
    }


    /**
     * Sets the sameSignatureDepositNumber value for this OpenDepositRequestBean.
     * 
     * @param sameSignatureDepositNumber
     */
    public void setSameSignatureDepositNumber(java.lang.String sameSignatureDepositNumber) {
        this.sameSignatureDepositNumber = sameSignatureDepositNumber;
    }


    /**
     * Gets the savingDeposit value for this OpenDepositRequestBean.
     * 
     * @return savingDeposit
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SavingDepositBean getSavingDeposit() {
        return savingDeposit;
    }


    /**
     * Sets the savingDeposit value for this OpenDepositRequestBean.
     * 
     * @param savingDeposit
     */
    public void setSavingDeposit(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SavingDepositBean savingDeposit) {
        this.savingDeposit = savingDeposit;
    }


    /**
     * Gets the withdrawableAmount value for this OpenDepositRequestBean.
     * 
     * @return withdrawableAmount
     */
    public java.math.BigDecimal getWithdrawableAmount() {
        return withdrawableAmount;
    }


    /**
     * Sets the withdrawableAmount value for this OpenDepositRequestBean.
     * 
     * @param withdrawableAmount
     */
    public void setWithdrawableAmount(java.math.BigDecimal withdrawableAmount) {
        this.withdrawableAmount = withdrawableAmount;
    }


    /**
     * Gets the withdrawableDeposit value for this OpenDepositRequestBean.
     * 
     * @return withdrawableDeposit
     */
    public java.lang.String getWithdrawableDeposit() {
        return withdrawableDeposit;
    }


    /**
     * Sets the withdrawableDeposit value for this OpenDepositRequestBean.
     * 
     * @param withdrawableDeposit
     */
    public void setWithdrawableDeposit(java.lang.String withdrawableDeposit) {
        this.withdrawableDeposit = withdrawableDeposit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpenDepositRequestBean)) return false;
        OpenDepositRequestBean other = (OpenDepositRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressId==null && other.getAddressId()==null) || 
             (this.addressId!=null &&
              this.addressId.equals(other.getAddressId()))) &&
            ((this.branchCode==null && other.getBranchCode()==null) || 
             (this.branchCode!=null &&
              this.branchCode.equals(other.getBranchCode()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.depositBranchCode==null && other.getDepositBranchCode()==null) || 
             (this.depositBranchCode!=null &&
              this.depositBranchCode.equals(other.getDepositBranchCode()))) &&
            ((this.depositGroup==null && other.getDepositGroup()==null) || 
             (this.depositGroup!=null &&
              this.depositGroup.equals(other.getDepositGroup()))) &&
            this.depositType == other.getDepositType() &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.investmentDeposit==null && other.getInvestmentDeposit()==null) || 
             (this.investmentDeposit!=null &&
              this.investmentDeposit.equals(other.getInvestmentDeposit()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.reportDate==null && other.getReportDate()==null) || 
             (this.reportDate!=null &&
              this.reportDate.equals(other.getReportDate()))) &&
            ((this.reportDurationUnit==null && other.getReportDurationUnit()==null) || 
             (this.reportDurationUnit!=null &&
              this.reportDurationUnit.equals(other.getReportDurationUnit()))) &&
            ((this.sameSignatureDepositNumber==null && other.getSameSignatureDepositNumber()==null) || 
             (this.sameSignatureDepositNumber!=null &&
              this.sameSignatureDepositNumber.equals(other.getSameSignatureDepositNumber()))) &&
            ((this.savingDeposit==null && other.getSavingDeposit()==null) || 
             (this.savingDeposit!=null &&
              this.savingDeposit.equals(other.getSavingDeposit()))) &&
            ((this.withdrawableAmount==null && other.getWithdrawableAmount()==null) || 
             (this.withdrawableAmount!=null &&
              this.withdrawableAmount.equals(other.getWithdrawableAmount()))) &&
            ((this.withdrawableDeposit==null && other.getWithdrawableDeposit()==null) || 
             (this.withdrawableDeposit!=null &&
              this.withdrawableDeposit.equals(other.getWithdrawableDeposit())));
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
        if (getAddressId() != null) {
            _hashCode += getAddressId().hashCode();
        }
        if (getBranchCode() != null) {
            _hashCode += getBranchCode().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDepositBranchCode() != null) {
            _hashCode += getDepositBranchCode().hashCode();
        }
        if (getDepositGroup() != null) {
            _hashCode += getDepositGroup().hashCode();
        }
        _hashCode += new Long(getDepositType()).hashCode();
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getInvestmentDeposit() != null) {
            _hashCode += getInvestmentDeposit().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getReportDate() != null) {
            _hashCode += getReportDate().hashCode();
        }
        if (getReportDurationUnit() != null) {
            _hashCode += getReportDurationUnit().hashCode();
        }
        if (getSameSignatureDepositNumber() != null) {
            _hashCode += getSameSignatureDepositNumber().hashCode();
        }
        if (getSavingDeposit() != null) {
            _hashCode += getSavingDeposit().hashCode();
        }
        if (getWithdrawableAmount() != null) {
            _hashCode += getWithdrawableAmount().hashCode();
        }
        if (getWithdrawableDeposit() != null) {
            _hashCode += getWithdrawableDeposit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OpenDepositRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "openDepositRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchCode"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositBranchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositBranchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositGroupTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("investmentDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "investmentDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "investmentDepositBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportDurationUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportDurationUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "inaugurateDepositDurationUnitWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameSignatureDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sameSignatureDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savingDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "savingDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "savingDepositBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withdrawableAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "withdrawableAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withdrawableDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "withdrawableDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
