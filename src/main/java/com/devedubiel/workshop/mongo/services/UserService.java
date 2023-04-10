package com.devedubiel.workshop.mongo.services;

import com.devedubiel.workshop.mongo.domain.User;
import com.devedubiel.workshop.mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
