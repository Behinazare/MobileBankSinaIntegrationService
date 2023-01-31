package com.rahand.sina.integration.domain.inquiry.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rahand.common.dto.BaseResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostInquiryResponse extends BaseResponse {

    @JsonProperty(value = "traceID")
    private int traceID;
    @JsonProperty(value = "errorCode")
    private int errorCode;
    @JsonProperty(value = "province")
    private String province;
    @JsonProperty(value = "townShip")
    private String townShip;
    @JsonProperty(value = "zone")
    private String zone;
    @JsonProperty(value = "village")
    private String village;
    @JsonProperty(value = "localityType")
    private String localityType;
    @JsonProperty(value = "localityName")
    private String localityName;
    @JsonProperty(value = "localityCode")
    private int localityCode;
    @JsonProperty(value = "subLocality")
    private String subLocality;
    @JsonProperty(value = "street")
    private String street;
    @JsonProperty(value = "street2")
    private String street2;
    @JsonProperty(value = "houseNumber")
    private int houseNumber;
    @JsonProperty(value = "floor")
    private String floor;
    @JsonProperty(value = "sideFloor")
    private String sideFloor;
    @JsonProperty(value = "buildingName")
    private String buildingName;
    @JsonProperty(value = "description")
    private String description;
    @JsonProperty(value = "postCode")
    private String postCode;

    public PostInquiryResponse() {
    }

    public PostInquiryResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, int traceID, int errorCode, String province, String townShip, String zone, String village, String localityType, String localityName, int localityCode, String subLocality, String street, String street2, int houseNumber, String floor, String sideFloor, String buildingName, String description, String postCode) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.traceID = traceID;
        this.errorCode = errorCode;
        this.province = province;
        this.townShip = townShip;
        this.zone = zone;
        this.village = village;
        this.localityType = localityType;
        this.localityName = localityName;
        this.localityCode = localityCode;
        this.subLocality = subLocality;
        this.street = street;
        this.street2 = street2;
        this.houseNumber = houseNumber;
        this.floor = floor;
        this.sideFloor = sideFloor;
        this.buildingName = buildingName;
        this.description = description;
        this.postCode = postCode;
    }

    public int getTraceID() {
        return traceID;
    }

    public void setTraceID(int traceID) {
        this.traceID = traceID;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTownShip() {
        return townShip;
    }

    public void setTownShip(String townShip) {
        this.townShip = townShip;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getLocalityType() {
        return localityType;
    }

    public void setLocalityType(String localityType) {
        this.localityType = localityType;
    }

    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public int getLocalityCode() {
        return localityCode;
    }

    public void setLocalityCode(int localityCode) {
        this.localityCode = localityCode;
    }

    public String getSubLocality() {
        return subLocality;
    }

    public void setSubLocality(String subLocality) {
        this.subLocality = subLocality;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getSideFloor() {
        return sideFloor;
    }

    public void setSideFloor(String sideFloor) {
        this.sideFloor = sideFloor;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
