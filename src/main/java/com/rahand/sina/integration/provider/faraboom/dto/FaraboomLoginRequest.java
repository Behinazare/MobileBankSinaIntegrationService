package com.rahand.sina.integration.provider.faraboom.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FaraboomLoginRequest {

   private String userName;
   private String password;

}
