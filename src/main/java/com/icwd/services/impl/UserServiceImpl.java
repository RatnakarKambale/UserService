package com.icwd.services.impl;

import com.icwd.entities.Users;
import com.icwd.exception.ResourceNotFoundException;
import com.icwd.repositories.UserRepository;
import com.icwd.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public Users saveUser(Users user) {

        // generate unique User Id
       String randomUserId= UUID.randomUUID().toString();
       user.setUserId(randomUserId);
        return userRepository.save(user);
    }
    @Override
    public List<Users> getAllUser() {
                return userRepository.findAll();
    }
    @Override
    public Users getUser(String userId) throws ResourceNotFoundException {
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server"));
    }
}
