package com.ansh.E_commerce.App.Controller;

import com.ansh.E_commerce.App.Domain.USER_ROLE;
import com.ansh.E_commerce.App.Modal.VerificationCode;
import com.ansh.E_commerce.App.Repository.UserRepository;
import com.ansh.E_commerce.App.Request.LoginRequest;
import com.ansh.E_commerce.App.Response.ApiResponse;
import com.ansh.E_commerce.App.Response.AuthResponse;
import com.ansh.E_commerce.App.Request.SignupRequest;
import com.ansh.E_commerce.App.Service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<AuthResponse> createUserHandler(@RequestBody SignupRequest req) throws Exception {
        String jwt = authService.createUser(req);

        AuthResponse res = new AuthResponse();
        res.setJwt(jwt);
        res.setMessage("register success");
        res.setRole(USER_ROLE.ROLE_CUSTOMER);

        return  ResponseEntity.ok(res);
    }


    @PostMapping("/sent/login-signup-otp")
    public ResponseEntity<ApiResponse> sentLoginOtpHandler(
            @RequestBody VerificationCode req) throws Exception {

        authService.sentLoginOtp(req.getEmail());

        ApiResponse res = new ApiResponse();
        res.setMessage("otp sent successfully");
//        res.setStatus(true);
        return ResponseEntity.ok(res);
    }
    @PostMapping("/signin")
    public ResponseEntity<AuthResponse> signin(@RequestBody LoginRequest loginRequest) throws Exception {
        AuthResponse authResponse = authService.signin(loginRequest);
        return new ResponseEntity<>(authResponse, HttpStatus.OK);
    }

}
