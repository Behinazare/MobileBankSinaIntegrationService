/**
 * InternetPackagesResponseV7.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.rayanmehr.proxy;

public class InternetPackagesResponseV7  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.rayanmehr.proxy.BoltonV7[] boltons;

    public InternetPackagesResponseV7() {
    }

    public InternetPackagesResponseV7(
           com.rahand.sina.integration.provider.rayanmehr.proxy.BoltonV7[] boltons) {
           this.boltons = boltons;
    }


    /**
     * Gets the boltons value for this InternetPackagesResponseV7.
     * 
     * @return boltons
     */
    public com.rahand.sina.integration.provider.rayanmehr.proxy.BoltonV7[] getBoltons() {
        return boltons;
    }


    /**
     * Sets the boltons value for this InternetPackagesResponseV7.
     * 
     * @param boltons
     */
    public void setBoltons(com.rahand.sina.integration.provider.rayanmehr.proxy.BoltonV7[] boltons) {
        this.boltons = boltons;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternetPackagesResponseV7)) return false;
        InternetPackagesResponseV7 other = (InternetPackagesResponseV7) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.boltons==null && other.getBoltons()==null) || 
             (this.boltons!=null &&
              java.util.Arrays.equals(this.boltons, other.getBoltons())));
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
        if (getBoltons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoltons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoltons(), i);
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
        new org.apache.axis.description.TypeDesc(InternetPackagesResponseV7.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "InternetPackagesResponseV7"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boltons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "Boltons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "BoltonV7"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "BoltonV7"));
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
