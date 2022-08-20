//https://www.arquitecturajava.com/java-stream-filter-y-predicates/
//https://www.arquitecturajava.com/java-8-lambda-expressions/
//https://www.youtube.com/watch?v=E3BU2fvolfY&feature=emb_logo

package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList1 {
    private String name;
    private List<Task> taskList;

    public TaskList1(String name){//constructor solo para name
        this.name = name;
        this.taskList = new ArrayList<Task>(); //inicializar la variable tasklist
    }

    public void addTaskList(Task task){
        this.taskList.add(task);
    }

    public List<Task> getTaskList() {
        return this.taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printTasks(){
        this.taskList.forEach(task -> {
            System.out.println("Descripcion de la tarea:");
            System.out.println(task.getDescription());
            System.out.println("Fecha de la tarea");
            System.out.println(task.getDueDate());
            System.out.println("Estado de la tarea");
            System.out.println(task.getDone());
            System.out.println("                       ");
        });

    }

     public void removeTask(String description){
        this.taskList = taskList.stream().filter(t->{ //función lambda
            return !t.getDescription().equals(description);
                }).collect(Collectors.toList());
    }

}
