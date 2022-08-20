package com.example.demo;
import java.time.LocalDate;

public class Task {

    private String description;
    private Boolean done;
    private LocalDate dueDate;

    public Task(String description, Boolean done, LocalDate dueDate) {
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return this.description;//Referenciador para el metodo RemoveTask
    }

    public Boolean getDone() {
        return done;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

}
