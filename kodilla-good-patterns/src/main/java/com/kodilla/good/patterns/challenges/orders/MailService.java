package com.kodilla.good.patterns.challenges.orders;

public class MailService implements InformationService {
    public void inform(final User user){
        System.out.println("User's name and surname: " + user.getName() + user.getSurname());
    }
}
