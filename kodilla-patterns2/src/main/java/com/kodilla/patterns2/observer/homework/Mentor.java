package com.kodilla.patterns2.observer.homework;

public class Mentor implements KodillaObserver{


    private final String userName;
    private int tasksUpdateCount;

    public Mentor(String userName){
        this.userName = userName;
    }

    @Override
    public void updateKodilla(KodillaUser kodillaUser){
        System.out.println(userName + ": Get new messages in from " + kodillaUser.getName() + "\n" +
                " (total: " + kodillaUser.getMessages().size() + " messages)");
        tasksUpdateCount++;
    }

    public String getUserName() {
        return userName;
    }

    public int getTasksUpdateCount() {
        return tasksUpdateCount;
    }

}
