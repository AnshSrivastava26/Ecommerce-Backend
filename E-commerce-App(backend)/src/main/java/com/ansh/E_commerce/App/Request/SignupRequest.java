package com.ansh.E_commerce.App.Request;


import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class SignupRequest {
    private String fullName;
    private String email;
    private String otp;
}
