package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{

    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using){
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask(){
        return "Driving to -> " + where + " street";
    }

    @Override
    public String getTaskName(){
        return  "Our car has a mark -> " + taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        System.out.println("Task wasn't done\n" + "Our car is breake. You shoult using -> " + using + " -> and fixing ");
        return false;
    }
}
