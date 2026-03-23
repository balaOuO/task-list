package com.codurance.training.tasks.domain;

public class TaskNotFoundException extends RuntimeException {
    long taskId;

    public TaskNotFoundException(long taskId) {
        this.taskId = taskId;
    }

    public long getTaskId() {
        return taskId;
    }
}
