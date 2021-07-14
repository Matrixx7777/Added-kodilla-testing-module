package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Dawid", "Kocik");

        LocalDateTime orderFrom = LocalDateTime.of(2021, 7, 12, 20, 0);
        LocalDateTime orderTo = LocalDateTime.of(2021, 7, 15, 16, 30);

        return new OrderRequest(user, orderFrom, orderTo);
    }
}
