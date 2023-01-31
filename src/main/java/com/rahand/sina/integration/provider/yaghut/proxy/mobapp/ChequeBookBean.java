/**
 * ChequeBookBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ChequeBookBean  implements java.io.Serializable {
    private java.util.Calendar issueDate;

    private java.lang.Long number;

    private java.lang.Short numberOfPartialCashCheque;

    private java.lang.Short numberOfPassCheque;

    private java.lang.Short numberOfPermanentBlockedCheque;

    private java.lang.Short numberOfRejectCheque;

    private java.lang.Short numberOfTemporaryBlockCheque;

    private java.lang.Short numberOfUnusedCheque;

    private java.lang.Long pageCount;

    public ChequeBookBean() {
    }

    public ChequeBookBean(
           java.util.Calendar issueDate,
           java.lang.Long number,
           java.lang.Short numberOfPartialCashCheque,
           java.lang.Short numberOfPassCheque,
           java.lang.Short numberOfPermanentBlockedCheque,
           java.lang.Short numberOfRejectCheque,
           java.lang.Short numberOfTemporaryBlockCheque,
           java.lang.Short numberOfUnusedCheque,
           java.lang.Long pageCount) {
           this.issueDate = issueDate;
           this.number = number;
           this.numberOfPartialCashCheque = numberOfPartialCashCheque;
           this.numberOfPassCheque = numberOfPassCheque;
           this.numberOfPermanentBlockedCheque = numberOfPermanentBlockedCheque;
           this.numberOfRejectCheque = numberOfRejectCheque;
           this.numberOfTemporaryBlockCheque = numberOfTemporaryBlockCheque;
           this.numberOfUnusedCheque = numberOfUnusedCheque;
           this.pageCount = pageCount;
    }


    /**
     * Gets the issueDate value for this ChequeBookBean.
     * 
     * @return issueDate
     */
    public java.util.Calendar getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this ChequeBookBean.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.util.Calendar issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the number value for this ChequeBookBean.
     * 
     * @return number
     */
    public java.lang.Long getNumber() {
        return number;
    }


    /**
     * Sets the number value for this ChequeBookBean.
     * 
     * @param number
     */
    public void setNumber(java.lang.Long number) {
        this.number = number;
    }


    /**
     * Gets the numberOfPartialCashCheque value for this ChequeBookBean.
     * 
     * @return numberOfPartialCashCheque
     */
    public java.lang.Short getNumberOfPartialCashCheque() {
        return numberOfPartialCashCheque;
    }


    /**
     * Sets the numberOfPartialCashCheque value for this ChequeBookBean.
     * 
     * @param numberOfPartialCashCheque
     */
    public void setNumberOfPartialCashCheque(java.lang.Short numberOfPartialCashCheque) {
        this.numberOfPartialCashCheque = numberOfPartialCashCheque;
    }


    /**
     * Gets the numberOfPassCheque value for this ChequeBookBean.
     * 
     * @return numberOfPassCheque
     */
    public java.lang.Short getNumberOfPassCheque() {
        return numberOfPassCheque;
    }


    /**
     * Sets the numberOfPassCheque value for this ChequeBookBean.
     * 
     * @param numberOfPassCheque
     */
    public void setNumberOfPassCheque(java.lang.Short numberOfPassCheque) {
        this.numberOfPassCheque = numberOfPassCheque;
    }


    /**
     * Gets the numberOfPermanentBlockedCheque value for this ChequeBookBean.
     * 
     * @return numberOfPermanentBlockedCheque
     */
    public java.lang.Short getNumberOfPermanentBlockedCheque() {
        return numberOfPermanentBlockedCheque;
    }


    /**
     * Sets the numberOfPermanentBlockedCheque value for this ChequeBookBean.
     * 
     * @param numberOfPermanentBlockedCheque
     */
    public void setNumberOfPermanentBlockedCheque(java.lang.Short numberOfPermanentBlockedCheque) {
        this.numberOfPermanentBlockedCheque = numberOfPermanentBlockedCheque;
    }


    /**
     * Gets the numberOfRejectCheque value for this ChequeBookBean.
     * 
     * @return numberOfRejectCheque
     */
    public java.lang.Short getNumberOfRejectCheque() {
        return numberOfRejectCheque;
    }


    /**
     * Sets the numberOfRejectCheque value for this ChequeBookBean.
     * 
     * @param numberOfRejectCheque
     */
    public void setNumberOfRejectCheque(java.lang.Short numberOfRejectCheque) {
        this.numberOfRejectCheque = numberOfRejectCheque;
    }


    /**
     * Gets the numberOfTemporaryBlockCheque value for this ChequeBookBean.
     * 
     * @return numberOfTemporaryBlockCheque
     */
    public java.lang.Short getNumberOfTemporaryBlockCheque() {
        return numberOfTemporaryBlockCheque;
    }


    /**
     * Sets the numberOfTemporaryBlockCheque value for this ChequeBookBean.
     * 
     * @param numberOfTemporaryBlockCheque
     */
    public void setNumberOfTemporaryBlockCheque(java.lang.Short numberOfTemporaryBlockCheque) {
        this.numberOfTemporaryBlockCheque = numberOfTemporaryBlockCheque;
    }


    /**
     * Gets the numberOfUnusedCheque value for this ChequeBookBean.
     * 
     * @return numberOfUnusedCheque
     */
    public java.lang.Short getNumberOfUnusedCheque() {
        return numberOfUnusedCheque;
    }


    /**
     * Sets the numberOfUnusedCheque value for this ChequeBookBean.
     * 
     * @param numberOfUnusedCheque
     */
    public void setNumberOfUnusedCheque(java.lang.Short numberOfUnusedCheque) {
        this.numberOfUnusedCheque = numberOfUnusedCheque;
    }


    /**
     * Gets the pageCount value for this ChequeBookBean.
     * 
     * @return pageCount
     */
    public java.lang.Long getPageCount() {
        return pageCount;
    }


    /**
     * Sets the pageCount value for this ChequeBookBean.
     * 
     * @param pageCount
     */
    public void setPageCount(java.lang.Long pageCount) {
        this.pageCount = pageCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChequeBookBean)) return false;
        ChequeBookBean other = (ChequeBookBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.numberOfPartialCashCheque==null && other.getNumberOfPartialCashCheque()==null) || 
             (this.numberOfPartialCashCheque!=null &&
              this.numberOfPartialCashCheque.equals(other.getNumberOfPartialCashCheque()))) &&
            ((this.numberOfPassCheque==null && other.getNumberOfPassCheque()==null) || 
             (this.numberOfPassCheque!=null &&
              this.numberOfPassCheque.equals(other.getNumberOfPassCheque()))) &&
            ((this.numberOfPermanentBlockedCheque==null && other.getNumberOfPermanentBlockedCheque()==null) || 
             (this.numberOfPermanentBlockedCheque!=null &&
              this.numberOfPermanentBlockedCheque.equals(other.getNumberOfPermanentBlockedCheque()))) &&
            ((this.numberOfRejectCheque==null && other.getNumberOfRejectCheque()==null) || 
             (this.numberOfRejectCheque!=null &&
              this.numberOfRejectCheque.equals(other.getNumberOfRejectCheque()))) &&
            ((this.numberOfTemporaryBlockCheque==null && other.getNumberOfTemporaryBlockCheque()==null) || 
             (this.numberOfTemporaryBlockCheque!=null &&
              this.numberOfTemporaryBlockCheque.equals(other.getNumberOfTemporaryBlockCheque()))) &&
            ((this.numberOfUnusedCheque==null && other.getNumberOfUnusedCheque()==null) || 
             (this.numberOfUnusedCheque!=null &&
              this.numberOfUnusedCheque.equals(other.getNumberOfUnusedCheque()))) &&
            ((this.pageCount==null && other.getPageCount()==null) || 
             (this.pageCount!=null &&
              this.pageCount.equals(other.getPageCount())));
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
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getNumberOfPartialCashCheque() != null) {
            _hashCode += getNumberOfPartialCashCheque().hashCode();
        }
        if (getNumberOfPassCheque() != null) {
            _hashCode += getNumberOfPassCheque().hashCode();
        }
        if (getNumberOfPermanentBlockedCheque() != null) {
            _hashCode += getNumberOfPermanentBlockedCheque().hashCode();
        }
        if (getNumberOfRejectCheque() != null) {
            _hashCode += getNumberOfRejectCheque().hashCode();
        }
        if (getNumberOfTemporaryBlockCheque() != null) {
            _hashCode += getNumberOfTemporaryBlockCheque().hashCode();
        }
        if (getNumberOfUnusedCheque() != null) {
            _hashCode += getNumberOfUnusedCheque().hashCode();
        }
        if (getPageCount() != null) {
            _hashCode += getPageCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChequeBookBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chequeBookBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPartialCashCheque");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfPartialCashCheque"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPassCheque");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfPassCheque"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPermanentBlockedCheque");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfPermanentBlockedCheque"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfRejectCheque");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfRejectCheque"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfTemporaryBlockCheque");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfTemporaryBlockCheque"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfUnusedCheque");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfUnusedCheque"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
