package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseDto;

public class GetMyBillsRequest extends BaseDto {

    private String userId;
    private String deleteBillProcessKey;
    private String editBillProcessKey;

    public GetMyBillsRequest() {
    }

    public GetMyBillsRequest(String userId, String deleteBillProcessKey, String editBillProcessKey) {
        this.userId = userId;
        this.deleteBillProcessKey = deleteBillProcessKey;
        this.editBillProcessKey = editBillProcessKey;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeleteBillProcessKey() {
        return deleteBillProcessKey;
    }

    public void setDeleteBillProcessKey(String deleteBillProcessKey) {
        this.deleteBillProcessKey = deleteBillProcessKey;
    }

    public String getEditBillProcessKey() {
        return editBillProcessKey;
    }

    public void setEditBillProcessKey(String editBillProcessKey) {
        this.editBillProcessKey = editBillProcessKey;
    }
}
