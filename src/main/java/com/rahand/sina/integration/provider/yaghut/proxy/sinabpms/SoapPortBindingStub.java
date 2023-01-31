/**
 * SoapPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class SoapPortBindingStub extends org.apache.axis.client.Stub implements SoapServices {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("loginStatic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "context"), ContextEntry[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "data"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "userInfoRequestBean"), UserInfoRequestBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loginResponseBean"));
        oper.setReturnClass(LoginResponseBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserTasks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "context"), ContextEntry[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "data"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "userTaskRequestBean"), UserTaskRequestBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "userTaskResponseBean"));
        oper.setReturnClass(UserTaskResponseBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcessTaskFormParameters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "context"), ContextEntry[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "data"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskFormParametersRequestBean"), ProcessTaskFormParametersRequestBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskFormParametersResponseBean"));
        oper.setReturnClass(ProcessTaskFormParametersResponseBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessTaskIdWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.InvalidProcessTaskIdWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessTaskIdWSException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcessStartTaskParameters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "context"), ContextEntry[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "data"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processStartTaskParametersRequestBean"), ProcessStartTaskParametersRequestBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processStartTaskParametersResponseBean"));
        oper.setReturnClass(ProcessStartTaskParametersResponseBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessDefinitionIdWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.InvalidProcessDefinitionIdWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessDefinitionIdWSException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startProcessInstance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "context"), ContextEntry[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "data"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "startProcessInstanceRequestBean"), StartProcessInstanceRequestBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "startProcessInstanceResponseBean"));
        oper.setReturnClass(StartProcessInstanceResponseBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessParametersValueWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.InvalidProcessParametersValueWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessParametersValueWSException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "ProcessActionWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.ProcessActionWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "ProcessActionWSException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessDefinitionIdWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.InvalidProcessDefinitionIdWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessDefinitionIdWSException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessParametersIdWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.InvalidProcessParametersIdWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessParametersIdWSException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchProcessDefinition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "context"), ContextEntry[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "data"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDefinitionSearchRequestBean"), ProcessDefinitionSearchRequestBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDefinitionSearchResponseBean"));
        oper.setReturnClass(ProcessDefinitionSearchResponseBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("performTask");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "context"), ContextEntry[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "data"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "performTaskRequestBean"), PerformTaskRequestBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "performTaskResponseBean"));
        oper.setReturnClass(PerformTaskResponseBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessParametersValueWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.InvalidProcessParametersValueWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessParametersValueWSException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "ProcessActionWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.ProcessActionWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "ProcessActionWSException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessTaskIdWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.InvalidProcessTaskIdWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessTaskIdWSException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessParametersIdWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.InvalidProcessParametersIdWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessParametersIdWSException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("backToPreviousTask");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "context"), ContextEntry[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "data"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "backToPreviousTaskRequestBean"), BackToPreviousTaskRequestBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "backToPreviousTaskResponseBean"));
        oper.setReturnClass(BackToPreviousTaskResponseBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "ProcessActionWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.ProcessActionWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "ProcessActionWSException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessTaskIdWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.InvalidProcessTaskIdWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessTaskIdWSException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "OperationNotPermittedWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.OperationNotPermittedWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "OperationNotPermittedWSException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcessDetailsByInstanceId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "context"), ContextEntry[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "data"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDetailsByInstanceIdRequestBean"), ProcessDetailsByInstanceIdRequestBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDetailsByInstanceIdResponseBean"));
        oper.setReturnClass(ProcessDetailsByInstanceIdResponseBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessInstanceIdWSException"),
                      "com.rahand.sina.integration.yaghut.proxy.sinabpms.InvalidProcessInstanceIdWSException",
                      new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessInstanceIdWSException"), 
                      true
                     ));
        _operations[8] = oper;

    }

    public SoapPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SoapPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SoapPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "backToPreviousTaskRequestBean");
            cachedSerQNames.add(qName);
            cls = BackToPreviousTaskRequestBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "backToPreviousTaskResponseBean");
            cachedSerQNames.add(qName);
            cls = BackToPreviousTaskResponseBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "columnInfoBean");
            cachedSerQNames.add(qName);
            cls = ColumnInfoBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "columnValueDataBean");
            cachedSerQNames.add(qName);
            cls = ColumnValueDataBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "columnValuesDataBeans");
            cachedSerQNames.add(qName);
            cls = ColumnValueDataBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "columnValueDataBean");
            qName2 = new javax.xml.namespace.QName("", "columnValues");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "complexDefinitionValueBean");
            cachedSerQNames.add(qName);
            cls = ComplexDefinitionValueBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "context");
            cachedSerQNames.add(qName);
            cls = ContextEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "contextEntry");
            qName2 = new javax.xml.namespace.QName("", "data");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "contextEntry");
            cachedSerQNames.add(qName);
            cls = ContextEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "enumDefinitionValueBean");
            cachedSerQNames.add(qName);
            cls = EnumDefinitionValueBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "genderWS");
            cachedSerQNames.add(qName);
            cls = GenderWS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessDefinitionIdWSException");
            cachedSerQNames.add(qName);
            cls = InvalidProcessDefinitionIdWSException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessInstanceIdWSException");
            cachedSerQNames.add(qName);
            cls = InvalidProcessInstanceIdWSException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessParametersIdWSException");
            cachedSerQNames.add(qName);
            cls = InvalidProcessParametersIdWSException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessParametersValueWSException");
            cachedSerQNames.add(qName);
            cls = InvalidProcessParametersValueWSException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "InvalidProcessTaskIdWSException");
            cachedSerQNames.add(qName);
            cls = InvalidProcessTaskIdWSException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loginResponseBean");
            cachedSerQNames.add(qName);
            cls = LoginResponseBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "OperationNotPermittedWSException");
            cachedSerQNames.add(qName);
            cls = OperationNotPermittedWSException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "parameterGroupType");
            cachedSerQNames.add(qName);
            cls = ParameterGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "performTaskRequestBean");
            cachedSerQNames.add(qName);
            cls = PerformTaskRequestBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "performTaskResponseBean");
            cachedSerQNames.add(qName);
            cls = PerformTaskResponseBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "ProcessActionWSException");
            cachedSerQNames.add(qName);
            cls = ProcessActionWSException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processBean");
            cachedSerQNames.add(qName);
            cls = ProcessBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDefinitionBean");
            cachedSerQNames.add(qName);
            cls = ProcessDefinitionBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDefinitionSearchRequestBean");
            cachedSerQNames.add(qName);
            cls = ProcessDefinitionSearchRequestBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDefinitionSearchResponseBean");
            cachedSerQNames.add(qName);
            cls = ProcessDefinitionSearchResponseBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDefinitionStatusType");
            cachedSerQNames.add(qName);
            cls = ProcessDefinitionStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDetailsBean");
            cachedSerQNames.add(qName);
            cls = ProcessDetailsBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDetailsByInstanceIdRequestBean");
            cachedSerQNames.add(qName);
            cls = ProcessDetailsByInstanceIdRequestBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDetailsByInstanceIdResponseBean");
            cachedSerQNames.add(qName);
            cls = ProcessDetailsByInstanceIdResponseBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processFormPropertyTypeBean");
            cachedSerQNames.add(qName);
            cls = ProcessFormPropertyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processParameterInputTableValueBean");
            cachedSerQNames.add(qName);
            cls = RowDataBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "rowDataBean");
            qName2 = new javax.xml.namespace.QName("", "rowDataBeansInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processParameterInputValueBean");
            cachedSerQNames.add(qName);
            cls = ProcessParameterInputValueBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processParameterTableValueBean");
            cachedSerQNames.add(qName);
            cls = ProcessParameterTableValueBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processParameterValueBean");
            cachedSerQNames.add(qName);
            cls = ProcessParameterValueBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processStartTaskParametersRequestBean");
            cachedSerQNames.add(qName);
            cls = ProcessStartTaskParametersRequestBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processStartTaskParametersResponseBean");
            cachedSerQNames.add(qName);
            cls = ProcessStartTaskParametersResponseBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskFormParametersRequestBean");
            cachedSerQNames.add(qName);
            cls = ProcessTaskFormParametersRequestBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskFormParametersResponseBean");
            cachedSerQNames.add(qName);
            cls = ProcessTaskFormParametersResponseBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskGroupParameterBean");
            cachedSerQNames.add(qName);
            cls = ProcessTaskGroupParameterBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskParameterBean");
            cachedSerQNames.add(qName);
            cls = ProcessTaskParameterBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskParameterValueBean");
            cachedSerQNames.add(qName);
            cls = ProcessTaskParameterValueBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "rowDataBean");
            cachedSerQNames.add(qName);
            cls = RowDataBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sessionTemporaryCause");
            cachedSerQNames.add(qName);
            cls = SessionTemporaryCause.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "startProcessInstanceRequestBean");
            cachedSerQNames.add(qName);
            cls = StartProcessInstanceRequestBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "startProcessInstanceResponseBean");
            cachedSerQNames.add(qName);
            cls = StartProcessInstanceResponseBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "subscriberUserInfoBean");
            cachedSerQNames.add(qName);
            cls = SubscriberUserInfoBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "tableStructureInfoBean");
            cachedSerQNames.add(qName);
            cls = TableStructureInfoBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "userInfoRequestBean");
            cachedSerQNames.add(qName);
            cls = UserInfoRequestBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "userTaskBean");
            cachedSerQNames.add(qName);
            cls = UserTaskBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "userTaskRequestBean");
            cachedSerQNames.add(qName);
            cls = UserTaskRequestBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "userTaskResponseBean");
            cachedSerQNames.add(qName);
            cls = UserTaskResponseBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public LoginResponseBean loginStatic(ContextEntry[] context, UserInfoRequestBean request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loginStatic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {context, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (LoginResponseBean) _resp;
            } catch (Exception _exception) {
                return (LoginResponseBean) org.apache.axis.utils.JavaUtils.convert(_resp, LoginResponseBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public UserTaskResponseBean getUserTasks(ContextEntry[] context, UserTaskRequestBean request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "getUserTasks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {context, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (UserTaskResponseBean) _resp;
            } catch (Exception _exception) {
                return (UserTaskResponseBean) org.apache.axis.utils.JavaUtils.convert(_resp, UserTaskResponseBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ProcessTaskFormParametersResponseBean getProcessTaskFormParameters(ContextEntry[] context, ProcessTaskFormParametersRequestBean request) throws java.rmi.RemoteException, InvalidProcessTaskIdWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "getProcessTaskFormParameters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {context, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ProcessTaskFormParametersResponseBean) _resp;
            } catch (Exception _exception) {
                return (ProcessTaskFormParametersResponseBean) org.apache.axis.utils.JavaUtils.convert(_resp, ProcessTaskFormParametersResponseBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InvalidProcessTaskIdWSException) {
              throw (InvalidProcessTaskIdWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ProcessStartTaskParametersResponseBean getProcessStartTaskParameters(ContextEntry[] context, ProcessStartTaskParametersRequestBean request) throws java.rmi.RemoteException, InvalidProcessDefinitionIdWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "getProcessStartTaskParameters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {context, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ProcessStartTaskParametersResponseBean) _resp;
            } catch (Exception _exception) {
                return (ProcessStartTaskParametersResponseBean) org.apache.axis.utils.JavaUtils.convert(_resp, ProcessStartTaskParametersResponseBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InvalidProcessDefinitionIdWSException) {
              throw (InvalidProcessDefinitionIdWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public StartProcessInstanceResponseBean startProcessInstance(ContextEntry[] context, StartProcessInstanceRequestBean request) throws java.rmi.RemoteException, InvalidProcessParametersValueWSException, ProcessActionWSException, InvalidProcessDefinitionIdWSException, InvalidProcessParametersIdWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "startProcessInstance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {context, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (StartProcessInstanceResponseBean) _resp;
            } catch (Exception _exception) {
                return (StartProcessInstanceResponseBean) org.apache.axis.utils.JavaUtils.convert(_resp, StartProcessInstanceResponseBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InvalidProcessParametersValueWSException) {
              throw (InvalidProcessParametersValueWSException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ProcessActionWSException) {
              throw (ProcessActionWSException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InvalidProcessDefinitionIdWSException) {
              throw (InvalidProcessDefinitionIdWSException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InvalidProcessParametersIdWSException) {
              throw (InvalidProcessParametersIdWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ProcessDefinitionSearchResponseBean searchProcessDefinition(ContextEntry[] context, ProcessDefinitionSearchRequestBean request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "searchProcessDefinition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {context, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ProcessDefinitionSearchResponseBean) _resp;
            } catch (Exception _exception) {
                return (ProcessDefinitionSearchResponseBean) org.apache.axis.utils.JavaUtils.convert(_resp, ProcessDefinitionSearchResponseBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PerformTaskResponseBean performTask(ContextEntry[] context, PerformTaskRequestBean request) throws java.rmi.RemoteException, InvalidProcessParametersValueWSException, ProcessActionWSException, InvalidProcessTaskIdWSException, InvalidProcessParametersIdWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "performTask"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {context, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PerformTaskResponseBean) _resp;
            } catch (Exception _exception) {
                return (PerformTaskResponseBean) org.apache.axis.utils.JavaUtils.convert(_resp, PerformTaskResponseBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InvalidProcessParametersValueWSException) {
              throw (InvalidProcessParametersValueWSException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ProcessActionWSException) {
              throw (ProcessActionWSException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InvalidProcessTaskIdWSException) {
              throw (InvalidProcessTaskIdWSException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InvalidProcessParametersIdWSException) {
              throw (InvalidProcessParametersIdWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public BackToPreviousTaskResponseBean backToPreviousTask(ContextEntry[] context, BackToPreviousTaskRequestBean request) throws java.rmi.RemoteException, ProcessActionWSException, InvalidProcessTaskIdWSException, OperationNotPermittedWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "backToPreviousTask"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {context, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (BackToPreviousTaskResponseBean) _resp;
            } catch (Exception _exception) {
                return (BackToPreviousTaskResponseBean) org.apache.axis.utils.JavaUtils.convert(_resp, BackToPreviousTaskResponseBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ProcessActionWSException) {
              throw (ProcessActionWSException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InvalidProcessTaskIdWSException) {
              throw (InvalidProcessTaskIdWSException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof OperationNotPermittedWSException) {
              throw (OperationNotPermittedWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ProcessDetailsByInstanceIdResponseBean getProcessDetailsByInstanceId(ContextEntry[] context, ProcessDetailsByInstanceIdRequestBean request) throws java.rmi.RemoteException, InvalidProcessInstanceIdWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "getProcessDetailsByInstanceId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {context, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ProcessDetailsByInstanceIdResponseBean) _resp;
            } catch (Exception _exception) {
                return (ProcessDetailsByInstanceIdResponseBean) org.apache.axis.utils.JavaUtils.convert(_resp, ProcessDetailsByInstanceIdResponseBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InvalidProcessInstanceIdWSException) {
              throw (InvalidProcessInstanceIdWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
