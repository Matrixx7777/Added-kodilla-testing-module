package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOP = "SHOP";
    public static final String PAINT = "PAINT";
    public static final String DRIVE = "DRIVE";

    public final Task makeTask(final String task){
        switch(task){
            case SHOP:
                return new ShoppingTask("Kitchen things", "knifs", 2.0);
            case PAINT:
                return new PaintingTask("brush", "black", "picture");
            case DRIVE:
                return new DrivingTask("BMW", "20 warszawska", "screwdriver");
            default:
                return null;
        }
    }
}
