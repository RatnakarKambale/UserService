package com.icwd.contoller;

import com.icwd.entities.Users;
import com.icwd.exception.ResourceNotFoundException;
import com.icwd.services.UserService;
import com.icwd.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl
            ;
    //create

    @PostMapping()
    public ResponseEntity<Users> createUser(@RequestBody Users user){
        Users user1 = userServiceImpl.saveUser(user);
        return  ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //single user get

    @GetMapping("/{userId}")
    public ResponseEntity<Users> getSingleUser(@PathVariable String userId) throws ResourceNotFoundException {
      Users user1= userServiceImpl.getUser(userId);
       return ResponseEntity.ok(user1);
    }

    //all user get
    @GetMapping()
public ResponseEntity<List<Users>> getAllUser(){

      return ResponseEntity.ok(userServiceImpl.getAllUser());
}

}
