package com.rahand.sina.integration.domain.digitalcertificate.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.common.enums.Gender;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.digitalcertificate.dto.*;
import com.rahand.sina.integration.domain.digitalcertificate.enums.CertificateRemoveReason;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class
DigitalCertificateServiceTest {

    @Test
    public void introduce() {

        DigitalCertificateService digitalCertificateService = new DigitalCertificateService();
        DigitalCertificateIntroduceRequest digitalCertificateIntroduceRequest = new DigitalCertificateIntroduceRequest();
        digitalCertificateIntroduceRequest.setFirstName("قرنوش");
        digitalCertificateIntroduceRequest.setLastName("فلاح");
        digitalCertificateIntroduceRequest.setLatinFirstName("ّFarnoush");
        digitalCertificateIntroduceRequest.setLatinLastName("Fallah");
        digitalCertificateIntroduceRequest.setFatherName("Saeid");
        digitalCertificateIntroduceRequest.setMobileNumber("09039485289");
        digitalCertificateIntroduceRequest.setNationalCode("0311317553");
        digitalCertificateIntroduceRequest.setBirthDate(CommonUtil.perisanDateToLocalDateTime("1374/07/08"));
        digitalCertificateIntroduceRequest.setJobTitle("توسعه دهنده نرم افزار");
        digitalCertificateIntroduceRequest.setAddress("تهران جردن رهند");
        digitalCertificateIntroduceRequest.setPostalCode("1915653546");
        digitalCertificateIntroduceRequest.setStatCode(21);
        digitalCertificateIntroduceRequest.setCityCode(304);
        digitalCertificateIntroduceRequest.setEmail("");
        digitalCertificateIntroduceRequest.setGender(Gender.FEMALE);
        digitalCertificateIntroduceRequest.setOrganizationPerson(false);

        ResponseDto<DigitalCertificateIntroduceResponse> responseDto = digitalCertificateService.introduce(digitalCertificateIntroduceRequest);
        DigitalCertificateIntroduceResponse digitalCertificateIntroduceResponse = responseDto.getResponseData();
    }

    @Test
    public void create() {

        DigitalCertificateService digitalCertificateService = new DigitalCertificateService();
        DigitalCertificateCreateRequest digitalCertificateCreateRequest = new DigitalCertificateCreateRequest();
        digitalCertificateCreateRequest.setCertificateRequestId("1e63a4f0-0a1d-4c7a-a86c-9f6528d7c7a7");
        digitalCertificateCreateRequest.setNationalCode("0322905427");
        digitalCertificateCreateRequest.setPassword("R1igoGG8fhCiCcZ38ALOzGz3LS28wg8GKK8+ZcFV92xUCG1AzerGKMEU4UWk1m8gBoWs7gaW8fdmL7qiYqD09z7041WRsAqNHbYaw3NAfIZbjzAMHXNH8Dh6HFSIzcpTBnlcwLTGc/lRIWxlb5BCxss+0eZrL+zfa85I725D/KPWCQqarXDCC1vE5XhtJWS3");
        ResponseDto<DigitalCertificateCreateResponse> responseDto = digitalCertificateService.create(digitalCertificateCreateRequest);
        DigitalCertificateCreateResponse digitalCertificateCreateResponse = responseDto.getResponseData();
    }

    @Test
    public void remove() {

        DigitalCertificateService digitalCertificateService = new DigitalCertificateService();
        DigitalCertificateRemoveRequest digitalCertificateRemoveRequest = new DigitalCertificateRemoveRequest();
        digitalCertificateRemoveRequest.setCertificateRequestId("a7478d9d-36db-44eb-90dc-0b7bc5f21387");
        digitalCertificateRemoveRequest.setNationalCode("0082205388");
        digitalCertificateRemoveRequest.setReason(CertificateRemoveReason.KEY_CONCEPTS);
        ResponseDto<DigitalCertificateRemoveResponse> responseDto = digitalCertificateService.remove(digitalCertificateRemoveRequest);
        DigitalCertificateRemoveResponse digitalCertificateRemoveResponse = responseDto.getResponseData();
    }

    @Test
    public void getStates() {

        DigitalCertificateService digitalCertificateService = new DigitalCertificateService();
        List<Map<String, Object>> states = digitalCertificateService.getStates();

    }

    @Test
    public void getStateCites() {

        DigitalCertificateService digitalCertificateService = new DigitalCertificateService();
        List<Map<String, Object>> cities = digitalCertificateService.getStateCites(21);

    }

    @Test
    public void getNonGovernmentalOrganizationType() {

        DigitalCertificateService digitalCertificateService = new DigitalCertificateService();
        List<Map<String, Object>> nonGovernmentalOrganizations = digitalCertificateService.getNonGovernmentalOrganizationType();

    }
}