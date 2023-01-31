package com.rahand.sina.integration.provider.yaghut.service.bpms.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.ProcessDetailsByInstanceIdResponseBean;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetProcessDetailResponse extends BaseResponse {

    private ProcessDetailsByInstanceIdResponseBean processDetailsByInstanceIdResponseBean;

    public ProcessDetailsByInstanceIdResponseBean getProcessDetailsByInstanceIdResponseBean() {
        return processDetailsByInstanceIdResponseBean;
    }

    public void setProcessDetailsByInstanceIdResponseBean(ProcessDetailsByInstanceIdResponseBean processDetailsByInstanceIdResponseBean) {
        this.processDetailsByInstanceIdResponseBean = processDetailsByInstanceIdResponseBean;
    }
}
