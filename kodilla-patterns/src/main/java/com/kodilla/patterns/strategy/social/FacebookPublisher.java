package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher{

    @Override
    public String share(){
        return "FACEBOOK \n" +
                "login: \n" +
                "password:\n";
    }
}
