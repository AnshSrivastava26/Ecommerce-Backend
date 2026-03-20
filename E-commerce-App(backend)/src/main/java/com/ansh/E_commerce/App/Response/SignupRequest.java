package com.ansh.E_commerce.App.Response;

import lombok.Data;

@Data
public class SignupRequest {
    private String email;
    private String fullName;
    private String password;
    private String mobile;

}
