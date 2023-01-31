package com.rahand.sina.integration.domain.bank.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.common.enums.Gender;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.service.EncryptionService;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.authentication.service.AuthenticationService;
import com.rahand.sina.integration.domain.bank.dto.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BankCustomerServiceTest {

    @Test
    public void checkCustomer() {

        BankCustomerService bankCustomerService = new BankCustomerService();
        CheckCustomerRequest checkCustomerRequest = new CheckCustomerRequest();
        checkCustomerRequest.setNationalCode("4310687032");
        ResponseDto<CheckCustomerResponse> responseDto = bankCustomerService.checkCustomer(checkCustomerRequest);
        CheckCustomerResponse checkCustomerResponse = responseDto.getResponseData();

    }

    @Test
    public void getCustomerInfo() {

        BankCustomerService bankCustomerService = new BankCustomerService();
        CustomerInfoRequest customerInfoRequest = new CustomerInfoRequest();
        customerInfoRequest.setCif("4234497");
        ResponseDto<CustomerInfoResponse> responseDto = bankCustomerService.getCustomerInfo(customerInfoRequest);
        CustomerInfoResponse customerInfoResponse = responseDto.getResponseData();

    }

    @Test
    public void getCustomerDetailInfo() {

        BankCustomerService bankCustomerService = new BankCustomerService();
        CustomerInfoDetailRequest customerInfoDetailRequest = new CustomerInfoDetailRequest();
        customerInfoDetailRequest.setCif("4234497");
        ResponseDto<CustomerInfoDetailResponse> responseDto = bankCustomerService.getCustomerDetailInfo(customerInfoDetailRequest);
        CustomerInfoDetailResponse customerInfoDetailResponse = responseDto.getResponseData();

    }

    @Test
    public void createCustomer() {

        BankCustomerService bankCustomerService = new BankCustomerService();

        CreateCustomerRequest createCustomerRequest = new CreateCustomerRequest();

        createCustomerRequest.setGroupCode("1");
        createCustomerRequest.setNationalityCode("1");
        createCustomerRequest.setNationalCode("3040348191");
        createCustomerRequest.setMobileNumber("09135302884");
        createCustomerRequest.setFirstName("سارا");
        createCustomerRequest.setLastName("عباسی");
        createCustomerRequest.setFatherName("نوید");
        createCustomerRequest.setLatinFirstName("Sara");
        createCustomerRequest.setLatinLastName("Abbasi");
        createCustomerRequest.setLatinFatherName("Navid");
        createCustomerRequest.setGender(Gender.FEMALE);
        createCustomerRequest.setBirthDate(CommonUtil.perisanDateToLocalDateTime("1370/06/03"));
        createCustomerRequest.setBirthPlaceCountry("1");
        createCustomerRequest.setBookIdSerial("326598");
        createCustomerRequest.setBookIdNumericSerie("98");
        createCustomerRequest.setBookIdAlphabeticSerie("الف");
        createCustomerRequest.setIssueCityCode("10000");
        createCustomerRequest.setIssueDomainCode("814");
        createCustomerRequest.setIssueLocationName("تهران");
        createCustomerRequest.setIdCardNumber("3040348191");
        createCustomerRequest.setIdentificationCardSeriesCode("1");

        List<CreateCustomerAddressDto> addressList = new ArrayList<>();
        CreateCustomerAddressDto createCustomerAddressDto = new CreateCustomerAddressDto();
        createCustomerAddressDto.setAddressType("1");
        createCustomerAddressDto.setAddress1("تهران جردن کوچه تور");
        createCustomerAddressDto.setAddress2("و-و 4 -ط چهارم- پ 72");
        createCustomerAddressDto.setAddress3("ساختمان تور");
        createCustomerAddressDto.setPhone("02144668878");
        createCustomerAddressDto.setZipCode("1917733376");
        createCustomerAddressDto.setCityCode("10000");
        createCustomerAddressDto.setStateCode("1");
        createCustomerAddressDto.setFax("");
        createCustomerAddressDto.setTelFax("");
        createCustomerAddressDto.setEmail("");

        addressList.add(createCustomerAddressDto);

        createCustomerRequest.setAddress(addressList);

        List<CreateCustomerImagesDto> imagesList = new ArrayList<>();
        CreateCustomerImagesDto createCustomerImagesDto = new CreateCustomerImagesDto();
        createCustomerImagesDto.setType("1");
        createCustomerImagesDto.setImage("");
        imagesList.add(createCustomerImagesDto);

        createCustomerRequest.setImages(imagesList);

        ResponseDto<CreateCustomerResponse> response = bankCustomerService.createCustomer(createCustomerRequest);
        CreateCustomerResponse createCustomerResponse = response.getResponseData();
        String cif = createCustomerResponse.getCif();
    }


    @Test
    public void getCustomerAddresses() {
        BankCustomerService bankCustomerService = new BankCustomerService();
        CustomerAddressRequest customerAddressRequest = new CustomerAddressRequest();
        customerAddressRequest.setCif("2295556");
        ResponseDto<CustomerAddressResponse> responseDto = bankCustomerService.getCustomerAddresses(customerAddressRequest);
        CustomerAddressResponse customerAddressResponse = responseDto.getResponseData();
    }

    @Test
    public void getCustomerSignatures() {
        BankCustomerService bankCustomerService = new BankCustomerService();
        CustomerSignaturesRequest customerSignaturesRequest = new CustomerSignaturesRequest();
        customerSignaturesRequest.setCif("2295556");
        ResponseDto<CustomerSignaturesResponse> responseDto = bankCustomerService.getCustomerSignatures(customerSignaturesRequest);
        responseDto.isError();
        CustomerSignaturesResponse customerSignaturesResponse = responseDto.getResponseData();
    }

    @Test
    public void GenerateChannelUser() {

        BankCustomerService bankCustomerService = new BankCustomerService();
        GenerateChannelUserRequest generateChannelUserRequest = new GenerateChannelUserRequest();
        generateChannelUserRequest.setCif("658926");
        generateChannelUserRequest.setNationalCode("4310687032");
        ResponseDto<GenerateChannelUserResponse> responseDto = bankCustomerService.generateChannelUser(generateChannelUserRequest);
        GenerateChannelUserResponse generateChannelUserResponse = responseDto.getResponseData();
        generateChannelUserResponse.sendMessage("09226054364");
        System.out.println(generateChannelUserResponse.toJson());

    }

    @Test
    public void changeChannelPassword() {

        String initiator = "BR-9301050934";
        Map<String, String> clientInput = new LinkedHashMap<>();
        clientInput.put("initiator", initiator.replaceAll("BR-",""));
        clientInput.put("Secure_ChannelUserName", "teymoori");
        clientInput.put("Secure_ChannelPassword", "t123456789");
        clientInput.put("time", String.valueOf(System.currentTimeMillis()));
        clientInput.put("DeviceId", "1.180610.011");

        String data = null;
        data = EncryptionService.encrypt(CommonUtil.toJson(clientInput)).getEncryptedData();
        AuthenticationService.addChannelUserData(data);

        BankCustomerService bankCustomerService = new BankCustomerService();
        ChangeChannelPasswordRequest changeChannelPasswordRequest = new ChangeChannelPasswordRequest();
        changeChannelPasswordRequest.setChannelUserName(EncryptionService.encrypt("teymoori").getEncryptedData());
        changeChannelPasswordRequest.setChannelCurrentPassword(EncryptionService.encrypt("t123456789").getEncryptedData());
        changeChannelPasswordRequest.setNewPassword(EncryptionService.encrypt("123456test").getEncryptedData());
        changeChannelPasswordRequest.setRepeatNewPassword(EncryptionService.encrypt("123456test").getEncryptedData());
        changeChannelPasswordRequest.setNationalCode("0819892513");

        ResponseDto<ChangeChannelPasswordResponse> responseDto = bankCustomerService.changeChannelPassword(changeChannelPasswordRequest);

        if (responseDto.isError()) {
            throw new CustomRuntimeException(responseDto.getMessage());
        }
    }
}