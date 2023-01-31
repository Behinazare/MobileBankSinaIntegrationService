package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseDto;
import com.rahand.sina.integration.domain.bank.enums.PersonalityType;
import lombok.Builder;

public class SayadChequeHolderDto extends BaseDto {

    private String name;
    private String identityId;
    private String pervasiveId;
    private PersonalityType personalityType;

    public SayadChequeHolderDto() {
    }

    @Builder
    public SayadChequeHolderDto(String name, String identityId, String pervasiveId, PersonalityType personalityType) {
        this.name = name;
        this.identityId = identityId;
        this.pervasiveId = pervasiveId;
        this.personalityType = personalityType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getPervasiveId() {
        return pervasiveId;
    }

    public void setPervasiveId(String pervasiveId) {
        this.pervasiveId = pervasiveId;
    }

    public PersonalityType getPersonalityType() {
        return personalityType;
    }

    public void setPersonalityType(PersonalityType personalityType) {
        this.personalityType = personalityType;
    }
}
