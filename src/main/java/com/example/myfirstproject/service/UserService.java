package com.example.myfirstproject.service;


import com.example.myfirstproject.entity.User;
import com.example.myfirstproject.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user){
        userRepository.save(user);
    }

    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public void saveNewUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

}
