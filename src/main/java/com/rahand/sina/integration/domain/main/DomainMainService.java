package com.rahand.sina.integration.domain.main;

import com.rahand.bpm.framework.common.ServiceCallContext;
import com.rahand.common.util.CommonUtil;

public class DomainMainService {

    private ServiceProvider serviceProvider;

    public DomainMainService(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void testServiceCallContext() {

        CommonUtil.logError(getClass().getSimpleName(), "getStatements", "-------- Test GetChanellUserIdentity :  "
                + ServiceCallContext.getUserPassport().GetChanellUserIdentity());
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
