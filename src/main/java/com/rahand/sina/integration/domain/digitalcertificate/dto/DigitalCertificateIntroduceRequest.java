package com.rahand.sina.integration.domain.digitalcertificate.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.common.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


public class DigitalCertificateIntroduceRequest extends BaseRequest {

    private String firstName;
    private String lastName;
    private String latinFirstName;
    private String latinLastName;
    private String fatherName;
    private String mobileNumber;
    private String nationalCode;
    private String phoneNumber;
    private String postalCode;
    private Integer StatCode;
    private Integer cityCode;
    private String email;
    private String jobTitle;
    private String address;
    private LocalDateTime birthDate;
    private Gender gender;
    private boolean organizationPerson;
    private Organization organization;

    public DigitalCertificateIntroduceRequest() {
    }

    @Builder
    public DigitalCertificateIntroduceRequest(String userId, String firstName, String lastName, String latinFirstName, String latinLastName, String fatherName, String mobileNumber, String nationalCode, String phoneNumber, String postalCode, Integer statCode, Integer cityCode, String email, String jobTitle, String address, LocalDateTime birthDate, Gender gender, boolean organizationPerson, Organization organization) {
        super(userId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.latinFirstName = latinFirstName;
        this.latinLastName = latinLastName;
        this.fatherName = fatherName;
        this.mobileNumber = mobileNumber;
        this.nationalCode = nationalCode;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
        StatCode = statCode;
        this.cityCode = cityCode;
        this.email = email;
        this.jobTitle = jobTitle;
        this.address = address;
        this.birthDate = birthDate;
        this.gender = gender;
        this.organizationPerson = organizationPerson;
        this.organization = organization;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLatinFirstName() {
        return latinFirstName;
    }

    public void setLatinFirstName(String latinFirstName) {
        this.latinFirstName = latinFirstName;
    }

    public String getLatinLastName() {
        return latinLastName;
    }

    public void setLatinLastName(String latinLastName) {
        this.latinLastName = latinLastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getStatCode() {
        return StatCode;
    }

    public void setStatCode(Integer statCode) {
        StatCode = statCode;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isOrganizationPerson() {
        return organizationPerson;
    }

    public void setOrganizationPerson(boolean organizationPerson) {
        this.organizationPerson = organizationPerson;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Organization {
        private boolean governmentalOrganization;
        private String registrationName;
        private String otherOrganizationName;
        private String latinRegistrationName;
        private String registerCode;
        private String latinTradeName;
        private String organizationTypeCode;
        private String address;
        private String faxNumber;
        private String phoneNumber;
        private String webSite;
        private String unitLevel1;
        private String unitLevel2;
        private String unitLevel3;
        private String unitLevel4;

        public boolean isGovernmentalOrganization() {
            return governmentalOrganization;
        }

        public void setGovernmentalOrganization(boolean governmentalOrganization) {
            this.governmentalOrganization = governmentalOrganization;
        }

        public String getRegistrationName() {
            return registrationName;
        }

        public void setRegistrationName(String registrationName) {
            this.registrationName = registrationName;
        }

        public String getOtherOrganizationName() {
            return otherOrganizationName;
        }

        public void setOtherOrganizationName(String otherOrganizationName) {
            this.otherOrganizationName = otherOrganizationName;
        }

        public String getLatinRegistrationName() {
            return latinRegistrationName;
        }

        public void setLatinRegistrationName(String latinRegistrationName) {
            this.latinRegistrationName = latinRegistrationName;
        }

        public String getRegisterCode() {
            return registerCode;
        }

        public void setRegisterCode(String registerCode) {
            this.registerCode = registerCode;
        }

        public String getLatinTradeName() {
            return latinTradeName;
        }

        public void setLatinTradeName(String latinTradeName) {
            this.latinTradeName = latinTradeName;
        }

        public String getOrganizationTypeCode() {
            return organizationTypeCode;
        }

        public void setOrganizationTypeCode(String organizationTypeCode) {
            this.organizationTypeCode = organizationTypeCode;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getFaxNumber() {
            return faxNumber;
        }

        public void setFaxNumber(String faxNumber) {
            this.faxNumber = faxNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getWebSite() {
            return webSite;
        }

        public void setWebSite(String webSite) {
            this.webSite = webSite;
        }

        public String getUnitLevel1() {
            return unitLevel1;
        }

        public void setUnitLevel1(String unitLevel1) {
            this.unitLevel1 = unitLevel1;
        }

        public String getUnitLevel2() {
            return unitLevel2;
        }

        public void setUnitLevel2(String unitLevel2) {
            this.unitLevel2 = unitLevel2;
        }

        public String getUnitLevel3() {
            return unitLevel3;
        }

        public void setUnitLevel3(String unitLevel3) {
            this.unitLevel3 = unitLevel3;
        }

        public String getUnitLevel4() {
            return unitLevel4;
        }

        public void setUnitLevel4(String unitLevel4) {
            this.unitLevel4 = unitLevel4;
        }
    }
}
