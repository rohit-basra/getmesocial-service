package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList<>();

    /*public User getUser(){
        //User user = new User("rohit","233 xyz",35,"");
        //User user = new User();
        //return user;
        return null;
    }*/

    public User saveUser(User user) {
        user.setUserId(userList.size()+1);
        userList.add(user);
        return user;
    }

    public List<User> getAllusers() {
        return userList;
    }

    public User getUserById(int userId) {
        for(User user:userList){
            if(user.getUserId()==userId){
                return user;
            }
        }
        return null;
    }

    public User updateUser(int userId, User user) {
        for(User u:userList){
            if(u.getUserId() == userId){
                u.setName(user.getName());
                u.setAddress(user.getAddress());
                u.setAge(user.getAge());
                return u;
            }
        }
        return null;
    }

    public User deleteUser(int userId) {
        User deleteUser = null;
        for(User u:userList){
            if(u.getUserId() == userId){
                deleteUser = u;
                userList.remove(u);
                return deleteUser;
            }
        }
        return deleteUser;
    }
}
