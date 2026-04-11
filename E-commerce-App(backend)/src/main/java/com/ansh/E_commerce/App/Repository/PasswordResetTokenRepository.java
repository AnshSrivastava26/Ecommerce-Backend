package com.ansh.E_commerce.App.Repository;

import com.ansh.E_commerce.App.Modal.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
    PasswordResetToken findByToken(String token);
}
