package com.kodilla.patterns.strategy.social;

public class User {

    private String name;
    protected SocialPublisher social;

    User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost(){
        return social.share();
    }

    public void setSocialPublisher(SocialPublisher social) {
        this.social = social;
    }
}
