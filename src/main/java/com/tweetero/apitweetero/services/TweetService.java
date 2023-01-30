package com.tweetero.apitweetero.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetero.apitweetero.dto.TweetDTO;
import com.tweetero.apitweetero.model.Tweet;
import com.tweetero.apitweetero.repositories.TweetRepository;

@Service
public class TweetService {
    
    @Autowired
    private TweetRepository repository;

    public Tweet publish(TweetDTO tweetData) { 
        return repository.save(new Tweet(tweetData));
    }
}
