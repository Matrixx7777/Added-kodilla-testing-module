package com.kodilla.good.patterns.challenges.orders;

public class OrderDto {
    public User user;
    public boolean isOrdered;

    public OrderDto(final User user, final boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }
}
