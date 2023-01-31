/**
 * KartablSearchBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class KartablSearchBean  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String failureReason;

    private java.util.Calendar fromCreationDate;

    private java.util.Calendar fromExpirationDate;

    private java.util.Calendar fromLastStatusChangeDate;

    private java.util.Calendar fromUserLastActionDate;

    private java.lang.String kartablId;

    private long length;

    private long offset;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS orderDirection;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablOrderFieldWS orderField;

    private java.lang.String referenceId;

    private java.lang.String[] serviceNames;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablStatusWS[] statuses;

    private java.util.Calendar toCreationDate;

    private java.util.Calendar toExpirationDate;

    private java.util.Calendar toLastStatusChangeDate;

    private java.util.Calendar toUserLastActionDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserActionWS[] userLastActions;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserRoleWS[] userRoles;

    public KartablSearchBean() {
    }

    public KartablSearchBean(
           java.lang.String description,
           java.lang.String failureReason,
           java.util.Calendar fromCreationDate,
           java.util.Calendar fromExpirationDate,
           java.util.Calendar fromLastStatusChangeDate,
           java.util.Calendar fromUserLastActionDate,
           java.lang.String kartablId,
           long length,
           long offset,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS orderDirection,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablOrderFieldWS orderField,
           java.lang.String referenceId,
           java.lang.String[] serviceNames,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablStatusWS[] statuses,
           java.util.Calendar toCreationDate,
           java.util.Calendar toExpirationDate,
           java.util.Calendar toLastStatusChangeDate,
           java.util.Calendar toUserLastActionDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserActionWS[] userLastActions,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserRoleWS[] userRoles) {
           this.description = description;
           this.failureReason = failureReason;
           this.fromCreationDate = fromCreationDate;
           this.fromExpirationDate = fromExpirationDate;
           this.fromLastStatusChangeDate = fromLastStatusChangeDate;
           this.fromUserLastActionDate = fromUserLastActionDate;
           this.kartablId = kartablId;
           this.length = length;
           this.offset = offset;
           this.orderDirection = orderDirection;
           this.orderField = orderField;
           this.referenceId = referenceId;
           this.serviceNames = serviceNames;
           this.statuses = statuses;
           this.toCreationDate = toCreationDate;
           this.toExpirationDate = toExpirationDate;
           this.toLastStatusChangeDate = toLastStatusChangeDate;
           this.toUserLastActionDate = toUserLastActionDate;
           this.userLastActions = userLastActions;
           this.userRoles = userRoles;
    }


    /**
     * Gets the description value for this KartablSearchBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this KartablSearchBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the failureReason value for this KartablSearchBean.
     * 
     * @return failureReason
     */
    public java.lang.String getFailureReason() {
        return failureReason;
    }


    /**
     * Sets the failureReason value for this KartablSearchBean.
     * 
     * @param failureReason
     */
    public void setFailureReason(java.lang.String failureReason) {
        this.failureReason = failureReason;
    }


    /**
     * Gets the fromCreationDate value for this KartablSearchBean.
     * 
     * @return fromCreationDate
     */
    public java.util.Calendar getFromCreationDate() {
        return fromCreationDate;
    }


    /**
     * Sets the fromCreationDate value for this KartablSearchBean.
     * 
     * @param fromCreationDate
     */
    public void setFromCreationDate(java.util.Calendar fromCreationDate) {
        this.fromCreationDate = fromCreationDate;
    }


    /**
     * Gets the fromExpirationDate value for this KartablSearchBean.
     * 
     * @return fromExpirationDate
     */
    public java.util.Calendar getFromExpirationDate() {
        return fromExpirationDate;
    }


    /**
     * Sets the fromExpirationDate value for this KartablSearchBean.
     * 
     * @param fromExpirationDate
     */
    public void setFromExpirationDate(java.util.Calendar fromExpirationDate) {
        this.fromExpirationDate = fromExpirationDate;
    }


    /**
     * Gets the fromLastStatusChangeDate value for this KartablSearchBean.
     * 
     * @return fromLastStatusChangeDate
     */
    public java.util.Calendar getFromLastStatusChangeDate() {
        return fromLastStatusChangeDate;
    }


    /**
     * Sets the fromLastStatusChangeDate value for this KartablSearchBean.
     * 
     * @param fromLastStatusChangeDate
     */
    public void setFromLastStatusChangeDate(java.util.Calendar fromLastStatusChangeDate) {
        this.fromLastStatusChangeDate = fromLastStatusChangeDate;
    }


    /**
     * Gets the fromUserLastActionDate value for this KartablSearchBean.
     * 
     * @return fromUserLastActionDate
     */
    public java.util.Calendar getFromUserLastActionDate() {
        return fromUserLastActionDate;
    }


    /**
     * Sets the fromUserLastActionDate value for this KartablSearchBean.
     * 
     * @param fromUserLastActionDate
     */
    public void setFromUserLastActionDate(java.util.Calendar fromUserLastActionDate) {
        this.fromUserLastActionDate = fromUserLastActionDate;
    }


    /**
     * Gets the kartablId value for this KartablSearchBean.
     * 
     * @return kartablId
     */
    public java.lang.String getKartablId() {
        return kartablId;
    }


    /**
     * Sets the kartablId value for this KartablSearchBean.
     * 
     * @param kartablId
     */
    public void setKartablId(java.lang.String kartablId) {
        this.kartablId = kartablId;
    }


    /**
     * Gets the length value for this KartablSearchBean.
     * 
     * @return length
     */
    public long getLength() {
        return length;
    }


    /**
     * Sets the length value for this KartablSearchBean.
     * 
     * @param length
     */
    public void setLength(long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this KartablSearchBean.
     * 
     * @return offset
     */
    public long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this KartablSearchBean.
     * 
     * @param offset
     */
    public void setOffset(long offset) {
        this.offset = offset;
    }


    /**
     * Gets the orderDirection value for this KartablSearchBean.
     * 
     * @return orderDirection
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS getOrderDirection() {
        return orderDirection;
    }


    /**
     * Sets the orderDirection value for this KartablSearchBean.
     * 
     * @param orderDirection
     */
    public void setOrderDirection(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS orderDirection) {
        this.orderDirection = orderDirection;
    }


    /**
     * Gets the orderField value for this KartablSearchBean.
     * 
     * @return orderField
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablOrderFieldWS getOrderField() {
        return orderField;
    }


    /**
     * Sets the orderField value for this KartablSearchBean.
     * 
     * @param orderField
     */
    public void setOrderField(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablOrderFieldWS orderField) {
        this.orderField = orderField;
    }


    /**
     * Gets the referenceId value for this KartablSearchBean.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this KartablSearchBean.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the serviceNames value for this KartablSearchBean.
     * 
     * @return serviceNames
     */
    public java.lang.String[] getServiceNames() {
        return serviceNames;
    }


    /**
     * Sets the serviceNames value for this KartablSearchBean.
     * 
     * @param serviceNames
     */
    public void setServiceNames(java.lang.String[] serviceNames) {
        this.serviceNames = serviceNames;
    }

    public java.lang.String getServiceNames(int i) {
        return this.serviceNames[i];
    }

    public void setServiceNames(int i, java.lang.String _value) {
        this.serviceNames[i] = _value;
    }


    /**
     * Gets the statuses value for this KartablSearchBean.
     * 
     * @return statuses
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablStatusWS[] getStatuses() {
        return statuses;
    }


    /**
     * Sets the statuses value for this KartablSearchBean.
     * 
     * @param statuses
     */
    public void setStatuses(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablStatusWS[] statuses) {
        this.statuses = statuses;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablStatusWS getStatuses(int i) {
        return this.statuses[i];
    }

    public void setStatuses(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablStatusWS _value) {
        this.statuses[i] = _value;
    }


    /**
     * Gets the toCreationDate value for this KartablSearchBean.
     * 
     * @return toCreationDate
     */
    public java.util.Calendar getToCreationDate() {
        return toCreationDate;
    }


    /**
     * Sets the toCreationDate value for this KartablSearchBean.
     * 
     * @param toCreationDate
     */
    public void setToCreationDate(java.util.Calendar toCreationDate) {
        this.toCreationDate = toCreationDate;
    }


    /**
     * Gets the toExpirationDate value for this KartablSearchBean.
     * 
     * @return toExpirationDate
     */
    public java.util.Calendar getToExpirationDate() {
        return toExpirationDate;
    }


    /**
     * Sets the toExpirationDate value for this KartablSearchBean.
     * 
     * @param toExpirationDate
     */
    public void setToExpirationDate(java.util.Calendar toExpirationDate) {
        this.toExpirationDate = toExpirationDate;
    }


    /**
     * Gets the toLastStatusChangeDate value for this KartablSearchBean.
     * 
     * @return toLastStatusChangeDate
     */
    public java.util.Calendar getToLastStatusChangeDate() {
        return toLastStatusChangeDate;
    }


    /**
     * Sets the toLastStatusChangeDate value for this KartablSearchBean.
     * 
     * @param toLastStatusChangeDate
     */
    public void setToLastStatusChangeDate(java.util.Calendar toLastStatusChangeDate) {
        this.toLastStatusChangeDate = toLastStatusChangeDate;
    }


    /**
     * Gets the toUserLastActionDate value for this KartablSearchBean.
     * 
     * @return toUserLastActionDate
     */
    public java.util.Calendar getToUserLastActionDate() {
        return toUserLastActionDate;
    }


    /**
     * Sets the toUserLastActionDate value for this KartablSearchBean.
     * 
     * @param toUserLastActionDate
     */
    public void setToUserLastActionDate(java.util.Calendar toUserLastActionDate) {
        this.toUserLastActionDate = toUserLastActionDate;
    }


    /**
     * Gets the userLastActions value for this KartablSearchBean.
     * 
     * @return userLastActions
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserActionWS[] getUserLastActions() {
        return userLastActions;
    }


    /**
     * Sets the userLastActions value for this KartablSearchBean.
     * 
     * @param userLastActions
     */
    public void setUserLastActions(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserActionWS[] userLastActions) {
        this.userLastActions = userLastActions;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserActionWS getUserLastActions(int i) {
        return this.userLastActions[i];
    }

    public void setUserLastActions(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserActionWS _value) {
        this.userLastActions[i] = _value;
    }


    /**
     * Gets the userRoles value for this KartablSearchBean.
     * 
     * @return userRoles
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserRoleWS[] getUserRoles() {
        return userRoles;
    }


    /**
     * Sets the userRoles value for this KartablSearchBean.
     * 
     * @param userRoles
     */
    public void setUserRoles(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserRoleWS[] userRoles) {
        this.userRoles = userRoles;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserRoleWS getUserRoles(int i) {
        return this.userRoles[i];
    }

    public void setUserRoles(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablUserRoleWS _value) {
        this.userRoles[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KartablSearchBean)) return false;
        KartablSearchBean other = (KartablSearchBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.failureReason==null && other.getFailureReason()==null) || 
             (this.failureReason!=null &&
              this.failureReason.equals(other.getFailureReason()))) &&
            ((this.fromCreationDate==null && other.getFromCreationDate()==null) || 
             (this.fromCreationDate!=null &&
              this.fromCreationDate.equals(other.getFromCreationDate()))) &&
            ((this.fromExpirationDate==null && other.getFromExpirationDate()==null) || 
             (this.fromExpirationDate!=null &&
              this.fromExpirationDate.equals(other.getFromExpirationDate()))) &&
            ((this.fromLastStatusChangeDate==null && other.getFromLastStatusChangeDate()==null) || 
             (this.fromLastStatusChangeDate!=null &&
              this.fromLastStatusChangeDate.equals(other.getFromLastStatusChangeDate()))) &&
            ((this.fromUserLastActionDate==null && other.getFromUserLastActionDate()==null) || 
             (this.fromUserLastActionDate!=null &&
              this.fromUserLastActionDate.equals(other.getFromUserLastActionDate()))) &&
            ((this.kartablId==null && other.getKartablId()==null) || 
             (this.kartablId!=null &&
              this.kartablId.equals(other.getKartablId()))) &&
            this.length == other.getLength() &&
            this.offset == other.getOffset() &&
            ((this.orderDirection==null && other.getOrderDirection()==null) || 
             (this.orderDirection!=null &&
              this.orderDirection.equals(other.getOrderDirection()))) &&
            ((this.orderField==null && other.getOrderField()==null) || 
             (this.orderField!=null &&
              this.orderField.equals(other.getOrderField()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.serviceNames==null && other.getServiceNames()==null) || 
             (this.serviceNames!=null &&
              java.util.Arrays.equals(this.serviceNames, other.getServiceNames()))) &&
            ((this.statuses==null && other.getStatuses()==null) || 
             (this.statuses!=null &&
              java.util.Arrays.equals(this.statuses, other.getStatuses()))) &&
            ((this.toCreationDate==null && other.getToCreationDate()==null) || 
             (this.toCreationDate!=null &&
              this.toCreationDate.equals(other.getToCreationDate()))) &&
            ((this.toExpirationDate==null && other.getToExpirationDate()==null) || 
             (this.toExpirationDate!=null &&
              this.toExpirationDate.equals(other.getToExpirationDate()))) &&
            ((this.toLastStatusChangeDate==null && other.getToLastStatusChangeDate()==null) || 
             (this.toLastStatusChangeDate!=null &&
              this.toLastStatusChangeDate.equals(other.getToLastStatusChangeDate()))) &&
            ((this.toUserLastActionDate==null && other.getToUserLastActionDate()==null) || 
             (this.toUserLastActionDate!=null &&
              this.toUserLastActionDate.equals(other.getToUserLastActionDate()))) &&
            ((this.userLastActions==null && other.getUserLastActions()==null) || 
             (this.userLastActions!=null &&
              java.util.Arrays.equals(this.userLastActions, other.getUserLastActions()))) &&
            ((this.userRoles==null && other.getUserRoles()==null) || 
             (this.userRoles!=null &&
              java.util.Arrays.equals(this.userRoles, other.getUserRoles())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFailureReason() != null) {
            _hashCode += getFailureReason().hashCode();
        }
        if (getFromCreationDate() != null) {
            _hashCode += getFromCreationDate().hashCode();
        }
        if (getFromExpirationDate() != null) {
            _hashCode += getFromExpirationDate().hashCode();
        }
        if (getFromLastStatusChangeDate() != null) {
            _hashCode += getFromLastStatusChangeDate().hashCode();
        }
        if (getFromUserLastActionDate() != null) {
            _hashCode += getFromUserLastActionDate().hashCode();
        }
        if (getKartablId() != null) {
            _hashCode += getKartablId().hashCode();
        }
        _hashCode += new Long(getLength()).hashCode();
        _hashCode += new Long(getOffset()).hashCode();
        if (getOrderDirection() != null) {
            _hashCode += getOrderDirection().hashCode();
        }
        if (getOrderField() != null) {
            _hashCode += getOrderField().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getServiceNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getToCreationDate() != null) {
            _hashCode += getToCreationDate().hashCode();
        }
        if (getToExpirationDate() != null) {
            _hashCode += getToExpirationDate().hashCode();
        }
        if (getToLastStatusChangeDate() != null) {
            _hashCode += getToLastStatusChangeDate().hashCode();
        }
        if (getToUserLastActionDate() != null) {
            _hashCode += getToUserLastActionDate().hashCode();
        }
        if (getUserLastActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserLastActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserLastActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserRoles(), i);
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
        new org.apache.axis.description.TypeDesc(KartablSearchBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablSearchBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failureReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromLastStatusChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromLastStatusChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromUserLastActionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromUserLastActionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kartablId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kartablId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDirection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "orderDirectionWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderField");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablOrderFieldWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statuses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toLastStatusChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toLastStatusChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toUserLastActionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toUserLastActionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLastActions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLastActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablUserActionWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablUserRoleWS"));
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
