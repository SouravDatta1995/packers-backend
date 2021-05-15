package com.packers.packersbackend.controller;

import com.packers.packersbackend.model.User;
import com.packers.packersbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/")
    public User findUser(@RequestBody User user) {
        User result = userRepository.findById(user.getId()).get();
        return result;
    }
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        User result = userRepository.save(user);
        return result;
    }
}
