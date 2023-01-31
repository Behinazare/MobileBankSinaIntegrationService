/**
 * TableStructureInfoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class TableStructureInfoBean  implements java.io.Serializable {
    private ColumnInfoBean[] columns;

    private Integer maxRowCount;

    private Integer maxSelectableRowCount;

    private Integer minRowCount;

    private Integer minSelectableRowCount;

    private boolean rowAddable;

    private boolean rowRemovable;

    private String rowSelectType;

    public TableStructureInfoBean() {
    }

    public TableStructureInfoBean(
           ColumnInfoBean[] columns,
           Integer maxRowCount,
           Integer maxSelectableRowCount,
           Integer minRowCount,
           Integer minSelectableRowCount,
           boolean rowAddable,
           boolean rowRemovable,
           String rowSelectType) {
           this.columns = columns;
           this.maxRowCount = maxRowCount;
           this.maxSelectableRowCount = maxSelectableRowCount;
           this.minRowCount = minRowCount;
           this.minSelectableRowCount = minSelectableRowCount;
           this.rowAddable = rowAddable;
           this.rowRemovable = rowRemovable;
           this.rowSelectType = rowSelectType;
    }


    /**
     * Gets the columns value for this TableStructureInfoBean.
     * 
     * @return columns
     */
    public ColumnInfoBean[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this TableStructureInfoBean.
     * 
     * @param columns
     */
    public void setColumns(ColumnInfoBean[] columns) {
        this.columns = columns;
    }

    public ColumnInfoBean getColumns(int i) {
        return this.columns[i];
    }

    public void setColumns(int i, ColumnInfoBean _value) {
        this.columns[i] = _value;
    }


    /**
     * Gets the maxRowCount value for this TableStructureInfoBean.
     * 
     * @return maxRowCount
     */
    public Integer getMaxRowCount() {
        return maxRowCount;
    }


    /**
     * Sets the maxRowCount value for this TableStructureInfoBean.
     * 
     * @param maxRowCount
     */
    public void setMaxRowCount(Integer maxRowCount) {
        this.maxRowCount = maxRowCount;
    }


    /**
     * Gets the maxSelectableRowCount value for this TableStructureInfoBean.
     * 
     * @return maxSelectableRowCount
     */
    public Integer getMaxSelectableRowCount() {
        return maxSelectableRowCount;
    }


    /**
     * Sets the maxSelectableRowCount value for this TableStructureInfoBean.
     * 
     * @param maxSelectableRowCount
     */
    public void setMaxSelectableRowCount(Integer maxSelectableRowCount) {
        this.maxSelectableRowCount = maxSelectableRowCount;
    }


    /**
     * Gets the minRowCount value for this TableStructureInfoBean.
     * 
     * @return minRowCount
     */
    public Integer getMinRowCount() {
        return minRowCount;
    }


    /**
     * Sets the minRowCount value for this TableStructureInfoBean.
     * 
     * @param minRowCount
     */
    public void setMinRowCount(Integer minRowCount) {
        this.minRowCount = minRowCount;
    }


    /**
     * Gets the minSelectableRowCount value for this TableStructureInfoBean.
     * 
     * @return minSelectableRowCount
     */
    public Integer getMinSelectableRowCount() {
        return minSelectableRowCount;
    }


    /**
     * Sets the minSelectableRowCount value for this TableStructureInfoBean.
     * 
     * @param minSelectableRowCount
     */
    public void setMinSelectableRowCount(Integer minSelectableRowCount) {
        this.minSelectableRowCount = minSelectableRowCount;
    }


    /**
     * Gets the rowAddable value for this TableStructureInfoBean.
     * 
     * @return rowAddable
     */
    public boolean isRowAddable() {
        return rowAddable;
    }


    /**
     * Sets the rowAddable value for this TableStructureInfoBean.
     * 
     * @param rowAddable
     */
    public void setRowAddable(boolean rowAddable) {
        this.rowAddable = rowAddable;
    }


    /**
     * Gets the rowRemovable value for this TableStructureInfoBean.
     * 
     * @return rowRemovable
     */
    public boolean isRowRemovable() {
        return rowRemovable;
    }


    /**
     * Sets the rowRemovable value for this TableStructureInfoBean.
     * 
     * @param rowRemovable
     */
    public void setRowRemovable(boolean rowRemovable) {
        this.rowRemovable = rowRemovable;
    }


    /**
     * Gets the rowSelectType value for this TableStructureInfoBean.
     * 
     * @return rowSelectType
     */
    public String getRowSelectType() {
        return rowSelectType;
    }


    /**
     * Sets the rowSelectType value for this TableStructureInfoBean.
     * 
     * @param rowSelectType
     */
    public void setRowSelectType(String rowSelectType) {
        this.rowSelectType = rowSelectType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TableStructureInfoBean)) return false;
        TableStructureInfoBean other = (TableStructureInfoBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              java.util.Arrays.equals(this.columns, other.getColumns()))) &&
            ((this.maxRowCount==null && other.getMaxRowCount()==null) || 
             (this.maxRowCount!=null &&
              this.maxRowCount.equals(other.getMaxRowCount()))) &&
            ((this.maxSelectableRowCount==null && other.getMaxSelectableRowCount()==null) || 
             (this.maxSelectableRowCount!=null &&
              this.maxSelectableRowCount.equals(other.getMaxSelectableRowCount()))) &&
            ((this.minRowCount==null && other.getMinRowCount()==null) || 
             (this.minRowCount!=null &&
              this.minRowCount.equals(other.getMinRowCount()))) &&
            ((this.minSelectableRowCount==null && other.getMinSelectableRowCount()==null) || 
             (this.minSelectableRowCount!=null &&
              this.minSelectableRowCount.equals(other.getMinSelectableRowCount()))) &&
            this.rowAddable == other.isRowAddable() &&
            this.rowRemovable == other.isRowRemovable() &&
            ((this.rowSelectType==null && other.getRowSelectType()==null) || 
             (this.rowSelectType!=null &&
              this.rowSelectType.equals(other.getRowSelectType())));
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
        if (getColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumns());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxRowCount() != null) {
            _hashCode += getMaxRowCount().hashCode();
        }
        if (getMaxSelectableRowCount() != null) {
            _hashCode += getMaxSelectableRowCount().hashCode();
        }
        if (getMinRowCount() != null) {
            _hashCode += getMinRowCount().hashCode();
        }
        if (getMinSelectableRowCount() != null) {
            _hashCode += getMinSelectableRowCount().hashCode();
        }
        _hashCode += (isRowAddable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRowRemovable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRowSelectType() != null) {
            _hashCode += getRowSelectType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TableStructureInfoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "tableStructureInfoBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "columnInfoBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxRowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSelectableRowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxSelectableRowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minRowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minRowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSelectableRowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minSelectableRowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowAddable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowAddable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowRemovable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowRemovable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowSelectType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowSelectType"));
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
