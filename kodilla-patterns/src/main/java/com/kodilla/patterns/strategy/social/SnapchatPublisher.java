package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher{

    @Override
    public String share(){
        return "SNAPCHAT \n" +
                "login: \n" +
                "password:\n";
    }
}
