package com.ansh.E_commerce.App.Service;

import com.ansh.E_commerce.App.Modal.User;
import com.ansh.E_commerce.App.exception.UserException;

public interface UserService {

    public User findUserProfileByJwt(String jwt) throws UserException;

    public User findUserByEmail(String email) throws UserException;


}

