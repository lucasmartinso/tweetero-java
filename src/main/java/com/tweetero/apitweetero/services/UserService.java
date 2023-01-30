package com.tweetero.apitweetero.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tweetero.apitweetero.dto.UserDTO;
import com.tweetero.apitweetero.model.User;
import com.tweetero.apitweetero.repositories.UserRepository;

import jakarta.validation.OverridesAttribute.List;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public User SignUp(UserDTO userData) { 
        User user = repository.findByUsername(userData.username());

        if(user!=null) { 
            return null;
        }

        return repository.save(new User(userData));

        
    }
}
