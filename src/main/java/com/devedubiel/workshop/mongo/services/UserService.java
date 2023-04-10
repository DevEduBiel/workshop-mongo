package com.devedubiel.workshop.mongo.services;

import com.devedubiel.workshop.mongo.domain.User;
import com.devedubiel.workshop.mongo.dto.UserDTO;
import com.devedubiel.workshop.mongo.repository.UserRepository;
import com.devedubiel.workshop.mongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ObjectStreamException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findById(String id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
    public User insert(User user) {
        return userRepository.insert(user);
    }
    public void delete(String id) {
        findById(id);
        userRepository.deleteById(id);
    }
    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

}
