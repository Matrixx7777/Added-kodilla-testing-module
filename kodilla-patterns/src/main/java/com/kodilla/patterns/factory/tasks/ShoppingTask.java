package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask(){
        return "Go to shop and buy -> " + whatToBuy;
    }

    @Override
    public String getTaskName(){
        return  "We need to use -> " + taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        System.out.println("! Task was done !\n" + "We have got -> " + quantity + " quantity");
        return true;
    }
}
