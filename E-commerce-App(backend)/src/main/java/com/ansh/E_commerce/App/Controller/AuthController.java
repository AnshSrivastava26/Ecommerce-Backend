package com.ansh.E_commerce.App.Controller;

import com.ansh.E_commerce.App.Modal.User;
import com.ansh.E_commerce.App.Repository.UserRepository;
import com.ansh.E_commerce.App.Response.SignupRequest;
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

    @PostMapping("/signup")
    public ResponseEntity<User> createUserHandler(@RequestBody SignupRequest req){


        User user = new User();
        user.setEmail(req.getEmail());
        user.setFullName(req.getFullName());
        user.setPassword(req.getPassword());
        user.setMobile(req.getMobile());
        userRepository.save(user);
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }
}
