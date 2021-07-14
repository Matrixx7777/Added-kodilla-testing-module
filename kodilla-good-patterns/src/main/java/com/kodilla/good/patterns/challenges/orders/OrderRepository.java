package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(User user, LocalDateTime from, LocalDateTime to);
}
