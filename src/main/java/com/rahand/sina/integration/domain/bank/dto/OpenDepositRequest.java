package com.rahand.sina.integration.domain.bank.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rahand.bpm.framework.json.ContainerJson;
import com.rahand.common.dto.BaseRequest;
import com.rahand.common.util.CommonUtil;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;


public class OpenDepositRequest extends BaseRequest {

    @JsonProperty("typeCode")
    private Integer typeCode;
    @JsonProperty("customerId")
    private Integer customerId;
    @JsonProperty("DepositCreateOptionsDTO")
    private DepositCreateOptionsDTO depositCreateOptionsDTO;
    @JsonProperty("DepositContextDTO")
    private DepositContextDTO depositContextDTO;

    public OpenDepositRequest() {
    }

    @Builder
    public OpenDepositRequest(String userId, Integer typeCode, Integer customerId, DepositCreateOptionsDTO depositCreateOptionsDTO, DepositContextDTO depositContextDTO) {
        super(userId);
        this.typeCode = typeCode;
        this.customerId = customerId;
        this.depositCreateOptionsDTO = depositCreateOptionsDTO;
        this.depositContextDTO = depositContextDTO;
    }

    public Integer getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public DepositCreateOptionsDTO getDepositCreateOptionsDTO() {
        return depositCreateOptionsDTO;
    }

    public void setDepositCreateOptionsDTO(DepositCreateOptionsDTO depositCreateOptionsDTO) {
        this.depositCreateOptionsDTO = depositCreateOptionsDTO;
    }

    public DepositContextDTO getDepositContextDTO() {
        return depositContextDTO;
    }

    public void setDepositContextDTO(DepositContextDTO depositContextDTO) {
        this.depositContextDTO = depositContextDTO;
    }

    @Builder
    public static class DepositCreateOptionsDTO {
        @JsonProperty("branchCode")
        private Integer branchCode;
        @JsonProperty("currency")
        private String currency;
        @JsonProperty("hasCard")
        private Integer hasCard;
        @JsonProperty("openAmountSources")
        private List<OpenAmountSources> openAmountSources;
        @JsonProperty("customersInfo")
        private List<CustomersInfo> customersInfo;
        @JsonProperty("signs")
        private List<Signs> signs;

        public DepositCreateOptionsDTO(Integer branchCode, String currency, Integer hasCard, List<OpenAmountSources> openAmountSources, List<CustomersInfo> customersInfo, List<Signs> signs) {
            this.branchCode = branchCode;
            this.currency = currency;
            this.hasCard = hasCard;
            this.openAmountSources = openAmountSources;
            this.customersInfo = customersInfo;
            this.signs = signs;
        }

        public Integer getBranchCode() {
            return branchCode;
        }

        public void setBranchCode(Integer branchCode) {
            this.branchCode = branchCode;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public List<OpenAmountSources> getOpenAmountSources() {
            return openAmountSources;
        }

        public void setOpenAmountSources(List<OpenAmountSources> openAmountSources) {
            this.openAmountSources = openAmountSources;
        }

        public List<CustomersInfo> getCustomersInfo() {
            return customersInfo;
        }

        public void setCustomersInfo(List<CustomersInfo> customersInfo) {
            this.customersInfo = customersInfo;
        }

        public List<Signs> getSigns() {
            return signs;
        }

        public void setSigns(List<Signs> signs) {
            this.signs = signs;
        }
    }

    @Builder
    public static class DepositContextDTO {
        @JsonProperty("ignoreCustomerToDepositRelation")
        private boolean ignoreCustomerToDepositRelation;
        @JsonProperty("customerId")
        private Integer customerId;

        public DepositContextDTO(boolean ignoreCustomerToDepositRelation, Integer customerId) {
            this.ignoreCustomerToDepositRelation = ignoreCustomerToDepositRelation;
            this.customerId = customerId;
        }

        public boolean isIgnoreCustomerToDepositRelation() {
            return ignoreCustomerToDepositRelation;
        }

