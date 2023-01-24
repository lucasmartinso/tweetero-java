package com.tweetero.apitweetero.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.tweetero.apitweetero.dto.UserDTO;
import com.tweetero.apitweetero.model.User;
import com.tweetero.apitweetero.repositories.UserRepository;

import jakarta.validation.Valid;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public void signin(@RequestBody @Valid UserDTO req) { 
        repository.save(new User(req));

        ResponseEntity.ok();
    }
}
