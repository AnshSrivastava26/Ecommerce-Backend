package com.ansh.E_commerce.App.Repository;

import com.ansh.E_commerce.App.Modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
