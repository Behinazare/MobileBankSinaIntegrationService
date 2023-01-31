/**
 * ProcessParameterTableValueBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class ProcessParameterTableValueBean  implements java.io.Serializable {
    private RowDataBean[] rowsInfo;

    private TableStructureInfoBean structureInfo;

    public ProcessParameterTableValueBean() {
    }

    public ProcessParameterTableValueBean(
           RowDataBean[] rowsInfo,
           TableStructureInfoBean structureInfo) {
           this.rowsInfo = rowsInfo;
           this.structureInfo = structureInfo;
    }


    /**
     * Gets the rowsInfo value for this ProcessParameterTableValueBean.
     * 
     * @return rowsInfo
     */
    public RowDataBean[] getRowsInfo() {
        return rowsInfo;
    }


    /**
     * Sets the rowsInfo value for this ProcessParameterTableValueBean.
     * 
     * @param rowsInfo
     */
    public void setRowsInfo(RowDataBean[] rowsInfo) {
        this.rowsInfo = rowsInfo;
    }

    public RowDataBean getRowsInfo(int i) {
        return this.rowsInfo[i];
    }

    public void setRowsInfo(int i, RowDataBean _value) {
        this.rowsInfo[i] = _value;
    }


    /**
     * Gets the structureInfo value for this ProcessParameterTableValueBean.
     * 
     * @return structureInfo
     */
    public TableStructureInfoBean getStructureInfo() {
        return structureInfo;
    }


    /**
     * Sets the structureInfo value for this ProcessParameterTableValueBean.
     * 
     * @param structureInfo
     */
    public void setStructureInfo(TableStructureInfoBean structureInfo) {
        this.structureInfo = structureInfo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProcessParameterTableValueBean)) return false;
        ProcessParameterTableValueBean other = (ProcessParameterTableValueBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rowsInfo==null && other.getRowsInfo()==null) || 
             (this.rowsInfo!=null &&
              java.util.Arrays.equals(this.rowsInfo, other.getRowsInfo()))) &&
            ((this.structureInfo==null && other.getStructureInfo()==null) || 
             (this.structureInfo!=null &&
              this.structureInfo.equals(other.getStructureInfo())));
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
        if (getRowsInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRowsInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRowsInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStructureInfo() != null) {
            _hashCode += getStructureInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessParameterTableValueBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processParameterTableValueBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowsInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "rowDataBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("structureInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "structureInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "tableStructureInfoBean"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
