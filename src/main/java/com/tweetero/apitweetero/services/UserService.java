package com.tweetero.apitweetero.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetero.apitweetero.dto.UserDTO;
import com.tweetero.apitweetero.model.User;
import com.tweetero.apitweetero.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public User signUp(UserDTO userData) { 
        User user = repository.findByUsername(userData.username());

        if(user!=null) { 
            return null;
        }

        return repository.save(new User(userData));

        
    }
}
