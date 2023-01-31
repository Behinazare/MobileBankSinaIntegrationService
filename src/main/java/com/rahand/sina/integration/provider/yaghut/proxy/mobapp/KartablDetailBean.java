/**
 * KartablDetailBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class KartablDetailBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablBaseBean  implements java.io.Serializable {
    private boolean approvable;

    private boolean cancellable;

    private boolean editable;

    private boolean executable;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserBean[] kartablUserBeans;

    private java.lang.String serviceDetail;

    private boolean userAssignable;

    private boolean userRemovable;

    public KartablDetailBean() {
    }

    public KartablDetailBean(
           java.math.BigDecimal amount,
           java.util.Calendar creationDate,
           java.lang.String currency,
           java.lang.String description,
           java.util.Calendar expirationDate,
           java.lang.String failureCode,
           java.lang.String failureReason,
           java.lang.String kartablId,
           java.util.Calendar lastStatusChangeDate,
           java.lang.String referenceId,
           java.lang.String serviceName,
           java.lang.String sourceDeposit,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablStatusWS status,
           boolean approvable,
           boolean cancellable,
           boolean editable,
           boolean executable,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserBean[] kartablUserBeans,
           java.lang.String serviceDetail,
           boolean userAssignable,
           boolean userRemovable) {
        super(
            amount,
            creationDate,
            currency,
            description,
            expirationDate,
            failureCode,
            failureReason,
            kartablId,
            lastStatusChangeDate,
            referenceId,
            serviceName,
            sourceDeposit,
            status);
        this.approvable = approvable;
        this.cancellable = cancellable;
        this.editable = editable;
        this.executable = executable;
        this.kartablUserBeans = kartablUserBeans;
        this.serviceDetail = serviceDetail;
        this.userAssignable = userAssignable;
        this.userRemovable = userRemovable;
    }


    /**
     * Gets the approvable value for this KartablDetailBean.
     * 
     * @return approvable
     */
    public boolean isApprovable() {
        return approvable;
    }


    /**
     * Sets the approvable value for this KartablDetailBean.
     * 
     * @param approvable
     */
    public void setApprovable(boolean approvable) {
        this.approvable = approvable;
    }


    /**
     * Gets the cancellable value for this KartablDetailBean.
     * 
     * @return cancellable
     */
    public boolean isCancellable() {
        return cancellable;
    }


    /**
     * Sets the cancellable value for this KartablDetailBean.
     * 
     * @param cancellable
     */
    public void setCancellable(boolean cancellable) {
        this.cancellable = cancellable;
    }


    /**
     * Gets the editable value for this KartablDetailBean.
     * 
     * @return editable
     */
    public boolean isEditable() {
        return editable;
    }


    /**
     * Sets the editable value for this KartablDetailBean.
     * 
     * @param editable
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
    }


    /**
     * Gets the executable value for this KartablDetailBean.
     * 
     * @return executable
     */
    public boolean isExecutable() {
        return executable;
    }


    /**
     * Sets the executable value for this KartablDetailBean.
     * 
     * @param executable
     */
    public void setExecutable(boolean executable) {
        this.executable = executable;
    }


    /**
     * Gets the kartablUserBeans value for this KartablDetailBean.
     * 
     * @return kartablUserBeans
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserBean[] getKartablUserBeans() {
        return kartablUserBeans;
    }


    /**
     * Sets the kartablUserBeans value for this KartablDetailBean.
     * 
     * @param kartablUserBeans
     */
    public void setKartablUserBeans(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserBean[] kartablUserBeans) {
        this.kartablUserBeans = kartablUserBeans;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserBean getKartablUserBeans(int i) {
        return this.kartablUserBeans[i];
    }

    public void setKartablUserBeans(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserBean _value) {
        this.kartablUserBeans[i] = _value;
    }


    /**
     * Gets the serviceDetail value for this KartablDetailBean.
     * 
     * @return serviceDetail
     */
    public java.lang.String getServiceDetail() {
        return serviceDetail;
    }


    /**
     * Sets the serviceDetail value for this KartablDetailBean.
     * 
     * @param serviceDetail
     */
    public void setServiceDetail(java.lang.String serviceDetail) {
        this.serviceDetail = serviceDetail;
    }


    /**
     * Gets the userAssignable value for this KartablDetailBean.
     * 
     * @return userAssignable
     */
    public boolean isUserAssignable() {
        return userAssignable;
    }


    /**
     * Sets the userAssignable value for this KartablDetailBean.
     * 
     * @param userAssignable
     */
    public void setUserAssignable(boolean userAssignable) {
        this.userAssignable = userAssignable;
    }


    /**
     * Gets the userRemovable value for this KartablDetailBean.
     * 
     * @return userRemovable
     */
    public boolean isUserRemovable() {
        return userRemovable;
    }


    /**
     * Sets the userRemovable value for this KartablDetailBean.
     * 
     * @param userRemovable
     */
    public void setUserRemovable(boolean userRemovable) {
        this.userRemovable = userRemovable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KartablDetailBean)) return false;
        KartablDetailBean other = (KartablDetailBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.approvable == other.isApprovable() &&
            this.cancellable == other.isCancellable() &&
            this.editable == other.isEditable() &&
            this.executable == other.isExecutable() &&
            ((this.kartablUserBeans==null && other.getKartablUserBeans()==null) || 
             (this.kartablUserBeans!=null &&
              java.util.Arrays.equals(this.kartablUserBeans, other.getKartablUserBeans()))) &&
            ((this.serviceDetail==null && other.getServiceDetail()==null) || 
             (this.serviceDetail!=null &&
              this.serviceDetail.equals(other.getServiceDetail()))) &&
            this.userAssignable == other.isUserAssignable() &&
            this.userRemovable == other.isUserRemovable();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += (isApprovable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCancellable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEditable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isExecutable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getKartablUserBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKartablUserBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKartablUserBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceDetail() != null) {
            _hashCode += getServiceDetail().hashCode();
        }
        _hashCode += (isUserAssignable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUserRemovable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KartablDetailBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablDetailBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancellable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "executable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kartablUserBeans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kartablUserBeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablUserBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAssignable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userAssignable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRemovable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userRemovable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
