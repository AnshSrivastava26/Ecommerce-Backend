package com.ansh.E_commerce.App.Response;

import com.ansh.E_commerce.App.Domain.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private boolean status;
    private String message;
    private USER_ROLE role;
}
