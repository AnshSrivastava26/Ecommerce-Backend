package com.ansh.E_commerce.App.Service;


import com.ansh.E_commerce.App.Response.SignupRequest;

public interface AuthService {

    String createUser(SignupRequest req);
}
