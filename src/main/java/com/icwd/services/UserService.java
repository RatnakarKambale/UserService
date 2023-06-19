package com.icwd.services;

import com.icwd.entities.Users;
import com.icwd.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    //user operations

    //create

    Users saveUser(Users users);

    //get all user
    List<Users> getAllUser();

    //get single user of given userId;
    Users getUser(String userId) throws ResourceNotFoundException;
}