        public void setIgnoreCustomerToDepositRelation(boolean ignoreCustomerToDepositRelation) {
            this.ignoreCustomerToDepositRelation = ignoreCustomerToDepositRelation;
        }

        public Integer getCustomerId() {
            return customerId;
        }

        public void setCustomerId(Integer customerId) {
            this.customerId = customerId;
        }
    }

    @Builder
    public static class OpenAmountSources {
        @JsonProperty("type")
        private String type;
        @JsonProperty("data")
        private Data data;

        public OpenAmountSources(String type, Data data) {
            this.type = type;
            this.data = data;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }
    }

    @Builder
    public static class Data {

        @JsonProperty("account_id")
        private AccountId accountId;
        @JsonProperty("amount")
        private BigDecimal amount;
        @JsonProperty("description")
        private String description;
        @JsonProperty("comment")
        private String comment;
        @JsonProperty("signer_ids")
        private List<Integer> signerIds;

        public Data(AccountId accountId, BigDecimal amount, String description, String comment, List<Integer> signerIds) {
            this.accountId = accountId;
            this.amount = amount;
            this.description = description;
            this.comment = comment;
            this.signerIds = signerIds;
        }

        public AccountId getAccountId() {
            return accountId;
        }

        public void setAccountId(AccountId accountId) {
            this.accountId = accountId;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }
    }

    @Builder
    public static class AccountId {

        @JsonProperty("branch_code")
        private Integer branchCode;
        @JsonProperty("type_code")
        private Integer typeCode;
        @JsonProperty("serial")
        private Integer serial;

        @Builder
        public AccountId(Integer branchCode, Integer typeCode, Integer serial) {
            this.branchCode = branchCode;
            this.typeCode = typeCode;
            this.serial = serial;
        }

        public Integer getBranchCode() {
            return branchCode;
        }

        public void setBranchCode(Integer branchCode) {
            this.branchCode = branchCode;
        }

        public Integer getTypeCode() {
            return typeCode;
        }

        public void setTypeCode(Integer typeCode) {
            this.typeCode = typeCode;
        }

        public Integer getSerial() {
            return serial;
        }

        public void setSerial(Integer serial) {
            this.serial = serial;
        }
    }

    @Builder
    public static class CustomersInfo {
        @JsonProperty("customerId")
        private Integer customerId;
        @JsonProperty("relationCode")
        private Integer relationCode;
        @JsonProperty("sharePercent")
        private Integer sharePercent;

        public CustomersInfo(Integer customerId, Integer relationCode, Integer sharePercent) {
            this.customerId = customerId;
            this.relationCode = relationCode;
            this.sharePercent = sharePercent;
        }

        public Integer getCustomerId() {
            return customerId;
        }

        public void setCustomerId(Integer customerId) {
            this.customerId = customerId;
        }

        public Integer getRelationCode() {
            return relationCode;
        }

        public void setRelationCode(Integer relationCode) {
            this.relationCode = relationCode;
        }

        public Integer getSharePercent() {
            return sharePercent;
        }

        public void setSharePercent(Integer sharePercent) {
            this.sharePercent = sharePercent;
        }
    }

    @Builder
    public static class Signs {
        @JsonProperty("customerId")
        private Integer customerId;
        @JsonProperty("signSerial")
        private Integer signSerial;

        public Signs(Integer customerId, Integer signSerial) {
            this.customerId = customerId;
            this.signSerial = signSerial;
        }

        public Integer getCustomerId() {
            return customerId;
        }

        public void setCustomerId(Integer customerId) {
            this.customerId = customerId;
        }

        public Integer getSignSerial() {
            return signSerial;
        }

        public void setSignSerial(Integer signSerial) {
            this.signSerial = signSerial;
        }
    }

    public String toJson() {
        return CommonUtil.toJson(this);
    }

    public ContainerJson setContainerJson() {
        return CommonUtil.setContainerJson(this.toJson());
    }
}
