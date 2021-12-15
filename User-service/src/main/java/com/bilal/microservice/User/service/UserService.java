package com.bilal.microservice.User.service;

import com.bilal.microservice.User.entity.User;
import com.bilal.microservice.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findUser(int userId) {
        return userRepository.findById(userId);
    }
}
