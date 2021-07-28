package com.kodilla.patterns.library;

public class Prototype <A> implements Cloneable{
    @Override
    public A clone() throws CloneNotSupportedException {
        return (A)super.clone();
    }
}
