package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.domain.TaskList;
import com.codurance.training.tasks.domain.exception.TaskNotFoundException;

public class CheckCommand implements Command {
    long taskId;

    public CheckCommand(long taskId) {
        this.taskId = taskId;
    }

    @Override
    public void execute(TaskList taskList, TaskListOutputBoundary taskListOutputBoundary) {
        try {
            taskList.check(taskId);
        } catch (TaskNotFoundException e) {
            taskListOutputBoundary.presentTaskNotFound(e.getTaskId());
        }
    }
}
