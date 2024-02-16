package com.todo.spring.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Todo {

    int id;
    String username;
    String taskDescription;
    LocalDate targetDate;
    boolean done;

    public Todo(int id, String username, String taskDescription, LocalDate targetDate, boolean done) {
        this.id = id;
        this.username = username;
        this.taskDescription = taskDescription;
        this.targetDate = targetDate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return id == todo.id && done == todo.done && Objects.equals(username, todo.username) && Objects.equals(taskDescription, todo.taskDescription) && Objects.equals(targetDate, todo.targetDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, taskDescription, targetDate, done);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }
}