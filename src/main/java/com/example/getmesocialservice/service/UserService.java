package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(){
        return userRepository.getUser();
        /*User user = new User("rohit","233 xyz",35,"");
        return user;
        */
    }

    public User saveUser(User user) {

        return userRepository.saveUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllusers();
    }

    public User getUserById(int userId){
        return userRepository.getUserById(userId);
    }

    public User updateUser(int userId, User user) {
        return userRepository.updateUser(userId, user);
    }

    public User deleteUser(int userId) {
        return userRepository.deleteUser(userId);
    }
}
