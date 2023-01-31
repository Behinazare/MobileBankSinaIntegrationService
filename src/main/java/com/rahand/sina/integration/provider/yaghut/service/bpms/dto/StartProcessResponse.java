package com.rahand.sina.integration.provider.yaghut.service.bpms.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.StartProcessInstanceResponseBean;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StartProcessResponse extends BaseResponse {

    private StartProcessInstanceResponseBean startProcessInstanceResponseBean;

    public StartProcessInstanceResponseBean getStartProcessInstanceResponseBean() {
        return startProcessInstanceResponseBean;
    }

    public void setStartProcessInstanceResponseBean(StartProcessInstanceResponseBean startProcessInstanceResponseBean) {
        this.startProcessInstanceResponseBean = startProcessInstanceResponseBean;
    }
}
