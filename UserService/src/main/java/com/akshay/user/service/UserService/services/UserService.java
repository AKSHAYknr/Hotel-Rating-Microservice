package com.akshay.user.service.UserService.services;

import com.akshay.user.service.UserService.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    //Create User
    User saveUser(User user);

    //get all users
    List<User> getAllUsers();

    //get single user of given userId
    User getUserById(String userId);
}
