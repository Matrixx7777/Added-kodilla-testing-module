package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class GameOrderService implements OrderService{

    public boolean order(final User user, final LocalDateTime from, final LocalDateTime to) {
        System.out.println("Ordering game for: " + user.getName() + user.getSurname()
                + " from: " + from.toString() + " to: " + to.toString());

        return true;
    }
}
