package com.test.demorestfulapi.service;

import com.test.demorestfulapi.entities.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    public User createUser(User user);
    public List<User> getAllUser();
    public Optional<User> getUserData(int id);
    public User updateUserData(int id, User user);
    public void deleteUser(int id);
}
