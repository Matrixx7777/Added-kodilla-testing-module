package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask(){
        return "Draw this on the picture -> " + whatToPaint;
    }

    @Override
    public String getTaskName(){
        return  "We need to use -> " + taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        System.out.println("! Task was done !\n "+ "We have got most color-> " + color);
        return true;
    }
}
