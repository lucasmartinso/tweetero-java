package com.tweetero.apitweetero.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.apitweetero.dto.UserDTO;
import com.tweetero.apitweetero.model.User;
import com.tweetero.apitweetero.services.UserService;

import jakarta.validation.Valid;


@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService service;
    
    @PostMapping("/sign-up")
    public ResponseEntity signUp(@RequestBody @Valid UserDTO req) { 
        User created = service.signUp(req);

        if(created == null) { 
            ResponseEntity.status(409).build();
        }

        return ResponseEntity.ok("OK");
    }
}
