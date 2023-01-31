package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;


public class GetBranchResponse extends BaseResponse {

    private Integer count;
    private List<BranchInfo> branchInfoList;

    public GetBranchResponse() {
    }

    @Builder
    public GetBranchResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<BranchInfo> branchInfoList) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.count = count;
        this.branchInfoList = branchInfoList;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<BranchInfo> getBranchInfoList() {
        return branchInfoList;
    }

    public void setBranchInfoList(List<BranchInfo> branchInfoList) {
        this.branchInfoList = branchInfoList;
    }
}
