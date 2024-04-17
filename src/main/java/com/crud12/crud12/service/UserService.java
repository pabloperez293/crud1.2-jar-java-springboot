package com.crud12.crud12.service;

import com.crud12.crud12.model.User;
import com.crud12.crud12.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);    }

    public User getUserById(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.get();
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public void deteUser(Long id){
        userRepository.deleteById(id);
    }
}
