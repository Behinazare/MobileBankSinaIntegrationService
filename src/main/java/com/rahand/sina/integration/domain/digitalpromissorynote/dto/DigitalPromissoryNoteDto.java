package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseDto;
import com.rahand.sina.integration.domain.digitalpromissorynote.enums.PromissoryNotePaidStatus;
import com.rahand.sina.integration.domain.digitalpromissorynote.enums.PromissoryNoteRequestStatus;
import com.rahand.sina.integration.domain.digitalpromissorynote.enums.PromissoryNoteSignStatus;
import lombok.Builder;

import java.time.LocalDateTime;

public class DigitalPromissoryNoteDto extends BaseDto {

    private String id;
    private String requestId;

    private String issuerFullName;

    private String recipientFullName;

    private PromissoryNotePaidStatus paidStatus;

    private PromissoryNoteRequestStatus requestStatus;

    private PromissoryNoteSignStatus signStatus;

    private LocalDateTime dueDate;

    private String persianDueDate;

    private LocalDateTime createdDateTime;

    private String persianCreatedDateTime;

    private String createdBy;

    private String description;

    private String unsignedBase64;

    private String signedPdfBase64;

    private String finalPromissoryNoteBase64;

    public DigitalPromissoryNoteDto() {
    }

    @Builder
    public DigitalPromissoryNoteDto(String id, String requestId, String issuerFullName, String recipientFullName, PromissoryNotePaidStatus paidStatus, PromissoryNoteRequestStatus requestStatus, PromissoryNoteSignStatus signStatus, LocalDateTime dueDate, String persianDueDate, LocalDateTime createdDateTime, String persianCreatedDateTime, String createdBy, String description, String unsignedBase64, String signedPdfBase64, String finalPromissoryNoteBase64) {
        this.id = id;
        this.requestId = requestId;
        this.issuerFullName = issuerFullName;
        this.recipientFullName = recipientFullName;
        this.paidStatus = paidStatus;
        this.requestStatus = requestStatus;
        this.signStatus = signStatus;
        this.dueDate = dueDate;
        this.persianDueDate = persianDueDate;
        this.createdDateTime = createdDateTime;
        this.persianCreatedDateTime = persianCreatedDateTime;
        this.createdBy = createdBy;
        this.description = description;
        this.unsignedBase64 = unsignedBase64;
        this.signedPdfBase64 = signedPdfBase64;
        this.finalPromissoryNoteBase64 = finalPromissoryNoteBase64;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getIssuerFullName() {
        return issuerFullName;
    }

    public void setIssuerFullName(String issuerFullName) {
        this.issuerFullName = issuerFullName;
    }

    public String getRecipientFullName() {
        return recipientFullName;
    }

    public void setRecipientFullName(String recipientFullName) {
        this.recipientFullName = recipientFullName;
    }

    public PromissoryNotePaidStatus getPaidStatus() {
        return paidStatus;
    }

    public void setPaidStatus(PromissoryNotePaidStatus paidStatus) {
        this.paidStatus = paidStatus;
    }

    public PromissoryNoteRequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(PromissoryNoteRequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public PromissoryNoteSignStatus getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(PromissoryNoteSignStatus signStatus) {
        this.signStatus = signStatus;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getPersianDueDate() {
        return persianDueDate;
    }

    public void setPersianDueDate(String persianDueDate) {
        this.persianDueDate = persianDueDate;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getPersianCreatedDateTime() {
        return persianCreatedDateTime;
    }

    public void setPersianCreatedDateTime(String persianCreatedDateTime) {
        this.persianCreatedDateTime = persianCreatedDateTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnsignedBase64() {
        return unsignedBase64;
    }

    public void setUnsignedBase64(String unsignedBase64) {
        this.unsignedBase64 = unsignedBase64;
    }

    public String getSignedPdfBase64() {
        return signedPdfBase64;
    }

    public void setSignedPdfBase64(String signedPdfBase64) {
        this.signedPdfBase64 = signedPdfBase64;
    }

    public String getFinalPromissoryNoteBase64() {
        return finalPromissoryNoteBase64;
    }

    public void setFinalPromissoryNoteBase64(String finalPromissoryNoteBase64) {
        this.finalPromissoryNoteBase64 = finalPromissoryNoteBase64;
    }
}
