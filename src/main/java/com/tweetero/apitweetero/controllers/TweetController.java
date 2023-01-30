package com.tweetero.apitweetero.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.apitweetero.dto.TweetDTO;
import com.tweetero.apitweetero.model.Tweet;
import com.tweetero.apitweetero.services.TweetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class TweetController {
    
    @Autowired
    private TweetService service;

    @PostMapping("/tweet")
    public ResponseEntity publishTweet(@RequestBody @Valid TweetDTO req) {
        Tweet created = service.publish(req);

        if(created == null) { 
            ResponseEntity.status(409).build();
        }

        return ResponseEntity.ok("OK");
    }
}
