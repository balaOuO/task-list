package com.codurance.training.tasks.domain.exception;

public class TaskNotFoundException extends Exception {
    long taskId;

    public TaskNotFoundException(long taskId) {
        this.taskId = taskId;
    }

    public long getTaskId() {
        return taskId;
    }
}
