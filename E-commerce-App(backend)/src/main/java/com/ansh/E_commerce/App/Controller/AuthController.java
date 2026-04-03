package com.ansh.E_commerce.App.Controller;

import com.ansh.E_commerce.App.Domain.USER_ROLE;
import com.ansh.E_commerce.App.Modal.User;
import com.ansh.E_commerce.App.Repository.UserRepository;
import com.ansh.E_commerce.App.Response.AuthResponse;
import com.ansh.E_commerce.App.Response.SignupRequest;
import com.ansh.E_commerce.App.Service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final UserRepository userRepository;
    private final AuthService authService;


    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> createUserHandler(@RequestBody SignupRequest req){
        String jwt = authService.createUser(req);

        AuthResponse res = new AuthResponse();
        res.setJwt(jwt);
        res.setMessage("register success");
        res.setRole(USER_ROLE.ROLE_CUSTOMER);

        return  ResponseEntity.ok(res);
    }

}
