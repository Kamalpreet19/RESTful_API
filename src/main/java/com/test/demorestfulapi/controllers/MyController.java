package com.test.demorestfulapi.controllers;


import com.test.demorestfulapi.entities.User;
import com.test.demorestfulapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {


    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User addUserDetails(@RequestBody  User user){
        return userService.createUser(user);
    }


    @GetMapping("/users")
    public List<User> getAllUserDetails(){
        return userService.getAllUser();

    }


    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserDetails(@PathVariable int id){
        User user=userService.getUserData(id).orElse(null);
        if(user!=null){
            return ResponseEntity.ok().body(user);
        }else{
            return ResponseEntity.notFound().build();
        }
    }



    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUserDetails(@PathVariable int id, @RequestBody User user){
        User updatedUser=userService.updateUserData(id,user);
        if(updatedUser!=null){
            return ResponseEntity.ok(updatedUser);
        }else{
            return ResponseEntity.notFound().build();
        }
    }



    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }


}
