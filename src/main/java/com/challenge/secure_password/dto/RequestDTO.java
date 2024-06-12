package com.challenge.secure_password.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestDTO {

    @NotBlank
    private String password;

}
