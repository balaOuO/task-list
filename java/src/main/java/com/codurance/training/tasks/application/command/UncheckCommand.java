package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.domain.TaskList;
import com.codurance.training.tasks.domain.exception.TaskNotFoundException;

public class UncheckCommand implements Command {
    long taskId;

    public UncheckCommand(long taskId) {
        this.taskId = taskId;
    }

    @Override
    public void execute(TaskList taskList, TaskListOutputBoundary taskListOutputBoundary) {
        try {
            taskList.unCheck(taskId);
        } catch (TaskNotFoundException e) {
            taskListOutputBoundary.presentTaskNotFound(e.getTaskId());
        }
    }
}
