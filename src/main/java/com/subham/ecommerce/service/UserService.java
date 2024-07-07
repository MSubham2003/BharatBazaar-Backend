package com.subham.ecommerce.service;

import com.subham.ecommerce.exception.UserException;
import com.subham.ecommerce.model.User;

public interface UserService {

    public User findUserById(Long userid) throws UserException;
    public User findUserProfileByJwt(String jwt) throws UserException;


}
