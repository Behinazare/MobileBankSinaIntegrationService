/**
 * IssueSpecialCardResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class IssueSpecialCardResponseBean  implements java.io.Serializable {
    private java.lang.String cvv2;

    private java.util.Calendar expirationDate;

    private java.lang.String holderName;

    private java.lang.String pan;

    private java.lang.String track1;

    private java.lang.String track2;

    private java.lang.String track3;

    public IssueSpecialCardResponseBean() {
    }

    public IssueSpecialCardResponseBean(
           java.lang.String cvv2,
           java.util.Calendar expirationDate,
           java.lang.String holderName,
           java.lang.String pan,
           java.lang.String track1,
           java.lang.String track2,
           java.lang.String track3) {
           this.cvv2 = cvv2;
           this.expirationDate = expirationDate;
           this.holderName = holderName;
           this.pan = pan;
           this.track1 = track1;
           this.track2 = track2;
           this.track3 = track3;
    }


    /**
     * Gets the cvv2 value for this IssueSpecialCardResponseBean.
     * 
     * @return cvv2
     */
    public java.lang.String getCvv2() {
        return cvv2;
    }


    /**
     * Sets the cvv2 value for this IssueSpecialCardResponseBean.
     * 
     * @param cvv2
     */
    public void setCvv2(java.lang.String cvv2) {
        this.cvv2 = cvv2;
    }


    /**
     * Gets the expirationDate value for this IssueSpecialCardResponseBean.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this IssueSpecialCardResponseBean.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the holderName value for this IssueSpecialCardResponseBean.
     * 
     * @return holderName
     */
    public java.lang.String getHolderName() {
        return holderName;
    }


    /**
     * Sets the holderName value for this IssueSpecialCardResponseBean.
     * 
     * @param holderName
     */
    public void setHolderName(java.lang.String holderName) {
        this.holderName = holderName;
    }


    /**
     * Gets the pan value for this IssueSpecialCardResponseBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this IssueSpecialCardResponseBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the track1 value for this IssueSpecialCardResponseBean.
     * 
     * @return track1
     */
    public java.lang.String getTrack1() {
        return track1;
    }


    /**
     * Sets the track1 value for this IssueSpecialCardResponseBean.
     * 
     * @param track1
     */
    public void setTrack1(java.lang.String track1) {
        this.track1 = track1;
    }


    /**
     * Gets the track2 value for this IssueSpecialCardResponseBean.
     * 
     * @return track2
     */
    public java.lang.String getTrack2() {
        return track2;
    }


    /**
     * Sets the track2 value for this IssueSpecialCardResponseBean.
     * 
     * @param track2
     */
    public void setTrack2(java.lang.String track2) {
        this.track2 = track2;
    }


    /**
     * Gets the track3 value for this IssueSpecialCardResponseBean.
     * 
     * @return track3
     */
    public java.lang.String getTrack3() {
        return track3;
    }


    /**
     * Sets the track3 value for this IssueSpecialCardResponseBean.
     * 
     * @param track3
     */
    public void setTrack3(java.lang.String track3) {
        this.track3 = track3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IssueSpecialCardResponseBean)) return false;
        IssueSpecialCardResponseBean other = (IssueSpecialCardResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cvv2==null && other.getCvv2()==null) || 
             (this.cvv2!=null &&
              this.cvv2.equals(other.getCvv2()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.holderName==null && other.getHolderName()==null) || 
             (this.holderName!=null &&
              this.holderName.equals(other.getHolderName()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.track1==null && other.getTrack1()==null) || 
             (this.track1!=null &&
              this.track1.equals(other.getTrack1()))) &&
            ((this.track2==null && other.getTrack2()==null) || 
             (this.track2!=null &&
              this.track2.equals(other.getTrack2()))) &&
            ((this.track3==null && other.getTrack3()==null) || 
             (this.track3!=null &&
              this.track3.equals(other.getTrack3())));
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
        if (getCvv2() != null) {
            _hashCode += getCvv2().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getHolderName() != null) {
            _hashCode += getHolderName().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getTrack1() != null) {
            _hashCode += getTrack1().hashCode();
        }
        if (getTrack2() != null) {
            _hashCode += getTrack2().hashCode();
        }
        if (getTrack3() != null) {
            _hashCode += getTrack3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssueSpecialCardResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "issueSpecialCardResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvv2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvv2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holderName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "track1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "track2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "track3"));
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
