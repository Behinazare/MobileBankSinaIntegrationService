package com.rahand.sina.integration.domain.authentication.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.service.EncryptionService;
import com.rahand.sina.integration.domain.authentication.dto.ChannelAuthenticationRequest;
import com.rahand.sina.integration.domain.authentication.dto.ChannelAuthenticationResponse;
import org.junit.Test;

public class AuthenticationServiceTest {

    @Test
    public void channelUserAuthentication() {

        AuthenticationService authenticationService = new AuthenticationService();
        String userName = "";
        String password = "";

        ChannelAuthenticationRequest channelAuthenticationRequest = new ChannelAuthenticationRequest();
        channelAuthenticationRequest.setUserName(EncryptionService.encrypt(userName).getEncryptedData());
        channelAuthenticationRequest.setPassword(EncryptionService.encrypt(password).getEncryptedData());

        ResponseDto<ChannelAuthenticationResponse> responseDto = authenticationService.channelUserAuthentication(channelAuthenticationRequest);
        if (responseDto.isError()) {
            throw new CustomRuntimeException(responseDto.getMessage());
        } else {
            ChannelAuthenticationResponse channelAuthenticationResponse = responseDto.getResponseData();
            boolean isUser = channelAuthenticationResponse.isChannelUser();
        }

    }
}