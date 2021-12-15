package com.bilal.microservice.User.controller;

import com.bilal.microservice.User.entity.User;
import com.bilal.microservice.User.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("insert user ");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public Optional<User> findUser(@PathVariable("id") int userId){
        log.info("insert user ");
        return userService.findUser(userId);
    }

}
