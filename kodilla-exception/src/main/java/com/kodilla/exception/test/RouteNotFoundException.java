package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception{
    public RouteNotFoundException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
