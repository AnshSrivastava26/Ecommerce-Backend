package com.ansh.E_commerce.App.Service.ServiceImpl;

import com.ansh.E_commerce.App.Domain.USER_ROLE;
import com.ansh.E_commerce.App.Modal.User;
import com.ansh.E_commerce.App.Repository.UserRepository;
import com.ansh.E_commerce.App.Request.SignupRequest;
import com.ansh.E_commerce.App.Service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public String createUser(SignupRequest req) {
        User user = userRepository.findByEmail(req.getEmail());

        if(user == null) {
            User createUser = new User();
            createUser.setEmail(req.getEmail());
            createUser.setMobile(req.getMobile());
            createUser.setFullName(req.getFullName());
            createUser.setRole(USER_ROLE.ROLE_CUSTOMER);
            createUser.setPassword(passwordEncoder.encode(req.getOtp()));

            user = userRepository.save((createUser));
        }

        return "";
    }
}
