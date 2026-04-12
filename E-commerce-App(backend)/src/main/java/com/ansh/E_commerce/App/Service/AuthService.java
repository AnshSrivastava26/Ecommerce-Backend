package com.ansh.E_commerce.App.Service;


import com.ansh.E_commerce.App.Request.LoginRequest;
import com.ansh.E_commerce.App.Response.AuthResponse;
import com.ansh.E_commerce.App.Request.SignupRequest;

public interface AuthService {
    void sentLoginOtp(String email) throws Exception;
    String createUser(SignupRequest req) throws Exception;
    AuthResponse signin(LoginRequest req);
}
