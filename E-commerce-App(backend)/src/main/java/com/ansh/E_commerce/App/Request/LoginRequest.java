package com.ansh.E_commerce.App.Request;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String otp;
}
