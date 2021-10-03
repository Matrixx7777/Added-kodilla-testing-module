package com.kodilla.patterns2.facade.api;

import com.kodilla.patterns2.facade.Order;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderWatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.factorialOrder(..))" +
            "&& target(order)")
    public void checkOrder(Order order) {
        LOGGER.info("Class: " + order.getClass().getName() + ", Order Id: " + order.getOrderId() +
                "Order Item: " + order.getItems());
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.factorialOrder(..))")
    public Object orderTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed " + (end - begin) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
