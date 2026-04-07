package com.test.demorestfulapi.service;

import com.test.demorestfulapi.entities.User;
import com.test.demorestfulapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> getUserData(int id) {
        return userRepo.findById(id);
    }

    @Override
    public User updateUserData(int id, User newUser) {
        User userData=userRepo.findById(id).orElse(null);
        if(userData!=null){
            return userRepo.save(newUser);
        }else{
            throw new RuntimeException("user not found");
        }
    }

    @Override
    public void deleteUser(int id) {
        userRepo.deleteById(id);
    }
}
