package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class GameOrderRepository implements OrderRepository{
    public boolean createOrder(final User user, final LocalDateTime from, final LocalDateTime to) {
        System.out.println("Ordered game for: " + user.getName() + user.getSurname()
                + " from: " + from.toString() + " to: " + to.toString());
        return true;
    }

}
