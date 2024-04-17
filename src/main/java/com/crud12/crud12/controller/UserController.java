package com.crud12.crud12.controller;

import com.crud12.crud12.model.User;
import com.crud12.crud12.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService userServices;

    @PostMapping
    public User createUser(@RequestBody User user){
        return userServices.createUser(user);
    }

    public List<User> getAllUSers(){
        return userServices.getAllUsers();
    }
    @GetMapping("{id}")
    public User searchUserById(@PathVariable("id") Long id){
        return userServices.getUserById(id);
    }
    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable("id") Long id){
        userServices.deteUser(id);
    }
}
