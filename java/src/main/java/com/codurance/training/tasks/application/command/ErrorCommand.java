package com.codurance.training.tasks.application.command;

import com.codurance.training.tasks.application.TaskListOutputBoundary;
import com.codurance.training.tasks.application.TaskListRepository;

public class ErrorCommand implements Command {
    String errorCommand;

    public ErrorCommand(String errorCommand) {
        this.errorCommand = errorCommand;
    }

    @Override
    public void execute(TaskListRepository taskListRepository, TaskListOutputBoundary taskListOutputBoundary) {
        taskListOutputBoundary.presentUnknownCommand(errorCommand);
    }
}
