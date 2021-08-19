package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASK LISTS")
public final class TaskList {

    private int id;
    private String listName;
    private String description;

    public TaskList(){

    }

    public TaskList(String listName, String description){
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "LIST NAME", unique = true)
    public String getListName() {
        return listName;
    }

    @Column(name = "Description", unique = true)
    public String getDescription() {
        return description;
    }

    private void setId(int id){
        this.id = id;
    }

    private void setListName(String listName){
        this.listName = listName;
    }

    private void setDescription(String description){
        this.description = description;
    }
}