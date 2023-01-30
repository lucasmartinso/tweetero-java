package com.tweetero.apitweetero.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetero.apitweetero.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {}
