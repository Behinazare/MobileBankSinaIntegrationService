/**
 * DepositSearchRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositSearchRequestBean  implements java.io.Serializable {
    private java.lang.String cif;

    private java.lang.String[] depositNumbers;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatusWS depositStatus;

    private java.lang.String[] excludeCurrency;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS[] excludeType;

    private java.lang.Boolean includeCreditAccount;

    private java.lang.String[] includeCurrency;

    private java.lang.Boolean includeSupportAccount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS[] includeType;

    private java.lang.Long length;

    private java.lang.Boolean needBlockedAmount;

    private java.lang.Boolean needWithdrawableBalance;

    private java.lang.Long offset;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType[] personality;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus[] signatureStatus;

    public DepositSearchRequestBean() {
    }

    public DepositSearchRequestBean(
           java.lang.String cif,
           java.lang.String[] depositNumbers,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatusWS depositStatus,
           java.lang.String[] excludeCurrency,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS[] excludeType,
           java.lang.Boolean includeCreditAccount,
           java.lang.String[] includeCurrency,
           java.lang.Boolean includeSupportAccount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS[] includeType,
           java.lang.Long length,
           java.lang.Boolean needBlockedAmount,
           java.lang.Boolean needWithdrawableBalance,
           java.lang.Long offset,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType[] personality,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus[] signatureStatus) {
           this.cif = cif;
           this.depositNumbers = depositNumbers;
           this.depositStatus = depositStatus;
           this.excludeCurrency = excludeCurrency;
           this.excludeType = excludeType;
           this.includeCreditAccount = includeCreditAccount;
           this.includeCurrency = includeCurrency;
           this.includeSupportAccount = includeSupportAccount;
           this.includeType = includeType;
           this.length = length;
           this.needBlockedAmount = needBlockedAmount;
           this.needWithdrawableBalance = needWithdrawableBalance;
           this.offset = offset;
           this.personality = personality;
           this.signatureStatus = signatureStatus;
    }


    /**
     * Gets the cif value for this DepositSearchRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this DepositSearchRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the depositNumbers value for this DepositSearchRequestBean.
     * 
     * @return depositNumbers
     */
    public java.lang.String[] getDepositNumbers() {
        return depositNumbers;
    }


    /**
     * Sets the depositNumbers value for this DepositSearchRequestBean.
     * 
     * @param depositNumbers
     */
    public void setDepositNumbers(java.lang.String[] depositNumbers) {
        this.depositNumbers = depositNumbers;
    }

    public java.lang.String getDepositNumbers(int i) {
        return this.depositNumbers[i];
    }

    public void setDepositNumbers(int i, java.lang.String _value) {
        this.depositNumbers[i] = _value;
    }


    /**
     * Gets the depositStatus value for this DepositSearchRequestBean.
     * 
     * @return depositStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatusWS getDepositStatus() {
        return depositStatus;
    }


    /**
     * Sets the depositStatus value for this DepositSearchRequestBean.
     * 
     * @param depositStatus
     */
    public void setDepositStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatusWS depositStatus) {
        this.depositStatus = depositStatus;
    }


    /**
     * Gets the excludeCurrency value for this DepositSearchRequestBean.
     * 
     * @return excludeCurrency
     */
    public java.lang.String[] getExcludeCurrency() {
        return excludeCurrency;
    }


    /**
     * Sets the excludeCurrency value for this DepositSearchRequestBean.
     * 
     * @param excludeCurrency
     */
    public void setExcludeCurrency(java.lang.String[] excludeCurrency) {
        this.excludeCurrency = excludeCurrency;
    }

    public java.lang.String getExcludeCurrency(int i) {
        return this.excludeCurrency[i];
    }

    public void setExcludeCurrency(int i, java.lang.String _value) {
        this.excludeCurrency[i] = _value;
    }


    /**
     * Gets the excludeType value for this DepositSearchRequestBean.
     * 
     * @return excludeType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS[] getExcludeType() {
        return excludeType;
    }


    /**
     * Sets the excludeType value for this DepositSearchRequestBean.
     * 
     * @param excludeType
     */
    public void setExcludeType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS[] excludeType) {
        this.excludeType = excludeType;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS getExcludeType(int i) {
        return this.excludeType[i];
    }

    public void setExcludeType(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS _value) {
        this.excludeType[i] = _value;
    }


    /**
     * Gets the includeCreditAccount value for this DepositSearchRequestBean.
     * 
     * @return includeCreditAccount
     */
    public java.lang.Boolean getIncludeCreditAccount() {
        return includeCreditAccount;
    }


    /**
     * Sets the includeCreditAccount value for this DepositSearchRequestBean.
     * 
     * @param includeCreditAccount
     */
    public void setIncludeCreditAccount(java.lang.Boolean includeCreditAccount) {
        this.includeCreditAccount = includeCreditAccount;
    }


    /**
     * Gets the includeCurrency value for this DepositSearchRequestBean.
     * 
     * @return includeCurrency
     */
    public java.lang.String[] getIncludeCurrency() {
        return includeCurrency;
    }


    /**
     * Sets the includeCurrency value for this DepositSearchRequestBean.
     * 
     * @param includeCurrency
     */
    public void setIncludeCurrency(java.lang.String[] includeCurrency) {
        this.includeCurrency = includeCurrency;
    }

    public java.lang.String getIncludeCurrency(int i) {
        return this.includeCurrency[i];
    }

    public void setIncludeCurrency(int i, java.lang.String _value) {
        this.includeCurrency[i] = _value;
    }


    /**
     * Gets the includeSupportAccount value for this DepositSearchRequestBean.
     * 
     * @return includeSupportAccount
     */
    public java.lang.Boolean getIncludeSupportAccount() {
        return includeSupportAccount;
    }


    /**
     * Sets the includeSupportAccount value for this DepositSearchRequestBean.
     * 
     * @param includeSupportAccount
     */
    public void setIncludeSupportAccount(java.lang.Boolean includeSupportAccount) {
        this.includeSupportAccount = includeSupportAccount;
    }


    /**
     * Gets the includeType value for this DepositSearchRequestBean.
     * 
     * @return includeType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS[] getIncludeType() {
        return includeType;
    }


    /**
     * Sets the includeType value for this DepositSearchRequestBean.
     * 
     * @param includeType
     */
    public void setIncludeType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS[] includeType) {
        this.includeType = includeType;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS getIncludeType(int i) {
        return this.includeType[i];
    }

    public void setIncludeType(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS _value) {
        this.includeType[i] = _value;
    }


    /**
     * Gets the length value for this DepositSearchRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this DepositSearchRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the needBlockedAmount value for this DepositSearchRequestBean.
     * 
     * @return needBlockedAmount
     */
    public java.lang.Boolean getNeedBlockedAmount() {
        return needBlockedAmount;
    }


    /**
     * Sets the needBlockedAmount value for this DepositSearchRequestBean.
     * 
     * @param needBlockedAmount
     */
    public void setNeedBlockedAmount(java.lang.Boolean needBlockedAmount) {
        this.needBlockedAmount = needBlockedAmount;
    }


    /**
     * Gets the needWithdrawableBalance value for this DepositSearchRequestBean.
     * 
     * @return needWithdrawableBalance
     */
    public java.lang.Boolean getNeedWithdrawableBalance() {
        return needWithdrawableBalance;
    }


    /**
     * Sets the needWithdrawableBalance value for this DepositSearchRequestBean.
     * 
     * @param needWithdrawableBalance
     */
    public void setNeedWithdrawableBalance(java.lang.Boolean needWithdrawableBalance) {
        this.needWithdrawableBalance = needWithdrawableBalance;
    }


    /**
     * Gets the offset value for this DepositSearchRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this DepositSearchRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the personality value for this DepositSearchRequestBean.
     * 
     * @return personality
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType[] getPersonality() {
        return personality;
    }


    /**
     * Sets the personality value for this DepositSearchRequestBean.
     * 
     * @param personality
     */
    public void setPersonality(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType[] personality) {
        this.personality = personality;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType getPersonality(int i) {
        return this.personality[i];
    }

    public void setPersonality(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType _value) {
        this.personality[i] = _value;
    }


    /**
     * Gets the signatureStatus value for this DepositSearchRequestBean.
     * 
     * @return signatureStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus[] getSignatureStatus() {
        return signatureStatus;
    }


    /**
     * Sets the signatureStatus value for this DepositSearchRequestBean.
     * 
     * @param signatureStatus
     */
    public void setSignatureStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus[] signatureStatus) {
        this.signatureStatus = signatureStatus;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus getSignatureStatus(int i) {
        return this.signatureStatus[i];
    }

    public void setSignatureStatus(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus _value) {
        this.signatureStatus[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositSearchRequestBean)) return false;
        DepositSearchRequestBean other = (DepositSearchRequestBean) obj;
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
            ((this.depositNumbers==null && other.getDepositNumbers()==null) || 
             (this.depositNumbers!=null &&
              java.util.Arrays.equals(this.depositNumbers, other.getDepositNumbers()))) &&
            ((this.depositStatus==null && other.getDepositStatus()==null) || 
             (this.depositStatus!=null &&
              this.depositStatus.equals(other.getDepositStatus()))) &&
            ((this.excludeCurrency==null && other.getExcludeCurrency()==null) || 
             (this.excludeCurrency!=null &&
              java.util.Arrays.equals(this.excludeCurrency, other.getExcludeCurrency()))) &&
            ((this.excludeType==null && other.getExcludeType()==null) || 
             (this.excludeType!=null &&
              java.util.Arrays.equals(this.excludeType, other.getExcludeType()))) &&
            ((this.includeCreditAccount==null && other.getIncludeCreditAccount()==null) || 
             (this.includeCreditAccount!=null &&
              this.includeCreditAccount.equals(other.getIncludeCreditAccount()))) &&
            ((this.includeCurrency==null && other.getIncludeCurrency()==null) || 
             (this.includeCurrency!=null &&
              java.util.Arrays.equals(this.includeCurrency, other.getIncludeCurrency()))) &&
            ((this.includeSupportAccount==null && other.getIncludeSupportAccount()==null) || 
             (this.includeSupportAccount!=null &&
              this.includeSupportAccount.equals(other.getIncludeSupportAccount()))) &&
            ((this.includeType==null && other.getIncludeType()==null) || 
             (this.includeType!=null &&
              java.util.Arrays.equals(this.includeType, other.getIncludeType()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.needBlockedAmount==null && other.getNeedBlockedAmount()==null) || 
             (this.needBlockedAmount!=null &&
              this.needBlockedAmount.equals(other.getNeedBlockedAmount()))) &&
            ((this.needWithdrawableBalance==null && other.getNeedWithdrawableBalance()==null) || 
             (this.needWithdrawableBalance!=null &&
              this.needWithdrawableBalance.equals(other.getNeedWithdrawableBalance()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.personality==null && other.getPersonality()==null) || 
             (this.personality!=null &&
              java.util.Arrays.equals(this.personality, other.getPersonality()))) &&
            ((this.signatureStatus==null && other.getSignatureStatus()==null) || 
             (this.signatureStatus!=null &&
              java.util.Arrays.equals(this.signatureStatus, other.getSignatureStatus())));
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
        if (getDepositNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepositStatus() != null) {
            _hashCode += getDepositStatus().hashCode();
        }
        if (getExcludeCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeCreditAccount() != null) {
            _hashCode += getIncludeCreditAccount().hashCode();
        }
        if (getIncludeCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeSupportAccount() != null) {
            _hashCode += getIncludeSupportAccount().hashCode();
        }
        if (getIncludeType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getNeedBlockedAmount() != null) {
            _hashCode += getNeedBlockedAmount().hashCode();
        }
        if (getNeedWithdrawableBalance() != null) {
            _hashCode += getNeedWithdrawableBalance().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getPersonality() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPersonality());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPersonality(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignatureStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSignatureStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSignatureStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepositSearchRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositSearchRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excludeCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excludeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositGroupTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeCreditAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeCreditAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSupportAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeSupportAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositGroupTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needBlockedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needBlockedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needWithdrawableBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needWithdrawableBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("personality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "personalityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signatureStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "signatureOwnerStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
