package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class KodillaUser  implements KodillaObservable{

    private final List<Mentor> listTasks;
    private final List<String> messages;
    private final String name;

    public KodillaUser(String name){
        listTasks = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }

    public void addPostKodilla(String send){
        messages.add(send);
        showNotify();
    }

    @Override
    public void studentHasMentor(Mentor mentor) {listTasks.add(mentor); }

    @Override
    public void hasAcceptedTaskBy(Mentor mentor){
        listTasks.add(mentor);
        System.out.println( mentor.getUserName() + " has accepted "+ getName() + "'s"  + " task");
    }

    @Override
    public void showNotify(){
        for(KodillaObserver kodillaTasks: listTasks){
            kodillaTasks.updateKodilla(this); }
    }

    @Override
    public void hasUnacceptedTaskBy(Mentor mentor){
        listTasks.remove(mentor);
        System.out.println( mentor.getUserName() + " has unaccepted "+ getName() + "'s"  + " task");
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
