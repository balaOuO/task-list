package com.codurance.training.tasks;

public class TaskDto {
    private final long id;
    private final String description;
    private boolean done;

    public TaskDto(long id, String description, boolean done) {
        this.id = id;
        this.description = description;
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }
}
