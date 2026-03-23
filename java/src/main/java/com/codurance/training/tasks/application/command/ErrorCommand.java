package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.domain.TaskList;

public class ErrorCommand implements Command {
    String errorCommand;

    public ErrorCommand(String errorCommand) {
        this.errorCommand = errorCommand;
    }

    @Override
    public void execute(TaskList taskList, TaskListOutputBoundary taskListOutputBoundary) {
        taskListOutputBoundary.presentUnknownCommand(errorCommand);
    }
}
