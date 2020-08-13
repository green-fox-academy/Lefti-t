package com.company.printable;

public class ToDo implements Printable {

    String Task;
    String Priority;
    boolean Done;

    public ToDo(String task, String priority, boolean done) {
        Task = task;
        Priority = priority;
        Done = done;
    }

    public String getTask() {
        return Task;
    }

    public String getPriority() {
        return Priority;
    }

    public boolean isDone() {
        return Done;
    }

    @Override
    public void printAllFields() {
        System.out.println("Task: " + this.getTask() + " | Priority: " + this.getPriority() + " | Done: " + this.isDone());
    }
}
